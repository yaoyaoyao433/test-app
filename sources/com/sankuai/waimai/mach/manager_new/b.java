package com.sankuai.waimai.mach.manager_new;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.httpdns.x;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.common.DevSettings;
import com.sankuai.waimai.mach.common.h;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.manager.a;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.cache.d;
import com.sankuai.waimai.mach.manager.download.exception.DownloadException;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import com.sankuai.waimai.mach.manager.download.update.UpdateResponse;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import com.sankuai.waimai.mach.manager_new.common.e;
import com.sankuai.waimai.mach.manager_new.common.g;
import com.sankuai.waimai.mach.manager_new.config._BundleConfigRecord;
import com.sankuai.waimai.mach.manager_new.config.a;
import com.sankuai.waimai.mach.manager_new.config.b;
import com.sankuai.waimai.mach.manager_new.config.c;
import com.sankuai.waimai.mach.manager_new.download.PresetLoadException;
import com.sankuai.waimai.mach.manager_new.ioq.f;
import com.sankuai.waimai.mach.manager_new.ioq.j;
import com.sankuai.waimai.machpro.bundle.b;
import com.squareup.okhttp.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b implements com.sankuai.waimai.mach.manager_new.download.e, e, com.sankuai.waimai.mach.manager_new.ioq.d {
    public static ChangeQuickRedirect a;
    private static volatile b h;
    public volatile boolean b;
    public com.sankuai.waimai.mach.manager_new.config.a c;
    public boolean d;
    public ConcurrentHashMap<String, Boolean> e;
    public Set<String> f;
    public List<a> g;
    private com.sankuai.waimai.mach.manager_new.download.d i;
    private com.sankuai.waimai.mach.manager_new.download.c j;
    private com.sankuai.waimai.mach.manager_new.ioq.c k;
    private final Object l;
    private volatile MonitorManager m;
    private int n;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<com.sankuai.waimai.mach.manager_new.a>> o;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<com.sankuai.waimai.mach.manager_new.a>> p;
    private ConcurrentHashMap<C1016b, CopyOnWriteArrayList<com.sankuai.waimai.mach.manager_new.a>> q;
    private ConcurrentHashMap<String, Boolean> r;
    private final Set<String> s;
    private final Set<String> t;
    private final Set<String> u;
    private final ConcurrentHashMap<String, Boolean> v;
    private final ConcurrentHashMap<String, List<C1016b>> w;
    private boolean x;
    private Map<String, Long> y;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ com.sankuai.waimai.mach.manager.cache.b a(b bVar, BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "cacaf1d087694ab086ebdc88b8aed5c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager.cache.b) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "cacaf1d087694ab086ebdc88b8aed5c3");
        }
        String a2 = com.sankuai.waimai.mach.manager_new.common.a.a(bundleInfo.getMachId());
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String[] split = a2.split("@");
        if (split.length == 2) {
            BundleInfo bundleInfo2 = new BundleInfo();
            bundleInfo2.setMachId(bundleInfo.getMachId());
            bundleInfo2.setBundleName(bundleInfo.getName());
            bundleInfo2.setBundleVersion(split[1]);
            bundleInfo2.setVersion(split[1]);
            if (d.a().a(a2) == c.b) {
                d.a().a(a2, bundleInfo2);
            }
            d.a().a(a2, 3);
            return bVar.a(bundleInfo2, false);
        }
        return null;
    }

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.mach.manager.load.b bVar2, final String str, final String str2, final String str3, final BundleInfo bundleInfo, final long j, String str4, final a.InterfaceC1013a interfaceC1013a) {
        Object[] objArr = {bVar2, str, str2, str3, bundleInfo, new Long(j), str4, interfaceC1013a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "0f46a81cb70829f9a72bf244f3a945d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "0f46a81cb70829f9a72bf244f3a945d1");
            return;
        }
        bVar.h(str4);
        if (com.sankuai.waimai.mach.manager_new.common.a.c(bundleInfo)) {
            if (interfaceC1013a != null) {
                interfaceC1013a.a(bVar.a(bVar2));
                return;
            }
            return;
        }
        com.sankuai.waimai.mach.manager_new.monitor.a.a(bVar.b(), str, str2, str3, bundleInfo.getVersion(), j, com.sankuai.waimai.mach.manager_new.monitor.b.a(bVar2.b));
        if (TextUtils.isEmpty(str3)) {
            com.sankuai.waimai.mach.manager_new.common.c.b("asyncLoadBundleById | 预置模板设置为空 | " + str3 + " | " + str);
            com.sankuai.waimai.mach.manager_new.monitor.a.b(bVar.b(), str, str2, bundleInfo.getMachId(), str3, bundleInfo.getVersion(), j, com.sankuai.waimai.mach.manager_new.monitor.b.a(bVar2.b), 0);
            if (bVar2.b() == 17808) {
                com.sankuai.waimai.mach.manager_new.monitor.a.a(str4, m.q(), SystemClock.elapsedRealtime() - j, bVar.a(str4, j));
            }
            if (interfaceC1013a != null) {
                interfaceC1013a.a(new CacheException(bVar2.b()));
                return;
            }
            return;
        }
        final int a2 = com.sankuai.waimai.mach.manager_new.monitor.b.a(bVar2.b);
        Object[] objArr2 = {bundleInfo, str3, str, str2, new Long(j), Integer.valueOf(a2), interfaceC1013a};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "88a157707130d080bad19e2ac3d025c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "88a157707130d080bad19e2ac3d025c2");
        } else {
            com.sankuai.waimai.mach.manager_new.common.e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.b.17
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager_new.common.e.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d92c89d7983d02d5c26733adeafbd2c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d92c89d7983d02d5c26733adeafbd2c1");
                        return;
                    }
                    com.sankuai.waimai.mach.manager.cache.b e = b.this.e(str3);
                    final com.sankuai.waimai.mach.manager.cache.e eVar = e.a;
                    if (eVar == null) {
                        com.sankuai.waimai.mach.manager_new.monitor.a.b(b.this.b(), str, str2, str3, AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION, j, a2, e.c);
                        com.sankuai.waimai.mach.manager_new.monitor.a.b(b.this.b(), str, str2, bundleInfo.getMachId(), str3, bundleInfo.getVersion(), j, a2, e.c);
                        Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.17.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00f21c0ca9c3d4ae4e9823f5712dec82", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00f21c0ca9c3d4ae4e9823f5712dec82");
                                    return;
                                }
                                try {
                                    if (interfaceC1013a != null) {
                                        interfaceC1013a.a(new CacheException(17807));
                                    }
                                } catch (Exception e2) {
                                    if (i.a().h()) {
                                        e2.printStackTrace();
                                    }
                                }
                            }
                        });
                        return;
                    }
                    eVar.p = false;
                    com.sankuai.waimai.mach.manager_new.monitor.a.b(b.this.b(), str, str2, str3, eVar.a(), j, a2);
                    Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.17.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "be70dfc0ecaf1aded2d360a4d5c7bd0e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "be70dfc0ecaf1aded2d360a4d5c7bd0e");
                                return;
                            }
                            try {
                                if (interfaceC1013a != null) {
                                    interfaceC1013a.a(eVar);
                                }
                            } catch (Exception e2) {
                                if (i.a().h()) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    });
                }
            }, "mach_async_load_preset");
        }
    }

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.mach.manager_new.config.b bVar2) {
        boolean z;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "1123516daec071ed880b2c6e3de70ad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "1123516daec071ed880b2c6e3de70ad8");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.manager_new.config.b.a;
        if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "1caa9ec6b7be03de299c481809c5a64e", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "1caa9ec6b7be03de299c481809c5a64e")).booleanValue();
        } else {
            z = bVar2.e == null || bVar2.e.isEmpty();
        }
        if (!z) {
            List<b.a> list = bVar2.e;
            for (int i = 0; i < list.size(); i++) {
                b.a aVar = list.get(i);
                if (aVar.b == com.sankuai.waimai.mach.manager_new.config.b.b) {
                    if (com.sankuai.waimai.mach.manager_new.common.a.d(aVar.c)) {
                        bVar.i.c(aVar.c.getMachId());
                    }
                    d.a().a(aVar.c);
                } else if (aVar.b == com.sankuai.waimai.mach.manager_new.config.b.d) {
                    bVar.k.a(aVar.c, f.i);
                } else if (aVar.b == com.sankuai.waimai.mach.manager_new.config.b.c) {
                    if (com.sankuai.waimai.mach.manager_new.common.a.d(aVar.c)) {
                        bVar.i.c(aVar.c.getMachId());
                        com.sankuai.waimai.mach.manager_new.ioq.c cVar = bVar.k;
                        BundleInfo bundleInfo = aVar.c;
                        Object[] objArr3 = {bundleInfo};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.manager_new.ioq.c.a;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "f5884fdc25c4ac992400d4e08bfeee89", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "f5884fdc25c4ac992400d4e08bfeee89");
                        } else {
                            j jVar = new j();
                            jVar.b = bundleInfo;
                            cVar.a(new com.sankuai.waimai.machpro.bundle.a(jVar));
                        }
                    }
                    d.a().a(aVar.c);
                    bVar.j.a(aVar.c);
                }
            }
        }
        bVar.c();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "e3e29d1421d1c4e8d572b2106c316232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "e3e29d1421d1c4e8d572b2106c316232");
        } else {
            com.sankuai.waimai.mach.manager_new.common.e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.b.23
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager_new.common.e.a
                public final void a() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3e1d8eec17243883a4cba7e5d5b4ff19", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3e1d8eec17243883a4cba7e5d5b4ff19");
                        return;
                    }
                    for (String str : b.this.s) {
                        b.this.a("waimai", str);
                    }
                }
            }, "download_trigger_tag");
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "ad08a3aa3b804a60fcfc000ce57ced89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "ad08a3aa3b804a60fcfc000ce57ced89");
        } else {
            com.sankuai.waimai.mach.manager_new.common.e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.b.24
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager_new.common.e.a
                public final void a() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7d8ef281bae8a36875799379308b8f01", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7d8ef281bae8a36875799379308b8f01");
                        return;
                    }
                    synchronized (b.this.t) {
                        for (String str : b.this.t) {
                            BundleInfo a2 = b.this.c.a(str);
                            if (a2 != null) {
                                b.this.j.a(a2);
                            } else {
                                try {
                                    b.this.a((List) b.this.p.remove(a2.getMachId()), new CacheException(17807));
                                } catch (Exception unused) {
                                }
                            }
                        }
                        b.this.t.clear();
                    }
                    b.this.d();
                }
            }, "downloadPendingTemplates");
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "3e72723699236a2a9d67d1f6a9387cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "3e72723699236a2a9d67d1f6a9387cb4");
        } else {
            for (String str : bVar.v.keySet()) {
                BundleInfo a2 = bVar.c.a(str);
                if (a2 == null) {
                    CopyOnWriteArrayList<com.sankuai.waimai.mach.manager_new.a> remove = bVar.p.remove(str);
                    if (remove != null && remove.size() > 0) {
                        for (com.sankuai.waimai.mach.manager_new.a aVar2 : remove) {
                            if (aVar2 != null && aVar2.a != null) {
                                aVar2.a.a(new com.sankuai.waimai.mach.manager.load.b(new CacheException(17809)));
                            }
                        }
                    } else {
                        LinkedList<C1016b> linkedList = new LinkedList();
                        for (C1016b c1016b : bVar.q.keySet()) {
                            if (c1016b != null && TextUtils.equals(str, c1016b.c)) {
                                Iterator<com.sankuai.waimai.mach.manager_new.a> it = bVar.q.get(c1016b).iterator();
                                while (it.hasNext()) {
                                    com.sankuai.waimai.mach.manager_new.a next = it.next();
                                    if (next != null && next.a != null) {
                                        next.a.a(new com.sankuai.waimai.mach.manager.load.b(new CacheException(17809)));
                                    }
                                }
                                linkedList.add(c1016b);
                            }
                        }
                        for (C1016b c1016b2 : linkedList) {
                            bVar.q.remove(c1016b2);
                        }
                    }
                } else {
                    bVar.j.a(a2);
                    bVar.r.put(a2.getMachId(), Boolean.TRUE);
                }
            }
            bVar.v.clear();
            bVar.d();
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "6b9030595f62d4c528325d64a9b42205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "6b9030595f62d4c528325d64a9b42205");
            return;
        }
        bVar.n++;
        if (bVar.n == 3) {
            com.sankuai.waimai.mach.manager_new.ioq.c cVar2 = bVar.k;
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.mach.manager_new.ioq.c.a;
            if (PatchProxy.isSupport(objArr8, cVar2, changeQuickRedirect8, false, "0995ef07c17f9bb2ee27366d87dedaa3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, cVar2, changeQuickRedirect8, false, "0995ef07c17f9bb2ee27366d87dedaa3");
            } else {
                cVar2.a(new com.sankuai.waimai.mach.manager_new.ioq.e(new j()));
            }
        }
    }

    public static /* synthetic */ void a(b bVar, String str, C1016b c1016b) {
        Object[] objArr = {str, c1016b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "6be69a37c10c3cff15641db354169ddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "6be69a37c10c3cff15641db354169ddd");
            return;
        }
        List<C1016b> list = bVar.w.get(str);
        if (list != null) {
            list.remove(c1016b);
            if (list.size() <= 0) {
                bVar.w.remove(str);
            }
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.x = true;
        return true;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e54b5fa2e2151765d59bd9bfd5654e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e54b5fa2e2151765d59bd9bfd5654e");
            return;
        }
        this.b = false;
        this.l = new Object();
        this.q = new ConcurrentHashMap<>();
        this.r = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap<>();
        this.s = new CopyOnWriteArraySet();
        this.t = new CopyOnWriteArraySet();
        this.u = new HashSet();
        this.v = new ConcurrentHashMap<>();
        this.w = new ConcurrentHashMap<>();
        this.f = new HashSet();
        this.g = new ArrayList();
        this.y = new ConcurrentHashMap();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0edfc0ecae4ecedab9aaa82e2bae4156", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0edfc0ecae4ecedab9aaa82e2bae4156");
        }
        if (h == null) {
            synchronized (b.class) {
                if (h == null) {
                    h = new b();
                }
            }
        }
        return h;
    }

    public final MonitorManager b() {
        MonitorManager monitorManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7116c2cf25f90ae732fe8760ebe34923", RobustBitConfig.DEFAULT_VALUE)) {
            return (MonitorManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7116c2cf25f90ae732fe8760ebe34923");
        }
        synchronized (this.l) {
            if (this.m == null) {
                this.m = new MonitorManager();
            }
            monitorManager = this.m;
        }
        return monitorManager;
    }

    public final synchronized void a(Context context, final h hVar, com.sankuai.waimai.mach.model.data.a aVar) {
        boolean z;
        boolean z2;
        Object[] objArr = {context, hVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e82872b1a2c48d58d10ed3e9889550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e82872b1a2c48d58d10ed3e9889550");
        } else if (this.b) {
            com.sankuai.waimai.mach.manager_new.common.c.b("sdk have initialized.....");
        } else {
            com.sankuai.waimai.mach.manager_new.common.c.a("bundle-manager-init");
            com.sankuai.waimai.mach.manager_new.common.c.e("bundle init");
            this.b = true;
            this.o = new ConcurrentHashMap<>();
            this.p = new ConcurrentHashMap<>();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            _BundleConfigRecord _bundleconfigrecord = null;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3146155ceb63d89f4d1fbae662c09b9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3146155ceb63d89f4d1fbae662c09b9d");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a59e4da7265f5534ef2d5492334955d3", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a59e4da7265f5534ef2d5492334955d3")).booleanValue();
                } else {
                    if (l.a(com.meituan.android.singleton.b.a, "mach_assistant", "local_server_enable", false)) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = l.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "af34534908d47e9941986fd1db6c7102", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "af34534908d47e9941986fd1db6c7102")).booleanValue();
                        } else {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = l.a;
                            if (!TextUtils.isEmpty(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "19de303a3cb9003ef5bd4e7a342892f9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "19de303a3cb9003ef5bd4e7a342892f9") : l.a(com.meituan.android.singleton.b.a, "mach_assistant", "templateId", ""))) {
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = l.a;
                                if (!TextUtils.isEmpty(PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "7e8bc41e173eff3b31d8a6c4c9ea0cd8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "7e8bc41e173eff3b31d8a6c4c9ea0cd8") : l.a(com.meituan.android.singleton.b.a, "mach_assistant", "url", ""))) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        if (z2) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    try {
                        Class.forName("com.sankuai.waimai.mach.assistant.LocalServerBundleManager").getMethod("setLocalServerEnable", Boolean.TYPE).invoke(null, Boolean.TRUE);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            com.sankuai.waimai.mach.manager_new.common.c.a("bundle-config-init");
            com.sankuai.waimai.mach.manager_new.common.c.e("init config center");
            this.c = new com.sankuai.waimai.mach.manager_new.config.a();
            final com.sankuai.waimai.mach.manager_new.config.a aVar2 = this.c;
            Object[] objArr7 = {context, hVar};
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.mach.manager_new.config.a.a;
            if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "d00adc683644558f89585c49df6f9430", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "d00adc683644558f89585c49df6f9430");
            } else {
                aVar2.d = new a.c(context, hVar);
                aVar2.b = new com.sankuai.waimai.mach.manager_new.config.c(aVar2);
                if (com.sankuai.waimai.mach.utils.e.a()) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.config.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "0e8714d5616323bd4213b3cec07dc5f2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "0e8714d5616323bd4213b3cec07dc5f2");
                            } else {
                                a.this.a(hVar);
                            }
                        }
                    }, 200L);
                } else {
                    aVar2.a(hVar);
                }
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.mach.manager_new.config.a.a;
                if (PatchProxy.isSupport(objArr8, aVar2, changeQuickRedirect8, false, "7777bb4a31a33f89bc4424680a197b97", RobustBitConfig.DEFAULT_VALUE)) {
                    _bundleconfigrecord = (_BundleConfigRecord) PatchProxy.accessDispatch(objArr8, aVar2, changeQuickRedirect8, false, "7777bb4a31a33f89bc4424680a197b97");
                } else {
                    List<BundleInfo> b = aVar2.d.b();
                    if (b == null) {
                        UpdateResponse a2 = aVar2.d.a();
                        if (a2 != null && a2.body != null && !com.sankuai.waimai.mach.utils.e.a(a2.body.getBundleList())) {
                            b = a2.body.getBundleList();
                            com.sankuai.waimai.mach.manager_new.common.c.e("checkupdate-v1.0读取配置文件");
                        }
                    } else {
                        com.sankuai.waimai.mach.manager_new.common.c.e("checkupdate-v2.0读取配置文件");
                    }
                    if (!com.sankuai.waimai.mach.utils.e.a(b)) {
                        _bundleconfigrecord = new _BundleConfigRecord();
                        _bundleconfigrecord.setLocalBundle(b);
                    }
                }
                aVar2.c = _bundleconfigrecord;
            }
            this.c.e = new a.b() { // from class: com.sankuai.waimai.mach.manager_new.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager_new.config.a.b
                public final void a(com.sankuai.waimai.mach.manager_new.config.b bVar) {
                    Object[] objArr9 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "158912af0baaa7bc764caf8d56f12340", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "158912af0baaa7bc764caf8d56f12340");
                        return;
                    }
                    com.sankuai.waimai.mach.manager_new.common.c.c("handler config center callback");
                    b.a(b.this, bVar);
                    if (b.this.x) {
                        return;
                    }
                    b.a(b.this, true);
                }
            };
            aVar.a("mach_init_v2_init_config");
            com.sankuai.waimai.mach.manager_new.common.c.a();
            com.sankuai.waimai.mach.manager_new.common.c.e("init runtime info");
            a(this.c.c());
            aVar.a("mach_init_v2_init_runtime");
            com.sankuai.waimai.mach.manager_new.common.c.a("bundle-storage-init");
            com.sankuai.waimai.mach.manager_new.common.c.e("init ioqueue");
            this.k = new com.sankuai.waimai.mach.manager_new.ioq.c(this);
            this.i = new com.sankuai.waimai.mach.manager_new.download.d(context, hVar, this.k);
            final com.sankuai.waimai.mach.manager_new.download.d dVar = this.i;
            com.sankuai.waimai.mach.manager_new.config.a aVar3 = this.c;
            Object[] objArr9 = {aVar3};
            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.mach.manager_new.download.d.a;
            if (PatchProxy.isSupport(objArr9, dVar, changeQuickRedirect9, false, "8f12d20050341a87afce2774eb67f6c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, dVar, changeQuickRedirect9, false, "8f12d20050341a87afce2774eb67f6c9");
            } else {
                dVar.b = aVar3;
                Object[] objArr10 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.mach.manager_new.download.d.a;
                if (PatchProxy.isSupport(objArr10, dVar, changeQuickRedirect10, false, "5640feacccce16ab57ee7f5a4634e4cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, dVar, changeQuickRedirect10, false, "5640feacccce16ab57ee7f5a4634e4cf");
                } else {
                    com.sankuai.waimai.mach.manager_new.common.e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.download.d.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.manager_new.common.e.a
                        public final void a() {
                            Object[] objArr11 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect11 = a;
                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "65abb76e2b59435cf5075be3733f3628", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "65abb76e2b59435cf5075be3733f3628");
                                return;
                            }
                            com.sankuai.waimai.mach.manager_new.common.c.e("标记开始");
                            com.sankuai.waimai.mach.manager_new.common.c.a("bundle-archive-walk");
                            d.this.b.d();
                            com.sankuai.waimai.mach.manager_new.common.c.a();
                            com.sankuai.waimai.mach.manager_new.common.c.e("标记完成");
                        }
                    }, "MACH_BUNDLE_SYNC_ARCHIVE");
                }
            }
            aVar.a("mach_init_v2_init_storage");
            com.sankuai.waimai.mach.manager_new.common.c.a();
            com.sankuai.waimai.mach.manager_new.common.c.e("init download manager");
            this.j = new com.sankuai.waimai.mach.manager_new.download.c(context, this.k, this);
            aVar.a("mach_init_v2_init_download");
            c();
            aVar.a("mach_init_v2_init_other");
            com.sankuai.waimai.mach.manager_new.common.c.e("finish init");
            com.sankuai.waimai.mach.manager_new.common.c.a();
            for (a aVar4 : this.g) {
                aVar4.a();
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5179c38d97c7344ddaaed3b845bb277e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5179c38d97c7344ddaaed3b845bb277e");
        } else {
            com.sankuai.waimai.mach.manager_new.common.e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.b.12
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager_new.common.e.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b242bc04e8321a8fe1848edf3a770d91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b242bc04e8321a8fe1848edf3a770d91");
                        return;
                    }
                    b.this.a("waimai", "waimai-right-now");
                    if (!"waimai".equals(i.a().g().p) || m.h()) {
                        return;
                    }
                    com.sankuai.waimai.mach.manager_new.common.c.e("isExtractDownloadHomepageTemplate false");
                    com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-homepage");
                }
            }, "mach_warm_tag");
        }
    }

    private void a(@Nullable _BundleConfigRecord _bundleconfigrecord) {
        Object[] objArr = {_bundleconfigrecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f904f7cc048c9f6295250fe1d72afba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f904f7cc048c9f6295250fe1d72afba9");
        } else if (_bundleconfigrecord == null) {
            com.sankuai.waimai.mach.manager_new.common.c.b("本地配置记录为空......");
        } else {
            List<BundleInfo> localBundle = _bundleconfigrecord.getLocalBundle();
            for (int i = 0; i < localBundle.size(); i++) {
                d.a().a(localBundle.get(i));
            }
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "915a7a18b1a75874a4608b5f74d9de14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "915a7a18b1a75874a4608b5f74d9de14");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.e("downloadTemplateByTag | tag | " + str2);
        List<BundleInfo> b = this.c.b(str2);
        if (!com.sankuai.waimai.mach.utils.e.a(b) && this.j != null) {
            this.j.a(b);
            d();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.s.add(str2);
    }

    @Override // com.sankuai.waimai.mach.manager_new.e
    @Nullable
    public final com.sankuai.waimai.mach.manager.cache.e a(String str, String str2, String str3, String str4) {
        String str5;
        boolean z;
        int i;
        com.sankuai.waimai.mach.manager.cache.b bVar;
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a9903085234486382a97382440fb279", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager.cache.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a9903085234486382a97382440fb279");
        }
        Object[] objArr2 = {str, str2, str3, str4, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e61365a39032a5dfcdffb5e3d8b931db", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager.cache.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e61365a39032a5dfcdffb5e3d8b931db");
        }
        if (g.a(str)) {
            if (TextUtils.isEmpty(str)) {
                com.sankuai.waimai.mach.manager_new.common.c.b("syncLoadMachBundle | 参数保护，machId为空");
                return null;
            }
            com.sankuai.waimai.mach.manager_new.common.c.e("syncLoadMachBundle | 同步请求加载 | " + str);
            if (!this.b) {
                com.sankuai.waimai.mach.manager_new.monitor.a.a(str3, str4, str, str2);
                return null;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            BundleInfo a2 = this.c.a(str);
            if (a2 != null) {
                if (i.a().h() && i.a().f.d) {
                    com.sankuai.waimai.mach.manager_new.common.c.e("syncLoadMachBundle | 强制使用预置模板");
                    str5 = str2;
                    i = 0;
                    z = true;
                } else {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33ec8a1b222bef0292e0501ee73c1b3d", RobustBitConfig.DEFAULT_VALUE)) {
                        bVar = (com.sankuai.waimai.mach.manager.cache.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33ec8a1b222bef0292e0501ee73c1b3d");
                    } else {
                        bVar = new com.sankuai.waimai.mach.manager.cache.b();
                        if (!TextUtils.isEmpty(str)) {
                            BundleInfo a3 = this.c.a(str);
                            if (a3 != null) {
                                com.sankuai.waimai.mach.manager.cache.e b = this.i.b(com.sankuai.waimai.mach.manager_new.common.a.b(a3));
                                if (b != null) {
                                    d.a().a(a3, 6);
                                    bVar.a = b;
                                } else if (!a(a3)) {
                                    if (this.j.c(a3)) {
                                        this.j.b(a3);
                                        bVar.b = 3;
                                        com.sankuai.waimai.mach.manager_new.common.c.c(com.sankuai.waimai.mach.manager_new.common.a.b(a3) + " | 同步加载，正在下载");
                                    } else {
                                        com.sankuai.waimai.mach.manager_new.common.c.c(com.sankuai.waimai.mach.manager_new.common.a.b(a3) + " | 同步加载，触发下载");
                                        bVar.b = 4;
                                        this.j.a(a3);
                                        this.j.b(a3);
                                    }
                                    com.sankuai.waimai.mach.manager.cache.b b2 = b(a3, false);
                                    if (b2 != null) {
                                        bVar = b2;
                                    }
                                } else {
                                    bVar = a(a3, false);
                                }
                            } else {
                                bVar.b = 6;
                                com.sankuai.waimai.mach.manager_new.common.c.b("cannot find bundle recode with | " + str);
                            }
                        } else {
                            bVar.b = 0;
                        }
                    }
                    com.sankuai.waimai.mach.manager.cache.e eVar = bVar.a;
                    if (eVar != null) {
                        com.sankuai.waimai.mach.manager_new.monitor.a.a(b(), str3, str4, str, eVar.a(), elapsedRealtime);
                        eVar.p = true;
                        return eVar;
                    }
                    z = true;
                    str5 = str2;
                    com.sankuai.waimai.mach.manager_new.monitor.a.a(b(), str3, str4, str, a2.getVersion(), bVar.b, elapsedRealtime);
                    i = bVar.b;
                }
            } else {
                str5 = str2;
                z = true;
                i = 8;
                com.sankuai.waimai.mach.manager_new.monitor.a.a(b(), str3, str4, str, "0", 8, elapsedRealtime);
            }
            com.sankuai.waimai.mach.manager_new.common.c.e("syncLoadMachBundle | 加载预置模板 | " + str5);
            if (TextUtils.isEmpty(str2)) {
                com.sankuai.waimai.mach.manager_new.monitor.a.a(b(), str3, str4, str, str2, a2 == null ? AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION : a2.getVersion(), elapsedRealtime, i, 0);
                return null;
            }
            com.sankuai.waimai.mach.manager.cache.b e = e(str5);
            com.sankuai.waimai.mach.manager.cache.e eVar2 = e.a;
            if (eVar2 != null) {
                com.sankuai.waimai.mach.manager_new.monitor.a.b(b(), str3, str4, str2, eVar2.a(), i, elapsedRealtime);
                eVar2.p = z;
                return eVar2;
            }
            com.sankuai.waimai.mach.manager_new.monitor.a.a(b(), str3, str4, str2, AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION, elapsedRealtime, i, e.c);
            com.sankuai.waimai.mach.manager_new.monitor.a.a(b(), str3, str4, str, str2, AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION, elapsedRealtime, i, e.c);
            return null;
        }
        return null;
    }

    @Override // com.sankuai.waimai.mach.manager_new.e
    public final void a(String str, String str2, String str3, String str4, a.InterfaceC1013a interfaceC1013a) {
        Object[] objArr = {str, str2, str3, str4, interfaceC1013a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a7a9e8dc5e5c82202ede9578da37130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a7a9e8dc5e5c82202ede9578da37130");
            return;
        }
        Object[] objArr2 = {str, str2, str3, str4, null, interfaceC1013a};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "937c6ed4a595231252f771e0aeb7a6d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "937c6ed4a595231252f771e0aeb7a6d8");
        } else {
            a(str, str2, str3, str4, (BundleInfo) null, 0, interfaceC1013a, (C1016b) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.waimai.mach.manager.cache.b e(String str) {
        int i;
        com.sankuai.waimai.mach.manager.cache.e eVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d90645678f296fb721ceba0653c5b4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager.cache.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d90645678f296fb721ceba0653c5b4c");
        }
        com.sankuai.waimai.mach.manager.cache.b bVar = new com.sankuai.waimai.mach.manager.cache.b();
        com.sankuai.waimai.mach.manager.cache.e e = this.i.e(str);
        if (e != null) {
            com.sankuai.waimai.mach.manager_new.common.c.e("loadPresetDiskBundleWithID | 命中到预置的缓存文件");
            bVar.a = e;
            return bVar;
        }
        try {
            eVar = this.i.a(str);
        } catch (PresetLoadException e2) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = PresetLoadException.a;
            if (!PatchProxy.isSupport(objArr2, e2, changeQuickRedirect2, false, "7b7453fea16b3fb06f952d1ea63dd273", RobustBitConfig.DEFAULT_VALUE)) {
                switch (e2.c) {
                    case 10001:
                        i = 2;
                        break;
                    case 10002:
                        i = 3;
                        break;
                    case 10003:
                        i = 4;
                        break;
                    default:
                        i = 5;
                        break;
                }
            } else {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, e2, changeQuickRedirect2, false, "7b7453fea16b3fb06f952d1ea63dd273")).intValue();
            }
            bVar.c = i;
            eVar = null;
        }
        if (eVar == null) {
            com.sankuai.waimai.mach.manager_new.common.c.c("loadPresetDiskBundleWithID | 加载磁盘预置模板失败 " + str);
        } else {
            com.sankuai.waimai.mach.manager_new.common.c.c("loadPresetDiskBundleWithID | 加载磁盘预置模板成功 " + str);
            bVar.a = eVar;
        }
        return bVar;
    }

    private com.sankuai.waimai.mach.manager.cache.b a(BundleInfo bundleInfo, boolean z) {
        com.sankuai.waimai.mach.manager.cache.e eVar;
        Object[] objArr = {bundleInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888450109decdf56dede154291abbccd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager.cache.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888450109decdf56dede154291abbccd");
        }
        com.sankuai.waimai.mach.manager.cache.b bVar = new com.sankuai.waimai.mach.manager.cache.b();
        com.sankuai.waimai.mach.manager_new.ioq.b a2 = this.k.a(bundleInfo, true);
        FutureTask<T> futureTask = a2.d;
        com.sankuai.waimai.mach.manager.cache.e eVar2 = null;
        com.sankuai.waimai.mach.manager_new.common.c.a("bundle-load-sync-io-task");
        long j = 500;
        try {
            if (z) {
                j = MetricsAnrManager.ANR_THRESHOLD;
            } else {
                try {
                    try {
                        if (m.p() > 500) {
                            j = m.p();
                        }
                    } catch (TimeoutException e) {
                        bVar.b = 7;
                        com.sankuai.waimai.mach.manager_new.common.c.b("同步加载超时 " + e.getMessage());
                    }
                } catch (Exception e2) {
                    bVar.b = 5;
                    com.sankuai.waimai.mach.manager_new.common.c.b("同步加载异常 " + e2.getMessage());
                }
            }
            if (a2 instanceof com.sankuai.waimai.machpro.bundle.b) {
                futureTask.get(j, TimeUnit.MILLISECONDS);
                eVar = ((com.sankuai.waimai.machpro.bundle.b) a2).h;
            } else {
                eVar = (com.sankuai.waimai.mach.manager.cache.e) futureTask.get(j, TimeUnit.MILLISECONDS);
            }
            eVar2 = eVar;
            if (eVar2 != null) {
                eVar2.n = false;
                this.i.a(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo), eVar2);
                d.a().a(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo), 6);
                bVar.a = eVar2;
            }
            return bVar;
        } finally {
            com.sankuai.waimai.mach.manager_new.common.c.a();
        }
    }

    public final List<C1016b> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b649613f9337325d3f4d3dd224d5d448", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b649613f9337325d3f4d3dd224d5d448") : this.w.get(str);
    }

    @Override // com.sankuai.waimai.mach.manager_new.e
    public final void a(final String str, int i, final a.b bVar, com.sankuai.waimai.mach.manager.cache.c cVar, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), bVar, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aab4ebcb633b2a0d518c1cfbbc72c6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aab4ebcb633b2a0d518c1cfbbc72c6f");
            return;
        }
        List<C1016b> list = this.w.get(str);
        if (list == null) {
            list = new LinkedList<>();
            this.w.put(str, list);
        }
        final C1016b c1016b = new C1016b(cVar, str);
        list.add(c1016b);
        final a.b bVar2 = new a.b() { // from class: com.sankuai.waimai.mach.manager_new.b.25
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager.a.b
            public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.c cVar2) {
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e263ae7af3f324e5be1dc4283f6f6c81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e263ae7af3f324e5be1dc4283f6f6c81");
                    return;
                }
                b.a(b.this, str, c1016b);
                if (bVar != null) {
                    bVar.a(cVar2);
                }
            }

            @Override // com.sankuai.waimai.mach.manager.a.b
            public final void a(@NonNull CacheException cacheException) {
                Object[] objArr2 = {cacheException};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bf871bba8519ebcac6045603f0d7544", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bf871bba8519ebcac6045603f0d7544");
                    return;
                }
                b.a(b.this, str, c1016b);
                if (bVar != null) {
                    bVar.a(cacheException);
                }
            }
        };
        Object[] objArr2 = {str, Integer.valueOf(i), bVar2, c1016b, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7119b2bb8fe55b92679f5bfae2c97cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7119b2bb8fe55b92679f5bfae2c97cae");
        } else if (z) {
            a(str, c1016b, bVar2, new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
        } else {
            a(str, (String) null, "", "", (BundleInfo) null, i, new a.InterfaceC1013a() { // from class: com.sankuai.waimai.mach.manager_new.b.26
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull final com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr3 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fd61e53da9f9a590f9df82d241a8ae09", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fd61e53da9f9a590f9df82d241a8ae09");
                    } else {
                        Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.26.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ccce843d3c7d9014869af58044d5fe2d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ccce843d3c7d9014869af58044d5fe2d");
                                } else if (eVar instanceof com.sankuai.waimai.mach.manager.cache.c) {
                                    if (bVar2 != null) {
                                        bVar2.a((com.sankuai.waimai.mach.manager.cache.c) eVar);
                                    }
                                } else {
                                    com.sankuai.waimai.machpro.util.a.a("Mach Pro 子包加载异常！！！" + str);
                                    if (bVar2 != null) {
                                        bVar2.a(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
                                    }
                                }
                            }
                        });
                    }
                }

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull CacheException cacheException) {
                    Object[] objArr3 = {cacheException};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "54190d1509ce8206121e5448a53a2090", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "54190d1509ce8206121e5448a53a2090");
                    } else {
                        b.this.a(str, c1016b, bVar2, cacheException);
                    }
                }
            }, c1016b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C1016b c1016b, final a.b bVar, final CacheException cacheException) {
        Object[] objArr = {str, c1016b, bVar, cacheException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eac2b20711b2be2c093191358e82275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eac2b20711b2be2c093191358e82275");
        } else if (com.sankuai.waimai.machpro.f.a().a(str) == 0) {
            Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.27
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3efa2266d54780435dadb93f00186044", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3efa2266d54780435dadb93f00186044");
                    } else if (bVar != null) {
                        bVar.a(cacheException);
                    }
                }
            });
        } else {
            a(str, c1016b, new a.b() { // from class: com.sankuai.waimai.mach.manager_new.b.28
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager.a.b
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.c cVar) {
                    Object[] objArr2 = {cVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2316cff5d8148cee2986a8f2e02e64b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2316cff5d8148cee2986a8f2e02e64b6");
                    } else if (bVar != null) {
                        bVar.a(cVar);
                    }
                }

                @Override // com.sankuai.waimai.mach.manager.a.b
                public final void a(@NonNull CacheException cacheException2) {
                    Object[] objArr2 = {cacheException2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d66bc09f15cb2ddf9c478389513dc424", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d66bc09f15cb2ddf9c478389513dc424");
                    } else if (cacheException2.c == 17903) {
                        Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.28.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8bf2ec1c7c5076852a5e47c8bab289fd", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8bf2ec1c7c5076852a5e47c8bab289fd");
                                } else if (bVar != null) {
                                    bVar.a(cacheException);
                                }
                            }
                        });
                    } else if (bVar != null) {
                        bVar.a(cacheException2);
                    }
                }
            });
        }
    }

    private void a(final String str, final C1016b c1016b, final a.b bVar) {
        Object[] objArr = {str, c1016b, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dafaa4e04977b23dab133504a2f8b6ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dafaa4e04977b23dab133504a2f8b6ff");
        } else {
            com.sankuai.waimai.mach.manager_new.common.e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.b.29
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager_new.common.e.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9038b8c4a940337d1a61b20d8c8f227f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9038b8c4a940337d1a61b20d8c8f227f");
                        return;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (com.sankuai.waimai.machpro.f.a().a(str) == -1) {
                            com.sankuai.waimai.machpro.f.a().b(str);
                        }
                        if (com.sankuai.waimai.machpro.f.a().a(str) != 1) {
                            if (bVar != null) {
                                bVar.a(new CacheException(17903));
                                return;
                            }
                            return;
                        }
                    }
                    final com.sankuai.waimai.mach.manager.cache.b e = b.this.e(str);
                    final com.sankuai.waimai.mach.manager.cache.e eVar = e.a;
                    if (eVar instanceof com.sankuai.waimai.mach.manager.cache.c) {
                        com.sankuai.waimai.mach.manager.cache.c cVar = (com.sankuai.waimai.mach.manager.cache.c) eVar;
                        com.sankuai.waimai.mach.manager.cache.d dVar = cVar.f;
                        if (dVar != null && dVar.c != null && dVar.c.size() > 0) {
                            for (d.a aVar : dVar.c) {
                                if (c1016b != null && aVar != null && TextUtils.equals(aVar.a, c1016b.a) && com.sankuai.waimai.machpro.util.b.a(aVar.b, c1016b.b) >= 0 && com.sankuai.waimai.machpro.util.b.a(aVar.c, c1016b.b) <= 0 && com.sankuai.waimai.machpro.bundle.b.a(c1016b, cVar.d, eVar.a())) {
                                    Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.29.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1295971187d9453abf3d9f80a1f04d2f", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1295971187d9453abf3d9f80a1f04d2f");
                                                return;
                                            }
                                            try {
                                                com.sankuai.waimai.machpro.util.a.a("子包内置包加载成功～～" + ((com.sankuai.waimai.mach.manager.cache.c) eVar).d);
                                                eVar.n = true;
                                                if (bVar != null) {
                                                    bVar.a((com.sankuai.waimai.mach.manager.cache.c) eVar);
                                                }
                                            } catch (Exception e2) {
                                                if (i.a().h()) {
                                                    e2.printStackTrace();
                                                }
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                        Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.29.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b4b46ff5f3373ae9512354ebec47b64", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b4b46ff5f3373ae9512354ebec47b64");
                                    return;
                                }
                                com.sankuai.waimai.machpro.util.a.a("内置子包，匹配失败！！！" + ((com.sankuai.waimai.mach.manager.cache.c) eVar).d);
                                if (bVar != null) {
                                    bVar.a(new CacheException(17901));
                                }
                            }
                        });
                        return;
                    }
                    Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.29.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f2c676c9fd287b9654db41fd35a5b140", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f2c676c9fd287b9654db41fd35a5b140");
                                return;
                            }
                            try {
                                com.sankuai.waimai.machpro.util.a.a("加载内置子包失败！！！" + str);
                                if (bVar != null) {
                                    bVar.a(new CacheException(e.c));
                                }
                            } catch (Exception e2) {
                                if (i.a().h()) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    });
                }
            }, "loadMachProSubPresetBundle");
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.e
    public final void a(final String str, final String str2, final String str3, final String str4, final int i, final boolean z, boolean z2, final a.b bVar) {
        Object[] objArr = {str, str2, str3, str4, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0edb97d81071577b5cc14a62cbd4f855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0edb97d81071577b5cc14a62cbd4f855");
        } else if (z2) {
            a(str, str3, bVar, new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
        } else {
            BundleInfo a2 = this.c.a(str);
            if (TextUtils.isEmpty(str3) || a2 == null || com.sankuai.waimai.machpro.util.b.a(str3, a2.getBundleVersion()) != 1) {
                a(str, str2, str4, str3, i, z, bVar);
                return;
            }
            com.sankuai.waimai.mach.manager_new.config.a aVar = this.c;
            c.b bVar2 = new c.b() { // from class: com.sankuai.waimai.mach.manager_new.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager_new.config.c.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f9f73e836ced81cccabfa79c981a0d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f9f73e836ced81cccabfa79c981a0d3");
                        return;
                    }
                    BundleInfo a3 = b.this.c.a(str);
                    if (a3 != null && com.sankuai.waimai.machpro.util.b.a(str3, a3.getBundleVersion()) != 1) {
                        b.this.a(str, str2, str4, str3, i, z, bVar);
                    } else {
                        Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.2.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ed73e8e577938810caab849fef105ba", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ed73e8e577938810caab849fef105ba");
                                } else if (bVar != null) {
                                    bVar.a(new CacheException(17902));
                                }
                            }
                        });
                    }
                }

                @Override // com.sankuai.waimai.mach.manager_new.config.c.b
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "436937bc6b642b79d3c2bd8a9d254877", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "436937bc6b642b79d3c2bd8a9d254877");
                    } else {
                        b.this.a(str, str3, bVar, new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
                    }
                }
            };
            Object[] objArr2 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.manager_new.config.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1b0d0e45ce241f1ae7a515e6c522b7f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1b0d0e45ce241f1ae7a515e6c522b7f4");
            } else {
                aVar.b.a(bVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, final a.b bVar, final CacheException cacheException) {
        Object[] objArr = {str, str2, bVar, cacheException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "967ffe1b6a636bf76a1f9f435517e06e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "967ffe1b6a636bf76a1f9f435517e06e");
        } else if (com.sankuai.waimai.machpro.f.a().a(str) == 0) {
            Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a20f12675148c613496f3afc9600cb04", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a20f12675148c613496f3afc9600cb04");
                    } else if (bVar != null) {
                        bVar.a(cacheException);
                    }
                }
            });
        } else {
            a(str, str, str2, bVar, cacheException);
        }
    }

    private void a(final BundleInfo bundleInfo, final a.b bVar) {
        Object[] objArr = {bundleInfo, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f22c6494c3be3470be4ca7bc7fab3092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f22c6494c3be3470be4ca7bc7fab3092");
        } else {
            com.sankuai.waimai.mach.manager_new.common.e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.b.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager_new.common.e.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2f292cc1c1808f0a415506dc9aa16da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2f292cc1c1808f0a415506dc9aa16da");
                        return;
                    }
                    com.sankuai.waimai.mach.manager.cache.b a2 = b.a(b.this, bundleInfo);
                    if (a2 != null && (a2.a instanceof com.sankuai.waimai.mach.manager.cache.c)) {
                        com.sankuai.waimai.mach.manager.cache.c cVar = (com.sankuai.waimai.mach.manager.cache.c) a2.a;
                        cVar.p = false;
                        if (bVar != null) {
                            bVar.a(cVar);
                        }
                    } else if (bVar != null) {
                        int i = com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR;
                        if (a2 != null) {
                            i = a2.b;
                        }
                        bVar.a(new CacheException(i));
                    }
                }
            }, "loadMachProOldBundleByCacheParams");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final String str2, final String str3, final String str4, final int i, boolean z, final a.b bVar) {
        Object[] objArr = {str, str2, str3, str4, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76373f11eea5d11cc7fe8d3046c7de4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76373f11eea5d11cc7fe8d3046c7de4b");
            return;
        }
        final a.InterfaceC1013a interfaceC1013a = new a.InterfaceC1013a() { // from class: com.sankuai.waimai.mach.manager_new.b.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
            public final void a(@NonNull final com.sankuai.waimai.mach.manager.cache.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3e514c3e32781d16595ca36df89adb4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3e514c3e32781d16595ca36df89adb4");
                } else {
                    Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9824b1d768f204fe20f9e7ecc067389b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9824b1d768f204fe20f9e7ecc067389b");
                            } else if (eVar instanceof com.sankuai.waimai.mach.manager.cache.c) {
                                if (bVar != null) {
                                    if (!TextUtils.isEmpty(str4) && com.sankuai.waimai.machpro.util.b.a(str4, eVar.a()) == 1) {
                                        bVar.a(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
                                    } else {
                                        bVar.a((com.sankuai.waimai.mach.manager.cache.c) eVar);
                                    }
                                }
                            } else {
                                com.sankuai.waimai.machpro.util.a.a("加载bundle异常！！！" + str);
                                if (bVar != null) {
                                    bVar.a(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
                                }
                            }
                        }
                    });
                }
            }

            @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
            public final void a(@NonNull CacheException cacheException) {
                Object[] objArr2 = {cacheException};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bb9ed4c599312e8ffbafc4208562243", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bb9ed4c599312e8ffbafc4208562243");
                } else {
                    b.this.a(str, str4, bVar, cacheException);
                }
            }
        };
        BundleInfo a2 = this.c.a(str);
        if (z && a2 != null && !a(a2)) {
            a(a2, new a.b() { // from class: com.sankuai.waimai.mach.manager_new.b.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager.a.b
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.c cVar) {
                    Object[] objArr2 = {cVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2efb3d063f910a0af6edc9c795e1d4bb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2efb3d063f910a0af6edc9c795e1d4bb");
                    } else {
                        interfaceC1013a.a(cVar);
                    }
                }

                @Override // com.sankuai.waimai.mach.manager.a.b
                public final void a(@NonNull CacheException cacheException) {
                    Object[] objArr2 = {cacheException};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4cb3ee0721169451822ae76508d0331", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4cb3ee0721169451822ae76508d0331");
                    } else {
                        b.this.a(str, (String) null, str2, str3, (BundleInfo) null, i, interfaceC1013a, (C1016b) null);
                    }
                }
            });
            this.j.a(a2);
            return;
        }
        a(str, (String) null, str2, str3, (BundleInfo) null, i, interfaceC1013a, (C1016b) null);
    }

    private void a(final String str, final String str2, final String str3, final a.b bVar, final CacheException cacheException) {
        Object[] objArr = {str, str2, str3, bVar, cacheException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eaf2a85e7e2ad022b02a94230e3c0ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eaf2a85e7e2ad022b02a94230e3c0ea");
        } else {
            a(str2, new a.InterfaceC1013a() { // from class: com.sankuai.waimai.mach.manager_new.b.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull final com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98a84579100e2030fd086b194b91a6c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98a84579100e2030fd086b194b91a6c2");
                    } else {
                        Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.7.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1e71c5492c61c86df02ea3a75dcbe998", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1e71c5492c61c86df02ea3a75dcbe998");
                                } else if (!(eVar instanceof com.sankuai.waimai.mach.manager.cache.c)) {
                                    com.sankuai.waimai.machpro.util.a.a("加载内置bundle异常！！！" + str2);
                                    if (bVar != null) {
                                        bVar.a(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
                                    }
                                } else {
                                    eVar.n = true;
                                    if (bVar != null) {
                                        com.sankuai.waimai.machpro.util.a.a("内置bundle加载成功～～" + str);
                                        if (!TextUtils.isEmpty(str3) && com.sankuai.waimai.machpro.util.b.a(str3, eVar.a()) == 1) {
                                            bVar.a(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
                                        } else {
                                            bVar.a((com.sankuai.waimai.mach.manager.cache.c) eVar);
                                        }
                                    }
                                }
                            }
                        });
                    }
                }

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull final CacheException cacheException2) {
                    Object[] objArr2 = {cacheException2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee3f89bbd6920b8bc4ce435ea5608a4f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee3f89bbd6920b8bc4ce435ea5608a4f");
                    } else {
                        Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.7.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0677f4ceac0d32c29f91f7e0fe34418c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0677f4ceac0d32c29f91f7e0fe34418c");
                                } else if (bVar != null) {
                                    if (cacheException2.c == 17903) {
                                        bVar.a(cacheException);
                                        return;
                                    }
                                    com.sankuai.waimai.machpro.util.a.a("内置bundle加载失败！！！" + str2 + cacheException2.a());
                                    bVar.a(cacheException2);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public final String b(String str) {
        BundleInfo a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc5791fe34210e0eb9285219c685f4ac", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc5791fe34210e0eb9285219c685f4ac") : (TextUtils.isEmpty(str) || (a2 = this.c.a(str)) == null) ? "" : a2.getBundleVersion();
    }

    @Override // com.sankuai.waimai.mach.manager_new.e
    public final void a(final String str, final String str2, final String str3, final String str4, BundleInfo bundleInfo, int i, final a.InterfaceC1013a interfaceC1013a, C1016b c1016b) {
        BundleInfo bundleInfo2;
        boolean z;
        C1016b c1016b2;
        BundleInfo bundleInfo3;
        int i2;
        DevSettings devSettings;
        Object[] objArr = {str, str2, str3, str4, bundleInfo, Integer.valueOf(i), interfaceC1013a, c1016b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdab201a4b94c201e70f30f4e09d59c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdab201a4b94c201e70f30f4e09d59c8");
        } else if (!g.a(str)) {
            if (interfaceC1013a != null) {
                interfaceC1013a.a(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
            }
        } else if (TextUtils.isEmpty(str)) {
            com.sankuai.waimai.mach.manager_new.common.c.b("syncLoadMachBundle | 参数保护，machId为空");
            if (interfaceC1013a != null) {
                interfaceC1013a.a(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
            }
        } else {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.b) {
                com.sankuai.waimai.mach.manager_new.monitor.a.a(str3, str4, str, str2);
                if (interfaceC1013a != null) {
                    interfaceC1013a.a(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR));
                    return;
                }
                return;
            }
            BundleInfo a2 = this.c.a(str);
            if (a2 == null && bundleInfo != null && TextUtils.equals(str, bundleInfo.getMachId())) {
                bundleInfo2 = bundleInfo;
                z = true;
            } else {
                bundleInfo2 = a2;
                z = false;
            }
            if (bundleInfo2 != null || !i.a().g().m || (devSettings = i.a().f) == null || devSettings.a(str) == null) {
                c1016b2 = c1016b;
                bundleInfo3 = bundleInfo2;
            } else {
                BundleInfo bundleInfo4 = new BundleInfo();
                DevSettings.LockBundleInfo a3 = i.a().f.a(str);
                bundleInfo4.setMachId(a3.templateId);
                bundleInfo4.setBundleName(a3.templateId);
                bundleInfo4.setVersion(a3.version);
                bundleInfo4.setBundleVersion(a3.version);
                c1016b2 = c1016b;
                if (c1016b2 != null) {
                    bundleInfo4.setBundleType("1");
                }
                d.a().a(bundleInfo4);
                d.a().a(bundleInfo4, 3);
                bundleInfo3 = bundleInfo4;
            }
            if (bundleInfo3 == null) {
                com.sankuai.waimai.mach.manager_new.common.c.b("asyncLoadBundleById | 找不对对应的Bundle信息 | " + str + " | 加载预置模板 " + str2);
                if (str.startsWith("mach_pro")) {
                    a(str, i, interfaceC1013a, c1016b2);
                    return;
                } else if (TextUtils.isEmpty(str2)) {
                    com.sankuai.waimai.mach.manager_new.common.c.b("asyncLoadBundleById | 预置模板设置为空 | " + str2 + " | " + str3);
                    a(0, str, str3, str4, elapsedRealtime, interfaceC1013a, str2);
                    return;
                } else {
                    a(str2, new a.InterfaceC1013a() { // from class: com.sankuai.waimai.mach.manager_new.b.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                        public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                            Object[] objArr2 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccde7743268aca03c23b5b9a016ea0b7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccde7743268aca03c23b5b9a016ea0b7");
                                return;
                            }
                            com.sankuai.waimai.mach.manager_new.monitor.a.b(b.this.b(), str3, str4, str2, eVar.a(), elapsedRealtime, 0);
                            if (interfaceC1013a != null) {
                                interfaceC1013a.a(eVar);
                            }
                        }

                        @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                        public final void a(@NonNull CacheException cacheException) {
                            Object[] objArr2 = {cacheException};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c4a42a9db00932c21cd9ed94a2e1a2b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c4a42a9db00932c21cd9ed94a2e1a2b");
                                return;
                            }
                            int i3 = cacheException.c;
                            com.sankuai.waimai.mach.manager_new.monitor.a.b(b.this.b(), str3, str4, str2, AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION, elapsedRealtime, com.sankuai.waimai.mach.manager_new.monitor.b.a(new CacheException(17809)), i3);
                            b.this.a(i3, str, str3, str4, elapsedRealtime, interfaceC1013a, str2);
                        }
                    });
                    return;
                }
            }
            com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundleById | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo3) + " | " + str3);
            h(str);
            final boolean[] zArr = {false, false};
            final BundleInfo bundleInfo5 = bundleInfo3;
            a(bundleInfo5, z, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.mach.manager_new.b.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de817471937b9320731a503e5e83e800", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de817471937b9320731a503e5e83e800");
                    } else if (zArr[0]) {
                    } else {
                        zArr[1] = true;
                        com.sankuai.waimai.mach.manager_new.common.c.c("asyncLoadBundleById | 业务回调成功 | " + str);
                        com.sankuai.waimai.mach.manager_new.monitor.a.b(b.this.b(), str3, str4, str, eVar.a(), elapsedRealtime);
                        b.this.h(str);
                        if (interfaceC1013a != null) {
                            eVar.p = false;
                            interfaceC1013a.a(eVar);
                        }
                    }
                }

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                    com.sankuai.waimai.mach.manager.cache.b b;
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c37771f524ad1dc5de877cf87dab6722", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c37771f524ad1dc5de877cf87dab6722");
                    } else if (zArr[0]) {
                    } else {
                        zArr[1] = true;
                        com.sankuai.waimai.mach.manager_new.common.c.b("asyncLoadBundleById | 业务回调失败 | " + str);
                        if (!TextUtils.isEmpty(bundleInfo5.getTags()) && !bundleInfo5.getTags().contains(BundleInfo.TAG_FORCE_UPDATE) && (b = b.this.b(bundleInfo5, true)) != null && b.a != null) {
                            if (interfaceC1013a != null) {
                                b.a.p = false;
                                interfaceC1013a.a(b.a);
                                return;
                            }
                            return;
                        }
                        b.a(b.this, bVar, str3, str4, str2, bundleInfo5, elapsedRealtime, str, interfaceC1013a);
                    }
                }
            }, c1016b2);
            if (i <= 0) {
                i2 = m.q() > 0 ? (int) m.q() : 5000;
            } else {
                i2 = i;
            }
            Mach.getMainHandler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4e6a30ac6d197ed2018084a4601f75d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4e6a30ac6d197ed2018084a4601f75d");
                    } else if (zArr[1]) {
                    } else {
                        zArr[0] = true;
                        if (!TextUtils.isEmpty(bundleInfo5.getTags()) && !bundleInfo5.getTags().contains(BundleInfo.TAG_FORCE_UPDATE)) {
                            if (!com.sankuai.waimai.mach.manager_new.common.a.c(bundleInfo5)) {
                                com.sankuai.waimai.mach.manager.cache.b b = b.this.b(bundleInfo5, true);
                                if (b != null && b.a != null) {
                                    if (interfaceC1013a != null) {
                                        b.a.p = false;
                                        interfaceC1013a.a(b.a);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                com.sankuai.waimai.mach.manager.cache.b a4 = b.a(b.this, bundleInfo5);
                                if (a4 != null && a4.a != null) {
                                    if (interfaceC1013a != null) {
                                        a4.a.p = false;
                                        interfaceC1013a.a(a4.a);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        b.a(b.this, new com.sankuai.waimai.mach.manager.load.b(new CacheException(17808)), str3, str4, str2, bundleInfo5, elapsedRealtime, str, interfaceC1013a);
                    }
                }
            }, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.waimai.mach.manager.cache.b b(BundleInfo bundleInfo, boolean z) {
        Object[] objArr = {bundleInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0145344eb2fb3a03d0b105ddf83e6701", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager.cache.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0145344eb2fb3a03d0b105ddf83e6701");
        }
        String b = com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo.getMachId());
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        String[] split = b.split("@");
        if (split.length == 2) {
            BundleInfo bundleInfo2 = new BundleInfo();
            bundleInfo2.setMachId(bundleInfo.getMachId());
            bundleInfo2.setBundleName(bundleInfo.getName());
            bundleInfo2.setBundleVersion(split[1]);
            bundleInfo2.setVersion(split[1]);
            if (d.a().a(b) == c.b) {
                d.a().a(b, bundleInfo2);
            }
            d.a().a(b, 3);
            return a(bundleInfo2, z);
        }
        return null;
    }

    private void a(final String str, int i, final a.InterfaceC1013a interfaceC1013a, C1016b c1016b) {
        int i2;
        Object[] objArr = {str, Integer.valueOf(i), interfaceC1013a, c1016b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a55053e88ace5c06b89e2fb8c1cf6dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a55053e88ace5c06b89e2fb8c1cf6dcc");
            return;
        }
        h(str);
        f(str);
        this.v.put(str, Boolean.TRUE);
        com.sankuai.waimai.mach.manager_new.a aVar = new com.sankuai.waimai.mach.manager_new.a();
        final boolean[] zArr = {false, false};
        aVar.a = new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.mach.manager_new.b.11
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.c
            public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "867e4fd904bee6a216ae5863acb6d18e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "867e4fd904bee6a216ae5863acb6d18e");
                } else if (zArr[0]) {
                } else {
                    zArr[1] = true;
                    com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundleById | 模板信息为空触发 checkupdate 接口 | 模板加载成功");
                    b.this.h(str);
                    if (interfaceC1013a != null) {
                        interfaceC1013a.a(eVar);
                    }
                }
            }

            @Override // com.sankuai.waimai.mach.container.c
            public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89f81475362cb1b3a9b5bad9ea4390fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89f81475362cb1b3a9b5bad9ea4390fb");
                } else if (zArr[0]) {
                } else {
                    zArr[1] = true;
                    b.this.h(str);
                    com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundleById | 模板信息为空触发 checkupdate 接口 | 模板加载失败");
                    if (interfaceC1013a != null) {
                        interfaceC1013a.a(b.this.a(bVar));
                    }
                }
            }
        };
        if (c1016b != null) {
            a(c1016b, aVar);
        } else {
            a(str, aVar);
        }
        if (!this.c.b()) {
            this.c.a();
        }
        if (i <= 0) {
            i2 = m.q() > 0 ? (int) m.q() : 5000;
        } else {
            i2 = i;
        }
        Mach.getMainHandler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.13
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "332cceb2b77e1ae12d6837f23fee3a6f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "332cceb2b77e1ae12d6837f23fee3a6f");
                } else if (zArr[1]) {
                } else {
                    zArr[0] = true;
                    com.sankuai.waimai.mach.manager.load.b bVar = new com.sankuai.waimai.mach.manager.load.b(new CacheException(17808));
                    if (interfaceC1013a != null) {
                        interfaceC1013a.a(b.this.a(bVar));
                    }
                }
            }
        }, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final String str, final String str2, final String str3, final long j, final a.InterfaceC1013a interfaceC1013a, final String str4) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, new Long(j), interfaceC1013a, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "404c828fc92139c72303d611ca4dff7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "404c828fc92139c72303d611ca4dff7e");
            return;
        }
        h(str);
        f(str);
        g(str);
        com.sankuai.waimai.mach.manager_new.a aVar = new com.sankuai.waimai.mach.manager_new.a();
        aVar.a = new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.mach.manager_new.b.14
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.c
            public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf71a52631b87bc67366a749b122776b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf71a52631b87bc67366a749b122776b");
                    return;
                }
                com.sankuai.waimai.mach.manager_new.monitor.a.b(b.this.b(), str2, str3, str, eVar.a(), j);
                com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundleById | 模板信息为空触发 checkupdate 接口 | 模板加载成功");
                b.this.h(str);
                if (interfaceC1013a != null) {
                    interfaceC1013a.a(eVar);
                }
            }

            @Override // com.sankuai.waimai.mach.container.c
            public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5f2c21daf0fddcd54face18ae81f0cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5f2c21daf0fddcd54face18ae81f0cf");
                    return;
                }
                com.sankuai.waimai.mach.manager_new.monitor.a.a(b.this.b(), str2, str3, str4, AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION, j, com.sankuai.waimai.mach.manager_new.monitor.b.a(bVar.b));
                if (bVar.b() == 17808) {
                    com.sankuai.waimai.mach.manager_new.monitor.a.a(str, m.q(), SystemClock.elapsedRealtime() - j, b.this.a(str, j));
                }
                b.this.h(str);
                com.sankuai.waimai.mach.manager_new.monitor.a.b(b.this.b(), str2, str3, str, str4, AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION, j, com.sankuai.waimai.mach.manager_new.monitor.b.a(bVar.b), i);
                com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundleById | 模板信息为空触发 checkupdate 接口 | 模板加载失败");
                if (interfaceC1013a != null) {
                    interfaceC1013a.a(new CacheException(bVar.b()));
                }
            }
        };
        this.c.a(new a.InterfaceC1017a() { // from class: com.sankuai.waimai.mach.manager_new.b.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager_new.config.a.InterfaceC1017a
            public final void a(List<BundleInfo> list) {
                boolean z = true;
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1888180e7eddcc176b5b4c5035ffb5d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1888180e7eddcc176b5b4c5035ffb5d7");
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        z = false;
                        break;
                    } else if (str.equals(list.get(i2).getMachId())) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    return;
                }
                interfaceC1013a.a(new CacheException(17807));
            }
        });
        a(str, aVar);
        if (this.c.b()) {
            return;
        }
        this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a9cd64323b5897899ef9a587c97d59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a9cd64323b5897899ef9a587c97d59");
            return;
        }
        synchronized (this.u) {
            Iterator<String> it = this.u.iterator();
            while (it.hasNext()) {
                BundleInfo a2 = this.c.a(it.next());
                if (a2 != null && this.j.b(a2)) {
                    it.remove();
                }
            }
        }
    }

    private void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb3ebb3c7d5bcb792a7fbc14b548a72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb3ebb3c7d5bcb792a7fbc14b548a72");
            return;
        }
        synchronized (this.u) {
            this.u.add(str);
        }
    }

    private void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2359f5301b40ca9a2cbe52d432b74b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2359f5301b40ca9a2cbe52d432b74b0");
            return;
        }
        synchronized (this.t) {
            this.t.add(str);
        }
    }

    private void a(@NonNull final String str, final a.InterfaceC1013a interfaceC1013a) {
        Object[] objArr = {str, interfaceC1013a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "027311964dd1c7fd91945799bf26d160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "027311964dd1c7fd91945799bf26d160");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundleById | 启动异步任务，加载预置模板 | " + str);
        com.sankuai.waimai.mach.manager_new.common.e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.b.16
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager_new.common.e.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4114ddc61f83b1dfb4d756d6debc1d5f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4114ddc61f83b1dfb4d756d6debc1d5f");
                    return;
                }
                if (!TextUtils.isEmpty(str) && str.startsWith("mach_pro")) {
                    if (com.sankuai.waimai.machpro.f.a().a(str) == -1) {
                        com.sankuai.waimai.machpro.f.a().b(str);
                    }
                    if (com.sankuai.waimai.machpro.f.a().a(str) != 1) {
                        if (interfaceC1013a != null) {
                            interfaceC1013a.a(new CacheException(17903));
                            return;
                        }
                        return;
                    }
                }
                final com.sankuai.waimai.mach.manager.cache.b e = b.this.e(str);
                final com.sankuai.waimai.mach.manager.cache.e eVar = e.a;
                if (eVar == null) {
                    Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.16.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "450622fa153b57b6b0774aaa32901ed2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "450622fa153b57b6b0774aaa32901ed2");
                                return;
                            }
                            try {
                                if (interfaceC1013a != null) {
                                    interfaceC1013a.a(new CacheException(e.c));
                                }
                            } catch (Exception e2) {
                                if (i.a().h()) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    });
                    return;
                }
                eVar.p = false;
                Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.16.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2084be7d606f32f4b21f7e7b347f7a64", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2084be7d606f32f4b21f7e7b347f7a64");
                            return;
                        }
                        try {
                            if (interfaceC1013a != null) {
                                interfaceC1013a.a(eVar);
                            }
                        } catch (Exception e2) {
                            if (i.a().h()) {
                                e2.printStackTrace();
                            }
                        }
                    }
                });
            }
        }, "mach_async_load_preset_when_miss");
    }

    private void a(BundleInfo bundleInfo, boolean z, com.sankuai.waimai.mach.container.c cVar, C1016b c1016b) {
        Object[] objArr = {bundleInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), cVar, c1016b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab1922075b45093b65ccc2100dc635a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab1922075b45093b65ccc2100dc635a");
        } else if (!this.b) {
            cVar.a(new com.sankuai.waimai.mach.manager.load.b(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR)));
        } else if (this.i == null) {
            cVar.a(new com.sankuai.waimai.mach.manager.load.b(new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR)));
        } else {
            String str = "";
            if (!com.sankuai.waimai.mach.manager_new.common.a.d(bundleInfo)) {
                str = com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo);
            } else if (c1016b != null) {
                str = c1016b.a + "@" + c1016b.b + "@" + bundleInfo.getMachId();
            }
            com.sankuai.waimai.mach.manager.cache.e b = this.i.b(str);
            if (b != null) {
                cVar.a(b);
                return;
            }
            com.sankuai.waimai.mach.manager_new.a aVar = new com.sankuai.waimai.mach.manager_new.a();
            aVar.a = cVar;
            if (!a(bundleInfo)) {
                if (this.j.c(bundleInfo)) {
                    this.j.b(bundleInfo);
                    com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundle | bundle下载中，稍后通知......");
                    if (c1016b != null) {
                        a(c1016b, aVar);
                        this.r.put(bundleInfo.getMachId(), Boolean.TRUE);
                        return;
                    }
                    a(bundleInfo, aVar);
                    return;
                } else if (z) {
                    com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundle | 外部模板，提交下载任务");
                    a(bundleInfo, aVar);
                    d.a().a(bundleInfo);
                    this.j.a(bundleInfo);
                    this.j.b(bundleInfo);
                    return;
                } else if (this.c.b()) {
                    com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundle | 版本正在更新.....，晚点再来吧");
                    if (c1016b != null) {
                        a(c1016b, aVar);
                        this.r.put(bundleInfo.getMachId(), Boolean.TRUE);
                    } else {
                        a(bundleInfo, aVar);
                    }
                    f(bundleInfo.getMachId());
                    g(bundleInfo.getMachId());
                    return;
                } else {
                    com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundle | 提交下载任务");
                    if (c1016b != null) {
                        a(c1016b, aVar);
                    } else {
                        a(bundleInfo, aVar);
                    }
                    this.j.a(bundleInfo);
                    this.r.put(bundleInfo.getMachId(), Boolean.TRUE);
                    this.j.b(bundleInfo);
                    return;
                }
            }
            com.sankuai.waimai.mach.manager_new.common.c.e("asyncLoadBundle | 本地归档，只要进行加载就可以了 | 提交load请求 | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
            if (c1016b != null) {
                a(c1016b, aVar);
            } else {
                a(bundleInfo, aVar);
            }
            aVar.b = true;
            this.k.a(bundleInfo);
        }
    }

    private void a(BundleInfo bundleInfo, com.sankuai.waimai.mach.manager_new.a aVar) {
        Object[] objArr = {bundleInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ebf359dcbf8815707b250607d208d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ebf359dcbf8815707b250607d208d9");
        } else if (bundleInfo == null) {
        } else {
            synchronized (this.o) {
                CopyOnWriteArrayList<com.sankuai.waimai.mach.manager_new.a> copyOnWriteArrayList = this.o.get(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    this.o.put(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo), copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(aVar);
            }
        }
    }

    private void a(String str, com.sankuai.waimai.mach.manager_new.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079406ebf4435c21578d754f45809c89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079406ebf4435c21578d754f45809c89");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            synchronized (this.p) {
                CopyOnWriteArrayList<com.sankuai.waimai.mach.manager_new.a> copyOnWriteArrayList = this.p.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    this.p.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(aVar);
            }
        }
    }

    private void a(C1016b c1016b, com.sankuai.waimai.mach.manager_new.a aVar) {
        Object[] objArr = {c1016b, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa5dd62024fee712d60ec44df78d9142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa5dd62024fee712d60ec44df78d9142");
        } else if (c1016b == null) {
        } else {
            synchronized (this.q) {
                CopyOnWriteArrayList<com.sankuai.waimai.mach.manager_new.a> copyOnWriteArrayList = this.q.get(c1016b);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    this.q.put(c1016b, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(aVar);
            }
        }
    }

    private void a(BundleInfo bundleInfo, com.sankuai.waimai.mach.manager.cache.e eVar) {
        Object[] objArr = {bundleInfo, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdc1fb8412d5e698c531f01fe822f3d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdc1fb8412d5e698c531f01fe822f3d6");
        } else if (bundleInfo == null) {
        } else {
            a(bundleInfo, eVar, this.o.remove(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo)));
            a(bundleInfo, eVar, this.p.remove(bundleInfo.getMachId()));
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.e
    public final boolean c(String str) {
        BundleInfo a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4efb9b378660b0513c8b3709d5880cbe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4efb9b378660b0513c8b3709d5880cbe")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (a2 = this.c.a(str)) == null) {
            return false;
        }
        return a(a2);
    }

    public final boolean a(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835f51b6e42f85cbc3c28a6d646a6377", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835f51b6e42f85cbc3c28a6d646a6377")).booleanValue();
        }
        if (this.c.e()) {
            return d.a().b(bundleInfo);
        }
        return com.sankuai.waimai.mach.manager_new.common.a.e(bundleInfo);
    }

    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a06ef828bd4332b1950b844f2a238b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a06ef828bd4332b1950b844f2a238b")).booleanValue() : this.i.d(str);
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.d
    public final void a(com.sankuai.waimai.mach.manager_new.ioq.b bVar) {
        com.sankuai.waimai.mach.manager.cache.e b;
        final b.a aVar;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2e6c63798fc4ca3556bc61cdbb67a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2e6c63798fc4ca3556bc61cdbb67a4");
            return;
        }
        boolean z = bVar instanceof com.sankuai.waimai.mach.manager_new.ioq.g;
        if (z || (bVar instanceof com.sankuai.waimai.machpro.bundle.b)) {
            if (bVar instanceof com.sankuai.waimai.machpro.bundle.b) {
                com.sankuai.waimai.machpro.bundle.b bVar2 = (com.sankuai.waimai.machpro.bundle.b) bVar;
                if (bVar2.h()) {
                    Map<C1016b, b.a> map = bVar2.i;
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e05c1ae2d8a15dcd2e51d3058f26265", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e05c1ae2d8a15dcd2e51d3058f26265");
                        return;
                    } else if (map != null) {
                        for (C1016b c1016b : map.keySet()) {
                            if (c1016b != null && (aVar = map.get(c1016b)) != null) {
                                if (aVar.a != null) {
                                    this.i.a(c1016b.a + "@" + c1016b.b + "@" + aVar.a.a, aVar.a);
                                    ConcurrentHashMap<String, Boolean> concurrentHashMap = this.e;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(aVar.a.a);
                                    sb.append("@");
                                    sb.append(aVar.a.e);
                                    concurrentHashMap.put(sb.toString(), Boolean.TRUE);
                                }
                                CopyOnWriteArrayList<com.sankuai.waimai.mach.manager_new.a> remove = this.q.remove(c1016b);
                                if (remove != null && remove.size() > 0) {
                                    for (final com.sankuai.waimai.mach.manager_new.a aVar2 : remove) {
                                        if (aVar2 != null && aVar2.a != null) {
                                            if (aVar.a != null) {
                                                Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.18
                                                    public static ChangeQuickRedirect a;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object[] objArr3 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca71ad980197a1a3e3cf0934c6e0dac2", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca71ad980197a1a3e3cf0934c6e0dac2");
                                                            return;
                                                        }
                                                        try {
                                                            aVar2.a.a(aVar.a);
                                                        } catch (Exception e) {
                                                            if (i.a().h()) {
                                                                e.printStackTrace();
                                                            }
                                                            com.sankuai.waimai.mach.manager_new.common.c.b(aVar.a.d + aVar.a.e + "dispatch load subbundle result with " + e.getMessage());
                                                        }
                                                    }
                                                });
                                            } else {
                                                com.sankuai.waimai.machpro.util.a.a("sub bunle load failed! | " + aVar.b.getName());
                                                Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.19
                                                    public static ChangeQuickRedirect a;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object[] objArr3 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "626868328b8945bb2851353038067b97", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "626868328b8945bb2851353038067b97");
                                                            return;
                                                        }
                                                        try {
                                                            aVar2.a.a(new com.sankuai.waimai.mach.manager.load.b(new CacheException(17807)));
                                                        } catch (Exception e) {
                                                            if (i.a().h()) {
                                                                e.printStackTrace();
                                                            }
                                                            com.sankuai.waimai.mach.manager_new.common.c.b("dispatch load result with " + e.getMessage());
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (bVar.b.b("load_for_future")) {
                return;
            }
            if (!d.a().c(bVar.b())) {
                if (z) {
                    b = ((com.sankuai.waimai.mach.manager_new.ioq.g) bVar).h;
                    b.n = false;
                } else {
                    b = ((com.sankuai.waimai.machpro.bundle.b) bVar).h;
                }
                this.i.a(bVar.b(), b);
                d.a().a(bVar.b(), 5);
                d.a().a(bVar.b(), 6);
            } else {
                b = this.i.b(bVar.b());
                if (b == null) {
                    com.sankuai.waimai.mach.manager_new.common.c.b("Bundle加载异常 | " + bVar.b() + " | Bundle状态" + d.a().a(bVar.b()).a());
                }
            }
            a(bVar.c(), b);
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.d
    public final void a(com.sankuai.waimai.mach.manager_new.ioq.b bVar, Exception exc) {
        Object[] objArr = {bVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374187a028dd81452275eb5e0eb9795d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374187a028dd81452275eb5e0eb9795d");
        } else if ((bVar instanceof com.sankuai.waimai.mach.manager_new.ioq.g) || (bVar instanceof com.sankuai.waimai.machpro.bundle.b)) {
            BundleInfo c = bVar.c();
            Object[] objArr2 = {c};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8069f17a2e2c71a613f24b3017bd4fca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8069f17a2e2c71a613f24b3017bd4fca");
            } else {
                com.sankuai.waimai.mach.manager_new.common.c.k("onIOQFailed | 异步通知 | Load | " + com.sankuai.waimai.mach.manager_new.common.a.b(c));
                CacheException cacheException = new CacheException(17807);
                a(this.o.remove(com.sankuai.waimai.mach.manager_new.common.a.b(c)), cacheException);
                a(this.p.remove(c.getMachId()), cacheException);
            }
            if ((exc instanceof com.sankuai.waimai.mach.manager_new.ioq.a) && ((com.sankuai.waimai.mach.manager_new.ioq.a) exc).b == 10001) {
                this.k.a(bVar.c(), f.i);
            }
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.e
    public final void b(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e7b773b8d5e5bd4fef2c9df82b0b496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e7b773b8d5e5bd4fef2c9df82b0b496");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.g("onDownSuccess | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        this.y.put(bundleInfo.getMachId(), Long.valueOf(SystemClock.elapsedRealtime()));
        d.a().a(bundleInfo, 3);
        CopyOnWriteArrayList<com.sankuai.waimai.mach.manager_new.a> copyOnWriteArrayList = this.p.get(bundleInfo.getMachId());
        if (!com.sankuai.waimai.mach.utils.e.a(this.o.get(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo))) || !com.sankuai.waimai.mach.utils.e.a(copyOnWriteArrayList)) {
            com.sankuai.waimai.mach.manager_new.common.c.g("onDownSuccess | 有异步回调在等加载，启动加载 | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
            this.k.a(bundleInfo);
        }
        if (this.r.containsKey(bundleInfo.getMachId())) {
            this.k.a(bundleInfo);
            this.r.remove(bundleInfo.getMachId());
        }
        this.k.a(bundleInfo, f.j);
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.e
    public final void a(BundleInfo bundleInfo, DownloadException downloadException) {
        Object[] objArr = {bundleInfo, downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f84bdf70564b56ac5554c010719ec36c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f84bdf70564b56ac5554c010719ec36c");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.g("onDownFail | 下载失败 | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        this.y.put(bundleInfo.getMachId(), Long.valueOf(SystemClock.elapsedRealtime()));
        a(this.o.remove(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo)), downloadException);
        a(this.p.remove(bundleInfo.getMachId()), downloadException);
        b(bundleInfo, downloadException);
    }

    private void b(BundleInfo bundleInfo, DownloadException downloadException) {
        Object[] objArr = {bundleInfo, downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82408603b1f9a165578f7a01f7702a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82408603b1f9a165578f7a01f7702a1");
        } else if (com.sankuai.waimai.mach.manager_new.common.a.d(bundleInfo)) {
            LinkedList<C1016b> linkedList = new LinkedList();
            for (C1016b c1016b : this.q.keySet()) {
                if (c1016b != null && x.a(bundleInfo.getMachId(), c1016b.c)) {
                    a(this.q.get(c1016b), downloadException);
                    linkedList.add(c1016b);
                }
            }
            for (C1016b c1016b2 : linkedList) {
                this.q.remove(c1016b2);
            }
        }
    }

    private void a(final BundleInfo bundleInfo, final com.sankuai.waimai.mach.manager.cache.e eVar, List<com.sankuai.waimai.mach.manager_new.a> list) {
        boolean z = false;
        Object[] objArr = {bundleInfo, eVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8b389e9635821037d0e029fa0f7289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8b389e9635821037d0e029fa0f7289");
        } else if (!com.sankuai.waimai.mach.utils.e.a(list)) {
            if (bundleInfo.isRetryDownloadStart() && !bundleInfo.isRetryDownloadEnd()) {
                z = true;
            }
            if (z) {
                return;
            }
            for (final com.sankuai.waimai.mach.manager_new.a aVar : list) {
                if (aVar != null && aVar.a != null) {
                    Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.20
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3aad73d6e90adb3e3bbb23ed9780fd4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3aad73d6e90adb3e3bbb23ed9780fd4");
                                return;
                            }
                            try {
                                if (i.a().h() && i.a().f.d) {
                                    aVar.a.a(new com.sankuai.waimai.mach.manager.load.b(new CacheException(17807)));
                                    return;
                                }
                                if (eVar instanceof com.sankuai.waimai.mach.manager.cache.c) {
                                    ((com.sankuai.waimai.mach.manager.cache.c) eVar).h = aVar.b;
                                }
                                aVar.a.a(eVar);
                            } catch (Exception e) {
                                if (i.a().h()) {
                                    e.printStackTrace();
                                }
                                com.sankuai.waimai.mach.manager_new.common.c.b(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo) + "dispatch load result with " + e.getMessage());
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<com.sankuai.waimai.mach.manager_new.a> list, final com.sankuai.waimai.mach.manager.exception.a aVar) {
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e5baa73aee912b4ad58f6f06fcfa4df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e5baa73aee912b4ad58f6f06fcfa4df");
        } else if (!com.sankuai.waimai.mach.utils.e.a(list)) {
            for (final com.sankuai.waimai.mach.manager_new.a aVar2 : list) {
                if (aVar2 != null && aVar2.a != null) {
                    Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.b.21
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e26310d930d5473d7751e75339b02398", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e26310d930d5473d7751e75339b02398");
                                return;
                            }
                            try {
                                aVar2.a.a(new com.sankuai.waimai.mach.manager.load.b(aVar));
                            } catch (Exception e) {
                                if (i.a().h()) {
                                    e.printStackTrace();
                                }
                                com.sankuai.waimai.mach.manager_new.common.c.b("dispatch load result with " + e.getMessage());
                            }
                        }
                    });
                }
            }
        }
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297c3f794f44685f9f3d24c882ea1c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297c3f794f44685f9f3d24c882ea1c8d");
            return;
        }
        this.d = z;
        com.sankuai.waimai.mach.manager_new.common.c.b("尊敬的新用户 -> 你好! привет! 下载成功率指标靠你们来证明了");
        com.sankuai.waimai.mach.manager_new.common.e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.b.22
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager_new.common.e.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "905a8d534120915374feb883f82700b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "905a8d534120915374feb883f82700b8");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("MachNewUser", 1);
                Map<String, String> c = i.a().c();
                c.put("newUser", String.valueOf(z));
                i.a().e().a(hashMap, c);
            }
        }, "mach_new_user_rate");
    }

    public final void a(t tVar) {
        Object[] objArr = {tVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83c2f2e47b9d2c391cbfec6dbddfbe15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83c2f2e47b9d2c391cbfec6dbddfbe15");
        } else if (this.j != null) {
            this.j.a(tVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3c437cc98f82d525c442f4b953b75d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3c437cc98f82d525c442f4b953b75d")).longValue();
        }
        if (!TextUtils.isEmpty(str) && this.y.containsKey(str)) {
            return this.y.get(str).longValue() - j;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00381b363f426a3e80a1d75725e1cdbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00381b363f426a3e80a1d75725e1cdbe");
        } else {
            this.y.remove(str);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.manager_new.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1016b {
        public String a;
        public String b;
        public String c;
        public com.sankuai.waimai.mach.manager.cache.c d;

        public C1016b(com.sankuai.waimai.mach.manager.cache.c cVar, String str) {
            this.d = cVar;
            this.a = cVar.d;
            this.b = cVar.e;
            this.c = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CacheException a(com.sankuai.waimai.mach.manager.load.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06cd9cb93705c84e8c54068d2a1860e", RobustBitConfig.DEFAULT_VALUE)) {
            return (CacheException) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06cd9cb93705c84e8c54068d2a1860e");
        }
        if (bVar.b instanceof DownloadException) {
            return new CacheException(17810);
        }
        if (bVar.b() == 17807) {
            return new CacheException(17807);
        }
        if (bVar.b() == 17809) {
            return new CacheException(17809);
        }
        if (bVar.b() == 17808) {
            return new CacheException(17808);
        }
        return new CacheException(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR);
    }
}
