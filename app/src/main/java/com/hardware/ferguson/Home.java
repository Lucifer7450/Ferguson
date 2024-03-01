package com.hardware.ferguson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bnView = findViewById(R.id.bnView);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.Home_nav) {
                    loadFrag(new Home_fragment(), false);
                } else if (id == R.id.Save_nav) {
                    loadFrag(new Save_fragment(), false);
                } else if (id == R.id.Cart_nav) {
                    loadFrag(new Cart_fragment(), false);
                } else {
                    loadFrag(new Profile_fragment(), true);
                }
                return true;
            }
        });

        bnView.setSelectedItemId(R.id.Home_nav);
    }

    public void loadFrag(Fragment fragment, boolean addToBackStack) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.container, fragment);

        if (addToBackStack)
            ft.addToBackStack(null);

        ft.commit();
    }

    @Override
    public void onBackPressed() {
        // Check if the back stack has fragments
        FragmentManager fm = getSupportFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            // Pop the fragment from the back stack
            fm.popBackStack();
        } else {
            // If no fragments in back stack, proceed with normal back button behavior
            super.onBackPressed();
        }
    }
}
