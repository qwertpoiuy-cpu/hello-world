package com.example.day02;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;




public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new DemoFragment2();
            case 2:
                return new DemoFragment3();
            default:
                return new DemoFragment1();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
