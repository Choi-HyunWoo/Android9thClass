package com.example.administrator.android9thclass.ex3;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.administrator.android9thclass.R;

/**
 * Created by Administrator on 2016-04-25.
 */
public class MyListItemView extends FrameLayout {

    TextView itemName;

    public MyListItemView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.my_list_item_view, this);
        itemName = (TextView)findViewById(R.id.itemName);
    }

    public void setListItem (String name) {
        itemName.setText(name);
    }
}
