package com.example.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdaptorGridView extends BaseAdapter {

    private Context context;
    private int [] data;

    private LayoutInflater inflater;


   public MyAdaptorGridView(Context context, int [] data){
       this.context=context;
       this.data=data;
       inflater=LayoutInflater.from(context);
   }




    @Override
    public int getCount() {
        return data.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        view= inflater.inflate(R.layout.ui_view_one_gridview,null);
        ImageView imageOne =view.findViewById(R.id.imgViewOne);
      TextView imageName= view.findViewById(R.id.imageName);
        imageOne.setImageResource(data[i]);
        imageName.setText("Image "+i);

        return view;
    }
}
