package com.example.administrator.android9thclass;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Ex2Activity extends AppCompatActivity {

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
