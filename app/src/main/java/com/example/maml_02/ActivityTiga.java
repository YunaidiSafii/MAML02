package com.example.maml_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTiga extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tiga);

        TextView tv1 = findViewById(R.id.textView);
        Button btPindah1 = findViewById(R.id.button8);
        Button btPindah2 = findViewById(R.id.button9);
        btPindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(ActivityTiga.this, ActivityDua.class);
                startActivity(iPindah1);
            }
        });
        btPindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah2 = new Intent(ActivityTiga.this, MainActivity.class);
                startActivity(iPindah2);
            }
        });
    }
}