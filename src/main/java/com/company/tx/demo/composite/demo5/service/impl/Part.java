package com.company.tx.demo.composite.demo5.service.impl;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Author: Tangxuan
 * @Date: 2020/4/5 14:32
 */
@Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD,
        java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE,
        java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier(Constants.PART)
public @interface Part {
}
