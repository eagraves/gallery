package com.example.hw_1_try3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
    
    /** Called when the user clicks the change picture button */
    public void change_Pic(View view) {
        // Do something in response to button
    	//Intent intent = new Intent(this, Other_Photos.class);
    	Intent intent = new Intent(this, GridActivity.class);
    	startActivity(intent);
    }
}