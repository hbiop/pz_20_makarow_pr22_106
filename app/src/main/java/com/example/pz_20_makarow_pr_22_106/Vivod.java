package com.example.pz_20_makarow_pr_22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;

public class Vivod extends AppCompatActivity {
ListView listView;
ArrayAdapter <User> arrayAdapter;
DatabaseReference mDataBase;
    final String USER_KEY = "User";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivod);
        listView = findViewById(R.id.a);

    }
}