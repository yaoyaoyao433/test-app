package com.meituan.msi.util;

import android.graphics.Color;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e98b6b5d5823d896b1ab74f90593bde", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e98b6b5d5823d896b1ab74f90593bde")).intValue() : a(str, 0);
    }

    private static int a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b1044def4a52784f226785762d8550a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b1044def4a52784f226785762d8550a")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            char charAt = str.charAt(1);
            char charAt2 = str.charAt(2);
            char charAt3 = str.charAt(3);
            try {
                return Color.parseColor("#" + charAt + charAt + charAt2 + charAt2 + charAt3 + charAt3);
            } catch (Exception unused) {
                return 0;
            }
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8a10c3b172a33ba458838fa7bf35c30", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8a10c3b172a33ba458838fa7bf35c30")).intValue();
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
        return 0;
    }
}
