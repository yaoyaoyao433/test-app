package com.meituan.msc.jse.bridge;

import android.support.annotation.VisibleForTesting;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfiguration;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import org.json.JSONArray;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public interface CatalystInstance extends JSInstance, MemoryPressureListener {
    @Override // com.meituan.msc.jse.bridge.JSFunctionCaller
    @DoNotStrip
    void callFunction(String str, String str2, JSONArray jSONArray);

    void changeV8InspectorName(String str);

    void destroy();

    JavaScriptContextHolder getJavaScriptContextHolder();

    ReactQueueConfiguration getReactQueueConfiguration();

    @VisibleForTesting
    void initialize();

    @DoNotStrip
    void invokeCallback(int i, NativeArray nativeArray);

    @Override // com.meituan.msc.jse.bridge.JSInstance
    @DoNotStrip
    void invokeCallback(int i, JSONArray jSONArray);

    boolean isDestroyed();

    @Override // com.meituan.msc.jse.bridge.JSInstance
    void registerJSObject(String str, JavaFunctionsInterface javaFunctionsInterface);

    @Override // com.meituan.msc.jse.bridge.JSInstance
    void registerJavaCallback(String str, JavaCallback javaCallback);

    @VisibleForTesting
    void setGlobalVariable(String str, String str2);

    void setGlobalVariableString(String str, String str2);

    void setGlobalVariableSync(String str, String str2);
}
