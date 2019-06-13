/**   
 * Copyright © 2019 北京八维研修学院. All rights reserved.
 * 
 * @Title: fileUtilTest.java 
 * @Prject: wangzijian_lianxi
 * @Package: com.wangzijian.common.utils 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月13日 下午7:53:55 
 * @version: V1.0   
 */
package com.wangzijian.common.utils;

import org.junit.jupiter.api.Test;

/** 
 * @ClassName: fileUtilTest 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月13日 下午7:53:55  
 */
class fileUtilTest {

  /**
   * Test method for {@link com.wangzijian.common.utils.fileUtil#kuozhanm(java.lang.String)}.
   */
  @Test
  void testKuozhanm() {
    System.out.println(fileUtil.kuozhanm("aaaa.jsp"));
  }

  /**
   * Test method for {@link com.wangzijian.common.utils.fileUtil#getTempDirectory()}.
   */
  @Test
  void testGetTempDirectory() {

    System.out.println(fileUtil.getTempDirectory());
  }

}
