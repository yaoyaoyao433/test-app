package com.sankuai.waimai.platform.restaurant.membercoupon;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public Fragment b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3981b6cd8add68c234641b3fb76edbf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3981b6cd8add68c234641b3fb76edbf2");
        } else if (g.b()) {
            MPFloatCouponMemberFragment mPFloatCouponMemberFragment = new MPFloatCouponMemberFragment();
            mPFloatCouponMemberFragment.d = true;
            this.b = mPFloatCouponMemberFragment;
        } else {
            this.b = new RNFloatCouponMemberFragment();
        }
    }

    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a7e4274c8e80a38dd5c0e317964ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a7e4274c8e80a38dd5c0e317964ed9");
        } else if (!(this.b instanceof RNFloatCouponMemberFragment)) {
            if (this.b instanceof MPFloatCouponMemberFragment) {
                ((MPFloatCouponMemberFragment) this.b).k = fVar;
            }
        } else {
            ((RNFloatCouponMemberFragment) this.b).h = fVar;
        }
    }
}
