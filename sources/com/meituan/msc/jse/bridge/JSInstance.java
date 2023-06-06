package com.meituan.msc.jse.bridge;

import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface JSInstance extends JSFunctionCaller {
    String evaluateJavaScript(String str, String str2, String str3, LoadJSCodeCacheCallback loadJSCodeCacheCallback);

    String executeJSFunction(String str, String str2, String str3);

    String executeListFunction(String str, String str2, String str3, String str4, String str5);

    void garbageCollect();

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    long getMemoryUsage();

    void invokeCallback(int i, JSONArray jSONArray);

    void registerJSObject(String str, JavaFunctionsInterface javaFunctionsInterface);

    void registerJavaCallback(String str, JavaCallback javaCallback);

    void runOnJSQueueThreadSafe(Runnable runnable);

    void startCPUProfiling(String str, int i);

    void stopCPUProfiling(String str, String str2);
}
