package com.mwambali.turf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityUserProfile extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        textView =(TextView) findViewById(R.id.textViewUsername);
        Intent intent = getIntent();
        textView.setText("welcome user"+ intent.getStringExtra(LoginActivity.KEY_USERNAME));
    }

}
