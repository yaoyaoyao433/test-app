package com.meituan.msc.common.utils;

import android.graphics.Color;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "602988969b38e524c4182286c8150bd3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "602988969b38e524c4182286c8150bd3")).intValue() : a(str, 0);
    }

    public static int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b09097c0c0d102d1a5587728540712f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b09097c0c0d102d1a5587728540712f")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            char charAt = str.charAt(1);
            char charAt2 = str.charAt(2);
            char charAt3 = str.charAt(3);
            try {
                return Color.parseColor("#" + charAt + charAt + charAt2 + charAt2 + charAt3 + charAt3);
            } catch (Exception unused) {
                return i;
            }
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused2) {
            return i;
        }
    }

    public static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6859d5f94161c8f9889e95a866ee2887", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6859d5f94161c8f9889e95a866ee2887")).intValue();
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
        com.meituan.msc.modules.reporter.g.d(String.format("Unknown color %s", str));
        return 0;
    }
}
