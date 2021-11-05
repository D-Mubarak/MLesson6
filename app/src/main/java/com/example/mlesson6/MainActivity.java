package com.example.mlesson6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.mlesson6.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

import fragments.FirstFragment;
import fragments.SecondFragment;
import fragments.UserFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container_fragment, new FirstFragment()).commit();
        binding.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        FirstFragment firstFragment = new FirstFragment();
                        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
                        ft1.replace(R.id.container_fragment, firstFragment).commit();
                        break;
                    case R.id.nav_likes:
                        SecondFragment secondFragment = new SecondFragment();
                        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                        ft2.replace(R.id.container_fragment, secondFragment).commit();
                        break;
                    case R.id.nav_user:
                        UserFragment userFragment = new UserFragment();
                        FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();
                        ft3.replace(R.id.container_fragment, userFragment).commit();
                        break;
                }
                return true;
            }

        });
    }
}