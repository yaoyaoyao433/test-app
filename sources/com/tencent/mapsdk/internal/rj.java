package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.jy;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class rj {
    public static ConcurrentHashMap<String, fu[]> a = new ConcurrentHashMap<>();
    public static final String f = "china";
    public static final String g = "inland";
    public static final String h = "taiwan";
    public static final String i = "outOfChina";
    private static volatile rj k = null;
    private static final String m = "124.240000,39.863000:127.060000,41.420000:128.320000,41.340000:128.338164,41.966811:129.070015,42.006633:129.392187,42.394602:129.544000,42.337000:129.757733,42.443019:129.915455,42.958121:130.581000,42.411000:130.664000,42.409000:130.660000,42.750000:131.056800,42.832500:131.362267,43.147780:131.359097,44.050378:131.184574,44.758711:131.911825,45.219501:133.163642,44.937724:135.144366,48.211013:135.128000,48.597000:131.071828,47.811040:130.773650,49.035551:128.751969,49.726565:125.969075,53.154351:123.347269,53.704738:120.827269,53.390754:119.713597,52.637780:120.321762,52.210396:118.926328,50.226355:117.662701,49.700280:116.622716,49.956516:115.284508,48.000368:116.104389,47.451176:118.485448,47.755809:119.550866,46.911548:117.463642,46.804509:113.640000,45.105329:111.969090,45.243847:111.267254,44.465714:111.589045,43.737317:109.905388,42.763982:107.448179,42.614694:105.337313,41.946215:100.992746,42.800196:96.838239,42.914056:95.070866,44.957807:91.816477,45.242319:91.161836,46.742245:90.130007,47.948495:88.699097,48.336174:87.883642,49.202090:86.809933,49.172099:85.459963,48.255788:85.328157,47.119427:82.919985,47.328453:82.134523,45.619623:82.396343,45.291415:81.735685,45.446091:79.797183,45.018009:80.618157,43.259401:80.112694,42.868284:80.120896,42.260590:77.976351,41.282314:76.788172,41.096389:76.197254,40.491205:75.361880,40.846808:73.365418,39.794560:73.634523,38.503352:74.669067,38.423003:74.896815,37.310540:74.429528,37.294106:74.454501,36.972073:75.734530,36.578999:75.962701,35.784605:77.852731,35.299899:78.205470,34.574291:78.973568,32.910437:78.263619,32.582183:78.649985,30.992536:81.199112,29.930890:81.625396,30.231654:85.988179,27.769037:88.674612,27.787987:88.840910,27.047339:89.241858,27.247275:89.644552,28.077447:90.426358,28.002589:91.425425,27.605415:92.127284,26.721880:93.834582,26.907073:95.855604,28.198876:97.000074,27.593593:97.491836,27.849236:97.700896,28.296779:98.301769,27.394792:98.605433,27.417494:98.502702,26.026786:97.440895,25.088802:97.485448,23.745403:98.497224,24.030523:98.809985,23.174956:99.324515,22.945024:99.099993,22.084196:100.205485,21.391178:101.003735,21.463004:101.278198,21.122876:101.931836,21.129823:101.785481,22.197373:102.650063,22.558783:103.074619,22.382137:103.979093,22.474798:104.809933,22.767793:105.399978,23.049961:106.469971,22.704082:106.610899,21.787060:107.897261,21.372454:107.490036,19.305984:109.748489,14.674666:110.039063,11.480025:107.666016,6.271618:111.752930,3.281824:112.939454,3.413421:115.018257,6.054474:118.674316,10.790140:119.164223,12.212996:119.707031,18.020528:121.959229,21.677848:122.699226,23.809795:127.303391,24.447079:127.390663,31.568056:124.335754,32.823666";
    private static final String n = "124.240000,39.863000:127.060000,41.420000:128.320000,41.340000:128.338164,41.966811:129.070015,42.006633:129.392187,42.394602:129.544000,42.337000:129.757733,42.443019:129.915455,42.958121:130.581000,42.411000:130.664000,42.409000:130.660000,42.750000:131.056800,42.832500:131.362267,43.147780:131.359097,44.050378:131.184574,44.758711:131.911825,45.219501:133.163642,44.937724:135.144366,48.211013:135.128000,48.597000:131.071828,47.811040:130.773650,49.035551:128.751969,49.726565:125.969075,53.154351:123.347269,53.704738:120.827269,53.390754:119.713597,52.637780:120.321762,52.210396:118.926328,50.226355:117.662701,49.700280:116.622716,49.956516:115.284508,48.000368:116.104389,47.451176:118.485448,47.755809:119.550866,46.911548:117.463642,46.804509:113.640000,45.105329:111.969090,45.243847:111.267254,44.465714:111.589045,43.737317:109.905388,42.763982:107.448179,42.614694:105.337313,41.946215:100.992746,42.800196:96.838239,42.914056:95.070866,44.957807:91.816477,45.242319:91.161836,46.742245:90.130007,47.948495:88.699097,48.336174:87.883642,49.202090:86.809933,49.172099:85.459963,48.255788:85.328157,47.119427:82.919985,47.328453:82.134523,45.619623:82.396343,45.291415:81.735685,45.446091:79.797183,45.018009:80.618157,43.259401:80.112694,42.868284:80.120896,42.260590:77.976351,41.282314:76.788172,41.096389:76.197254,40.491205:75.361880,40.846808:73.365418,39.794560:73.634523,38.503352:74.669067,38.423003:74.896815,37.310540:74.429528,37.294106:74.454501,36.972073:75.734530,36.578999:75.962701,35.784605:77.852731,35.299899:78.205470,34.574291:78.973568,32.910437:78.263619,32.582183:78.649985,30.992536:81.199112,29.930890:81.625396,30.231654:85.988179,27.769037:88.674612,27.787987:88.840910,27.047339:89.241858,27.247275:89.644552,28.077447:90.426358,28.002589:91.425425,27.605415:92.127284,26.721880:93.834582,26.907073:95.855604,28.198876:97.000074,27.593593:97.491836,27.849236:97.700896,28.296779:98.301769,27.394792:98.605433,27.417494:98.502702,26.026786:97.440895,25.088802:97.485448,23.745403:98.497224,24.030523:98.809985,23.174956:99.324515,22.945024:99.099993,22.084196:100.205485,21.391178:101.003735,21.463004:101.278198,21.122876:101.931836,21.129823:101.785481,22.197373:102.650063,22.558783:103.074619,22.382137:103.979093,22.474798:104.809933,22.767793:105.399978,23.049961:106.469971,22.704082:106.610899,21.787060:107.897261,21.372454:107.490036,19.305984:109.748489,14.674666:110.039063,11.480025:107.666016,6.271618:111.752930,3.281824:112.939454,3.413421:115.018257,6.054474:118.674316,10.790140:119.164223,12.212996:119.707031,18.020528:121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:120.465831,25.121382:121.207406,25.815692:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:127.303391,24.447079:127.390663,31.568056:124.335754,32.823666";
    private static final String o = "121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:120.465831,25.121382:121.207406,25.815692:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:121.959229,21.677848";
    public volatile boolean e;
    private ReentrantReadWriteLock l = new ReentrantReadWriteLock();
    public String b = null;
    public String c = null;
    public boolean d = false;
    public AtomicInteger j = new AtomicInteger(0);

    static /* synthetic */ boolean b(rj rjVar) {
        rjVar.d = true;
        return true;
    }

    private rj() {
    }

    public static rj a() {
        if (k == null) {
            synchronized (rj.class) {
                if (k == null) {
                    k = new rj();
                }
            }
        }
        return k;
    }

    private void a(Context context) {
        if (this.d || this.e) {
            return;
        }
        if (context != null) {
            this.b = context.getFilesDir() + "/frontiers.dat";
            this.c = this.b + ".bak";
        }
        jy.a((jy.g) new AnonymousClass1()).a((jy.b.a) Boolean.FALSE);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.rj$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 extends jy.g<Boolean> {
        public AnonymousClass1() {
        }

        private Boolean a() throws Exception {
            rj.this.e = true;
            if (rj.this.j.getAndIncrement() <= 0) {
                String b = rj.this.b();
                if (TextUtils.isEmpty(b)) {
                    rj.a.put(rj.f, rj.e(rj.m));
                    rj.a.put(rj.g, rj.e(rj.n));
                    rj.a.put(rj.h, rj.e(rj.o));
                } else {
                    rj.b(b);
                }
            }
            rj.this.e = false;
            rj.b(rj.this);
            return Boolean.TRUE;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() throws Exception {
            rj.this.e = true;
            if (rj.this.j.getAndIncrement() <= 0) {
                String b = rj.this.b();
                if (TextUtils.isEmpty(b)) {
                    rj.a.put(rj.f, rj.e(rj.m));
                    rj.a.put(rj.g, rj.e(rj.n));
                    rj.a.put(rj.h, rj.e(rj.o));
                } else {
                    rj.b(b);
                }
            }
            rj.this.e = false;
            rj.b(rj.this);
            return Boolean.TRUE;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final boolean a(java.lang.String r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.l
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.b
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r5.c
            r1.<init>(r2)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 == 0) goto L28
            boolean r2 = r1.delete()
            if (r2 != 0) goto L28
            r1.deleteOnExit()
            return r3
        L28:
            r2 = 0
            boolean r4 = r0.exists()     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L45
            boolean r4 = r0.renameTo(r1)     // Catch: java.lang.Throwable -> L7d
            if (r4 != 0) goto L45
            com.tencent.mapsdk.internal.kd.a(r2)
            r1.renameTo(r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r5.l
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r6.unlock()
            return r3
        L45:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "UTF-8"
            byte[] r6 = r6.getBytes(r2)     // Catch: java.lang.Throwable -> L6a
            r4.write(r6)     // Catch: java.lang.Throwable -> L6a
            r4.flush()     // Catch: java.lang.Throwable -> L6a
            com.tencent.mapsdk.internal.kd.a(r4)
            r1.delete()
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r5.l
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r6.unlock()
            r6 = 1
            return r6
        L67:
            r6 = move-exception
            r2 = r4
            goto L6d
        L6a:
            r2 = r4
            goto L7d
        L6c:
            r6 = move-exception
        L6d:
            com.tencent.mapsdk.internal.kd.a(r2)
            r1.renameTo(r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.l
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            throw r6
        L7d:
            com.tencent.mapsdk.internal.kd.a(r2)
            r1.renameTo(r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r5.l
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r6.unlock()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.rj.a(java.lang.String):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.lang.String b() {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.l
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r5.b     // Catch: java.lang.Throwable -> L40
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L40
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L41
            byte[] r3 = com.tencent.mapsdk.internal.kd.b(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "UTF-8"
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L41
            com.tencent.mapsdk.internal.kd.a(r2)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.l
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            return r1
        L2e:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L33
        L32:
            r1 = move-exception
        L33:
            com.tencent.mapsdk.internal.kd.a(r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.l
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            throw r1
        L40:
            r2 = r0
        L41:
            com.tencent.mapsdk.internal.kd.a(r2)
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.l
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.rj.b():java.lang.String");
    }

    public static int b(String str) {
        fu[] e;
        fu[] e2;
        fu[] e3;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("version".equals(next)) {
                    i2 = jSONObject.optInt(next);
                } else {
                    fu[] e4 = e(jSONObject.optString(next));
                    if (e4 != null) {
                        a.put(next, e4);
                    }
                }
            }
            if (!a.containsKey(f) && (e3 = e(m)) != null) {
                a.put(f, e3);
            }
            if (!a.containsKey(g) && (e2 = e(n)) != null) {
                a.put(g, e2);
            }
            if (!a.containsKey(h) && (e = e(o)) != null) {
                a.put(h, e);
            }
        } catch (Throwable unused) {
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static fu[] e(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] split = str.split(CommonConstant.Symbol.COLON);
        if (split.length == 0) {
            return null;
        }
        fu[] fuVarArr = new fu[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split(CommonConstant.Symbol.COMMA);
            fuVarArr[i2] = y.b(new GeoPoint((int) (Double.parseDouble(split2[1]) * 1000000.0d), (int) (Double.parseDouble(split2[0]) * 1000000.0d)));
        }
        return fuVarArr;
    }

    public static fu[] c(String str) {
        return a.get(str);
    }

    public static boolean a(fu fuVar, fu[] fuVarArr) {
        if (fuVarArr == null || fuVarArr.length < 3) {
            return false;
        }
        int length = fuVarArr.length - 1;
        boolean z = false;
        for (int i2 = 0; i2 < fuVarArr.length; i2++) {
            if (((fuVarArr[i2].b < fuVar.b && fuVarArr[length].b >= fuVar.b) || (fuVarArr[length].b < fuVar.b && fuVarArr[i2].b >= fuVar.b)) && (fuVarArr[i2].c <= fuVar.c || fuVarArr[length].c <= fuVar.c)) {
                z ^= fuVarArr[i2].c + (((fuVar.b - fuVarArr[i2].b) / (fuVarArr[length].b - fuVarArr[i2].b)) * (fuVarArr[length].c - fuVarArr[i2].c)) < fuVar.c;
            }
            length = i2;
        }
        return z;
    }

    public static boolean a(fu[] fuVarArr, fu[] fuVarArr2) {
        boolean z;
        int length = fuVarArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            z2 |= a(fuVarArr[i2], fuVarArr2);
            if (z2) {
                z = true;
                break;
            }
            i2++;
        }
        boolean z3 = false;
        boolean z4 = false;
        for (fu fuVar : fuVarArr2) {
            z3 |= a(fuVar, fuVarArr);
            if (z3) {
                z4 = true;
            }
        }
        return z || z4;
    }

    private void d() {
        if (this.j.decrementAndGet() == 0) {
            a.clear();
            this.d = false;
        }
    }
}
