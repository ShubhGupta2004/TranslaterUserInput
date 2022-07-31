package com.example.translateruserinput;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private TextToSpeech mTts;
    View prevView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR){
                    int result= mTts.setLanguage(Locale.getDefault());

                    if(result==TextToSpeech.LANG_MISSING_DATA
                            || result==TextToSpeech.LANG_NOT_SUPPORTED){
                        //Toast.makeText(this,"Language not supported",Toast.LENGTH_SHORT).show();
                        Log.d("error1","Language Not supported");
                    }else{
                        Log.d("error1","Done ");
                    }
                }else{
                    Log.d("error1","Language not intiated");
                }
            }
        });


        listView= findViewById(R.id.list);
        ArrayList<dataSetter> arrayList = utilizePortion.extractData(0);
        adapter1 adapter = new adapter1(MainActivity.this,arrayList);
        setAdapter(0);
        prevView=findViewById(R.id.family);


    }
    public void fam(View v){
        setAdapter(0);
        prevView.setBackgroundColor(getResources().getColor(R.color.Upper_pink));
        v.setBackgroundResource(R.drawable.uperburn);
        prevView = v;
    }

    public void parts(View v){
        setAdapter(1);
        prevView.setBackgroundColor(getResources().getColor(R.color.Upper_pink));
        v.setBackgroundResource(R.drawable.uperburn);
        prevView=v;
    }

    public void Colours(View v){
        setAdapter(2);
        prevView.setBackgroundColor(getResources().getColor(R.color.Upper_pink));
        v.setBackgroundResource(R.drawable.uperburn);
        prevView=v;
    }

    public void Phrases(View v) {
        setAdapter(3);
        prevView.setBackgroundColor(getResources().getColor(R.color.Upper_pink));
        v.setBackgroundResource(R.drawable.uperburn);
        prevView=v;
    }

    public void Numbers(View v) { setAdapter(4);
        prevView.setBackgroundColor(getResources().getColor(R.color.Upper_pink));
        v.setBackgroundResource(R.drawable.uperburn);
        prevView=v;
    }



    public void setAdapter(int i){
        ArrayList<dataSetter> arrayList = utilizePortion.extractData(i);
        adapter1 adapter = new adapter1(MainActivity.this,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                dataSetter currentPosition = adapter.getItem(i);
                String s1 = currentPosition.getName1();
                String s2 = currentPosition.getName2();
                speak(s1,s2);
            }
        });
    }
    private void speak(String s1,String s2){
        mTts.speak(s1,TextToSpeech.QUEUE_FLUSH,null);
        Log.d("error1","is speaking: "+mTts.isSpeaking());
        mTts.speak(s2,TextToSpeech.QUEUE_ADD,null);
        mTts.setSpeechRate(0.75f);
    }

    public void onPause(){
        if(mTts != null){
            mTts.stop();
            mTts.shutdown();
        }

        super.onPause();
    }

}