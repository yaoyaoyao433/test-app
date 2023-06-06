package com.sankuai.xm.login.net.taskqueue;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    private static f a;
    public static ChangeQuickRedirect b;
    protected List<a> c;
    private final Object d;
    private Map<String, b> e;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, Object obj);

        void b(String str, Object obj);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b {
        public String a;
        public Object b;
        public long c;
        public int d;
        public int e;
        long f;
    }

    public static /* synthetic */ void a(d dVar, String str, b bVar) {
        b bVar2;
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "9938b36a16b4b5ce1b57993d790bc8de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "9938b36a16b4b5ce1b57993d790bc8de");
        } else if (bVar == null || ac.a(str)) {
        } else {
            synchronized (dVar.d) {
                bVar2 = dVar.e.get(str);
            }
            if (bVar2 == null) {
                com.sankuai.xm.login.d.d("RetryImpl::onTimer:info = null,key: " + str, new Object[0]);
                if (bVar.f != -1) {
                    a.a(bVar.f);
                    return;
                }
                return;
            }
            Object[] objArr2 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "8a5591ec55f07d97d6c3bf98fe016c10", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "8a5591ec55f07d97d6c3bf98fe016c10");
            } else if (bVar2 != null) {
                com.sankuai.xm.login.d.a("RetryImpl::onTimer:key: " + bVar2.a + " curRetries:" + bVar2.d);
                if (bVar2.d >= bVar2.e) {
                    Object[] objArr3 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "74faa0e02acd7d30e553345fda31e478", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "74faa0e02acd7d30e553345fda31e478");
                        return;
                    }
                    com.sankuai.xm.login.d.b("RetryImpl::onTimeout:key:%s", bVar2.a);
                    dVar.b(bVar2.a, bVar2.b);
                    return;
                }
                bVar2.d++;
                Object[] objArr4 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "4532e5bc1f0008d9af5893fe937b96ba", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "4532e5bc1f0008d9af5893fe937b96ba");
                    return;
                }
                com.sankuai.xm.login.d.b("RetryImpl::onRetry:key:%s", bVar2.a);
                dVar.a(bVar2.a, bVar2.b);
            }
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78215f95f9e0dee3b383968ed13989e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78215f95f9e0dee3b383968ed13989e0");
            return;
        }
        this.d = new Object();
        this.e = new HashMap();
        this.c = new ArrayList();
    }

    public final void a(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c3b204911bcfa4cb366ded71c0c164", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c3b204911bcfa4cb366ded71c0c164");
            return;
        }
        a();
        if (ac.a(bVar.a)) {
            return;
        }
        com.sankuai.xm.login.d.b("RetryImpl::addTimer:key:%s", bVar.a);
        synchronized (this.d) {
            if (this.e.containsKey(bVar.a)) {
                return;
            }
            long a2 = a.a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.net.taskqueue.d.1
                public static ChangeQuickRedirect a;
                private com.sankuai.xm.base.trace.g d = j.a();

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82bd777866d537fb89ebbb65ec61dd22", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82bd777866d537fb89ebbb65ec61dd22");
                        return;
                    }
                    try {
                        j.a(this.d);
                        d.a(d.this, bVar.a, bVar);
                        j.c(this.d);
                    } catch (Throwable th) {
                        j.a(this.d, th);
                        throw th;
                    }
                }
            }, bVar.c, true);
            if (a2 != -1) {
                bVar.f = a2;
                this.e.put(bVar.a, bVar);
            }
        }
    }

    public final b b(String str) {
        long j;
        b remove;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "681ce91cb698c8576652db1a4f40a4d3", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "681ce91cb698c8576652db1a4f40a4d3");
        }
        synchronized (this.d) {
            j = this.e.containsKey(str) ? this.e.get(str).f : -1L;
            remove = this.e.remove(str);
        }
        if (j != -1) {
            a.a(j);
        }
        return remove;
    }

    private static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cda978d7e82e1aec54e8e39a50d944f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cda978d7e82e1aec54e8e39a50d944f0");
        } else if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    f fVar = new f();
                    a = fVar;
                    fVar.d();
                }
            }
        }
    }

    private void a(String str, Object obj) {
        ArrayList<a> arrayList;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f225a3c1e78cf59d015145ecec329832", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f225a3c1e78cf59d015145ecec329832");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.c);
        }
        for (a aVar : arrayList) {
            aVar.a(str, obj);
        }
    }

    private void b(String str, Object obj) {
        ArrayList<a> arrayList;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16c45fb5d559743ce4578f1c5b3aa863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16c45fb5d559743ce4578f1c5b3aa863");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.c);
        }
        for (a aVar : arrayList) {
            aVar.b(str, obj);
        }
    }
}
