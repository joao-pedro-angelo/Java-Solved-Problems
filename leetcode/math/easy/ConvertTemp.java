package math.easy;

import java.util.Arrays;

//https://leetcode.com/problems/convert-the-temperature/description/
public class ConvertTemp {
    public static void main(String[] args){
        double tempCelsius = 36.50;
        System.out.println(Arrays.toString(convertTemp(tempCelsius)));
    }

    private static double[] convertTemp(double tempCelsius){
        double[] result = new double[2];
        result[0] = convertTempCelsiusToKelvin(tempCelsius);
        result[1] = convertTempToFahrenheit(tempCelsius);
        return result;
    }

    private static double convertTempCelsiusToKelvin(double tempCelsius){
        return tempCelsius + 273.15;
    }

    private static double convertTempToFahrenheit(double tempCelsius){
        return ((tempCelsius * 9/5) + 32);
    }
}
