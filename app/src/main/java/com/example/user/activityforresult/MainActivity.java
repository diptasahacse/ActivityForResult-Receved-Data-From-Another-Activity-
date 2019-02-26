package com.example.user.activityforresult;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonid);
        textView = findViewById(R.id.resultid);


    }

    public void Show(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivityForResult(intent,1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String s = data.getStringExtra("key");
        textView.setText(s);

        super.onActivityResult(requestCode, resultCode, data);
    }
}
