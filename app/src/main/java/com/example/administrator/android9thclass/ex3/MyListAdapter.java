package com.example.administrator.android9thclass.ex3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016-04-25.
 */
public class MyListAdapter extends BaseAdapter {

    ArrayList<String> items = new ArrayList<String>();

    public void add (String name) {
        items.add(name);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyListItemView view = null;
        if (convertView != null) {
            view = (MyListItemView)convertView;
        } else {
            view = new MyListItemView(parent.getContext());
        }
        view.setListItem(items.get(position));
        return view;
    }
}
