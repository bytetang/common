package com.tjfor.lib.exception;

import org.json.JSONObject;


/**
 * Created by Administrator on 2014/9/16.
 */
public class ParseJsonException extends Exception {
	private JSONObject jsonData;
    private String code;
    private String message;

    public ParseJsonException(String code,String message,JSONObject json){
        this.jsonData = json;
        this.code = code;
        this.message = message;
    }


    public JSONObject getJsonData() {
        return jsonData;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "---Exception--code:"+code+",message:"+message;
    }
}
