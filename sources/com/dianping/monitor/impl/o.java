package com.dianping.monitor.impl;

import android.content.Context;
import android.net.Uri;
import com.dianping.monitor.metric.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class o implements b.a, com.dianping.monitor.metric.e {
    public static ChangeQuickRedirect a;
    private static boolean b = a.DEBUG;
    private static volatile o c;
    private final List<String> d;
    private final com.dianping.monitor.metric.b e;

    public static o a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c06a16920b11ac573556c1b8d9af60a6", 6917529027641081856L)) {
            return (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c06a16920b11ac573556c1b8d9af60a6");
        }
        if (c == null) {
            synchronized (o.class) {
                if (c == null) {
                    o oVar = new o(context);
                    c = oVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "95b6feaa78c61a1da3e48a7c00841a2d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "95b6feaa78c61a1da3e48a7c00841a2d");
                    } else {
                        oVar.e.b();
                    }
                }
            }
        }
        return c;
    }

    private o(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80fc16e9016d11bb905bdf92bbcd9119", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80fc16e9016d11bb905bdf92bbcd9119");
            return;
        }
        this.d = new ArrayList();
        this.d.add("1");
        this.d.add(String.valueOf(com.dianping.monitor.h.a(context)));
        this.d.add(com.dianping.monitor.h.b());
        this.d.add(com.dianping.monitor.h.a());
        this.e = new com.dianping.monitor.metric.b(this, false);
        com.dianping.monitor.metric.f.a().a(this);
    }

    @Override // com.dianping.monitor.metric.d
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b0c8f16f86785bf547ceb00cf384d8e", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b0c8f16f86785bf547ceb00cf384d8e")).intValue() : this.e.a(str);
    }

    @Override // com.dianping.monitor.metric.d
    public final void a(com.dianping.monitor.metric.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3025117cf2f4dc7cb400e14ff28a99d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3025117cf2f4dc7cb400e14ff28a99d8");
        } else {
            this.e.a(aVar);
        }
    }

    @Override // com.dianping.monitor.metric.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667479ff9a139d9e1c08cc8a079e2f9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667479ff9a139d9e1c08cc8a079e2f9e");
        } else {
            this.e.a();
        }
    }

    @Override // com.dianping.monitor.metric.b.a
    public final String a(String str, String str2, String str3) {
        Uri.Builder buildUpon;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a73df3c3ff376937eee5b97d82917cb", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a73df3c3ff376937eee5b97d82917cb");
        }
        if (str3 == null) {
            buildUpon = Uri.parse(c.f()).buildUpon().appendQueryParameter("v", "3");
        } else {
            buildUpon = Uri.parse(str3).buildUpon();
        }
        buildUpon.appendQueryParameter("p", str);
        if (str2 != null) {
            buildUpon.appendQueryParameter("unionId", str2);
        }
        String builder = buildUpon.toString();
        if (b) {
            new StringBuilder("url URL : ").append(builder);
        }
        return builder;
    }

    @Override // com.dianping.monitor.metric.b.a
    public final String a(List<com.dianping.monitor.metric.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d92840fd7a6de5e3a2230fa3b97f84b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d92840fd7a6de5e3a2230fa3b97f84b");
        }
        String a2 = com.dianping.monitor.metric.g.a(this.d, list);
        if (b) {
            new StringBuilder("cat metric send data: ").append(a2);
        }
        return a2;
    }
}
