package com.dianping.imagemanager.utils.lifecycle;

import com.dianping.imagemanager.utils.g;
import com.dianping.imagemanager.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Set<d> b;
    private Integer c;

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f152b8db74968101e1b07f1f47e60f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f152b8db74968101e1b07f1f47e60f");
            return;
        }
        this.b = Collections.newSetFromMap(new WeakHashMap());
        this.c = Integer.valueOf(i);
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "512824d011d262eb42a043a6c8c5ec45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "512824d011d262eb42a043a6c8c5ec45");
        } else {
            this.b.add(dVar);
        }
    }

    public final void b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e417f71aa1217f3ba4a6aca8d82c640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e417f71aa1217f3ba4a6aca8d82c640");
        } else {
            this.b.remove(dVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "781271ed3fbf38a7a44f418aba000149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "781271ed3fbf38a7a44f418aba000149");
            return;
        }
        k.a("ActivityLifecycle", "onStart key=" + this.c);
        for (d dVar : g.a(this.b)) {
            dVar.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bba2c3547b80d7ac3513d7246910229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bba2c3547b80d7ac3513d7246910229");
            return;
        }
        k.a("ActivityLifecycle", "onResume key=" + this.c);
        Iterator it = g.a(this.b).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73ed206d6c25029b09c3d1d22ed4f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73ed206d6c25029b09c3d1d22ed4f0f");
            return;
        }
        k.a("ActivityLifecycle", "onPause key=" + this.c);
        Iterator it = g.a(this.b).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c4c563997a334ece94f1cd0c3b01a60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c4c563997a334ece94f1cd0c3b01a60");
            return;
        }
        k.a("ActivityLifecycle", "onStop key=" + this.c);
        for (d dVar : g.a(this.b)) {
            dVar.b();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4445a927d20876b2f77f2d2c34a917e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4445a927d20876b2f77f2d2c34a917e7");
            return;
        }
        k.a("ActivityLifecycle", "onDestroy key=" + this.c);
        for (d dVar : g.a(this.b)) {
            dVar.c();
        }
    }
}
