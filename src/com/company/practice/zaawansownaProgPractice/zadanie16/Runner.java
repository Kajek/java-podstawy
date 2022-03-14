package com.company.practice.zaawansownaProgPractice.zadanie16;

import java.util.Arrays;

public enum Runner {

    BEGGINER (260,340),
    INTERMEDIATE(200,260),
    ADVANCED(140,200);

    private int minMarathonTime;
    private int maxMarathonTime;

    Runner(int minMarathonTime, int maxMarathonTime) {
        this.minMarathonTime = minMarathonTime;
        this.maxMarathonTime = maxMarathonTime;
    }

    public static Runner getFitnessLevel(int marathonTime){
        if (marathonTime > BEGGINER.minMarathonTime && marathonTime < ADVANCED.maxMarathonTime){
            return BEGGINER;
        }else if(marathonTime > INTERMEDIATE.minMarathonTime && marathonTime <= INTERMEDIATE.maxMarathonTime){
            return INTERMEDIATE;
        }else{
            return ADVANCED;
        }
    }

    public static Runner getFitnessLvl(int time){
        return Arrays.stream(Runner.values())
                .filter(runner -> time > runner.minMarathonTime && time <= runner.maxMarathonTime)
                .findFirst().get();
    }
}
