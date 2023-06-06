package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.activities.MutilReceiveCouponTip;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends n {
    public static ChangeQuickRedirect a;

    public g(Context context, j jVar) {
        super(context, jVar);
        Object[] objArr = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200fd429dcfe0c7fd50c5d105da64bd6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200fd429dcfe0c7fd50c5d105da64bd6");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.n, com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.m, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac1c1771e3bf353c8bca92db9c06d8f8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac1c1771e3bf353c8bca92db9c06d8f8") : layoutInflater.inflate(R.layout.wm_st_poi_market_adapter_sticky_coupon, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.n, com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.m, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e4b1691b148fa4a92bc7563c30a080f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e4b1691b148fa4a92bc7563c30a080f");
            return;
        }
        this.c = this.mView.findViewById(R.id.slogan_root_view);
        this.p = this.mView.findViewById(R.id.slogan_header_left_container);
        this.q = this.mView.findViewById(R.id.slogan_header_left_container_multi);
        this.d = (TextView) this.mView.findViewById(R.id.txt_slogan_header_price);
        this.e = (TextView) this.mView.findViewById(R.id.txt_slogan_header_desc);
        this.r = (TextView) this.mView.findViewById(R.id.txt_slogan_header_desc_multi);
        this.f = (TextView) this.mView.findViewById(R.id.txt_slogan_header_valid_time);
        this.g = (TextView) this.mView.findViewById(R.id.txt_slogan_header_btn);
        this.h = (TextView) this.mView.findViewById(R.id.txt_slogan_header_symbol);
        this.i = (TextView) this.mView.findViewById(R.id.txt_slogan_header_discount);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.n, com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.m
    public final void a(k kVar, int i, int i2) {
        Object[] objArr = {kVar, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a6c2bfa8999eee2376713874ca554fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a6c2bfa8999eee2376713874ca554fc");
        } else if (kVar == null) {
        } else {
            this.k = kVar.b;
            this.j = this.t.m();
            if (this.k == null || this.k.mutilReceiveCouponTip == null) {
                return;
            }
            this.u = this.k.mutilReceiveCouponTip;
            a(this.u);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.n
    public final void a(MutilReceiveCouponTip mutilReceiveCouponTip) {
        Object[] objArr = {mutilReceiveCouponTip};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a1ee72830b7a159b94540a2389cfb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a1ee72830b7a159b94540a2389cfb7");
            return;
        }
        super.a(mutilReceiveCouponTip);
        this.f.setVisibility(8);
    }
}
