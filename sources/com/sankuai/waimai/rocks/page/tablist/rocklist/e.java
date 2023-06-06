package com.sankuai.waimai.rocks.page.tablist.rocklist;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.page.view.NestedRecyclerView;
import com.sankuai.waimai.rocks.view.a;
import com.sankuai.waimai.rocks.view.recyclerview.b;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class e extends com.meituan.android.cube.pga.viewmodel.a<f> {
    public static ChangeQuickRedirect C;
    public com.sankuai.waimai.rocks.view.recyclerview.b D;
    protected com.sankuai.waimai.rocks.view.a E;
    private boolean o;
    private com.sankuai.waimai.rocks.page.a p;

    public abstract Map<String, Object> n();

    public abstract com.sankuai.waimai.rocks.view.recyclerview.footer.a o();

    public abstract a p();

    public abstract void q();

    public abstract void r();

    public com.sankuai.waimai.rocks.view.mach.d s() {
        return null;
    }

    public void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86247f619b066b238255a50991fa3005", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86247f619b066b238255a50991fa3005");
        }
    }

    @CallSuper
    public void a(boolean z) {
        this.o = false;
    }

    public e(f fVar, Context context) {
        super(fVar, context);
        Object[] objArr = {fVar, context};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06726aeb6b9b772369beb54930f07c8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06726aeb6b9b772369beb54930f07c8f");
        }
    }

    public void a(com.sankuai.waimai.rocks.page.a aVar, NestedRecyclerView nestedRecyclerView) {
        Object[] objArr = {aVar, nestedRecyclerView};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c415f461d8fb223464a153227c90cc1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c415f461d8fb223464a153227c90cc1e");
            return;
        }
        this.p = aVar;
        this.E = aVar.bs.a().b.a(nestedRecyclerView, n(), new b.a() { // from class: com.sankuai.waimai.rocks.page.tablist.rocklist.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.recyclerview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abb09a5b1b2a95f5b7b90efc13aa51f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abb09a5b1b2a95f5b7b90efc13aa51f0");
                } else {
                    e.this.a(true);
                }
            }
        }, o(), s());
        this.D = this.E.d;
        aVar.bK.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.rocks.view.recyclerview.b>) this.D);
        nestedRecyclerView.a(new NestedRecyclerView.b() { // from class: com.sankuai.waimai.rocks.page.tablist.rocklist.e.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.page.view.NestedRecyclerView.b
            public final void a(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12e93b46882d283a6d48bad328cc84a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12e93b46882d283a6d48bad328cc84a2");
                } else {
                    e.this.D.b(i);
                }
            }
        });
    }

    public final com.sankuai.waimai.rocks.view.a u() {
        return this.E;
    }

    public final void a(com.meituan.android.cube.pga.block.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09052f25d707c4aa3d35e188529309ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09052f25d707c4aa3d35e188529309ae");
        } else if (this.D == null || aVar == null) {
        } else {
            com.sankuai.waimai.rocks.view.recyclerview.a aVar2 = this.D.h;
            if (aVar2 instanceof com.sankuai.waimai.rocks.view.recyclerview.a) {
                aVar2.f = aVar;
            }
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c5165f5d9d514ca93dd98b245ce7ad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c5165f5d9d514ca93dd98b245ce7ad4");
            return;
        }
        super.a((e) fVar);
        if (this.E != null) {
            this.E.a(fVar.a, fVar.b, fVar.c, fVar.d, fVar.e, fVar.f, new a.c() { // from class: com.sankuai.waimai.rocks.page.tablist.rocklist.e.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.view.a.c
                public final void a(List<com.sankuai.waimai.rocks.node.a> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a01113705da4ffa13a5a88bb8748ddcf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a01113705da4ffa13a5a88bb8748ddcf");
                    }
                }

                @Override // com.sankuai.waimai.rocks.view.a.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75a7a1e0196e25df8be6adc50486a4e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75a7a1e0196e25df8be6adc50486a4e6");
                    } else {
                        e.this.q();
                    }
                }

                @Override // com.sankuai.waimai.rocks.view.a.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2bbb270f8310939c0cd4cce27dc859b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2bbb270f8310939c0cd4cce27dc859b");
                    } else {
                        e.this.r();
                    }
                }
            });
        }
    }
}
