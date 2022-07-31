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
                int[] bodyParts1 = {R.drawable.img_8,R.drawable.img_9, R.drawable.img_10,R.drawable.img_11,R.drawable.img_12,R.drawable.img_13,R.drawable.img_14,R.drawable.img_15,R.drawable.img_16,R.drawable.img_17,R.drawable.img_18,R.drawable.img_19,R.drawable.img_20,R.drawable.img_21,R.drawable.img_22};
                arrayList1.add(new dataSetter("head","Eye Brow",bodyParts1[0]));
                arrayList1.add(new dataSetter("stomach","Hair",bodyParts1[1]));
                arrayList1.add(new dataSetter("hands","Eyes",bodyParts1[2]));
                arrayList1.add(new dataSetter("legs","Ears",bodyParts1[3]));
                arrayList1.add(new dataSetter("head","Mouth",bodyParts1[4]));
                arrayList1.add(new dataSetter("stomach","nose",bodyParts1[5]));
                arrayList1.add(new dataSetter("hands","Teeth",bodyParts1[6]));
                arrayList1.add(new dataSetter("legs","Tongue",bodyParts1[7]));
                arrayList1.add(new dataSetter("legs","Chest",bodyParts1[8]));
                arrayList1.add(new dataSetter("legs","Arm",bodyParts1[9]));
                arrayList1.add(new dataSetter("legs","hand",bodyParts1[10]));
                arrayList1.add(new dataSetter("legs","leg",bodyParts1[11]));
                arrayList1.add(new dataSetter("legs","Foot",bodyParts1[12]));
                arrayList1.add(new dataSetter("legs","knee",bodyParts1[13]));
                arrayList1.add(new dataSetter("legs","Elbow",bodyParts1[14]));
                return arrayList1;
            case 2:
                ArrayList<dataSetter> arrayList2 = new ArrayList<>();
                int[] coloursImage2 = {R.drawable.img_23,R.drawable.img_24,R.drawable.img_25,R.drawable.img_26,R.drawable.img_27,R.drawable.img_28,R.drawable.img_29,R.drawable.img_30,R.drawable.img_31,R.drawable.img_32,R.drawable.img_33,R.drawable.img_34};
                arrayList2.add(new dataSetter("phrase","Red",coloursImage2[0]));
                arrayList2.add(new dataSetter("phrase","Orange",coloursImage2[1]));
                arrayList2.add(new dataSetter("phrase","Pink \\ Magenta",coloursImage2[2]));
                arrayList2.add(new dataSetter("phrase","Purple",coloursImage2[3]));
                arrayList2.add(new dataSetter("phrase","Violet",coloursImage2[4]));
                arrayList2.add(new dataSetter("phrase","Yellow",coloursImage2[5]));
                arrayList2.add(new dataSetter("phrase","Green",coloursImage2[6]));
                arrayList2.add(new dataSetter("phrase","Blue",coloursImage2[7]));
                arrayList2.add(new dataSetter("phrase","Grey",coloursImage2[8]));
                arrayList2.add(new dataSetter("phrase","Black",coloursImage2[9]));
                arrayList2.add(new dataSetter("phrase","White",coloursImage2[10]));
                arrayList2.add(new dataSetter("phrase","Brown",coloursImage2[11]));

                return arrayList2;
            case 3:
                ArrayList<dataSetter> arrayList3 = new ArrayList<>();
                int[] phraseImage3 = {R.drawable.img_9,R.drawable.img_8,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7};
                arrayList3.add(new dataSetter("My name is Shashwat","1",phraseImage3[0]));
                arrayList3.add(new dataSetter("My name is Khushal","1",phraseImage3[1]));
                arrayList3.add(new dataSetter("My name is shubh","1",phraseImage3[2]));
                arrayList3.add(new dataSetter("My name is Kailash","1",phraseImage3[3]));
                arrayList3.add(new dataSetter("My name is vaishnavi","1",phraseImage3[4]));
                return arrayList3;
            case 4:
                ArrayList<dataSetter> arrayList4 = new ArrayList<>();
                int[] numberImage4 = {R.drawable.img_23,R.drawable.img_24,R.drawable.img_25,R.drawable.img_26,R.drawable.img_27,R.drawable.img_28,R.drawable.img_29,R.drawable.img_30,R.drawable.img_31,R.drawable.img_32,R.drawable.img_33,R.drawable.img_34};

                return arrayList4;
            default:
                return null;
        }
    }
}
