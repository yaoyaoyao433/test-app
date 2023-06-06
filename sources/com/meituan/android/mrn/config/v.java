package com.meituan.android.mrn.config;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.packagerconnection.JSPackagerClient;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.utils.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class v implements com.facebook.common.logging.c {
    public static ChangeQuickRedirect a;
    private static final Collection<String> b;
    private static boolean c;
    private int d;

    public v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b338eab52d1fb8d1eab1861215a9584b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b338eab52d1fb8d1eab1861215a9584b");
        } else {
            this.d = 5;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add(ReactInstanceManager.class.getSimpleName());
        b.add("ReactRootView");
        b.add("ReactNative");
        b.add("NativeModuleInitError");
        b.add("OkHttpClientProvider");
        b.add(NativeViewHierarchyManager.class.getSimpleName());
        b.add(UIViewOperationQueue.class.getSimpleName());
        b.add(ViewManager.class.getSimpleName());
        b.add("ReactEventEmitter");
        b.add("ViewManagerPropertyUpdater");
        b.add("NVHierarchyManager");
        b.add("BundleDownloader");
        b.add("DisabledDevSupportManager");
        b.add("InspectorPackagerConnection");
        b.add("JSDebuggerWebSocketClient");
        b.add(JSPackagerClient.class.getSimpleName());
        b.add(ReconnectingWebSocket.class.getSimpleName());
        c = false;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d5f1f8df0929eeecf03c426f15c0277", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d5f1f8df0929eeecf03c426f15c0277");
        } else if (c) {
        } else {
            synchronized (v.class) {
                if (c) {
                    return;
                }
                com.facebook.common.logging.a.a(new v());
                if (com.meituan.android.mrn.debug.a.c(com.meituan.android.mrn.common.a.a())) {
                    com.facebook.common.logging.a.a(2);
                } else {
                    com.facebook.common.logging.a.a(4);
                }
                c = true;
            }
        }
    }

    @Override // com.facebook.common.logging.c
    public final void a(int i) {
        this.d = i;
    }

    @Override // com.facebook.common.logging.c
    public final boolean b(int i) {
        return this.d <= i;
    }

    @Override // com.facebook.common.logging.c
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72ac14ffb1bcce06ac2bb0b90e505c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72ac14ffb1bcce06ac2bb0b90e505c2b");
        } else {
            a(3, str, str2, null);
        }
    }

    @Override // com.facebook.common.logging.c
    public final void a(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1844a33129f3ecafd2035de108145776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1844a33129f3ecafd2035de108145776");
        } else {
            a(3, str, str2, th);
        }
    }

    @Override // com.facebook.common.logging.c
    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34a97205f05c3ca2ed2482e30d45d494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34a97205f05c3ca2ed2482e30d45d494");
        } else {
            a(4, str, str2, null);
        }
    }

    @Override // com.facebook.common.logging.c
    public final void b(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2734f0a172702ca9e9c4db47548cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2734f0a172702ca9e9c4db47548cc6");
        } else {
            a(4, str, str2, th);
        }
    }

    @Override // com.facebook.common.logging.c
    public final void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7daa6084526f0d252ff902f304c2716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7daa6084526f0d252ff902f304c2716");
        } else {
            a(5, str, str2, null);
        }
    }

    @Override // com.facebook.common.logging.c
    public final void c(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707eb973d4e6dd112c3b50f6755b0891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707eb973d4e6dd112c3b50f6755b0891");
        } else {
            a(5, str, str2, th);
        }
    }

    @Override // com.facebook.common.logging.c
    public final void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb7e77cbdd2f771dac887218a1bf5cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb7e77cbdd2f771dac887218a1bf5cf");
        } else {
            a(6, str, str2, null);
        }
    }

    @Override // com.facebook.common.logging.c
    public final void d(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32d74a5e353e0b68dafcef288fd7180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32d74a5e353e0b68dafcef288fd7180");
        } else {
            a(6, str, str2, th);
        }
    }

    private void a(int i, String str, String str2, Throwable th) {
        Object[] objArr = {Integer.valueOf(i), str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2acd151a8c7281fefb464bf286b1a0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2acd151a8c7281fefb464bf286b1a0bb");
            return;
        }
        try {
            switch (i) {
                case 4:
                    com.meituan.android.mrn.utils.p.a(i, str, str2, th);
                    break;
                case 5:
                    if (!b.contains(str)) {
                        com.meituan.android.mrn.utils.c.b(str, str2, th);
                    }
                    com.meituan.android.mrn.utils.p.a(i, str, str2, th);
                    break;
                case 6:
                    if (!b.contains(str)) {
                        com.meituan.android.mrn.utils.c.a(str, str2, th);
                    }
                    com.meituan.android.mrn.utils.p.a(i, str, str2, th);
                    break;
            }
            b(i, str, str2, th);
        } catch (Throwable th2) {
            if (com.meituan.android.mrn.debug.a.a()) {
                throw new RuntimeException(th2);
            }
        }
    }

    private static void b(int i, String str, String str2, Throwable th) {
        Object[] objArr = {Integer.valueOf(i), str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4534fc431d3ae3c21388212953866fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4534fc431d3ae3c21388212953866fcd");
        } else if (com.meituan.android.mrn.debug.a.a()) {
            LogUtils.a(i, str, LogUtils.a((String) null, str2, th));
        }
    }
}
