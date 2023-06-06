package com.meituan.android.neohybrid.v2.neo.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    volatile ar b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "261b8e044116f6d7c1c73a365c6e53c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "261b8e044116f6d7c1c73a365c6e53c3");
        } else {
            this.b = new ar.a().a(com.meituan.android.neohybrid.init.a.e()).a(com.meituan.android.neohybrid.v2.neo.http.shark.a.a()).a(new com.meituan.android.neohybrid.v2.neo.http.converter.a()).a(new com.meituan.android.paybase.net.interceptor.b()).a(new com.meituan.android.neohybrid.v2.neo.http.interceptor.d()).a(new com.meituan.android.neohybrid.v2.neo.http.interceptor.c()).a(new com.meituan.android.neohybrid.v2.neo.http.interceptor.b()).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.v2.neo.http.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0313a {
        private static final a a = new a();

        public static /* synthetic */ a a() {
            return a;
        }
    }
}
