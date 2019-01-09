package edu.cscc;

public class Main {

    public static void main(String[] args) {
        int currentTemperature = 50;
        int highTemperature = 68;
        double currentHumidity = 0.55;
        double highHumidity = 0.75;
        String cityName = "Columbus";

        //Compound assignment
        highHumidity += 0.1; //add to existing value
        currentHumidity /= 2; //divide existing value
        System.out.println(highHumidity);
        System.out.println(currentHumidity);

        //Unary increment and decrement
        int tomorrowHighTemperature = ++highTemperature; //prefix increment
        int tomorrowLowTemperature = currentTemperature--; //postfix decrement
        System.out.println(tomorrowHighTemperature);
        System.out.println(tomorrowLowTemperature);

        /*
        Comparison
        compare two numeric values; if the values are the same, isHigh will be true
        if the values are different, isHigh will be false
        */

        boolean isHigh = currentTemperature == highTemperature;

        //compare the content of two strings
        boolean isColumbus = cityName == "Columbus";
        System.out.println(isHigh);
        System.out.println(isColumbus);
    }
}
