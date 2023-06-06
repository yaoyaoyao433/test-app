package com.dianping.nvnetwork.failover.fetcher;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.failover.fetcher.b;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a implements b {
    public static ChangeQuickRedirect a;
    public q b;
    public int c;
    public int d;
    private final AtomicInteger e;

    @Override // com.dianping.nvnetwork.failover.fetcher.b
    public boolean a(Request request, q qVar) {
        return true;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9d3801a0c3671215aa3e277b3d970a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9d3801a0c3671215aa3e277b3d970a");
        } else {
            this.e = new AtomicInteger(-1);
        }
    }

    public final void a(Request request, b.a aVar) {
        Object[] objArr = {request, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4c7b413b4029ceea22b6b2e985ee4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4c7b413b4029ceea22b6b2e985ee4a");
            return;
        }
        a(0);
        if (aVar != null) {
            aVar.a(this, request);
        }
    }

    public void a(Request request, q qVar, Throwable th, b.a aVar) {
        Object[] objArr = {request, qVar, th, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cfab63a8da6a9f32b5f36551db08027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cfab63a8da6a9f32b5f36551db08027");
            return;
        }
        a(10);
        if (aVar != null) {
            aVar.a(this, request, qVar, th);
            aVar.a(this, qVar, th);
        }
    }

    public void a(Request request, q qVar, b.a aVar) {
        Object[] objArr = {request, qVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edeedc6d2fc5552e789682acb7c2596b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edeedc6d2fc5552e789682acb7c2596b");
            return;
        }
        a(5);
        if (aVar != null) {
            aVar.a(this, request, qVar, null);
            aVar.a(this, qVar, null);
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8c6b22a9c396e2b17813458c191902a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8c6b22a9c396e2b17813458c191902a");
        } else if (i == 0) {
            this.e.compareAndSet(-1, 0);
        } else if (i == 5) {
            this.e.compareAndSet(0, 5);
        } else if (i == 10) {
            this.e.compareAndSet(0, 10);
        } else if (i != 15) {
        } else {
            this.e.set(15);
        }
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.b
    public int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7384d95533931b7bdf0ef3cad0fe739", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7384d95533931b7bdf0ef3cad0fe739")).intValue() : this.e.get();
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.b
    public final int b() {
        return this.c;
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab624c1ae291ad7d04df707dc9511e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab624c1ae291ad7d04df707dc9511e1");
        } else {
            com.dianping.nvnetwork.failover.f.a(str, str2, this.d);
        }
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.b
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a2159dd623a46fe072f0aa9aa70147", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a2159dd623a46fe072f0aa9aa70147");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b9b934205579fec6dd3df560b31c5ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b9b934205579fec6dd3df560b31c5ed");
        } else {
            a(15);
        }
    }
}
