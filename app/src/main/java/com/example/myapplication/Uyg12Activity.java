package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg12Activity extends AppCompatActivity {
    private final String TAG = "Etiket";
    private int sayi = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg12_activity);

    }
    public void onClick(View view) {
        Log.i(TAG,"Düğmeye tıklandı");
        EditText edittext = (EditText) findViewById(R.id.editTextTextPersonName2);
        Log.i(TAG,"Edit Text tanımlandı");
        String s1 = edittext.getText().toString();
        Log.i(TAG, "Edit Text içindeki yazı alındı");
        try {
            sayi = Integer.parseInt(s1);
            Log.i(TAG,"Yazı sayıya çevrildi");
        }
        catch (Exception e){
            Log.e(TAG,"Çevirim hatası");
            sayi = 0;
        }
        finally {
            sayi = sayi + 2;
            Log.i(TAG, "(finally) sayı = " +sayi);
        }
    }
}
