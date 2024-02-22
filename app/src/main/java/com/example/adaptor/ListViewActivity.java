package com.example.adaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {


    List<Student> list=new ArrayList<>();

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView=findViewById(R.id.listView);

        Student S1=new Student("Laxman Todkar","8600730760","todkar@gmail.com");
        Student S2=new Student("Mahesh Mali","96827236","mahesh@gmail.com");
        Student S3=new Student("Akshay Patil","97862531","akshayt@gmail.com");
        Student S4=new Student("Omakar Patil","857620760","o@gmail.com");
        list.add(S1);
        list.add(S2);
        list.add(S3);
        list.add(S4);

        MyAdatoperListView myAdatoperListView=new MyAdatoperListView(this,list);
        listView.setAdapter(myAdatoperListView);


    }
}