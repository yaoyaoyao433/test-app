package com.dianping.nvnetwork.shark.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a;
    final double b;
    final i c;
    final AtomicBoolean d;
    volatile String e;
    private final double f;
    private final double g;
    private volatile ScheduledFuture h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class a implements Runnable {
        public boolean c = false;
    }

    public j(double d, double d2, double d3, i iVar) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d7aa3cd6bc317986423b514b3082ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d7aa3cd6bc317986423b514b3082ae");
            return;
        }
        this.d = new AtomicBoolean();
        this.b = d;
        this.f = d2;
        this.g = d3;
        this.c = iVar;
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "565ff29c96591bef0008cf78451bf1d2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "565ff29c96591bef0008cf78451bf1d2")).intValue();
        }
        return Math.max((int) (n.a(com.dianping.nvnetwork.g.b()).c == e.BAD ? this.g : this.f), i);
    }

    private a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae8e3c0330bb55d97eb9d6a64ae6bca", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae8e3c0330bb55d97eb9d6a64ae6bca") : new a() { // from class: com.dianping.nvnetwork.shark.monitor.j.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                List<Integer> arrayList;
                long j;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbe57e22ffda7a5eda87ffd3dea86e89", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbe57e22ffda7a5eda87ffd3dea86e89");
                    return;
                }
                char c = 1;
                try {
                    j.this.e = d.a().f;
                    d a2 = d.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "8ead0f64d5ba3c74cef019d279442cbc", 6917529027641081856L)) {
                        arrayList = (List) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "8ead0f64d5ba3c74cef019d279442cbc");
                    } else {
                        JSONArray optJSONArray = a2.c.optJSONArray("NetMonitor.DefaultPingPorts");
                        Object[] objArr4 = {optJSONArray};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "c9f0ab17be016697b9fc73c0dcd88529", 6917529027641081856L)) {
                            arrayList = (List) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "c9f0ab17be016697b9fc73c0dcd88529");
                        } else {
                            arrayList = new ArrayList<>();
                            if (optJSONArray != null) {
                                for (int i = 0; i < optJSONArray.length(); i++) {
                                    arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
                                }
                            }
                        }
                        if (arrayList.size() <= 0) {
                            arrayList = d.b;
                        }
                    }
                    long j2 = 0;
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        com.dianping.nvnetwork.shark.monitor.tcp.a aVar = new com.dianping.nvnetwork.shark.monitor.tcp.a();
                        com.dianping.nvnetwork.shark.monitor.tcp.b bVar = new com.dianping.nvnetwork.shark.monitor.tcp.b();
                        bVar.b = j.this.e;
                        bVar.c = (int) (j.this.b * 2.0d);
                        bVar.d = arrayList.get(i2).intValue();
                        com.dianping.nvnetwork.shark.monitor.tcp.c a3 = aVar.a(bVar, i2);
                        if (a3.b) {
                            j = a3.d;
                        } else {
                            j = (long) (j.this.b * 2.0d);
                        }
                        j2 += j;
                        if (a3.b) {
                            j jVar = j.this;
                            int intValue = arrayList.get(i2).intValue();
                            String str = a3.c;
                            Object[] objArr5 = new Object[3];
                            objArr5[0] = Integer.valueOf(intValue);
                            objArr5[c] = new Long(j);
                            objArr5[2] = str;
                            ChangeQuickRedirect changeQuickRedirect5 = j.a;
                            if (PatchProxy.isSupport(objArr5, jVar, changeQuickRedirect5, false, "8a390722ed65fa860699c9c9d667afb0", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, jVar, changeQuickRedirect5, false, "8a390722ed65fa860699c9c9d667afb0");
                            } else {
                                try {
                                    d a4 = d.a();
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = d.a;
                                    if (PatchProxy.isSupport(objArr6, a4, changeQuickRedirect6, false, "b9f3081485af9a219aef9d51f75d8116", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr6, a4, changeQuickRedirect6, false, "b9f3081485af9a219aef9d51f75d8116")).booleanValue() : a4.c.optBoolean("NetMonitor.PingReport", false)) {
                                        com.dianping.nvnetwork.g.d().pv4(0L, "NetMonitor_Ping_Rtt", 0, 1, intValue, 0, 0, (int) j, jVar.e, "");
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        i2++;
                        c = 1;
                    }
                    if (j2 < j.this.b * 2.0d * arrayList.size()) {
                        double size = (int) (j2 / arrayList.size());
                        if (size < j.this.b) {
                            if (size > d.a().c()) {
                                eVar = e.MODERATE;
                            } else {
                                eVar = e.GOOD;
                            }
                        } else {
                            eVar = e.BAD;
                        }
                    } else if (!com.dianping.nvtunnelkit.utils.c.a()) {
                        eVar = e.OFFLINE;
                    } else {
                        eVar = e.BAD;
                    }
                } catch (Exception e) {
                    com.dianping.nvtunnelkit.logger.b.a("PingManager", "some exception happen when do ping", e);
                    eVar = e.OFFLINE;
                }
                e eVar2 = eVar;
                if (j.this.c != null) {
                    j.this.c.a(eVar2, new g(1));
                }
                try {
                    if (this.c) {
                        j.this.a();
                    }
                } catch (Throwable th) {
                    com.dianping.nvtunnelkit.logger.b.a("PingManager", th);
                }
                com.dianping.nvtunnelkit.logger.b.a("PingManager", "current status is " + eVar2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "178a36557111102dae6ef4f592760bb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "178a36557111102dae6ef4f592760bb4");
        } else {
            a(10000);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0405893d89343f15844fe7044417b7a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0405893d89343f15844fe7044417b7a1");
            return;
        }
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null && !scheduledFuture.isCancelled() && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(false);
        }
        a b = b();
        b.c = d.a().d;
        this.h = com.dianping.nvnetwork.shark.monitor.a.a().a(b, b(i), TimeUnit.MILLISECONDS);
    }
}
