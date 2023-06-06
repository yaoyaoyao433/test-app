package com.meituan.android.edfu.mbar.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static String b = "aiplatform_mbar";
    public static String c = "Mbar";
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static int g = 0;
    public static int h = 1;
    public static int i = 0;
    public static int j = 3;
    public static int k = 0;
    public static int l = 1;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9e7c8376a9909b65c50c78cf8f6bfc4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9e7c8376a9909b65c50c78cf8f6bfc4") : String.format("%s-%s", c, str);
    }
}
