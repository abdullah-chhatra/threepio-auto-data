package com.abdullah.threepio.autodata.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Utility class to write non primitive data types including arrays, lists and JSON Parsables.
 *
 * You may not need to use this class directly, but if you want to do so to make your life easier
 * go ahead and use it.
 */
public class JsonWriter {
    private final JSONObject json;

    public JsonWriter(JSONObject json) {
        this.json = json;
    }

    public <T extends JsonParsable> void write(String name, T value, boolean optional) throws JSONException {
        Utils.checkValue(name, value, optional);
        json.put(name, value.toJson());
    }

    // <editor-fold desc="Array Methods">
    public void write(String name, int[] value, boolean optional) throws JSONException {
        Utils.checkValue(name, value, optional);
        JSONArray array = new JSONArray();
        for(int i : value) {
            array.put(i);
        }
        json.put(name, array);
    }

    public void write(String name, boolean[] value, boolean optional) throws JSONException {
        Utils.checkValue(name, value, optional);
        JSONArray array = new JSONArray();
        for(boolean i : value) {
            array.put(i);
        }
        json.put(name, array);
    }

    public void write(String name, long[] value, boolean optional) throws JSONException {
        Utils.checkValue(name, value, optional);
        JSONArray array = new JSONArray();
        for(long i : value) {
            array.put(i);
        }
        json.put(name, array);
    }

    public void write(String name, double[] value, boolean optional) throws JSONException {
        Utils.checkValue(name, value, optional);
        JSONArray array = new JSONArray();
        for(double i : value) {
            array.put(i);
        }
        json.put(name, array);
    }

    public void write(String name, String[] value, boolean optional) throws JSONException {
        Utils.checkValue(name, value, optional);
        JSONArray array = new JSONArray();
        for(String i : value) {
            array.put(i);
        }
        json.put(name, array);
    }

    public <T extends JsonParsable> void write(String name, T[] value, boolean optional) throws JSONException {
        Utils.checkValue(name, value, optional);
        JSONArray array = new JSONArray();
        for(JsonParsable i : value) {
            array.put(i.toJson());
        }
        json.put(name, array);
    }
    // </editor-fold>

    // <editor-fold desc="List Methods">
    public void writeStringList(String name, List<String> value, boolean optional) throws JSONException {
        Utils.checkValue(name, value, optional);
        JSONArray array = new JSONArray();
        for(String i : value) {
            array.put(i);
        }
        json.put(name, array);
    }

    public <T extends JsonParsable> void writeJsonParsableList(String name, List<T> value, boolean optional) throws JSONException {
        Utils.checkValue(name, value, optional);
        JSONArray array = new JSONArray();
        for(JsonParsable i : value) {
            array.put(i.toJson());
        }
        json.put(name, array);
    }
    // </editor-fold>
}
