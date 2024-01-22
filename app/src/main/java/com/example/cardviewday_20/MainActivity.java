package com.example.cardviewday_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    RecyclerView recyclerView;

    List<Item> itemList;

    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        itemList = new ArrayList<>();
        Item item = new Item(R.drawable.hockey, "HOCKEY");
        Item item1 = new Item(R.drawable.golf, "GOLF");
        Item item2 = new Item(R.drawable.handball, "HANDBALL");
        Item item3 = new Item(R.drawable.tennis, "TENNIS");
        Item item4 = new Item(R.drawable.grandprix, "GRANDPRIX");

        itemList.add(item);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);



        LinearLayoutManager LayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(LayoutManager);

        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);

        myAdapter.setClickListener(this);

    }

    @Override
    public void onCLick(View v, int pos) {
        Toast.makeText(this,"Clicked: "+ itemList.get(pos).itemName,Toast.LENGTH_SHORT).show();
    }
}
