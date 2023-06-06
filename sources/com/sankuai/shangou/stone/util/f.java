package com.sankuai.shangou.stone.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static <T> T e(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82d336eff21f931b7634ad5c7e3435f8", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82d336eff21f931b7634ad5c7e3435f8") : obj;
    }

    public static long a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fb655e0fd87053aec0b89970f813d6b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fb655e0fd87053aec0b89970f813d6b")).longValue() : a(obj, 0L);
    }

    public static long a(Object obj, long j) {
        Object[] objArr = {obj, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a360af97cf23d8c56a1a7f739fc9886", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a360af97cf23d8c56a1a7f739fc9886")).longValue();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            return Long.parseLong(sb.toString());
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return j;
        }
    }

    public static int b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80c11f288db87c9769ca53e798ac8213", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80c11f288db87c9769ca53e798ac8213")).intValue() : a(obj, 0);
    }

    public static int a(Object obj, int i) {
        Object[] objArr = {obj, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58eaa0c792d2ecf925c13ead05aaf5a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58eaa0c792d2ecf925c13ead05aaf5a2")).intValue();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return 0;
        }
    }

    public static float c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d72e9d9387c59186f985ffb06e63c72", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d72e9d9387c59186f985ffb06e63c72")).floatValue() : a(obj, 0.0f);
    }

    public static float a(Object obj, float f) {
        Object[] objArr = {obj, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e23e372386470a941e96fe5b851802f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e23e372386470a941e96fe5b851802f")).floatValue();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            return Float.parseFloat(sb.toString());
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return f;
        }
    }

    public static double d(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84bc5ed84f9e5e1c5e7a7d05014feac7", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84bc5ed84f9e5e1c5e7a7d05014feac7")).doubleValue() : a(obj, 0.0d);
    }

    private static double a(Object obj, double d) {
        Object[] objArr = {obj, Double.valueOf(0.0d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d13ccea1e341e7588fc52d96c1f914e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d13ccea1e341e7588fc52d96c1f914e")).doubleValue();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            return Double.parseDouble(sb.toString());
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return 0.0d;
        }
    }
}
