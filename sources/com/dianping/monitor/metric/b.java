package com.dianping.monitor.metric;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.dianping.logreportswitcher.c;
import com.dianping.monitor.h;
import com.dianping.monitor.impl.r;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements e {
    public static ChangeQuickRedirect a;
    public static boolean b = com.dianping.monitor.impl.a.DEBUG;
    private static final Executor e = com.sankuai.android.jarvis.c.a("MetricSend", 1, 2, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public boolean c;
    public boolean d;
    private final Handler f;
    private final Object g;
    private final List<com.dianping.monitor.metric.a> h;
    private final a i;
    private boolean j;
    private Runnable k;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        String a(String str, String str2, String str3);

        String a(List<com.dianping.monitor.metric.a> list);
    }

    public static /* synthetic */ boolean a(b bVar, com.dianping.monitor.metric.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "ddb51049db46fa0b3953f4b5c6ba15da", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "ddb51049db46fa0b3953f4b5c6ba15da")).booleanValue();
        }
        if (aVar == null || !com.dianping.monitor.b.n()) {
            return false;
        }
        Map<String, String> map = aVar.d;
        if (map.size() != 0) {
            for (String str : map.keySet()) {
                if (h.a(str, "metric_key")) {
                    return true;
                }
            }
            for (String str2 : map.values()) {
                if (h.a(str2, "metric_val")) {
                    return true;
                }
            }
        }
        return false;
    }

    public b(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f83f138da8069ab8e4132144d15a955", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f83f138da8069ab8e4132144d15a955");
            return;
        }
        this.g = new Object();
        this.h = new ArrayList();
        this.c = false;
        this.d = false;
        this.k = new Runnable() { // from class: com.dianping.monitor.metric.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffbb11f2bd03bc5041f32c7d2f38924d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffbb11f2bd03bc5041f32c7d2f38924d");
                } else {
                    b.this.c();
                }
            }
        };
        this.j = z;
        this.f = new Handler(Looper.getMainLooper());
        this.i = aVar;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "245de39c52d7c6776f5967446df558f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "245de39c52d7c6776f5967446df558f2");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(e, new Runnable() { // from class: com.dianping.monitor.metric.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3c7966a320ba22d2f2e2101ca9105cc", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3c7966a320ba22d2f2e2101ca9105cc");
                    } else {
                        c.a().b();
                    }
                }
            });
        }
    }

    @Override // com.dianping.monitor.metric.d
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d76f97dc089e78d68e9327432e2375d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d76f97dc089e78d68e9327432e2375d")).intValue() : c.a().a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad01ef618a02bfeb8d462865522f151b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad01ef618a02bfeb8d462865522f151b");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(e, new Runnable() { // from class: com.dianping.monitor.metric.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList<com.dianping.monitor.metric.a> arrayList;
                    List list;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e07ac9a65d5e4d373836b549ba9eb654", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e07ac9a65d5e4d373836b549ba9eb654");
                        return;
                    }
                    c.a().b();
                    synchronized (b.this.g) {
                        arrayList = new ArrayList(b.this.h);
                        b.this.h.clear();
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    for (com.dianping.monitor.metric.a aVar : arrayList) {
                        String str = aVar.h + CommonConstant.Symbol.MINUS + aVar.b + CommonConstant.Symbol.MINUS + aVar.c;
                        if (hashMap.containsKey(str)) {
                            list = (List) hashMap.get(str);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            hashMap.put(str, arrayList2);
                            list = arrayList2;
                        }
                        if (!b.a(b.this, aVar)) {
                            list.add(aVar);
                        }
                    }
                    for (List list2 : hashMap.values()) {
                        b.this.a(list2);
                    }
                    h.g();
                }
            });
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
    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(java.util.List<com.dianping.monitor.metric.a> r20) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.monitor.metric.b.a(java.util.List):boolean");
    }

    @Override // com.dianping.monitor.metric.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab2ef56cb6d5c6ca0c57c19cfedd193", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab2ef56cb6d5c6ca0c57c19cfedd193");
        } else {
            c();
        }
    }

    private void a(boolean z, long j, String str, int i, int i2, int i3, Throwable th) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07015b03519f4fbc8d16da6e2a519234", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07015b03519f4fbc8d16da6e2a519234");
        } else if (this.c) {
        } else {
            Uri parse = Uri.parse(str);
            String[] split = parse.getEncodedPath().split("/");
            String encodedPath = parse.getEncodedPath();
            if (split != null && split.length > 2) {
                encodedPath = split[2];
            }
            r.a(encodedPath, com.dianping.monitor.b.h() ? TrafficRecord.Detail.TUNNEL_SHARK : "raptor", z ? 200 : i, com.dianping.monitor.b.i() ? "h2" : "http1.1", i2, i3, System.currentTimeMillis() - j, th);
        }
    }

    @Override // com.dianping.monitor.metric.d
    public final void a(com.dianping.monitor.metric.a aVar) {
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "768902e15b57a860aac6727586f4c192", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "768902e15b57a860aac6727586f4c192");
        } else if (c.b.a.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE) && c.b.a.a("metric") && aVar != null) {
            com.dianping.monitor.a.a(aVar);
            synchronized (this.g) {
                this.h.add(aVar);
                if (this.h.size() <= com.dianping.monitor.b.a(this.j)) {
                    z = false;
                }
            }
            this.f.removeCallbacks(this.k);
            if (z) {
                c();
            } else {
                this.f.postDelayed(this.k, com.dianping.monitor.b.b(this.j));
            }
        }
    }
}
