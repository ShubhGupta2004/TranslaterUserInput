package com.example.translateruserinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.list);
        ArrayList<dataSetter> arrayList = utilizePortion.extractData(0);
        adapter1 adapter = new adapter1(MainActivity.this,arrayList);
        listView.setAdapter(adapter);
    }
    public void fam(View v){
        ArrayList<dataSetter> arrayList = utilizePortion.extractData(0);
        adapter1 adapter = new adapter1(MainActivity.this,arrayList);
        listView.setAdapter(adapter);
    }

    public void parts(View v){
        ArrayList<dataSetter> arrayList = utilizePortion.extractData(1);
        adapter1 adapter = new adapter1(MainActivity.this,arrayList);
        listView.setAdapter(adapter);
    }

    public void Phrases(View v){
        ArrayList<dataSetter> arrayList = utilizePortion.extractData(2);
        adapter1 adapter = new adapter1(MainActivity.this,arrayList);
        listView.setAdapter(adapter);
    }
}