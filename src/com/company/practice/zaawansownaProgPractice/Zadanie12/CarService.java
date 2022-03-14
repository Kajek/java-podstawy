package com.company.practice.zaawansownaProgPractice.Zadanie12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {

    Scanner scanner = new Scanner(System.in);

    private List<Car> carList = new ArrayList<>();

    public void addCar(Car car){
        carList.add(car);
    }

    public void removeCar(Car car){
        carList.remove(car);
    }

    public List<Car> returnCarList(){
        return new ArrayList<>(carList);
    }

    public List<Car> findV12Cars(){
        return carList.stream().filter(c -> c.getEngineType().equals(EngineType.V12)).collect(Collectors.toList());
    }

    public List<Car> findOlderThan1999(){
        return carList.stream().filter(c -> c.getProductionYear() < 1999).collect(Collectors.toList());
    }

    public Car findMostExpensiveCar(){
//        Car mostExpensiveCar = carList.get(0);
//        for (Car c : carList){
//            if(c.getPrice().compareTo(mostExpensiveCar.getPrice()) > 0){
//                mostExpensiveCar = c;
//            }
//        }
//        System.out.println(mostExpensiveCar);
        return carList.stream().max((c1, c2) -> c1.getPrice().compareTo(c2.getPrice())).get();
    }
    public Car findCheapestCar(){
        return carList.stream().min((c1, c2) -> c1.getPrice().compareTo(c2.getPrice())).get();
    }

    public void findCarWithAtLeast3Manufacturers(){
        carList.stream().filter(c -> c.getManufacturerList().size() >= 3).forEach(System.out::println);
    }

    public List<Car> sortCarListByGivenParameter(String parameterToSortBy){
        List<Car> returnCarList =new ArrayList<>();
        List<Car> returnCarListAscending = new ArrayList<>();
        List<Car> returnCarListDescending = new ArrayList<>();
        System.out.println("Sorting parameters: name, model, year, price");


        switch (parameterToSortBy){
            case "name":
                returnCarListAscending = carList.stream().sorted(Comparator.comparing(Car::getName))
                        .collect(Collectors.toList());
                returnCarListDescending = carList.stream().sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
                        .collect(Collectors.toList());
                break;
            case "model":
                returnCarListAscending = carList.stream().sorted((c1,c2) -> c1.getModel().compareTo(c2.getModel()))
                        .collect(Collectors.toList());
                returnCarListDescending = carList.stream().sorted((c1,c2) -> c2.getModel().compareTo(c1.getModel()))
                        .collect(Collectors.toList());
                break;
            case "year":
                returnCarListAscending = carList.stream().sorted((c1,c2) -> Integer.compare(c1.getProductionYear(), c2.getProductionYear()))
                        .collect(Collectors.toList());
                returnCarListDescending = carList.stream().sorted((c1,c2) -> Integer.compare(c2.getProductionYear(), c1.getProductionYear()))
                        .collect(Collectors.toList());
                break;
            case  "price":
                returnCarListAscending = carList.stream().sorted((c1,c2) -> c1.getPrice().compareTo(c2.getPrice()))
                        .collect(Collectors.toList());
                returnCarListDescending = carList.stream().sorted((c1,c2) -> c2.getPrice().compareTo(c1.getPrice()))
                        .collect(Collectors.toList());
                break;

        }
        System.out.println("Choose order for sorting: ascending or descending: ");
        String orderToSortBy = scanner.nextLine();
        switch (orderToSortBy){
            case "ascending":
                returnCarList = returnCarListAscending;
                break;
            case "descending":
                returnCarList =  returnCarListDescending;
                break;
        }
        return returnCarList;
    }

    public boolean checkForCarByModel(String modelToCheck){ //można zrobić switch dla różnych opcji szukania
        return carList.stream().anyMatch(c -> c.getModel().equals(modelToCheck));
    }

    public List<Car> getCarsProducedBy(String manufacturerNameToSort){
//        for (Car car: carList){
//            if ( !car.getManufacturerList().contains(manufacturerNameToSort)){
//                System.out.println("No car produced by that manufacturer");
//            }else{
//                System.out.println(car);
//            }
//        }
        return carList.stream().filter(car -> car.getManufacturerList().stream().anyMatch(m->m.getName().equals(manufacturerNameToSort)))
                .collect(Collectors.toList());

    }
    public List<Car> getCarsProducedByProducerEstablishmentYearCondition(int yearToCompare){
        List<Car> listToReturn = new ArrayList<>();
        System.out.println("Choose comparison symbol: <,>,>=,<=,=,!=");
        String compareSymbol = scanner.nextLine();
        for (Car car: carList){
            for (Manufacturer manufacturer : car.getManufacturerList()){
                int comparator = Integer.compare(manufacturer.getFoundationDate(), yearToCompare);
                switch (compareSymbol) {
                    case ">":
                        if (comparator > 0){
                            listToReturn.add(car);
                        }
                        break;
                    case "<":
                        if (comparator < 0){
                            listToReturn.add(car);
                        }
                        break;
                    case ">=":
                        if (comparator >= 0){
                            listToReturn.add(car);
                        }
                        break;
                    case "<=":
                        if (comparator <= 0){
                            listToReturn.add(car);
                        }break;
                    case "=":
                        if (comparator == 0){
                            listToReturn.add(car);
                        }break;
                    case "!=":
                        if (comparator !=0 ){
                            listToReturn.add(car);
                        }break;
                }
            }
        }
        return listToReturn;
    }
// TE DWIE OSTATNIE TO ALTERNATYWNE ROZWIAZANIE TEGO OSTATNIEGO
    public List<Car> getCarsByProducerYearOfEST(int foundationDate, Cond condition){
        return carList.stream()
                .filter(filterCondition(condition, foundationDate))
                .collect(Collectors.toList());
    }

    private Predicate<Car> filterCondition(Cond condition, int foundationDate){
        if (condition == Cond.GREATER){
            return car -> car.getManufacturerList().stream().anyMatch(m->m.getFoundationDate() > foundationDate);
        }else if(condition == Cond.LESS){
            return car -> car.getManufacturerList().stream().anyMatch(m->m.getFoundationDate() < foundationDate);
        }else{
            return car -> car.getManufacturerList().stream().anyMatch(m->m.getFoundationDate() == foundationDate);
        }
    }

}

