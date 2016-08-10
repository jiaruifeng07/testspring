/*
* 文 件 名:  AppConfig.java
* 版    权:  xxxx Technologies Co., Ltd. Copyright 2010-9999,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  Administrator
* 修改时间:  2016年8月10日
* 跟踪单号:  <跟踪单号>
* 修改单号:  <修改单号>
* 修改内容:  <修改内容>
*/
package com.my.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.my.dao.MyDao;
import com.my.dao.MyNewDao;
import com.my.service.MyService;

/**
 * <一句话功能简述>
 *
 * @author  贾瑞丰
 *@date  [2016年8月10日]
 */
@Configuration
public class AppConfig {
  @Bean
  public MyService myService() {
      return new MyService();
  }
  @Bean
  public MyDao myDao() {
      return new MyDao();
  }
  @Bean
  public MyNewDao myNewDao() {
      return new MyNewDao();
  }
}
