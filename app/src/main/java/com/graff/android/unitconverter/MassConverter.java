package com.graff.android.unitconverter;

import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Jonathan on 3/9/2016.
 */
public class MassConverter {

    public static final ArrayList<String> massUnits = new ArrayList<String>();

    static {
        massUnits.add("Ounces");
        massUnits.add("Pounds");
        massUnits.add("Tons");
        massUnits.add("Milligrams");
        massUnits.add("Grams");
        massUnits.add("Kilograms");
        massUnits.add("Metric Tons");
    }


    public static float convertOuncesToOunces(float inOunces) {
        return inOunces;
    }

    public static float convertOuncesToPounds(float inOunces) {
        return inOunces/16;
    }

    public static float convertOuncesToTons(float inOunces) {
        return inOunces/(16*2000); //16 ounces per pound, 2000 pounds per ton
    }

    public static float convertOuncesToMilligrams(float inOunces) {
        return inOunces * 28349.5f;
    }

    public static float convertOuncesToGrams(float inOunces) {
        return inOunces * 28.3495f;
    }

    public static float convertOuncesToKilograms(float inOunces) {
        return inOunces * 0.0283495f;
    }

    public static float convertOuncesToMetricTons(float inOunces) {
        return inOunces * 2.835e-5f;
    }



    public static float convertPoundsToOunces(float inPounds) {
        return inPounds * 16;
    }

    public static float convertPoundsToPounds(float inPounds) {
        return inPounds;
    }

    public static float convertPoundsToTons(float inPounds) {
        return inPounds/2000;
    }

    public static float convertPoundsToMilligrams(float inPounds) {
        return inPounds * 453592;
    }

    public static float convertPoundsToGrams(float inPounds) {
        return inPounds * 453.592f;
    }

    public static float convertPoundsToKilograms(float inPounds) {
        return inPounds * 0.453592f;
    }

    public static float convertPoundsToMetricTons(float inPounds) {
        return inPounds * 0.000453592f;
    }




    public static float convertTonsToOunces(float inTons) {
        return inTons * 2000 * 16;
    }

    public static float convertTonsToPounds(float inTons) {
        return inTons * 2000;
    }

    public static float convertTonsToTons(float inTons) {
        return inTons;
    }

    public static float convertTonsToMilligrams(float inTons) {
        return inTons * 907.185f * 1000000;
    }

    public static float convertTonsToGrams(float inTons) {
        return inTons * 907.185f * 1000;
    }

    public static float convertTonsToKilograms(float inTons) {
        return inTons * 907.185f;
    }

    public static float convertTonsToMetricTons(float inTons) {
        return inTons * 0.907185f;
    }



    public static float convertMilligramsToOunces(float inMilligrams) {
        return inMilligrams * 3.5274e-5f;
    }

    public static float convertMilligramsToPounds(float inMilligrams) {
        return inMilligrams * 2.2046e-6f;
    }

    public static float convertMilligramsToTons(float inMilligrams) {
        return inMilligrams * 1.1023e-9f;
    }

    public static float convertMilligramsToMilligrams(float inMilligrams) {
        return inMilligrams;
    }

    public static float convertMilligramsToGrams(float inMilligrams) {
        return inMilligrams/1000;
    }

    public static float convertMilligramsToKilograms(float inMilligrams) {
        return inMilligrams/1000000;
    }

    public static float convertMilligramsToMetricTons(float inMilligrams) {
        return inMilligrams/1000000000;
    }



    public static float convertGramsToOunces(float inGrams) {
        return inGrams * 0.035274f;
    }

    public static float convertGramsToPounds(float inGrams) {
        return inGrams * 0.00220462f;
    }

    public static float convertGramsToTons(float inGrams) {
        return inGrams * 1.1023e-6f;
    }

    public static float convertGramsToMilligrams(float inGrams) {
        return inGrams * 1000;
    }

    public static float convertGramsToGrams(float inGrams) {
        return inGrams;
    }

    public static float convertGramsToKilograms(float inGrams) {
        return inGrams/1000;
    }

    public static float convertGramsToMetricTons(float inGrams) {
        return inGrams/1000000;
    }



    public static float convertKilogramsToOunces(float inKilograms) {
        return inKilograms * 35.274f;
    }

    public static float convertKilogramsToPounds(float inKilograms) {
        return inKilograms * 2.20462f;
    }

    public static float convertKilogramsToTons(float inKilograms) {
        return inKilograms * 0.00110231f;
    }

    public static float convertKilogramsToMilligrams(float inKilograms) {
        return inKilograms * 1000000;
    }

    public static float convertKilogramsToGrams(float inKilograms) {
        return inKilograms * 1000;
    }

    public static float convertKilogramsToKilograms(float inKilograms) {
        return inKilograms;
    }

    public static float convertKilogramsToMetricTons(float inKilograms) {
        return inKilograms/1000;
    }



    public static float convertMetricTonsToOunces(float inMetricTons) {
        return inMetricTons * 35274;
    }

    public static float convertMetricTonsToPounds(float inMetricTons) {
        return inMetricTons * 2204.62f;
    }

    public static float convertMetricTonsToTons(float inMetricTons) {
        return inMetricTons * 1.10231f;
    }

    public static float convertMetricTonsToMilligrams(float inMetricTons) {
        return inMetricTons * 1000000000;
    }

    public static float convertMetricTonsToGrams(float inMetricTons) {
        return inMetricTons * 1000000;
    }

    public static float convertMetricTonsToKilograms(float inMetricTons) {
        return inMetricTons * 1000;
    }

    public static float convertMetricTonsToMetricTons(float inMetricTons) {
        return inMetricTons;
    }





    public static float convertMass(String toMassUnits, String fromMassUnits, float toConvert) {
        float retVal = 0;
        String methodName = "";

        if (!massUnits.contains(toMassUnits))
            Log.d("MassConverter", "Invalid toMassUnit: " + toMassUnits);

        if (!massUnits.contains(fromMassUnits))
            Log.d("MassConverter", "Invalid fromMassUnit: " + fromMassUnits);

        try {
            /* Trying not to have to work through a silly number of method calls
             * by using reflection. Yay for formulaic method names!
             */
            methodName = "convert" + fromMassUnits + "To" + toMassUnits;
            Log.d("MassConverter", "Method name: " + methodName);
            Method m = MassConverter.class.getDeclaredMethod(methodName, Float.TYPE);
            Object o = m.invoke(null, toConvert);
            retVal = (float) o;
        }
        catch (NoSuchMethodException nsm) {
            Log.d("MassConverter", "NoSuchMethodException - methodName: " + methodName);
        }
        catch (IllegalAccessException iae) {
            Log.d("MassConverter", "IllegalAccessException: " + iae.getMessage());
        }
        catch (InvocationTargetException ite) {
            Log.d("MassConverter", "InvocationTargetException: " + ite.getMessage());
        }

        return retVal;
    }

}
