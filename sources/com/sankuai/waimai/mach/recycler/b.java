package com.sankuai.waimai.mach.recycler;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ASTTemplate;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.manager.a;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import com.sankuai.waimai.mach.manager_new.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private ConcurrentHashMap<String, h> b;
    private String c;
    private boolean d;
    private Map<String, Set<WeakReference<com.sankuai.waimai.mach.recycler.c>>> e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(Map<com.sankuai.waimai.mach.recycler.c, C1020b> map);
    }

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abd14d0f8eea2bdbdd7f9a60a8a9e5d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abd14d0f8eea2bdbdd7f9a60a8a9e5d1");
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap();
        this.c = str;
    }

    public final h a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba6a44a1e393f3940decfb8e40f252a", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba6a44a1e393f3940decfb8e40f252a");
        }
        h hVar = null;
        if (str != null) {
            if (this.d) {
                String b = com.sankuai.waimai.mach.manager_new.b.a().b(str);
                ConcurrentHashMap<String, h> concurrentHashMap = this.b;
                hVar = concurrentHashMap.get(str + b);
            } else {
                hVar = this.b.get(str);
            }
            if (hVar != null) {
                return hVar;
            }
        }
        com.sankuai.waimai.mach.manager.cache.e a2 = com.sankuai.waimai.mach.manager.a.a().a(str, str2, str3, this.c);
        if (a2 != null) {
            try {
                if (this.d) {
                    String a3 = a2.a() != null ? a2.a() : "";
                    ConcurrentHashMap<String, h> concurrentHashMap2 = this.b;
                    if (concurrentHashMap2.get(str + a3) != null) {
                        ConcurrentHashMap<String, h> concurrentHashMap3 = this.b;
                        return concurrentHashMap3.get(str + a3);
                    }
                    ASTTemplate aSTTemplate = (ASTTemplate) com.sankuai.waimai.mach.utils.b.a().fromJson(a2.k, (Class<Object>) ASTTemplate.class);
                    if (aSTTemplate != null) {
                        h hVar2 = new h(a2, aSTTemplate);
                        try {
                            ConcurrentHashMap<String, h> concurrentHashMap4 = this.b;
                            concurrentHashMap4.putIfAbsent(str + a3, hVar2);
                        } catch (Exception unused) {
                        }
                        return hVar2;
                    }
                    return hVar;
                }
                ASTTemplate aSTTemplate2 = (ASTTemplate) com.sankuai.waimai.mach.utils.b.a().fromJson(a2.k, (Class<Object>) ASTTemplate.class);
                if (aSTTemplate2 != null) {
                    h hVar3 = new h(a2, aSTTemplate2);
                    try {
                        this.b.putIfAbsent(str, hVar3);
                    } catch (Exception unused2) {
                    }
                    return hVar3;
                }
                return hVar;
            } catch (Exception unused3) {
                return hVar;
            }
        }
        return hVar;
    }

    @WorkerThread
    public final h a(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d34789acbd1f1ef62f82dfd0a72208f", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d34789acbd1f1ef62f82dfd0a72208f") : a(str, str2, str3, null, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.sankuai.waimai.mach.recycler.h] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.sankuai.waimai.mach.recycler.h] */
    /* JADX WARN: Type inference failed for: r2v26 */
    @WorkerThread
    public final h a(String str, String str2, String str3, BundleInfo bundleInfo, int i) {
        h hVar;
        h hVar2;
        int i2;
        char c2;
        ASTTemplate aSTTemplate;
        Object[] objArr = {str, str2, str3, null, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d708afc1860ce38c83af09f59dd25e", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d708afc1860ce38c83af09f59dd25e");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (str.intern()) {
            if (str != null) {
                try {
                    if (this.d) {
                        String b = com.sankuai.waimai.mach.manager_new.b.a().b(str);
                        ConcurrentHashMap<String, h> concurrentHashMap = this.b;
                        hVar = concurrentHashMap.get(str + b);
                    } else {
                        hVar = this.b.get(str);
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final a aVar = new a();
            int i3 = i <= 0 ? 5000 : i;
            com.sankuai.waimai.mach.manager.a a2 = com.sankuai.waimai.mach.manager.a.a();
            String str4 = this.c;
            a.InterfaceC1013a interfaceC1013a = new a.InterfaceC1013a() { // from class: com.sankuai.waimai.mach.recycler.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a844f7bf8c04fcc24a6a809d1ec74502", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a844f7bf8c04fcc24a6a809d1ec74502");
                        return;
                    }
                    aVar.a = eVar;
                    countDownLatch.countDown();
                }

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull CacheException cacheException) {
                    Object[] objArr2 = {cacheException};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2640e89b6e5e038481fc67dc2f852fc7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2640e89b6e5e038481fc67dc2f852fc7");
                        return;
                    }
                    countDownLatch.countDown();
                    com.sankuai.waimai.mach.log.b.a("MachLogicList", "异步加载失败" + cacheException.getMessage());
                }
            };
            Object[] objArr2 = {str, str2, str3, str4, null, Integer.valueOf(i3), interfaceC1013a};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.manager.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "100d1e04ae7072c2c7db63d4346ce564", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "100d1e04ae7072c2c7db63d4346ce564");
                c2 = 0;
                i2 = 1;
                hVar2 = null;
            } else {
                com.sankuai.waimai.mach.manager_new.common.c.b();
                com.sankuai.waimai.mach.manager_new.e eVar = a2.b;
                hVar2 = null;
                i2 = 1;
                c2 = 0;
                eVar.a(str, str2, str3, str4, (BundleInfo) null, i3, interfaceC1013a, (b.C1016b) null);
            }
            try {
                countDownLatch.await(i3, TimeUnit.MILLISECONDS);
                if (aVar.a == null || str == null) {
                    return hVar2;
                }
                h hVar3 = this.d;
                try {
                    if (hVar3 != 0) {
                        String b2 = com.sankuai.waimai.mach.manager_new.b.a().b(str);
                        ConcurrentHashMap<String, h> concurrentHashMap2 = this.b;
                        hVar3 = concurrentHashMap2.get(str + b2);
                        if (hVar3 == 0) {
                            String a3 = aVar.a.a() != null ? aVar.a.a() : "";
                            ConcurrentHashMap<String, h> concurrentHashMap3 = this.b;
                            if (concurrentHashMap3.get(str + a3) != null) {
                                ConcurrentHashMap<String, h> concurrentHashMap4 = this.b;
                                return concurrentHashMap4.get(str + a3);
                            }
                            ASTTemplate aSTTemplate2 = (ASTTemplate) com.sankuai.waimai.mach.utils.b.a().fromJson(aVar.a.k, (Class<Object>) ASTTemplate.class);
                            if (aSTTemplate2 != null) {
                                h hVar4 = new h(aVar.a, aSTTemplate2);
                                try {
                                    ConcurrentHashMap<String, h> concurrentHashMap5 = this.b;
                                    concurrentHashMap5.putIfAbsent(str + a3, hVar4);
                                } catch (Exception unused) {
                                }
                                hVar3 = hVar4;
                            }
                        }
                    } else {
                        hVar3 = this.b.get(str);
                        if (hVar3 == 0 && (aSTTemplate = (ASTTemplate) com.sankuai.waimai.mach.utils.b.a().fromJson(aVar.a.k, (Class<Object>) ASTTemplate.class)) != null) {
                            h hVar5 = new h(aVar.a, aSTTemplate);
                            try {
                                this.b.putIfAbsent(str, hVar5);
                            } catch (Exception unused2) {
                            }
                            hVar3 = hVar5;
                        }
                    }
                } catch (Exception unused3) {
                }
                return hVar3;
            } catch (InterruptedException e2) {
                String[] strArr = new String[i2];
                strArr[c2] = "异步加载异常 " + e2.getMessage();
                com.sankuai.waimai.mach.log.b.b("MachLogicList", strArr);
                return hVar2;
            }
        }
    }

    public final void a(Activity activity, com.sankuai.waimai.mach.recycler.c cVar, int i, int i2, Map<String, Object> map, String str) {
        Object[] objArr = {activity, cVar, Integer.valueOf(i), Integer.valueOf(i2), map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38bb617ac0eda606704e0d5b7eac6489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38bb617ac0eda606704e0d5b7eac6489");
        } else if (cVar == null || cVar.m() == null || map == null) {
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h m = cVar.m();
            cVar.a(map);
            Mach k = cVar.k();
            k.setBiz(cVar.p);
            k.setModuleId(cVar.j);
            k.setReRenderListener(cVar.w);
            k.initWithBundle(activity, m.c);
            k.loadTemplate(cVar.a(), m.b);
            com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a(MonitorManager.RECORD_START(false, cVar.b));
            k.syncPreRenderWithData(map, i, i2, aVar, null);
            if (k.getRootNode() != null) {
                com.sankuai.waimai.mach.manager.a.a().b().renderSuccess(str, this.c, cVar.a(), cVar.i(), map, (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            }
            cVar.a(k.getRootNode());
            MonitorManager.RECORD_END(aVar);
        }
    }

    public final void a(Activity activity, List<com.sankuai.waimai.mach.recycler.c> list, final c cVar) {
        Object[] objArr = {activity, list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf9bc4d6de4ee7b0fd0ab44e9c830be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf9bc4d6de4ee7b0fd0ab44e9c830be9");
        } else if (com.sankuai.waimai.mach.utils.e.a(list)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.mach.recycler.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5bbff67d47808f5b22ed76b1beb0063", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5bbff67d47808f5b22ed76b1beb0063");
                    } else if (cVar != null) {
                        cVar.a(new HashMap());
                    }
                }
            });
        } else {
            f fVar = new f(list.size(), cVar);
            if (m.d()) {
                for (com.sankuai.waimai.mach.recycler.c cVar2 : list) {
                    com.sankuai.waimai.mach.recycler.e.a().a(new d(activity, cVar2, fVar));
                }
                return;
            }
            Handler handler = com.sankuai.waimai.mach.recycler.d.a().b;
            Handler handler2 = com.sankuai.waimai.mach.recycler.d.a().c;
            LinkedList linkedList = new LinkedList(list.subList(0, list.size() / 2));
            LinkedList linkedList2 = new LinkedList(list.subList(list.size() / 2, list.size()));
            handler.post(new e(activity, linkedList, fVar, handler));
            handler2.post(new e(activity, linkedList2, fVar, handler2));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class e implements Runnable {
        public static ChangeQuickRedirect a;
        private List<com.sankuai.waimai.mach.recycler.c> c;
        private WeakReference<Activity> d;
        private f e;
        private Handler f;

        public e(Activity activity, List<com.sankuai.waimai.mach.recycler.c> list, f fVar, Handler handler) {
            Object[] objArr = {b.this, activity, list, fVar, handler};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bf42d36cc2b32883b4479d13f5cf28d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bf42d36cc2b32883b4479d13f5cf28d");
                return;
            }
            this.d = new WeakReference<>(activity);
            this.c = list;
            this.e = fVar;
            this.f = handler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3327a0f5cd8a3643251f16524e430ae5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3327a0f5cd8a3643251f16524e430ae5");
            } else if (this.c != null && this.c.size() > 0 && this.d != null && this.d.get() != null) {
                for (int i = 0; i < this.c.size(); i++) {
                    com.sankuai.waimai.mach.recycler.c cVar = this.c.get(i);
                    com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a(MonitorManager.MACH_LIST_RECORD_START(cVar.a()));
                    if (TextUtils.isEmpty(cVar.m) && cVar.l == null) {
                        this.e.a(cVar, new C1020b(101));
                        this.e.a();
                        return;
                    }
                    if (cVar.l == null) {
                        cVar.l = com.sankuai.waimai.mach.utils.b.a(cVar.m);
                    }
                    aVar.a("load_bundle_start");
                    h a2 = b.this.a(cVar.a(), cVar.s, cVar.j, cVar.t);
                    aVar.a("load_bundle_end");
                    if (a2 == null) {
                        this.e.a(cVar, new C1020b(101));
                        this.e.a();
                    } else {
                        cVar.a(a2);
                        cVar.j();
                        Mach k = cVar.k();
                        k.setBiz(cVar.p);
                        k.setModuleId(cVar.j);
                        k.setReRenderListener(cVar.w);
                        k.initWithBundle(this.d.get(), a2.c);
                        k.loadTemplate(cVar.a(), a2.b);
                        k.preRenderTemplate(cVar, this.f, this.e, aVar);
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d implements Runnable {
        public static ChangeQuickRedirect a;
        private com.sankuai.waimai.mach.recycler.c c;
        private WeakReference<Activity> d;
        private f e;

        public d(Activity activity, com.sankuai.waimai.mach.recycler.c cVar, f fVar) {
            Object[] objArr = {b.this, activity, cVar, fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd092c0ff2b25b0088f7f4b2fbeaf201", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd092c0ff2b25b0088f7f4b2fbeaf201");
                return;
            }
            this.d = new WeakReference<>(activity);
            this.c = cVar;
            this.e = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f5d4a96440cff66a7ba9bda01058b1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f5d4a96440cff66a7ba9bda01058b1");
            } else if (this.c == null || this.d == null || this.d.get() == null) {
            } else {
                com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a(MonitorManager.MACH_LIST_RECORD_START(this.c.a()));
                if (TextUtils.isEmpty(this.c.m) && this.c.l == null) {
                    this.e.a(this.c, new C1020b(101));
                    this.e.a();
                    return;
                }
                if (this.c.l == null) {
                    this.c.l = com.sankuai.waimai.mach.utils.b.a(this.c.m);
                }
                aVar.a("load_bundle_start");
                h a2 = b.this.a(this.c.a(), this.c.s, this.c.j, this.c.t);
                aVar.a("load_bundle_end");
                if (a2 == null) {
                    this.e.a(this.c, new C1020b(101));
                    this.e.a();
                    return;
                }
                this.c.a(a2);
                this.c.j();
                Mach k = this.c.k();
                k.setBiz(this.c.p);
                k.setModuleId(this.c.j);
                k.setReRenderListener(this.c.w);
                k.initWithBundle(this.d.get(), a2.c);
                k.loadTemplate(this.c.a(), a2.b);
                k.preRenderTemplate(this.c, null, this.e, aVar);
            }
        }
    }

    public final void a(ViewGroup viewGroup, com.sankuai.waimai.mach.recycler.c cVar, com.sankuai.waimai.mach.recycler.c cVar2) {
        Object[] objArr = {viewGroup, cVar, cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d5b5bb900daf64d778311c1036cdf79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d5b5bb900daf64d778311c1036cdf79");
        } else if (viewGroup == null || cVar == null || cVar.l() == null) {
        } else {
            cVar.g();
            cVar.l().continueRenderWithReuseRenderNodeTree(viewGroup, cVar2 != null ? cVar2.b() : null, null);
        }
    }

    private void c(com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799b112c66ea2d0d6e197e7a147090a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799b112c66ea2d0d6e197e7a147090a9");
        } else if (cVar == null || cVar.l() == null) {
        } else {
            cVar.l().cleanContainerView();
        }
    }

    public final boolean a(com.sankuai.waimai.mach.recycler.c cVar) {
        Set<WeakReference<com.sankuai.waimai.mach.recycler.c>> set;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85749135d216e2ced4cd7c7e727a92a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85749135d216e2ced4cd7c7e727a92a7")).booleanValue();
        }
        if (cVar == null || TextUtils.isEmpty(cVar.a()) || (set = this.e.get(cVar.a())) == null) {
            return false;
        }
        WeakReference<com.sankuai.waimai.mach.recycler.c> weakReference = null;
        Iterator<WeakReference<com.sankuai.waimai.mach.recycler.c>> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference<com.sankuai.waimai.mach.recycler.c> next = it.next();
            if (next != null && next.get() == cVar) {
                weakReference = next;
                break;
            }
        }
        if (weakReference == null) {
            return false;
        }
        return set.remove(weakReference);
    }

    @MainThread
    public final void b(com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb01075897d03ad9877d5108ccbcc94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb01075897d03ad9877d5108ccbcc94");
        } else if (cVar == null || TextUtils.isEmpty(cVar.a()) || cVar.r <= 0) {
        } else {
            cVar.h();
            if (cVar.r == 0) {
                c(cVar);
                Set<WeakReference<com.sankuai.waimai.mach.recycler.c>> set = this.e.get(cVar.a());
                if (set == null) {
                    set = new HashSet<>();
                    this.e.put(cVar.a(), set);
                }
                set.add(new WeakReference<>(cVar));
            }
        }
    }

    @MainThread
    public final com.sankuai.waimai.mach.recycler.c a(String str) {
        com.sankuai.waimai.mach.recycler.c cVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cac3d2f596d07685f72ed475635fb95c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cac3d2f596d07685f72ed475635fb95c");
        }
        WeakReference<com.sankuai.waimai.mach.recycler.c> weakReference = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Set<WeakReference<com.sankuai.waimai.mach.recycler.c>> set = this.e.get(str);
        LinkedList linkedList = new LinkedList();
        if (set == null || set.size() <= 0) {
            return null;
        }
        Iterator<WeakReference<com.sankuai.waimai.mach.recycler.c>> it = set.iterator();
        if (it != null) {
            while (it.hasNext()) {
                WeakReference<com.sankuai.waimai.mach.recycler.c> next = it.next();
                if (next == null || next.get() == null) {
                    linkedList.add(next);
                } else {
                    cVar = next.get();
                    if (cVar.q) {
                        linkedList.add(next);
                    } else if (cVar != null) {
                        weakReference = next;
                        break;
                    }
                }
            }
        }
        cVar = null;
        if (weakReference != null) {
            set.remove(weakReference);
        }
        if (linkedList.size() > 0) {
            set.removeAll(linkedList);
        }
        return cVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f78dd1f95f06ace97b694d6de3e9cd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f78dd1f95f06ace97b694d6de3e9cd8");
            return;
        }
        try {
            this.b.clear();
            this.e.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public com.sankuai.waimai.mach.manager.cache.e a;

        public a() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class f {
        public static ChangeQuickRedirect a;
        int b;
        int c;
        c d;
        Map<com.sankuai.waimai.mach.recycler.c, C1020b> e;
        com.sankuai.waimai.mach.model.data.a f;
        private Handler g;

        public f(int i, c cVar) {
            Object[] objArr = {Integer.valueOf(i), cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bee557cd6cdc4a8295406e7ca3616b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bee557cd6cdc4a8295406e7ca3616b6");
                return;
            }
            this.b = 0;
            this.e = new HashMap();
            this.g = new Handler(Looper.getMainLooper());
            this.c = i;
            this.d = cVar;
            this.f = new com.sankuai.waimai.mach.model.data.a("mach_prerender");
            this.f.a("mach_prerender_start");
        }

        public final synchronized void a(com.sankuai.waimai.mach.recycler.c cVar, C1020b c1020b) {
            Object[] objArr = {cVar, c1020b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d38eb4885ef869fe2c47b64e22b5a820", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d38eb4885ef869fe2c47b64e22b5a820");
            } else {
                this.e.put(cVar, c1020b);
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96718c31e6183b38ca652ac36dbd90e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96718c31e6183b38ca652ac36dbd90e4");
            } else {
                this.g.post(new Runnable() { // from class: com.sankuai.waimai.mach.recycler.b.f.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10a49289db7272b23b075efc471712cd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10a49289db7272b23b075efc471712cd");
                            return;
                        }
                        f fVar = f.this;
                        int i = fVar.b + 1;
                        fVar.b = i;
                        if (i < f.this.c || f.this.d == null) {
                            return;
                        }
                        f.this.d.a(f.this.e);
                        f.this.f.a("mach_prerender_end");
                        MonitorManager.RECORD_END(f.this.f);
                    }
                });
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.recycler.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1020b {
        public static ChangeQuickRedirect a;
        private int b;

        public C1020b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72e27bc2aad02166ad7fe8d8be39ee6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72e27bc2aad02166ad7fe8d8be39ee6");
            } else {
                this.b = i;
            }
        }
    }
}
