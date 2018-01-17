package com.example.android.signinwithtwittertestapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Ashraf on 1/8/18.
 */

public class HomePage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        String userName = getIntent().getStringExtra("username");
        TextView userNameTV = (TextView) findViewById(R.id.textView2);
        userNameTV.setText(userName);
    }

}



























