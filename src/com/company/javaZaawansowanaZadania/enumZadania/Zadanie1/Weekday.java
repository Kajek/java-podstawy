package com.company.javaZaawansowanaZadania.enumZadania.Zadanie1;

public enum Weekday {

    MONDAY(true), TUESDAY(true),
    WEDNESDAY(true), THURSDAY(true),
    FRIDAY(true), SATURDAY(false), SUNDAY(false);

    private boolean isWeekDay;

    Weekday(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }
    public boolean isWeekDay(){
        return isWeekDay;
    }
    public boolean isHoliday(){
        return !isWeekDay();
    }
    public void whichIsGreater(Weekday weekday){
        if(this.compareTo(weekday) < 0){
            System.out.println(this.name() + " is before " + weekday.name());
        }else if(this.compareTo(weekday) > 0){
            System.out.println(this.name() + " is after " + weekday.name());
        }
    }
}
