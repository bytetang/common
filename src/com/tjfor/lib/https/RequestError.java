package com.tjfor.lib.https;

import org.json.JSONObject;

public class RequestError {

    public static final String ERR_SYSTEM = "E001";
    public static final String ERR_NETWORK = "E002";
    public static final String ERR_RESPONSE_PARSE = "E003";
    public static final String ERR_SOCKET_TIMEOUT = "E004";
    public static final String ERR_CONNECTIION_TIMEOUT = "E005";
    public static final String ERR_NO_CONNECTION = "E006";
    public static final String ERR_SERVER = "E007";
    public static final String ERR_BUSINESS = "E008";

    private String errCode;
    private String message;
    private JSONObject originalData;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RequestError(String errCode, String message, JSONObject originalData) {
        super();
        this.errCode = errCode;
        this.message = message;
        this.originalData = originalData;
    }

    @Override
    public String toString() {
        return "RequestError [errCode=" + errCode + ", message=" + message
                + ", originalData=" + originalData == null ? "" : originalData
                + "]";
    }
}
