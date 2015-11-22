package com.abdullah.threepio.autodata.json;

import org.json.JSONException;

/**
 * Created by abdullah on 10/11/15.
 */
public final class Utils {

    public static final void checkValue(String name, Object value, boolean optional) throws JSONException {
        if(value == null) {
            if (!optional) {
                throw new JSONException(String.format("Required field %s should have a value", name));
            }
        }
    }
}
