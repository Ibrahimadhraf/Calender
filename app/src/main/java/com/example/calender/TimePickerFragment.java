package com.example.calender;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;


import java.util.Calendar;

public class TimePickerFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar calendar=Calendar.getInstance();
        int hours= calendar.get(Calendar.HOUR);
        int minute= calendar.get(Calendar.MINUTE);

         return new TimePickerDialog(getActivity() ,(TimePickerDialog.OnTimeSetListener) getActivity(),hours,minute ,
                 false);
    }
}
