package com.meituan.android.common.locate.fusionlocation;

import android.util.Pair;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.reporter.h;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {
    private static volatile b A;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static long z;
    public int a;
    public int b;
    public int c;
    public MtLocation d;
    public MtLocation e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;
    private a k;
    private List<a> l;
    private List<Pair<Long, MtLocation>> m;
    private List<Pair<Long, MtLocation>> n;
    private com.meituan.android.common.locate.fusionlocation.bean.a o;
    private boolean p;
    private boolean q;
    private long r;
    private MtLocation s;
    private boolean t;
    private long u;
    private long v;
    private int w;
    private int x;
    private int y;

    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long a = System.currentTimeMillis();
        public long b;
        public long c;
        public float d;

        public a(long j, float f) {
            this.c = j;
            this.d = f;
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cbe7abcfa33cf4fdf2d47317a1c64ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cbe7abcfa33cf4fdf2d47317a1c64ab");
            return;
        }
        this.l = new ArrayList();
        this.m = new LinkedList();
        this.n = new LinkedList();
        this.o = new com.meituan.android.common.locate.fusionlocation.bean.a();
        this.p = h.a(g.a()).v();
        this.q = h.a(g.a()).a();
        this.a = 0;
        this.b = 0;
        this.c = -1;
        this.f = System.currentTimeMillis();
        this.g = System.currentTimeMillis();
        this.h = System.currentTimeMillis();
        this.i = System.currentTimeMillis();
        this.r = System.currentTimeMillis();
        this.j = 0;
        this.t = false;
        this.u = h.a(g.a()).y();
        this.v = h.a(g.a()).z();
        this.w = h.a(g.a()).A();
        this.x = h.a(g.a()).B();
        this.y = h.a(g.a()).C();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a73f8f2b5bc076b8fabf152cfe1db234", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a73f8f2b5bc076b8fabf152cfe1db234");
        }
        if (A == null) {
            synchronized (b.class) {
                if (A == null) {
                    A = new b();
                }
            }
        }
        return A;
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0475d6ba3fd4970f4c3094bfe4939329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0475d6ba3fd4970f4c3094bfe4939329");
            return;
        }
        String a2 = com.meituan.android.common.locate.fusionlocation.utils.a.a(jSONObject);
        com.meituan.android.common.locate.provider.a.a(g.a());
        if ("com.meituan.mars.compareapp".equals(com.meituan.android.common.locate.provider.a.a)) {
            LogUtils.a("FusionLocationManager\ttoast\t" + a2);
            q.a(a2);
        }
        if (h.a(g.a()).j()) {
            com.meituan.android.common.locate.platform.logs.c.a(jSONObject.toString());
        }
        if (h.a(g.a()).k()) {
            c.a().a(jSONObject.toString());
        }
    }

    private MtLocation c(MtLocation mtLocation) {
        MtLocation mtLocation2 = this.o.a;
        if (mtLocation2 == null || mtLocation2 != mtLocation || this.o.b == null) {
            return null;
        }
        return this.o.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x040e A[Catch: Exception -> 0x0530, TryCatch #0 {Exception -> 0x0530, blocks: (B:12:0x0033, B:16:0x0052, B:18:0x007f, B:19:0x00a9, B:21:0x0106, B:23:0x0114, B:25:0x013b, B:26:0x0163, B:28:0x016f, B:30:0x017c, B:31:0x0189, B:32:0x0191, B:34:0x01a3, B:36:0x01b1, B:38:0x01b5, B:41:0x01bb, B:43:0x01c5, B:44:0x01d6, B:45:0x01da, B:47:0x01e4, B:51:0x0212, B:55:0x0245, B:57:0x0251, B:58:0x0259, B:60:0x0270, B:61:0x0298, B:63:0x02a4, B:65:0x02b1, B:82:0x033e, B:84:0x0342, B:86:0x0346, B:88:0x034a, B:90:0x0357, B:97:0x037b, B:100:0x0388, B:102:0x0394, B:104:0x039f, B:105:0x03a7, B:93:0x0364, B:95:0x0370, B:106:0x03b7, B:108:0x03bb, B:110:0x03c3, B:112:0x03cf, B:114:0x03d3, B:116:0x03e1, B:118:0x03ef, B:121:0x040e, B:119:0x0404, B:124:0x0421, B:126:0x0434, B:127:0x045e, B:129:0x04bb, B:131:0x04c9, B:133:0x04d2, B:134:0x04e3, B:135:0x04e9, B:137:0x0517, B:67:0x02c1, B:69:0x02c9, B:71:0x02cd, B:73:0x02db, B:74:0x02f2, B:76:0x02f8, B:78:0x030b, B:79:0x0319, B:81:0x0333, B:80:0x0320, B:48:0x01f6, B:50:0x0200), top: B:144:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0421 A[Catch: Exception -> 0x0530, TryCatch #0 {Exception -> 0x0530, blocks: (B:12:0x0033, B:16:0x0052, B:18:0x007f, B:19:0x00a9, B:21:0x0106, B:23:0x0114, B:25:0x013b, B:26:0x0163, B:28:0x016f, B:30:0x017c, B:31:0x0189, B:32:0x0191, B:34:0x01a3, B:36:0x01b1, B:38:0x01b5, B:41:0x01bb, B:43:0x01c5, B:44:0x01d6, B:45:0x01da, B:47:0x01e4, B:51:0x0212, B:55:0x0245, B:57:0x0251, B:58:0x0259, B:60:0x0270, B:61:0x0298, B:63:0x02a4, B:65:0x02b1, B:82:0x033e, B:84:0x0342, B:86:0x0346, B:88:0x034a, B:90:0x0357, B:97:0x037b, B:100:0x0388, B:102:0x0394, B:104:0x039f, B:105:0x03a7, B:93:0x0364, B:95:0x0370, B:106:0x03b7, B:108:0x03bb, B:110:0x03c3, B:112:0x03cf, B:114:0x03d3, B:116:0x03e1, B:118:0x03ef, B:121:0x040e, B:119:0x0404, B:124:0x0421, B:126:0x0434, B:127:0x045e, B:129:0x04bb, B:131:0x04c9, B:133:0x04d2, B:134:0x04e3, B:135:0x04e9, B:137:0x0517, B:67:0x02c1, B:69:0x02c9, B:71:0x02cd, B:73:0x02db, B:74:0x02f2, B:76:0x02f8, B:78:0x030b, B:79:0x0319, B:81:0x0333, B:80:0x0320, B:48:0x01f6, B:50:0x0200), top: B:144:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0517 A[Catch: Exception -> 0x0530, TRY_LEAVE, TryCatch #0 {Exception -> 0x0530, blocks: (B:12:0x0033, B:16:0x0052, B:18:0x007f, B:19:0x00a9, B:21:0x0106, B:23:0x0114, B:25:0x013b, B:26:0x0163, B:28:0x016f, B:30:0x017c, B:31:0x0189, B:32:0x0191, B:34:0x01a3, B:36:0x01b1, B:38:0x01b5, B:41:0x01bb, B:43:0x01c5, B:44:0x01d6, B:45:0x01da, B:47:0x01e4, B:51:0x0212, B:55:0x0245, B:57:0x0251, B:58:0x0259, B:60:0x0270, B:61:0x0298, B:63:0x02a4, B:65:0x02b1, B:82:0x033e, B:84:0x0342, B:86:0x0346, B:88:0x034a, B:90:0x0357, B:97:0x037b, B:100:0x0388, B:102:0x0394, B:104:0x039f, B:105:0x03a7, B:93:0x0364, B:95:0x0370, B:106:0x03b7, B:108:0x03bb, B:110:0x03c3, B:112:0x03cf, B:114:0x03d3, B:116:0x03e1, B:118:0x03ef, B:121:0x040e, B:119:0x0404, B:124:0x0421, B:126:0x0434, B:127:0x045e, B:129:0x04bb, B:131:0x04c9, B:133:0x04d2, B:134:0x04e3, B:135:0x04e9, B:137:0x0517, B:67:0x02c1, B:69:0x02c9, B:71:0x02cd, B:73:0x02db, B:74:0x02f2, B:76:0x02f8, B:78:0x030b, B:79:0x0319, B:81:0x0333, B:80:0x0320, B:48:0x01f6, B:50:0x0200), top: B:144:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x052f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0251 A[Catch: Exception -> 0x0530, TryCatch #0 {Exception -> 0x0530, blocks: (B:12:0x0033, B:16:0x0052, B:18:0x007f, B:19:0x00a9, B:21:0x0106, B:23:0x0114, B:25:0x013b, B:26:0x0163, B:28:0x016f, B:30:0x017c, B:31:0x0189, B:32:0x0191, B:34:0x01a3, B:36:0x01b1, B:38:0x01b5, B:41:0x01bb, B:43:0x01c5, B:44:0x01d6, B:45:0x01da, B:47:0x01e4, B:51:0x0212, B:55:0x0245, B:57:0x0251, B:58:0x0259, B:60:0x0270, B:61:0x0298, B:63:0x02a4, B:65:0x02b1, B:82:0x033e, B:84:0x0342, B:86:0x0346, B:88:0x034a, B:90:0x0357, B:97:0x037b, B:100:0x0388, B:102:0x0394, B:104:0x039f, B:105:0x03a7, B:93:0x0364, B:95:0x0370, B:106:0x03b7, B:108:0x03bb, B:110:0x03c3, B:112:0x03cf, B:114:0x03d3, B:116:0x03e1, B:118:0x03ef, B:121:0x040e, B:119:0x0404, B:124:0x0421, B:126:0x0434, B:127:0x045e, B:129:0x04bb, B:131:0x04c9, B:133:0x04d2, B:134:0x04e3, B:135:0x04e9, B:137:0x0517, B:67:0x02c1, B:69:0x02c9, B:71:0x02cd, B:73:0x02db, B:74:0x02f2, B:76:0x02f8, B:78:0x030b, B:79:0x0319, B:81:0x0333, B:80:0x0320, B:48:0x01f6, B:50:0x0200), top: B:144:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0270 A[Catch: Exception -> 0x0530, TryCatch #0 {Exception -> 0x0530, blocks: (B:12:0x0033, B:16:0x0052, B:18:0x007f, B:19:0x00a9, B:21:0x0106, B:23:0x0114, B:25:0x013b, B:26:0x0163, B:28:0x016f, B:30:0x017c, B:31:0x0189, B:32:0x0191, B:34:0x01a3, B:36:0x01b1, B:38:0x01b5, B:41:0x01bb, B:43:0x01c5, B:44:0x01d6, B:45:0x01da, B:47:0x01e4, B:51:0x0212, B:55:0x0245, B:57:0x0251, B:58:0x0259, B:60:0x0270, B:61:0x0298, B:63:0x02a4, B:65:0x02b1, B:82:0x033e, B:84:0x0342, B:86:0x0346, B:88:0x034a, B:90:0x0357, B:97:0x037b, B:100:0x0388, B:102:0x0394, B:104:0x039f, B:105:0x03a7, B:93:0x0364, B:95:0x0370, B:106:0x03b7, B:108:0x03bb, B:110:0x03c3, B:112:0x03cf, B:114:0x03d3, B:116:0x03e1, B:118:0x03ef, B:121:0x040e, B:119:0x0404, B:124:0x0421, B:126:0x0434, B:127:0x045e, B:129:0x04bb, B:131:0x04c9, B:133:0x04d2, B:134:0x04e3, B:135:0x04e9, B:137:0x0517, B:67:0x02c1, B:69:0x02c9, B:71:0x02cd, B:73:0x02db, B:74:0x02f2, B:76:0x02f8, B:78:0x030b, B:79:0x0319, B:81:0x0333, B:80:0x0320, B:48:0x01f6, B:50:0x0200), top: B:144:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c1 A[Catch: Exception -> 0x0530, TryCatch #0 {Exception -> 0x0530, blocks: (B:12:0x0033, B:16:0x0052, B:18:0x007f, B:19:0x00a9, B:21:0x0106, B:23:0x0114, B:25:0x013b, B:26:0x0163, B:28:0x016f, B:30:0x017c, B:31:0x0189, B:32:0x0191, B:34:0x01a3, B:36:0x01b1, B:38:0x01b5, B:41:0x01bb, B:43:0x01c5, B:44:0x01d6, B:45:0x01da, B:47:0x01e4, B:51:0x0212, B:55:0x0245, B:57:0x0251, B:58:0x0259, B:60:0x0270, B:61:0x0298, B:63:0x02a4, B:65:0x02b1, B:82:0x033e, B:84:0x0342, B:86:0x0346, B:88:0x034a, B:90:0x0357, B:97:0x037b, B:100:0x0388, B:102:0x0394, B:104:0x039f, B:105:0x03a7, B:93:0x0364, B:95:0x0370, B:106:0x03b7, B:108:0x03bb, B:110:0x03c3, B:112:0x03cf, B:114:0x03d3, B:116:0x03e1, B:118:0x03ef, B:121:0x040e, B:119:0x0404, B:124:0x0421, B:126:0x0434, B:127:0x045e, B:129:0x04bb, B:131:0x04c9, B:133:0x04d2, B:134:0x04e3, B:135:0x04e9, B:137:0x0517, B:67:0x02c1, B:69:0x02c9, B:71:0x02cd, B:73:0x02db, B:74:0x02f2, B:76:0x02f8, B:78:0x030b, B:79:0x0319, B:81:0x0333, B:80:0x0320, B:48:0x01f6, B:50:0x0200), top: B:144:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meituan.android.common.locate.MtLocation d(com.meituan.android.common.locate.MtLocation r17) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.fusionlocation.b.d(com.meituan.android.common.locate.MtLocation):com.meituan.android.common.locate.MtLocation");
    }

    public MtLocation a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d409af70a86025db47cd8fe7bc9b0dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d409af70a86025db47cd8fe7bc9b0dc");
        }
        if (!LocationUtils.isValidLatLon(mtLocation)) {
            this.o.a();
            return null;
        }
        MtLocation c = c(mtLocation);
        if (c != null) {
            return c;
        }
        this.o.a(mtLocation);
        MtLocation d = d(mtLocation);
        if (d != null) {
            this.o.b = d;
        }
        return d;
    }

    public void a(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3857849c4dfd969f24c7ffb4f4c56ace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3857849c4dfd969f24c7ffb4f4c56ace");
            return;
        }
        if (this.k != null) {
            this.k.b = System.currentTimeMillis();
        }
        this.k = new a(j, f);
        this.l.add(this.k);
    }

    public long b(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63c99636c6edd95a4916a148e1130c8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63c99636c6edd95a4916a148e1130c8a")).longValue();
        }
        if (mtLocation == null || mtLocation.getExtras() == null) {
            return 0L;
        }
        return mtLocation.getExtras().getLong("fusion_delay_time", 0L);
    }
}
