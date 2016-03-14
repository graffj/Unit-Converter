package com.graff.android.unitconverter;

import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Jonathan on 3/4/2016.
 */
public class LengthConverter {

    public static final ArrayList<String> lengthUnits = new ArrayList<String>();

    static {
        lengthUnits.add("Inches");
        lengthUnits.add("Feet");
        lengthUnits.add("Yards");
        lengthUnits.add("Miles");
        lengthUnits.add("Millimeters");
        lengthUnits.add("Centimeters");
        lengthUnits.add("Meters");
        lengthUnits.add("Kilometers");
    }


    public static float convertInchesToInches(float inInches) {
        return inInches;
    }

    public static float convertInchesToFeet(float inInches) {
        return (inInches/12);
    }

    public static float convertInchesToYards(float inInches) {
        return (inInches/36);
    }

    public static float convertInchesToMiles(float inInches) {
        return ((inInches/5280)/12);
    }

    public static float convertInchesToMillimeters(float inInches) {
        return (inInches * 25.4f);
    }

    public static float convertInchesToCentimeters(float inInches) {
        return (inInches * 2.54f);
    }

    public static float convertInchesToMeters(float inInches) {
        return (inInches * 0.0254f);
    }

    public static float convertInchesToKilometers(float inInches) {
        return convertInchesToMeters((inInches)/1000);
    }




    public static float convertFeetToInches(float inFeet) {
        return (inFeet * 12);
    }

    public static float convertFeetToFeet(float inFeet) {
        return inFeet;
    }

    public static float convertFeetToYards(float inFeet) {
        return (inFeet/3);
    }

    public static float convertFeetToMiles(float inFeet) {
        return (inFeet/5280);
    }

    public static float convertFeetToMillimeters (float inFeet) {
        return (convertFeetToMeters(inFeet) * 1000);
    }

    public static float convertFeetToCentimeters (float inFeet) {
        return (convertFeetToMeters(inFeet) * 100);
    }

    public static float convertFeetToMeters(float inFeet) {
        return convertInchesToMeters(inFeet*12);
    }

    public static float convertFeetToKilometers (float inFeet) {
        return (convertFeetToMeters(inFeet)/1000);
    }





    public static float convertYardsToInches(float inYards) {
        return (inYards * 36);
    }

    public static float convertYardsToFeet(float inYards) {
        return (inYards * 3);
    }

    public static float convertYardsToYards(float inYards) {
        return inYards;
    }

    public static float convertYardsToMiles(float inYards) {
        return ((inYards*3)/5280);
    }

    public static float convertYardsToMillimeters(float inYards) {
        return (convertYardsToMeters(inYards) * 1000);
    }

    public static float convertYardsToCentimeters(float inYards) {
        return (convertYardsToMeters(inYards) * 100);
    }

    public static float convertYardsToMeters(float inYards) {
        return convertFeetToMeters((inYards*3));
    }

    public static float convertYardsToKilometers(float inYards) {
        return (convertYardsToMeters(inYards) / 1000);
    }




    public static float convertMilesToInches(float inMiles) {
        return (inMiles * 5280 * 12);
    }

    public static float convertMilesToFeet(float inMiles) {
        return (inMiles * 5280);
    }

    public static float convertMilesToYards(float inMiles) {
        return ((inMiles*5280)/3);
    }

    public static float convertMilesToMiles(float inMiles) {
        return inMiles;
    }

    public static float convertMilesToMillimeters(float inMiles) {
        return convertFeetToMeters(convertMilesToFeet(inMiles)) * 1000;
    }

    public static float convertMilesToCentimeters(float inMiles) {
        return convertFeetToCentimeters(convertMilesToFeet(inMiles)) * 100;
    }

    public static float convertMilesToMeters(float inMiles) {
        return convertFeetToMeters(convertMilesToFeet(inMiles));
    }

    public static float convertMilesToKilometers(float inMiles) {
        return convertFeetToKilometers(convertMilesToFeet(inMiles));
    }





    public static float convertMillimetersToMillimeters(float inMillimeters) {
        return inMillimeters;
    }

    public static float convertMillimetersToInches(float inMillimeters) {
        return convertMetersToInches(inMillimeters / 1000);
    }

    public static float convertMillimetersToFeet(float inMillimeters) {
        return convertMetersToFeet(inMillimeters / 1000);
    }

    public static float convertMillimetersToYards(float inMillimeters) {
        return convertMetersToYards(inMillimeters / 1000);
    }

    public static float convertMillimetersToMiles(float inMillimeters) {
        return convertMetersToMiles(inMillimeters / 1000);
    }

    public static float convertMillimetersToCentimeters(float inMillimeters) {
        return inMillimeters/10;
    }

    public static float convertMillimetersToMeters(float inMillimeters) {
        return inMillimeters/1000;
    }

    public static float convertMillimetersToKilometers(float inMillimeters) {
        return inMillimeters/1000000;
    }



    public static float convertCentimetersToInches(float inCentimeters) {
        return convertMetersToInches(inCentimeters / 100);
    }

    public static float convertCentimetersToFeet(float inCentimeters) {
        return convertMetersToFeet(inCentimeters / 100);
    }

    public static float convertCentimetersToYards(float inCentimeters) {
        return convertMetersToYards(inCentimeters / 100);
    }

    public static float convertCentimetersToMiles(float inCentimeters) {
        return convertMetersToMiles(inCentimeters / 100);
    }

    public static float convertCentimetersToMillimeters(float inCentimeters) {
        return inCentimeters * 10;
    }

    public static float convertCentimetersToCentimeters(float inCentimeters) {
        return inCentimeters;
    }

    public static float convertCentimetersToMeters(float inCentimeters) {
        return inCentimeters/100;
    }

    public static float convertCentimetersToKilometers(float inCentimeters) {
        return inCentimeters/100000;
    }



    public static float convertMetersToInches(float inMeters) {
        return inMeters * 39.3701f;
    }

    public static float convertMetersToFeet(float inMeters) {
        return inMeters * 3.28084f;
    }

    public static float convertMetersToYards(float inMeters) {
        return inMeters * 1.09361f;
    }

    public static float convertMetersToMiles(float inMeters) {
        return inMeters * 0.000621371f;
    }

    public static float convertMetersToMillimeters(float inMeters) {
        return inMeters * 1000;
    }

    public static float convertMetersToCentimeters(float inMeters) {
        return inMeters * 100;
    }

    public static float convertMetersToMeters(float inMeters) {
        return inMeters;
    }

    public static float convertMetersToKilometers(float inMeters) {
        return inMeters / 1000;
    }


    public static float convertKilometersToInches(float inKilometers) {
        return convertMetersToInches(inKilometers * 1000);
    }

    public static float convertKilometersToFeet(float inKilometers) {
        return convertMetersToFeet(inKilometers * 1000);
    }

    public static float convertKilometersToYards(float inKilometers) {
        return convertMetersToYards(inKilometers * 1000);
    }

    public static float convertKilometersToMiles(float inKilometers) {
        return convertMetersToMiles(inKilometers * 1000);
    }

    public static float convertKilometersToMillimeters(float inKilometers) {
        return inKilometers * 1000000;
    }

    public static float convertKilometersToCentimeters(float inKilometers) {
        return inKilometers * 100000;
    }

    public static float convertKilometersToMeters(float inKilometers) {
        return inKilometers * 1000;
    }

    public static float convertKilometersToKilometers(float inKilometers) {
        return inKilometers;
    }




    public static float convertLengths(String toLengthUnits, String fromLengthUnits, float toConvert) {
        float retVal=0;
        String methodName = "";


        if (!lengthUnits.contains(toLengthUnits))
            Log.d("LengthConverter", "Invalid toLengthUnit: " + toLengthUnits);

        if (!lengthUnits.contains(fromLengthUnits))
            Log.d("LengthConverter", "Invalid fromLengthUnit: " + fromLengthUnits);

        try {
            /* Trying not to have to work through a silly number of method calls
             * by using reflection. Yay for formulaic method names!
             */
            methodName = "convert" + fromLengthUnits + "To" + toLengthUnits;
            Log.d("LengthConverter", "Method name: " + methodName);
            Method m = LengthConverter.class.getDeclaredMethod(methodName, Float.TYPE);
            Object o = m.invoke(null, toConvert);
            retVal = (float) o;
        }
        catch (NoSuchMethodException nsm) {
            Log.d("LengthConverter", "NoSuchMethodException - methodName: " + methodName);
        }
        catch (IllegalAccessException iae) {
            Log.d("LengthConverter", "IllegalAccessException: " + iae.getMessage());
        }
        catch (InvocationTargetException ite) {
            Log.d("LengthConverter", "InvocationTargetException: " + ite.getMessage());
        }

        return retVal;
    }
}


