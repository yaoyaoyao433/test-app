package com.facebook.react.bridge;

import android.support.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public interface CatalystInstance extends JSBundleLoaderDelegate, JSInstance, MemoryPressureListener {
    void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void addJSIModules(List<JSIModuleSpec> list);

    @DoNotStrip
    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    void extendNativeModules(NativeModuleRegistry nativeModuleRegistry);

    CallInvokerHolder getJSCallInvokerHolder();

    JSIModule getJSIModule(JSIModuleType jSIModuleType);

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    JavaScriptContextHolder getJavaScriptContextHolder();

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    List<String> getLoadedJSList();

    CallInvokerHolder getNativeCallInvokerHolder();

    <T extends NativeModule> T getNativeModule(Class<T> cls);

    NativeModule getNativeModule(String str);

    Collection<NativeModule> getNativeModules();

    ReactQueueConfiguration getReactQueueConfiguration();

    @Nullable
    String getSourceURL(String str);

    <T extends NativeModule> boolean hasNativeModule(Class<T> cls);

    boolean hasRunJSBundle(JSBundleLoader jSBundleLoader);

    @VisibleForTesting
    void initialize();

    @Override // com.facebook.react.bridge.JSInstance
    @DoNotStrip
    void invokeCallback(int i, NativeArrayInterface nativeArrayInterface);

    boolean isDestroyed();

    void registerSegment(int i, String str);

    void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void runJSBundle(JSBundleLoader jSBundleLoader);

    @VisibleForTesting
    void setGlobalVariable(String str, String str2);

    void setTurboModuleManager(JSIModule jSIModule);
}
