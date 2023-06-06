package com.sankuai.waimai.store.drug.home.refactor;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DrugPoiTemplate b;

    private b(DrugPoiTemplate drugPoiTemplate) {
        this.b = drugPoiTemplate;
    }

    public static View.OnClickListener a(DrugPoiTemplate drugPoiTemplate) {
        Object[] objArr = {drugPoiTemplate};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16e84f62a660d2bcface23fd96cff1cf", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16e84f62a660d2bcface23fd96cff1cf") : new b(drugPoiTemplate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb960297a6cef0df59e7d587a08f7bd", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb960297a6cef0df59e7d587a08f7bd");
        } else {
            DrugPoiTemplate.c(this.b, view);
        }
    }
}
