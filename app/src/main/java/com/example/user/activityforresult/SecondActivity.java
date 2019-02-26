package com.example.user.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = findViewById(R.id.editid);
    }

    public void Show(View view) {
        String s = editText.getText().toString();
        Intent intent = new Intent(SecondActivity.this,MainActivity.class);

        intent.putExtra("key",s);
        setResult(1,intent);
        finish();

    }
}
