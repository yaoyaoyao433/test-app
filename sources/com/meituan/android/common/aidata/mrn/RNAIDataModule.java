package com.meituan.android.common.aidata.mrn;

import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = RNNativeProxy.MODULE_NAME)
/* loaded from: classes2.dex */
public class RNAIDataModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RNNativeProxy mAIDataProxy;
    private final ReactApplicationContext reactContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNNativeProxy.MODULE_NAME;
    }

    public RNAIDataModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66fb6bf114d57a0f08811a8b7711f4ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66fb6bf114d57a0f08811a8b7711f4ff");
            return;
        }
        this.reactContext = reactApplicationContext;
        this.mAIDataProxy = new RNNativeProxy(reactApplicationContext);
    }

    @ReactMethod
    public void startService(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8c2923eb7287847a91bf6fb81030691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8c2923eb7287847a91bf6fb81030691");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mAIDataProxy.startService(str);
        }
    }

    @ReactMethod
    public void stopService(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "719bbbe919647cf15ed3731189c6ee3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "719bbbe919647cf15ed3731189c6ee3b");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mAIDataProxy.stopService(str);
        }
    }

    @ReactMethod
    public void getFeatures(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c600660c12276b1dee46080d34dd599c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c600660c12276b1dee46080d34dd599c");
        } else if (readableMap != null) {
            this.mAIDataProxy.getFeatures(readableMap, promise);
        }
    }

    @ReactMethod
    public void queryDatabase(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5c7e84e255d3b8163da6d88aedee8bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5c7e84e255d3b8163da6d88aedee8bc");
        } else if (readableMap != null) {
            this.mAIDataProxy.queryDatabase(readableMap, promise);
        }
    }

    @ReactMethod
    public void addCEPSubscriber(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8ae25209d9f7cb07a782f9d98ef5a70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8ae25209d9f7cb07a782f9d98ef5a70");
        } else if (readableMap != null) {
            this.mAIDataProxy.addCEPSubscriber(readableMap);
        }
    }

    @ReactMethod
    public void removeCEPSubscriber(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b16255daba01ce5d7635f7255ef6ebc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b16255daba01ce5d7635f7255ef6ebc9");
        } else if (readableMap != null) {
            this.mAIDataProxy.removeCEPSubscriber(readableMap);
        }
    }

    @ReactMethod
    public void mrnContainerReleased(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cac2e6e119a3739940c2bb32c61ef30b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cac2e6e119a3739940c2bb32c61ef30b");
        } else if (readableMap != null) {
            this.mAIDataProxy.mrnContainerReleased(readableMap);
        }
    }

    @ReactMethod
    public void executeMLModel(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dc245def71ff3e891e0ffd2874b9162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dc245def71ff3e891e0ffd2874b9162");
        } else if (readableMap != null) {
            this.mAIDataProxy.executeMLModel(readableMap, promise);
        }
    }

    @ReactMethod
    public void executeJSBundle(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc3b4a3df4c683e9f5274004162296d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc3b4a3df4c683e9f5274004162296d6");
        } else if (readableMap != null) {
            this.mAIDataProxy.executeJSBundle(readableMap, promise);
        }
    }

    @ReactMethod
    public void autoRunnerInterceptCallback(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfa38b99ea15586089881b48aa4548cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfa38b99ea15586089881b48aa4548cb");
        } else if (readableMap != null) {
            this.mAIDataProxy.autoRunnerInterceptCallback(readableMap);
        }
    }

    @ReactMethod
    public void addAutoRunnerObserver(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3db3c61f8a3233a83aabd1d59e089226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3db3c61f8a3233a83aabd1d59e089226");
        } else if (readableMap != null) {
            this.mAIDataProxy.addAutoRunnerObserver(readableMap);
        }
    }

    @ReactMethod
    public void removeAutoRunnerObserver(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d3addc4df1f88af82f356dfe900f8eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d3addc4df1f88af82f356dfe900f8eb");
        } else if (readableMap != null) {
            this.mAIDataProxy.removeAutoRunnerObserver(readableMap);
        }
    }

    @ReactMethod
    public void writeLXEvent(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1147c494f9ad07469858d2a0f82190f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1147c494f9ad07469858d2a0f82190f");
        } else if (readableMap != null) {
            this.mAIDataProxy.writeLXEvent(readableMap);
        }
    }
}
