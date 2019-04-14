package com.mittens.mit.edvest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "leaving Main Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tempBtn = findViewById(R.id.temp_button);

        // Todo: do intent when snap chat authentication is added

        tempBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ExampleActivity.class);
                intent.putExtra(EXTRA_MESSAGE, "Hello");
                startActivity(intent);
            }
        });
    }


}
