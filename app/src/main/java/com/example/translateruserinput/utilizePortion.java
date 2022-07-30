package com.example.translateruserinput;

import java.util.ArrayList;

public final class utilizePortion {
    private utilizePortion(){

    }

    public static ArrayList<dataSetter> extractData(int pos){
        switch (pos){
            case 0:
                ArrayList<dataSetter> arrayList=new ArrayList<>();
                arrayList.add(new dataSetter("father","1"));
                arrayList.add(new dataSetter("Mother","2"));
                arrayList.add(new dataSetter("Brother","3"));
                arrayList.add(new dataSetter("Sister","4"));
                return arrayList;
            case 1:
                ArrayList<dataSetter> arrayList1 = new ArrayList<>();
                arrayList1.add(new dataSetter("head","1"));
                arrayList1.add(new dataSetter("stomach","2"));
                arrayList1.add(new dataSetter("hands","3"));
                arrayList1.add(new dataSetter("legs","4"));
                return arrayList1;
            case 2:
                ArrayList<dataSetter> arrayList2 = new ArrayList<>();
                arrayList2.add(new dataSetter("phrase","1"));
                arrayList2.add(new dataSetter("phrase","2"));
                arrayList2.add(new dataSetter("phrase","3"));
                arrayList2.add(new dataSetter("phrase","4"));
                return arrayList2;
            default:
                return null;
        }
    }
}
