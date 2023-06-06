package com.sankuai.waimai.store.shopping.cart.block;

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
/* loaded from: classes5.dex */
public final class j extends i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final int d() {
        return 12;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final int e() {
        return 14;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final int f() {
        return 24;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final float g() {
        return 16.0f;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final float h() {
        return 16.0f;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final int i() {
        return Integer.MAX_VALUE;
    }

    public j(@NonNull Activity activity, com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodDetailResponse goodDetailResponse) {
        super(activity, aVar, goodDetailResponse);
        Object[] objArr = {activity, aVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af6f7ef1f244fc6cead0eefbecb7bf37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af6f7ef1f244fc6cead0eefbecb7bf37");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a50c3f9598e1f0cea80dcaa1e4c7b2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a50c3f9598e1f0cea80dcaa1e4c7b2") : layoutInflater.inflate(R.layout.wm_st_shopcart_poi_total_price, viewGroup, false);
    }
}
