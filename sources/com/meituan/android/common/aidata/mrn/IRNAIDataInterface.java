package com.meituan.android.common.aidata.mrn;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IRNAIDataInterface {
    @ReactMethod
    void addCEPSubscriber(ReadableMap readableMap);

    @ReactMethod
    void getFeatures(ReadableMap readableMap, Promise promise);

    @ReactMethod
    void queryDatabase(ReadableMap readableMap, Promise promise);

    @ReactMethod
    void removeCEPSubscriber(ReadableMap readableMap);

    @ReactMethod
    void startService(String str);

    @ReactMethod
    void stopService(String str);
}
