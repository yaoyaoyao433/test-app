package com.sankuai.waimai.machpro.instance;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.machpro.animator.i;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPBridge;
import com.sankuai.waimai.machpro.bridge.MPJSContext;
import com.sankuai.waimai.machpro.bridge.c;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.list.d;
import com.sankuai.waimai.machpro.component.text.f;
import com.sankuai.waimai.machpro.container.g;
import com.sankuai.waimai.machpro.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    public MachMap A;
    public String B;
    public final com.sankuai.waimai.machpro.bridge.b C;
    private final c D;
    public FrameLayout b;
    public FrameLayout c;
    public com.sankuai.waimai.mach.manager.cache.c d;
    public MPContext e;
    public MPJSContext f;
    public boolean g;
    public MPBridge h;
    public MachMap i;
    public MachMap j;
    public Set<String> k;
    public LinkedList<h> l;
    public LinkedList<c> m;
    public MachMap n;
    public LinkedList<com.sankuai.waimai.machpro.b> o;
    public long p;
    public com.sankuai.waimai.machpro.monitor.b q;
    public com.sankuai.waimai.machpro.view.pool.a r;
    public g.a s;
    public String t;
    public RecyclerView.k u;
    public com.sankuai.waimai.machpro.animator.b v;
    public d w;
    public Map<String, WeakReference<MPComponent>> x;
    public List<b> y;
    public com.sankuai.waimai.machpro.adapter.b z;

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa41684ece73b09f2fd710503a35f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa41684ece73b09f2fd710503a35f14");
        }
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5cbaa560cd6df09d9e59b7868f3791d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5cbaa560cd6df09d9e59b7868f3791d");
            return;
        }
        this.C = new com.sankuai.waimai.machpro.bridge.b() { // from class: com.sankuai.waimai.machpro.instance.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.bridge.b
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ebd71294bf0585a78836c6789acab23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ebd71294bf0585a78836c6789acab23");
                    return;
                }
                if (a.this.o != null) {
                    Iterator it = a.this.o.iterator();
                    while (it.hasNext()) {
                        com.sankuai.waimai.machpro.b bVar = (com.sankuai.waimai.machpro.b) it.next();
                        if (bVar != null) {
                            bVar.a(th);
                        }
                    }
                }
                com.sankuai.waimai.machpro.exception.a a2 = com.sankuai.waimai.machpro.exception.a.a();
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.exception.a.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "dff114e6de22057db8c952f17aa51309", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "dff114e6de22057db8c952f17aa51309");
                    return;
                }
                Iterator<Object> it2 = a2.b.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        };
        this.D = new c() { // from class: com.sankuai.waimai.machpro.instance.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.bridge.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f30c3131b6ed84bdd652274271a2c83", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f30c3131b6ed84bdd652274271a2c83");
                } else if (a.this.m != null) {
                    Iterator it = a.this.m.iterator();
                    while (it.hasNext()) {
                        c cVar = (c) it.next();
                        if (cVar != null) {
                            cVar.a();
                        }
                    }
                }
            }
        };
        this.e = new MPContext(this);
        this.e.setContext(context);
        this.x = new HashMap();
        this.r = new com.sankuai.waimai.machpro.view.pool.a(this.e.getContext());
        this.v = new com.sankuai.waimai.machpro.animator.b(context);
    }

    public final void a(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5966d038693ad9ecb0bed9134aa87a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5966d038693ad9ecb0bed9134aa87a");
        } else if (machMap == null || machMap.size() <= 0) {
        } else {
            if (this.i == null) {
                this.i = machMap;
            } else {
                this.i.putAll(machMap);
            }
            if (this.f != null) {
                this.f.a(this.i);
            }
        }
    }

    public final com.sankuai.waimai.machpro.view.pool.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01910a218f931b08f983a8383cbe66f1", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.machpro.view.pool.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01910a218f931b08f983a8383cbe66f1") : this.r.j;
    }

    public final void a(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc1ae093606e842149f32d8fd45eee49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc1ae093606e842149f32d8fd45eee49");
        } else if (!TextUtils.isEmpty(str) && this.k != null) {
            for (String str2 : this.k) {
                if (str.equals(str2) && this.f != null) {
                    this.f.a(str, machMap);
                }
            }
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59344622bf8b9dee8914ae99f2baf359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59344622bf8b9dee8914ae99f2baf359");
            return;
        }
        if (this.y == null) {
            this.y = new LinkedList();
        }
        if (this.y.contains(bVar)) {
            return;
        }
        this.y.add(bVar);
    }

    public final void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c63a5de40fe52b666cc6a142b3abaf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c63a5de40fe52b666cc6a142b3abaf3");
        } else if (this.y != null) {
            this.y.remove(bVar);
        }
    }

    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360701e50838133b750cf548788463ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360701e50838133b750cf548788463ae");
        } else if (hVar != null) {
            if (this.l == null) {
                this.l = new LinkedList<>();
            }
            if (this.l.contains(hVar)) {
                return;
            }
            this.l.add(hVar);
        }
    }

    public final void b(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b70313fe145b0ea994c1a99b249e8b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b70313fe145b0ea994c1a99b249e8b5");
        } else if (hVar == null || this.l == null) {
        } else {
            this.l.remove(hVar);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "253006fd6588da6cce8886489d5b1963", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "253006fd6588da6cce8886489d5b1963");
            return;
        }
        if (this.A != null) {
            this.A.put("layoutEndTime", Long.valueOf(System.currentTimeMillis()));
            com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.instance.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4b5a755126fd339a3a32e056133b38d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4b5a755126fd339a3a32e056133b38d");
                    } else if (a.this.f != null) {
                        MPJSContext mPJSContext = a.this.f;
                        MachMap machMap = a.this.A;
                        Object[] objArr3 = {machMap};
                        ChangeQuickRedirect changeQuickRedirect3 = MPJSContext.a;
                        if (PatchProxy.isSupport(objArr3, mPJSContext, changeQuickRedirect3, false, "e17c14c5805457264b41c2b2c8d83a7d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, mPJSContext, changeQuickRedirect3, false, "e17c14c5805457264b41c2b2c8d83a7d");
                        } else if (machMap != null) {
                            mPJSContext.a();
                            if (mPJSContext.c) {
                                return;
                            }
                            try {
                                mPJSContext._wirtePerformanceData(mPJSContext.b, machMap);
                            } catch (Exception e) {
                                com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
                            }
                        }
                    }
                }
            });
        }
        if (this.d != null) {
            long elapsedRealtime = this.p > 0 ? SystemClock.elapsedRealtime() - this.p : 0L;
            com.sankuai.waimai.machpro.monitor.c.a().a(this.q);
            com.sankuai.waimai.machpro.util.a.b("MachPro | first layout completed! | " + elapsedRealtime + "ms | " + com.sankuai.waimai.machpro.util.b.a(this.d));
        }
        if (this.o != null) {
            Iterator<com.sankuai.waimai.machpro.b> it = this.o.iterator();
            while (it.hasNext()) {
                com.sankuai.waimai.machpro.b next = it.next();
                if (next != null) {
                    next.a();
                }
            }
        }
    }

    public final void c() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d0c9f3d17cb96b6aa61b3266ccbbd69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d0c9f3d17cb96b6aa61b3266ccbbd69");
            return;
        }
        if (this.o != null) {
            Iterator<com.sankuai.waimai.machpro.b> it = this.o.iterator();
            while (it.hasNext()) {
                com.sankuai.waimai.machpro.b next = it.next();
                if (next != null) {
                    next.b();
                }
            }
        }
        if (this.d != null) {
            if (this.p > 0) {
                j = SystemClock.elapsedRealtime() - this.p;
                this.p = 0L;
            } else {
                j = 0;
            }
            com.sankuai.waimai.machpro.util.a.b("MachPro | render completed! | " + j + "ms | " + com.sankuai.waimai.machpro.util.b.a(this.d));
            com.sankuai.waimai.machpro.util.a.d("渲染完成 | " + j + "ms | " + com.sankuai.waimai.machpro.util.b.a(this.d));
        }
        final com.sankuai.waimai.machpro.view.pool.a aVar = this.r;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.view.pool.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "42d2823a2b8298e29cf1b663e5218633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "42d2823a2b8298e29cf1b663e5218633");
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.sankuai.waimai.machpro.view.pool.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4701fb87fa9a3c142d80efb66288ef6e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4701fb87fa9a3c142d80efb66288ef6e");
                        return;
                    }
                    a aVar2 = aVar;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "c7acfa1b5528ec5b0bce2954d2596469", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "c7acfa1b5528ec5b0bce2954d2596469");
                    } else if (TextUtils.isEmpty(aVar2.b)) {
                    } else {
                        if (aVar2.f > aVar2.c || aVar2.g > aVar2.d || aVar2.h > aVar2.e) {
                            aVar2.c = aVar2.f;
                            aVar2.d = aVar2.g;
                            aVar2.e = aVar2.h;
                            String str = aVar2.f + CommonConstant.Symbol.COMMA + aVar2.g + CommonConstant.Symbol.COMMA + aVar2.h;
                            l.b(aVar2.i, "mach_pro", aVar2.b, str);
                            com.sankuai.waimai.machpro.util.a.d("saveCount-->" + str);
                        }
                    }
                }
            }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }

    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd525ceaa77ef6ac8fccabb0e6e581b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd525ceaa77ef6ac8fccabb0e6e581b6");
        } else {
            this.C.a(exc);
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c3496c13a493049492e86bc6bba7ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c3496c13a493049492e86bc6bba7ec9");
        } else if (this.y != null) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                b bVar = this.y.get(size);
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    static {
        new i();
        new com.sankuai.waimai.machpro.component.text.b(null);
        new f(null);
    }
}
