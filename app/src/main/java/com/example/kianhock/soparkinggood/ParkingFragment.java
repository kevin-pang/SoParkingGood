package com.example.kianhock.soparkinggood;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class ParkingFragment extends Fragment {
    private TextView text;
    private Spinner start_time, end_time;
    static final int dialog_id = 0;
    int hour, minute;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
        View view = inflater.inflate(R.layout.activity_parking, container, false);
        //String menu = getArguments().getString("Menu");
        //text = (TextView) view.findViewById(R.id.textView);
        //text.setText(menu);

    <<<<<<< HEAD
        String[] starttime = {"Start Time"
                , "1 hour", "2 hours", "3 hours", "4 hours", "5 hours"
                , "6 hours", "7 hours", "8 hours", "9 hours", "10 hours"};
        String[] endtime = {"End Time"
                , "1 hour", "2 hours", "3 hours", "4 hours", "5 hours"
                , "6 hours", "7 hours", "8 hours", "9 hours", "10 hours"};

        start_time = (Spinner) view.findViewById(R.id.stSpinner);
        end_time = (Spinner) view.findViewById(R.id.etSpinner);

        ArrayAdapter<String> adapter_state1 = new ArrayAdapter<String>(container.getContext(),
                android.R.layout.simple_spinner_item, starttime);

        ArrayAdapter<String> adapter_state2 = new ArrayAdapter<String>(container.getContext(),
                android.R.layout.simple_spinner_item, endtime);

        start_time.setAdapter(adapter_state1);
        end_time.setAdapter(adapter_state2);
=======
        String[] startTime = {"Start Time",
                "1 minute", "2 minutes", "3 minutes", "Hard", "Hardest"};
        String[] endTime = {"Optional, Default: 0 (minutes)", "1 minute",
                "2 minutes", "3 minutes", "4 minutes", "5 minutes"};
>>>>>>> origin/master

        return view;
    }
}