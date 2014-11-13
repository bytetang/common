package com.tjfor.lib.utils;

import android.app.ActivityManager;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.tjfor.lib.cache.BitmapLruCache;

/**
 * Created by TangJie on 2014/9/12.
 */
public class RequestManager {

    private static RequestQueue mRequestQueue;
    private static ImageLoader mImageLoader;

    public static void init(Context context){
        mRequestQueue = Volley.newRequestQueue(context);
        int memoryClass = ((ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE)).getMemoryClass();
        int cacheSize = 1024*1024*memoryClass/8;
        mImageLoader = new ImageLoader(mRequestQueue,new BitmapLruCache(cacheSize));
    }

    public static void addRequest(Request<?> request,Object tag){
        if (tag!=null){
           request.setTag(tag);
        }
        mRequestQueue.add(request);
    }

    public static RequestQueue getRequestQueue(){
        if (mRequestQueue!=null){
            return mRequestQueue;
        }else{
            throw new IllegalStateException("requestQueue not initialized");
        }
    }

    public static void cancleAll(Object tag){
         mRequestQueue.cancelAll(tag);
    }

    public static ImageLoader getImageLoader(){
        if (mImageLoader!=null){
            return mImageLoader;
        }else{
            throw new IllegalStateException("imageLoader not initialized");
        }
    }

}
