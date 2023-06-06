package com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final g b;

    private i(g gVar) {
        this.b = gVar;
    }

    public static View.OnClickListener a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e325032eb3a2cf53a5d712b1df0f5ef5", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e325032eb3a2cf53a5d712b1df0f5ef5") : new i(gVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc73d04364e088eb82255b8ee4605929", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc73d04364e088eb82255b8ee4605929");
        } else {
            g.a(this.b, view);
        }
    }
}
