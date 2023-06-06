package com.sankuai.waimai.store.order.detail.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poilist.mach.d;
import com.sankuai.waimai.store.poilist.viewholders.e;
import com.sankuai.waimai.store.poilist.viewholders.g;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.widgets.recycler.b<e> {
    public static ChangeQuickRedirect a;
    @NonNull
    public final List<f> b;
    private final String c;
    private final LayoutInflater d;
    private final com.sankuai.waimai.store.param.a g;
    private final BaseActivity h;
    private d i;
    private com.sankuai.waimai.store.expose.v2.a j;

    public c(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, d dVar, com.sankuai.waimai.store.expose.v2.a aVar2) {
        Object[] objArr = {baseActivity, aVar, dVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "546b482d28de3f6c382bd646c2f39c38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "546b482d28de3f6c382bd646c2f39c38");
            return;
        }
        this.c = "SGOrderDetialAdapter";
        this.b = new ArrayList();
        this.d = LayoutInflater.from(baseActivity);
        this.h = baseActivity;
        this.g = aVar;
        this.i = dVar;
        this.j = aVar2;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b773d134ea91e2d96338c694619bdb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b773d134ea91e2d96338c694619bdb")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "371332e215ef0a3a3e951c9553cfda9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "371332e215ef0a3a3e951c9553cfda9e")).intValue();
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        PoiCardInfo poiCardInfo = (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9df512f274bdb52dfe8d45d497af71de", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9df512f274bdb52dfe8d45d497af71de") : (f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i)).i;
        if (poiCardInfo != null && poiCardInfo.cardType == 1) {
            BaseModuleDesc baseModuleDesc = poiCardInfo.moduleDesc;
            Object[] objArr3 = {baseModuleDesc};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "30c01a10b93474b4eb5afe6d65473fdb", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "30c01a10b93474b4eb5afe6d65473fdb")).booleanValue();
            } else if (baseModuleDesc == null || !"mach".equals(baseModuleDesc.nativeId)) {
                z = false;
            }
            if (z) {
                return 6;
            }
        }
        return (poiCardInfo == null || poiCardInfo.cardType != 2) ? 7 : 10;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b18552af103dfa6f2fdea29ec17b56c", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b18552af103dfa6f2fdea29ec17b56c");
        }
        com.sankuai.shangou.stone.util.log.a.a("SGOrderDetialAdapter", "onCreateViewHolderInner() called with: parent = [" + viewGroup + "], viewType = [" + i + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, new Object[0]);
        if (i == 10) {
            g gVar = new g(LayoutInflater.from(this.h).inflate(R.layout.wm_sc_order_detail_recycle_mach_item, viewGroup, false));
            gVar.b = this.i;
            return gVar;
        }
        return new com.sankuai.waimai.store.poilist.viewholders.e(new e.a(this.h, this.g));
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(com.sankuai.waimai.store.widgets.recycler.e eVar, final int i) {
        PoiCardInfo poiCardInfo;
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b34efed6028c8ad1e323dfa9422c71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b34efed6028c8ad1e323dfa9422c71");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.a("SGOrderDetialAdapter", "onBindViewHolderInner() called with: holder = [" + eVar + "], position = [" + i + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, new Object[0]);
        final f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (fVar == null || (poiCardInfo = fVar.i) == null || poiCardInfo.moduleDesc == null) {
            return;
        }
        if (poiCardInfo.cardType == 1) {
            if (eVar instanceof com.sankuai.waimai.store.poilist.viewholders.e) {
                ((com.sankuai.waimai.store.poilist.viewholders.e) eVar).a(poiCardInfo, i);
            }
        } else if (poiCardInfo.cardType == 2) {
            if (fVar.j == null) {
                fVar.j = this.i.a(poiCardInfo, i);
            }
            if (eVar instanceof g) {
                g gVar = (g) eVar;
                View view = gVar.itemView;
                com.sankuai.waimai.store.poi.list.newp.adapter.a aVar = new com.sankuai.waimai.store.poi.list.newp.adapter.a(view, System.identityHashCode(fVar) + CommonConstant.Symbol.COLON + i);
                aVar.a(new c.a() { // from class: com.sankuai.waimai.store.order.detail.adapter.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dac2da24844a9b906e5f26e15cc876c3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dac2da24844a9b906e5f26e15cc876c3");
                            return;
                        }
                        com.sankuai.waimai.mach.recycler.c cVar = fVar.j.b;
                        if (cVar != null) {
                            if (cVar.b() != null) {
                                cVar.b().a("index", Integer.valueOf(i));
                            }
                            cVar.e();
                        }
                    }
                });
                com.sankuai.waimai.store.expose.v2.b.a().a(this.j, aVar);
                gVar.a(fVar.j, i);
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    public final void a(@NonNull com.sankuai.waimai.store.widgets.recycler.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "109422820fb141be381d548bfe4043d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "109422820fb141be381d548bfe4043d9");
        } else if (eVar instanceof g) {
            ((g) eVar).a();
        }
    }
}
