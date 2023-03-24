package com.improve10x.zomato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ZomatoActivity extends AppCompatActivity {
    RecyclerView zomatoRv;
    ZomatoItems[] zomatoItems;
    ZomatoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zomato);
        initViews();
        createData();
        setUpAdapter();
        connectAdapter();
    }

    private void initViews() {
        zomatoRv = findViewById(R.id.zomato_rv);

    }

    private void connectAdapter() {
        zomatoRv.setLayoutManager(new GridLayoutManager(this,1));
        zomatoRv.setAdapter(adapter);
    }

    private void setUpAdapter() {
        adapter = new ZomatoAdapter(zomatoItems);
    }

    private void createData() {
        zomatoItems  = new ZomatoItems[2];
        ZomatoItems item1 = new ZomatoItems();
        item1.poster = "https://www.indianhealthyrecipes.com/wp-content/uploads/2022/02/hyderabadi-biryani-recipe-chicken.jpg";
        item1.cost = "₹150 for one";
        item1.rate = "4.5";
        item1.time = "12min";
        zomatoItems[0] = item1;

        ZomatoItems item2 = new ZomatoItems();
        item2.poster = "https://www.pinkvilla.com/imageresize/biryani_dos_and_donts_follow_these_chef_approved_ways_to_make_a_perfect_biryani_main.jpg?width=752&t=pvorg";
        item2.cost = "₹250 for one";
        item2.rate = "4.2";
        item2.time = "32min";
        zomatoItems[1] = item2;
    }
}