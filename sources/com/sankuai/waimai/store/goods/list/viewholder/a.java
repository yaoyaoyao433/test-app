package com.sankuai.waimai.store.goods.list.viewholder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.adapter.b;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends g<PoiVerticality, b.a> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.poilist.view.a b;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a c;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_sugoo_default_new_poi_list_adapter;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(PoiVerticality poiVerticality, final int i) {
        PoiVerticality poiVerticality2 = poiVerticality;
        Object[] objArr = {poiVerticality2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9040a2c7db8bff1f49589e2584ef4a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9040a2c7db8bff1f49589e2584ef4a2");
            return;
        }
        this.b.a(poiVerticality2, i);
        if (this.c != null) {
            com.sankuai.waimai.store.manager.judas.b.b(this.p.getContext(), "b_kdxov").a("poi_id", this.c.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.c.v())).a("other_poi_id", Long.valueOf(poiVerticality2.getId())).a("index", Integer.valueOf(i)).a();
        }
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewholder.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cbf63460831c2ca273b862338c5569a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cbf63460831c2ca273b862338c5569a");
                } else {
                    ((b.a) a.this.o).a(i);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5e234ddcaff7e8bdff996a21e5b2fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5e234ddcaff7e8bdff996a21e5b2fc");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.b = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e129a1b637970db263f968a9f79be90e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.poilist.view.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e129a1b637970db263f968a9f79be90e") : new com.sankuai.waimai.store.poilist.view.a(view.getContext(), null);
        this.b.bindView(view);
    }
}
