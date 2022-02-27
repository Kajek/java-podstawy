package com.company.practice.randomExamples;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<String> list = new ArrayList<>();

    public void addTask(String task){
        if (list.contains(task)){
            System.out.println("Zadnie już istnieje");
        }else{
            list.add(task);
        }
    }
    public void displayTaskToDo(){
        for( String task: list){
            System.out.println(task);
        }
    }

    public void removeTask(String task){
        boolean succes = list.remove(task);
        if (succes){
            System.out.println("usunięto zadanie");
            }else{
            System.out.println("nie ma takiego zadania");
        }
    }

    public String getTask(){
        if(list.isEmpty()){
            System.out.println("lista pusta");
            return null;
        }
        return list.get(0);
    }

}
