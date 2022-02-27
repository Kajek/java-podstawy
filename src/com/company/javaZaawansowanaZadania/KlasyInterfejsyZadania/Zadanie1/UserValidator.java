package com.company.javaZaawansowanaZadania.KlasyInterfejsyZadania.Zadanie1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    private String email;
    private String altEmail;

    public UserValidator() {    }

    public String validateEmails(String emailToValidate){
        class Email{
            private String emailToValidate;

            public Email(String emailToValidate) {
                Pattern pattern = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
                Matcher matcher = pattern.matcher(emailToValidate);
                if(emailToValidate == null || "".equals(emailToValidate.trim())){
                    this.emailToValidate = "unknown";
                }else if(!matcher.matches()){
                    this.emailToValidate = "unknown";
                }else{
                    this.emailToValidate = emailToValidate;
                }
            }
        }
        Email email = new Email(emailToValidate);
        return email.emailToValidate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = validateEmails(email);
    }

    public String getAltEmail() {
        return altEmail;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = validateEmails(altEmail);
    }


}
