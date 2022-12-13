package com.example.obuchenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyLog","Create");
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testIntent = new Intent(MainActivity.this,zadanie2Activity.class);
                startActivity(testIntent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyLog","Destroy");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyLog","Start");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyLog","Pause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyLog","Resume");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyLog","Stop");
    }
}