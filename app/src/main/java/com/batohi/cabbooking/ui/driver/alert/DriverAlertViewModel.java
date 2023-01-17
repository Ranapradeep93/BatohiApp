package com.batohi.cabbooking.ui.driver.alert;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.batohi.cabbooking.model.Booking;

public class DriverAlertViewModel extends ViewModel {
    private MutableLiveData<Booking> booking;

    public DriverAlertViewModel() {
        booking = new MutableLiveData<>();
    }

    public void setBooking(Booking booking) {
        this.booking.setValue(booking);
    }

    public MutableLiveData<Booking> getBooking() {
        return booking;
    }
}
