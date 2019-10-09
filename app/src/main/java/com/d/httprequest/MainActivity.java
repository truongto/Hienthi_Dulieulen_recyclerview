package com.d.httprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private RecyclerView recyclerView;


    HttpGetTask httpGetTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
        recyclerView = findViewById(R.id.recyclerview);

        httpGetTask = new HttpGetTask(MainActivity.this,recyclerView);
        httpGetTask.execute("http://asian.dotplays.com/wp-json/wp/v2/posts");

    }


//    public void httpGet(View view) {
//
//        HttpGetTask httpGetTask = new HttpGetTask(textView);
//
//        httpGetTask.execute("http://asian.dotplays.com/wp-json/wp/v2/posts");
//
//    }

    public void httpPost(View view) {

        HttpPostTask httpPostTask = new HttpPostTask(textView);

        httpPostTask.equals("http://dev.parduota.com/api/search/");

    }
}
