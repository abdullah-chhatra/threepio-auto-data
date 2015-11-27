package com.abdullah.threepio.autodata.json;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Implement this interface in class annotated with <code>AutoJson</code> to listen to
 * parse events for some custom processing.
 */
public interface JsonParseListener {

    /**
     * Called at the end of reading JSON while creating the object from the constructor.
     *
     * @param   in
     *          JSON from which the object is being constructed.
     *
     * @throws  JSONException
     */
    void onReadJson(JSONObject in) throws JSONException;

    /**
     * Called at the end of writing JSON from <code>JsonParsable.toJson()</code> method.
     *
     * @param   out
     *          JSON object being populated from this object.
     *
     * @throws  JSONException
     */
    void onWriteJson(JSONObject out) throws JSONException;
}
