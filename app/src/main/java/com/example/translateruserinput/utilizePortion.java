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
                arrayList.add(new dataSetter("Großvater","Grandfather",familyImage[0]));
                arrayList.add(new dataSetter("Oma","Grandmother",familyImage[1]));
                arrayList.add(new dataSetter("Vater","Father",familyImage[2]));
                arrayList.add(new dataSetter("Mutter","Mother",familyImage[3]));
                arrayList.add(new dataSetter("Bruder","Brother",familyImage[4]));
                arrayList.add(new dataSetter("Schwester","Sister",familyImage[5]));
                arrayList.add(new dataSetter("Cousine","Cousin",familyImage[6]));
                arrayList.add(new dataSetter("Onkel","Uncle",familyImage[7]));
                arrayList.add(new dataSetter("Tante","aunt",familyImage[7]));
                arrayList.add(new dataSetter("Geschwister","sibling",familyImage[7]));
                arrayList.add(new dataSetter("Ehefrau","Wife",familyImage[7]));
                arrayList.add(new dataSetter("Sohn","Son",familyImage[7]));
                arrayList.add(new dataSetter("Tochter","Daughter",familyImage[7]));
                return arrayList;
            case 1:
                ArrayList<dataSetter> arrayList1 = new ArrayList<>();
                int[] bodyParts1 = {R.drawable.img_8,R.drawable.img_9, R.drawable.img_10,R.drawable.img_11,R.drawable.img_12,R.drawable.img_13,R.drawable.img_14,R.drawable.img_15,R.drawable.img_16,R.drawable.img_17,R.drawable.img_18,R.drawable.img_19,R.drawable.img_20,R.drawable.img_21,R.drawable.img_22};
                arrayList1.add(new dataSetter("Augenbraue","Eyebrow",bodyParts1[0]));
                arrayList1.add(new dataSetter("Magen","Hair",bodyParts1[1]));
                arrayList1.add(new dataSetter("Hände","Eyes",bodyParts1[2]));
                arrayList1.add(new dataSetter("Beine","Ears",bodyParts1[3]));
                arrayList1.add(new dataSetter("Mund","Mouth",bodyParts1[4]));
                arrayList1.add(new dataSetter("Nase","nose",bodyParts1[5]));
                arrayList1.add(new dataSetter("Nase","Teeth",bodyParts1[6]));
                arrayList1.add(new dataSetter("Zunge","Tongue",bodyParts1[7]));
                arrayList1.add(new dataSetter("Truhe","Chest",bodyParts1[8]));
                arrayList1.add(new dataSetter("Arm","Arm",bodyParts1[9]));
                arrayList1.add(new dataSetter("Hand","hand",bodyParts1[10]));
                arrayList1.add(new dataSetter("Bein","leg",bodyParts1[11]));
                arrayList1.add(new dataSetter("Fuß","Foot",bodyParts1[12]));
                arrayList1.add(new dataSetter("Knie","knee",bodyParts1[13]));
                arrayList1.add(new dataSetter("Ellbogen","Elbow",bodyParts1[14]));
                return arrayList1;
            case 2:
                ArrayList<dataSetter> arrayList2 = new ArrayList<>();
                int[] coloursImage2 = {R.drawable.img_23,R.drawable.img_24,R.drawable.img_25,R.drawable.img_26,R.drawable.img_27,R.drawable.img_28,R.drawable.img_29,R.drawable.img_30,R.drawable.img_31,R.drawable.img_32,R.drawable.img_33,R.drawable.img_34};
                arrayList2.add(new dataSetter("Rot","Red",coloursImage2[0]));
                arrayList2.add(new dataSetter("Orange(farbe)","Orange(Colour)",coloursImage2[1]));
                arrayList2.add(new dataSetter("rosa","Pink \\ Magenta",coloursImage2[2]));
                arrayList2.add(new dataSetter("Violett","Purple",coloursImage2[3]));
                arrayList2.add(new dataSetter("violett","Violet",coloursImage2[4]));
                arrayList2.add(new dataSetter("gelb","Yellow",coloursImage2[5]));
                arrayList2.add(new dataSetter("grün","Green",coloursImage2[6]));
                arrayList2.add(new dataSetter("blau","Blue",coloursImage2[7]));
                arrayList2.add(new dataSetter("grau","Grey",coloursImage2[8]));
                arrayList2.add(new dataSetter("Schwarz","Black",coloursImage2[9]));
                arrayList2.add(new dataSetter("Weiß","White",coloursImage2[10]));
                arrayList2.add(new dataSetter("braun","Brown",coloursImage2[11]));

                return arrayList2;
            case 3:
                ArrayList<dataSetter> arrayList3 = new ArrayList<>();
                int[] phraseImage3 = {R.drawable.img_9,R.drawable.img_8,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7};
                arrayList3.add(new dataSetter("Wo gehst du hin?","Where are you going?",phraseImage3[0]));
                arrayList3.add(new dataSetter("Hallo, schön dich kennen zu lernen.","hello nice to meet you.",phraseImage3[1]));
                arrayList3.add(new dataSetter("wie kann ich dir helfen?","how may i help you?",phraseImage3[2]));
                arrayList3.add(new dataSetter("Hey, darf ich dir einen Kaffee ausgeben?","hey ,may I buy you a coffee.",phraseImage3[3]));
                arrayList3.add(new dataSetter("Guten Morgen, haben Sie einen faszinierenden Tag","Good Morning,have fascinating Day",phraseImage3[4]));
                arrayList3.add(new dataSetter("Guten Abend, lass uns heute Abend zum Abendessen gehen","Good Evening,Let's go to the dinner Tonight",phraseImage3[4]));
                arrayList3.add(new dataSetter("gestern haben wir uns richtig getroffen!","yesterday we met right!",phraseImage3[4]));
                return arrayList3;
            case 4:
                ArrayList<dataSetter> arrayList4 = new ArrayList<>();
                int[] numberImage4 = {R.drawable.img_35,R.drawable.img_36,R.drawable.img_37,R.drawable.img_38,R.drawable.img_39,R.drawable.img_40,R.drawable.img_41,R.drawable.img_42,R.drawable.img_43,R.drawable.img_44};
                arrayList4.add(new dataSetter("eines","One",numberImage4[0]));
                arrayList4.add(new dataSetter("zwei","Two",numberImage4[1]));
                arrayList4.add(new dataSetter("drei","Three",numberImage4[2]));
                arrayList4.add(new dataSetter("Vier","Four",numberImage4[3]));
                arrayList4.add(new dataSetter("Fünf","Five",numberImage4[4]));
                arrayList4.add(new dataSetter("Sechs","Six",numberImage4[5]));
                arrayList4.add(new dataSetter("Sieben","Seven",numberImage4[6]));
                arrayList4.add(new dataSetter("Acht","Eight",numberImage4[7]));
                arrayList4.add(new dataSetter("Neun","Nine",numberImage4[8]));
                arrayList4.add(new dataSetter("Zehn","Ten",numberImage4[9]));
                return arrayList4;
            default:
                return null;
        }
    }
}
