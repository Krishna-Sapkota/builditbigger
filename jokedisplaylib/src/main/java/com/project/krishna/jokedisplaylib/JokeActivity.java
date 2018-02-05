package com.project.krishna.jokedisplaylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String EXTRA_JOKE = "extra_joke";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        String joke = getIntent().getStringExtra(EXTRA_JOKE);
        TextView jokeView = (TextView) findViewById(R.id.tv_joke);
        jokeView.setText(joke);

    }
}
