package com.meituan.android.privacy.impl.permission;

import android.app.Application;
import com.meituan.android.privacy.impl.config.k;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.y;
import com.meituan.android.privacy.interfaces.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void a(Application application, z zVar) {
        Object[] objArr = {application, zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce8b215a5c8ff55269a53cb04d8e2563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce8b215a5c8ff55269a53cb04d8e2563");
        } else if (b) {
        } else {
            PermissionGuard.a.a.setInitConfig(zVar);
            com.meituan.android.privacy.impl.config.d a2 = com.meituan.android.privacy.impl.config.d.a(application);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.impl.config.d.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "563e593b2b0e3a86ba941095dd50616e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "563e593b2b0e3a86ba941095dd50616e");
            } else {
                a2.b.d();
            }
            y.a(application, new com.meituan.android.privacy.interfaces.f() { // from class: com.meituan.android.privacy.impl.permission.b.1
            });
            com.meituan.android.privacy.interfaces.config.d.b = k.a.a;
            c a3 = c.a();
            Object[] objArr3 = {application};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "6f413c37093ab90684f2ff0c9b32a33b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "6f413c37093ab90684f2ff0c9b32a33b");
            } else if (application != null) {
                application.registerActivityLifecycleCallbacks(a3.b);
            }
            d a4 = d.a();
            Object[] objArr4 = {application};
            ChangeQuickRedirect changeQuickRedirect4 = d.a;
            if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "8159a66f1a51f70c8c41769bd674c1a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "8159a66f1a51f70c8c41769bd674c1a4");
            } else {
                a4.e = true;
                a4.b.getContext(application);
                a4.c = a4.b.getSys();
            }
            com.meituan.android.privacy.interfaces.monitor.c.b = com.meituan.android.privacy.histories.a.a(PermissionGuard.a.a.getContext(application));
            b = true;
        }
    }
}
