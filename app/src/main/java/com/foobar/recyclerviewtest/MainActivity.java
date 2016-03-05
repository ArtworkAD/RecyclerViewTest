package com.foobar.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ItemAdapter itemAdapter = new ItemAdapter();

        recyclerView.setAdapter(itemAdapter);
        recyclerView.requestFocus();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        for (int i = 0; i < 40; i++) {
            itemAdapter.items.add(new ItemAdapter.Item("Foo", "Bar", true));
        }

        recyclerView.getAdapter().notifyDataSetChanged();
    }
}
