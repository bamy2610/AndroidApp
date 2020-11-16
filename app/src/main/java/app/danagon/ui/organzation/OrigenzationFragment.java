package app.danagon.ui.organzation;

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

public class OrigenzationFragment extends Fragment {
    Spinner spngonnguTc;
    Spinner spquocgiaTc;
    Spinner spkhuvucTc;


    private OrigenzationViewModel mViewModel;

    public static OrigenzationFragment newInstance() {
        return new OrigenzationFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v=  inflater.inflate(R.layout.origenzation_fragment, container, false);
        // khai bao
        spngonnguTc = v.findViewById(R.id.spngonngutc);
        spkhuvucTc = v.findViewById(R.id.spkhuvucTc);
        spquocgiaTc = v.findViewById(R.id.spquocgiaTc);
        // ngon ngu
        ArrayList<String> arrayngonnguTc = new ArrayList<String>();
        arrayngonnguTc.add("Vet_nam");
        arrayngonnguTc.add("Enghlish");
        arrayngonnguTc.add("ThaiLan");

        ArrayAdapter arrayAdapterNNTC = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrayngonnguTc);
        arrayAdapterNNTC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spngonnguTc.setAdapter(arrayAdapterNNTC);

        // quoc gia
        ArrayList<String> arrayquocgiaTC = new ArrayList<String>();
        arrayquocgiaTC.add("Vet_nam");
        arrayquocgiaTC.add("Lao");
        arrayquocgiaTC.add("ThaiLan");

        ArrayAdapter arrayAdapterQGTC = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrayquocgiaTC);
        arrayAdapterQGTC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spquocgiaTc.setAdapter(arrayAdapterQGTC);

        // khu vuc
        ArrayList<String> arraykhuvucTc = new ArrayList<String>();
        arraykhuvucTc.add("Vet_nam");
        arraykhuvucTc.add("Lao");
        arraykhuvucTc.add("ThaiLan");

        ArrayAdapter arrayAdapterKVTC = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arraykhuvucTc);
        arrayAdapterKVTC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spkhuvucTc.setAdapter(arrayAdapterKVTC);


        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OrigenzationViewModel.class);
        // TODO: Use the ViewModel
    }

}