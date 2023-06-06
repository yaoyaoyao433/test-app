package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends b implements c {
    public static ChangeQuickRedirect b;
    public MPFloatCouponMemberFragment c;

    public d(String str, long j, String str2, com.sankuai.waimai.platform.restaurant.membercoupon.f fVar, MPFloatCouponMemberFragment mPFloatCouponMemberFragment) {
        super(mPFloatCouponMemberFragment);
        Object[] objArr = {str, new Long(j), str2, fVar, mPFloatCouponMemberFragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "362dfbdc25f29ae0739f3d8363572076", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "362dfbdc25f29ae0739f3d8363572076");
            return;
        }
        this.c = mPFloatCouponMemberFragment;
        com.sankuai.waimai.platform.restaurant.membercoupon.d dVar = new com.sankuai.waimai.platform.restaurant.membercoupon.d();
        dVar.a = j;
        dVar.b = str2;
        dVar.c = str;
        dVar.d = "c_CijEL";
        dVar.f = 0;
        mPFloatCouponMemberFragment.l = dVar;
        mPFloatCouponMemberFragment.k = fVar;
        com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[RNFloatCouponMemberBlock-()] poiIdStr：" + str2, new Object[0]);
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.c
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e714a0ca08b62bcdfd548353d5a6ade2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e714a0ca08b62bcdfd548353d5a6ade2")).booleanValue() : this.c != null && this.c.j;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.c
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fa524ad0e7acb90a532d79693966a97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fa524ad0e7acb90a532d79693966a97");
        } else if (this.c != null) {
            this.c.j = false;
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce1264f1b15d09b74561a11d517852f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce1264f1b15d09b74561a11d517852f8");
        } else if (this.c != null) {
            MPFloatCouponMemberFragment mPFloatCouponMemberFragment = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = MPFloatCouponMemberFragment.c;
            if (PatchProxy.isSupport(objArr2, mPFloatCouponMemberFragment, changeQuickRedirect2, false, "d7b860dfd66b3113116bd44d215b6a1e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mPFloatCouponMemberFragment, changeQuickRedirect2, false, "d7b860dfd66b3113116bd44d215b6a1e");
                return;
            }
            com.sankuai.waimai.machpro.container.a aVar = mPFloatCouponMemberFragment.g;
            MachMap machMap = new MachMap();
            machMap.put("coupon_type", String.valueOf(mPFloatCouponMemberFragment.m));
            if (aVar != null) {
                aVar.a("RefreshCouponMember", machMap);
            }
        }
    }
}
