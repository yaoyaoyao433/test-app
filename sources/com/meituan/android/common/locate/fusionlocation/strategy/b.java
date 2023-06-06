package com.meituan.android.common.locate.fusionlocation.strategy;

import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.fusionlocation.matrix.Matrix;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.reporter.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static double f;
    private static double g;
    private static Matrix h = new Matrix(1, 4);
    private static Matrix i = new Matrix(1, 4);
    private static Matrix j = new Matrix(1, 4);
    private static Matrix k = Matrix.identity(4, 4);
    private static Matrix l = Matrix.identity(4, 4);
    private static Matrix m = Matrix.identity(4, 4);
    private static Matrix n = Matrix.identity(4, 4);
    private static Matrix o = Matrix.identity(4, 4);
    private static Matrix p = Matrix.identity(4, 4);
    public static long a = 1000;
    private static long q = 10;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static String e = "默认非飘点";
    private static double r = h.a(g.a()).r();
    private static double s = h.a(g.a()).s();
    private static int t = h.a(g.a()).h();
    private static double u = h.a(g.a()).e();
    private static double v = h.a(g.a()).f();
    private static double w = h.a(g.a()).t();
    private static double x = h.a(g.a()).u();

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cce4f295aebd8429e268e73f50742efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cce4f295aebd8429e268e73f50742efa");
            return;
        }
        Matrix minus = j.minus(h.times(o));
        if (minus.get(0, 2) > 3.141592653589793d) {
            minus.set(0, 2, minus.get(0, 2) - 6.283185307179586d);
        }
        if (minus.get(0, 2) < -3.141592653589793d) {
            minus.set(0, 2, minus.get(0, 2) + 6.283185307179586d);
        }
        Matrix times = l.times(o.transpose()).times(o.times(l).times(o.transpose()).plus(p).inverse());
        Matrix plus = h.plus(minus.times(times));
        h = plus;
        plus.set(0, 2, com.meituan.android.common.locate.fusionlocation.utils.b.c(h.get(0, 2)));
        Matrix identity = Matrix.identity(4, 4);
        l = identity.minus(times.times(o)).times(l).times(identity.minus(times.times(o)).transpose()).plus(times.times(p).times(times.transpose()));
    }

    public static void a(MtLocation mtLocation, com.meituan.android.common.locate.fusionlocation.b bVar) {
        Object[] objArr = {mtLocation, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77255b928bf523b735bfb5f91977da00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77255b928bf523b735bfb5f91977da00");
            return;
        }
        f = mtLocation.getLatitude();
        g = mtLocation.getLongitude();
        h.set(0, 0, 0.0d);
        h.set(0, 1, 0.0d);
        h.set(0, 2, com.meituan.android.common.locate.fusionlocation.utils.b.c(1.5707963267948966d - com.meituan.android.common.locate.fusionlocation.utils.b.a(mtLocation.getBearing())));
        h.set(0, 3, mtLocation.getSpeed());
        i = h;
        Matrix identity = Matrix.identity(4, 4);
        l = identity;
        identity.set(0, 0, 250000.0d);
        l.set(1, 1, 250000.0d);
        l.set(2, 2, 9.869604401089358d);
        l.set(3, 3, 2500.0d);
        m = l;
        Matrix identity2 = Matrix.identity(4, 4);
        n = identity2;
        identity2.set(0, 0, 64.0d);
        n.set(1, 1, 64.0d);
        n.set(2, 2, 0.6168502750680849d);
        n.set(3, 3, 64.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0286, code lost:
        if (r27.getSpeed() >= 3.0f) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02d9, code lost:
        if (r27.getSpeed() >= 3.0f) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02db, code lost:
        r3 = 9.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02de, code lost:
        r3 = 100.0d;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.meituan.android.common.locate.MtLocation r27, boolean r28, java.lang.String r29, com.meituan.android.common.locate.fusionlocation.b r30) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.fusionlocation.strategy.b.a(com.meituan.android.common.locate.MtLocation, boolean, java.lang.String, com.meituan.android.common.locate.fusionlocation.b):void");
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ae48419caee647ad304b7d2c0bb1c3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ae48419caee647ad304b7d2c0bb1c3e");
            return;
        }
        if (z) {
            Matrix matrix = h;
            i = matrix;
            matrix.set(0, 3, i.get(0, 3) / 10.0d);
            k = Matrix.identity(4, 4);
        } else {
            i = h;
            double d2 = h.get(0, 0);
            double d3 = h.get(0, 1);
            double d4 = h.get(0, 2);
            double d5 = h.get(0, 3);
            i.set(0, 0, d2 + (((a * d5) * Math.cos(d4)) / 1000.0d));
            i.set(0, 1, d3 + (((a * d5) * Math.sin(d4)) / 1000.0d));
            k.set(0, 2, (((-Math.sin(d4)) * d5) * a) / 1000.0d);
            k.set(0, 3, (a * Math.cos(d4)) / 1000.0d);
            k.set(1, 2, ((Math.cos(d4) * d5) * a) / 1000.0d);
            k.set(1, 3, (a * Math.sin(d4)) / 1000.0d);
        }
        m = k.times(l).times(k.transpose()).plus(n);
        h = i;
        l = m;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03be A[Catch: Exception -> 0x04cf, TryCatch #0 {Exception -> 0x04cf, blocks: (B:10:0x0042, B:12:0x004b, B:16:0x0066, B:17:0x0068, B:19:0x0070, B:21:0x0088, B:23:0x0091, B:26:0x0097, B:28:0x00b7, B:32:0x00c0, B:34:0x00d8, B:35:0x00f0, B:37:0x018e, B:39:0x0194, B:40:0x01be, B:87:0x0308, B:89:0x0315, B:91:0x0319, B:93:0x0323, B:95:0x035d, B:97:0x0369, B:99:0x036f, B:101:0x0375, B:102:0x0396, B:103:0x0399, B:104:0x03be, B:106:0x03c4, B:107:0x03e6, B:108:0x040b, B:110:0x0418, B:112:0x041d, B:113:0x0425, B:115:0x0429, B:117:0x0449, B:119:0x045a, B:118:0x0451, B:41:0x01c2, B:43:0x01c8, B:45:0x01ce, B:46:0x01f9, B:48:0x0200, B:50:0x020d, B:53:0x0238, B:55:0x023c, B:58:0x0261, B:60:0x0269, B:61:0x028a, B:65:0x0296, B:67:0x029a, B:68:0x02a2, B:70:0x02af, B:72:0x02be, B:73:0x02c6, B:75:0x02cc, B:77:0x02d2, B:79:0x02df, B:80:0x02e7, B:82:0x02ed, B:84:0x02f3, B:86:0x0300, B:121:0x0481, B:123:0x0488, B:125:0x04ad), top: B:130:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0429 A[Catch: Exception -> 0x04cf, TryCatch #0 {Exception -> 0x04cf, blocks: (B:10:0x0042, B:12:0x004b, B:16:0x0066, B:17:0x0068, B:19:0x0070, B:21:0x0088, B:23:0x0091, B:26:0x0097, B:28:0x00b7, B:32:0x00c0, B:34:0x00d8, B:35:0x00f0, B:37:0x018e, B:39:0x0194, B:40:0x01be, B:87:0x0308, B:89:0x0315, B:91:0x0319, B:93:0x0323, B:95:0x035d, B:97:0x0369, B:99:0x036f, B:101:0x0375, B:102:0x0396, B:103:0x0399, B:104:0x03be, B:106:0x03c4, B:107:0x03e6, B:108:0x040b, B:110:0x0418, B:112:0x041d, B:113:0x0425, B:115:0x0429, B:117:0x0449, B:119:0x045a, B:118:0x0451, B:41:0x01c2, B:43:0x01c8, B:45:0x01ce, B:46:0x01f9, B:48:0x0200, B:50:0x020d, B:53:0x0238, B:55:0x023c, B:58:0x0261, B:60:0x0269, B:61:0x028a, B:65:0x0296, B:67:0x029a, B:68:0x02a2, B:70:0x02af, B:72:0x02be, B:73:0x02c6, B:75:0x02cc, B:77:0x02d2, B:79:0x02df, B:80:0x02e7, B:82:0x02ed, B:84:0x02f3, B:86:0x0300, B:121:0x0481, B:123:0x0488, B:125:0x04ad), top: B:130:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036f A[Catch: Exception -> 0x04cf, TryCatch #0 {Exception -> 0x04cf, blocks: (B:10:0x0042, B:12:0x004b, B:16:0x0066, B:17:0x0068, B:19:0x0070, B:21:0x0088, B:23:0x0091, B:26:0x0097, B:28:0x00b7, B:32:0x00c0, B:34:0x00d8, B:35:0x00f0, B:37:0x018e, B:39:0x0194, B:40:0x01be, B:87:0x0308, B:89:0x0315, B:91:0x0319, B:93:0x0323, B:95:0x035d, B:97:0x0369, B:99:0x036f, B:101:0x0375, B:102:0x0396, B:103:0x0399, B:104:0x03be, B:106:0x03c4, B:107:0x03e6, B:108:0x040b, B:110:0x0418, B:112:0x041d, B:113:0x0425, B:115:0x0429, B:117:0x0449, B:119:0x045a, B:118:0x0451, B:41:0x01c2, B:43:0x01c8, B:45:0x01ce, B:46:0x01f9, B:48:0x0200, B:50:0x020d, B:53:0x0238, B:55:0x023c, B:58:0x0261, B:60:0x0269, B:61:0x028a, B:65:0x0296, B:67:0x029a, B:68:0x02a2, B:70:0x02af, B:72:0x02be, B:73:0x02c6, B:75:0x02cc, B:77:0x02d2, B:79:0x02df, B:80:0x02e7, B:82:0x02ed, B:84:0x02f3, B:86:0x0300, B:121:0x0481, B:123:0x0488, B:125:0x04ad), top: B:130:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.meituan.android.common.locate.MtLocation r23, java.lang.Boolean r24, org.json.JSONObject r25, com.meituan.android.common.locate.fusionlocation.b r26) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.fusionlocation.strategy.b.a(com.meituan.android.common.locate.MtLocation, java.lang.Boolean, org.json.JSONObject, com.meituan.android.common.locate.fusionlocation.b):boolean");
    }
}
