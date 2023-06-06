package com.meituan.android.cipstorage;

import android.text.TextUtils;
import android.util.Pair;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.cipstorage.aa;
import com.meituan.android.cipstorage.ab;
import com.meituan.android.cipstorage.af;
import com.meituan.android.cipstorage.e;
import com.meituan.android.cipstorage.j;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends j.c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cipstorage.j.c
    public final String a() {
        return "businessLimit";
    }

    public static /* synthetic */ long a(d dVar, String str, af afVar, af.a aVar, CIPSBusinessCleaner cIPSBusinessCleaner) {
        Object[] objArr = {str, afVar, aVar, cIPSBusinessCleaner};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "f320766d2bcb04ae6c8e8818208fac22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "f320766d2bcb04ae6c8e8818208fac22")).longValue();
        }
        Map<String, Set<String>> map = aVar.i;
        if (map == null) {
            return 0L;
        }
        if (cIPSBusinessCleaner != null) {
            cIPSBusinessCleaner.onCleanExpiredCacheStart(str, aVar, 604800L);
        }
        long j = 0;
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            j += new e.a(key, 604800L, a(key, entry.getValue()), dVar).a(false);
            dVar.b();
        }
        if (cIPSBusinessCleaner != null) {
            cIPSBusinessCleaner.onCleanExpiredCacheOver(str, aVar, j);
        }
        return dVar.a(map);
    }

    public static /* synthetic */ Map a(d dVar, String[] strArr) {
        String str;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "1345a134a790353e42a66db8265bc4fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "1345a134a790353e42a66db8265bc4fa");
        }
        if (strArr == null || strArr.length == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(strArr.length);
        for (String str2 : strArr) {
            if (str2 != null) {
                String[] split = str2.split("::");
                if (split.length > 0) {
                    String str3 = split[0];
                    HashSet hashSet = new HashSet();
                    if (split.length >= 2) {
                        for (int i = 1; i < split.length; i++) {
                            dVar.b(split[i], hashSet);
                        }
                    }
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    String str4 = null;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9e7dcc5529216a886177d116fcc7d4ee", RobustBitConfig.DEFAULT_VALUE)) {
                        str4 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9e7dcc5529216a886177d116fcc7d4ee");
                    } else {
                        int i2 = 9;
                        if (str3.startsWith("/internal")) {
                            str = v.c.getFilesDir().getParent();
                        } else if (str3.startsWith("/external")) {
                            File externalCacheDir = v.c.getExternalCacheDir();
                            if (externalCacheDir != null) {
                                str = externalCacheDir.getParent();
                            }
                        } else {
                            str = null;
                            i2 = 0;
                        }
                        if (str != null) {
                            str4 = str + str3.substring(i2);
                        }
                    }
                    if (str4 != null) {
                        hashMap.put(str4, hashSet);
                    }
                }
            }
        }
        return hashMap;
    }

    public static /* synthetic */ void a(ac acVar, String str, long j, List list) {
        String str2;
        Object[] objArr = {acVar, str, new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c31caf29fbff436020de6ec4fa3f591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c31caf29fbff436020de6ec4fa3f591");
        } else if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (TextUtils.isEmpty(aVar.c)) {
                    str2 = str;
                } else {
                    str2 = str + File.separator + aVar.c;
                }
                a(acVar, str2, aVar.b, j, aVar.d, aVar.e, aVar.a, aVar.f);
            }
        }
    }

    public static /* synthetic */ long b(d dVar, Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "51ef089df9b8c1cdf28ad90aa695c661", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "51ef089df9b8c1cdf28ad90aa695c661")).longValue();
        }
        long j = 0;
        if (map == null) {
            return 0L;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            j += ab.a(new File(str), a(str, (Set) entry.getValue()));
        }
        dVar.b();
        return j;
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final boolean a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31023dbaf2f31dd8c1ae1de150fef01d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31023dbaf2f31dd8c1ae1de150fef01d")).booleanValue() : afVar.h();
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final void b(final af afVar) {
        char c = 1;
        int i = 0;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18b616e1495a34c7d831a53b7f366d18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18b616e1495a34c7d831a53b7f366d18");
            return;
        }
        Map<String, af.a> i2 = afVar.i();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        int size = i2 != null ? i2.size() : 0;
        if (size > 0) {
            final CountDownLatch countDownLatch = new CountDownLatch(size);
            for (Map.Entry<String, af.a> entry : i2.entrySet()) {
                final String key = entry.getKey();
                final af.a value = entry.getValue();
                if (value != null) {
                    List a2 = com.sankuai.meituan.serviceloader.b.a(CIPSBusinessCleaner.class, key);
                    CIPSBusinessCleaner cIPSBusinessCleaner = (a2 == null || a2.size() <= 0) ? null : (CIPSBusinessCleaner) a2.get(i);
                    concurrentHashMap.put(key, Boolean.FALSE);
                    Object[] objArr2 = new Object[6];
                    objArr2[i] = key;
                    objArr2[c] = value;
                    objArr2[2] = cIPSBusinessCleaner;
                    objArr2[3] = countDownLatch;
                    objArr2[4] = afVar;
                    objArr2[5] = concurrentHashMap;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca3649c5df6b4a6ee0b40f610735d922", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca3649c5df6b4a6ee0b40f610735d922");
                    } else {
                        final CIPSBusinessCleaner cIPSBusinessCleaner2 = cIPSBusinessCleaner;
                        v.e.c(new Runnable() { // from class: com.meituan.android.cipstorage.d.2
                            public static ChangeQuickRedirect a;

                            /* JADX WARN: Can't wrap try/catch for region: R(18:6|(2:7|8)|(1:10)(16:83|(1:85)(2:86|(1:88)(3:(1:90)(1:98)|91|(3:93|(1:95)(1:97)|96)))|12|(4:14|(1:16)|17|(6:19|(1:21)(1:81)|22|(5:24|(1:26)|27|(1:29)|30)|31|(16:35|(1:37)|38|(1:40)|41|42|(1:44)(1:80)|45|46|47|48|50|(2:52|53)(1:58)|54|55|56)))|82|42|(0)(0)|45|46|47|48|50|(0)(0)|54|55|56)|11|12|(0)|82|42|(0)(0)|45|46|47|48|50|(0)(0)|54|55|56) */
                            /* JADX WARN: Code restructure failed: missing block: B:69:0x026e, code lost:
                                r0 = th;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x02cf, code lost:
                                r0 = th;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:76:0x02d2, code lost:
                                r0 = move-exception;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:81:0x02da, code lost:
                                if ((r0 instanceof com.meituan.android.cipstorage.c) == false) goto L69;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:84:0x02e4, code lost:
                                java.lang.System.out.println("business limit handle canceled: " + r3);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:85:0x02fa, code lost:
                                r0.printStackTrace();
                                r1 = new java.util.HashMap();
                                r1.put("channel", r3);
                                r1.put("record", r0.getMessage());
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:86:0x0317, code lost:
                                if (r4 != null) goto L71;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:88:0x031a, code lost:
                                r16 = false;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:89:0x031c, code lost:
                                r1.put("adjusted", java.lang.Boolean.valueOf(r16));
                                com.meituan.android.cipstorage.v.a("err_info", "businessCleanExec", 0, r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:91:0x032d, code lost:
                                r6.put(r3, java.lang.Boolean.TRUE);
                                r7.countDown();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:92:0x033b, code lost:
                                throw r0;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x0130 A[Catch: Throwable -> 0x02d4, TryCatch #3 {Throwable -> 0x02d4, blocks: (B:7:0x001f, B:9:0x007d, B:27:0x0100, B:29:0x0130, B:31:0x0134, B:34:0x0164, B:38:0x0199, B:40:0x01ae, B:42:0x01b2, B:43:0x01bb, B:45:0x01ca, B:47:0x01d5, B:51:0x01e1, B:53:0x01e5, B:54:0x01ee, B:56:0x01fb, B:59:0x020a, B:63:0x0213, B:11:0x008c, B:14:0x0093, B:18:0x00a2, B:22:0x00c4, B:26:0x00f0), top: B:101:0x001f }] */
                            /* JADX WARN: Removed duplicated region for block: B:61:0x0210  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x0212  */
                            /* JADX WARN: Removed duplicated region for block: B:67:0x0263  */
                            /* JADX WARN: Removed duplicated region for block: B:71:0x0270 A[Catch: Throwable -> 0x026e, TRY_LEAVE, TryCatch #2 {Throwable -> 0x026e, blocks: (B:68:0x026a, B:71:0x0270), top: B:99:0x0261 }] */
                            /* JADX WARN: Type inference failed for: r13v0 */
                            /* JADX WARN: Type inference failed for: r13v1, types: [boolean, byte] */
                            /* JADX WARN: Type inference failed for: r13v2 */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    Method dump skipped, instructions count: 828
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cipstorage.d.AnonymousClass2.run():void");
                            }
                        });
                    }
                } else {
                    countDownLatch.countDown();
                }
                c = 1;
                i = 0;
            }
            try {
                if (countDownLatch.await(10L, TimeUnit.MINUTES)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("record", "timeout");
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                    if (!((Boolean) entry2.getValue()).booleanValue()) {
                        sb.append((String) entry2.getKey());
                        sb.append(',');
                    }
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                hashMap.put("record", sb.toString());
                v.a("err_info", "businessCleanExec", 1L, hashMap);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public int a;
        public long b;
        public String c;
        public String d;
        public int e;
        public long f = -1;

        public a(int i, long j, String str, String str2, int i2) {
            this.a = i;
            this.b = j;
            this.c = str;
            this.d = str2;
            this.e = i2;
        }
    }

    public static long a(boolean z, Map<String, Integer> map, final ac acVar) {
        File parentFile;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), map, acVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd6f8faf692f0941bc347c69863482e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd6f8faf692f0941bc347c69863482e7")).longValue();
        }
        final String str = z ? "/internal" : "/external";
        final aa aaVar = new aa(str);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            aaVar.a(entry.getKey(), entry.getValue().intValue());
        }
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f560531f22b43b5507118deeb914a9b3", RobustBitConfig.DEFAULT_VALUE)) {
            parentFile = (File) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f560531f22b43b5507118deeb914a9b3");
        } else if (z) {
            parentFile = v.c.getFilesDir().getParentFile();
        } else {
            File externalCacheDir = v.c.getExternalCacheDir();
            parentFile = externalCacheDir == null ? null : externalCacheDir.getParentFile();
        }
        if (parentFile == null) {
            return 0L;
        }
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final aa.c cVar = new aa.c() { // from class: com.meituan.android.cipstorage.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.aa.c
            public final void a(File file, String str2, long j, String str3, int i) {
                Object[] objArr3 = {file, str2, new Long(j), str3, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f4c35b49aa3124f28f291f0611736dc7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f4c35b49aa3124f28f291f0611736dc7");
                } else if (TextUtils.isEmpty(str2)) {
                } else {
                    String b = ab.b(str2);
                    List list = (List) hashMap2.get(b);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap2.put(b, list);
                    }
                    a aVar = new a(file.isDirectory() ? 1 : 0, j, str2, str3, i);
                    if (aVar.a == 0) {
                        aVar.f = MMKV.a(file).b();
                    }
                    list.add(aVar);
                }
            }

            @Override // com.meituan.android.cipstorage.aa.c
            public final void a(String str2, long j, String str3, int i) {
                Object[] objArr3 = {str2, new Long(j), str3, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e54650890bfe073696ab1c6325196e3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e54650890bfe073696ab1c6325196e3a");
                    return;
                }
                String b = ab.b(str2);
                a aVar = (a) hashMap.get(b);
                if (aVar == null) {
                    aVar = new a(2, 0L, null, str3, i);
                    hashMap.put(b, aVar);
                }
                aVar.b += j;
            }

            @Override // com.meituan.android.cipstorage.aa.c
            public final void a(String str2, long j) {
                String str3;
                long j2;
                Object[] objArr3 = {str2, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "237133791f1ff6257add88d4f543130f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "237133791f1ff6257add88d4f543130f");
                    return;
                }
                a aVar = (a) hashMap.remove(str2);
                ac acVar2 = acVar;
                String str4 = str;
                Object[] objArr4 = {acVar2, str4, str2, new Long(j), aVar};
                ChangeQuickRedirect changeQuickRedirect4 = d.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c2eb0bc2c8db710ad89a758e6d64bdea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c2eb0bc2c8db710ad89a758e6d64bdea");
                } else if (aVar != null) {
                    if (TextUtils.isEmpty(str2)) {
                        str3 = str4 + File.separator + "cipsvirtual";
                    } else {
                        str3 = str4 + File.separator + str2 + File.separator + "cipsvirtual";
                    }
                    j2 = j;
                    d.a(acVar2, str3, aVar.b, j, aVar.d, aVar.e, aVar.a);
                    d.a(acVar, str, j2, (List) hashMap2.remove(str2));
                }
                j2 = j;
                d.a(acVar, str, j2, (List) hashMap2.remove(str2));
            }
        };
        Object[] objArr3 = {parentFile, aaVar, cVar};
        ChangeQuickRedirect changeQuickRedirect3 = aa.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "245dd116afeb4f5665477de53ec44163", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "245dd116afeb4f5665477de53ec44163")).longValue();
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = aa.a;
        if (PatchProxy.isSupport(objArr4, aaVar, changeQuickRedirect4, false, "b1ba2278c2e35d12ad6e70583f61143d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aaVar, changeQuickRedirect4, false, "b1ba2278c2e35d12ad6e70583f61143d");
        } else {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = aa.a;
            if (PatchProxy.isSupport(objArr5, aaVar, changeQuickRedirect5, false, "63bd2d09e1ddbc80cc7c062380fb12dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, aaVar, changeQuickRedirect5, false, "63bd2d09e1ddbc80cc7c062380fb12dc");
            } else {
                aa.a(aaVar.a());
            }
            aaVar.b = null;
            aaVar.c = null;
            aaVar.d = 0;
            aaVar.e = new Stack<>();
            aaVar.f = new Stack<>();
            aaVar.g = 0;
        }
        final long[] jArr = {0};
        ab.a(parentFile, new ab.a() { // from class: com.meituan.android.cipstorage.aa.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.ab.a
            public final void a(File file) {
                Object[] objArr6 = {file};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7203f3b2322636c201adf5c4941d6efc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7203f3b2322636c201adf5c4941d6efc");
                    return;
                }
                aa aaVar2 = aaVar;
                String name = file.getName();
                Object[] objArr7 = {name};
                ChangeQuickRedirect changeQuickRedirect7 = aa.a;
                if (PatchProxy.isSupport(objArr7, aaVar2, changeQuickRedirect7, false, "58440ef513e592918d93f6fb9ec7c8e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, aaVar2, changeQuickRedirect7, false, "58440ef513e592918d93f6fb9ec7c8e6");
                    return;
                }
                aaVar2.d++;
                if (aaVar2.g > 0) {
                    aaVar2.g++;
                    return;
                }
                b a2 = aaVar2.b == null ? aaVar2.a() : aaVar2.b.a(name);
                if (a2 == null) {
                    aaVar2.g++;
                } else {
                    aaVar2.b = a2;
                }
                if (aaVar2.g > 0 || !aaVar2.b.a()) {
                    return;
                }
                aaVar2.e.push(aaVar2.c);
                aaVar2.c = (a) aaVar2.b;
                aaVar2.f.push(Integer.valueOf(aaVar2.d - 1));
                aaVar2.d = 0;
            }

            @Override // com.meituan.android.cipstorage.ab.a
            public final void a(File file, long j, int i, String str2) {
                Object[] objArr6 = {file, new Long(j), Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "21a0ca2098a9a4509677cc18b8d3220f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "21a0ca2098a9a4509677cc18b8d3220f");
                    return;
                }
                a aVar = aaVar.c;
                if (aVar != null && aaVar.d <= aVar.d) {
                    int i2 = aaVar.d;
                    Object[] objArr7 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect7 = a.a;
                    if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "3dcc7e6a53101076d94053833120fcc4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "3dcc7e6a53101076d94053833120fcc4")).booleanValue() : aVar.c.contains(Integer.valueOf(i2))) {
                        Pair<String, Integer> b = aVar.b(aaVar.d);
                        cVar.a(file, str2, j, (String) b.first, ((Integer) b.second).intValue());
                    } else if (!file.isDirectory() && aaVar.d != aVar.d) {
                        Pair<String, Integer> b2 = aVar.b(aVar.d);
                        cVar.a(str2, j, (String) b2.first, ((Integer) b2.second).intValue());
                    }
                    if (file.isDirectory() && aaVar.d != aVar.d) {
                        cVar.a(str2, j);
                    }
                }
                if (str2.isEmpty()) {
                    jArr[0] = j;
                }
                aa aaVar2 = aaVar;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = aa.a;
                if (PatchProxy.isSupport(objArr8, aaVar2, changeQuickRedirect8, false, "98f780e113471263c7c545aad2505429", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, aaVar2, changeQuickRedirect8, false, "98f780e113471263c7c545aad2505429");
                    return;
                }
                aaVar2.d--;
                if (aaVar2.g > 0) {
                    aaVar2.g--;
                    return;
                }
                if (aaVar2.b.a()) {
                    aaVar2.c = aaVar2.e.pop();
                    aaVar2.d = aaVar2.f.pop().intValue();
                }
                aaVar2.b = aaVar2.b.j;
            }
        });
        return jArr[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ac acVar, String str, long j, long j2, String str2, int i, int i2) {
        Object[] objArr = {acVar, str, new Long(j), new Long(j2), str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8a6e85736d309c6194064028c634622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8a6e85736d309c6194064028c634622");
        } else {
            a(acVar, str, j, j2, str2, i, i2, -1L);
        }
    }

    private static void a(ac acVar, String str, long j, long j2, String str2, int i, int i2, long j3) {
        Object[] objArr = {acVar, str, new Long(j), new Long(j2), str2, Integer.valueOf(i), Integer.valueOf(i2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bff950c0feb82736273009015d32eabb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bff950c0feb82736273009015d32eabb");
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("path", y.a(str, arrayList));
        hashMap.put("record", arrayList);
        hashMap.put("channel", str2);
        hashMap.put("category", Integer.valueOf(i2));
        hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Double.valueOf(j2 != 0 ? (j * 1.0d) / j2 : 1.0d));
        hashMap.put("access", Integer.valueOf(i));
        if (j3 > 0) {
            hashMap.put("window", Long.valueOf(j3));
        }
        if (acVar == null) {
            v.a("cips.zombie", GearsLocator.DETAIL, j, hashMap);
        }
    }

    private static List<String> a(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb2794c99811fea8a3ec6b890a3e4009", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb2794c99811fea8a3ec6b890a3e4009");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(str + File.separator + it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a(Map<String, Set<String>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5bba66bc0bd314cde9541e9a8309cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5bba66bc0bd314cde9541e9a8309cd")).longValue();
        }
        if (map == null) {
            return 0L;
        }
        long j = 0;
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            b();
            File file = new File(entry.getKey());
            final Set<String> value = entry.getValue();
            final long[] jArr = {0};
            ab.a(file, new ab.b() { // from class: com.meituan.android.cipstorage.d.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ab.b
                public final void a(File file2, long j2, int i, String str, String str2) {
                    Object[] objArr2 = {file2, new Long(j2), Integer.valueOf(i), str, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20f0052659816b5862fa9d27740e87b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20f0052659816b5862fa9d27740e87b0");
                    } else if (i == 0) {
                        long[] jArr2 = jArr;
                        jArr2[0] = jArr2[0] + j2;
                    } else if (value.contains(str)) {
                        long[] jArr3 = jArr;
                        jArr3[0] = jArr3[0] - j2;
                    }
                }
            });
            j += jArr[0];
        }
        return j;
    }

    private void b(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3569fa7cdb6f1af50279546b2194e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3569fa7cdb6f1af50279546b2194e95");
        } else if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(CommonConstant.Symbol.COLON);
            if (split.length >= 2 && "path".equals(split[0])) {
                for (int i = 1; i < split.length; i++) {
                    if (!TextUtils.isEmpty(split[i])) {
                        set.add(split[i]);
                    }
                }
            }
        }
    }
}
