package com.meituan.msc.jse.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
import com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class LoadJSCodeCacheCallbackJNIWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LoadJSCodeCacheCallback mCallback;

    public LoadJSCodeCacheCallbackJNIWrapper(LoadJSCodeCacheCallback loadJSCodeCacheCallback) {
        Object[] objArr = {loadJSCodeCacheCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5828b0da8025bd2efb6957197edd69af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5828b0da8025bd2efb6957197edd69af");
        } else {
            this.mCallback = loadJSCodeCacheCallback;
        }
    }

    @DoNotStrip
    public void onLoad(String str, String str2, int i) {
        LoadJSCodeCacheCallback.LoadStatus loadStatus;
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6df5a0d4e54db4ba7317a6311e848845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6df5a0d4e54db4ba7317a6311e848845");
        } else if (this.mCallback != null) {
            LoadJSCodeCacheCallback.LoadStatus[] valuesCustom = LoadJSCodeCacheCallback.LoadStatus.valuesCustom();
            if (i >= 0 && i < valuesCustom.length) {
                loadStatus = valuesCustom[i];
            } else {
                loadStatus = LoadJSCodeCacheCallback.LoadStatus.unsupported;
            }
            this.mCallback.onLoad(str, str2, loadStatus);
        }
    }
}
