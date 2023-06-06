package com.meituan.mtwebkit.internal.hyper;

import android.os.Looper;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.internal.d;
import com.meituan.mtwebkit.internal.e;
import com.meituan.mtwebkit.internal.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class SameLayerManager {
    private static final String TAG = "SameLayerManager";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        SameLayerClient a(SameLayerWidget sameLayerWidget);
    }

    public static int getApiVersion() {
        return 2;
    }

    public static synchronized void bindProvider(MTWebView mTWebView, a aVar) {
        synchronized (SameLayerManager.class) {
            Object[] objArr = {mTWebView, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6eb786d31bd63de70947d709371a424f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6eb786d31bd63de70947d709371a424f");
            } else if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("must call on ui thread");
            } else {
                if (mTWebView.getTag(R.id.mtwebview_same_layer_provider) != null) {
                    throw new IllegalStateException("can not bind twice");
                }
                mTWebView.setTag(R.id.mtwebview_same_layer_provider, aVar);
            }
        }
    }

    public static synchronized SameLayerClient createClient(ViewGroup viewGroup, SameLayerWidget sameLayerWidget) {
        synchronized (SameLayerManager.class) {
            Object[] objArr = {viewGroup, sameLayerWidget};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "903ff6a1e9cfc4a2270af9a5596ac2e2", RobustBitConfig.DEFAULT_VALUE)) {
                return (SameLayerClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "903ff6a1e9cfc4a2270af9a5596ac2e2");
            }
            return ((a) viewGroup.getTag(R.id.mtwebview_same_layer_provider)).a(sameLayerWidget);
        }
    }

    public static synchronized boolean isSupportParams(ViewGroup viewGroup, String str) {
        synchronized (SameLayerManager.class) {
            Object[] objArr = {viewGroup, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d99ffc22e0213348f7d9bd8bb45556bc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d99ffc22e0213348f7d9bd8bb45556bc")).booleanValue();
            }
            return ((a) viewGroup.getTag(R.id.mtwebview_same_layer_provider)) != null;
        }
    }

    public static boolean checkIfSupportSameLayer(MTWebView mTWebView) {
        Object[] objArr = {mTWebView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45f39eaecad3a781100d561ced35d249", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45f39eaecad3a781100d561ced35d249")).booleanValue();
        }
        if (mTWebView == null) {
            throw new IllegalArgumentException("MTWebView must not null");
        }
        if (l.c() != 2) {
            e.b(TAG, "system webview core do not support same layer");
            return false;
        }
        try {
            return ((Boolean) d.a("com.meituan.mtwebview.chromium.hyper_plugin.HyperPluginBridge", MTWebView.getWebViewClassLoader()).a("checkApiCompatible", new Object[0]).b).booleanValue();
        } catch (Throwable th) {
            e.a(TAG, "checkApiCompatible fail", th);
            return false;
        }
    }
}
