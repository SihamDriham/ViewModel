package ma.ensa.hellotoastmvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;


import androidx.lifecycle.SavedStateHandle;


public class CounterViewModel extends ViewModel {

    private static final String COUNTER_KEY = "counter";
    private final SavedStateHandle savedStateHandle;

    public CounterViewModel(SavedStateHandle savedStateHandle) {
        this.savedStateHandle = savedStateHandle;
        if (!savedStateHandle.contains(COUNTER_KEY)) {
            savedStateHandle.set(COUNTER_KEY, 0);
        }
    }

    public LiveData<Integer> getCounter() {
        return savedStateHandle.getLiveData(COUNTER_KEY);
    }

    public void incrementCounter() {
        Integer currentCounter = savedStateHandle.get(COUNTER_KEY);
        if (currentCounter != null) {
            savedStateHandle.set(COUNTER_KEY, currentCounter + 1);
        }
    }

    public void decrementCounter() {
        Integer currentCounter = savedStateHandle.get(COUNTER_KEY);
        if (currentCounter != null) {
            savedStateHandle.set(COUNTER_KEY, currentCounter - 1);
        }
    }

    public void resetCounter() {
        savedStateHandle.set(COUNTER_KEY, 0);
    }
}