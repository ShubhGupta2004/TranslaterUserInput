package com.example.translateruserinput;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

//adapter for the personalized array
public class adapter1 extends ArrayAdapter<dataSetter> {


    public adapter1(@NonNull Context context, List<dataSetter> list) {
        super(context, 0,list);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        View listView = convertView;
        if(listView==null){
            listView= LayoutInflater.from(getContext()).inflate(R.layout.list_format,parent,false);

        }

        dataSetter dataSetterCurrent = getItem(position);

        TextView name1 = listView.findViewById(R.id.name1);
        TextView name2 = listView.findViewById(R.id.name2);
        ImageView img = listView.findViewById(R.id.image1);

        name1.setText(dataSetterCurrent.getName1());
        name2.setText(dataSetterCurrent.getName2());
        img.setImageResource(dataSetterCurrent.getImg());

        return listView;
    }

}
