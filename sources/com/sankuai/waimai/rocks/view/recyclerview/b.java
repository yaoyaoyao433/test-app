package com.sankuai.waimai.rocks.view.recyclerview;

import android.graphics.Rect;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.rocks.view.block.d;
import com.sankuai.waimai.rocks.view.viewmodel.d;
import com.sankuai.waimai.rocks.view.viewmodel.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.meituan.android.cube.pga.block.b<com.sankuai.waimai.rocks.view.viewmodel.d, com.sankuai.waimai.rocks.view.block.c> {
    public static ChangeQuickRedirect f;
    private com.sankuai.waimai.rocks.view.recyclerview.footer.a A;
    private d.a B;
    private boolean C;
    private d D;
    private volatile boolean E;
    public RecyclerView g;
    public com.sankuai.waimai.rocks.view.recyclerview.a h;
    private com.sankuai.waimai.rocks.view.block.a i;
    private com.meituan.android.cube.pga.block.a r;
    private com.sankuai.waimai.rocks.view.mach.a s;
    private c t;
    private a u;
    private com.sankuai.waimai.rocks.expose.a v;
    private int w;
    private String x;
    private Fragment y;
    private com.meituan.android.cube.pga.type.a z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public b(com.sankuai.waimai.rocks.view.block.c cVar, RecyclerView recyclerView, com.sankuai.waimai.rocks.view.recyclerview.footer.a aVar, a aVar2, com.sankuai.waimai.rocks.expose.a aVar3, com.sankuai.waimai.rocks.view.mach.a aVar4, String str, Fragment fragment, com.meituan.android.cube.pga.type.a aVar5, d.a aVar6, boolean z) {
        Object[] objArr = {cVar, recyclerView, aVar, aVar2, aVar3, aVar4, str, fragment, aVar5, aVar6, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b69a1a330d32f6f14c6dfcf7e38e331f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b69a1a330d32f6f14c6dfcf7e38e331f");
            return;
        }
        this.E = false;
        this.g = recyclerView;
        this.u = aVar2;
        this.v = aVar3;
        this.s = aVar4;
        this.x = str;
        this.y = fragment;
        this.z = aVar5;
        this.A = aVar;
        this.B = aVar6;
        this.C = z;
        a((b) cVar);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8002dbe89f6a866f6c5ee3026ec21ecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8002dbe89f6a866f6c5ee3026ec21ecb");
            return;
        }
        super.s();
        this.t = new c();
        this.h = new com.sankuai.waimai.rocks.view.recyclerview.a(this, this.s, this.y, this.z, this.B, this.C);
        if (this.i != null) {
            this.h.f = this.i;
        }
        if (this.A != null) {
            this.r = this.A.a(F());
            this.h.a(this.r);
        }
        this.g.setAdapter(this.h);
        if (this.v != null) {
            this.v.a((com.sankuai.waimai.rocks.expose.a) this.t);
        }
        this.t.a((View) this.g);
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "750d1d7d97e43f7a2a8e12a2ad6c4ac4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "750d1d7d97e43f7a2a8e12a2ad6c4ac4");
        } else {
            a((View) null, i);
        }
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13ddc65d80e35655b7178dd1356fe2f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13ddc65d80e35655b7178dd1356fe2f6");
            return;
        }
        if (i == 0) {
            this.t.b();
            x();
        }
        d(i);
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48b6cfdc18ca193f8569c04f6b93be87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48b6cfdc18ca193f8569c04f6b93be87");
            return;
        }
        String a2 = com.sankuai.waimai.rocks.log.c.a(this.x);
        if (i == 0) {
            Metrics.getInstance().stopCustomFPS("rocks_mach_scroll");
            Metrics.getInstance().stopCustomFPS(a2);
        } else if (i == 1) {
            Metrics.getInstance().startCustomFPS("rocks_mach_scroll");
            Metrics.getInstance().startCustomFPS(a2);
        }
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a9fe14812d6c4e90579344713f31b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a9fe14812d6c4e90579344713f31b1");
        } else {
            this.t.b();
        }
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc0f67feab2c7efc8d0e19d77b0a49e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc0f67feab2c7efc8d0e19d77b0a49e");
        } else if (this.g.getLayoutManager() == null || this.u == null || !((com.sankuai.waimai.rocks.view.viewmodel.d) this.n).r) {
        } else {
            RecyclerView.LayoutManager layoutManager = this.g.getLayoutManager();
            int a2 = com.sankuai.waimai.rocks.view.utils.a.a(layoutManager);
            if (!((com.sankuai.waimai.rocks.view.viewmodel.d) this.n).s) {
                if (a2 >= layoutManager.getItemCount() - 1) {
                    this.u.a();
                }
            } else if (a2 >= (layoutManager.getItemCount() - 1) - (this.w / 2)) {
                this.u.a();
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void a(com.sankuai.waimai.rocks.view.viewmodel.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c060eceb853b435a5b9de5b151d85f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c060eceb853b435a5b9de5b151d85f");
            return;
        }
        super.a((b) dVar);
        a(dVar, 0);
    }

    public final void a(com.sankuai.waimai.rocks.view.viewmodel.d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d951f75d9b9ff9197dd3f802727cdf4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d951f75d9b9ff9197dd3f802727cdf4f");
            return;
        }
        d.a aVar = dVar.u;
        if (this.g.getLayoutManager() == null) {
            if (dVar.q != null) {
                this.g.setPadding(dVar.q.e == 0 ? this.g.getPaddingLeft() : e(dVar.q.e), dVar.q.g == 0 ? this.g.getPaddingTop() : e(dVar.q.g), dVar.q.f == 0 ? this.g.getPaddingRight() : e(dVar.q.f), dVar.q.h == 0 ? this.g.getPaddingBottom() : e(dVar.q.h));
                ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = e(dVar.q.a);
                    marginLayoutParams.rightMargin = e(dVar.q.b);
                    this.g.setLayoutParams(marginLayoutParams);
                }
            }
            this.g.setLayoutManager(dVar.p);
        }
        if (this.D == null) {
            this.D = new d();
            this.g.addItemDecoration(this.D);
        }
        if (dVar.q.i != 0) {
            this.D.b = dVar.q.i;
        }
        if (aVar == d.a.MAIN) {
            super.a((b) dVar);
            if (!dVar.t) {
                this.h.c();
            }
            int b = this.h.b();
            int u = u();
            if (u > b) {
                this.w = u - b;
            }
            if (i > 0 && i < b) {
                this.h.c();
                u = u();
                b = 0;
            }
            if (u > b) {
                b(dVar);
                if (!y()) {
                    this.h.a(dVar.o.subList(b, u));
                }
                this.E = dVar.b;
                return;
            }
            return;
        }
        this.h.b(dVar.o);
    }

    private void b(com.sankuai.waimai.rocks.view.viewmodel.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6302e5eb9a0f1d88d5625a669ac6aae7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6302e5eb9a0f1d88d5625a669ac6aae7");
        } else if (dVar == null || this.E == dVar.b || dVar.b || CollectionUtils.isEmpty(this.h.b)) {
        } else {
            this.h.c();
        }
    }

    public final void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed1a8ee09159451c44c9e4fca15e498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed1a8ee09159451c44c9e4fca15e498");
        } else if (this.n == 0 || ((com.sankuai.waimai.rocks.view.viewmodel.d) this.n).o.size() <= 0 || i > ((com.sankuai.waimai.rocks.view.viewmodel.d) this.n).o.size()) {
        } else {
            ((com.sankuai.waimai.rocks.view.viewmodel.d) this.n).o.add(i, eVar);
            if (y()) {
                return;
            }
            this.h.a(eVar, i);
        }
    }

    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b82da9dcbccc1daff7417141ba5df2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b82da9dcbccc1daff7417141ba5df2d");
        } else if (this.t != null) {
            this.t.c = rect;
        }
    }

    public final void a(com.meituan.android.cube.pga.block.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d244f25c91751da93cde9eefd4fe6a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d244f25c91751da93cde9eefd4fe6a7");
            return;
        }
        this.r = aVar;
        if (aVar != null) {
            this.h.a(this.r);
        }
    }

    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8d01072c10af58583ddee4b8e04b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8d01072c10af58583ddee4b8e04b0c");
            return;
        }
        this.r = null;
        this.h.a((com.meituan.android.cube.pga.block.a) null);
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f67df36201aee9019ada5195ba5e9ee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f67df36201aee9019ada5195ba5e9ee3");
        } else if (this.r != null) {
            a(i, "");
        }
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caefed7d43c19bc039912fbe4f6d0341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caefed7d43c19bc039912fbe4f6d0341");
        } else if (this.r != null) {
            this.r.a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.rocks.view.recyclerview.footer.c(i, str));
        }
    }

    public final int u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6008ec1fde56a76070531a285abd339", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6008ec1fde56a76070531a285abd339")).intValue();
        }
        com.sankuai.waimai.rocks.view.viewmodel.d dVar = (com.sankuai.waimai.rocks.view.viewmodel.d) this.n;
        if (dVar == null || dVar.o == null || CollectionUtils.isEmpty(dVar.o)) {
            return 0;
        }
        return dVar.o.size();
    }

    private int e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e66cd7eac8c0bd4fd4f8f3987b661e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e66cd7eac8c0bd4fd4f8f3987b661e")).intValue() : g.a(m(), i);
    }

    private boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7621d11cf5619f3ce554eb1bd678e2dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7621d11cf5619f3ce554eb1bd678e2dd")).booleanValue();
        }
        if (this.C) {
            return this.g.isComputingLayout();
        }
        return false;
    }
}
