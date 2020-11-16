package app.danagon.ui.Canhan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CanhanViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CanhanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ca nhan fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}