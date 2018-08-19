package com.example.nguyenthanhit19.nhaccuatui.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nguyenthanhit19.nhaccuatui.BaiHat.BaiHat;
import com.example.nguyenthanhit19.nhaccuatui.R;

import java.util.ArrayList;
import java.util.List;

public class CustomLVAdapter extends ArrayAdapter<BaiHat> {
    private Context context;
    private int resource;
    private ArrayList<BaiHat> arrBaiHat;
    public CustomLVAdapter(@NonNull Context context, int resource, @NonNull ArrayList<BaiHat> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrBaiHat=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_listtop10,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.txtCaSi = (TextView) convertView.findViewById(R.id.txtCaSi);
            viewHolder.txtTenBH = (TextView) convertView.findViewById(R.id.txtTenBH);
            viewHolder.imgBH = (ImageView) convertView.findViewById(R.id.imgBH);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        BaiHat baiHat = arrBaiHat.get(position);
        viewHolder.txtCaSi.setText(baiHat.getCaSi());
        viewHolder.txtTenBH.setText(baiHat.getTenBH());
        viewHolder.imgBH.setImageResource(baiHat.getPicBH());
        return convertView;
    }
    public class ViewHolder{
        TextView txtTenBH;
        TextView txtCaSi;
        ImageView imgBH;
    }
}
