package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg11Activity extends AppCompatActivity {
    private final String TAG = "Etiket";
    private int sayi = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg11_activity);
        Log.d(TAG, "debug(hata ayıklama)");

        Button sa = findViewById(R.id.btnuyg11);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Düğmeye tıklandı");
                EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
                Log.i(TAG,"Edit Text tanımlandı");
                String s1 = editText.getText().toString();
                Log.i(TAG,"Edit Text içindeki yazı alındı");
                sayi = Integer.parseInt(s1);
                Log.i(TAG,"Yazı sayıya çevrildi");
                sayi = sayi + 2;
                Log.i(TAG,"sayıya 2 eklendi");
            }
        });
        }

    }



