package com.example.nguyenthanhit19.nhaccuatui.Fragment;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.nguyenthanhit19.nhaccuatui.Adapter.CustomLVAdapter;
import com.example.nguyenthanhit19.nhaccuatui.BaiHat.BaiHat;
import com.example.nguyenthanhit19.nhaccuatui.R;

import java.util.ArrayList;

public class FragmentTrangChu extends Fragment {
    private View view;
    private ArrayList<BaiHat> arrayListBaiHat;
    private ListView listTop10;
    private int i=0;
    TypedArray picBaiHat;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmenttrangchu,container,false);
        addBaiHat();
        return view;

    }

    private void addBaiHat() {
        listTop10 = (ListView) view.findViewById(R.id.listTop10);
        arrayListBaiHat = new ArrayList<BaiHat>();
        picBaiHat = getResources().obtainTypedArray(R.array.pics_casi);
        arrayListBaiHat.add(new BaiHat("Buồn Không Em","Đạt G",picBaiHat.getResourceId(i++,-1)));
        arrayListBaiHat.add(new BaiHat("Duyên Mình Lỡ","Hương Tràm",picBaiHat.getResourceId(i++,-1)));
        arrayListBaiHat.add(new BaiHat("Đừng Quên Tên Anh","Hoa Vinh",picBaiHat.getResourceId(i++,-1)));
        arrayListBaiHat.add(new BaiHat("Tận Cùng Nỗi Nhớ","Will",picBaiHat.getResourceId(i++,-1)));
        arrayListBaiHat.add(new BaiHat("Sai Người Sai Thời Điểm","Thanh Hưng",picBaiHat.getResourceId(i++,-1)));
        arrayListBaiHat.add(new BaiHat("Ừ Có Anh Đây","Tino",picBaiHat.getResourceId(i++,-1)));
        arrayListBaiHat.add(new BaiHat("Đừng Như Thói Quen","Jaykii, Sara Luu",picBaiHat.getResourceId(i++,-1)));
        arrayListBaiHat.add(new BaiHat("Lỡ Thương Một Người","Nguyễn Đình Vũ",picBaiHat.getResourceId(i++,-1)));
        arrayListBaiHat.add(new BaiHat("Suýt Nữa Thì","Andiez",picBaiHat.getResourceId(i++,-1)));
        arrayListBaiHat.add(new BaiHat("Rời Bỏ","Hòa Minzy",picBaiHat.getResourceId(i++,-1)));

        CustomLVAdapter customLVAdapter = new CustomLVAdapter(getActivity(),R.layout.item_listtop10,arrayListBaiHat);
        listTop10.setAdapter(customLVAdapter);

    }
}
