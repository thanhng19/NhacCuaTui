package com.example.nguyenthanhit19.nhaccuatui.BaiHat;

public class BaiHat {
    private String tenBH;
    private String caSi;
    private int picBH;

    public BaiHat(String tenBH, String caSi, int picBH) {
        this.tenBH = tenBH;
        this.caSi = caSi;
        this.picBH = picBH;
    }

    public String getTenBH() {
        return tenBH;
    }

    public void setTenBH(String tenBH) {
        this.tenBH = tenBH;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getPicBH() {
        return picBH;
    }

    public void setPicBH(int picBH) {
        this.picBH = picBH;
    }
}
