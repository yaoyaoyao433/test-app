package com.meituan.android.paybase.utils;

import android.support.annotation.NonNull;
import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class v {
    public static ChangeQuickRedirect a;

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99d20ca3fe44a1ceeff9f7a5cc010549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99d20ca3fe44a1ceeff9f7a5cc010549");
        } else {
            ae.a(null, str, map, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.PayBaseStatisticsUtils", true);
        }
    }

    public static void a(@NonNull String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5097b253767000d094c9843bfe932821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5097b253767000d094c9843bfe932821");
        } else {
            ae.a(str, str2, str3, map, ae.a.CLICK, 0, "com.meituan.android.paybase.utils.PayBaseStatisticsUtils", true);
        }
    }
}
