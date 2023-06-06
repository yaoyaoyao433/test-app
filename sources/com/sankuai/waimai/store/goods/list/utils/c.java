package com.sankuai.waimai.store.goods.list.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(int i, String str, long j, String str2, long j2, long j3, String str3, k kVar) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j), str2, new Long(j2), new Long(j3), str3, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c1ee2411c99ef09e57f2c1ba10e71a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c1ee2411c99ef09e57f2c1ba10e71a1");
            return;
        }
        com.sankuai.waimai.store.shopcart.c cVar = new com.sankuai.waimai.store.shopcart.c(j, str2, kVar);
        if (i == 1) {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str).a(j, str2, j2, j3, str3, cVar);
        } else if (i == 2) {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str).a(j, j2, j3, str3, cVar);
        } else if (i == 3) {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str).b(j, str2, j2, j3, str3, cVar);
        }
    }

    @Deprecated
    public static void a(String str, long j, String str2, @NonNull Poi.PoiCouponItem poiCouponItem, k<Poi.PoiCouponItem> kVar) {
        Object[] objArr = {str, new Long(j), str2, poiCouponItem, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fc2898cd0e7d2ae07d2c3270a984824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fc2898cd0e7d2ae07d2c3270a984824");
        } else {
            a(str, j, str2, poiCouponItem, "", "", kVar);
        }
    }

    public static void a(String str, long j, String str2, @NonNull Poi.PoiCouponItem poiCouponItem, String str3, String str4, k<Poi.PoiCouponItem> kVar) {
        Object[] objArr = {str, new Long(j), str2, poiCouponItem, str3, str4, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10f5a4c9555fccc9fc00ea515474e210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10f5a4c9555fccc9fc00ea515474e210");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str).a(j, str2, poiCouponItem.mCouponPoolId, poiCouponItem.mCouponId, poiCouponItem.mActivityId, poiCouponItem.mCouponType, poiCouponItem.extraData, str3, str4, kVar);
        }
    }

    public static void a(String str, long j, String str2, ArrayList<Long> arrayList, j<SpuProductsResponse> jVar) {
        Object[] objArr = {str, new Long(j), str2, arrayList, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86e59e0bfb281638ec7a23d84c501d49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86e59e0bfb281638ec7a23d84c501d49");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str).a(String.valueOf(j), str2, arrayList, jVar);
        }
    }
}
