package com.sankuai.shangou.stone.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static String a(Double d, int i, int i2) {
        Object[] objArr = {d, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "886306a9c5696c0c0385327d9999bbe5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "886306a9c5696c0c0385327d9999bbe5");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d75ff40fe2492e0d91ac4ae0ad54045", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d75ff40fe2492e0d91ac4ae0ad54045") : a(Double.valueOf(d), 0, 2);
    }

    public static double a(Double d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3eee0931ac0dae3f9324ec97e33b0b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3eee0931ac0dae3f9324ec97e33b0b5")).doubleValue();
        }
        if (Math.abs(d.doubleValue()) < 1.0E-6d) {
            d = Double.valueOf(0.0d);
        }
        return d.doubleValue();
    }

    public static boolean a(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8f8834bee7f6af9783b726b4eb8826d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8f8834bee7f6af9783b726b4eb8826d")).booleanValue() : Math.abs(d.doubleValue() - d2.doubleValue()) <= 1.0E-6d;
    }

    public static boolean b(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac7209a9e9c0566dbcc0b041ff9fbcdd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac7209a9e9c0566dbcc0b041ff9fbcdd")).booleanValue() : d.doubleValue() < d2.doubleValue() && !a(d, d2);
    }

    public static boolean c(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c6d160cbc27bc3b77365573ee09ac62", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c6d160cbc27bc3b77365573ee09ac62")).booleanValue() : d.doubleValue() < d2.doubleValue() || a(d, d2);
    }

    public static boolean d(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97e961ef49d832418f91a76f7ad3122f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97e961ef49d832418f91a76f7ad3122f")).booleanValue() : d.doubleValue() > d2.doubleValue() && !a(d, d2);
    }

    public static boolean e(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b1a1ada9dfb64b2d14e8de51be93599", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b1a1ada9dfb64b2d14e8de51be93599")).booleanValue() : d.doubleValue() > d2.doubleValue() || a(d, d2);
    }
}
