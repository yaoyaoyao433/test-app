package com.meituan.android.legwork.utils;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, String str, double d, double d2, int i) {
        Object[] objArr = {activity, str, Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab54f2895c109d7428d1397308aa3e47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab54f2895c109d7428d1397308aa3e47");
            return;
        }
        String str2 = (com.meituan.android.legwork.a.b ? com.meituan.android.legwork.common.hostInfo.b.e().a(com.meituan.android.legwork.a.a(), "https://peisong.meituan.com/") : "https://peisong.meituan.com/") + "app/universalLocation/send";
        HashMap hashMap = new HashMap();
        hashMap.put("im_order_id", str);
        hashMap.put("im_lng", String.valueOf(d));
        hashMap.put("im_lat", String.valueOf(d2));
        hashMap.put("im_source", "C_PT");
        hashMap.put("notitlebar", "1");
        l.a(activity, str2, hashMap, i);
    }
}
