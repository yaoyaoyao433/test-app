package com.sankuai.waimai.foundation.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static boolean b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eac3b4d96431f94d1468246a8ed6f7f7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eac3b4d96431f94d1468246a8ed6f7f7")).booleanValue() : d % 1.0d != 0.0d;
    }

    public static String a(Double d, int i, int i2) {
        Object[] objArr = {d, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2627ce4c4214fec3b82bf86ef80a9849", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2627ce4c4214fec3b82bf86ef80a9849");
        }
        if (d == null) {
            return "";
        }
        if (i2 < 0) {
            i2 = 0;
        }
        String format = String.format("%." + i2 + "f", d);
        int indexOf = format.indexOf(46);
        int length = format.length();
        if (indexOf < 0 || indexOf >= length) {
            return format;
        }
        if (i > 0) {
            indexOf += i + 1;
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2db385c0fe3ec841bb84d9627082c6b2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2db385c0fe3ec841bb84d9627082c6b2") : a(Double.valueOf(d), 0, 2);
    }

    public static double a(Double d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7409139356e9604f9287a7151092e3a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7409139356e9604f9287a7151092e3a2")).doubleValue();
        }
        if (Math.abs(d.doubleValue()) < 1.0E-6d) {
            d = Double.valueOf(0.0d);
        }
        return d.doubleValue();
    }

    public static boolean a(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3162dfdc682cdd03bce527482fb0994", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3162dfdc682cdd03bce527482fb0994")).booleanValue() : Math.abs(d.doubleValue() - d2.doubleValue()) <= 1.0E-6d;
    }

    public static boolean b(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4c8c1e36e14afecf4a40800ef514726", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4c8c1e36e14afecf4a40800ef514726")).booleanValue() : d.doubleValue() < d2.doubleValue() && !a(d, d2);
    }

    public static boolean c(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "226d5d7389f87ec12508b26d390fdc61", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "226d5d7389f87ec12508b26d390fdc61")).booleanValue() : d.doubleValue() < d2.doubleValue() || a(d, d2);
    }

    public static boolean d(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b18570c8ddc4375a5543870c3e893718", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b18570c8ddc4375a5543870c3e893718")).booleanValue() : d.doubleValue() > d2.doubleValue() && !a(d, d2);
    }

    public static boolean e(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e586c2ad7c734b99966d82739897447a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e586c2ad7c734b99966d82739897447a")).booleanValue() : d.doubleValue() > d2.doubleValue() || a(d, d2);
    }
}
