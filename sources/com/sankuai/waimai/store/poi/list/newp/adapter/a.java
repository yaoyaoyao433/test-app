package com.sankuai.waimai.store.poi.list.newp.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.expose.v2.entity.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.expose.v2.entity.b
    public final String a() {
        return "wm_sc_poi_list_expose";
    }

    public a(View view, String str) {
        super(view, str);
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef6824e617c2bdc7498e37fc65047db3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef6824e617c2bdc7498e37fc65047db3");
        }
    }
}
