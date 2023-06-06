package com.facebook.react.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.LoadJSCodeCacheCallback;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class LoadJSCodeCacheCallbackJNIWrapper {
    private final WeakReference<LoadJSCodeCacheCallback> mCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoadJSCodeCacheCallbackJNIWrapper(LoadJSCodeCacheCallback loadJSCodeCacheCallback) {
        this.mCallback = new WeakReference<>(loadJSCodeCacheCallback);
    }

    @DoNotStrip
    void onLoad(String str, String str2, int i) {
        LoadJSCodeCacheCallback.LoadStatus loadStatus;
        if (this.mCallback.get() != null) {
            LoadJSCodeCacheCallback.LoadStatus[] values = LoadJSCodeCacheCallback.LoadStatus.values();
            if (i >= 0 && i < values.length) {
                loadStatus = values[i];
            } else {
                loadStatus = LoadJSCodeCacheCallback.LoadStatus.unsupported;
            }
            this.mCallback.get().onLoad(str, str2, loadStatus);
        }
    }
}
