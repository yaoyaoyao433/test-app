package com.meituan.android.mrn.config;

import android.content.Context;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aa extends b {
    public static ChangeQuickRedirect b;
    private static com.meituan.android.mrn.config.city.a c;
    private static a.InterfaceC0637a d;
    private static volatile aa e;

    @Override // com.meituan.android.mrn.config.b, com.meituan.android.mrn.config.i
    public final String a(String str) {
        return "";
    }

    public static synchronized aa b() {
        synchronized (aa.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e941aabd6ed256ae8878e748c49c3672", RobustBitConfig.DEFAULT_VALUE)) {
                return (aa) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e941aabd6ed256ae8878e748c49c3672");
            }
            if (e == null) {
                e = new aa();
            }
            return e;
        }
    }

    @Override // com.meituan.android.mrn.config.b, com.meituan.android.mrn.config.i
    public final a.InterfaceC0637a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd09bf3fa370a09d5f1f59cfac7255f", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd09bf3fa370a09d5f1f59cfac7255f") : d(context);
    }

    @Override // com.meituan.android.mrn.config.b, com.meituan.android.mrn.config.i
    public final com.dianping.dataservice.mapi.g b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "789cd8a1ca953c369d24605d850a0321", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.dataservice.mapi.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "789cd8a1ca953c369d24605d850a0321");
        }
        com.meituan.android.mrn.engine.c.a();
        return null;
    }

    @Override // com.meituan.android.mrn.config.b, com.meituan.android.mrn.config.i
    public final com.meituan.android.mrn.config.city.a c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa359d28bdea6b0aa31626fc50df588f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.config.city.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa359d28bdea6b0aa31626fc50df588f") : c();
    }

    private static synchronized com.meituan.android.mrn.config.city.a c() {
        synchronized (aa.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b062a302c5bff38edc4a68aa5eb77459", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.meituan.android.mrn.config.city.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b062a302c5bff38edc4a68aa5eb77459");
            }
            if (c == null) {
                c = new com.meituan.android.mrn.config.city.a() { // from class: com.meituan.android.mrn.config.aa.1
                    @Override // com.meituan.android.mrn.config.city.a
                    public final long a() {
                        return 0L;
                    }
                };
            }
            return c;
        }
    }

    private static synchronized a.InterfaceC0637a d(Context context) {
        synchronized (aa.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "500afb49822f55fcf92f48c02cfab973", RobustBitConfig.DEFAULT_VALUE)) {
                return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "500afb49822f55fcf92f48c02cfab973");
            }
            if (d == null) {
                com.squareup.okhttp.v vVar = new com.squareup.okhttp.v();
                OkHttp2Wrapper.addInterceptorToClient(vVar);
                d = com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(com.sankuai.waimai.launcher.util.aop.b.a(vVar));
            }
            return d;
        }
    }
}
