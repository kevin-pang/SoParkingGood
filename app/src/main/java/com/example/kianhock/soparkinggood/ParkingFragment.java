package com.example.kianhock.soparkinggood;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class ParkingFragment extends Fragment {
    TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
        View view = inflater.inflate(R.layout.activity_parking, container, false);
        //String menu = getArguments().getString("Menu");
        //text = (TextView) view.findViewById(R.id.textView);
        //text.setText(menu);

        String[] startTime = {"Start Time",
                "1 minute", "2 minutes", "Moderate", "Hard", "Hardest"};
        String[] endTime = {"Optional, Default: 0 (minutes)", "1 minute",
                "2 minutes", "3 minutes", "4 minutes", "5 minutes"};

        return view;
    }
}