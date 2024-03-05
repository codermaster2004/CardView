package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] name = {"Instagram","Whatsapp","Youtube","Facebook"};

    String[] detail = {"100mb","50mb","160mb","180mb"};

    int[]    image  = {R.drawable.aaa,R.drawable.bbb,R.drawable.ccc,R.drawable.ddd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        App app = new App(MainActivity.this,name,detail,image);
        listView.setAdapter(app);
    }
}