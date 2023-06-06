package com.sankuai.waimai.foundation.location;

import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.MtLocationConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.e;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    private static double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "503b5f324d45e34cce643b04f23255a8", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "503b5f324d45e34cce643b04f23255a8")).doubleValue() : (d * 3.141592653589793d) / 180.0d;
    }

    public static void k() {
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0825fbd0d9fe778af6f9cb63e755270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0825fbd0d9fe778af6f9cb63e755270");
        } else {
            h.a(j);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9949e794ce37c3b0e027a1a6c2d651c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9949e794ce37c3b0e027a1a6c2d651c5");
            return;
        }
        if (str == null) {
            str = "";
        }
        h.a(str);
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c5052d3b0a5906d4a87235c58462884", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c5052d3b0a5906d4a87235c58462884")).longValue() : h.a();
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4939cf9a985edd29b05a988b9de0713", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4939cf9a985edd29b05a988b9de0713") : h.b();
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dc67364a8d4c10f90723d91f53c4c85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dc67364a8d4c10f90723d91f53c4c85");
            return;
        }
        if (str == null) {
            str = "";
        }
        h.b(str);
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f8358c1c8c029c0678743d56a04caca", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f8358c1c8c029c0678743d56a04caca") : h.c();
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "324ba12c88bf5ffd7fc875b2ef381a59", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "324ba12c88bf5ffd7fc875b2ef381a59") : h.d();
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "001eb8053775a1045a48dc469e76c943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "001eb8053775a1045a48dc469e76c943");
            return;
        }
        if (str == null) {
            str = "";
        }
        h.c(str);
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0fab5cfaaca8325449f5d0e88ebcf75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0fab5cfaaca8325449f5d0e88ebcf75");
            return;
        }
        if (str == null) {
            str = "";
        }
        h.e(str);
    }

    public static void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a09f3481ab797f7a770828c1e1241ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a09f3481ab797f7a770828c1e1241ca");
            return;
        }
        if (str == null) {
            str = "";
        }
        h.d(str);
    }

    public static double[] e() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf0c61ccb9f0518428cb0120e88c09a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf0c61ccb9f0518428cb0120e88c09a9");
        }
        double[] a2 = e.c() != null ? e.c().a() : null;
        if (a2 != null) {
            return a2;
        }
        String e = h.e();
        if (TextUtils.isEmpty(e) || (split = e.split("-_-")) == null || split.length < 2) {
            return null;
        }
        double[] dArr = new double[2];
        try {
            dArr[0] = Double.parseDouble(split[0]);
            dArr[1] = Double.parseDouble(split[1]);
            return dArr;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String[] f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dfc9cd247fd301fdb5ef939494b47c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dfc9cd247fd301fdb5ef939494b47c5");
        }
        double[] e = e();
        if (e == null) {
            e = h();
        }
        if (e == null || e.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((long) (e[0] * 1000000.0d));
        StringBuilder sb2 = new StringBuilder();
        sb2.append((long) (e[1] * 1000000.0d));
        return new String[]{sb.toString(), sb2.toString()};
    }

    public static void a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad0562efce3d0bfefcb40a3b9c895e04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad0562efce3d0bfefcb40a3b9c895e04");
            return;
        }
        double[] a2 = e.c().a();
        if (a2 != null) {
            d = a2[0];
            d2 = a2[1];
        }
        h.g(d + "-_-" + d2);
        b = true;
    }

    public static boolean g() {
        return b;
    }

    public static double[] h() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d205183bce03dcbb79a40606ff4083de", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d205183bce03dcbb79a40606ff4083de");
        }
        double[] a2 = e.c() != null ? e.c().a() : null;
        if (a2 != null) {
            return a2;
        }
        String f = h.f();
        if (TextUtils.isEmpty(f) || (split = f.split("-_-")) == null || split.length != 2) {
            return null;
        }
        double[] dArr = new double[2];
        try {
            dArr[0] = Double.parseDouble(split[0]);
            dArr[1] = Double.parseDouble(split[1]);
            return dArr;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static void a(double d, double d2, String str) {
        double d3;
        double d4;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b1b9be2ec25e12a0a1e4761d028deb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b1b9be2ec25e12a0a1e4761d028deb1");
            return;
        }
        double[] a2 = e.c().a();
        if (a2 != null) {
            d3 = a2[0];
            d4 = a2[1];
        } else {
            d3 = d;
            d4 = d2;
        }
        e.c().a(d3, d4);
        h.f(d3 + "-_-" + d4 + "-_-" + str);
    }

    public static String i() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b0ee067f2db892b5bb8c7f220391a2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b0ee067f2db892b5bb8c7f220391a2d");
        }
        String e = h.e();
        if (TextUtils.isEmpty(e) || (split = e.split("-_-")) == null || split.length < 3 || TextUtils.isEmpty(split[2])) {
            return "";
        }
        String str = split[2];
        return StringUtil.NULL.equals(str) ? "" : str;
    }

    public static WMLocation j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e0fc42a159efeb8903b5f74b2b03db7", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e0fc42a159efeb8903b5f74b2b03db7");
        }
        double[] e = e();
        WMLocation wMLocation = new WMLocation("waimaiProvider");
        if (e != null) {
            try {
                wMLocation.setLatitude(e[0]);
                wMLocation.setLongitude(e[1]);
            } catch (Exception e2) {
                com.sankuai.waimai.foundation.location.utils.b.a(e2);
            }
        }
        return wMLocation;
    }

    public static double a(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0078077b71bc314ed5b0336f69e77d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0078077b71bc314ed5b0336f69e77d0")).doubleValue();
        }
        double a2 = a(d);
        double a3 = a(d3);
        return Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((a2 - a3) / 2.0d), 2.0d) + ((Math.cos(a2) * Math.cos(a3)) * Math.pow(Math.sin((a(d2) - a(d4)) / 2.0d), 2.0d)))) * 2.0d) * 6378.137d) * 10000.0d) / 10;
    }

    public static double[] f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e49641ed072e63d25278588e6da1862", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e49641ed072e63d25278588e6da1862");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (split.length < 2) {
            return null;
        }
        try {
            return new double[]{Double.valueOf(split[0]).doubleValue(), Double.valueOf(split[1]).doubleValue()};
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd1007386717de709a6640ae5ad268be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd1007386717de709a6640ae5ad268be");
        } else {
            h.a((int) (f * 1000.0f));
        }
    }

    public static int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5c7b6077ce25db037610d6643f5b247", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5c7b6077ce25db037610d6643f5b247")).intValue() : h.g();
    }

    public static MtLocationConfig a(MtLocationConfig mtLocationConfig) {
        Object[] objArr = {mtLocationConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32adc95720fe483e5528eb6224de6c44", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocationConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32adc95720fe483e5528eb6224de6c44");
        }
        if (mtLocationConfig == null) {
            mtLocationConfig = new MtLocationConfig();
            mtLocationConfig.setNeedGps(false);
        }
        mtLocationConfig.setType("mt");
        if (mtLocationConfig.getMode() <= 0 || mtLocationConfig.getMode() > 7) {
            mtLocationConfig.setMode(1);
        }
        if (mtLocationConfig.getLocationTimeout() <= 0) {
            mtLocationConfig.setLocationTimeout(10000L);
        }
        if (mtLocationConfig.getCacheValidTime() <= 0) {
            mtLocationConfig.setCacheValidTime(1000L);
        }
        if (mtLocationConfig.getGpsMinTime() <= 0) {
            mtLocationConfig.setGpsMinTime(100L);
        }
        if (mtLocationConfig.getDeliverInterval() <= 0) {
            mtLocationConfig.setDeliverInterval(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
        if (mtLocationConfig.getGpsFixFirstWait() <= 0) {
            mtLocationConfig.setGpsFixFirstWait(0L);
        }
        return mtLocationConfig;
    }

    public static void a(e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adeee7b5d79ac1189bc1cec16602e489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adeee7b5d79ac1189bc1cec16602e489");
        } else {
            h.a(aVar);
        }
    }
}
