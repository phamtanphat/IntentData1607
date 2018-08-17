package com.ptp.phamtanphat.intentdata1607;

import java.io.Serializable;

public class Nhanvien implements Serializable {
    String ten;
    String tuoi;

    public Nhanvien(String ten, String tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
}
