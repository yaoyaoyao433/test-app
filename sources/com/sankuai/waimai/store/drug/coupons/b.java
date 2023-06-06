package com.sankuai.waimai.store.drug.coupons;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.poi.ActivityItem;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.CouponPoiCardInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.sankuai.waimai.store.drug.coupons.CouponsBaseDialogFragment] */
    public static void a(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, Poi.PoiCouponEntity poiCouponEntity, long j, List<ActivityItem> list, int i, boolean z, CouponPoiCardInfo couponPoiCardInfo, Poi.FriendAssistance friendAssistance, int i2) {
        Object[] objArr = {context, aVar, poiCouponEntity, 0L, list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), couponPoiCardInfo, friendAssistance, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43152345082bf1b82b20c218f8e80a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43152345082bf1b82b20c218f8e80a5b");
            return;
        }
        Object[] objArr2 = {context, aVar, poiCouponEntity, 0L, list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), couponPoiCardInfo, friendAssistance, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ba06134d966d8b41fb13998d21297add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ba06134d966d8b41fb13998d21297add");
            return;
        }
        FragmentManager supportFragmentManager = ((SCBaseActivity) context).getSupportFragmentManager();
        if (((CouponsBaseDialogFragment) supportFragmentManager.findFragmentByTag("drug_coupons")) != null) {
            return;
        }
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        MRNCouponsDialogFragment mRNCouponsDialogFragment = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a9a105e233d2873b3061a1f18650d0da", RobustBitConfig.DEFAULT_VALUE) ? (CouponsBaseDialogFragment) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a9a105e233d2873b3061a1f18650d0da") : new MRNCouponsDialogFragment();
        try {
            mRNCouponsDialogFragment.a(poiCouponEntity, 0L, aVar, list, i, z, couponPoiCardInfo, friendAssistance, i2, null);
            mRNCouponsDialogFragment.show(supportFragmentManager, "drug_coupons");
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            a(supportFragmentManager, mRNCouponsDialogFragment, "drug_coupons");
        }
    }

    public static void a(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ba5e83e0345d498e6987f660cd97208", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ba5e83e0345d498e6987f660cd97208");
        } else {
            a(context, aVar, 1);
        }
    }

    private static void a(FragmentManager fragmentManager, Fragment fragment, String str) {
        Object[] objArr = {fragmentManager, fragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6295ad6695b08713d121eebbf1f20c5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6295ad6695b08713d121eebbf1f20c5b");
            return;
        }
        try {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(fragment, str);
            beginTransaction.commitNowAllowingStateLoss();
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    public static void a(Context context) {
        CouponsBaseDialogFragment couponsBaseDialogFragment;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d590d1f824e39827464e559ce819ff79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d590d1f824e39827464e559ce819ff79");
        } else if ((context instanceof SCBaseActivity) && (couponsBaseDialogFragment = (CouponsBaseDialogFragment) ((SCBaseActivity) context).getSupportFragmentManager().findFragmentByTag("drug_coupons")) != null) {
            couponsBaseDialogFragment.dismissAllowingStateLoss();
        }
    }

    public static Dialog a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c757a2fd408a3376255e2a2b200c505b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c757a2fd408a3376255e2a2b200c505b");
        }
        if (!(context instanceof SCBaseActivity) || com.sankuai.waimai.store.util.b.a(context)) {
            return null;
        }
        try {
            CouponsBaseDialogFragment couponsBaseDialogFragment = (CouponsBaseDialogFragment) ((SCBaseActivity) context).getSupportFragmentManager().findFragmentByTag("drug_coupons");
            if (couponsBaseDialogFragment != null && couponsBaseDialogFragment.a() != null && com.sankuai.waimai.store.order.a.e().b(str, couponsBaseDialogFragment.a().d())) {
                return couponsBaseDialogFragment.getDialog();
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return null;
    }

    public static void a(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i) {
        Object[] objArr = {context, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "289d35db1220c745f09d668ebe4c168e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "289d35db1220c745f09d668ebe4c168e");
        } else if (aVar == null) {
        } else {
            boolean z = aVar.b.isUserNewCardPage == 1;
            CouponPoiCardInfo couponPoiCardInfo = aVar.b.couponPoiCardInfo;
            Poi.PoiCouponEntity poiCoupon = aVar.b.getPoiCoupon();
            Poi.FriendAssistance friendAssistance = aVar.b.getFriendAssistance();
            int i2 = aVar.b.isFlashShow;
            if (poiCoupon == null) {
                return;
            }
            a(context, aVar, poiCoupon, 0L, aVar.b.getBottomActivities(), i, z, couponPoiCardInfo, friendAssistance, i2);
        }
    }
}
