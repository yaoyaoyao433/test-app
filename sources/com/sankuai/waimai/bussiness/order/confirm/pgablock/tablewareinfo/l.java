package com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final j b;

    private l(j jVar) {
        this.b = jVar;
    }

    public static View.OnClickListener a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6da4f6ab94c72d9b242e2f5f49df21c7", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6da4f6ab94c72d9b242e2f5f49df21c7") : new l(jVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0fbfc1eed715177c97bd52c8e1a9dc0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0fbfc1eed715177c97bd52c8e1a9dc0");
        } else {
            j.a(this.b, view);
        }
    }
}
