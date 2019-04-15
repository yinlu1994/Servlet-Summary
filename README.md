# Servlet-Summary
总结servlet的体系结构
## servlet的体系结构 
Servlet--->GenericServlet--->HttpServlet
### servlet常用方法：servlet:接口
  * void init(ServletConfig config)：初始化
  * void service(ServletRequest request,ServletResponse response):服务 处理业务逻辑
  * void destroy():销毁
  * String getServletName():获取当前servlet（web.xml中servlet-name）的名称
### GenericServlet常用方法：DenericServlet:抽象类
  * 上面四个方法，除了service方法没有显示，其他都实现了
  * 空参的 `init()`,若我们自己相对Servlet进行初始化操作，重写这个init()方法即可
### HttpServlet常用方法:HttpServlet抽象类
  * service()做了实现，把参数强转，调用了重载的service方法,重载的service方法获取请求的方式，根据请求的方式的不通调用相应的doxxx()方法
  * doGet():处理get请求的逻辑
  * doPost()：处理post请求的逻辑（只有表单提交的时候把method设置成post的时候）
### servlet生命周期***
  * void init(ServletConfig config)：初始化
  * void service(ServletRequest request,ServletResponse response):服务 处理业务逻辑
  * void destroy():销毁
  * servlet生命周期demo
    * 新建.class继承Servlet接口
    * 配置web.xml文件`<servlet></servlet>``<servlet-mapping></servlet-mapping>`
    * 具体方法，详见LifeServlet.java
    * `serlvet是单实例多线程：默认第一次访问的时候，服务器创建Servlet,并调用init实现初始化操作，并调用一次service方法，每当请求来的时候，服务器创建一个线程，调用servlet方法执行自己的业务逻辑，当servlet被移除的时候服务器正常关闭的时候，服务器调用servlet的destroy方法实现销毁操作。`
### url-pattern的配置
  * 完全匹配：/a/b  
  > 目录名匹配 /a/b/*  
  > 后缀名匹配 *.jsp  
  * 一个路径对应一个servlet，一个servlet可以对应多个路径
  * 在servlet标签有一个子标签`<load-on-startup>1</load-on-startup>`
  * 作用：用来修改servlet的初始化时机，当项目启动的时候，需要对一些初始化操作，在服务器启动时实现初始化操作
  * 取值：正整数（值越大，优先级越低）
### defaultservlet:tomcat的web.xml（404/500）(F:\javaTools\apache-tomcat-8.5.39-windows-x64\apache-tomcat-8.5.39\conf)
  * 当我们的配置文件没有指定的配置的话，会查找tomcat的web.xml,若清秀我们的项目处理不了，tomcat的默认的servlet会帮我们处理信息
### 路径的写法
* 相对路径：
  * 当前路径：./ 或者什么都不写
  * 上一级路径： ../
* 绝对路径：
  * 带主机和协议的绝对路径：访问站外资源http://www.baidu.com/xxx http://localhost:80/servlet/hello
  * 不带主机和协议的绝对路径：/servlet/hello(经常使用) 
  
