package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String [] title;
    int []images;
    customAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       listView=findViewById(R.id.listView);
        title = new String[]{"Alif","Dil Lagi","Ye Dil Mera","Dastaan","Mere pas tum ho"};
        images=new int[]{R.drawable.drama1,R.drawable.drama2,R.drawable.drama3,R.drawable.drama4,R.drawable.drama5};
       customAdapter=new customAdapter(MainActivity.this,title,images);
       listView.setAdapter(customAdapter);
    }

    private void openActivity2() {
        Intent intent = new Intent(this,second.class);
        startActivity(intent);
    }
}

