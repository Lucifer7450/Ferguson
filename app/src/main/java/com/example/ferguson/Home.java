package com.example.ferguson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    BottomNavigationView bnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bnView=findViewById(R.id.bnView);

        bnView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                int id =item.getItemId();

                if(id==R.id.Home_nav)
                {
                    loadFrag(new Home_fragment(), true);
                }
                else if(id==R.id.Save_nav)
                {
                    loadFrag(new Save_fragment(),false);
                }
                else if (id==R.id.Cart_nav)
                {
                    loadFrag(new Cart_fragment(),false);
                }
                else
                {
                    loadFrag(new Profile_fragment(),false);
                }

            }
        });
        bnView.setSelectedItemId(R.id.Home_nav);
    }
    public  void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag)
            ft.add(R.id.container, fragment);
        else
            ft.replace(androidx.constraintlayout.widget.R.id.constraint,fragment);
        ft.commit();
    }

}