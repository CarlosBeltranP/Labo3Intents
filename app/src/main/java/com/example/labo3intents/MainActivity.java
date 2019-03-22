package com.example.labo3intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.labo3intents.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = ".MainA";
    private Button mButton;
    private Button mButtonShare;


    @Override
    //Serializable
    //Paracelable
    //Bundle
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.btn_send);
        mButtonShare=findViewById(R.id.btn_share);
        mButton.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, "Hola, NewActivity");
            startActivity(mIntent);
        });
        mButtonShare.setOnClickListener(v->{
            Intent mIntent=new Intent();
            mIntent.setAction((Intent.ACTION_SEND));
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, "FC Barcelona");
            startActivity(mIntent);

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "OnDestroy");


    }

}
