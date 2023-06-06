package com.sankuai.waimai.drug.o2o;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.j;
import com.sankuai.waimai.foundation.core.service.order.d;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.store.shopping.cart.ui.c {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.shopping.cart.a b;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private d d;
    private boolean m;

    public a(@NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, com.sankuai.waimai.store.shopping.cart.a aVar2) {
        super(aVar.i(), aVar, null);
        boolean z = false;
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2ec7834d130b1deda5ad7823267ff99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2ec7834d130b1deda5ad7823267ff99");
            return;
        }
        this.b = aVar2;
        this.c = aVar.g();
        if (this.b != null && this.b.a) {
            z = true;
        }
        this.m = z;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf4fb36a820f521c18980acec187df5", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf4fb36a820f521c18980acec187df5") : layoutInflater.inflate(R.layout.wm_drug_shopcart_o2o_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e3e12b1091c9c403e5880260bc4668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e3e12b1091c9c403e5880260bc4668");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c156b370f21558b9f45f75866f343732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c156b370f21558b9f45f75866f343732");
        } else {
            this.d = new d(this.h, this.g, this.b);
            this.d.createAndReplaceView(this.mView, R.id.shop_cart_o2o_poi);
        }
        com.sankuai.waimai.store.manager.judas.b.b(this.j.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.mContext), "b_waimai_7bgt9pp8_mv").a("poi_id", this.c.d()).a("stid", this.g.n()).a();
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e60ebd9fb9371742c067060bc9fcad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e60ebd9fb9371742c067060bc9fcad9");
            return;
        }
        d dVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "accf8262fe64ae52320620d7f5b6d473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "accf8262fe64ae52320620d7f5b6d473");
            return;
        }
        dVar.c.a();
        Iterator<j> it = dVar.b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c57b6055747d54b34ec1c7cd160423d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c57b6055747d54b34ec1c7cd160423d0");
            return;
        }
        d dVar = this.d;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "2a7471bd4fce1ecce846c861bf561c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "2a7471bd4fce1ecce846c861bf561c23");
        } else {
            dVar.c.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6449fcb42a7c95e93fbd49f56d320ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6449fcb42a7c95e93fbd49f56d320ae");
            return;
        }
        super.a(z);
        this.d.a(z);
        if (this.m) {
            this.d.setVisible(z);
        }
    }
}
