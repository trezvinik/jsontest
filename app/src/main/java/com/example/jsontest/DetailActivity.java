package com.example.jsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.jsontest.MainActivity.EXTRA_realName;
import static com.example.jsontest.MainActivity.EXTRA_PVNR;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        Intent intent = getIntent();
        String realName = intent.getStringExtra(EXTRA_realName);
        int pvNr = intent.getIntExtra(EXTRA_PVNR, 0);
        TextView textViewRealName = findViewById(R.id.text_view_realName_detail);
        TextView textViewPvNr = findViewById(R.id.text_view_PvNr_detail);
        textViewRealName.setText(realName);
        textViewPvNr.setText("" + pvNr);
    }
}
