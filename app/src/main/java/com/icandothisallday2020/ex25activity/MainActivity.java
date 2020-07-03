package com.icandothisallday2020.ex25activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        //SecondActivity 를 실행하는 택배기사객체(Intent) 생성하여 요청
        Intent intent=new Intent(this,SecondActivity.class);
        //                                                └getClass():
        startActivity(intent);

        //현재 MainActivity- Second 실행이 끝나면 앱 종료
        finish();
    }

    public void click2(View view) {
        Intent intent=new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }
}
