package com.example.calculator;

import java.util.Date;

public class CalObject {
    String sResult;
    String date;

    public CalObject(String sResult) {
        this.sResult = sResult;

    }
    public CalObject() {}

    public String getsResult() {
        return sResult;
    }

    public void setsResult(String sResult) {
        this.sResult = sResult;
    }


}
