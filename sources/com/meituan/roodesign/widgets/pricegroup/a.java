package com.meituan.roodesign.widgets.pricegroup;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static String a(Double d, int i, int i2) {
        Object[] objArr = {d, 0, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5faacb80a98cdae542d5405426e230a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5faacb80a98cdae542d5405426e230a");
        }
        if (d == null) {
            return "";
        }
        String format = String.format("%.2f", d);
        int indexOf = format.indexOf(46);
        int length = format.length();
        if (indexOf < 0 || indexOf >= length) {
            return format;
        }
        while (indexOf < length) {
            char charAt = format.charAt(length - 1);
            if (charAt != '0' && charAt != '.') {
                break;
            }
            length--;
        }
        return format.substring(0, length);
    }

    public static String a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aebd8414f4585fd150f8541ae8874598", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aebd8414f4585fd150f8541ae8874598") : a(Double.valueOf(d), 0, 2);
    }
}
