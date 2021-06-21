package com.example.demolifeactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "First Activity";
    private int REQUEST_CODE = 1000;
    Button btnClick;
    TextView tvLesson;
    private int mLesson = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btnClick);
        tvLesson = findViewById(R.id.tvLesson);
        // nghich linh tinh 1
        // nghich linh tinh 2


//        if(savedInstanceState!=null){
//            mLesson = savedInstanceState.getInt("mLess");
//            setMess();
//        }

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
//                mLesson++;
//                btnClick.setBackgroundColor(Color.YELLOW);
//                setMess();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("mLess", tvLesson.getText());
                startActivityForResult(intent, REQUEST_CODE);

            }
        });

        Log.d(TAG, "onCreate1");
    }

//    private void setMess() {
//        tvLesson.setText("Bai hoc:" + mLesson);
//    }


//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt("mLess", mLesson);
//
//
//    }

//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//
//        mLesson = savedInstanceState.getInt("mLess");
//        setMess();
//
//    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == MainActivity2.RESULT_CODE && data != null) {
            tvLesson.setText(data.getStringExtra("dataEdit"));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResum1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy1");
    }
}
