package com.xsl;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: MyImportSelector
 * DATE: 2021/1/20
 * TIME: 22:07
 * JDK 11
 */

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MyImportSelector
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/20
 * @Time 22:07
 * @Version v1.0
 **/
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.xsl.Triangle"};
    }
}
