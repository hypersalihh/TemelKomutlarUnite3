package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    EditText edittext1,edittext2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        edittext1=findViewById(R.id.editTextNumber6);
        edittext2=findViewById(R.id.editTextNumber7);
        Button btn = findViewById(R.id.btnuyg10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(edittext1.getText().toString());
                int y = Integer.parseInt(edittext2.getText().toString());

                System.out.println("x 10'dan büyük ve y 10'dan küçük mü : " + (x > 20 && y < 20));
                System.out.println("x 10'dan büyük ve y 10'dan küçük mü tersi : " + !(x > 20 && y < 20));
                System.out.println("x 10'dan büyük veya y 10'dan küçük mü : " + (x > 20 || y <20));
                System.out.println("x 10'dan büyük veya y 10'dan küçük mü tersi: " + !(x > 20 || y <20));
            }
        });
    }
}
