package com.example.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class App extends BaseAdapter {

    MainActivity mainActivity;
    String[] name;
    String[] detail;
    int[] image;

    App(MainActivity mainActivity,String[] name, String[] detail,int[] image){
        this.mainActivity=mainActivity;
        this.name        =name;
        this.detail      =detail;
        this.image       =image;

    }
    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(mainActivity).inflate(R.layout.page,parent,false);

        TextView textView = convertView.findViewById(R.id.textview);
        TextView textView1 = convertView.findViewById(R.id.textview1);
        ImageView imageView = convertView.findViewById(R.id.imageview);

        textView.setText(name[position]);
        textView1.setText(detail[position]);
        imageView.setImageResource(image[position]);
        return convertView;
    }
}
