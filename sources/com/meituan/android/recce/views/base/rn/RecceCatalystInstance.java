package com.meituan.android.recce.views.base.rn;

import android.content.res.AssetManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModuleSpec;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.LoadJSCodeCacheCallback;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceCatalystInstance implements CatalystInstance {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ReactQueueConfiguration reactQueueConfiguration;
    private UIManagerModule uiManagerModule;

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addJSIModules(List<JSIModuleSpec> list) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void destroy() {
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public String evaluateJavaScript(String str, String str2) {
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
    }

    @Override // com.facebook.react.bridge.JSInstance
    public void garbageCollect() {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public CallInvokerHolder getJSCallInvokerHolder() {
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSBundleLoaderDelegate
    public List<String> getLoadedJSList() {
        return null;
    }

    @Override // com.facebook.react.bridge.JSInstance
    public long getMemoryUsage() {
        return 0L;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public CallInvokerHolder getNativeCallInvokerHolder() {
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String str) {
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection<NativeModule> getNativeModules() {
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL(String str) {
        return null;
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        return false;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle(JSBundleLoader jSBundleLoader) {
        return false;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        return false;
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromDioFile(String str, String str2, String str3, String str4, LoadJSCodeCacheCallback loadJSCodeCacheCallback, boolean z) {
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromDioFile(String str, String str2, String str3, boolean z) {
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z) {
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromString(String str, String str2, boolean z) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i, String str) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle(JSBundleLoader jSBundleLoader) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setGlobalVariable(String str, String str2) {
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setGlobalVariableSync(String str, String str2) {
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleManager(JSIModule jSIModule) {
    }

    public RecceCatalystInstance(ReactQueueConfiguration reactQueueConfiguration, UIManagerModule uIManagerModule) {
        Object[] objArr = {reactQueueConfiguration, uIManagerModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01dbacfc648bfae0fb89c9f4062a7c3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01dbacfc648bfae0fb89c9f4062a7c3c");
            return;
        }
        this.reactQueueConfiguration = reactQueueConfiguration;
        this.uiManagerModule = uIManagerModule;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.reactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (cls == UIManagerModule.class) {
            return this.uiManagerModule;
        }
        return null;
    }
}
