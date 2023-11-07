package com.example.recyclerviewactivity;

import static android.app.ProgressDialog.show;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.accessibilityservice.AccessibilityButtonController;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.recyclerviewactivity.adapter.MyCustomAdapter;
import com.example.recyclerviewactivity.model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    List<CarModel> carModelList;

    MyCustomAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        carModelList = new ArrayList<>();


        CarModel c1 = new CarModel("Audi","50000","2022","BSIV" ,R.drawable.d);
        CarModel c2 = new CarModel("BMW","50000","2023" ,"BSIV",R.drawable.b);
        CarModel c3 = new CarModel("Tesla","50000","2021","BSVI",R.drawable.c);
        CarModel c4 = new CarModel("Benz","50000","2020","BSIV",R.drawable.a);
        CarModel c5 = new CarModel("Audi","50000","2023","BSIII",R.drawable.d);
        CarModel c6 = new CarModel("BMW","50000","2021","BSVI",R.drawable.b);
        CarModel c7 = new CarModel("Benz","50000","2020" ,"BSIV",R.drawable.a);
        CarModel c8 = new CarModel("Tesla","50000","2022" ,"BSII",R.drawable.c);

        carModelList.add(c1);
        carModelList.add(c2);
        carModelList.add(c3);
        carModelList.add(c4);
        carModelList.add(c5);
        carModelList.add(c6);
        carModelList.add(c7);
        carModelList.add(c8);

        myCustomAdapter = new MyCustomAdapter(carModelList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myCustomAdapter);


    }

}