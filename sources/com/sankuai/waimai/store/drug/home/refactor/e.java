package com.sankuai.waimai.store.drug.home.refactor;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DrugPoiTemplate b;

    private e(DrugPoiTemplate drugPoiTemplate) {
        this.b = drugPoiTemplate;
    }

    public static View.OnClickListener a(DrugPoiTemplate drugPoiTemplate) {
        Object[] objArr = {drugPoiTemplate};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c49b9c3214ef4a82d418a27148d2e969", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c49b9c3214ef4a82d418a27148d2e969") : new e(drugPoiTemplate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f22d2f2f24cdd69b49d79c1add2bda", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f22d2f2f24cdd69b49d79c1add2bda");
        } else {
            DrugPoiTemplate.a(this.b, view);
        }
    }
}
