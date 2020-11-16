package app.danagon.ui.Canhan;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.danagon.R;

public class CanhanFragment extends Fragment {

    private CanhanViewModel mViewModel;

    public static CanhanFragment newInstance() {
        return new CanhanFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(CanhanViewModel.class);
        View root = inflater.inflate(R.layout.canhan_fragment, container, false);
        return root;
    }

}