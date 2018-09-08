package com.venkateshsuvarna.carzbuy.model;

public interface ICarListModel {
    String[] getCarName();
    void setCarName(String[] carName);
    String[] getCarYear();
    void setCarYear(String[] carYear);
    String[] getCarMiles();
    void setCarMiles(String[] carMiles);
    String[] getCarCondition();
    void setCarCondition(String[] carCondition);
    Integer[] getCarImage();
    void setCarImage(Integer[] carImage);
}
