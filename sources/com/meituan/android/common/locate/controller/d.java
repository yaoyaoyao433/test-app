package com.meituan.android.common.locate.controller;

import android.os.SystemClock;
import android.util.Pair;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.reporter.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class d {
    private static volatile d M;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int A;
    private List<Double> B;
    private List<Double> C;
    private int D;
    private int E;
    private long F;
    private double G;
    private double H;
    private int I;
    private List<Pair<Long, Pair<Integer, Double>>> J;
    private a K;
    private Pair<MtLocation, Pair<Integer, Double>> L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private int x;
    private int y;
    private int z;

    /* loaded from: classes2.dex */
    public interface a {
        int a();

        void a(String str, Object obj);
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a0c2819377b14d7168d395829fff62b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a0c2819377b14d7168d395829fff62b");
            return;
        }
        this.a = "IndoorPredictController\n";
        this.b = "isMainConnect";
        this.c = "mainConnectWifiRssi";
        this.d = "mainConnectWifiSsid";
        this.e = "maxWifiRssi";
        this.f = "maxWifiSsid";
        this.g = "top5WifiRssiAvg";
        this.h = "gnssStatusScore";
        this.i = "totalSateCount";
        this.j = "usedGoodSnrGpsSateCount";
        this.k = "usedSateCount";
        this.l = "usedSateCn0DbHzMax";
        this.m = "usedSateCn0DbHzAvg";
        this.n = "usedSateMaxAzimuth";
        this.o = "usedGpsSateCount";
        this.p = "usedGpsSateCn0DbHzMax";
        this.q = "usedGpsSateCn0DbHzAvg";
        this.r = "usedGpsSateMaxAzimuth";
        this.s = "lightSensorTimeHour";
        this.t = "lightSensorTimeMonth";
        this.u = "mLastLightSensorValue";
        this.v = "pressureTs";
        this.w = "pressureValue";
        this.x = h.a(g.a()).o();
        this.y = h.a(g.a()).p();
        this.z = h.a(g.a()).q();
        this.A = h.a(g.a()).l();
        this.B = com.meituan.android.common.locate.fusionlocation.featues.b.b;
        this.C = com.meituan.android.common.locate.fusionlocation.featues.b.a;
        this.D = h.a(g.a()).m();
        this.E = h.a(g.a()).n();
        this.F = h.a(g.a()).b();
        this.G = h.a(g.a()).w();
        this.H = h.a(g.a()).x();
        this.I = 5;
        this.J = new LinkedList();
    }

    private Pair<Integer, Double> a(Pair<Integer, Double> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a7970b120664705e0eb69aebafe54a7", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a7970b120664705e0eb69aebafe54a7") : (((Double) pair.second).doubleValue() >= this.G || ((Double) pair.second).doubleValue() <= this.H) ? pair : new Pair<>(-1, pair.second);
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2dd96cb49f4f43e470923b146658740c", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2dd96cb49f4f43e470923b146658740c");
        }
        if (M == null) {
            synchronized (d.class) {
                if (M == null) {
                    M = new d();
                }
            }
        }
        return M;
    }

    private void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1adf4714619578099abd0d41ded3012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1adf4714619578099abd0d41ded3012");
        } else if (this.K != null) {
            this.K.a(str, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06d4 A[Catch: Exception -> 0x0847, TryCatch #0 {Exception -> 0x0847, blocks: (B:6:0x0021, B:8:0x01b7, B:10:0x01ed, B:12:0x022b, B:13:0x0244, B:15:0x024e, B:17:0x0286, B:19:0x02f7, B:23:0x0300, B:25:0x0335, B:27:0x0341, B:29:0x034b, B:31:0x034f, B:33:0x03d1, B:35:0x03db, B:37:0x03e5, B:38:0x03eb, B:43:0x03fd, B:45:0x0419, B:47:0x041d, B:49:0x0426, B:51:0x0443, B:53:0x0452, B:55:0x0456, B:57:0x045f, B:60:0x047e, B:62:0x0488, B:66:0x049b, B:68:0x04b8, B:72:0x04d0, B:74:0x04ed, B:78:0x04ff, B:80:0x051c, B:82:0x052b, B:84:0x0532, B:86:0x054e, B:92:0x0564, B:90:0x0560, B:98:0x0588, B:100:0x058d, B:108:0x05b1, B:114:0x05c0, B:112:0x05bc, B:117:0x05df, B:122:0x05f5, B:124:0x05fc, B:126:0x0619, B:132:0x0630, B:134:0x0637, B:136:0x063b, B:138:0x063f, B:140:0x065c, B:146:0x0673, B:148:0x067a, B:150:0x0697, B:154:0x06ae, B:99:0x058b, B:156:0x06ca, B:158:0x06d4, B:161:0x06e6, B:167:0x06fb, B:163:0x06ed, B:165:0x06f4, B:169:0x0718, B:171:0x0728, B:173:0x0732, B:175:0x073b, B:177:0x0745, B:179:0x074e, B:181:0x076b, B:185:0x0781, B:187:0x079e, B:191:0x07b1, B:195:0x07be, B:204:0x07e0, B:208:0x07f9, B:207:0x07f6, B:210:0x0801, B:214:0x081b, B:213:0x0818, B:216:0x0823, B:220:0x083b, B:40:0x03ee, B:42:0x03f8), top: B:225:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07e0 A[Catch: Exception -> 0x0847, TryCatch #0 {Exception -> 0x0847, blocks: (B:6:0x0021, B:8:0x01b7, B:10:0x01ed, B:12:0x022b, B:13:0x0244, B:15:0x024e, B:17:0x0286, B:19:0x02f7, B:23:0x0300, B:25:0x0335, B:27:0x0341, B:29:0x034b, B:31:0x034f, B:33:0x03d1, B:35:0x03db, B:37:0x03e5, B:38:0x03eb, B:43:0x03fd, B:45:0x0419, B:47:0x041d, B:49:0x0426, B:51:0x0443, B:53:0x0452, B:55:0x0456, B:57:0x045f, B:60:0x047e, B:62:0x0488, B:66:0x049b, B:68:0x04b8, B:72:0x04d0, B:74:0x04ed, B:78:0x04ff, B:80:0x051c, B:82:0x052b, B:84:0x0532, B:86:0x054e, B:92:0x0564, B:90:0x0560, B:98:0x0588, B:100:0x058d, B:108:0x05b1, B:114:0x05c0, B:112:0x05bc, B:117:0x05df, B:122:0x05f5, B:124:0x05fc, B:126:0x0619, B:132:0x0630, B:134:0x0637, B:136:0x063b, B:138:0x063f, B:140:0x065c, B:146:0x0673, B:148:0x067a, B:150:0x0697, B:154:0x06ae, B:99:0x058b, B:156:0x06ca, B:158:0x06d4, B:161:0x06e6, B:167:0x06fb, B:163:0x06ed, B:165:0x06f4, B:169:0x0718, B:171:0x0728, B:173:0x0732, B:175:0x073b, B:177:0x0745, B:179:0x074e, B:181:0x076b, B:185:0x0781, B:187:0x079e, B:191:0x07b1, B:195:0x07be, B:204:0x07e0, B:208:0x07f9, B:207:0x07f6, B:210:0x0801, B:214:0x081b, B:213:0x0818, B:216:0x0823, B:220:0x083b, B:40:0x03ee, B:42:0x03f8), top: B:225:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0801 A[Catch: Exception -> 0x0847, TryCatch #0 {Exception -> 0x0847, blocks: (B:6:0x0021, B:8:0x01b7, B:10:0x01ed, B:12:0x022b, B:13:0x0244, B:15:0x024e, B:17:0x0286, B:19:0x02f7, B:23:0x0300, B:25:0x0335, B:27:0x0341, B:29:0x034b, B:31:0x034f, B:33:0x03d1, B:35:0x03db, B:37:0x03e5, B:38:0x03eb, B:43:0x03fd, B:45:0x0419, B:47:0x041d, B:49:0x0426, B:51:0x0443, B:53:0x0452, B:55:0x0456, B:57:0x045f, B:60:0x047e, B:62:0x0488, B:66:0x049b, B:68:0x04b8, B:72:0x04d0, B:74:0x04ed, B:78:0x04ff, B:80:0x051c, B:82:0x052b, B:84:0x0532, B:86:0x054e, B:92:0x0564, B:90:0x0560, B:98:0x0588, B:100:0x058d, B:108:0x05b1, B:114:0x05c0, B:112:0x05bc, B:117:0x05df, B:122:0x05f5, B:124:0x05fc, B:126:0x0619, B:132:0x0630, B:134:0x0637, B:136:0x063b, B:138:0x063f, B:140:0x065c, B:146:0x0673, B:148:0x067a, B:150:0x0697, B:154:0x06ae, B:99:0x058b, B:156:0x06ca, B:158:0x06d4, B:161:0x06e6, B:167:0x06fb, B:163:0x06ed, B:165:0x06f4, B:169:0x0718, B:171:0x0728, B:173:0x0732, B:175:0x073b, B:177:0x0745, B:179:0x074e, B:181:0x076b, B:185:0x0781, B:187:0x079e, B:191:0x07b1, B:195:0x07be, B:204:0x07e0, B:208:0x07f9, B:207:0x07f6, B:210:0x0801, B:214:0x081b, B:213:0x0818, B:216:0x0823, B:220:0x083b, B:40:0x03ee, B:42:0x03f8), top: B:225:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x083a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<java.lang.Integer, java.lang.Double> b(com.meituan.android.common.locate.MtLocation r52) {
        /*
            Method dump skipped, instructions count: 2161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.controller.d.b(com.meituan.android.common.locate.MtLocation):android.util.Pair");
    }

    public Pair<Integer, Double> a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "057f0acbb87e7b64e3d4c92512337524", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "057f0acbb87e7b64e3d4c92512337524");
        }
        if (this.L == null || this.L.first != mtLocation) {
            Pair<Integer, Double> b = b(mtLocation);
            this.J.add(new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), b));
            while (SystemClock.elapsedRealtime() - ((Long) this.J.get(0).first).longValue() > this.F) {
                this.J.remove(0);
                if (this.J.size() <= 0) {
                    break;
                }
            }
            if (this.J.size() < this.I) {
                this.L = new Pair<>(mtLocation, b);
                this.K = null;
                return a(b);
            }
            List<Pair<Long, Pair<Integer, Double>>> list = this.J;
            if (list.size() > this.I) {
                list = list.subList(list.size() - this.I, list.size());
            }
            double d = 0.0d;
            int i = 0;
            double d2 = 0.0d;
            int i2 = 0;
            for (Pair<Long, Pair<Integer, Double>> pair : list) {
                if (((Integer) ((Pair) pair.second).first).intValue() == 1) {
                    i++;
                    d2 = ((Double) ((Pair) pair.second).second).doubleValue();
                } else {
                    i2++;
                    d = ((Double) ((Pair) pair.second).second).doubleValue();
                }
            }
            if (i > i2 && ((Integer) b.first).intValue() == 0) {
                b = new Pair<>(1, Double.valueOf(d2));
            }
            if (i < i2 && ((Integer) b.first).intValue() == 1) {
                b = new Pair<>(0, Double.valueOf(d));
            }
            this.L = new Pair<>(mtLocation, b);
            this.K = null;
            return a(b);
        }
        return a((Pair) this.L.second);
    }

    public void a(a aVar) {
        this.K = aVar;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "531fec7b950a56ac8e4095bd14d3ad34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "531fec7b950a56ac8e4095bd14d3ad34");
            return;
        }
        this.J.clear();
        this.L = null;
        this.K = null;
        M = null;
    }
}
