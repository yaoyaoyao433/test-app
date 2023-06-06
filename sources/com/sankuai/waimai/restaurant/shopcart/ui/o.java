package com.sankuai.waimai.restaurant.shopcart.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_r_float_container"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes5.dex */
public class o extends com.sankuai.waimai.business.restaurant.base.config.b<com.meituan.android.cube.pga.view.a, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect t;

    public o(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a362100c63a05a388a40f2a6087bc8b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a362100c63a05a388a40f2a6087bc8b5");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e109a184bead8055dee00a6782cad2b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e109a184bead8055dee00a6782cad2b") : new com.meituan.android.cube.pga.view.a(m()) { // from class: com.sankuai.waimai.restaurant.shopcart.ui.o.1
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_restaurant_layout_float_container;
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb323af962823a87875b5d34ce27ef73", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb323af962823a87875b5d34ce27ef73") : new com.meituan.android.cube.pga.viewmodel.a();
    }

    @Override // com.meituan.android.cube.core.f
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56dafdba66aabd6c71aff6f33c5a13ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56dafdba66aabd6c71aff6f33c5a13ac");
        } else {
            super.a(bundle);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f07cf871fbefda5df5966e70c7b373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f07cf871fbefda5df5966e70c7b373");
        } else {
            super.aR_();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7a7e88e6d2348b4302d53816c33cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7a7e88e6d2348b4302d53816c33cde");
        } else {
            super.bc_();
        }
    }
}
