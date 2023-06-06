package com.sankuai.waimai.drug.block;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DrugShopCartNewRiskInfoView b;

    private a(DrugShopCartNewRiskInfoView drugShopCartNewRiskInfoView) {
        this.b = drugShopCartNewRiskInfoView;
    }

    public static View.OnClickListener a(DrugShopCartNewRiskInfoView drugShopCartNewRiskInfoView) {
        Object[] objArr = {drugShopCartNewRiskInfoView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c124a33b0144eb2d58158a6fffb68b2", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c124a33b0144eb2d58158a6fffb68b2") : new a(drugShopCartNewRiskInfoView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e69bbd778483c6c03de4f8a145acf7b8", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e69bbd778483c6c03de4f8a145acf7b8");
        } else {
            DrugShopCartNewRiskInfoView.a(this.b, view);
        }
    }
}
