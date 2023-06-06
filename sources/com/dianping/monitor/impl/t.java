package com.dianping.monitor.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.dianping.logreportswitcher.c;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class t {
    public static ChangeQuickRedirect a = null;
    public static int b = 0;
    private static final String d = "t";
    private static String f;
    private static String g;
    private String e;
    private long h;
    private String i;
    private String j;
    private SparseIntArray k;
    private final com.dianping.monitor.f o;
    public static boolean c = a.DEBUG;
    private static final Executor l = com.sankuai.android.jarvis.c.a("SpeedMonitor", 1, 2, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private static final Map<String, t> m = new ConcurrentHashMap();
    private static int n = 0;

    public static /* synthetic */ String a() {
        return d;
    }

    public static /* synthetic */ String a(t tVar) {
        return tVar.j;
    }

    public static /* synthetic */ void a(t tVar, boolean z, long j, int i, int i2, int i3, Throwable th) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tVar, changeQuickRedirect, false, "eb8fb187fff760b02d0e116bc0aadaab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, tVar, changeQuickRedirect, false, "eb8fb187fff760b02d0e116bc0aadaab");
            return;
        }
        r.a("speed", com.dianping.monitor.b.h() ? TrafficRecord.Detail.TUNNEL_SHARK : "raptor", z ? 200 : i, com.dianping.monitor.b.i() ? "h2" : "http1.1", i2, i3, System.currentTimeMillis() - j, th);
    }

    private t(Context context, String str, String str2, String str3, long j) {
        Object[] objArr = {context, str, str2, str3, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab418e06df5b822feafb7977f82e485", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab418e06df5b822feafb7977f82e485");
            return;
        }
        this.e = str3;
        this.j = str;
        this.i = str2;
        this.h = j;
        this.o = com.dianping.monitor.f.a(context);
        this.k = new SparseIntArray();
        if (n == 0) {
            n = com.dianping.monitor.h.a(context);
        }
        if (TextUtils.isEmpty(f)) {
            f = com.dianping.monitor.h.b();
        }
        if (TextUtils.isEmpty(g)) {
            g = com.dianping.monitor.h.a();
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7230488f04af030e185cad9df1769420", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7230488f04af030e185cad9df1769420");
        } else {
            a(context, str, str2, str3, System.currentTimeMillis());
        }
    }

    public static void a(Context context, String str, String str2, String str3, long j) {
        Object[] objArr = {context, str, str2, str3, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "018cc2f649eafab97532f39702ddcb51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "018cc2f649eafab97532f39702ddcb51");
        } else {
            m.put(str3, new t(context, str, str2, str3, j));
        }
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf9984af7683acfb0d95fe0bac9ec3cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf9984af7683acfb0d95fe0bac9ec3cb");
        } else {
            a(str, i, System.currentTimeMillis());
        }
    }

    public static void a(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "727bfa3f42861c07bd068c5f1acfb4f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "727bfa3f42861c07bd068c5f1acfb4f9");
            return;
        }
        t tVar = m.get(str);
        if (tVar != null) {
            tVar.a(i, j);
        } else if (c) {
            String str2 = d;
            Log.e(str2, str + "no exist");
        }
    }

    public static void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a83851248ef3f9bacf658b54c558cc0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a83851248ef3f9bacf658b54c558cc0e");
            return;
        }
        t tVar = m.get(str);
        if (tVar != null) {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, tVar, changeQuickRedirect2, false, "0cb3307a24b3e9494ce16122503a5754", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, tVar, changeQuickRedirect2, false, "0cb3307a24b3e9494ce16122503a5754");
            } else {
                tVar.k.put(i, i2);
            }
        } else if (c) {
            String str2 = d;
            Log.e(str2, str + "no exist");
        }
    }

    public static void a(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f73f938ca7154a4e6c612d7b0a912a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f73f938ca7154a4e6c612d7b0a912a5");
            return;
        }
        t tVar = m.get(str);
        if (tVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, tVar, changeQuickRedirect2, false, "b7f12d8ecfad003ae92112eff49c4892", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, tVar, changeQuickRedirect2, false, "b7f12d8ecfad003ae92112eff49c4892");
            } else if (c.b.a.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE) && c.b.a.a("appspeed")) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, tVar, changeQuickRedirect3, false, "2edfb7aba08a71d1f4f491c9ecc54467", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, tVar, changeQuickRedirect3, false, "2edfb7aba08a71d1f4f491c9ecc54467");
                } else if (tVar.k.size() > 0) {
                    final StringBuilder sb = new StringBuilder("v=2&unionId=" + tVar.i + "&c=\n");
                    sb.append(tVar.h);
                    sb.append('\t');
                    com.dianping.monitor.f fVar = tVar.o;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.dianping.monitor.f.a;
                    if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "32f37fa8a73e0a9d6ad34124294db254", 6917529027641081856L)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "32f37fa8a73e0a9d6ad34124294db254")).intValue();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - fVar.c.get() > com.dianping.monitor.b.e()) {
                            fVar.d.set(fVar.b.a());
                            fVar.c.set(currentTimeMillis);
                        }
                        i = fVar.d.get();
                    }
                    sb.append(i);
                    sb.append('\t');
                    sb.append(n);
                    sb.append('\t');
                    sb.append(1);
                    sb.append('\t');
                    sb.append(f);
                    sb.append('\t');
                    sb.append(g);
                    sb.append('\t');
                    sb.append(tVar.e);
                    sb.append('\t');
                    for (int i2 = 0; i2 < tVar.k.size(); i2++) {
                        int keyAt = tVar.k.keyAt(i2);
                        sb.append(keyAt);
                        sb.append('-');
                        sb.append(tVar.k.get(keyAt));
                        if (i2 == tVar.k.size() - 1) {
                            sb.append('\n');
                        } else {
                            sb.append('\t');
                        }
                    }
                    boolean z = c;
                    com.sankuai.waimai.launcher.util.aop.b.a(l, new Runnable() { // from class: com.dianping.monitor.impl.t.1
                        public static ChangeQuickRedirect a;

                        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
                            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
                            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
                            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
                            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
                            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                            */
                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 346
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.dianping.monitor.impl.t.AnonymousClass1.run():void");
                        }
                    });
                }
            }
            m.remove(str);
        }
    }

    private void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5aba87aeb6e922f60343c520a39c77c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5aba87aeb6e922f60343c520a39c77c");
        } else {
            this.k.put(i, (int) (j - this.h));
        }
    }
}
