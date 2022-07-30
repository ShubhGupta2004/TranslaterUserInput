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

        listView=findViewById(R.id.list);

        ArrayList<String> str = new ArrayList<>(3);
        str.add("hello");
        str.add("helo");
        str.add("hllo");
        str.add("ello");
        str.add("hell");
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.listsize,ar);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,str);
        listView.setAdapter(arrayAdapter);

        textView= findViewById(R.id.faimly);



    }
    public void fam(View v){
        ArrayList<String> str = new ArrayList<>(3);
        str.add("23");
        str.add("helo");
        str.add("90");
        str.add("ello");
        str.add("hell");
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.listsize,ar);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,str);
        listView.setAdapter(arrayAdapter);

    }

    public void parts(View v){
        ArrayList<String> str = new ArrayList<>(3);
        str.add("1");
        str.add("2");
        str.add("3");
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.listsize,ar);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,str);
        listView.setAdapter(arrayAdapter);

    }
}