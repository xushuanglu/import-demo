package com.xsl;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: MainConfigTwo
 * DATE: 2021/1/20
 * TIME: 22:09
 * JDK 11
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName MainConfigTwo
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/20
 * @Time 22:09
 * @Version v1.0
 **/
@Import({Cricle.class,MyImportSelector.class})
@Configuration
public class MainConfigTwo {
}
