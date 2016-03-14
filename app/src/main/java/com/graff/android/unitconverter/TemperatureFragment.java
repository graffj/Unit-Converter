package com.graff.android.unitconverter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TemperatureFragment extends Fragment implements View.OnClickListener {

    RadioButton fromButton0, fromButton1, fromButton2;
    RadioButton toButton0, toButton1, toButton2;
    EditText inputText;
    View view;

    public TemperatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_temperature, container, false);

        inputText = (EditText) view.findViewById(R.id.editFromTemp);

        fromButton0 = (RadioButton) view.findViewById(R.id.fromTempRadio0);
        fromButton0.setOnClickListener(this);

        fromButton1 = (RadioButton) view.findViewById(R.id.fromTempRadio1);
        fromButton1.setOnClickListener(this);

        fromButton2 = (RadioButton) view.findViewById(R.id.fromTempRadio2);
        fromButton2.setOnClickListener(this);

        toButton0 = (RadioButton) view.findViewById(R.id.toTempRadio0);
        toButton0.setOnClickListener(this);

        toButton1 = (RadioButton) view.findViewById(R.id.toTempRadio1);
        toButton1.setOnClickListener(this);

        toButton2 = (RadioButton) view.findViewById(R.id.toTempRadio2);
        toButton2.setOnClickListener(this);

        return view;
    }


    int getTempScaleForRadioGroup(RadioButton button0, RadioButton button1, RadioButton button2) {

        if (button0.isChecked())
            return TempConverter.CELSIUS;
        else if (button1.isChecked())
            return TempConverter.FAHRENHEIT;
        else if (button2.isChecked())
            return TempConverter.KELVIN;
        else
            throw new IllegalArgumentException("TemperatureFragment.getTempValueForRadioGroup - no button checked");

    }

    @Override
    public void onClick(View v) {

        /* Input and output temperature values */
        TextView displayTemp = (TextView) view.findViewById(R.id.displayToTemp);
        float inputTemp = Float.parseFloat(inputText.getText().toString());
        int fromTemp, toTemp;

        /* Radio buttons to determine conversion needed */
        fromButton0 = (RadioButton) view.findViewById(R.id.fromTempRadio0);
        fromButton1 = (RadioButton) view.findViewById(R.id.fromTempRadio1);
        fromButton2 = (RadioButton) view.findViewById(R.id.fromTempRadio2);
        toButton0 = (RadioButton) view.findViewById(R.id.toTempRadio0);
        toButton1 = (RadioButton) view.findViewById(R.id.toTempRadio1);
        toButton2 = (RadioButton) view.findViewById(R.id.toTempRadio2);

        /* JON: It would be good to enforce temperature minimums (absolute 0) somewhere in here */

        fromTemp = getTempScaleForRadioGroup(fromButton0, fromButton1, fromButton2);
        toTemp = getTempScaleForRadioGroup(toButton0, toButton1, toButton2);

        //Log.d("TemperatureFragment", "Converting and displaying temperature");
        displayTemp.setText(String.valueOf(TempConverter.convertTemps(inputTemp, fromTemp, toTemp)));

    }

}
