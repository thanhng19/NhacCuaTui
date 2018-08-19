package com.example.nguyenthanhit19.nhaccuatui.MainActivity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.nguyenthanhit19.nhaccuatui.Adapter.Adapter;
import com.example.nguyenthanhit19.nhaccuatui.Fragment.FragmentBXH;
import com.example.nguyenthanhit19.nhaccuatui.Fragment.FragmentChuDe;
import com.example.nguyenthanhit19.nhaccuatui.Fragment.FragmentPlayList;
import com.example.nguyenthanhit19.nhaccuatui.Fragment.FragmentTrangChu;
import com.example.nguyenthanhit19.nhaccuatui.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp1;
    private TabLayout tabList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        // remove title
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        hideAppName();
        initView();
        addEvent();
    }

    private void addEvent() {
        ArrayList<Fragment> listFragment = new ArrayList<>();
        listFragment.add(new FragmentTrangChu());
        listFragment.add(new FragmentPlayList());
        listFragment.add(new FragmentBXH());
        listFragment.add(new FragmentChuDe());

        Adapter adapter = new Adapter(this.getSupportFragmentManager(),listFragment);
        vp1.setAdapter(adapter);
        tabList.setupWithViewPager(vp1);
    }

    private void initView() {
        vp1 = (ViewPager) findViewById(R.id.vp1);
        tabList = (TabLayout) findViewById(R.id.tabList);
    }

    private void hideAppName() {
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().hide();
        getSupportActionBar();
    }
}
