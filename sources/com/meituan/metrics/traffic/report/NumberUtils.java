package com.meituan.metrics.traffic.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NumberUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static long parseLong(Object obj, long j) {
        Object[] objArr = {obj, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f73bdfcf8eea6242d06149b4e2cd27a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f73bdfcf8eea6242d06149b4e2cd27a")).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        try {
            return Long.parseLong(String.valueOf(obj));
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static int parseInt(Object obj, int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c6e16924da3d1182c6c33244c7e1c94", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c6e16924da3d1182c6c33244c7e1c94")).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt(String.valueOf(obj));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static double parseDouble(Object obj, double d) {
        Object[] objArr = {obj, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "079a557358fd65d91d86b53ca62cff0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "079a557358fd65d91d86b53ca62cff0c")).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        try {
            return Double.parseDouble(String.valueOf(obj));
        } catch (NumberFormatException unused) {
            return d;
        }
    }
}
