package com.mittens.mit.edvest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExampleActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "leaving Example Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        Button lenderBtn = findViewById(R.id.lend);
        Button borrowerBtn = findViewById(R.id.borrow);

        borrowerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BorrowerActivity.class);
                intent.putExtra(EXTRA_MESSAGE, "Hello BorrowerActivity");
                startActivity(intent);
            }
        });

        lenderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LenderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, "Hello LenderActivity");
                startActivity(intent);
            }
        });
    }
}
