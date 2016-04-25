package com.example.administrator.android9thclass.ex3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.administrator.android9thclass.R;

public class Ex3Activity extends AppCompatActivity {

    /** 리스트뷰
     *
     */


    ListView listView;
    MyListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);

        listView = (ListView)findViewById(R.id.listView);
        mAdapter = new MyListAdapter();
        listView.setAdapter(mAdapter);

        
        for (int i=1; i<=50; i++) {
            mAdapter.add("List item " + i);
        }

    }
}
