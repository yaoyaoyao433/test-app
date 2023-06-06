package com.sankuai.waimai.drug.patch.block.v2;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final c b;
    private final com.sankuai.waimai.drug.model.g c;

    private d(c cVar, com.sankuai.waimai.drug.model.g gVar) {
        this.b = cVar;
        this.c = gVar;
    }

    public static View.OnClickListener a(c cVar, com.sankuai.waimai.drug.model.g gVar) {
        Object[] objArr = {cVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22bd2d2446c60d1e07147902829c0e28", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22bd2d2446c60d1e07147902829c0e28") : new d(cVar, gVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b80c79fd7c3f0934a51959d22f335850", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b80c79fd7c3f0934a51959d22f335850");
        } else {
            c.b(this.b, this.c, view);
        }
    }
}
