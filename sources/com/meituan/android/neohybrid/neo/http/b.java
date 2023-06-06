package com.meituan.android.neohybrid.neo.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    volatile ar b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f98d990ecbd6710a1b43e4c7efdb703", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f98d990ecbd6710a1b43e4c7efdb703");
        } else {
            this.b = new ar.a().a(com.meituan.android.neohybrid.init.a.e()).a(com.meituan.android.neohybrid.neo.http.shark.a.a()).a(new com.meituan.android.neohybrid.neo.http.converter.a()).a(new com.meituan.android.paybase.net.interceptor.b()).a(new com.meituan.android.neohybrid.neo.http.interceptor.d()).a(new com.meituan.android.neohybrid.neo.http.interceptor.c()).a(new com.meituan.android.neohybrid.neo.http.interceptor.b()).a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final b a = new b();
    }
}
