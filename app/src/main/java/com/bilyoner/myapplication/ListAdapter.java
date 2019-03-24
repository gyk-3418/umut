package com.bilyoner.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    public ArrayList<ItemModel> items;
    public Context context;

    public ListAdapter(ArrayList<ItemModel> items, Context context) {
        this.items = items;
        this.context = context;
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

        final ItemModel item = items.get(position);
        final View view;
        if (item.imageResouce != 0) {
            view = View.inflate(context, R.layout.list_item, null);
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView textView = view.findViewById(R.id.textView);

            imageView.setImageResource(items.get(position).imageResouce);
            textView.setText(items.get(position).text);
        } else { //if (item.firstButtonColor != 0) {
            view = View.inflate(context, R.layout.button_item, null);
            Button buttonLeft = view.findViewById(R.id.buttonLeft);
            Button buttonRight = view.findViewById(R.id.buttonRight);

            buttonLeft.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    view.setBackgroundResource(item.firstButtonColor);
                }
            });

            buttonRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    view.setBackgroundResource(item.secondButtonColor);
                }
            });

        }
        return view;
    }

}
