package com.sankuai.waimai.drug.block;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l extends k {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.drug.block.k
    public final int d() {
        return 12;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final int e() {
        return 14;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final int f() {
        return 24;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final float g() {
        return 16.0f;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final float h() {
        return 16.0f;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final int i() {
        return Integer.MAX_VALUE;
    }

    public l(@NonNull Activity activity, com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodDetailResponse goodDetailResponse) {
        super(activity, aVar, goodDetailResponse);
        Object[] objArr = {activity, aVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d97a5f14de3179f9f507744ba1d8d55e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d97a5f14de3179f9f507744ba1d8d55e");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3816e8646eb0147aa1cefb66cdeb6083", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3816e8646eb0147aa1cefb66cdeb6083") : layoutInflater.inflate(R.layout.wm_drug_shopcart_poi_total_price, viewGroup, false);
    }
}
