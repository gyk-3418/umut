package com.bilyoner.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends BaseAdapter {

    public ArrayList<Category> itemList = new ArrayList<>();
    public Context context;

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = View.inflate(
                context, R.layout.category_item, null);

        TextView textViewTitle = view.findViewById(R.id.textViewTitle);
        TextView textViewQuantity = view.findViewById(R.id.textViewQuantity);
        ImageView imageViewLogo = view.findViewById(R.id.imageViewLogo);

        textViewTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);

                context.startActivity(intent);
            }
        });

        Category currentItem = itemList.get(position);

        textViewTitle.setText(currentItem.title);
        textViewQuantity.setText(String.valueOf(currentItem.quantity));
        imageViewLogo.setImageResource(currentItem.logo);


        return view;
    }
}
