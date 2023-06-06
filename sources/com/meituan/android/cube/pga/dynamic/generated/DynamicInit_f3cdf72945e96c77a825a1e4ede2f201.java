package com.meituan.android.cube.pga.dynamic.generated;

import com.meituan.android.cube.pga.dynamic.IDynamicInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DynamicInit_f3cdf72945e96c77a825a1e4ede2f201 implements IDynamicInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.cube.pga.dynamic.IDynamicInit
    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68b6aba14d93821f196f3a83274b2269", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68b6aba14d93821f196f3a83274b2269");
            return;
        }
        com.meituan.android.cube.pga.dynamic.a.a().a("drug_order_confirm_medicare_way_style_1", new ag());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_drug_risk_info_style_1", new ah());
        com.meituan.android.cube.pga.dynamic.a.a().a("drug_order_confirm_logic_block_style_1", new af());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_drug_risk_info", new ae());
    }
}
