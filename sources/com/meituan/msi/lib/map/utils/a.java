package com.meituan.msi.lib.map.utils;

import android.graphics.Color;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;

    public static int a(String str, String str2) {
        boolean z;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d162f6a548779c2cf9199a7cdf6d00b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d162f6a548779c2cf9199a7cdf6d00b1")).intValue();
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "06fd872ee52841944598c764d8de8823", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "06fd872ee52841944598c764d8de8823")).booleanValue();
        } else {
            if (str != null) {
                int length = str.length();
                Pattern compile = Pattern.compile("^#([A-Fa-f0-9]){3}");
                Pattern compile2 = Pattern.compile("^#([A-Fa-f0-9]){6}");
                Pattern compile3 = Pattern.compile("^#([A-Fa-f0-9]){8}");
                if ((length == 4 && compile.matcher(str).find()) || ((length == 7 && compile2.matcher(str).find()) || (length == 9 && compile3.matcher(str).find()))) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            try {
                int length2 = str.length();
                if (length2 == 4) {
                    char charAt = str.charAt(1);
                    char charAt2 = str.charAt(2);
                    char charAt3 = str.charAt(3);
                    return Color.parseColor("#" + charAt + charAt + charAt2 + charAt2 + charAt3 + charAt3);
                } else if (length2 == 7) {
                    return Color.parseColor(str);
                } else {
                    if (length2 == 9) {
                        return (int) ((Long.parseLong(str.substring(7, 9), 16) << 24) | Long.parseLong(str.substring(1, 7), 16));
                    }
                }
            } catch (Exception e) {
                j.a(a.class, str2, 10001, String.format(Locale.getDefault(), "color:%s,exception:%s", str, e.getMessage()));
                return 0;
            }
        }
        j.a(a.class, str2, 10001, String.format(Locale.getDefault(), "color:%s", str));
        return 0;
    }
}
