package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.header.widget.SCPoiCouponView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private SCPoiCouponView b;
    @NonNull
    private final h c;

    public a(@NonNull Context context, @NonNull h hVar) {
        super(context);
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea4b8101b2faa06e2194cd9f796d2999", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea4b8101b2faa06e2194cd9f796d2999");
        } else {
            this.c = hVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54222d261aad234c7542aec27e132ef4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54222d261aad234c7542aec27e132ef4");
            return;
        }
        super.onViewCreated();
        this.b = (SCPoiCouponView) findView(R.id.shop_content_coupon_view);
    }

    public final void a(Poi.CouponSummary couponSummary) {
        Object[] objArr = {couponSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c8d49fb6bfd1e104cbc0d4ce958560c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c8d49fb6bfd1e104cbc0d4ce958560c");
        } else if (couponSummary == null) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setData(couponSummary);
            this.b.setPoiHelper(this.c.q());
        }
    }
}
