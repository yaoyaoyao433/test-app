package com.sankuai.xm.network.httpurlconnection;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.monitor.statistics.b;
import com.sankuai.xm.network.c;
import com.sankuai.xm.network.net.b;
import com.sankuai.xm.network.net.config.a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g implements com.sankuai.xm.network.f {
    public static ChangeQuickRedirect a;
    private static ConcurrentHashMap<com.sankuai.xm.network.c, c> f = new ConcurrentHashMap<>();
    private static final Object g = new Object();
    private static final g k = new g();
    Context b;
    public Set<com.sankuai.xm.network.httpurlconnection.a> c;
    private com.sankuai.xm.network.net.b d;
    private com.sankuai.xm.network.net.c e;
    private d h;
    private com.sankuai.xm.network.analyse.a i;
    private volatile boolean j;

    public static /* synthetic */ int a(g gVar, com.sankuai.xm.network.net.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "9c8ee901d7f2bc013fcf0d154f339797", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "9c8ee901d7f2bc013fcf0d154f339797")).intValue();
        }
        if (gVar.d != null) {
            if (TextUtils.isEmpty(dVar.c) || !dVar.c.startsWith(AbsApiFactory.HTTPS)) {
                if (TextUtils.isEmpty(dVar.c)) {
                    return 0;
                }
                dVar.c.startsWith(AbsApiFactory.HTTP);
                return 0;
            }
            return 8;
        }
        return -1;
    }

    public static /* synthetic */ void a(g gVar, com.sankuai.xm.network.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "4863470efa46c2886113d94887e2e85e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "4863470efa46c2886113d94887e2e85e");
        } else if (cVar != null) {
            synchronized (g) {
                if (f.containsKey(cVar)) {
                    f.get(cVar).c = false;
                }
            }
        }
    }

    public static /* synthetic */ void a(g gVar, String str, boolean z, String str2, Object[] objArr) {
        Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect, false, "3d9e0401fd4b6a916bca297a03c55d0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect, false, "3d9e0401fd4b6a916bca297a03c55d0b");
            return;
        }
        String format = String.format(str2, objArr);
        if (!gVar.i.b()) {
            if (z) {
                return;
            }
            com.sankuai.xm.network.b.a(format, new Object[0]);
            return;
        }
        boolean a2 = gVar.i.a(str);
        if (a2 || !z) {
            if (!a2) {
                com.sankuai.xm.network.b.a(format, new Object[0]);
            } else if (z) {
                String str3 = com.sankuai.xm.log.c.c() + StringUtil.SPACE + format;
                com.sankuai.xm.network.analyse.a aVar = gVar.i;
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                Object[] objArr3 = {new Long(elapsedRealtimeNanos), str3};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.network.analyse.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect2, false, "961dfb00e43c7875f8686c39bad01360", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect2, false, "961dfb00e43c7875f8686c39bad01360");
                } else {
                    com.sankuai.xm.network.analyse.a.b.put(Long.valueOf(elapsedRealtimeNanos), str3);
                }
            } else {
                com.sankuai.xm.network.b.b(format, new Object[0]);
            }
        }
    }

    public static /* synthetic */ com.sankuai.xm.network.net.a b(g gVar, com.sankuai.xm.network.net.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "61312af176a7a90df8f4800de7449a62", 6917529027641081856L)) {
            return (com.sankuai.xm.network.net.a) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "61312af176a7a90df8f4800de7449a62");
        }
        if (gVar.d != null) {
            return gVar.d.a(dVar);
        }
        return null;
    }

    public static g a() {
        return k;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174ff3f9f8994b51ab76366d7cf7ef4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174ff3f9f8994b51ab76366d7cf7ef4a");
            return;
        }
        this.b = null;
        this.h = new d();
        this.c = new HashSet();
        this.i = new com.sankuai.xm.network.analyse.a();
        this.j = false;
        a(com.sankuai.xm.base.f.m().g());
    }

    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e64b3988d2082fb1d5f97aaa5ce005", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e64b3988d2082fb1d5f97aaa5ce005");
        } else if (this.j) {
        } else {
            synchronized (this) {
                if (this.j) {
                    return;
                }
                if (context == null) {
                    com.sankuai.xm.network.b.c("HttpScheduler::initHttpClient content is null.", new Object[0]);
                    return;
                }
                this.j = true;
                if (this.e == null) {
                    this.e = new com.sankuai.xm.network.e();
                }
                this.d = this.e.a(1);
                this.d.a(context, new a.C1418a().a());
                this.d.a(new e());
            }
        }
    }

    @Override // com.sankuai.xm.network.f
    public final void a(com.sankuai.xm.network.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1555fc0e193091b1d2e14e1793229f2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1555fc0e193091b1d2e14e1793229f2e");
            return;
        }
        cVar.c(0L);
        a(cVar, false);
    }

    @Override // com.sankuai.xm.network.f
    public final void b(com.sankuai.xm.network.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95843eea8af487aa514dde7bbfb2543c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95843eea8af487aa514dde7bbfb2543c");
        } else {
            a(cVar, cVar.m());
        }
    }

    public final void a(com.sankuai.xm.network.c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "337bb18b0266d9cc8577c2e9d313e0e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "337bb18b0266d9cc8577c2e9d313e0e0");
            return;
        }
        cVar.b(i);
        cVar.a(1);
        a(cVar, true);
    }

    public final void a(com.sankuai.xm.network.httpurlconnection.e eVar, long j) {
        Object[] objArr = {eVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b56298c95885fd2eb2ec8ce5382588", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b56298c95885fd2eb2ec8ce5382588");
            return;
        }
        eVar.c(j);
        b(eVar);
    }

    public final void cancel(com.sankuai.xm.network.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800177b2389fc258ebe1a79fc3022bc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800177b2389fc258ebe1a79fc3022bc3");
        } else if (cVar == null) {
        } else {
            synchronized (g) {
                if (f.containsKey(cVar)) {
                    f.get(cVar).b = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(com.sankuai.xm.network.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f2413c22c61da903888a83576d84ae", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f2413c22c61da903888a83576d84ae")).booleanValue();
        }
        if (cVar == null) {
            return true;
        }
        synchronized (g) {
            if (f.containsKey(cVar)) {
                return f.get(cVar).b;
            }
            return false;
        }
    }

    private com.sankuai.xm.network.c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb8b75d43afac6ec5bb831ebc5b5487", 6917529027641081856L)) {
            return (com.sankuai.xm.network.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb8b75d43afac6ec5bb831ebc5b5487");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (g) {
            for (com.sankuai.xm.network.c cVar : f.keySet()) {
                c cVar2 = f.get(cVar);
                if (TextUtils.equals(cVar.A(), str) && cVar2.c) {
                    return cVar;
                }
            }
            return null;
        }
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63bf87225e117412f94987cb86cb011c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63bf87225e117412f94987cb86cb011c")).booleanValue() : !TextUtils.isEmpty(str) && (str.startsWith(AbsApiFactory.HTTP) || str.startsWith(AbsApiFactory.HTTPS));
    }

    private void a(com.sankuai.xm.network.c cVar, boolean z) {
        boolean z2 = true;
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe7c73d1cde6f2359f8c42455800752c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe7c73d1cde6f2359f8c42455800752c");
        } else if (b(cVar.j())) {
            long j = 0;
            synchronized (g) {
                if (cVar.bZ_()) {
                    com.sankuai.xm.network.c a2 = a(cVar.A());
                    if (a2 != null && !a2.n()) {
                        com.sankuai.xm.network.b.a("HttpScheduler::execute isMergeRequest exist url: %s", cVar.j());
                        a2.a(cVar);
                        z2 = false;
                    }
                    com.sankuai.xm.network.b.a("HttpScheduler::execute:isMergeRequest not exist url: %s", cVar.v() + CommonConstant.Symbol.COMMA + cVar.j());
                    c cVar2 = new c();
                    cVar2.c = true;
                    f.put(cVar, cVar2);
                    j = cVar.B();
                } else {
                    cVar.c(false);
                    if (!f.containsKey(cVar)) {
                        f.put(cVar, new c());
                    }
                    j = cVar.z();
                }
            }
            if (z2) {
                a(cVar, z, j);
            }
        } else {
            cVar.a(new c.a(-1001, "request url is invalid, url = " + cVar.j()));
        }
    }

    private void a(com.sankuai.xm.network.c cVar, boolean z, long j) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "073670b096179f00d6ec217dc9cc6a29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "073670b096179f00d6ec217dc9cc6a29");
            return;
        }
        com.sankuai.xm.base.trace.g w = cVar.w();
        j.a(w);
        try {
            com.sankuai.xm.network.httpurlconnection.c q = cVar.q();
            if (q != null) {
                q.a(cVar.j());
            }
            cVar.c(j);
            cVar.d(z);
            if (cVar.E()) {
                cVar.a(System.currentTimeMillis());
                com.sankuai.xm.threadpool.scheduler.a.b().b(new a(), cVar.z());
            } else {
                cVar.c(true);
                new b(cVar).run();
            }
            j.c(w);
        } catch (Throwable th) {
            j.a(w, th);
            throw th;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class e implements b.a {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.xm.network.net.b.a
        public final com.sankuai.xm.network.net.d a(com.sankuai.xm.network.net.d dVar) {
            return dVar;
        }

        @Override // com.sankuai.xm.network.net.b.a
        public final com.sankuai.xm.network.net.e a(com.sankuai.xm.network.net.d dVar, com.sankuai.xm.network.net.e eVar) {
            long length;
            Object[] objArr = {dVar, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8012de65ccbd44ec5c2f0878f79d1521", 6917529027641081856L)) {
                return (com.sankuai.xm.network.net.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8012de65ccbd44ec5c2f0878f79d1521");
            }
            if (dVar == null || eVar == null) {
                com.sankuai.xm.network.b.b("TrafficInterceptor::processResponse request == null || response == null", new Object[0]);
                return eVar;
            }
            try {
                b.a a2 = b.a.a().a(new URL(dVar.c));
                a2.d = dVar.h ? 102 : 103;
                long a3 = a(dVar.b);
                Object[] objArr2 = {new Long(a3)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "95e92f2ec409621c4ba7a052404d7b09", 6917529027641081856L)) {
                    a2 = (b.a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "95e92f2ec409621c4ba7a052404d7b09");
                } else {
                    a2.b = a3;
                }
                b.a c = a2.c(dVar.d != null ? dVar.d.getBytes().length : 0L);
                long a4 = a(eVar.c);
                Object[] objArr3 = {new Long(a4)};
                ChangeQuickRedirect changeQuickRedirect3 = b.a.a;
                if (PatchProxy.isSupport(objArr3, c, changeQuickRedirect3, false, "a8bf57859b48b88b8f403ea2d62adeeb", 6917529027641081856L)) {
                    c = (b.a) PatchProxy.accessDispatch(objArr3, c, changeQuickRedirect3, false, "a8bf57859b48b88b8f403ea2d62adeeb");
                } else {
                    c.c = a4;
                }
                if (eVar.f <= 0) {
                    length = eVar.d.getBytes().length;
                } else {
                    length = eVar.f;
                }
                c.b(length).b();
            } catch (MalformedURLException e) {
                com.sankuai.xm.network.b.d("HttpScheduler TrafficInterceptor::processResponse, e = " + e.getMessage(), new Object[0]);
            }
            return eVar;
        }

        private long a(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30ca3f43f1287e5a7d977dc2aa75073", 6917529027641081856L)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30ca3f43f1287e5a7d977dc2aa75073")).longValue();
            }
            if (map == null) {
                return 0L;
            }
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i = i + (!TextUtils.isEmpty(entry.getKey()) ? entry.getKey().getBytes().length : 0) + (!TextUtils.isEmpty(entry.getValue()) ? entry.getValue().getBytes().length : 0);
            }
            return i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        volatile boolean b;
        volatile boolean c;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d927f0e04390d1f79a6e157412df6b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d927f0e04390d1f79a6e157412df6b8");
                return;
            }
            this.b = false;
            this.c = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279b128c0bff35cf979d9775e84a8aa0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279b128c0bff35cf979d9775e84a8aa0");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcae38723a183abd1a404a4d5e9d5a75", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcae38723a183abd1a404a4d5e9d5a75");
                return;
            }
            ArrayList<com.sankuai.xm.network.c> arrayList = new ArrayList();
            synchronized (g.g) {
                if (g.f.size() <= 0) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                for (com.sankuai.xm.network.c cVar : g.f.keySet()) {
                    c cVar2 = (c) g.f.get(cVar);
                    if (cVar.z() <= 0 || currentTimeMillis - cVar.u() >= cVar.z()) {
                        hashMap.put(cVar, cVar2);
                    }
                }
                if (hashMap.size() <= 0) {
                    com.sankuai.xm.network.b.b("HttpScheduler::AsyncExecuteRunnable canRequestList size 0, waitList=%d", Integer.valueOf(g.f.size()));
                    hashMap = new HashMap(g.f);
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2, new Comparator<com.sankuai.xm.network.c>() { // from class: com.sankuai.xm.network.httpurlconnection.g.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(com.sankuai.xm.network.c cVar3, com.sankuai.xm.network.c cVar4) {
                        com.sankuai.xm.network.c cVar5 = cVar3;
                        com.sankuai.xm.network.c cVar6 = cVar4;
                        Object[] objArr2 = {cVar5, cVar6};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1f36486d76b97cd70131c48bdc1c3a1", 6917529027641081856L)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1f36486d76b97cd70131c48bdc1c3a1")).intValue();
                        }
                        if (cVar6.m() == cVar5.m()) {
                            return 0;
                        }
                        return cVar6.m() - cVar5.m();
                    }
                });
                com.sankuai.xm.network.c cVar3 = null;
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.sankuai.xm.network.c cVar4 = (com.sankuai.xm.network.c) it.next();
                    if (!cVar4.n()) {
                        cVar4.c(true);
                        cVar4.b(System.currentTimeMillis() - cVar4.u());
                        cVar3 = cVar4;
                        break;
                    }
                }
                if (cVar3 == null) {
                    return;
                }
                arrayList.add(cVar3);
                if (com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                    return;
                }
                for (com.sankuai.xm.network.c cVar5 : arrayList) {
                    new b(cVar5).run();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;
        private com.sankuai.xm.network.c c;
        private com.sankuai.xm.base.util.net.b d;

        public b(com.sankuai.xm.network.c cVar) {
            Object[] objArr = {g.this, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d744b1bfca5178fe40aca8c3e4dc8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d744b1bfca5178fe40aca8c3e4dc8e");
                return;
            }
            this.c = cVar;
            this.d = new com.sankuai.xm.base.util.net.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x02b8  */
        /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 721
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.network.httpurlconnection.g.b.run():void");
        }

        private boolean a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d5dbdf9aba813cf5699cd04ed122f8", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d5dbdf9aba813cf5699cd04ed122f8")).booleanValue();
            }
            if (i >= 0 || !this.c.C().b()) {
                return false;
            }
            com.sankuai.xm.network.b.d("HttpScheduler::executeRetry: Request => " + this.c + ", error =  " + str, new Object[0]);
            synchronized (g.g) {
                if (!g.f.containsKey(this.c)) {
                    c cVar = new c();
                    cVar.c = this.c.bZ_();
                    g.f.put(this.c, cVar);
                }
            }
            com.sankuai.xm.threadpool.scheduler.a.b().b(this, this.c.C().c());
            return true;
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17df813f867d0326a4f1a1c510ea78b0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17df813f867d0326a4f1a1c510ea78b0");
                return;
            }
            synchronized (g.g) {
                if (this.c.n()) {
                    g.f.remove(this.c);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class d {
        public static ChangeQuickRedirect a;
        AtomicInteger b;
        private AtomicLong d;

        public d() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6423a954724ffc66f82439b2b038cd29", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6423a954724ffc66f82439b2b038cd29");
                return;
            }
            this.b = new AtomicInteger(0);
            this.d = new AtomicLong(0L);
            b();
        }

        public final long a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "027a2ce73b4b09746d2a157c2cacb615", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "027a2ce73b4b09746d2a157c2cacb615")).longValue() : this.d.getAndSet(this.d.get());
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4c56274178daf6acb293a87bd286e2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4c56274178daf6acb293a87bd286e2");
                return;
            }
            this.b.getAndSet(0);
            this.d.getAndSet(System.currentTimeMillis());
        }
    }
}
