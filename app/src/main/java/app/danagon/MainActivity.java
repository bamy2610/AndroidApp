package app.danagon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

import app.danagon.ui.home.HomeFragment;
import app.danagon.ui.home.HomeViewModel;


public class MainActivity extends AppCompatActivity {
    Timer timer;



    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*tạo dối tượng timer */
        timer = new Timer();

        /* gọi hàm schedule của đối tượng timer*/
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }


    public void onClick_btnCancel(View view) {
        this.finishAffinity();
        System.exit(0);
    }



}