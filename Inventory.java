package com.example.calsys.recyc;

public class Inventory {

    private String tutor_name;
    private String tutor_age;
//    private int dp;

    public Inventory(String name, String age) {
        this.tutor_name = name;
        this.tutor_age = age;
//        this.dp = dp;
    }

    public String getTutor_name() {
        return tutor_name;
    }

    public String getTutor_age() {
        return tutor_age;
    }
//
//    public int getdp() {
//        return dp;
//    }
}
