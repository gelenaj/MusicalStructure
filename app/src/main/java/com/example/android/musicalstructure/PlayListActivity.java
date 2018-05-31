package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayListActivity extends AppCompatActivity implements View.OnClickListener{
    Button firstButton;
    Button secondButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_playlist);

        firstButton = findViewById(R.id.firstButton);
        firstButton.setOnClickListener(this);

        secondButton = findViewById(R.id.playlist);
        secondButton.setText("Home");
        secondButton.setOnClickListener(this);
    }

        public void onClick(View v) {
            switch (v.getId()){
                case R.id.firstButton:
                    Intent i = new Intent(getApplicationContext(), SearchActivity.class);
                    startActivity(i);
                    finish();
                    break;
                case R.id.playlist:
                    Intent x = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(x);
                    finish();
                    break;
                }
    }
}
