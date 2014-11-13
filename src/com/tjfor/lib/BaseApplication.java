package com.tjfor.lib;

import android.app.Application;
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.tjfor.lib.utils.RequestManager;

/**
 * Created by TangJie on 2014/9/11.
 */
public class BaseApplication extends Application {
	public static BaseApplication instance;
	private RequestQueue mQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        
    }
    
    public RequestQueue getRequestQueue(){
    	return this.mQueue;
    }
    
}
