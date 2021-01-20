package com.xsl;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: MainConfigureThree
 * DATE: 2021/1/20
 * TIME: 22:26
 * JDK 11
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName MainConfigureThree
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/20
 * @Time 22:26
 * @Version v1.0
 **/
@Import({Cricle.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
@Configuration
public class MainConfigureThree {
}
