package com.mohammedal_hashedi.myebookreader;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BooklistActivity extends AppCompatActivity {

    ArrayList<String> booklist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);

      //  ActionBar bar = getActionBar();
//for color
      //  bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00C4CD")));


        booklist.add("book.epub");
        booklist.add("book1.epub");
        booklist.add("book2.epub");
        booklist.add("book3.epub");
        booklist.add("book4.epub");

        ListView listView = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,booklist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(BooklistActivity.this,MainActivity.class).putExtra("book",booklist.get(i)));
            }
        });

    }
}
