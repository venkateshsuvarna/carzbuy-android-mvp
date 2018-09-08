package com.venkateshsuvarna.carzbuy.presenter;

import android.app.Activity;

import com.venkateshsuvarna.carzbuy.R;
import com.venkateshsuvarna.carzbuy.model.CarListModel;
import com.venkateshsuvarna.carzbuy.view.ICarListView;

public class CarListPresenter implements ICarListPresenter {

    ICarListView carListView;
    CarListModel carListModel;
    Activity currentActivity;

    Integer[] carImage = {R.drawable.car1,R.drawable.car2,R.drawable.car3,R.drawable.car4,R.drawable.car5,R.drawable.car1,R.drawable.car2,R.drawable.car3,R.drawable.car4,R.drawable.car5};
    String[] carName = {"Car 1","Car 2","Car 3","Car 4","Car 5","Car 1","Car 2","Car 3","Car 4","Car 5"};
    String[] carYear = {"2010","2011","2012","2013","2014","2010","2011","2012","2013","2014"};
    String[] carMiles = {"50000","60000","70000","80000","90000","50000","60000","70000","80000","90000"};
    String[] carCondition = {"Excellent","Good","Average","Good","Excellent","Excellent","Good","Average","Good","Excellent"};

    public CarListPresenter(ICarListView carListView,Activity currentActivity){
        this.carListView = carListView;
        this.currentActivity = currentActivity;
    }

    @Override
    public void showCarList() {
        carListModel = new CarListModel(this.carImage,this.carName,this.carYear,this.carMiles,this.carCondition);
        CustomCarListAdapter customCarListAdapter = new CustomCarListAdapter(currentActivity,this.carName,this.carYear,this.carMiles,this.carCondition,this.carImage);
        carListView.displayList(customCarListAdapter);
    }
}
