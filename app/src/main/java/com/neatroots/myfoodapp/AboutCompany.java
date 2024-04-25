package com.neatroots.myfoodapp;

import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AboutCompany extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about_company);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar != null)
        {
           actionBar.hide();
        }
        Thread thread=new Thread()  {
            public void run()   {
                try {
                    sleep(4000);

                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(AboutCompany.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        };thread.start();


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}