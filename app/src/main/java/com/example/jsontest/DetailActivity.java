package com.example.jsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.jsontest.MainActivity.EXTRA_CREATOR;
import static com.example.jsontest.MainActivity.EXTRA_LIKES;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        Intent intent = getIntent();
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);
        TextView textViewCreator = findViewById(R.id.text_view_creator_detail);
        TextView textViewLikes = findViewById(R.id.text_view_like_detail);
        textViewCreator.setText(creatorName);
        textViewLikes.setText("Likes: " + likeCount);
    }
}
