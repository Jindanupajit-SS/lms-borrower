package com.smoothstack.lms.borrowermicroservice.context.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ToOne {
    Class value();
}