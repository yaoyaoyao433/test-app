package com.dianping.nvnetwork.shark.monitor;

import android.net.TrafficStats;
import android.os.Process;
import android.support.annotation.NonNull;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o {
    public static ChangeQuickRedirect a;
    List<a> b;
    int c;
    long d;
    long e;
    long f;
    private long g;

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230b75658b1e328675ec96eb8caa0858", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230b75658b1e328675ec96eb8caa0858");
            return;
        }
        this.b = new LinkedList();
        this.c = g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "529a29561b90cdccc9b4693e0397fe16", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "529a29561b90cdccc9b4693e0397fe16")).longValue() : com.dianping.nvnetwork.shark.g.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull a aVar) {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fee9827069ca1d714f0af4b8e5b91a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fee9827069ca1d714f0af4b8e5b91a9");
            return;
        }
        long a2 = a();
        if (!this.b.contains(aVar) || a2 - aVar.c <= PayTask.j) {
            i = 0;
        } else {
            this.b.remove(aVar);
        }
        if (a2 - this.g > 1500 && !this.b.isEmpty()) {
            this.g = a();
            ArrayList arrayList = new ArrayList(2);
            for (a aVar2 : this.b) {
                if (aVar2 != null && a2 - aVar2.c > PayTask.j) {
                    arrayList.add(aVar2);
                    i++;
                }
            }
            this.b.removeAll(arrayList);
        }
        if (i > 0) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5baee10ae06b0d07ed282365e60e499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5baee10ae06b0d07ed282365e60e499");
            return;
        }
        this.d = 0L;
        this.e = 0L;
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94072b6e9b8f14c81761db7cf4d3e03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94072b6e9b8f14c81761db7cf4d3e03");
        } else if (this.d > 0) {
            e();
        } else if (this.b.size() < this.c) {
        } else {
            this.d = a();
            this.e = d();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "226abbc51db00bc65faca385ee6d4196", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "226abbc51db00bc65faca385ee6d4196");
            return;
        }
        this.c = Math.max(this.c, this.b.size());
        this.c = Math.min(this.c, 5);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "510207ba2dfdc37657931af409c9fee2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "510207ba2dfdc37657931af409c9fee2");
            return;
        }
        int g = g();
        if (this.b.size() < g) {
            this.c = g;
        }
    }

    private int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a8c98396673201a4870f7762c62fc41", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a8c98396673201a4870f7762c62fc41")).intValue() : Math.min(Math.max(d.a().g, 1), 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9f31a6793d2b3778cce0ebd09dcbbc6", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9f31a6793d2b3778cce0ebd09dcbbc6")).longValue();
        }
        try {
            long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
            return uidRxBytes <= 0 ? com.dianping.nvtunnelkit.utils.e.b : uidRxBytes;
        } catch (Throwable unused) {
            return com.dianping.nvtunnelkit.utils.e.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public long c;

        public a(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6067edf37d88e970b6c4a15bd02c77e3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6067edf37d88e970b6c4a15bd02c77e3");
                return;
            }
            this.b = str;
            this.c = o.a();
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0ba44760fb8da97e36d5963bd952448", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0ba44760fb8da97e36d5963bd952448")).intValue() : this.b.hashCode();
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ca39cce8f09aa8ab684924be212ab3", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ca39cce8f09aa8ab684924be212ab3")).booleanValue();
            }
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                return this.b.equals(((a) obj).b);
            }
            return false;
        }
    }
}
