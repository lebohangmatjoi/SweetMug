package com.example.admin.sweetmug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Admin on 7/13/2017.
 */

public class Welcome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffee);

        Button coffee = (Button) findViewById(R.id.coffee);
       coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openWelcome = new Intent(Welcome.this,MainActivity.class);
                startActivity(openWelcome);

            }
        });
    }
}
