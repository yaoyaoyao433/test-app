package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(Context context, Poi.PoiCouponItem poiCouponItem, int i, int i2, String str, boolean z) {
        Object[] objArr = {context, poiCouponItem, Integer.valueOf(i), Integer.valueOf(i2), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae703637ec368af1a71c65cd5d091bc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae703637ec368af1a71c65cd5d091bc5");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[JudasUtils-logCouponView] poiIdStr：" + str, new Object[0]);
        JudasManualManager.a b = JudasManualManager.b("b_waimai_eiydl5v4_mv", "c_CijEL", AppUtil.generatePageInfoKey(context));
        b.a("poi_id", str);
        if (poiCouponItem.mCouponStatus == 4) {
            b.a("is_sqshop", i);
        }
        b.a("index", i2).a("layout_type", poiCouponItem.mUdsLayoutType).a("status", poiCouponItem.mCouponStatus).a("is_show", z ? 1 : 0).a();
    }

    public static void a(Context context, Poi.PoiCouponItem poiCouponItem, int i, int i2, long j, String str, boolean z) {
        Object[] objArr = {context, poiCouponItem, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88eb3fbc31660d89d0584881108d5402", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88eb3fbc31660d89d0584881108d5402");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[JudasUtils-logCouponClick] poiIdStr：" + str, new Object[0]);
        JudasManualManager.a a2 = JudasManualManager.a("b_waimai_eiydl5v4_mc", "c_CijEL", AppUtil.generatePageInfoKey(context));
        if (TextUtils.isEmpty(str)) {
            a2.a("poi_id", j);
        } else {
            a2.a("poi_id", str);
        }
        if (poiCouponItem.mCouponStatus == 4) {
            a2.a("is_sqshop", i);
        }
        a2.a("index", i2).a("layout_type", poiCouponItem.mUdsLayoutType).a("status", poiCouponItem.mCouponStatus).a("is_show", z ? 1 : 0).a();
    }
}
