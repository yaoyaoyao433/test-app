package com.sankuai.waimai.addrsdk.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static double a(double d, int i) {
        Object[] objArr = {Double.valueOf(d), 6};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d56f65a694e8470dc6f65a40ea0460cb", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d56f65a694e8470dc6f65a40ea0460cb")).doubleValue() : new BigDecimal(d).setScale(6, RoundingMode.UP).doubleValue();
    }

    public static String a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "592ad820055bebeb08315d9d6d5ee24f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "592ad820055bebeb08315d9d6d5ee24f");
        }
        StringBuilder sb = new StringBuilder();
        sb.append((long) (d * 1000000.0d));
        return sb.toString();
    }

    public static String b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a851e785b53f5fb7a07d36bed9e3bc79", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a851e785b53f5fb7a07d36bed9e3bc79");
        }
        StringBuilder sb = new StringBuilder();
        sb.append((long) (d * 1000000.0d));
        return sb.toString();
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44b19d66934f4783a7201e6feb2d50f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44b19d66934f4783a7201e6feb2d50f2")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
