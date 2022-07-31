package com.example.translateruserinput;

import java.util.ArrayList;

public final class utilizePortion {
    private utilizePortion(){

    }

    public static ArrayList<dataSetter> extractData(int pos){
        switch (pos){
            case 0:
                ArrayList<dataSetter> arrayList=new ArrayList<>();
                int[] familyImage = {R.drawable.img_1,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7};
                arrayList.add(new dataSetter("father","1",familyImage[0]));
                arrayList.add(new dataSetter("Mother","2",familyImage[1]));
                arrayList.add(new dataSetter("Brother","3",familyImage[2]));
                arrayList.add(new dataSetter("Sister","4",familyImage[3]));
                arrayList.add(new dataSetter("father","5",familyImage[4]));
                arrayList.add(new dataSetter("Mother","6",familyImage[5]));
                arrayList.add(new dataSetter("Brother","7",familyImage[6]));
                arrayList.add(new dataSetter("Sister","8",familyImage[7]));
                return arrayList;
            case 1:
                ArrayList<dataSetter> arrayList1 = new ArrayList<>();
                int[] familyImage1 = {R.drawable.img_8,R.drawable.img_9,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7};
                arrayList1.add(new dataSetter("head","1",familyImage1[0]));
                arrayList1.add(new dataSetter("stomach","2",familyImage1[1]));
                arrayList1.add(new dataSetter("hands","3",familyImage1[2]));
                arrayList1.add(new dataSetter("legs","4",familyImage1[3]));
                arrayList1.add(new dataSetter("head","5",familyImage1[4]));
                arrayList1.add(new dataSetter("stomach","6",familyImage1[5]));
                arrayList1.add(new dataSetter("hands","7",familyImage1[6]));
                arrayList1.add(new dataSetter("legs","8",familyImage1[7]));
                return arrayList1;
            case 2:
                ArrayList<dataSetter> arrayList2 = new ArrayList<>();
                int[] familyImage2 = {R.drawable.img_9,R.drawable.img_8,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7};
                arrayList2.add(new dataSetter("phrase","1",familyImage2[0]));
                arrayList2.add(new dataSetter("phrase","2",familyImage2[1]));
                arrayList2.add(new dataSetter("phrase","3",familyImage2[2]));
                arrayList2.add(new dataSetter("phrase","4",familyImage2[3]));
                return arrayList2;
            case 3:
                ArrayList<dataSetter> arrayList3 = new ArrayList<>();
                int[] familyImage3 = {R.drawable.img_9,R.drawable.img_8,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7};
                arrayList3.add(new dataSetter("My name is Shashwat","1",familyImage3[0]));
                arrayList3.add(new dataSetter("My name is Khushl","1",familyImage3[1]));
                arrayList3.add(new dataSetter("My name is shubh","1",familyImage3[2]));
                arrayList3.add(new dataSetter("My name is Kailash","1",familyImage3[3]));
                arrayList3.add(new dataSetter("My name is vaishnavi","1",familyImage3[4]));
                return arrayList3;
            default:
                return null;
        }
    }
}
