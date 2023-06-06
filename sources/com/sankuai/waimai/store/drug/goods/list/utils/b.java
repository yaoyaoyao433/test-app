package com.sankuai.waimai.store.drug.goods.list.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    private static void a(int i, String str, long j, String str2, long j2, long j3, String str3, k kVar) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j), str2, new Long(j2), new Long(j3), str3, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adc1d05db61b7499e7b87f8b92324aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adc1d05db61b7499e7b87f8b92324aec");
            return;
        }
        com.sankuai.waimai.store.drug.goods.list.base.d dVar = new com.sankuai.waimai.store.drug.goods.list.base.d(j, str2, kVar);
        if (i == 1) {
            com.sankuai.waimai.store.drug.base.net.b.a(str).a(j, str2, j2, j3, str3, dVar);
        } else if (i == 2) {
            com.sankuai.waimai.store.drug.base.net.b.a(str).b(j, str2, j2, j3, str3, dVar);
        } else if (i == 3) {
            com.sankuai.waimai.store.drug.base.net.c.a(str).a(j, j2, j3, str3, dVar);
        }
    }

    public static void a(String str, int i, String str2, long j, String str3, long j2, long j3, String str4, k kVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, new Long(j), str3, new Long(j2), new Long(j3), str4, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d5aef3a0e587c98dd7676ed67eec139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d5aef3a0e587c98dd7676ed67eec139");
        } else if (TextUtils.isEmpty(str)) {
            a(i, str2, j, str3, j2, j3, str4, kVar);
        } else if (new com.sankuai.waimai.store.base.preload.a().a(str, true, new com.sankuai.waimai.store.drug.base.net.a(kVar))) {
        } else {
            a(i, str2, j, str3, j2, j3, str4, kVar);
        }
    }

    public static void a(String str, long j, String str2, @NonNull Poi.PoiCouponItem poiCouponItem, k<Poi.PoiCouponItem> kVar) {
        Object[] objArr = {str, new Long(j), str2, poiCouponItem, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "149940b9f830c5f6e0b3a2cffa72d956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "149940b9f830c5f6e0b3a2cffa72d956");
        } else {
            a(j, str2, poiCouponItem.mCouponPoolId, poiCouponItem.mCouponId, poiCouponItem.mActivityId, poiCouponItem.mCouponType, poiCouponItem.extraData, kVar, str);
        }
    }

    public static void a(long j, String str, long j2, long j3, long j4, int i, String str2, j<Poi.PoiCouponItem> jVar, String str3) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), new Long(j4), Integer.valueOf(i), str2, jVar, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a64c7fc6cd668d72072a3143d4e22f7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a64c7fc6cd668d72072a3143d4e22f7a");
        } else {
            com.sankuai.waimai.store.drug.base.net.b.a(str3).a(j, str, j2, j3, j4, i, str2, jVar);
        }
    }

    public static void a(String str, k<Poi.MemberToken> kVar) {
        Object[] objArr = {str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66c8f0122a7b9aa7592ade39cb44a011", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66c8f0122a7b9aa7592ade39cb44a011");
        } else if (com.sankuai.waimai.store.config.d.h().a("marketingc/exchange_token", false)) {
            com.sankuai.waimai.store.drug.base.net.b.a(str).b(kVar);
        } else {
            com.sankuai.waimai.store.drug.base.net.c.a(str).b(kVar);
        }
    }
}
