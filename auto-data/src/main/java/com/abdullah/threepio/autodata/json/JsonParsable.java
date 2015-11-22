package com.abdullah.threepio.autodata.json;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * This interface will be implemented by all the generated parsable classes.
 *
 * The design in based on <code>android.os.Parcelable</code> class.
 *
 * In most cases you do not have implement this interface, the code generation tool will do
 * it for you for the classes that you mark with <code>AutoJson</code> annotation.
 */
public interface JsonParsable {

    /**
     * Converts this class into JSON representation.
     *
     * @return JSON representation of this class.
     *
     * @throws JSONException
     */
    JSONObject toJson() throws JSONException;

    /**
     * Creator interface for creation of JSON Parsable classes.
     *
     * @param <T>
     */
    interface JsonCreator<T extends JsonParsable> {

        /**
         * Creates an instance of JSON Parsable from given json object.
         *
         * @param   json
         *          JSON object to parse to create the instance.
         *
         * @return  New instance on JSON Parsable from json object.
         *
         * @throws JSONException
         */
        T create(JSONObject json) throws JSONException;

        /**
         * Creates an array of JSON Parsables.
         *
         * @param   size
         *          Size of array.
         *
         * @return  Newly created array.
         */
        T[] createArray(int size);
    }
}
