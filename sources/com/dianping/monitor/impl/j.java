package com.dianping.monitor.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static j f;
    public final Handler c;
    int d;
    public int e;
    private Context h;
    private int i;
    private final HashMap<String, Long> j;
    private final List<String> k;
    private final Object l;
    private final Random m;
    private final AtomicBoolean n;
    private static final Executor g = com.sankuai.android.jarvis.c.a("DNSMonitorService", 1, 2, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static boolean b = com.dianping.monitor.impl.a.DEBUG;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static /* synthetic */ void a(com.dianping.monitor.impl.j r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.monitor.impl.j.a(com.dianping.monitor.impl.j, java.lang.String):void");
    }

    private j(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e65131632a54050419ec7da7c162e019", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e65131632a54050419ec7da7c162e019");
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        this.d = 300000;
        this.j = new HashMap<>();
        this.k = new LinkedList();
        this.l = new Object();
        this.m = new Random();
        this.e = 0;
        this.n = new AtomicBoolean();
        this.h = context;
        this.i = i;
    }

    public static synchronized j a(Context context, int i, String str) {
        synchronized (j.class) {
            Object[] objArr = {context, Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1aa2c4dcc5872fc1bec7b27883af204a", 6917529027641081856L)) {
                return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1aa2c4dcc5872fc1bec7b27883af204a");
            }
            if (f == null) {
                f = new j(context, i);
            }
            return f;
        }
    }

    public final void a(String str, List<String> list, String str2) {
        Object[] objArr = {str, list, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c540aa35f894b41260b91c0b5f6cead2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c540aa35f894b41260b91c0b5f6cead2");
        } else {
            a(str, list, str2, a.DNS_MONITOR_DNS_TYPE_UNKNOWN);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        DNS_MONITOR_DNS_TYPE_UNKNOWN,
        DNS_MONITOR_DNS_TYPE_LOCAL,
        DNS_MONITOR_DNS_TYPE_HTTP_DNS;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43bc21f5816f5fcfac60b87a49f39bcf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43bc21f5816f5fcfac60b87a49f39bcf");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7ce58f188d6349d0acbad79750c6134", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7ce58f188d6349d0acbad79750c6134") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "944a835ddf3f8189d2e89161da373deb", 6917529027641081856L) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "944a835ddf3f8189d2e89161da373deb") : (a[]) values().clone();
        }
    }

    public final void a(String str, List<String> list, String str2, a aVar) {
        Object[] objArr = {str, list, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "125fabde3647cd5b40af4137a55a841a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "125fabde3647cd5b40af4137a55a841a");
        } else if (this.e == 0 || this.m.nextInt(100) > this.e) {
            synchronized (this.l) {
                if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
                    if (this.j.containsKey(str) && this.j.get(str).longValue() + this.d > System.currentTimeMillis()) {
                        return;
                    }
                    this.j.put(str, Long.valueOf(System.currentTimeMillis()));
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("\t");
                    for (int i = 0; i < list.size(); i++) {
                        sb.append(list.get(i));
                        if (i < list.size() - 1) {
                            sb.append(CommonConstant.Symbol.COMMA);
                        }
                    }
                    sb.append("\t");
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                    }
                    sb.append("\t");
                    sb.append((aVar == null ? a.DNS_MONITOR_DNS_TYPE_UNKNOWN : aVar).ordinal());
                    this.k.add(sb.toString());
                    b();
                }
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a78fa00f24ab56fbd442616282c920c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a78fa00f24ab56fbd442616282c920c");
        } else if (this.n.compareAndSet(false, true)) {
            this.c.postDelayed(new Runnable() { // from class: com.dianping.monitor.impl.j.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3fa4eec5eb1b9d8cf339fc7efda2565", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3fa4eec5eb1b9d8cf339fc7efda2565");
                        return;
                    }
                    synchronized (j.this.l) {
                        if (!j.this.k.isEmpty()) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.addAll(j.this.k);
                            j.this.k.clear();
                            com.sankuai.waimai.launcher.util.aop.b.a(j.g, new b(linkedList));
                        }
                    }
                    j.this.n.set(false);
                }
            }, LocationStrategy.LOCATION_TIMEOUT);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;
        private List<String> c;

        public b(List<String> list) {
            Object[] objArr = {j.this, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c00f70f0df9a2c918ef241f5037df209", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c00f70f0df9a2c918ef241f5037df209");
            } else {
                this.c = list;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811f378880ed6f4d0f3eb1eea47adefd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811f378880ed6f4d0f3eb1eea47adefd");
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (this.c != null && !this.c.isEmpty()) {
                for (String str : this.c) {
                    sb.append(str);
                    sb.append("\n");
                }
            }
            j.a(j.this, sb.toString());
        }
    }

    private void a(boolean z, long j, int i, int i2, int i3, Throwable th) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a936eeb35ebcb9f42f5a3d1bd4f1cd7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a936eeb35ebcb9f42f5a3d1bd4f1cd7d");
            return;
        }
        r.a("hijack", com.dianping.monitor.b.h() ? TrafficRecord.Detail.TUNNEL_SHARK : "raptor", z ? 200 : i, com.dianping.monitor.b.i() ? "h2" : "http1.1", i2, i3, System.currentTimeMillis() - j, th);
    }
}
