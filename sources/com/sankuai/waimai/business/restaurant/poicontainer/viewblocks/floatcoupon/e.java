package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends b implements c {
    public static ChangeQuickRedirect b;
    public RNFloatCouponMemberFragment c;

    public e(String str, long j, String str2, com.sankuai.waimai.platform.restaurant.membercoupon.f fVar, RNFloatCouponMemberFragment rNFloatCouponMemberFragment) {
        super(rNFloatCouponMemberFragment);
        Object[] objArr = {str, new Long(j), str2, fVar, rNFloatCouponMemberFragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c688b6037884a9fa0d4cf49c76a71daf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c688b6037884a9fa0d4cf49c76a71daf");
            return;
        }
        this.c = rNFloatCouponMemberFragment;
        com.sankuai.waimai.platform.restaurant.membercoupon.d dVar = new com.sankuai.waimai.platform.restaurant.membercoupon.d();
        dVar.a = j;
        dVar.b = str2;
        dVar.c = str;
        dVar.d = "c_CijEL";
        dVar.f = 0;
        rNFloatCouponMemberFragment.a(dVar);
        rNFloatCouponMemberFragment.h = fVar;
        com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[RNFloatCouponMemberBlock-()] poiIdStr：" + str2, new Object[0]);
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.a
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55e44d9bc7107bdd613ef7c6638b1249", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55e44d9bc7107bdd613ef7c6638b1249");
        }
        if (h() != null) {
            return h().getView();
        }
        return null;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.c
    public final void g() {
        ReactContext currentReactContext;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d492537ea537fb395a8b4e49986486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d492537ea537fb395a8b4e49986486");
            return;
        }
        try {
            RNFloatCouponMemberFragment rNFloatCouponMemberFragment = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = RNFloatCouponMemberFragment.a;
            if (PatchProxy.isSupport(objArr2, rNFloatCouponMemberFragment, changeQuickRedirect2, false, "10d526bb7fdb4825b22effc598a6b08d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, rNFloatCouponMemberFragment, changeQuickRedirect2, false, "10d526bb7fdb4825b22effc598a6b08d");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = RNFloatCouponMemberFragment.a;
            if (PatchProxy.isSupport(objArr3, rNFloatCouponMemberFragment, changeQuickRedirect3, false, "336719de4c5350b77254d4666881335c", RobustBitConfig.DEFAULT_VALUE)) {
                currentReactContext = (ReactContext) PatchProxy.accessDispatch(objArr3, rNFloatCouponMemberFragment, changeQuickRedirect3, false, "336719de4c5350b77254d4666881335c");
            } else {
                ReactInstanceManager l = rNFloatCouponMemberFragment.l();
                currentReactContext = l != null ? l.getCurrentReactContext() : null;
            }
            if (currentReactContext != null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("coupon_type", String.valueOf(rNFloatCouponMemberFragment.k));
                com.sankuai.waimai.platform.restaurant.membercoupon.a.a(currentReactContext, "RefreshCouponMember", createMap);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.c
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63567bd70ac039ec382c5f2217cb64b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63567bd70ac039ec382c5f2217cb64b")).booleanValue() : this.c != null && this.c.c;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.c
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5100e061a17c5191bee969c6cb7db8ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5100e061a17c5191bee969c6cb7db8ef");
        } else if (this.c != null) {
            this.c.c = false;
        }
    }
}
