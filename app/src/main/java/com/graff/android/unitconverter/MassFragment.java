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


/**
 * A simple {@link Fragment} subclass.
 */
public class MassFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    View view;
    Spinner fromMassSpinner, toMassSpinner;


    public MassFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_mass, container, false);


        fromMassSpinner = (Spinner) view.findViewById(R.id.from_mass_spinner);
        fromMassSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> fromAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.mass_units_array, android.R.layout.simple_spinner_item);

        fromAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromMassSpinner.setAdapter(fromAdapter);


        toMassSpinner = (Spinner) view.findViewById(R.id.to_mass_spinner);
        toMassSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> toAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.mass_units_array, android.R.layout.simple_spinner_item);

        toAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toMassSpinner.setAdapter(toAdapter);

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        // On selecting a spinner item
        String fromMass = "null";
        String toMass = "null";
        String item = parent.getItemAtPosition(position).toString();
        EditText fromMassDisplay;
        TextView displayToMass;

        //view.findViewById(R.id.from_length_spinner);

        fromMassSpinner = (Spinner) view.findViewById(R.id.from_mass_spinner);
        toMassSpinner = (Spinner) view.findViewById(R.id.to_mass_spinner);

        if (fromMassSpinner != null)
            fromMass = fromMassSpinner.getSelectedItem().toString();

        if (toMassSpinner != null)
            toMass = toMassSpinner.getSelectedItem().toString();

        Log.d("MassFragment", "Selected: " + item + " From Mass: " + fromMass + " To Mass: " + toMass);

        /* Perform conversion */
        fromMassDisplay = (EditText) view.findViewById(R.id.editFromMass);
        displayToMass = (TextView) view.findViewById(R.id.displayToMass);

        try {
            float inputMass = Float.parseFloat(fromMassDisplay.getText().toString());

            displayToMass.setText(String.valueOf(MassConverter.convertMass(toMass.replaceAll(" ", ""),
                                                                           fromMass.replaceAll(" ", ""),
                                                                           inputMass)));
        }
        catch (Exception e) {
            Log.d("MassFragment", "Conversion exception: " + e.getMessage());
        }

    }


    public void onNothingSelected(AdapterView<?> arg0) {
        Log.d("MassFragment", "onNothingSelected has been called");
    }

}
