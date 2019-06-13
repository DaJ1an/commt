/**   
 * Copyright © 2019 北京八维研修学院. All rights reserved.
 * 
 * @Title: DateUtil.java 
 * @Prject: wangzijian_lianxi
 * @Package: com.wangzijian.common.utils 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月13日 下午3:55:00 
 * @version: V1.0   
 */
package com.wangzijian.common.utils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: DateUtil 
 * @Description: 日期工具类 可以返回月初月末
 * @author: 大建
 * @date: 2019年6月13日 下午3:55:00  
 */
public class DateUtil {
  public static Date yuechu(Date date) {
    //获取当前的日期
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    //设置日期
    c.set(Calendar.DAY_OF_MONTH, 1);
    c.set(Calendar.HOUR_OF_DAY, 0);
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);

    return c.getTime();
  }

  public static Date yuemo(Date date) {
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.add(Calendar.MONTH, 1);
    c.set(Calendar.DAY_OF_MONTH, 1);
    c.set(Calendar.HOUR_OF_DAY, 0);
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);
    c.add(Calendar.SECOND, -1);
    return c.getTime();
  }

  public static Date jian(Integer month) {
    Calendar c = Calendar.getInstance();
    c.add(Calendar.MONTH, -month);
    return c.getTime();

  }
}
