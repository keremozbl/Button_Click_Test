package com.example.profilo_deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button add,update ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add     =findViewById(R.id.button);          // butonları javaya tanıttık
        update  =findViewById(R.id.button2);        // butonları javaya tanıttık

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add.setText("BASILDI");
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add.setText("İPTAL EDİLDİ");
            }
        });
    }
}
