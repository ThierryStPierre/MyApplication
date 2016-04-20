package com.apprentissage.tallyhop.dbfrontest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by thierry on 09/04/16.
 */
public class JSONParser {
    JSONObject reader =null ;

    public JSONParser(String buf){
        System.out.print("JSONParser.JSONParser() buf = " + buf + "\n\n");
        try {
            reader = new JSONObject(buf);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public JSONArray getList(String str){
        System.out.print("JSONParser.getList() str = " + str + "\n\n");
        System.out.flush();
        if(reader != null)
            return reader.optJSONArray(str);
        else
            return null;
    }

}