package annotation;

import java.lang.annotation.*;

@Myannotation
public class Test01 {
    @Myannotation
    public void test(){

    }
}
//定义一个注解
//Target表示我们的注解可以使用在哪里
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention表示我们的注解什么地方有效
@Retention(value = RetentionPolicy.RUNTIME)
//Documented表示我们的注解生成在Javadoc中
@Documented
//Inherited  子类可以继承父类的注解
@Inherited
@interface Myannotation{

}
