package com.sankuai.waimai.store.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ae {
    public static ChangeQuickRedirect a = null;
    public static String b = "Poi_Info_PoiInfo";

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1eac411c02ec936dccac7adb919141bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1eac411c02ec936dccac7adb919141bc");
            return;
        }
        Object[] objArr2 = {str, str2, 3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "18d85778d2130b227cbdde4026676a3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "18d85778d2130b227cbdde4026676a3a");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            com.dianping.networklog.c.a(str + CommonConstant.Symbol.COLON + str2, 3);
            com.sankuai.shangou.stone.util.log.a.b(str, str2, new Object[0]);
        }
    }
}
