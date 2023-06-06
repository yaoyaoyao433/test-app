package com.sankuai.waimai.alita.core.featuredatareport;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d b;
    private g<String, a> c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04cc8c826c679f2e39245bfcdb218ab4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04cc8c826c679f2e39245bfcdb218ab4");
        } else {
            this.c = new g<>();
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a03cbe7c01316dcbb6b7310f7cee9d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a03cbe7c01316dcbb6b7310f7cee9d1");
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d();
                }
            }
        }
        return b;
    }

    @NonNull
    public final c a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2920bdb8bd3a3c5dcc00782552bea8f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2920bdb8bd3a3c5dcc00782552bea8f1");
        }
        a a2 = this.c.a((g<String, a>) str);
        if (a2 == null) {
            a2 = new a(new c(str));
            this.c.a((g<String, a>) a2);
        }
        return (c) a2.d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.alita.core.base.c<c> {
        public a(@NonNull c cVar) {
            super(cVar.b, cVar);
        }
    }
}
