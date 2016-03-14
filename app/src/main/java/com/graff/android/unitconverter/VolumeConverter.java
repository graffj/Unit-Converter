package com.graff.android.unitconverter;

import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Jonathan on 3/10/2016.
 */
public class VolumeConverter {


    public static final ArrayList<String> volumeUnits = new ArrayList<String>();

    static {
        volumeUnits.add("Teaspoons");
        volumeUnits.add("Tablespoons");
        volumeUnits.add("Cups");
        volumeUnits.add("Pints");
        volumeUnits.add("Quarts");
        volumeUnits.add("Gallons");
        volumeUnits.add("Fluid Ounces");
        volumeUnits.add("Milliliters");
        volumeUnits.add("Liters");
        volumeUnits.add("Cubic Inches");
        volumeUnits.add("Cubic Feet");
        volumeUnits.add("Cubic Meters");
    }



    public static float convertTeaspoonsToTeaspoons(float inTeaspoons) {
        return inTeaspoons;
    }

    public static float convertTeaspoonsToTablespoons(float inTeaspoons) {
        return inTeaspoons/3;
    }

    public static float convertTeaspoonsToCups(float inTeaspoons) {
        return inTeaspoons/48;
    }

    public static float convertTeaspoonsToPints(float inTeaspoons) {
        return inTeaspoons/96;
    }

    public static float convertTeaspoonsToQuarts(float inTeaspoons) {
        return inTeaspoons/192;
    }

    public static float convertTeaspoonsToGallons(float inTeaspoons) {
        return inTeaspoons/768;
    }

    public static float convertTeaspoonsToFluidOunces(float inTeaspoons) {
        return inTeaspoons * 0.200158f;
    }

    public static float convertTeaspoonsToMilliliters(float inTeaspoons) {
        return inTeaspoons * 5.91939f;
    }

    public static float convertTeaspoonsToLiters(float inTeaspoons) {
        return inTeaspoons * 0.00591939f;
    }

    public static float convertTeaspoonsToCubicInches(float inTeaspoons) {
        return inTeaspoons * 0.361223f;
    }

    public static float convertTeaspoonsToCubicFeet(float inTeaspoons) {
        return inTeaspoons * 0.000209041f;
    }

    public static float convertTeaspoonsToCubicMeters(float inTeaspoons) {
        return inTeaspoons * 5.9194e-6f;
    }



    public static float convertTablespoonsToTeaspoons(float inTablespoons) {
        return inTablespoons * 3;
    }

    public static float convertTablespoonsToTablespoons(float inTablespoons) {
        return inTablespoons;
    }

    public static float convertTablespoonsToCups(float inTablespoons) {
        return inTablespoons/16;
    }

    public static float convertTablespoonsToPints(float inTablespoons) {
        return inTablespoons / 32;
    }

    public static float convertTablespoonsToQuarts(float inTablespoons) {
        return inTablespoons / 64;
    }

    public static float convertTablespoonsToGallons(float inTablespoons) {
        return inTablespoons / 256;
    }

    public static float convertTablespoonsToFluidOunces(float inTablespoons) {
        return inTablespoons * 0.600475f;
    }

    public static float convertTablespoonsToMilliliters(float inTablespoons) {
        return inTablespoons * 17.7582f;
    }

    public static float convertTablespoonsToLiters(float inTablespoons) {
        return inTablespoons * 0.0177582f;
    }

    public static float convertTablespoonsToCubicInches(float inTablespoons) {
        return inTablespoons * 1.08367f;
    }

    public static float convertTablespoonsToCubicFeet(float inTablespoons) {
        return inTablespoons * 0.000627124f;
    }

    public static float convertTablespoonsToCubicMeters(float inTablespoons) {
        return inTablespoons * 1.7758e-5f;
    }



    public static float convertCupsToTeaspoons(float inCups) {
        return inCups * 48;
    }

    public static float convertCupsToTablespoons(float inCups) {
        return inCups * 16;
    }

    public static float convertCupsToCups(float inCups) {
        return inCups;
    }

    public static float convertCupsToPints(float inCups) {
        return inCups/2;
    }

    public static float convertCupsToQuarts(float inCups) {
        return inCups/4;
    }

    public static float convertCupsToGallons(float inCups) {
        return inCups/16;
    }

    public static float convertCupsToFluidOunces(float inCups) {
        return inCups * 9.6076f;
    }

    public static float convertCupsToMilliliters(float inCups) {
        return inCups * 284.131f;
    }

    public static float convertCupsToLiters(float inCups) {
        return inCups * 0.284131f;
    }

    public static float convertCupsToCubicInches(float inCups) {
        return inCups * 17.3387f;
    }

    public static float convertCupsToCubicFeet(float inCups) {
        return inCups * 0.010034f;
    }

    public static float convertCupsToCubicMeters(float inCups) {
        return inCups * 0.000284131f;
    }



    public static float convertPintsToTeaspoons(float inPints) {
        return inPints * 96;
    }

    public static float convertPintsToTablespoons(float inPints) {
        return inPints * 32;
    }

    public static float convertPintsToCups(float inPints) {
        return inPints * 2;
    }

    public static float convertPintsToPints(float inPints) {
        return inPints;
    }

    public static float convertPintsToQuarts(float inPints) {
        return inPints/2;
    }

    public static float convertPintsToGallons(float inPints) {
        return inPints/8;
    }

    public static float convertPintsToFluidOunces(float inPints) {
        return inPints * 19.2152f;
    }

    public static float convertPintsToMilliliters(float inPints) {
        return inPints * 568.261f;
    }

    public static float convertPintsToLiters(float inPints) {
        return inPints * 0.568261f;
    }

    public static float convertPintsToCubicInches(float inPints) {
        return inPints * 34.6774f;
    }

    public static float convertPintsToCubicFeet(float inPints) {
        return inPints * 0.020068f;
    }

    public static float convertPintsToCubicMeters(float inPints) {
        return inPints * 0.000568261f;
    }



    public static float convertQuartsToTeaspoons(float inQuarts) {
        return inQuarts * 192;
    }

    public static float convertQuartsToTablespoons(float inQuarts) {
        return inQuarts * 64;
    }

    public static float convertQuartsToCups(float inQuarts) {
        return inQuarts * 4;
    }

    public static float convertQuartsToPints(float inQuarts) {
        return inQuarts * 2;
    }

    public static float convertQuartsToQuarts(float inQuarts) {
        return inQuarts;
    }

    public static float convertQuartsToGallons(float inQuarts) {
        return inQuarts/4;
    }

    public static float convertQuartsToFluidOunces(float inQuarts) {
        return inQuarts * 38.4304f;
    }

    public static float convertQuartsToMilliliters(float inQuarts) {
        return inQuarts * 1136.52f;
    }

    public static float convertQuartsToLiters(float inQuarts) {
        return inQuarts * 1.13652f;
    }

    public static float convertQuartsToCubicInches(float inQuarts) {
        return inQuarts * 65.3549f;
    }

    public static float convertQuartsToCubicFeet(float inQuarts) {
        return inQuarts * 0.0401359f;
    }

    public static float convertQuartsToCubicMeters(float inQuarts) {
        return inQuarts * 0.00113652f;
    }



    public static float convertGallonsToTeaspoons(float inGallons) {
        return inGallons * 768;
    }

    public static float convertGallonsToTablespoons(float inGallons) {
        return inGallons * 256;
    }

    public static float convertGallonsToCups(float inGallons) {
        return inGallons * 16;
    }

    public static float convertGallonsToPints(float inGallons) {
        return inGallons * 8;
    }

    public static float convertGallonsToQuarts(float inGallons) {
        return inGallons * 4;
    }

    public static float convertGallonsToGallons(float inGallons) {
        return inGallons;
    }

    public static float convertGallonsToFluidOunces(float inGallons) {
        return inGallons * 153.722f;
    }

    public static float convertGallonsToMilliliters(float inGallons) {
        return inGallons * 4546.09f;
    }

    public static float convertGallonsToLiters(float inGallons) {
        return inGallons * 4.56709f;
    }

    public static float convertGallonsToCubicInches(float inGallons) {
        return inGallons * 277.419f;
    }

    public static float convertGallonsToCubicFeet(float inGallons) {
        return inGallons * 0.160544f;
    }

    public static float convertGallonsToCubicMeters(float inGallons) {
        return inGallons * 0.00454609f;
    }



    public static float convertFluidOuncesToTeaspoons(float inFluidOunces) {
        return inFluidOunces * 4.99604f;
    }

    public static float convertFluidOuncesToTablespoons(float inFluidOunces) {
        return inFluidOunces * 1.66535f;
    }

    public static float convertFluidOuncesToCups(float inFluidOunces) {
        return inFluidOunces * 0.104084f;
    }

    public static float convertFluidOuncesToPints(float inFluidOunces) {
        return inFluidOunces * 0.0520421f;
    }

    public static float convertFluidOuncesToQuarts(float inFluidOunces) {
        return inFluidOunces * 0.0260211f;
    }

    public static float convertFluidOuncesToGallons(float inFluidOunces) {
        return inFluidOunces * 0.00650527f;
    }

    public static float convertFluidOuncesToFluidOunces(float inFluidOunces) {
        return inFluidOunces;
    }

    public static float convertFluidOuncesToMilliliters(float inFluidOunces) {
        return inFluidOunces * 29.5735f;
    }

    public static float convertFluidOuncesToLiters(float inFluidOunces) {
        return inFluidOunces * 0.0295735f;
    }

    public static float convertFluidOuncesToCubicInches(float inFluidOunces) {
        return inFluidOunces * 1.80469f;
    }

    public static float convertFluidOuncesToCubicFeet(float inFluidOunces) {
        return inFluidOunces * 0.00104438f;
    }

    public static float convertFluidOuncesToCubicMeters(float inFluidOunces) {
        return inFluidOunces * 2.9574e-5f;
    }



    public static float convertMillilitersToTeaspoons(float inMilliliters) {
        return inMilliliters * 0.168936f;
    }

    public static float convertMillilitersToTablespoons(float inMilliliters) {
        return inMilliliters * 0.0563121f;
    }

    public static float convertMillilitersToCups(float inMilliliters) {
        return inMilliliters * 0.00351951f;
    }

    public static float convertMillilitersToPints(float inMilliliters) {
        return inMilliliters * 0.00175975f;
    }

    public static float convertMillilitersToQuarts(float inMilliliters) {
        return inMilliliters * 0.000879877f;
    }

    public static float convertMillilitersToGallons(float inMilliliters) {
        return inMilliliters * 0.000219969f;
    }

    public static float convertMillilitersToFluidOunces(float inMilliliters) {
        return inMilliliters * 0.033814f;
    }

    public static float convertMillilitersToMilliliters(float inMilliliters) {
        return inMilliliters;
    }

    public static float convertMillilitersToLiters(float inMilliliters) {
        return inMilliliters/1000;
    }

    public static float convertMillilitersToCubicInches(float inMilliliters) {
        return inMilliliters * 0.0610237f;
    }

    public static float convertMillilitersToCubicFeet(float inMilliliters) {
        return inMilliliters * 3.5315e-5f;
    }

    public static float convertMillilitersToCubicMeters(float inMilliliters) {
        return inMilliliters * 1e-6f;
    }



    public static float convertLitersToTeaspoons(float inLiters) {
        return inLiters * 168.936f;
    }

    public static float convertLitersToTablespoons(float inLiters) {
        return inLiters * 56.3121f;
    }

    public static float convertLitersToCups(float inLiters) {
        return inLiters * 3.51951f;
    }

    public static float convertLitersToPints(float inLiters) {
        return inLiters * 1.75975f;
    }

    public static float convertLitersToQuarts(float inLiters) {
        return inLiters * 0.879877f;
    }

    public static float convertLitersToGallons(float inLiters) {
        return inLiters * 0.219969f;
    }

    public static float convertLitersToFluidOunces(float inLiters) {
        return inLiters * 33.814f;
    }

    public static float convertLitersToMilliliters(float inLiters) {
        return inLiters * 1000;
    }

    public static float convertLitersToLiters(float inLiters) {
        return inLiters;
    }

    public static float convertLitersToCubicInches(float inLiters) {
        return inLiters * 61.0237f;
    }

    public static float convertLitersToCubicFeet(float inLiters) {
        return inLiters * 0.0353147f;
    }

    public static float convertLitersToCubicMeters(float inLiters) {
        return inLiters * 0.001f;
    }



    public static float convertCubicInchesToTeaspoons(float inCubicInches) {
        return inCubicInches * 2.76837f;
    }

    public static float convertCubicInchesToTablespoons(float inCubicInches) {
        return inCubicInches * 0.92279f;
    }

    public static float convertCubicInchesToCups(float inCubicInches) {
        return inCubicInches * 0.0576744f;
    }

    public static float convertCubicInchesToPints(float inCubicInches) {
        return inCubicInches * 0.0288372f;
    }

    public static float convertCubicInchesToQuarts(float inCubicInches) {
        return inCubicInches * 0.0144186f;
    }

    public static float convertCubicInchesToGallons(float inCubicInches) {
        return inCubicInches * 0.00360465f;
    }

    public static float convertCubicInchesToFluidOunces(float inCubicInches) {
        return inCubicInches * 0.554113f;
    }

    public static float convertCubicInchesToMilliliters(float inCubicInches) {
        return inCubicInches * 16.3871f;
    }

    public static float convertCubicInchesToLiters(float inCubicInches) {
        return inCubicInches * 0.0163871f;
    }

    public static float convertCubicInchesToCubicInches(float inCubicInches) {
        return inCubicInches;
    }

    public static float convertCubicInchesToCubicFeet(float inCubicInches) {
        return inCubicInches * 0.000578704f;
    }

    public static float convertCubicInchesToCubicMeters(float inCubicInches) {
        return inCubicInches * 1.6387e-5f;
    }



    public static float convertCubicFeetToTeaspoons(float inCubicFeet) {
        return inCubicFeet * 4783.74f;
    }

    public static float convertCubicFeetToTablespoons(float inCubicFeet) {
        return inCubicFeet * 1594.58f;
    }

    public static float convertCubicFeetToCups(float inCubicFeet) {
        return inCubicFeet * 99.6614f;
    }

    public static float convertCubicFeetToPints(float inCubicFeet) {
        return inCubicFeet * 49.8307f;
    }

    public static float convertCubicFeetToQuarts(float inCubicFeet) {
        return inCubicFeet * 24.9153f;
    }

    public static float convertCubicFeetToGallons(float inCubicFeet) {
        return inCubicFeet * 6.22884f;
    }

    public static float convertCubicFeetToFluidOunces(float inCubicFeet) {
        return inCubicFeet * 957.506f;
    }

    public static float convertCubicFeetToMilliliters(float inCubicFeet) {
        return inCubicFeet * 28316.8f;
    }

    public static float convertCubicFeetToLiters(float inCubicFeet) {
        return inCubicFeet * 28.3168f;
    }

    public static float convertCubicFeetToCubicInches(float inCubicFeet) {
        return inCubicFeet * 1728;
    }

    public static float convertCubicFeetToCubicFeet(float inCubicFeet) {
        return inCubicFeet;
    }

    public static float convertCubicFeetToCubicMeters(float inCubicFeet) {
        return inCubicFeet * 0.0283168f;
    }



    public static float convertCubicMetersToTeaspoons(float inCubicMeters) {
        return inCubicMeters * 168936;
    }

    public static float convertCubicMetersToTablespoons(float inCubicMeters) {
        return inCubicMeters * 56312.1f;
    }

    public static float convertCubicMetersToCups(float inCubicMeters) {
        return inCubicMeters * 3519.51f;
    }

    public static float convertCubicMetersToPints(float inCubicMeters) {
        return inCubicMeters * 1759.75f;
    }

    public static float convertCubicMetersToQuarts(float inCubicMeters) {
        return inCubicMeters * 879.877f;
    }

    public static float convertCubicMetersToGallons(float inCubicMeters) {
        return inCubicMeters * 219.969f;
    }

    public static float convertCubicMetersToFluidOunces(float inCubicMeters) {
        return inCubicMeters * 33814;
    }

    public static float convertCubicMetersToMilliliters(float inCubicMeters) {
        return inCubicMeters * 1000000;
    }

    public static float convertCubicMetersToLiters(float inCubicMeters) {
        return inCubicMeters * 1000;
    }

    public static float convertCubicMetersToCubicInches(float inCubicMeters) {
        return inCubicMeters * 61023.7f;
    }

    public static float convertCubicMetersToCubicFeet(float inCubicMeters) {
        return inCubicMeters * 35.3147f;
    }

    public static float convertCubicMetersToCubicMeters(float inCubicMeters) {
        return inCubicMeters;
    }





    public static float convertVolume(String toVolumeUnits, String fromVolumeUnits, float toConvert) {
        float retVal = 0;
        String methodName = "";

        if (!volumeUnits.contains(toVolumeUnits))
            Log.d("VolumeConverter", "Invalid toVolumeUnit: " + toVolumeUnits);

        if (!volumeUnits.contains(fromVolumeUnits))
            Log.d("VolumeConverter", "Invalid fromVolumeUnit: " + fromVolumeUnits);

        try {
            /* Trying not to have to work through a silly number of method calls
             * by using reflection. Yay for formulaic method names!
             */
            methodName = "convert" + fromVolumeUnits + "To" + toVolumeUnits;
            Log.d("VolumeConverter", "Method name: " + methodName);
            Method m = VolumeConverter.class.getDeclaredMethod(methodName, Float.TYPE);
            Object o = m.invoke(null, toConvert);
            retVal = (float) o;
        }
        catch (NoSuchMethodException nsm) {
            Log.d("VolumeConverter", "NoSuchMethodException - methodName: " + methodName);
        }
        catch (IllegalAccessException iae) {
            Log.d("VolumeConverter", "IllegalAccessException: " + iae.getMessage());
        }
        catch (InvocationTargetException ite) {
            Log.d("VolumeConverter", "InvocationTargetException: " + ite.getMessage());
        }

        return retVal;
    }
}
