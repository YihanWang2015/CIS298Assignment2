package edu.kvcc.cis298.cis298assignment2;

/**
 * Created by bigy on 10/9/15.
 */
public class TemperatureType {

    //Formula from http://www.csgnetwork.com/temp2conv.html

    //convert from celsius to to other types:
   public static double CelsiusToCelsius(double celsius){
       return celsius;
   }


    public static double CelsiusToFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }

    public static double CelsiusToKelvin(double celsius){
        return celsius + 237.15;
    }

    public static double CelsiusToRankin(double celsius){
        return celsius * 1.8 + 32 + 459.67;
    }

    //convert from fahrenheit to other types:
    public static double FahrenheitToFahrenheit(double fahrenheit){
        return fahrenheit;
    }

    public static double FahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }

    public static double FahrenheitToKelvin(double fahrenheit){
        return (fahrenheit + 459.67) / 1.8;
    }

    public static double FahrenheitToRankin(double fahrenheit){
        return fahrenheit + 459.67;
    }

    //convert from kelvin to other types:
    public static double KelvinToKelvin(double kelvin){
        return kelvin;
    }
    public static double KelvinToCelsius(double kelvin){
        return kelvin-273.15;
    }

    public static double KelvinToFahrenheit(double kelvin){
        return kelvin * 1.8 - 459.67;
    }

    public static double KelvinToRankin(double kelvin){
        return kelvin * 1.8;
    }

    //convert from rankin to other types:

    public static double RankinToRankin(double rankin){
        return rankin;
    }
    public static double RankinToCelsius(double rankin){
        return  ( rankin - 32 - 459.67) / 1.8;
    }

    public static double RankinToFahrenheit(double rankin){
        return rankin - 459.67;
    }

    public static double RankinToKelvin(double rankin){
        return rankin * 1.8;
    }










}


