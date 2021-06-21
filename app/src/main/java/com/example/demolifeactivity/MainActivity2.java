package com.example.demolifeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "Activity2";
    public static int RESULT_CODE = 1001;
    Button btnFinish;
    EditText edtActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnFinish = findViewById(R.id.btnFinish);
        edtActivity2 = findViewById(R.id.edtActivity2);

        Intent intent = getIntent();
        String mLess = intent.getStringExtra("mLess");
        edtActivity2.setText(mLess);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Log.d(TAG, "onCreate2");
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("dataEdit", edtActivity2.getText().toString());
        setResult(RESULT_CODE, intent);
        super.finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy2");
    }
}