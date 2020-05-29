package com.dicoding.javafundamental.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("Waktu sekarang : " + calendar.getTime());
        System.out.println("Tanggal sekarang : " + calendar.get(Calendar.DATE));
        System.out.println("Bulang sekarang : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun sekarang : " + calendar.get(Calendar.YEAR));

        // 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("hari -15 " + calendar.getTime());

        // 2 bulan kedepan
        calendar.add(Calendar.MONTH, +2);
        System.out.println("bulan +2 " + calendar.getTime());

        // Simple date format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/YYYY");
        String dateTime = simpleDateFormat.format(new Date());
        System.out.println(dateTime);
    }

}
