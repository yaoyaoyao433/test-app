package com.sankuai.waimai.drug.block;

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
/* loaded from: classes4.dex */
public final class b extends k {
    public static ChangeQuickRedirect a;
    private LinearLayout m;
    private f n;

    @Override // com.sankuai.waimai.drug.block.k
    public final int d() {
        return 10;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final int e() {
        return 10;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final int f() {
        return 14;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final float g() {
        return 14.0f;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final float h() {
        return 12.0f;
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final int i() {
        return 1;
    }

    public b(@NonNull Activity activity, com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodDetailResponse goodDetailResponse) {
        super(activity, aVar, goodDetailResponse);
        Object[] objArr = {activity, aVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50be87300623295f6edd53ef2d91d3d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50be87300623295f6edd53ef2d91d3d0");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15deb6bbbb84a524bd40369f56135d43", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15deb6bbbb84a524bd40369f56135d43") : layoutInflater.inflate(R.layout.wm_drug_shopcart_goods_detail_total_price, viewGroup, false);
    }

    @Override // com.sankuai.waimai.drug.block.k, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49ec6ae3e9e0c2a5c3ac74e750ae4cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49ec6ae3e9e0c2a5c3ac74e750ae4cbc");
            return;
        }
        super.onViewCreated();
        this.m = (LinearLayout) findView(R.id.ll_im_container);
        this.n = new f(this.h, this.i, this.j, this.k);
        this.n.bindView(this.m);
    }

    @Override // com.sankuai.waimai.drug.block.k
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e86c2771513353c4145edc25b7281f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e86c2771513353c4145edc25b7281f1");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        layoutParams.width = com.sankuai.shangou.stone.util.h.a(getContext(), this.i.b() ? 112.0f : 63.0f);
        this.m.setLayoutParams(layoutParams);
        this.n.a();
    }
}
