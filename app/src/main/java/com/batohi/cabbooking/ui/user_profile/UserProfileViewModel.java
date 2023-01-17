package com.batohi.cabbooking.ui.user_profile;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.batohi.cabbooking.model.User;

public class UserProfileViewModel extends ViewModel {
    private MutableLiveData<User> currentUserObject;

    public UserProfileViewModel() {
        currentUserObject = new MutableLiveData<>();
    }

    public void setCurrentUserObject(User currentUserObject) {
        this.currentUserObject.setValue(currentUserObject);
    }

    public MutableLiveData<User> getCurrentUserObject(){
        return this.currentUserObject;
    }
}