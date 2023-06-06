package com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.meituan.android.cube.pga.type.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "532865caf7021be535bcfb1da39e2468", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "532865caf7021be535bcfb1da39e2468") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f3a9198554e71715887a972cf43a81f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f3a9198554e71715887a972cf43a81f") : new b(m());
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74365b9f73307c536608fe39babaf03f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74365b9f73307c536608fe39babaf03f");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e62626e8fd272827d4190999c01106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e62626e8fd272827d4190999c01106");
            return;
        }
        super.I();
        i().setPadding(i().getPaddingLeft(), g.a(m(), 14.0f), i().getPaddingRight(), g.a(m(), 16.0f));
        ((d) this.n).p.g = true;
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d8d206371a9eb2af4f4eeb6055d9895e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d8d206371a9eb2af4f4eeb6055d9895e");
            return;
        }
        Object[] objArr3 = {cVar};
        ChangeQuickRedirect changeQuickRedirect3 = b.d;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "f68a641ee253b9998a896c6a1fc97d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "f68a641ee253b9998a896c6a1fc97d42");
            return;
        }
        bVar.e.setText(cVar.b);
        bVar.b(cVar);
        bVar.a(cVar);
    }
}
