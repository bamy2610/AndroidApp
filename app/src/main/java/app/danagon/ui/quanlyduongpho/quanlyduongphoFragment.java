package app.danagon.ui.quanlyduongpho;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.danagon.R;

public class quanlyduongphoFragment extends Fragment {

    private QuanlyduongphoViewModel mViewModel;

    public static quanlyduongphoFragment newInstance() {
        return new quanlyduongphoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.quanlyduongpho_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(QuanlyduongphoViewModel.class);
        // TODO: Use the ViewModel
    }

}