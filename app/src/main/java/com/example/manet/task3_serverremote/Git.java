package com.example.manet.task3_serverremote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Git extends AppCompatActivity {

    private static final int TWO = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git);
    }

    public void showMessage(View view){
        Toast.makeText(this, String.valueOf(TWO), Toast.LENGTH_SHORT).show();
    }
}
