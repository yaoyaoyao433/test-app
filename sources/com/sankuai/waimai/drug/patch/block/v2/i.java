package com.sankuai.waimai.drug.patch.block.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.patch.block.v2.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements c.a {
    public static ChangeQuickRedirect a;
    private final h b;

    public i(h hVar) {
        this.b = hVar;
    }

    @Override // com.sankuai.waimai.drug.patch.block.v2.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c60776e92319979d3b4167368c32c5f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c60776e92319979d3b4167368c32c5f4");
            return;
        }
        h hVar = this.b;
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a48e86a7f83c0de2cbf6261d8754ebf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a48e86a7f83c0de2cbf6261d8754ebf4");
        } else {
            hVar.e.scrollTo(0, 0);
        }
    }
}
