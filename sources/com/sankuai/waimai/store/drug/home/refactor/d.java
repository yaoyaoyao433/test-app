package com.sankuai.waimai.store.drug.home.refactor;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DrugPoiTemplate b;

    private d(DrugPoiTemplate drugPoiTemplate) {
        this.b = drugPoiTemplate;
    }

    public static View.OnClickListener a(DrugPoiTemplate drugPoiTemplate) {
        Object[] objArr = {drugPoiTemplate};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "830b08b3b6da35ba3e4a061f4ac556fe", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "830b08b3b6da35ba3e4a061f4ac556fe") : new d(drugPoiTemplate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9628343fd9310c792ce8c16419323514", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9628343fd9310c792ce8c16419323514");
        } else {
            DrugPoiTemplate.b(this.b, view);
        }
    }
}
