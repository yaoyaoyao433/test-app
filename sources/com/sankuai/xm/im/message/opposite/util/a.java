package com.sankuai.xm.im.message.opposite.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.session.SessionId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a<S> {
    public static ChangeQuickRedirect c;
    private HashMap<SessionId, List<S>> a;
    private long b;
    private com.sankuai.xm.base.trace.a d;

    public abstract void a(Map<SessionId, List<S>> map);

    public a(long j) {
        Object[] objArr = {300L};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02939e5884f6d48a0da8ff2008aa46e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02939e5884f6d48a0da8ff2008aa46e8");
            return;
        }
        this.a = new HashMap<>();
        this.b = 300L;
        this.d = null;
    }

    public final void a(SessionId sessionId, List<S> list) {
        Object[] objArr = {sessionId, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "253f158c9ab40ca7d173be7b53b7d090", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "253f158c9ab40ca7d173be7b53b7d090");
            return;
        }
        c(sessionId, list);
        c();
    }

    public final synchronized List<S> b(SessionId sessionId, List<S> list) {
        Object[] objArr = {sessionId, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb3f8af445a92878ab81a27bbf5c531", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb3f8af445a92878ab81a27bbf5c531");
        }
        if (sessionId != null && list != null && this.a.containsKey(sessionId)) {
            List<S> list2 = this.a.get(sessionId);
            ArrayList arrayList = new ArrayList();
            for (S s : list) {
                if (!list2.contains(s)) {
                    arrayList.add(s);
                }
            }
            return arrayList;
        }
        return list;
    }

    private synchronized void c(SessionId sessionId, List<S> list) {
        Object[] objArr = {sessionId, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b39366639d5c7248c88d15c46de620", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b39366639d5c7248c88d15c46de620");
        } else if (sessionId == null || list == null) {
        } else {
            if (this.a.containsKey(sessionId)) {
                this.a.get(sessionId).addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            this.a.put(sessionId, arrayList);
        }
    }

    synchronized boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52fb3e69826305de26ffb919b78b0c3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52fb3e69826305de26ffb919b78b0c3")).booleanValue();
        }
        for (SessionId sessionId : this.a.keySet()) {
            List<S> list = this.a.get(sessionId);
            if (list != null && list.size() > 0) {
                return true;
            }
        }
        return false;
    }

    synchronized Map<SessionId, List<S>> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5828e089612b2445e8dab2ea1e15c6", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5828e089612b2445e8dab2ea1e15c6");
        }
        HashMap hashMap = new HashMap();
        if (this.a != null) {
            hashMap.putAll(this.a);
            this.a.clear();
        }
        return hashMap;
    }

    synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ad873ac0a04693502ebd2e98894d1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ad873ac0a04693502ebd2e98894d1e");
        } else if (this.d != null) {
            this.d.a();
        } else {
            this.d = new com.sankuai.xm.base.trace.a() { // from class: com.sankuai.xm.im.message.opposite.util.a.1
                public static ChangeQuickRedirect c;
                private g e = j.a();

                @Override // com.sankuai.xm.base.trace.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9b54334f8478c354bd8d6afa1647adb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9b54334f8478c354bd8d6afa1647adb");
                        return;
                    }
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.c;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "448a8db1a0880f1e4e846c3cb8fd1ee9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "448a8db1a0880f1e4e846c3cb8fd1ee9");
                        return;
                    }
                    aVar.d();
                    aVar.a(aVar.b());
                    if (aVar.a()) {
                        aVar.c();
                    }
                }
            };
            com.sankuai.xm.threadpool.scheduler.a.b().a(25, this.d, this.b);
        }
    }

    synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e488d61d8934fe421b8d0b41d5011a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e488d61d8934fe421b8d0b41d5011a1");
            return;
        }
        if (this.d != null) {
            this.d.cancel();
            this.d = null;
        }
    }
}
