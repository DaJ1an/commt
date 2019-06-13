/**   
 * Copyright © 2019 北京八维研修学院. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: wangzijian_lianxi
 * @Package: com.wangzijian.common.utils 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月13日 下午4:09:54 
 * @version: V1.0   
 */
package com.wangzijian.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月13日 下午4:09:54  
 */
class DateUtilTest {

  /**
   * Test method for {@link com.wangzijian.common.utils.DateUtil#yuechu(java.sql.Date)}.
   */
  @Test
  void testYuechu() {

    Date date = DateUtil.yuechu(new Date());
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String ss = s.format(date);
    System.out.println(ss);

  }

  /**
   * Test method for {@link com.wangzijian.common.utils.DateUtil#yuechu(java.sql.Date)}.
   */
  @Test
  void testYuemo() {

    Date date = DateUtil.yuemo(new Date());
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String ss = s.format(date);
    System.out.println(ss);

  }

  /**
   * Test method for {@link com.wangzijian.common.utils.DateUtil#yuechu(java.sql.Date)}.
   */
  @Test
  void testjian() {
    Integer month = 3;
    Date date = DateUtil.jian(month);
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String s = df.format(date);
    System.out.println(s);
  }

  @Test
  public void testDate() {
    Date date = DateUtil.yuechu(new Date());
    Date date2 = DateUtil.yuemo(new Date());
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}'";
    String a = sql.replace("{1}", sdf.format(date)).replace("{2}", sdf.format(date2));
    System.out.println(a);
  }
}
