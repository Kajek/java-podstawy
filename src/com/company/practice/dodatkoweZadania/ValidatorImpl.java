package com.company.practice.dodatkoweZadania;

import com.company.practice.randomExamples.Parcel;

public class ValidatorImpl implements Validator {

    @Override
    public boolean validate(Parcel parcel) {
        if(parcel.getxLength() + parcel.getyLength() + parcel.getzLength() > 300){
            return false;
        }return false;

    }
}
