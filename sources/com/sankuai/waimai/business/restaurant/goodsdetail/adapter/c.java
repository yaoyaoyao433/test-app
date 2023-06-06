package com.sankuai.waimai.business.restaurant.goodsdetail.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a {
    public static ChangeQuickRedirect j;

    public c(Activity activity, g gVar, ab abVar, ArrayList<RecommendPackage.a> arrayList, String str, int i, boolean z) {
        super(activity, gVar, abVar, arrayList, str, i, z);
        Object[] objArr = {activity, gVar, abVar, arrayList, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d71139e9dd3b1a5d266c0d57c245d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d71139e9dd3b1a5d266c0d57c245d6");
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ab83aba955f0bab73477385cc17f33", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ab83aba955f0bab73477385cc17f33") : new com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.b(LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_goods_detail_recommend_package_item, viewGroup, false), this.c, this.i, this.h, this.g, this.f, this.d);
    }
}
