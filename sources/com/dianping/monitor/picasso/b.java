package com.dianping.monitor.picasso;

import android.content.Context;
import android.net.Uri;
import com.dianping.monitor.h;
import com.dianping.monitor.impl.c;
import com.dianping.monitor.metric.b;
import com.dianping.monitor.metric.e;
import com.dianping.monitor.metric.f;
import com.dianping.monitor.metric.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b implements b.a, e {
    public static ChangeQuickRedirect a;
    public static boolean b = com.dianping.monitor.impl.a.DEBUG;
    private static final String[] c = {"picassometrics"};
    private static volatile b d;
    private final List<String> e;
    private final com.dianping.monitor.metric.b f;

    public static b a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91b3314e7a2650d3bfa00f386b93bf97", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91b3314e7a2650d3bfa00f386b93bf97");
        }
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    b bVar = new b(context, str, str2);
                    d = bVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7d4d4c345fbf408dbbdd8483a1d2b7fd", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7d4d4c345fbf408dbbdd8483a1d2b7fd");
                    } else {
                        bVar.f.b();
                    }
                }
            }
        }
        return d;
    }

    private b(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b3b51a78682579507e4fefa0dea51e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b3b51a78682579507e4fefa0dea51e");
            return;
        }
        this.e = new ArrayList();
        this.e.add(h.e());
        this.e.add(h.c(context));
        this.e.add(h.d());
        this.e.add(h.f());
        this.e.add(h.b(str));
        this.e.add(h.b(str2));
        this.f = new com.dianping.monitor.metric.b(this, true);
        f.a().a(this);
    }

    @Override // com.dianping.monitor.metric.d
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30dbf30eb2928015899f359a383a82f", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30dbf30eb2928015899f359a383a82f")).intValue() : this.f.a(str);
    }

    @Override // com.dianping.monitor.metric.d
    public final void a(com.dianping.monitor.metric.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5228a7ef60d0000b98cd45df5dbd1666", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5228a7ef60d0000b98cd45df5dbd1666");
        } else {
            this.f.a(aVar);
        }
    }

    @Override // com.dianping.monitor.metric.b.a
    public final String a(String str, String str2, String str3) {
        Uri.Builder buildUpon;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f9853d535923fc2dd54da765a11a867", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f9853d535923fc2dd54da765a11a867");
        }
        if (str3 == null) {
            buildUpon = Uri.parse(c.g()).buildUpon().appendQueryParameter("v", "1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c5d4b0dd3405472fa721c656fdcb81", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c5d4b0dd3405472fa721c656fdcb81");
        }
        String a2 = g.a(this.e, list);
        if (b) {
            new StringBuilder("mrn metric send data: ").append(a2);
        }
        com.dianping.networklog.c.a(a2, 5, c);
        return a2;
    }

    @Override // com.dianping.monitor.metric.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2596f6954b47b591bd12aad51a4a6c3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2596f6954b47b591bd12aad51a4a6c3b");
        } else {
            this.f.a();
        }
    }
}
