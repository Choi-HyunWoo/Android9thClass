package com.example.administrator.android9thclass;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016-04-25.
 */
public class MultiCheckBox extends LinearLayout {

    // 이 뷰를 소유한 객체(Has-a)에게
    // 두 개의 체크박스를 동시에 감지할 수 있는 리스너를
    // 인터페이스로 정의해두자
    public interface OnMultiChangeListner {
        public void onMultiChanged (boolean isBananaChecked, boolean isOrangeChecked);   // 두개의 체크박스가 변화하는것을 동시에 감지하는 리스너를 만들 것.
    }

    // 외부에서 이 뷰에게 리스너를 할당할 수 있는 메소드
    public void setOnMultiChangeListener (OnMultiChangeListner listener) {              // 외부에서 호출되어 listener를 할당
        this.listener = listener;
    }

    // 이 뷰의 listener 객체
    OnMultiChangeListner listener;

    /** <Has-a interface 구현>
     * 이 인터페이스는 외부에서 new로 객체가 만들어져서
     * setOnMultiChangeListener() 메소드가 외부에서 호출.
     * 이 뷰의 listener 객체와 대응됨.
     */


    CheckBox check_banana;
    CheckBox check_orange;

    public MultiCheckBox(Context context) {
        super(context);
        init();
    }

    public MultiCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.multi_checkbox, this);

        check_banana = (CheckBox)findViewById(R.id.check_banana);
        check_orange  = (CheckBox)findViewById(R.id.check_mango);

        check_banana.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {      // 특정 조건을 만족할 때
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (listener != null) {
                    listener.onMultiChanged(isChecked, check_orange.isChecked());                    // 이 뷰를 소유한 객체에게 listener 객체를 통해 onMultiChanged() 의 인자로 전달
                }
            }
        });

        check_orange.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (listener != null) {
                    listener.onMultiChanged(check_banana.isChecked(), isChecked);
                }
            }
        });

    }
}
