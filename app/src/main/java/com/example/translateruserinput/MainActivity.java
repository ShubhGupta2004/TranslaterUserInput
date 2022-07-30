package com.example.translateruserinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list);

        ArrayList<String> str = new ArrayList<>(3);
        str.add("hello");
        str.add("helo");
        str.add("hllo");
        str.add("ello");
        str.add("hell");
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.listsize,ar);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.list_format,str);
        listView.setAdapter(arrayAdapter);


    }
}