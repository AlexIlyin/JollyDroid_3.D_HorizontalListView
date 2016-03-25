package com.alexilyin.android.a3d_horizontallistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    RecyclerView recyclerView3;
    RecyclerView recyclerView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);
        recyclerView2 = (RecyclerView) findViewById(R.id.recyclerView2);
        recyclerView3 = (RecyclerView) findViewById(R.id.recyclerView3);
        recyclerView4 = (RecyclerView) findViewById(R.id.recyclerView4);

        recyclerView1.setAdapter(new HorizontalGalleryAdapter(this, Data.image));
        recyclerView2.setAdapter(new HorizontalGalleryAdapter(this, Data.image));
        recyclerView3.setAdapter(new HorizontalGalleryAdapter(this, Data.image));
        recyclerView4.setAdapter(new HorizontalGalleryAdapter(this, Data.image));
    }
}
