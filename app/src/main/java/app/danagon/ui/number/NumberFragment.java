package app.danagon.ui.number;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

import app.danagon.R;

public class NumberFragment extends Fragment {

    private NumberViewModel mViewModel;
    //Khai báo Spinner
    Spinner spnguonnguNv;
    Spinner spquocgiaNv;
    Spinner spkhuvucNv;
    Spinner spduongNv;
    Spinner spdiemdiaNv;
    public static NumberFragment newInstance() {
        return new NumberFragment();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.number_fragment, container, false);

        // khai bao
        spnguonnguNv = v.findViewById(R.id.spngonguNv);
        spquocgiaNv = v.findViewById(R.id.spquocgiaNv);
        spkhuvucNv = v.findViewById(R.id.spkhuvucNv);
        spduongNv = v.findViewById(R.id.spduongNv);
        spdiemdiaNv = v.findViewById(R.id.spdiadiemNv);
        // ngon ngu
        ArrayList<String> arrayngonnguNv = new ArrayList<String>();
        arrayngonnguNv.add(" English ");
        arrayngonnguNv.add("Viet");
        ArrayAdapter arrayAdapterNNNV = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrayngonnguNv);
        arrayAdapterNNNV.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnguonnguNv.setAdapter(arrayAdapterNNNV);
        // thêm retunt v
        //các spinner làm tương tự

    //quocgia
        ArrayList<String> arrayquocgiaNV = new ArrayList<String>();
        arrayquocgiaNV.add(" Viet Nam ");
        arrayquocgiaNV.add("Lao");
        arrayquocgiaNV.add("Anh ");
        arrayquocgiaNV.add("My");

        ArrayAdapter arrayAdapterQgnv = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrayquocgiaNV);
        arrayAdapterQgnv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spquocgiaNv.setAdapter(arrayAdapterQgnv);
        //khu vuc

        ArrayList<String> arraykhuvucNv = new ArrayList<String>();
        arraykhuvucNv.add(" quang nam ");
        arraykhuvucNv.add("thanh khe");
        arraykhuvucNv.add("hai chau");
        arraykhuvucNv.add("ninh hoa");

        ArrayAdapter arrayAdapterkvNv = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arraykhuvucNv);
        arrayAdapterkvNv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spkhuvucNv.setAdapter(arrayAdapterkvNv);

        //duong
        ArrayList<String> arrayduongNv = new ArrayList<String>();
        arrayduongNv.add("Ly thai to  ");
        arrayduongNv.add("Bach dang");
        arrayduongNv.add("Le Do");
        arrayduongNv.add("Thanh hoa");

        ArrayAdapter arrayAdapterDNv = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrayduongNv);
        arrayAdapterDNv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spduongNv.setAdapter(arrayAdapterDNv);
        //diadiem
        ArrayList<String> arraydiadiemNv = new ArrayList<String>();
        arraydiadiemNv.add("thanh khe");
        arraydiadiemNv.add(" quang nam ");
        arraydiadiemNv.add("hai chau");
        arraydiadiemNv.add("ninh hoa");

        ArrayAdapter arrayAdapterDdNv = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arraydiadiemNv);
        arrayAdapterDdNv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spdiemdiaNv.setAdapter(arrayAdapterDdNv);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(NumberViewModel.class);
        // TODO: Use the ViewModel
    }

}