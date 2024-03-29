package com.example.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdatoperListView extends BaseAdapter {

    private Context context;
    private List<Student> data;

    private LayoutInflater inflater;

    public  MyAdatoperListView(Context context,List<Student>  data){

        this.context=context;
        this.data=data;
       inflater= LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view=inflater.inflate(R.layout.listview,null);
        TextView name=view.findViewById(R.id.listName);
        TextView mobile=view.findViewById(R.id.listMobile);
        TextView email=view.findViewById(R.id.listEmail);


        name.setText(data.get(i).getName());
        mobile.setText(data.get(i).getMobile());
        email.setText(data.get(i).getEmail());


        return view;
    }
}
