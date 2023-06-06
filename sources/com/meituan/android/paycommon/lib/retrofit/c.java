package com.meituan.android.paycommon.lib.retrofit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile ar b;

    public static ar a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5e3bb63183dddb8a400b52de7146e08", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5e3bb63183dddb8a400b52de7146e08");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new ar.a().a(com.meituan.android.paycommon.lib.config.a.a().a()).a(a.a()).a(new com.meituan.android.paybase.encrypt.a(com.meituan.android.paycommon.lib.config.a.a().a, true)).a(new com.meituan.android.paybase.net.interceptor.c()).a(new com.meituan.android.paybase.net.interceptor.b()).a(new com.meituan.android.paybase.net.interceptor.a()).a(new com.meituan.android.paybase.encrypt.b(com.meituan.android.paycommon.lib.config.a.a().a, d.b())).a();
                }
            }
        }
        return b;
    }

    public static /* synthetic */ String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2686f0031652319edc061fa9af39d905", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2686f0031652319edc061fa9af39d905") : com.meituan.android.paycommon.lib.config.a.a().j();
    }
}
