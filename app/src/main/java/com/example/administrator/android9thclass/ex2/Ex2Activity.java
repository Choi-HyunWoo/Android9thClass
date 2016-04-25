package com.example.administrator.android9thclass.ex2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.android9thclass.R;

public class Ex2Activity extends AppCompatActivity {

    /** 복합위젯
     * MultiCheckBox 클래스
     * activity_ex2.xml
     * 참조
     */

    MultiCheckBox multiCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        multiCheckBox = (MultiCheckBox)findViewById(R.id.multiCheckBox);
        multiCheckBox.setOnMultiChangeListener(new MultiCheckBox.OnMultiChangeListner() {
            @Override
            public void onMultiChanged(boolean isFirstChecked, boolean isSecondChecked) {
                if (isFirstChecked && isSecondChecked) {
                    multiCheckBox.setBackgroundColor(Color.RED);
                } else if (isFirstChecked && !isSecondChecked) {
                    multiCheckBox.setBackgroundColor(getResources().getColor(R.color.colorYELLOW));
                } else if (!isFirstChecked && isSecondChecked) {
                    multiCheckBox.setBackgroundColor(getResources().getColor(R.color.colorORANGE));
                } else {
                    multiCheckBox.setBackgroundColor(Color.WHITE);
                }
            }
        });

    }
}
