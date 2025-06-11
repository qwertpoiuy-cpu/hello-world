package com.example.day02;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private BottomNavigationView bottomNavigationView;
    private boolean userSelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        viewPager = findViewById(R.id.viewPager);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        // 底部导航点击 -> 切换 ViewPager 页面
        bottomNavigationView.setOnItemSelectedListener(item -> {
            userSelected = true;
            int itemId = item.getItemId();

            if (itemId == R.id.nav_home) {
                viewPager.setCurrentItem(0);
                return true;
            } else if (itemId == R.id.nav_dashboard) {
                viewPager.setCurrentItem(1);
                return true;
            } else if (itemId == R.id.nav_notifications) {
                viewPager.setCurrentItem(2);
                return true;
            }

            return false;
        });

        // ViewPager 滑动 -> 改变 BottomNavigationView 高亮
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if (!userSelected) {
                    switch (position) {
                        case 0:
                            bottomNavigationView.setSelectedItemId(R.id.nav_home);
                            break;
                        case 1:
                            bottomNavigationView.setSelectedItemId(R.id.nav_dashboard);
                            break;
                        case 2:
                            bottomNavigationView.setSelectedItemId(R.id.nav_notifications);
                            break;
                    }
                }
                userSelected = false;
            }
        });



    }


}