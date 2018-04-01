# 第一章 部署与搭建 - Hello

基本按照参考资料②步骤执行即可，简单提几个知识点。

1. 端口设置
2. 组件扫描

### 1. 端口设置

1. 问题：单个机器默认端口已被占用

2. 方案：

   1. 修改配置文件application.properties

      ```
      server.port=24000
      ```

   2. 重启测试

      ```bash
      curl 'http://localhost:24000/hello'
      ```

### 2. 组件扫描

1. 问题：需要将controller类放在与Application不同包下

2. 方案：

   1. 在Application类添加注解ComponentScan，值为组件扫描的包路径

      ```java
      @ComponentScan("com.next.spring.boot.demo.controller")
      @SpringBootApplication
      public class NextSpringBootDemoApplication {

          public static void main(String[] args) {
              SpringApplication.run(NextSpringBootDemoApplication.class, args);
          }
      }
      ```

   2. 重启测试

      ```bash
      curl 'http://localhost:24000'
      ```



###参考资料

>1：https://github.com/dyc87112/SpringBoot-Learning
>
>2：http://blog.didispace.com/spring-boot-learning-1/
>
>3：https://blog.csdn.net/goodelephant/article/details/52160974
>
>4：https://www.cnblogs.com/gudulijia/p/6733840.html


