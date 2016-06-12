package com.litto.firechat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebase.client.Firebase;
import com.firebase.ui.auth.AuthUI;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_SIGN_IN = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_main);
        startActivityForResult(AuthUI.getInstance().
                createSignInIntentBuilder().build(),
                REQUEST_SIGN_IN);
    }
}
