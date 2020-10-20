package app.danagon;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class RegisterActivity extends AppCompatActivity {
    public static final String TAG = "TAG";
    EditText  mFullname , mEmail,mphone, mpass;
    Button mregisterBtn;
    TextView mLoginBtn;
    FirebaseAuth fAuth;
    ProgressBar progressBar;
    FirebaseFirestore fStore;
    String userID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mFullname = findViewById(R.id.Fullname);
        mEmail = findViewById(R.id.Mail);
        mpass = findViewById(R.id.pass);
        mphone = findViewById(R.id.prfPhone);
        mregisterBtn = findViewById(R.id.register);
        mLoginBtn = findViewById(R.id.login);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        progressBar = findViewById(R.id.progressBar);

        if (fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
            finish();
        }

        mregisterBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String email = mEmail.getText().toString().trim();
                String pass = mpass.getText().toString().trim();
                final String Fullname = mFullname.getText().toString();
                final String phone = mphone.getText().toString();

                if (TextUtils.isEmpty(Fullname)){
                    mFullname.setError("Vui Lòng Nhập Họ Và Tên");
                }
                if (TextUtils.isEmpty(email)){
                    mEmail.setError("Email không được để trống !");
                    return;
                }
                if(phone.length() < 10){
                    mphone.setError("Số điện thoại phải nhỏ hơn 10 chữ số !");
                }
                if (TextUtils.isEmpty(pass)){
                    mpass.setError("Mật khẩu không được để trống");
                    return;
                }
                if (pass.length() < 6){
                    mpass.setError("Mật khẩu phải lớn hơn 6 ký tự");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                //register the user firebase

                fAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RegisterActivity.this, "User Created", Toast.LENGTH_SHORT).show();
                            userID = fAuth.getCurrentUser().getUid();
                            DocumentReference documentReference = fStore.collection("users").document(userID);
                            final Map<String,Object> user = new HashMap<>();
                            user.put("fName",Fullname);
                            user.put("mail",email);
                            user.put("fPhone",phone);
                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Log.d(TAG, "onSuccess: user prf is create for " + userID );
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.d(TAG, "onFailure: " + e.toString());
                                }
                            });
                            startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                        }else{
                            Toast.makeText(RegisterActivity.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });

    }


}
