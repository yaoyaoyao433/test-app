package com.sankuai.waimai.store.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.e;
import com.sankuai.waimai.store.goods.list.viewblocks.header.widget.SCPoiCouponView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private SCPoiCouponView b;
    @NonNull
    private final e c;

    public a(@NonNull Context context, @NonNull e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472aac147bc99d16286c2825f2e75526", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472aac147bc99d16286c2825f2e75526");
        } else {
            this.c = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e384da5c2f28316d0cdd26a767fb7c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e384da5c2f28316d0cdd26a767fb7c31");
            return;
        }
        super.onViewCreated();
        this.b = (SCPoiCouponView) findView(R.id.shop_content_coupon_view);
    }

    public final void a(Poi.CouponSummary couponSummary) {
        Object[] objArr = {couponSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27dacd322a5fdaf84abbb425e7150021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27dacd322a5fdaf84abbb425e7150021");
        } else if (couponSummary == null) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setData(couponSummary);
            this.b.setPoiHelper(this.c.x());
        }
    }
}
