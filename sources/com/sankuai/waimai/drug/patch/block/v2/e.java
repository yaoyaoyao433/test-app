package com.sankuai.waimai.drug.patch.block.v2;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final c b;
    private final com.sankuai.waimai.drug.model.g c;

    private e(c cVar, com.sankuai.waimai.drug.model.g gVar) {
        this.b = cVar;
        this.c = gVar;
    }

    public static View.OnClickListener a(c cVar, com.sankuai.waimai.drug.model.g gVar) {
        Object[] objArr = {cVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7abff1e89cb66c48a37be9e17a3c8e9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7abff1e89cb66c48a37be9e17a3c8e9") : new e(cVar, gVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edabf7407eff917d8404c75146df7374", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edabf7407eff917d8404c75146df7374");
        } else {
            c.a(this.b, this.c, view);
        }
    }
}
