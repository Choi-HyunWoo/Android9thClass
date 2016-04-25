package com.example.administrator.android9thclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /** 160425 9주차 기말범위시작

     * 0. 나인패치 (동영상 Day15-01)
     * ... 집에서 들어보시오

     * 1. 비트맵 버튼 (동영상 Day15-02~03) ★★
     *  예제 1)
     * - selector를 사용하여 normal 상태와 clicked 상태의 버튼 이미지 변화
     * - customview를 만들어서 java-code 내에서 구현하고 customview를 xml 코드를 이용하여 배치


     * 2. 복합위젯 (동영상 Day18-01~) ★★★★★
     *  예제 2)
     *  부분 화면을 위한 xml 파일을 만들고 checkbox 2개를 합친 위젯 만들어보기
     *  Has-a Interface 구현으로 Listener 만들어보기
     *  ↑↑↑↑↑
     * ★★★★★ 시험에 꼭 낼 것이다 ★★★★★
     * ... 복잡한 것은 아니고 앞서 만든 Bitmap 버튼에 onMyClick이라는 핸들러를 구현해봐라


     * 3. 리스트뷰 (스피너/갤러리/그리드뷰...) ★
     *
     *
     */

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 예제 1. 비트맵 버튼 만들기
        btn = (Button)findViewById(R.id.btn_ex1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ex1Activity.class));
            }
        });

        // 예제 2. 복합 위젯 만들기 (Has- a Interface)
        btn = (Button)findViewById(R.id.btn_ex2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ex2Activity.class));
            }
        });




    }
}
