package com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.model.SCActivityDialogInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final c b;
    private final SCActivityDialogInfo c;

    private d(c cVar, SCActivityDialogInfo sCActivityDialogInfo) {
        this.b = cVar;
        this.c = sCActivityDialogInfo;
    }

    public static View.OnClickListener a(c cVar, SCActivityDialogInfo sCActivityDialogInfo) {
        Object[] objArr = {cVar, sCActivityDialogInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e1065b83497b2be7345da5fc5bdd6da", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e1065b83497b2be7345da5fc5bdd6da") : new d(cVar, sCActivityDialogInfo);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c026db2c232932ebbbc41d82121003", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c026db2c232932ebbbc41d82121003");
        } else {
            c.a(this.b, this.c, view);
        }
    }
}
