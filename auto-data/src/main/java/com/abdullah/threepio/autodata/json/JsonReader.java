package com.abdullah.threepio.autodata.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Utility class to read non primitive data types including arrays, lists and JSON Parsables.
 *
 * You may not need to use this class directly, but if you want to do so to make your life easier
 * go ahead and use it.
 */
public class JsonReader {

    private final JSONObject json;

    public JsonReader(JSONObject json) {
        this.json = json;
    }

    public <T extends JsonParsable> T readJsonParsable(String name, boolean optional, JsonParsable.JsonCreator<T> creator) throws JSONException {
        JSONObject object = optional ? json.optJSONObject(name) : json.getJSONObject(name);
        if(object != null) {
            return creator.create(object);
        }
        return null;
    }

    // <editor-fold desc="Array Methods">
    public int[] readIntArray(String name, boolean optional) throws JSONException {
        JSONArray jsonArray = optional ? json.optJSONArray(name) : json.getJSONArray(name);
        if(jsonArray == null) {
            return null;
        }

        int count = jsonArray.length();
        int[] intArray = new int[count];
        for(int i = 0 ; i < count ; ++i) {
            intArray[i] = jsonArray.getInt(i);
        }
        return intArray;
    }

    public boolean[] readBoolArray(String name, boolean optional) throws JSONException {
        JSONArray jsonArray = optional ? json.optJSONArray(name) : json.getJSONArray(name);
        if(jsonArray == null) {
            return null;
        }

        int count = jsonArray.length();
        boolean[] boolArray = new boolean[count];
        for(int i = 0 ; i < count ; ++i) {
            boolArray[i] = jsonArray.getBoolean(i);
        }
        return boolArray;
    }

    public long[] readLongArray(String name, boolean optional) throws JSONException {
        JSONArray jsonArray = optional ? json.optJSONArray(name) : json.getJSONArray(name);
        if(jsonArray == null) {
            return null;
        }

        int count = jsonArray.length();
        long[] longArray = new long[count];
        for(int i = 0 ; i < count ; ++i) {
            longArray[i] = jsonArray.getLong(i);
        }
        return longArray;
    }

    public double[] readDoubleArray(String name, boolean optional) throws JSONException {
        JSONArray jsonArray = optional ? json.optJSONArray(name) : json.getJSONArray(name);
        if(jsonArray == null) {
            return null;
        }

        int count = jsonArray.length();
        double[] doubleArray = new double[count];
        for(int i = 0 ; i < count ; ++i) {
            doubleArray[i] = jsonArray.getDouble(i);
        }
        return doubleArray;
    }

    public String[] readStringArray(String name, boolean optional) throws JSONException {
        JSONArray jsonArray = optional ? json.optJSONArray(name) : json.getJSONArray(name);
        if(jsonArray == null) {
            return null;
        }

        int count = jsonArray.length();
        String[] stringArray = new String[count];
        for(int i = 0 ; i < count ; ++i) {
            stringArray[i] = jsonArray.getString(i);
        }
        return stringArray;
    }

    public <T extends JsonParsable> T[] readJsonParsableArray(String name,
                                                              boolean optional,
                                                              JsonParsable.JsonCreator<T> creator) throws JSONException {
        JSONArray jsonArray = optional ? json.optJSONArray(name) : json.getJSONArray(name);
        if(jsonArray == null) {
            return null;
        }

        int count = jsonArray.length();
        T[] array = creator.createArray(count);
        for(int i = 0 ; i < count ; ++i) {
            array[i] = creator.create(jsonArray.getJSONObject(i));
        }
        return array;
    }

    // </editor-fold>

    // <editor-fold desc="List Methods">
    public ArrayList<String> readStringArrayList(String name, boolean optional) throws JSONException {
        JSONArray jsonArray = optional ? json.optJSONArray(name) : json.getJSONArray(name);
        if(jsonArray == null) {
            return null;
        }

        int count = jsonArray.length();
        ArrayList<String> list = new ArrayList<>(count);
        for(int i = 0 ; i < count ; ++i) {
            list.add(jsonArray.getString(i));
        }
        return list;
    }

    public <T extends JsonParsable> ArrayList<T> readJsonParsableArrayList(String name, boolean optional, JsonParsable.JsonCreator<T> creator) throws JSONException {
        JSONArray jsonArray = optional ? json.optJSONArray(name) : json.getJSONArray(name);
        if(jsonArray == null) {
            return null;
        }

        int count = jsonArray.length();
        ArrayList<T> list = new ArrayList<T>(count);
        for(int i = 0 ; i < count ; ++i) {
            list.add(creator.create(jsonArray.getJSONObject(i)));
        }
        return list;
    }
    // </editor-fold>
}
