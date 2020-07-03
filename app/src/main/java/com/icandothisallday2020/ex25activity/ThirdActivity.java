package com.icandothisallday2020.ex25activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        getSupportActionBar().setTitle("Third Activity");

        //ActionBar - 뒤로가기 화살표 기능
        //이 아이콘을 눌렀을때 돌아갈 Activity(화면)을 지정
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
