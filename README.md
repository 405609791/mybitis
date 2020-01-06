# idea spring boot 整合 Mybatis 注意事项

1：注入dao层时，private UserDao userDao; 
报错Could not autowire. No beans of 'UserMapper' type found
 解决方案一：
 @Autowired 注解换成 @Resource 注解，这两个注解实现的功能是一样的，只是来源于不同的包而已:
 @Autowired来源于Spring的包，
 @Resource来源于java自带的包.


