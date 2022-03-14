package com.company.practice.zaawansownaProgPractice.zadanie17;

import com.company.javaZaawansowanaZadania.enumZadania.Zadanie3.Converter;

public enum ConversionType  {

    METERS_TO_YARDS (value -> value * 1.0936132983),

    YARDS_TO_METERS(value -> value * 0.9144),
    CENTIMETERS_TO_INCHES(value -> value * 0.393700787),
    INCHES_TO_CENTIMETERS(value ->value * 2.54),
    KILOMETERS_TO_MILES(value -> value * 0.621371192),
    MILES_TO_KILOMETERS(value -> value * 1.609344);


    private MeasureConverter converter;

    ConversionType(MeasureConverter converter){
        this.converter = converter;
    }

    public double convert(int value){
        return  converter.convert(value);
    }
}
