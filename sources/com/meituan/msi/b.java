package com.meituan.msi;

import com.meituan.msi.api.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.msi.lifecycle.a, com.meituan.msi.lifecycle.b {
    public static ChangeQuickRedirect a;
    private final com.meituan.msi.api.b b;
    private final d c;

    public b(com.meituan.msi.api.b bVar, d dVar) {
        Object[] objArr = {bVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4953023f99240d286d3d535450da7e37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4953023f99240d286d3d535450da7e37");
            return;
        }
        this.b = bVar;
        this.c = dVar;
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd52e67a06a2a61517d90e370b470db6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd52e67a06a2a61517d90e370b470db6");
            return;
        }
        this.b.a();
        this.c.a();
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3316d27889a7567f07a14b0b8f3fa0f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3316d27889a7567f07a14b0b8f3fa0f1");
            return;
        }
        this.b.b();
        this.c.b();
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b1b52634975f0a5bdf3ca7bf8f099b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b1b52634975f0a5bdf3ca7bf8f099b3");
            return;
        }
        this.b.c();
        this.c.c();
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a94df77bdb4d3eda5535ec98807ac30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a94df77bdb4d3eda5535ec98807ac30");
            return;
        }
        this.b.d();
        this.c.d();
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17c5a81511606e18b98a64d3330b812f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17c5a81511606e18b98a64d3330b812f");
        } else {
            this.b.b(i);
        }
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e9bd2f67850fe4b402c9ff83cc60c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e9bd2f67850fe4b402c9ff83cc60c9");
        } else {
            this.b.a(i);
        }
    }
}
