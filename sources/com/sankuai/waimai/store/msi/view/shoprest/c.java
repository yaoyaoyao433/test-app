package com.sankuai.waimai.store.msi.view.shoprest;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.msi.view.shoprest.b;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends g<PoiVerticality, b.a> {
    public static ChangeQuickRedirect a;
    public a b;
    com.sankuai.waimai.store.platform.domain.manager.poi.a c;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_sugoo_default_new_poi_list_adapter;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(PoiVerticality poiVerticality, final int i) {
        PoiVerticality poiVerticality2 = poiVerticality;
        Object[] objArr = {poiVerticality2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bddb919b7c002cb2e9c39736fe12aff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bddb919b7c002cb2e9c39736fe12aff4");
            return;
        }
        this.b.a(poiVerticality2, i);
        if (this.c != null) {
            com.sankuai.waimai.store.manager.judas.b.b(this.p.getContext(), "b_kdxov").a("poi_id", this.c.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.c.v())).a("other_poi_id", Long.valueOf(poiVerticality2.getId())).a("index", Integer.valueOf(i)).a();
        }
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.msi.view.shoprest.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d21e5cdcc674d48deb487084048630b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d21e5cdcc674d48deb487084048630b");
                } else {
                    ((b.a) c.this.o).a(i);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a9dbc0782f77c3d09a73b9b229fab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a9dbc0782f77c3d09a73b9b229fab4");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.b = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07ac8ce5ce66563c50106cff4f6f9665", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07ac8ce5ce66563c50106cff4f6f9665") : new a(view.getContext(), null);
        this.b.bindView(view);
    }
}
