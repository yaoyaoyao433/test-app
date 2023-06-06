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
public final class s implements b.a, com.dianping.monitor.metric.e {
    public static ChangeQuickRedirect a;
    private static boolean b = a.DEBUG;
    private static volatile s c;
    private final List<String> d;
    private final com.dianping.monitor.metric.b e;

    @Override // com.dianping.monitor.metric.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f46bdcfbe6cabad399ba3c99f4220e74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f46bdcfbe6cabad399ba3c99f4220e74");
        }
    }

    public static s a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74fb04df2c014b810f5e39b4fade3b69", 6917529027641081856L)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74fb04df2c014b810f5e39b4fade3b69");
        }
        if (c == null) {
            synchronized (o.class) {
                if (c == null) {
                    s sVar = new s(context);
                    c = sVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, sVar, changeQuickRedirect2, false, "b2744197aa703005a1a1e2c76d32e391", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, sVar, changeQuickRedirect2, false, "b2744197aa703005a1a1e2c76d32e391");
                    } else {
                        sVar.e.b();
                    }
                }
            }
        }
        return c;
    }

    private s(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d18abb1ef6f081cc8c373d412322c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d18abb1ef6f081cc8c373d412322c6");
            return;
        }
        this.d = new ArrayList();
        this.d.add("1");
        this.d.add(String.valueOf(com.dianping.monitor.h.a(context)));
        this.d.add(com.dianping.monitor.h.b());
        this.d.add(com.dianping.monitor.h.a());
        this.e = new com.dianping.monitor.metric.b(this, false);
        this.e.c = true;
        this.e.d = true;
    }

    @Override // com.dianping.monitor.metric.b.a
    public final String a(String str, String str2, String str3) {
        Uri.Builder buildUpon;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e164d6545d24526837e5c387c6a4ada", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e164d6545d24526837e5c387c6a4ada");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709c69f1a08e4b080c26e1d4b6d5da46", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709c69f1a08e4b080c26e1d4b6d5da46");
        }
        String a2 = com.dianping.monitor.metric.g.a(this.d, list);
        if (b) {
            new StringBuilder("self metric send data: ").append(a2);
        }
        return a2;
    }

    @Override // com.dianping.monitor.metric.d
    public final void a(com.dianping.monitor.metric.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d094d332e033ed2950649a57350f7cdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d094d332e033ed2950649a57350f7cdc");
        } else {
            this.e.a(aVar);
        }
    }

    @Override // com.dianping.monitor.metric.d
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b546da9b83bd98b802a09a11fd06c4", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b546da9b83bd98b802a09a11fd06c4")).intValue() : this.e.a(str);
    }
}
