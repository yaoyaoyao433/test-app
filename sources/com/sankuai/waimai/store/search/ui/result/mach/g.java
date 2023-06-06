package com.sankuai.waimai.store.search.ui.result.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.mach.d;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public Context b;
    public ViewGroup c;
    public ViewGroup d;
    public SearchShareData e;
    public com.sankuai.waimai.mach.recycler.c f;
    d.b g;
    private com.sankuai.waimai.store.search.ui.result.b h;

    public g(Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff0e3b2dba86667c0db90e5085aacd71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff0e3b2dba86667c0db90e5085aacd71");
            return;
        }
        this.g = new d.b();
        this.b = context;
        this.e = SearchShareData.a(this.b);
        this.h = bVar;
    }

    public final void a(final com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2922fd0fa9a590418db51695386f5fb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2922fd0fa9a590418db51695386f5fb8");
        } else if (aVar == null || aVar.g() == null) {
        } else {
            String str = null;
            if (aVar.h() != null && aVar.h().containsKey("expose-key")) {
                str = String.valueOf(aVar.h().get("expose-key"));
            }
            if (t.a(str)) {
                str = String.valueOf(System.identityHashCode(aVar));
            }
            com.sankuai.waimai.store.expose.v2.entity.a aVar2 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar.g(), str);
            aVar2.a(new c.a() { // from class: com.sankuai.waimai.store.search.ui.result.mach.g.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf12ce7457d2c6307bed50a3524a719b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf12ce7457d2c6307bed50a3524a719b");
                    } else {
                        aVar.f.triggerViewReport(aVar);
                    }
                }
            });
            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.b, aVar2);
        }
    }

    void b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd4ff5e0334cc40590e2787c2226024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd4ff5e0334cc40590e2787c2226024");
        } else if (aVar != null) {
            c(aVar);
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            if (com.sankuai.shangou.stone.util.a.b(b)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : b) {
                if (aVar2 != null) {
                    c(aVar2);
                }
                b(aVar2);
            }
        }
    }

    private void c(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8903ea8392afb698f920901ec294ca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8903ea8392afb698f920901ec294ca5");
        } else if (com.sankuai.waimai.store.mach.a.b(aVar)) {
            this.g.b = aVar;
        } else if (com.sankuai.waimai.store.mach.a.c(aVar)) {
            this.g.d.add(aVar);
        } else if (com.sankuai.waimai.store.mach.a.d(aVar)) {
            this.g.c.add(aVar);
        }
    }
}
