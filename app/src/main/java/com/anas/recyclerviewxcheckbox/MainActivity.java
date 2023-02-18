package com.anas.recyclerviewxcheckbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView vRV;
    Button btnRV;
    ArrayList<Model_Stud> arrStud = new ArrayList<>();
    Adapter_Stud adapter_stud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vRV=findViewById(R.id.vRV);
        btnRV=findViewById(R.id.btnRV);
        vRV.setLayoutManager(new LinearLayoutManager(this));

        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"bas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"dfsdf","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"sfddf","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"sdfas","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"sdfa","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"sdf","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"gfd","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"ewrf","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"fdeer","21BCS8965"));
        arrStud.add(new Model_Stud(R.drawable.ic_launcher_background,"Anas","21BCS8965"));

        adapter_stud = new Adapter_Stud(this,arrStud);
        vRV.setAdapter(adapter_stud);




        btnRV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                creationOfDialog();

            }
        });


        findViewById(R.id.fbtn).setOnClickListener(new View.OnClickListener() {
            String txtToastname="";
            String txtToastuid="";
            @Override
            public void onClick(View v) {
                for (Model_Stud model_stud : adapter_stud.arrStud_name){
                    txtToastname += model_stud.getStud_name();
                }
                for (Model_Stud model_stud : adapter_stud.arrStud_name){
                    txtToastuid += model_stud.getStud_uid();
                }

                if (adapter_stud.arrStud_name.size()>0) {
                    Toast.makeText(MainActivity.this, txtToastname, Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, txtToastuid, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Please Select Student", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void creationOfDialog() {
        Dialog dialogCreate=new Dialog(MainActivity.this);
        dialogCreate.setContentView(R.layout.create_dialog);

        EditText eName,eUid;
        Button btnAction;
        eName=dialogCreate.findViewById(R.id.eName);
        eUid=dialogCreate.findViewById(R.id.eUid);
        btnAction=dialogCreate.findViewById(R.id.btnAction);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name="";
                String uid="";

                if (eName.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Enter name",Toast.LENGTH_SHORT).show();
                }
                else {
                    name=eName.getText().toString();
                }
                if(eUid.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Enter uid",Toast.LENGTH_SHORT).show();
                }
                else{
                    uid=eUid.getText().toString();
                }

                arrStud.add(new Model_Stud(name, uid));
                adapter_stud.notifyItemInserted(arrStud.size()-1);
                vRV.scrollToPosition(arrStud.size()-1);

                dialogCreate.dismiss();
            }
        });
        dialogCreate.show();
    }
}