package com.meituan.android.customerservice.utils;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static final boolean b = b.a();

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69cd942439d2a713d5b20e3ba057447e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69cd942439d2a713d5b20e3ba057447e");
            return;
        }
        if (b) {
            new StringBuilder("cs_channel.").append(str);
        }
        com.dianping.networklog.c.a("cs_channel.:" + str2, 3);
    }

    public static void a(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "536482da5ef31f43755486f75310837c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "536482da5ef31f43755486f75310837c");
        } else {
            a(cls.getSimpleName(), str);
        }
    }

    public static void b(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4678d072b7c2271c2ac80f5ddadb334c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4678d072b7c2271c2ac80f5ddadb334c");
            return;
        }
        String simpleName = cls.getSimpleName();
        Object[] objArr2 = {simpleName, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a9185fe9be711a3360062539599be697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a9185fe9be711a3360062539599be697");
            return;
        }
        if (b) {
            Log.e("cs_channel." + simpleName, str);
        }
        com.dianping.networklog.c.a("cs_channel.:" + str, 3);
    }
}
