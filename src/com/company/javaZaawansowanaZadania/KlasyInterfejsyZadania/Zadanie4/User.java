package com.company.javaZaawansowanaZadania.KlasyInterfejsyZadania.Zadanie4;

public class User<T> implements Validator<T>{

    private String name;
    private String surname;
    private int age;
    private String login;
    private String password;

    public User(){    }


    public void setName(String name, Validator<String> nameValidator) {
        if (nameValidator.validate(name)){
            this.name = name;
        }else{
            System.out.println("Wrong input");
        }
    }

    public void setSurname(String surname, Validator<String> surnameValidator) {
        if(surnameValidator.validate(surname)){
            this.surname = surname;
        }else{
            System.out.println("Wrong input");
        }
    }

    public void setAge(int age, Validator<Integer> ageValidator) {
        if(ageValidator.validate(age)){
            this.age = age;
        }else{
            System.out.println("Wrong input");
        }
    }

    public void setLogin(String login, Validator<String> loginValidator) {
        if(loginValidator.validate(login)){
            this.login = login;
        }else{
            System.out.println("Wrong input");
        }
    }

    public void setPassword(String password, Validator<String> passwordValidator) {
        if(passwordValidator.validate(password)){
            this.password = password;
        }else{
            System.out.println("Wrong input");
        }
    }

    public Validator<String> nameValidator = new Validator<String>() {
        @Override
        public boolean validate(String input) {
            return input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
        }
    };
    Validator<String> surnameValidator = new Validator<String>() {
        @Override
        public boolean validate(String input) {
            return input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
        }
    };
    Validator<Integer> ageValidator = new Validator<Integer>() {
        @Override
        public boolean validate(Integer input) {
            return input != null && (input >= 0 && input <= 150);
        }
    };
    Validator<String> loginValidator = new Validator<String>() {
        @Override
        public boolean validate(String input) {
            return input!=null && input.length() == 10;
        }
    };
    Validator<String> passwordValidator = new Validator<String>() {
        @Override
        public boolean validate(String input) {
            return input != null  && input.contains("!");
        }
    };

    @Override
    public String toString() {
        return "User " +
                "name: " + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", age: " + age +
                ", login: '" + login + '\'' +
                ", password: '" + password + '\'' +
                '}';
    }

    @Override
    public boolean validate(T input) {
        return false;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
