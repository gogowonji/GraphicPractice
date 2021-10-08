package com.example.graphicpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /** AttributeSet attrs 파라메타 있는 곳에서 변수들 선언해주어야 xml파일과 연결 가능 **/
        setContentView(R.layout.activity_main);

        //public CustomView(Context context)를 활용했기 때문에 당연히 정상작동
        //setContentView(new CustomView(this));
    }
}