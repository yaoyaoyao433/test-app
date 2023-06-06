package com.sankuai.waimai.store.poi.list.newp.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.widgets.recycler.b<com.sankuai.waimai.store.widgets.recycler.e> {
    public static ChangeQuickRedirect a;
    @NonNull
    final List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> b;
    String c;
    private final com.sankuai.waimai.store.param.a d;
    private final SCBaseActivity g;
    private g h;
    private com.sankuai.waimai.store.poi.list.newp.home.model.a i;
    private int j;

    public c(@NonNull SCBaseActivity sCBaseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, g gVar, com.sankuai.waimai.store.poi.list.newp.home.model.a aVar2) {
        Object[] objArr = {sCBaseActivity, aVar, gVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab52bdbd02e12a71c6d2231d16ff6c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab52bdbd02e12a71c6d2231d16ff6c1");
            return;
        }
        this.b = new ArrayList();
        this.c = "supermarket-convenient-home-survey";
        this.g = sCBaseActivity;
        this.d = aVar;
        this.h = gVar;
        this.i = aVar2;
        if (this.i != null) {
            this.j = com.sankuai.shangou.stone.util.h.a((Context) sCBaseActivity) / this.i.g;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a4cc2514b53adc03b2f74e20c8ff90", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a4cc2514b53adc03b2f74e20c8ff90")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872962ced5c633312c22c0186c99763a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872962ced5c633312c22c0186c99763a")).intValue() : (this.b == null || (fVar = this.b.get(i)) == null || fVar.a == null || !TextUtils.equals(fVar.a.templateId, "supermarket-convenient-detail-sec-tab")) ? 10 : 30;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        h hVar;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecafb9e0c683030c363697a1a0acf811", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecafb9e0c683030c363697a1a0acf811");
        }
        h hVar2 = null;
        if (i == 10 || i == 30) {
            if (this.i.o != -1) {
                hVar = new h(LayoutInflater.from(this.g).inflate(this.i.o, viewGroup, false));
            } else {
                hVar = new h(LayoutInflater.from(this.g).inflate(R.layout.wm_sc_recycle_mach_item, viewGroup, false));
            }
            hVar2 = hVar;
            h hVar3 = hVar2;
            hVar3.b = this.h;
            hVar3.e = this.d;
        }
        return hVar2;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(com.sankuai.waimai.store.widgets.recycler.e eVar, final int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04ffd3fdad0b4ee0d107dd412e43bab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04ffd3fdad0b4ee0d107dd412e43bab5");
            return;
        }
        final com.sankuai.waimai.store.poilist.mach.f fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (fVar == null) {
            return;
        }
        h hVar = (h) eVar;
        View view = hVar.itemView;
        com.sankuai.waimai.store.poi.list.newp.adapter.a aVar = new com.sankuai.waimai.store.poi.list.newp.adapter.a(view, System.identityHashCode(fVar) + CommonConstant.Symbol.COLON + i);
        aVar.a(new c.a() { // from class: com.sankuai.waimai.store.poi.list.newp.home.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad5bb2a9515032b4fcc3161404580969", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad5bb2a9515032b4fcc3161404580969");
                    return;
                }
                com.sankuai.waimai.mach.recycler.c cVar = fVar.b;
                if (cVar != null) {
                    if (cVar.b() != null) {
                        cVar.b().a("index", Integer.valueOf(i));
                    }
                    cVar.e();
                }
            }
        });
        com.sankuai.waimai.store.expose.v2.b.a().a(this.g, aVar);
        Object[] objArr2 = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "8f105d5fc13576f944afd5fa5fa25c8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "8f105d5fc13576f944afd5fa5fa25c8e");
            return;
        }
        com.sankuai.waimai.mach.recycler.c cVar = fVar.b;
        if (hVar.b == null || cVar == null) {
            return;
        }
        com.sankuai.waimai.mach.recycler.b b = hVar.b.b();
        b.a(cVar);
        b.a((FrameLayout) hVar.itemView, cVar, b.a(cVar.a()));
        hVar.c = cVar;
        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.convenient.detail.b(hVar.c, "convenient_detail_load_account", null, hVar.b.a() == null ? "default" : ((SCBaseActivity) hVar.b.a()).w()));
        if (hVar.d == null) {
            hVar.d = new f(hVar.c, hVar.itemView.getContext());
        }
        hVar.c.l().registerJsEventCallback(hVar.d);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    public final void a(@NonNull com.sankuai.waimai.store.widgets.recycler.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c71515d62e21440bcaf32656207248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c71515d62e21440bcaf32656207248");
        } else if (eVar instanceof h) {
            h hVar = (h) eVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "add0f26bbc737f84427922405bb88715", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "add0f26bbc737f84427922405bb88715");
                return;
            }
            if (hVar.c != null && hVar.c.l() != null) {
                hVar.c.l().unregisterJsEventCallback();
            }
            if (hVar.b == null || hVar.b.b() == null) {
                return;
            }
            hVar.b.b().b(hVar.c);
        }
    }
}
