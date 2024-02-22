package com.example.adaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class ArrayAdaptor extends AppCompatActivity {


String [] arr={"Laxman", "Aksahat", "Mahesh", "Akshay","Omkar"};
    private ListView listView;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adaptor);

        listView=findViewById(R.id.listViewForArrayAdaptor);
        ArrayAdapter<String> myArrayAdaptor=new ArrayAdapter<>(this,R.layout.array_adaptor_list_view,R.id.arrayAdaptorViewList,arr);
        // (this,LayoutName,UIID,ArrName);
        listView.setAdapter(myArrayAdaptor);

        // Array Adaptor For Spinner

        spinner=findViewById(R.id.arraAdaptorForSpinner);
        ArrayAdapter<String > arrayAdapter=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arr);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),arr[i],Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}