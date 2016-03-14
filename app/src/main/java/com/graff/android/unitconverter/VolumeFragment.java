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
public class VolumeFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    View view;
    Spinner fromVolumeSpinner, toVolumeSpinner;
    public VolumeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_volume, container, false);


        fromVolumeSpinner = (Spinner) view.findViewById(R.id.from_volume_spinner);
        fromVolumeSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> fromAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.volume_units_array, android.R.layout.simple_spinner_item);

        fromAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromVolumeSpinner.setAdapter(fromAdapter);


        toVolumeSpinner = (Spinner) view.findViewById(R.id.to_volume_spinner);
        toVolumeSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> toAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.volume_units_array, android.R.layout.simple_spinner_item);

        toAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toVolumeSpinner.setAdapter(toAdapter);

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        // On selecting a spinner item
        String fromVolume = "null";
        String toVolume = "null";
        String item = parent.getItemAtPosition(position).toString();
        EditText fromVolumeDisplay;
        TextView displayToVolume;


        fromVolumeSpinner = (Spinner) view.findViewById(R.id.from_volume_spinner);
        toVolumeSpinner = (Spinner) view.findViewById(R.id.to_volume_spinner);

        if (fromVolumeSpinner != null)
            fromVolume = fromVolumeSpinner.getSelectedItem().toString();

        if (toVolumeSpinner != null)
            toVolume = toVolumeSpinner.getSelectedItem().toString();

        Log.d("VolumeFragment", "Selected: " + item + " From Mass: " + fromVolume + " To Mass: " + toVolume);

        /* Perform conversion */
        fromVolumeDisplay = (EditText) view.findViewById(R.id.editFromVolume);
        displayToVolume = (TextView) view.findViewById(R.id.displayToVolume);

        try {
            float inputVolume = Float.parseFloat(fromVolumeDisplay.getText().toString());

            displayToVolume.setText(String.valueOf(VolumeConverter.convertVolume(toVolume.replaceAll(" ", ""),
                    fromVolume.replaceAll(" ", ""),
                    inputVolume)));
        }
        catch (Exception e) {
            Log.d("VolumeFragment", "Conversion exception: " + e.getMessage());
        }

    }


    public void onNothingSelected(AdapterView<?> arg0) {
        Log.d("VolumeFragment", "onNothingSelected has been called");
    }

}
