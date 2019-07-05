package com.hachicore.demospring51;

import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface PerLogging {
}
