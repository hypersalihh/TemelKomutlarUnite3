package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {
    EditText edittext1,edittext2;
    


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);
        edittext1= findViewById(R.id.editTextTextMultiLine);
        edittext2= findViewById(R.id.editTextTextMultiLine2);
        Button a = findViewById(R.id.button);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = edittext1.getText().toString();
                String b = edittext1.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int toplam = x + y;
                int fark = x - y;
                int carpim = x * y;
                int bolme = x / y;
                int mod = x % y;
                x++;
                y--;
                System.out.println("Toplam: " + toplam);
                System.out.println("Fark: " + fark);
                System.out.println("Çarpım: " + carpim);
                System.out.println("Bölme: " + bolme);
                System.out.println("Mod Alma: " + mod);
                System.out.println("Artırma: " + x);
                System.out.println("Azaltma: " + y);
            }
        });


    }
}
