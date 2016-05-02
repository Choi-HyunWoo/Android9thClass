package com.example.administrator.android9thclass.ex3;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.android9thclass.MainActivity;
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

        final ImageView imageView = new ImageView(getApplicationContext());
        imageView.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.irene, null));
/*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Ex3Activity.this);
                builder.setPositiveButton("아이린", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Ex3Activity.this, "아이린", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                builder.setNegativeButton("아님", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.setView(imageView);
                builder.create().show();
            }
        });
*/
    }
}
