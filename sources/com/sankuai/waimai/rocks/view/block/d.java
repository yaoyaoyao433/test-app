package com.sankuai.waimai.rocks.view.block;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.rocks.view.block.a<com.sankuai.waimai.rocks.view.mach.e, c> {
    public static ChangeQuickRedirect s;
    private com.sankuai.waimai.rocks.view.mach.a t;
    private com.sankuai.waimai.mach.recycler.a u;
    private b v;
    private a w;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        boolean a(View view, com.sankuai.waimai.rocks.view.viewmodel.a aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(int i);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final /* synthetic */ void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        final com.sankuai.waimai.rocks.view.viewmodel.e eVar = (com.sankuai.waimai.rocks.view.viewmodel.e) aVar;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "783f6225561a87a879b320de2aed8f46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "783f6225561a87a879b320de2aed8f46");
            return;
        }
        super.a((d) eVar);
        if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) {
            final FrameLayout a2 = ((com.sankuai.waimai.rocks.view.mach.e) this.g).a();
            a2.removeAllViews();
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            final int a3 = com.sankuai.waimai.foundation.utils.g.a(m(), eVar.s.q.g);
            final int a4 = com.sankuai.waimai.foundation.utils.g.a(m(), eVar.s.q.f);
            final com.sankuai.waimai.rocks.view.viewmodel.a aVar2 = (com.sankuai.waimai.rocks.view.viewmodel.a) eVar;
            if (aVar2.p == 0) {
                layoutParams.height = 1;
                layoutParams.width = eVar.s.q.m;
            } else if (this.w == null || this.w.a(a2, aVar2)) {
                layoutParams.height = -2;
                layoutParams.width = aVar2.p.d() + a4;
                this.t.a(aVar2.p, this.u, a2);
                a(aVar2, a2, a3, a4);
                a(aVar2);
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = s;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f6724a838456736a9bf1c035f5f95c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f6724a838456736a9bf1c035f5f95c8");
                } else {
                    ((com.sankuai.waimai.rocks.view.mach.e) this.g).a(eVar.s.q.l);
                }
                if (aVar2.p instanceof com.sankuai.waimai.mach.recycler.c) {
                    ((com.sankuai.waimai.mach.recycler.c) aVar2.p).h = new com.sankuai.waimai.mach.f() { // from class: com.sankuai.waimai.rocks.view.block.d.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.f
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b514706d97981e789845110c4a7c12e8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b514706d97981e789845110c4a7c12e8");
                                return;
                            }
                            d.this.a(aVar2, a2, a3, a4);
                            d.this.a(aVar2);
                            if (d.this.v != null) {
                                d.this.v.a(eVar.w);
                            }
                        }
                    };
                }
                eVar.o();
                this.u = aVar2.p;
            }
        }
    }

    public d(com.sankuai.waimai.rocks.view.mach.a aVar, c cVar, b bVar, a aVar2) {
        super(cVar);
        Object[] objArr = {aVar, cVar, bVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b7ab29c468c0db7665896ca0af7a14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b7ab29c468c0db7665896ca0af7a14");
            return;
        }
        this.t = aVar;
        this.v = bVar;
        this.w = aVar2;
    }

    @Override // com.meituan.android.cube.pga.block.a
    /* renamed from: P */
    public com.sankuai.waimai.rocks.view.mach.e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5af254675a403ad16fd65d92e7f08eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.mach.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5af254675a403ad16fd65d92e7f08eb");
        }
        if (this.h == null) {
            return new com.sankuai.waimai.rocks.view.mach.e(m());
        }
        return new com.sankuai.waimai.rocks.view.mach.e(m(), this.h);
    }

    public void a(com.sankuai.waimai.rocks.view.viewmodel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199205897aa92af0b27101a222c0d879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199205897aa92af0b27101a222c0d879");
            return;
        }
        int a2 = com.sankuai.waimai.foundation.utils.g.a(m(), ((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s.q.a);
        int a3 = com.sankuai.waimai.foundation.utils.g.a(m(), ((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s.q.c);
        int a4 = com.sankuai.waimai.foundation.utils.g.a(m(), ((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s.q.b);
        int a5 = com.sankuai.waimai.foundation.utils.g.a(m(), ((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s.q.d);
        com.sankuai.waimai.mach.node.a b2 = aVar.p.b();
        if (b2 != null) {
            if (b2.t() <= com.sankuai.waimai.foundation.utils.g.a(m(), 1.0f)) {
                a(0, 0, 0, 0);
            } else {
                a(a2, a3, a4, a5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.sankuai.waimai.rocks.view.viewmodel.a aVar, FrameLayout frameLayout, int i, int i2) {
        Object[] objArr = {aVar, frameLayout, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441ef0cafd9ecbc1f5c98de58691da00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441ef0cafd9ecbc1f5c98de58691da00");
            return;
        }
        com.sankuai.waimai.mach.node.a b2 = aVar.p.b();
        if (b2 != null) {
            if (b2.t() <= com.sankuai.waimai.foundation.utils.g.a(m(), 1.0f)) {
                frameLayout.setPadding(0, 0, 0, 0);
            } else {
                if (!aVar.z) {
                    i2 = 0;
                }
                frameLayout.setPadding(0, i, i2, 0);
            }
            if (aVar.t == null || aVar.t.getHeight() <= 0) {
                return;
            }
            if (aVar.t.getParent() != null) {
                ((ViewGroup) aVar.t.getParent()).removeView(aVar.t);
            }
            frameLayout.addView(aVar.t);
        }
    }

    @Override // com.sankuai.waimai.rocks.view.block.a
    public final void O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69e7ece8e84844eabfbe4d5b72daa27c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69e7ece8e84844eabfbe4d5b72daa27c");
            return;
        }
        super.O();
        if (this.t != null) {
            this.t.a(this.u);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ab911a69b55d410f99ba6400d045b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ab911a69b55d410f99ba6400d045b8");
            return;
        }
        super.s();
        if (i() != null) {
            i().setMinimumHeight(1);
        }
    }

    @Override // com.sankuai.waimai.rocks.view.block.a, com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cfadc555d98b6b28754359dea78bd1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cfadc555d98b6b28754359dea78bd1b");
            return;
        }
        super.y();
        if (this.n instanceof com.sankuai.waimai.rocks.view.viewmodel.a) {
            com.sankuai.waimai.rocks.view.viewmodel.a aVar = (com.sankuai.waimai.rocks.view.viewmodel.a) this.n;
            if (aVar.p != 0) {
                aVar.p.e();
            }
        }
    }
}
