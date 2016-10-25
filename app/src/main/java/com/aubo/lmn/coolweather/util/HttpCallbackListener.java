package com.aubo.lmn.coolweather.util;

/**
 * Created by lmn on 16-10-25.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
