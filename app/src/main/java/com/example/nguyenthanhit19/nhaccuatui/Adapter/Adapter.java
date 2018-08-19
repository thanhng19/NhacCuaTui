package com.example.nguyenthanhit19.nhaccuatui.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class Adapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> listFragment = new ArrayList<>();
    String[] title = new String[]{"Trang Chủ","Playlist","BXH","Chủ Đề"};
    public Adapter(FragmentManager fm,ArrayList<Fragment> listFragment) {
        super(fm);
        this.listFragment = listFragment;
    }

    @Override
    public Fragment getItem(int i) {
        return listFragment.get(i);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
