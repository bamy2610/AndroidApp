package app.danagon.ui.lichsumuahang;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.danagon.R;

public class lichsumuahangFragment extends Fragment {

    private LichsumuahangViewModel mViewModel;

    public static lichsumuahangFragment newInstance() {
        return new lichsumuahangFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lichsumuahang_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(LichsumuahangViewModel.class);
        // TODO: Use the ViewModel
    }

}