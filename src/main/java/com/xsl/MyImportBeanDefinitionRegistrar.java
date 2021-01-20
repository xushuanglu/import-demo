package com.xsl;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: MyImportBeanDefinitionRegistrar
 * DATE: 2021/1/20
 * TIME: 22:22
 * JDK 11
 */

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MyImportBeanDefinitionRegistrar
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/20
 * @Time 22:22
 * @Version v1.0
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry){
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Rectangle.class);
        //注册一个名字叫做rectangle的bean
        beanDefinitionRegistry.registerBeanDefinition("rectangle",rootBeanDefinition);

    }
}
