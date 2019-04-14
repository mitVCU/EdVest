package com.mittens.mit.edvest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BorrowerActivity extends AppCompatActivity {

    private TextView mTextMessage;


    BorrowerHome borrowerHomeFragment = new BorrowerHome();
    ProposalsFragment proposalsFragment = new ProposalsFragment();
    BorrowerSettingsFragment borrowerSettingsFragment = new BorrowerSettingsFragment();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag, borrowerHomeFragment).commit();
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag, proposalsFragment).commit();
                    return true;
                case R.id.navigation_user:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag, borrowerSettingsFragment).commit();
                    mTextMessage.setText(R.string.title_user);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrower);

        Intent intent = getIntent();

        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
