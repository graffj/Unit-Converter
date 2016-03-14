package com.graff.android.unitconverter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class LengthFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    View view;
    Spinner fromLengthSpinner, toLengthSpinner;

    public LengthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_length, container, false);


        fromLengthSpinner = (Spinner) view.findViewById(R.id.from_length_spinner);
        fromLengthSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> fromAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.length_units_array, android.R.layout.simple_spinner_item);

        fromAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromLengthSpinner.setAdapter(fromAdapter);


        toLengthSpinner = (Spinner) view.findViewById(R.id.to_length_spinner);
        toLengthSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> toAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.length_units_array, android.R.layout.simple_spinner_item);

        toAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toLengthSpinner.setAdapter(toAdapter);

        return view;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        // On selecting a spinner item
        String fromLength = "null";
        String toLength = "null";
        String item = parent.getItemAtPosition(position).toString();
        EditText fromLengthDisplay;
        TextView toLengthDisplay;

        //view.findViewById(R.id.from_length_spinner);

        fromLengthSpinner = (Spinner) view.findViewById(R.id.from_length_spinner);
        toLengthSpinner = (Spinner) view.findViewById(R.id.to_length_spinner);

        if (fromLengthSpinner != null)
          fromLength = fromLengthSpinner.getSelectedItem().toString();

        if (toLengthSpinner != null)
            toLength = toLengthSpinner.getSelectedItem().toString();

        Log.d("LengthFragment", "Selected: " + item + " From Length: " + fromLength + " To Length: " + toLength);

        /* Perform conversion */
        fromLengthDisplay = (EditText) view.findViewById(R.id.editFromLength);
        toLengthDisplay = (TextView) view.findViewById(R.id.editToLength);

        try {
            float inputLength = Float.parseFloat(fromLengthDisplay.getText().toString());

            toLengthDisplay.setText(String.valueOf(LengthConverter.convertLengths(toLength, fromLength, inputLength)));
        }
        catch (Exception e) {
            Log.d("LengthFragment", "Conversion exception: " + e.getMessage());
        }

    }


    public void onNothingSelected(AdapterView<?> arg0) {
        Log.d("LengthFragment", "onNothingSelected has been called");
    }

}
