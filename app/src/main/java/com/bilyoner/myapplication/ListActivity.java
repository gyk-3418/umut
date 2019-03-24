package com.bilyoner.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.listView);
        createItemModelList();

        adapter = new ListAdapter(createItemModelList(), this);
        listView.setAdapter(adapter);


        Button button = findViewById(R.id.buttonAddItem);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddItemActivity.class);
                startActivityForResult(intent, 10);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = data.getExtras();
        String text = bundle.getString("detailText");
        adapter.items.add(new ItemModel(text, R.drawable.common_full_open_on_phone, 0));
        adapter.notifyDataSetChanged();
    }

    public ArrayList<ItemModel> createItemModelList() {
        ArrayList<ItemModel> itemModelArrayList = new ArrayList<>();
        ItemModel itemModel1 = new ItemModel("Perfect", R.drawable.common_full_open_on_phone, 0);
        ItemModel itemModel2 = new ItemModel("Perfect", R.drawable.common_full_open_on_phone, 0);
        ItemModel itemModel3 = new ItemModel("Perfect", R.drawable.common_full_open_on_phone, 0);
        ItemModel itemModel4 = new ItemModel("Perfect", R.drawable.common_full_open_on_phone, 0);
        ItemModel itemModel5 = new ItemModel("Perfect", R.drawable.common_full_open_on_phone, 0);
        ItemModel buttonItem = new ItemModel(R.color.colorPrimary, R.color.colorAccent);
        itemModelArrayList.add(itemModel1);
        itemModelArrayList.add(itemModel2);
        itemModelArrayList.add(itemModel3);
        itemModelArrayList.add(itemModel4);
        itemModelArrayList.add(itemModel5);
        itemModelArrayList.add(buttonItem);
        return itemModelArrayList;
    }

    @Override
    protected void onDestroy() {


        super.onDestroy();
    }
}
