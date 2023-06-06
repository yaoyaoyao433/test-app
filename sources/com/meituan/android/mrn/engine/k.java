package com.meituan.android.mrn.engine;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.meituan.android.mrn.engine.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private static int v;
    private volatile boolean A;
    public ReactInstanceManager b;
    public long c;
    public int d;
    public long e;
    public p f;
    int g;
    public final List<l> h;
    public e i;
    public e j;
    public String k;
    public String l;
    public boolean m;
    public Map<com.meituan.android.mrn.container.b, Object> n;
    public boolean o;
    public List<com.facebook.react.i> p;
    a q;
    public com.meituan.android.mrn.monitor.i r;
    public Bundle s;
    final List<b> t;
    private Handler u;
    private AtomicInteger w;
    private String x;
    private com.meituan.android.mrn.config.q y;
    private Runnable z;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20334031f2983176ff9388674d06cf84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20334031f2983176ff9388674d06cf84");
            return;
        }
        this.u = new Handler(Looper.getMainLooper());
        this.d = -1;
        this.f = p.PENDING;
        this.w = new AtomicInteger(0);
        this.g = 0;
        this.h = new ArrayList();
        this.m = false;
        this.x = String.valueOf(hashCode());
        this.n = new WeakHashMap();
        this.o = false;
        this.p = new ArrayList();
        this.z = new Runnable() { // from class: com.meituan.android.mrn.engine.k.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eea119027655e685b19a55c0cd92f7e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eea119027655e685b19a55c0cd92f7e0");
                } else {
                    k.this.e();
                }
            }
        };
        this.t = new ArrayList();
        this.A = false;
    }

    public static /* synthetic */ void a(k kVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "d404cd38264c90c1ae54da9a7f1e8c05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "d404cd38264c90c1ae54da9a7f1e8c05");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNInstance@destroy]", "MRNInstance:mrn destory " + kVar);
        try {
            if (kVar.p != null) {
                kVar.p.clear();
            }
            if (kVar.b != null) {
                kVar.b.destroy();
            }
            kVar.a((ReactInstanceManager) null);
            kVar.q = null;
        } catch (Throwable unused) {
        }
    }

    public final boolean a(e eVar, Runnable runnable) {
        boolean z;
        e bundle;
        Object[] objArr = {eVar, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728dcc45e97c6f7a13382325d69bcfe8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728dcc45e97c6f7a13382325d69bcfe8")).booleanValue();
        }
        if (this.b == null || eVar == null) {
            com.meituan.android.mrn.utils.p.a("[MRNInstance@runJsBundle]", "runJsBundle mReactInstanceManager == null or bundle == null");
            com.meituan.android.mrn.monitor.g.a().a(eVar).c(true);
            return false;
        }
        String str = eVar.c;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b0568221eb860e0f1e45df2de2cd077", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b0568221eb860e0f1e45df2de2cd077")).booleanValue();
        } else {
            if (this.b.getCurrentReactContext() != null && this.b.getCurrentReactContext().getCatalystInstance() != null) {
                for (String str2 : this.b.getCurrentReactContext().getCatalystInstance().getLoadedJSList()) {
                    if (str2 != null && !TextUtils.isEmpty(str2) && str2.contains(str)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        if (z) {
            return false;
        }
        eVar.b();
        List<e.a> list = eVar.n;
        if (list != null) {
            for (e.a aVar : list) {
                if (aVar != null && (bundle = MRNBundleManager.sharedInstance().getBundle(aVar.b, aVar.c)) != null) {
                    b(bundle, null);
                }
            }
        }
        b(eVar, runnable);
        this.i = eVar;
        if (this.r != null && this.r.c != null) {
            com.meituan.android.mrn.monitor.c cVar = this.r.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.monitor.c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "61c04bb785bfa46037feccdfc8eb4889", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "61c04bb785bfa46037feccdfc8eb4889");
            } else {
                cVar.b.bundleDidLoadTime = System.currentTimeMillis();
                if (cVar.d != null) {
                    cVar.d.recordStep("bundleDidLoad");
                }
            }
        }
        return true;
    }

    private void b(e eVar, Runnable runnable) {
        Object[] objArr = {eVar, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8559d0d601c0bd85bf65006cd01077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8559d0d601c0bd85bf65006cd01077");
        } else if (eVar == null) {
            throw new j("bundle is null");
        } else {
            if (!eVar.d()) {
                throw new j("bundle file don't exist or is not file " + eVar);
            }
            com.meituan.android.mrn.utils.p.a("[MRNInstance@runJsBundleInner]", "runJsBundle " + eVar);
            this.b.runJsBundle(eVar.a(runnable));
            com.meituan.android.mrn.monitor.g.a().a(eVar).c(true);
        }
    }

    public final void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29d896c254fdbb59b5d6e1aab54d0654", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29d896c254fdbb59b5d6e1aab54d0654");
        } else if (lVar == null) {
        } else {
            if (this.b != null && this.b.hasInitializeReactContext() && (this.f == p.READY || this.f == p.DIRTY || this.f == p.USED)) {
                com.meituan.android.mrn.utils.p.a("[MRNInstance@addInstanceEventListener]", "addInstanceEventListener onSuccess and return");
                lVar.a(this);
                return;
            }
            com.meituan.android.mrn.utils.p.a("[MRNInstance@addInstanceEventListener]", "addInstanceEventListener");
            synchronized (this.h) {
                if (!this.h.contains(lVar)) {
                    this.h.add(lVar);
                }
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d31d6edc2719ceff81da9c1a9b4e3d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d31d6edc2719ceff81da9c1a9b4e3d1");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNInstance@notifyAllWhenSuccess]", this.k + StringUtil.SPACE + this.h.size());
        synchronized (this.h) {
            for (l lVar : this.h) {
                if (lVar != null) {
                    lVar.a(this);
                }
            }
            this.h.clear();
        }
    }

    public final Set<com.meituan.android.mrn.container.b> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58fc1315b0ab347c95c6eacc6bc8369d", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58fc1315b0ab347c95c6eacc6bc8369d") : new HashSet(this.n.keySet());
    }

    public final com.meituan.android.mrn.container.b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6162161def88c6697c6da9075476f534", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.container.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6162161def88c6697c6da9075476f534");
        }
        for (com.meituan.android.mrn.container.b bVar : this.n.keySet()) {
            if (bVar != null && bVar.b() != null && bVar.b().getRootViewTag() == i) {
                return bVar;
            }
        }
        return null;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c9e111606b0d7c528edf2c7935e518", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c9e111606b0d7c528edf2c7935e518")).intValue();
        }
        int incrementAndGet = this.w.incrementAndGet();
        if (incrementAndGet > 0) {
            com.facebook.common.logging.a.b("DestructThread", "retainCount:" + incrementAndGet);
            this.f = p.USED;
            this.u.removeCallbacks(this.z);
        }
        this.g++;
        return incrementAndGet;
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6e48f223bd43b56d8d6c7c46417b7c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6e48f223bd43b56d8d6c7c46417b7c2")).intValue();
        }
        com.meituan.android.mrn.utils.p.a("[MRNInstance@releaseCount]", "MRNInstance:releaseCount " + this);
        int i = v > 0 ? v : 120000;
        if (this.f == p.ERROR) {
            e();
            com.facebook.common.logging.a.a("MRNInstance", "instance error to be recycle");
            return 0;
        }
        int decrementAndGet = this.w.decrementAndGet();
        if (decrementAndGet == 0) {
            com.facebook.common.logging.a.b("DestructThread", "releaseCount:" + decrementAndGet);
            this.f = p.DIRTY;
            if (!w.b(this.k)) {
                this.u.postDelayed(this.z, i);
            }
            if (this.q != null) {
                this.q.a();
            }
        }
        return decrementAndGet;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc655aeadf586b77e143d3eda7eff03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc655aeadf586b77e143d3eda7eff03");
            return;
        }
        this.u.removeCallbacks(this.z);
        o.a().a(this);
        w.a(this.k);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.engine.k.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb3269ff3b54dfb942d4982128404223", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb3269ff3b54dfb942d4982128404223");
                } else {
                    k.a(k.this);
                }
            }
        });
        com.facebook.common.logging.a.b("DestructThread", this + "被从队列中移出销毁，即将被GC");
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51bd34e07945775c69253cb31cb21dd5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51bd34e07945775c69253cb31cb21dd5")).intValue() : this.w.get();
    }

    public final boolean a(com.facebook.react.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd6c0310639c4adbeea18ee4648789bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd6c0310639c4adbeea18ee4648789bd")).booleanValue();
        }
        if (iVar == null) {
            return true;
        }
        ArrayList<com.facebook.react.i> arrayList = new ArrayList();
        arrayList.addAll(this.p);
        for (com.facebook.react.i iVar2 : arrayList) {
            if (iVar2 != null && (iVar2 == iVar || iVar2.getClass() == iVar.getClass())) {
                return true;
            }
        }
        return false;
    }

    public final void a(ReactInstanceManager reactInstanceManager) {
        Object[] objArr = {reactInstanceManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3b6af7ff5acb50923d9aeb2f85f468f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3b6af7ff5acb50923d9aeb2f85f468f");
            return;
        }
        this.b = reactInstanceManager;
        Object[] objArr2 = new Object[1];
        StringBuilder sb = new StringBuilder("MRNInstance:setReactInstanceManager ");
        sb.append(this);
        sb.append(StringUtil.SPACE);
        sb.append(this.b == null);
        objArr2[0] = sb.toString();
        com.meituan.android.mrn.utils.p.a("[MRNInstance@setReactInstanceManager]", objArr2);
    }

    public final com.meituan.android.mrn.config.q a(com.meituan.android.mrn.config.q qVar) {
        if (qVar != null && qVar != this.y) {
            this.y = qVar;
        }
        return this.y;
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fcce299b121e9107028e191054b2265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fcce299b121e9107028e191054b2265");
        } else if (!this.A) {
            this.A = true;
            synchronized (this.t) {
                if (this.t.size() > 0) {
                    for (b bVar : this.t) {
                        bVar.a();
                    }
                }
            }
        }
    }
}
