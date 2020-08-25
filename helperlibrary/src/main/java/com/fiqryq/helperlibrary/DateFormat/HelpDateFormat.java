package com.fiqryq.helperlibrary.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HelpDateFormat {

    public static String getNameDay(String language , String country) {
        Locale id = new Locale(language, country);
        String pattern = "EEEE";
        Date today = new Date();

        // Gets formatted date specify by the given pattern for
        // Indonesian Locale no changes for default date format
        // is applied here.
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, id);
        return sdf.format(today);
    }

    public static String getMonth(String language , String country) {
        Locale id = new Locale(language, country);
        String pattern = "MMMM";
        Date month = new Date();

        // Gets formatted date specify by the given pattern for
        // Indonesian Locale no changes for default date format
        // is applied here.
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, id);
        return sdf.format(month);
    }

    public static String getTimeNow(String language , String country) {
        Locale id = new Locale(language, country);
        String pattern = "EEEE, dd MMMM yyyy";
        Date today = new Date();

        // Gets formatted date specify by the given pattern for
        // Indonesian Locale no changes for default date format
        // is applied here.
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, id);
        return sdf.format(today);
    }

    public static String getHour(){
        Date dateNow = Calendar.getInstance().getTime();
        String hour = (String) android.text.format.DateFormat.format("HH:mm", dateNow);
        return hour;
    }

}
