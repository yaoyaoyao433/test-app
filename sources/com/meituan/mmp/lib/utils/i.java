package com.meituan.mmp.lib.utils;

import android.graphics.Color;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06ef9f62f8476a771cb434601966cd19", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06ef9f62f8476a771cb434601966cd19")).intValue() : b(str, 0);
    }

    public static int a(String str, int i) {
        Object[] objArr = {str, -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e1693b137baa5aa5f325fe70b52a718", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e1693b137baa5aa5f325fe70b52a718")).intValue() : b(str, -1);
    }

    private static int b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0db5f913020a52aa3e1e68caf985627f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0db5f913020a52aa3e1e68caf985627f")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            char charAt = str.charAt(1);
            char charAt2 = str.charAt(2);
            char charAt3 = str.charAt(3);
            return Color.parseColor("#" + charAt + charAt + charAt2 + charAt2 + charAt3 + charAt3);
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4a0a387ee4a03c754d2471ecedc63d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4a0a387ee4a03c754d2471ecedc63d7")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return (int) ((Long.parseLong(str.substring(7, 9), 16) << 24) | Long.parseLong(str.substring(1, 7), 16));
        }
        if (str.length() == 7 || str.length() == 4) {
            return a(str);
        }
        com.meituan.mmp.lib.trace.b.e(String.format("Unknown color %s", str));
        return 0;
    }
}
