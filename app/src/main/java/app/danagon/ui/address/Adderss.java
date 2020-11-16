package app.danagon.ui.address;

import androidx.lifecycle.ViewModelProvider;

import android.accessibilityservice.GestureDescription;
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

public class Adderss extends Fragment {

    Spinner spngongu;
    Spinner spquocgia;
    Spinner spKhuvuc;


    private AdderssViewModel mViewModel;

    public static Adderss newInstance() {
        return new Adderss();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.adderss_fragment, container, false);

        spngongu = v.findViewById(R.id.spngonnguDd);
        spquocgia = v.findViewById(R.id.spquocgiaDd);
        spKhuvuc = v.findViewById(R.id.spkhuvucDd);
        //khu vuc
        ArrayList<String> arraykhuvucDd = new ArrayList<String>();
        arraykhuvucDd.add(" quang nam ");
        arraykhuvucDd.add("thanh khe");
        arraykhuvucDd.add("hai chau");
        arraykhuvucDd.add("ninh hoa");
        ArrayAdapter arrayAdapterkvDd = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arraykhuvucDd);
        arrayAdapterkvDd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spKhuvuc.setAdapter(arrayAdapterkvDd);
        //kêt thưc phương thưc thêm -- return v; --
        //quocgia
        ArrayList<String> arrayquocgiaDd = new ArrayList<String>();
        arrayquocgiaDd.add("Vet_nam");
        arrayquocgiaDd.add("Lao");
        arrayquocgiaDd.add("ThaiLan");
        ArrayAdapter arrayAdapterqgDd = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrayquocgiaDd);
        arrayAdapterqgDd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spquocgia.setAdapter(arrayAdapterqgDd);
        //  ngon ngu
        ArrayList<String> arrayNgonnguDd = new ArrayList<String>();

        arrayNgonnguDd.add("Vet_nam");
        arrayNgonnguDd.add("Lao");
        arrayNgonnguDd.add("ThaiLan");

        ArrayAdapter arrayAdapterngDd = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrayNgonnguDd);
        arrayAdapterngDd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spngongu.setAdapter(arrayAdapterngDd);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AdderssViewModel.class);
        // TODO: Use the ViewModel


    }

}