package com.ncfu.pw_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean modeA = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMain = findViewById(R.id.buttonMain);
        Button buttonMode = findViewById(R.id.buttonMode);

        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modeA) {
                    Toast.makeText(MainActivity.this, "Ткачев С. Ю.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "ИНС-б-о-24-2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modeA = !modeA;

                if (modeA) {
                    Toast.makeText(MainActivity.this, "Включен режим А", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Включен режим Б", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}