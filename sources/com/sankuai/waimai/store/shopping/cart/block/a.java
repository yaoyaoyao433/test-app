package com.sankuai.waimai.store.shopping.cart.block;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends i {
    public static ChangeQuickRedirect a;
    private LinearLayout m;
    private d n;

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final int d() {
        return 10;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final int e() {
        return 10;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final int f() {
        return 14;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final float g() {
        return 14.0f;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final float h() {
        return 12.0f;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final int i() {
        return 1;
    }

    public a(@NonNull Activity activity, com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodDetailResponse goodDetailResponse) {
        super(activity, aVar, goodDetailResponse);
        Object[] objArr = {activity, aVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e6a4e449910f9025a612d862c28c5a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e6a4e449910f9025a612d862c28c5a3");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e13d995605d7b39aded6e878bf2135a5", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e13d995605d7b39aded6e878bf2135a5") : layoutInflater.inflate(R.layout.wm_st_shopcart_goods_detail_total_price, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06a39c2bfb9fde6c0cb260db126cfcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06a39c2bfb9fde6c0cb260db126cfcc");
            return;
        }
        super.onViewCreated();
        this.m = (LinearLayout) findView(R.id.ll_im_container);
        this.n = new d(this.h, this.i, this.j, this.k);
        this.n.bindView(this.m);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.block.i
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01b501f027aa047592d1a94822f994ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01b501f027aa047592d1a94822f994ec");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        layoutParams.width = com.sankuai.shangou.stone.util.h.a(getContext(), this.i.b() ? 112.0f : 63.0f);
        this.m.setLayoutParams(layoutParams);
        this.n.a();
    }
}
