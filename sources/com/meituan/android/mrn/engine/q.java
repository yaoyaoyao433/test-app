package com.meituan.android.mrn.engine;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.LoadJSCodeCacheCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(JSBundleLoaderDelegate jSBundleLoaderDelegate, boolean z, Runnable runnable) {
        Object[] objArr = {jSBundleLoaderDelegate, Byte.valueOf(z ? (byte) 1 : (byte) 0), runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "107788383ceb72566905368426a5fd99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "107788383ceb72566905368426a5fd99");
        } else if (runnable != null) {
            if (z) {
                runnable.run();
            } else {
                ((CatalystInstance) jSBundleLoaderDelegate).getReactQueueConfiguration().getJSQueueThread().runOnQueue(runnable);
            }
        }
    }

    public static JSBundleLoader a(final String str, final String str2, final String str3, boolean z, final Runnable runnable) {
        Object[] objArr = {str, str2, str3, (byte) 0, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c7b15ac545ec7917b7386dda98f5b6b", RobustBitConfig.DEFAULT_VALUE) ? (JSBundleLoader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c7b15ac545ec7917b7386dda98f5b6b") : new JSBundleLoader() { // from class: com.meituan.android.mrn.engine.q.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.bridge.JSBundleLoader
            public final String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                Object[] objArr2 = {jSBundleLoaderDelegate};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54beb774702d16046a9a6b6860d4c243", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54beb774702d16046a9a6b6860d4c243");
                }
                jSBundleLoaderDelegate.loadScriptFromDioFile(str, str2, str3, r4);
                q.a(jSBundleLoaderDelegate, r4, runnable);
                return new File(str, str2).toString();
            }

            @Override // com.facebook.react.bridge.JSBundleLoader
            public final String getBundleSourceURL() {
                return str3;
            }
        };
    }

    public static JSBundleLoader a(final String str, final String str2, final String str3, final String str4, final LoadJSCodeCacheCallback loadJSCodeCacheCallback, boolean z, final Runnable runnable) {
        Object[] objArr = {str, str2, str3, str4, loadJSCodeCacheCallback, (byte) 0, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "744005f7c4ce0219a0f51360e6003803", RobustBitConfig.DEFAULT_VALUE) ? (JSBundleLoader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "744005f7c4ce0219a0f51360e6003803") : new JSBundleLoader() { // from class: com.meituan.android.mrn.engine.q.2
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.bridge.JSBundleLoader
            public final String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                Object[] objArr2 = {jSBundleLoaderDelegate};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23c0e5262c3fd59fb6bb67fd41b8a161", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23c0e5262c3fd59fb6bb67fd41b8a161");
                }
                jSBundleLoaderDelegate.loadScriptFromDioFile(str, str2, str3, str4, loadJSCodeCacheCallback, r6);
                q.a(jSBundleLoaderDelegate, r6, runnable);
                return new File(str, str2).toString();
            }

            @Override // com.facebook.react.bridge.JSBundleLoader
            public final String getBundleSourceURL() {
                return str3;
            }
        };
    }
}
