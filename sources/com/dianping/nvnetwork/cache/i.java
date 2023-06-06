package com.dianping.nvnetwork.cache;

import android.content.Context;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i implements h {
    public static ChangeQuickRedirect a;
    private g b;
    private g c;
    private j d;
    private Context e;

    public i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c712e105f6df37eec7158d8b3a979a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c712e105f6df37eec7158d8b3a979a");
        } else {
            this.e = context.getApplicationContext();
        }
    }

    private synchronized g b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a092c7ef5b66df6ceff6d8aae5d3f7", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a092c7ef5b66df6ceff6d8aae5d3f7");
        }
        if (this.b == null) {
            this.b = new g(b.a(this.e, "c0"));
        }
        return this.b;
    }

    private synchronized g c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c24501e76a24ba1f89f868c7d985ffef", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c24501e76a24ba1f89f868c7d985ffef");
        }
        if (this.c == null) {
            this.c = new g(b.a(this.e, "c1"));
        }
        return this.c;
    }

    private synchronized j d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "985f8e854f4660c81429736c7724b5d9", 6917529027641081856L)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "985f8e854f4660c81429736c7724b5d9");
        }
        if (this.d == null) {
            this.d = new j(b.a(this.e, "c2"));
        }
        return this.d;
    }

    private h b(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7401f07d1bd59fe5c92645763eb2052b", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7401f07d1bd59fe5c92645763eb2052b");
        }
        switch (request.j) {
            case CRITICAL:
                return b();
            case SERVICE:
                return d();
            default:
                return c();
        }
    }

    @Override // com.dianping.nvnetwork.cache.h, com.dianping.nvnetwork.http.a
    public final rx.d<q> exec(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76af45afedee850c9efcea27fd925872", 6917529027641081856L) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76af45afedee850c9efcea27fd925872") : b(request).exec(request);
    }

    @Override // com.dianping.nvnetwork.cache.h
    public final boolean a(Request request, q qVar) {
        Object[] objArr = {request, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a53b8bb2e4cf724f2f7506107412db", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a53b8bb2e4cf724f2f7506107412db")).booleanValue() : b(request).a(request, qVar);
    }

    @Override // com.dianping.nvnetwork.cache.h
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07fdb9b48c73ed65cf357a1b13933530", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07fdb9b48c73ed65cf357a1b13933530");
            return;
        }
        b().a();
        c().a();
        d().a();
    }

    @Override // com.dianping.nvnetwork.cache.h
    public final void a(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "425bdf8f160208d1badf54b4ddc39d5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "425bdf8f160208d1badf54b4ddc39d5a");
        } else {
            b(request).a(request);
        }
    }
}
