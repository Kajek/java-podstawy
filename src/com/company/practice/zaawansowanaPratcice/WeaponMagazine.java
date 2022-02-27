package com.company.practice.zaawansowanaPratcice;

import java.util.ArrayList;
import java.util.List;
// zadanie 7 z java zaawansowana

public class WeaponMagazine {

    List<String> magazine = new ArrayList<>();
    int magazineSize;

    public WeaponMagazine(int magazineSize) {
        this.magazineSize = magazineSize;
    }

    public void loadBullet(String bullet){
        if (magazine.size() < magazineSize){
            magazine.add(bullet);
        }else {
            System.out.println("Magazine full");
        }

    }
    public boolean isLoaded(){
        return !magazine.isEmpty();
    }
    public String shot(){
        int bulletIndex = magazine.size() -1;
        if(magazine.get(0) == null){
            return "Magazine is empty";
        }
        magazine.remove(bulletIndex);
        return magazine.get(0);
    }
}
