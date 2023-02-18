package com.anas.recyclerviewxcheckbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView vRV;
    Button btnRV;
    ArrayList<Model_Stud> arrStud;
    Adapter_Stud adapter_stud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vRV=findViewById(R.id.vRV);
        vRV.setLayoutManager(new LinearLayoutManager(this));

        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));

        adapter_stud = new Adapter_Stud(this,arrStud);
        vRV.setAdapter(adapter_stud);




    }
}