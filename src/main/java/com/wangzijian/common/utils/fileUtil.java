/**   
 * Copyright © 2019 北京八维研修学院. All rights reserved.
 * 
 * @Title: fileUtil.java 
 * @Prject: wangzijian_lianxi
 * @Package: com.wangzijian.common.utils 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月13日 下午7:45:43 
 * @version: V1.0   
 */
package com.wangzijian.common.utils;

import java.io.File;

/** 
 * @ClassName: fileUtil 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月13日 下午7:45:43  
 */
public class fileUtil {
  /*
   * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
   */
  public static String kuozhanm(String fileName) {
    return fileName.substring(fileName.lastIndexOf("."));

  }

  /*
  * 方法2：返回操作系统临时目录(5分)
  */
  public static File getTempDirectory() {
    String file = System.getProperty("java.io.tmpdir");
    File file2 = new File(file);
    return file2;

  }

  /*
  * 方法3：返回操作系统用户目录(5分)
  * 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
  */
  public static File getUserDirectory() {
    String file = System.getProperty("user.name");
    File file2 = new File(file);
    return file2;

  }
}
