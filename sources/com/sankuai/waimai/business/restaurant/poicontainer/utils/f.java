package com.sankuai.waimai.business.restaurant.poicontainer.utils;

import android.app.Activity;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.PoiCommentSP;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(String str, int i, boolean z, Activity activity) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93948bce7c48d11e81e0f25dd7e79c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93948bce7c48d11e81e0f25dd7e79c97");
        } else if (i == PoiCommentSP.a()) {
            if (z) {
                PoiCommentSP.a(-1);
            }
            long currentTimeMillis = System.currentTimeMillis() - PoiCommentSP.d();
            PoiCommentSP.c();
            JudasManualManager.a a2 = JudasManualManager.a("b_waimai_e8tu0gdr_mc").a("c_CijEL");
            a2.b = AppUtil.generatePageInfoKey(activity);
            a2.a("c_CijEL").a("viewtime", currentTimeMillis / 1000).a("poi_id", str).a();
        }
    }
}
