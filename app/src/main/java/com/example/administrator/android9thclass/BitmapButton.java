package com.example.administrator.android9thclass;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-04-25.
 */

/** Custom Button !
 *
 *  ★★★★★ Custom 뷰를 만들 때에는 반드시 생성자를 두개 만들 것 ★★★★★
 */
public class BitmapButton extends Button {

    // ★★★★★ new를 이용하여 이 뷰를 만들 때 호출 ★★★★★
    public BitmapButton(Context context) {
        super(context);
        init();
    }

    // ★★★★★ XML을 이용하여 이 뷰를 만들 때 호출 ★★★★★
    public BitmapButton(Context context, AttributeSet attrs) {      // Attribute (속성 set)
        super(context, attrs);
        init();

        String str = "";
        for (int i=0; i<attrs.getAttributeCount(); i++) {
            str+="<"+attrs.getAttributeName(i)+">";
        }
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

    private void init() {
        setBackgroundResource(R.drawable.arrow_left_normal);        // 처음엔 이 Background로 설정

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN :
                setBackgroundResource(R.drawable.arrow_left_clicked);
                break;
            case MotionEvent.ACTION_UP :
                setBackgroundResource(R.drawable.arrow_left_normal);
                break;
        }
        return super.onTouchEvent(event);
    }
}
