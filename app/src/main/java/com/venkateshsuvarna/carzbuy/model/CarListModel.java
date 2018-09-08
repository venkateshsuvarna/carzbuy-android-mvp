package com.venkateshsuvarna.carzbuy.model;

public class CarListModel implements ICarListModel {

    public String[] carName;
    public String[] carYear;
    public String[] carMiles;
    public String[] carCondition;
    public Integer[] carImage;

    public CarListModel(Integer[] carImage, String[] carName, String[] carYear, String[] carMiles, String[] carCondition){
        this.carImage = carImage;
        this.carName = carName;
        this.carYear = carYear;
        this.carMiles = carMiles;
        this.carCondition = carCondition;
    }

    public String[] getCarName() {
        return carName;
    }

    public void setCarName(String[] carName) {
        this.carName = carName;
    }

    public String[] getCarYear() {
        return carYear;
    }

    public void setCarYear(String[] carYear) {
        this.carYear = carYear;
    }

    public String[] getCarMiles() {
        return carMiles;
    }

    public void setCarMiles(String[] carMiles) {
        this.carMiles = carMiles;
    }

    public String[] getCarCondition() {
        return carCondition;
    }

    public void setCarCondition(String[] carCondition) {
        this.carCondition = carCondition;
    }

    public Integer[] getCarImage() {
        return carImage;
    }

    public void setCarImage(Integer[] carImage) {
        this.carImage = carImage;
    }

}
