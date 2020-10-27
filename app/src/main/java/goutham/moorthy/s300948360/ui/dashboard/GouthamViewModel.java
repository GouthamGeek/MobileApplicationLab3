package goutham.moorthy.s300948360.ui.dashboard;
//Goutham Moorthy, 300948360, 002
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GouthamViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GouthamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}