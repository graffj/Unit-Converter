package com.graff.android.unitconverter;

/**
 * Created by Jonathan on 2/29/2016.
 */

public class TempConverter {

    public static final int CELSIUS = 0;
    public static final int FAHRENHEIT = 1;
    public static final int KELVIN = 2;


    // Converts Fahrenheit to Celsius
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // Converts Fahrenheit to Kelvin
    public static float convertFahrenheitToKelvin(float fahrenheit) {
        return convertCelsiusToKelvin(convertFahrenheitToCelsius(fahrenheit));
    }

    // Converts Celsius to Fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    public static float convertCelsiusToKelvin(float celsius) {
        return (celsius + 273);
    }

    public static float convertKelvinToCelsius(float kelvin) {
        return (kelvin - 273);
    }

    public static float convertKelvinToFahrenheit(float kelvin) {
        return convertCelsiusToFahrenheit(convertKelvinToCelsius(kelvin));
    }


    public static float convertTemps(float tempValue, int fromTemp, int toTemp) {
        float retVal;

        if (fromTemp == CELSIUS) {
            if (toTemp == CELSIUS)
                retVal = tempValue;
            else if (toTemp == FAHRENHEIT)
                retVal = convertCelsiusToFahrenheit(tempValue);
            else if (toTemp == KELVIN)
                retVal = convertCelsiusToKelvin(tempValue);
            else
                throw new IllegalArgumentException("TempConverter.convertTemps - toTemp value out of bounds: " + toTemp);
        }
        else if (fromTemp == FAHRENHEIT) {
            if (toTemp == CELSIUS)
                retVal = convertFahrenheitToCelsius(tempValue);
            else if (toTemp == FAHRENHEIT)
                retVal = tempValue;
            else if (toTemp == KELVIN)
                retVal = convertFahrenheitToKelvin(tempValue);
            else
                throw new IllegalArgumentException("TempConverter.convertTemps - toTemp value out of bounds: " + toTemp);
        }
        else if (fromTemp == KELVIN) {
            if (toTemp == CELSIUS)
                retVal = convertKelvinToCelsius(tempValue);
            else if (toTemp == FAHRENHEIT)
                retVal = convertKelvinToFahrenheit(tempValue);
            else if (toTemp == KELVIN)
                retVal = tempValue;
            else
                throw new IllegalArgumentException("TempConverter.convertTemps - toTemp value out of bounds: " + toTemp);
        }
        else
          throw new IllegalArgumentException("TempConverter.convertTemps - fromTemp value out of bounds: " + fromTemp);

        return retVal;
    }
}
