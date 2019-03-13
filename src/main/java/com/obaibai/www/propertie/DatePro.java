package com.obaibai.www.propertie;

import java.util.Date;

public class DatePro {

    /*private Long id;*/

    private Date date;

    private Long id;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DatePro{"+"date=" + date +
                '}';
    }
}
