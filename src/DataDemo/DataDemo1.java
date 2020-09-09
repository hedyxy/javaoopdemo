package DataDemo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;


public class DataDemo1 {
    public static void main(String[] args) throws ParseException {
        Date data = new Date();
        System.out.println(data);//
        System.out.println(data.getTime());//获得时间戳
        DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = dataFormat.format(data);//日期转换为规定的字符串格式
        System.out.println(str);//
        Date d1 = dataFormat.parse("2010-10-10 20:20:20");// 将字符串转日期
        System.out.println(d1);//Sun Oct 10 20:20:20 CST 2010
        //获取的当前系统的时间
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //设置指定时间的日历类
        calendar.setTime(d1);
        System.out.println(calendar.get(calendar.YEAR));


    }
}
