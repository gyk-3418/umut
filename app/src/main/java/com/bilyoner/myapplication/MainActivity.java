package com.bilyoner.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listViewCategory);

        CategoryAdapter adapter = new CategoryAdapter();
        adapter.itemList = createCategoryList();
        adapter.context = this;

        listView.setAdapter(adapter);



    }

    private ArrayList<Category> createCategoryList() {
        Category c1 = new Category("Elektronik", R.drawable.icon, 4);
        Category c2 = new Category("Beyaz Esya", R.drawable.icon, 1);
        Category c3 = new Category("Otomobil", R.drawable.icon, 0);
        Category c4 = new Category("Kiyafet", R.drawable.icon, 10);

        ArrayList<Category> list = new ArrayList<Category>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        return list;
    }
}
