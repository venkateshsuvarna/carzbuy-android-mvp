package com.venkateshsuvarna.carzbuy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.venkateshsuvarna.carzbuy.presenter.CarListPresenter;
import com.venkateshsuvarna.carzbuy.presenter.CustomCarListAdapter;
import com.venkateshsuvarna.carzbuy.presenter.ICarListPresenter;
import com.venkateshsuvarna.carzbuy.view.ICarListView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class CarListActivity extends AppCompatActivity implements ICarListView{

    ICarListPresenter carListPresenter;
    ListView listViewCarList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carlist);

        listViewCarList = findViewById(R.id.lv_carlist);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"segoeuil.ttf",true);

        getSupportActionBar().setTitle("Select Car");

        carListPresenter = new CarListPresenter(this,CarListActivity.this);
        carListPresenter.showCarList();

        listViewCarList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tvCarlistItemCarName = view.findViewById(R.id.tv_carlist_item_car_name);
                Toast.makeText(getApplicationContext(),tvCarlistItemCarName.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void displayList(CustomCarListAdapter customCarListAdapter) {
        listViewCarList.setAdapter(customCarListAdapter);
    }
}
