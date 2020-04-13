package com.example.calender;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TabHost;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
public  static final String TAG ="MainActiviy";
 TextView theDate  , time;
 Button btGOtoCalender ,btGOtoTimepicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_values();
        btGOtoCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             callDateBicker();
            }
        });
        btGOtoTimepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void init_values(){
       theDate=findViewById(R.id.tvDate);
       btGOtoCalender=findViewById(R.id.btCalender);
       time=findViewById(R.id.tvTime);
       btGOtoTimepicker=findViewById(R.id.btTimePicker);

    }
  private void callDateBicker() {
      DialogFragment datePicker = new DatePickerFragment();
      datePicker.show(getSupportFragmentManager(), " date Picker");

  }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR ,year);
        calendar.set(Calendar.MONTH ,month);
        calendar.set(Calendar.DAY_OF_YEAR ,dayOfMonth);
        String currentDate=
                DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        theDate.setText(currentDate);
    }
}
