package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private static final g b = new g();

    public static View.OnClickListener a() {
        return b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6077ea031ca1200b19f382bbbeaf6a87", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6077ea031ca1200b19f382bbbeaf6a87");
        } else {
            DrugPoiTabMRNFragment.a(view);
        }
    }
}
