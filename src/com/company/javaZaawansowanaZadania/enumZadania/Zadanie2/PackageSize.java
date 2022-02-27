package com.company.javaZaawansowanaZadania.enumZadania.Zadanie2;

public enum PackageSize {

    SMALL(0,20),
    MEDIUM(21,40),
    LARGE(41,80);

    private int minSize;
    private int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int minSize, int maxSize) {
        if(minSize <= 20 && maxSize <= 20){
            return PackageSize.SMALL;
        }else if(minSize > 20 && maxSize <= 40){
            return PackageSize.MEDIUM;
        }else{
            return PackageSize.LARGE;
        }


    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
