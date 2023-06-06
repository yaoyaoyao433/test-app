package com.sankuai.waimai.business.page.home.list.future.complex;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    int b;
    boolean c;
    public int d;
    public int e;
    public boolean f;
    List<RocksServerModel> g;
    RocksServerModel h;
    int i;
    public int j;
    boolean k;
    private int l;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e87e568fe67a1589e7e927c085097ee5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e87e568fe67a1589e7e927c085097ee5");
            return;
        }
        this.c = false;
        this.d = -1;
        this.e = -1;
        this.i = 0;
        this.k = false;
    }

    public final void a(com.sankuai.waimai.business.page.home.list.future.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c016ef1e50ef728416ccc87b0260fe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c016ef1e50ef728416ccc87b0260fe7");
            return;
        }
        b();
        if (cVar == null) {
            return;
        }
        this.d = cVar.b;
        this.c = cVar.a;
        this.f = cVar.c;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29238884e88b713d71d96e86de82b705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29238884e88b713d71d96e86de82b705");
            return;
        }
        this.k = false;
        this.b = 0;
        this.l = 0;
        this.c = false;
        this.d = -1;
        this.i = 0;
        this.j = 0;
        if (this.g != null) {
            this.g.clear();
            this.g = null;
        }
        this.h = null;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dce5e6274539256f626201a4a512a775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dce5e6274539256f626201a4a512a775");
        } else {
            b();
        }
    }

    public final String a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715eef3078224cdff85a372694c11bce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715eef3078224cdff85a372694c11bce") : (!z && this.k) ? "040000" : "030000";
    }

    public final String b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "380945344a38b2dcd40c90b738f08b10", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "380945344a38b2dcd40c90b738f08b10") : (!z && this.k) ? "1" : "0";
    }
}
