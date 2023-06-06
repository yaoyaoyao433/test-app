package com.meituan.msc.mmpviews.list;

import android.content.Context;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static DisplayMetrics b;

    public static double a(Context context, String str) {
        double parseDouble;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52da2172f26c65b138219cf75d5d1283", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52da2172f26c65b138219cf75d5d1283")).doubleValue();
        }
        String trim = str.trim();
        if (trim.endsWith("rpx")) {
            parseDouble = Double.parseDouble(trim.substring(0, trim.length() - 3));
        } else if (trim.endsWith("px")) {
            return Double.parseDouble(trim.substring(0, trim.length() - 2));
        } else {
            try {
                parseDouble = Double.parseDouble(trim);
            } catch (NumberFormatException unused) {
                return 0.0d;
            }
        }
        if (parseDouble == 0.0d) {
            return 0.0d;
        }
        if (b == null) {
            b = context.getResources().getDisplayMetrics();
        }
        double d = (parseDouble / 750.0d) * b.widthPixels;
        double floor = d >= 0.0d ? Math.floor(d + 1.0E-4d) : Math.ceil(d - 1.0E-4d);
        if (floor == 0.0d) {
            return 1.0d;
        }
        return floor;
    }
}
