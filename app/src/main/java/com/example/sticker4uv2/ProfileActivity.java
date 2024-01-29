package com.example.sticker4uv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class ProfileActivity extends AppCompatActivity {

    FirebaseAuth auth;
    TextView profileText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        auth = FirebaseAuth.getInstance();
        profileText = (TextView)findViewById(R.id.textView);
    }

    public void signout(View v){
        auth.signOut();
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}