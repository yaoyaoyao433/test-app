package com.dianping.live.live.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a = null;
    public static String b = "MLive_Float";
    public static String c = "MLive_Player";
    public static String d = "MLive_Pusher";
    public static String e = "MLive_Report";
    public static String f = "MLive_Card";
    public static String g = "MLive_List";

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8540fa712a2dedb5a1eda8a0c9328e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8540fa712a2dedb5a1eda8a0c9328e6c");
        }
    }
}
