package com.example.josycom.droidcafe;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

/**
 * A simple {@link DialogFragment} subclass
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    /*
     Sets the date that has been picked
     */
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    /*
    Gets the Main Activity and calls the processDatePickerResult() method
     */
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        OrderActivity activity = (OrderActivity) getActivity();
        assert activity != null;
        activity.processDatePickerResult(year, month, dayOfMonth);
    }
}
