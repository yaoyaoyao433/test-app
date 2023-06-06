package com.sankuai.xm.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private String b;
    private LinkedHashSet<c> c;
    private volatile boolean d;
    private Callback<Void> e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf5a0103b987a0de46f4a56805b9b929", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf5a0103b987a0de46f4a56805b9b929");
            return;
        }
        this.b = UUID.randomUUID().toString();
        this.c = new LinkedHashSet<>();
        this.d = false;
    }

    public final void a(Callback<Void> callback) {
        this.e = callback;
    }

    public final synchronized boolean a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a2dbea98c7957fa529f35df6a097a0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a2dbea98c7957fa529f35df6a097a0")).booleanValue();
        } else if (this.d) {
            return false;
        } else {
            this.c.add(cVar);
            cVar.p = this;
            com.sankuai.xm.log.a.b("MultipleRequest::addRequest: jobId: %s, req: %s, url: %s", this.b, cVar, cVar.j);
            return true;
        }
    }

    public final void b(c cVar) {
        boolean remove;
        boolean isEmpty;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa4acb9f21c7b1738390ee6caf0db47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa4acb9f21c7b1738390ee6caf0db47");
            return;
        }
        synchronized (this) {
            remove = this.c.remove(cVar);
            isEmpty = this.c.isEmpty();
        }
        com.sankuai.xm.log.a.b("MultipleRequest::CallbackProxy::onRequestDone: jobId: %s, remove: %s, url: %s, mReqSet.size(): %s", this.b, Boolean.valueOf(remove), cVar.j, Integer.valueOf(this.c.size()));
        if (isEmpty) {
            com.sankuai.xm.base.callback.a.a(this.e, null);
        }
    }

    public final String a() {
        return this.b;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d7689511aed871865f4d487d57c5ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d7689511aed871865f4d487d57c5ce");
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.c);
            this.d = true;
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                m.f().b((c) it.next());
            }
            if (linkedHashSet.isEmpty()) {
                com.sankuai.xm.log.a.b("MultipleRequest::post: nothing need to post, jobId: %s", this.b);
                com.sankuai.xm.base.callback.a.a(this.e, null);
            }
        }
    }
}
