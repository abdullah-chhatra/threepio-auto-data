package com.abdullah.threepio.autodata.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a filed to be included in the JSON object.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface JsonField {

    /**
     * Optional name of the json field. If not present the name of the JSON filed will be
     * used as per the code generation option 'jsonParsableKeyCase'.
     */
    String key() default "";

    /**
     * Marks this field as optional. In case of primitive filed in absence of value
     * <code>defaultValue</code> will be used or if <code>defaultValue</code> is not present then
     * 0 will be used to populate the field.
     *
     * In case of objects <code>null</code> will be assigned to the field.
     */
    boolean optional() default false;

    /**
     * Default value in case of primitive or String field.
     */
    String defaultValue() default "";
}
