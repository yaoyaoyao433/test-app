package com.sankuai.waimai.drug.patch.block.v2;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final h b;
    private final com.sankuai.waimai.drug.model.d c;

    public j(h hVar, com.sankuai.waimai.drug.model.d dVar) {
        this.b = hVar;
        this.c = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ecd155b99724b798e0f9de84a2eef6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ecd155b99724b798e0f9de84a2eef6");
            return;
        }
        h hVar = this.b;
        com.sankuai.waimai.drug.model.d dVar = this.c;
        Object[] objArr2 = {hVar, dVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "59a7ba6646d1557125604078da860fd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "59a7ba6646d1557125604078da860fd4");
        } else {
            hVar.f.a(view, dVar.l);
        }
    }
}
