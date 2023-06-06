package com.meituan.msc.modules.engine;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.meituan.met.mercury.load.bean.MSCAppIdPublishId;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.msc.common.process.GlobalEngineMonitor;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.modules.preload.MSCHornPreloadConfig;
import com.meituan.msc.modules.update.MSCHornBasePackageReloadConfig;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.PackagePreLoadReporter;
import com.meituan.msc.modules.update.metainfo.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q {
    public static ChangeQuickRedirect a;
    private static final LruCache<String, e> b = new LruCache<>(3);
    private static final Map<Integer, h> c = new HashMap();
    private static com.meituan.msc.modules.apploader.b d;

    public static /* synthetic */ void d(final h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a02bce3ed54a1caf48e609b6fc0c3660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a02bce3ed54a1caf48e609b6fc0c3660");
            return;
        }
        com.meituan.msc.common.framework.a<Void> aVar = new com.meituan.msc.common.framework.a<Void>() { // from class: com.meituan.msc.modules.engine.q.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.framework.a
            public final void a() {
            }

            @Override // com.meituan.msc.common.framework.a
            public final /* synthetic */ void a(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db79e1ea3012adf5c6c8cedb2388bccf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db79e1ea3012adf5c6c8cedb2388bccf");
                    return;
                }
                r rVar = h.this.i;
                if (rVar == r.BASE_PRELOAD) {
                    q.i();
                } else if (rVar == r.BIZ_PRELOAD) {
                    q.e(h.this.a());
                }
            }

            @Override // com.meituan.msc.common.framework.a
            public final void a(String str, Exception exc) {
                Object[] objArr2 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7251d6803389e428354d3f2815aff321", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7251d6803389e428354d3f2815aff321");
                } else {
                    com.meituan.msc.modules.reporter.g.b("RuntimeManager", exc, str);
                }
            }
        };
        Object[] objArr2 = {hVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "011b8bf1cee1f3e64e4578c7f8e48e27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "011b8bf1cee1f3e64e4578c7f8e48e27");
            return;
        }
        hVar.x = true;
        String a2 = p.a(p.BUNDLE_OFFLINE);
        Object[] objArr3 = {a2, aVar};
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "c22282c2c7418512c4187f6c19664130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "c22282c2c7418512c4187f6c19664130");
        } else {
            hVar.a(a2, aVar);
        }
    }

    public static /* synthetic */ void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d5bf0590765f3ce426ab28bbd71add6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d5bf0590765f3ce426ab28bbd71add6");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("PreloadBiz", "preload app after reload base package");
        com.meituan.msc.modules.preload.e.a().b(str, new com.meituan.msc.common.framework.a<h>() { // from class: com.meituan.msc.modules.engine.q.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.framework.a
            public final void a() {
            }

            @Override // com.meituan.msc.common.framework.a
            public final /* synthetic */ void a(h hVar) {
                h hVar2 = hVar;
                Object[] objArr2 = {hVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40b1e8f2ac7d731fcfe39115df5cfd4f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40b1e8f2ac7d731fcfe39115df5cfd4f");
                } else {
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", "preload app after reload end:", hVar2);
                }
            }

            @Override // com.meituan.msc.common.framework.a
            public final void a(String str2, Exception exc) {
                Object[] objArr2 = {str2, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bea47a202869f1ad3faf1aa4ab91f625", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bea47a202869f1ad3faf1aa4ab91f625");
                } else {
                    com.meituan.msc.modules.reporter.g.b("PreloadBiz", exc, "preload app after reload error", str2);
                }
            }
        });
    }

    public static /* synthetic */ void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ed8cdd4c900f257d887b6318dcd1fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ed8cdd4c900f257d887b6318dcd1fc8");
            return;
        }
        com.meituan.msc.common.support.java.util.concurrent.a<h> a2 = com.meituan.msc.modules.preload.g.b.a(MSCHornPreloadConfig.m() * 1000);
        if (a2 != null) {
            a2.a(new com.meituan.msc.common.support.java.util.function.b<h, Throwable, Object>() { // from class: com.meituan.msc.modules.engine.q.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.support.java.util.function.b
                public final /* synthetic */ Object a(h hVar, Throwable th) {
                    h hVar2 = hVar;
                    Throwable th2 = th;
                    Object[] objArr2 = {hVar2, th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "439ea00e6ad0070ae262ff01aece5cd4", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "439ea00e6ad0070ae262ff01aece5cd4");
                    }
                    if (th2 != null) {
                        com.meituan.msc.modules.reporter.g.d("PreloadBase", "rePreload base after reload error", th2);
                        return null;
                    }
                    com.meituan.msc.modules.reporter.g.d("PreloadBase", "rePreload base after reload end:", hVar2);
                    return null;
                }
            });
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f76e44aace1881ae52af8488f878ed97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f76e44aace1881ae52af8488f878ed97");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "71b6fdc069761702727f39bbde2cdd11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "71b6fdc069761702727f39bbde2cdd11");
        } else {
            com.meituan.msc.modules.update.metainfo.a a2 = com.meituan.msc.modules.update.metainfo.a.a();
            a.InterfaceC0475a interfaceC0475a = new a.InterfaceC0475a() { // from class: com.meituan.msc.modules.engine.q.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.modules.update.metainfo.a.InterfaceC0475a
                public final void a(List<MSCAppIdPublishId> list) {
                    Object[] objArr3 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "65255a9c27986266af22ff16177c5747", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "65255a9c27986266af22ff16177c5747");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d("RuntimeManager", "[MSC][MSCRuntime] app offline");
                    for (MSCAppIdPublishId mSCAppIdPublishId : list) {
                        synchronized (q.c) {
                            for (h hVar : q.c.values()) {
                                if (hVar.r.v() && com.meituan.msc.common.support.java.util.a.a(hVar.a(), mSCAppIdPublishId.getAppId()) && com.meituan.msc.common.support.java.util.a.a(hVar.r.w(), mSCAppIdPublishId.getPublishId())) {
                                    com.meituan.msc.modules.reporter.g.d("RuntimeManager", "[MSC][MSCRuntime] destroy runtime on app offline:", hVar);
                                    q.b(hVar);
                                }
                            }
                        }
                    }
                }
            };
            Object[] objArr3 = {interfaceC0475a};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.update.metainfo.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e0244c0b36bc9eee30da95032277af29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e0244c0b36bc9eee30da95032277af29");
            } else {
                a2.c.add(interfaceC0475a);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "24d895c9d7cb92320f022c6408f8f64a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "24d895c9d7cb92320f022c6408f8f64a");
            return;
        }
        MSCHornBasePackageReloadConfig e = MSCHornBasePackageReloadConfig.e();
        MSCHornBasePackageReloadConfig.a aVar = new MSCHornBasePackageReloadConfig.a() { // from class: com.meituan.msc.modules.engine.q.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.update.MSCHornBasePackageReloadConfig.a
            public final void a(String[] strArr) {
                Object[] objArr5 = {strArr};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d2ee0edb37921fd8961e4de0d3949163", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d2ee0edb37921fd8961e4de0d3949163");
                    return;
                }
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str)) {
                        synchronized (q.c) {
                            for (h hVar : q.c.values()) {
                                if (TextUtils.equals(hVar.r.n(), str)) {
                                    com.meituan.msc.modules.reporter.g.d("RuntimeManager", "[MSC][MSCRuntime] destroy runtime on base package reload:", hVar);
                                    com.meituan.msc.modules.update.pkg.d.a().b();
                                    q.d(hVar);
                                }
                            }
                        }
                    }
                }
            }
        };
        Object[] objArr5 = {aVar};
        ChangeQuickRedirect changeQuickRedirect5 = MSCHornBasePackageReloadConfig.c;
        if (PatchProxy.isSupport(objArr5, e, changeQuickRedirect5, false, "2f707559097c1a4dd786645feccb00ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, e, changeQuickRedirect5, false, "2f707559097c1a4dd786645feccb00ca");
        } else {
            e.d.add(aVar);
        }
    }

    public static void a(com.meituan.msc.modules.apploader.b bVar) {
        d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0201 A[Catch: all -> 0x030b, TryCatch #0 {, blocks: (B:8:0x0031, B:10:0x0048, B:20:0x0066, B:21:0x0076, B:23:0x0078, B:24:0x0087, B:26:0x008d, B:28:0x00a5, B:30:0x00ab, B:31:0x00bb, B:33:0x00c9, B:35:0x00de, B:36:0x00e2, B:38:0x00fc, B:40:0x011a, B:53:0x015c, B:55:0x0178, B:65:0x01a7, B:66:0x01b5, B:68:0x01bb, B:70:0x01c1, B:72:0x01c7, B:84:0x01fb, B:86:0x0201, B:88:0x020b, B:75:0x01ce, B:77:0x01d4, B:79:0x01da, B:56:0x0184, B:58:0x0192, B:60:0x0198, B:83:0x01e5, B:41:0x0129, B:43:0x0136, B:45:0x014a, B:48:0x0152, B:94:0x021a, B:95:0x023c, B:98:0x0240, B:99:0x0262, B:102:0x0266, B:103:0x02b1, B:106:0x02b5, B:107:0x0303, B:109:0x0305, B:110:0x0309, B:11:0x0053, B:13:0x0057), top: B:115:0x0031 }] */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.msc.modules.engine.h a(java.lang.String r26, java.lang.String r27, com.meituan.msc.modules.container.k r28) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.engine.q.a(java.lang.String, java.lang.String, com.meituan.msc.modules.container.k):com.meituan.msc.modules.engine.h");
    }

    private static boolean a(String str, h hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54d76f22875acf3644d71b5a1cb7b37d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54d76f22875acf3644d71b5a1cb7b37d")).booleanValue() : !MSCHornRollbackConfig.d().c().isRollbackPageNotFoundStrategy1 && e(hVar) && a(hVar, str);
    }

    private static boolean e(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f28814747a6b90c877daed082041ad4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f28814747a6b90c877daed082041ad4")).booleanValue() : !hVar.g();
    }

    public static boolean a(h hVar, String str) {
        Object[] objArr = {hVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9036d5d327a6403b1e9a5545186e75c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9036d5d327a6403b1e9a5545186e75c0")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        com.meituan.msc.modules.update.a aVar = hVar.s;
        if (aVar.d != null) {
            return !aVar.m(str);
        }
        com.meituan.msc.modules.reporter.g.d("RuntimeManager", "isPageNotFound pages is null");
        return false;
    }

    private static h a(String str, com.meituan.msc.modules.container.k kVar, @RuntimeCreateScene int i) {
        Object[] objArr = {str, kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ab3b51c5ae702c26cd1b51291cbecc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ab3b51c5ae702c26cd1b51291cbecc6");
        }
        String str2 = "新建运行时:" + str;
        aw.b(str2, new Object[0]);
        h a2 = a(str, kVar.d, kVar.b);
        a2.H = s.NEW;
        a2.r.j = i;
        a2.y = com.meituan.msc.modules.preload.e.a().b;
        b.a(a2, str, kVar);
        com.meituan.msc.modules.page.q.e.set(0);
        com.meituan.msc.modules.reporter.g.d("RuntimeManager", str2, a2);
        return a2;
    }

    public static h a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe95deb1ac8fbce9d093de32abff5b46", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe95deb1ac8fbce9d093de32abff5b46");
        }
        synchronized (c) {
            for (h hVar : c.values()) {
                if (((com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class)).d() && TextUtils.equals(hVar.a(), str)) {
                    return hVar;
                }
            }
            return null;
        }
    }

    public static h b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28d5374dc34dc11aabde7f8f2a21215f", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28d5374dc34dc11aabde7f8f2a21215f");
        }
        synchronized (c) {
            for (h hVar : c.values()) {
                if (((com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class)).d() && TextUtils.equals(hVar.a(), str) && hVar.i == r.BIZ_PRELOAD) {
                    return hVar;
                }
            }
            return null;
        }
    }

    public static List<Pair<String, String>> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c27f0fff16964a094891f9ced289e936", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c27f0fff16964a094891f9ced289e936");
        }
        ArrayList arrayList = new ArrayList();
        synchronized (c) {
            for (h hVar : c.values()) {
                if (((com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class)).d()) {
                    com.meituan.msc.modules.update.f fVar = hVar.r;
                    arrayList.add(new Pair(fVar.B(), fVar.n()));
                }
            }
        }
        return arrayList;
    }

    public static h c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa7c5b87ff12d0def25b8ac95a0d867a", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa7c5b87ff12d0def25b8ac95a0d867a");
        }
        synchronized (c) {
            for (h hVar : c.values()) {
                com.meituan.msc.modules.apploader.a aVar = (com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class);
                if (aVar.d() && !aVar.a() && TextUtils.isEmpty(hVar.a()) && hVar.i == r.BASE_PRELOAD) {
                    return hVar;
                }
            }
            return null;
        }
    }

    public static h c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9512e1cd7c95bf16a65ade360c27d051", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9512e1cd7c95bf16a65ade360c27d051");
        }
        synchronized (c) {
            for (h hVar : c.values()) {
                if (((com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class)).d() && TextUtils.equals(hVar.a(), str)) {
                    return null;
                }
            }
            return a(str, (String) null, false);
        }
    }

    @NonNull
    private static h a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95ff44a6229e1dfa194c5289d3c4cd59", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95ff44a6229e1dfa194c5289d3c4cd59");
        }
        h hVar = new h();
        com.meituan.msc.modules.apploader.a aVar = (com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class);
        aVar.b(z);
        aVar.b(str2);
        aVar.a(d);
        if (str != null) {
            hVar.a(str);
        }
        synchronized (c) {
            c.put(Integer.valueOf(hVar.c), hVar);
        }
        GlobalEngineMonitor a2 = GlobalEngineMonitor.a();
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = GlobalEngineMonitor.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "397555934c1f1493389c63a5337de464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "397555934c1f1493389c63a5337de464");
        } else {
            a2.b(hVar, false);
        }
        if (z) {
            ((com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class)).a(true);
        }
        return hVar;
    }

    public static void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67aecd8da5d3ba26fdd00a92bb0d5cd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67aecd8da5d3ba26fdd00a92bb0d5cd9");
            return;
        }
        synchronized (c) {
            for (h hVar2 : c.values()) {
                if (TextUtils.equals(hVar2.a(), hVar.a()) && hVar2 != hVar) {
                    com.meituan.msc.modules.reporter.g.b("EngineManager", "destroy running engine：");
                    hVar2.d(p.a(p.RELOAD));
                }
            }
        }
    }

    public static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "590f22fe944e8fff14727f54c65f00c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "590f22fe944e8fff14727f54c65f00c9");
        } else if (!com.meituan.msc.common.config.b.s()) {
            com.meituan.msc.modules.reporter.g.d("RuntimeManager", "shouldDestroyEngineOnTrimMemory is off");
        } else {
            com.meituan.msc.modules.reporter.g.d("RuntimeManager", "onLowMemory destroyAllKeepAliveEngine");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f40769e63ae42bf9be4e33b25b54e359", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f40769e63ae42bf9be4e33b25b54e359");
                return;
            }
            synchronized (b) {
                if (b.size() <= 0) {
                    return;
                }
                for (Map.Entry<String, e> entry : b.snapshot().entrySet()) {
                    d(entry.getValue());
                }
                b.evictAll();
            }
        }
    }

    public static void b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f034fede3c5cf543f058e19f83ffbe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f034fede3c5cf543f058e19f83ffbe9");
        } else if (eVar == null) {
        } else {
            synchronized (b) {
                if (b.size() == 3) {
                    try {
                        if (b.snapshot() != null) {
                            LruCache<String, e> lruCache = b;
                            d(lruCache.remove(lruCache.snapshot().entrySet().iterator().next().getKey()));
                        }
                    } catch (Throwable unused) {
                    }
                }
                b.put(eVar.b, eVar);
                GlobalEngineMonitor.a().a(eVar.c, true);
                aw.b("引擎进入保活状态", new Object[0]);
                com.meituan.msc.modules.reporter.g.b("EngineManager", "addKeepAliveEngine");
            }
        }
    }

    private static void d(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11bc62ac00d20070876c4fe877d3dbdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11bc62ac00d20070876c4fe877d3dbdd");
        } else if (eVar != null) {
            aw.b("销毁保活的引擎", new Object[0]);
            com.meituan.msc.modules.reporter.g.a("EngineManager destroyKeepAliveEngine");
            eVar.c.d(p.a(p.KEEP_ALIVE_COUNT_EXCEED));
        }
    }

    public static void b(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74a8dea466ac786e0395b87de55bcb95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74a8dea466ac786e0395b87de55bcb95");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("RuntimeManager", "destroyRuntime", hVar);
        hVar.x = true;
        hVar.d(p.a(p.BUNDLE_OFFLINE));
    }

    public static void c(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76f025e98d44608a638c9009e124a847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76f025e98d44608a638c9009e124a847");
        } else if (eVar == null) {
        } else {
            synchronized (b) {
                b.remove(eVar.b);
            }
            GlobalEngineMonitor.a().a(eVar.c, false);
        }
    }

    public static Map<String, e> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33c805f718d8bed9a184aa68af14a7e1", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33c805f718d8bed9a184aa68af14a7e1") : b.snapshot();
    }

    public static Map<Integer, h> f() {
        HashMap hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c71f126c1ab74cd7a2f6155704af1279", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c71f126c1ab74cd7a2f6155704af1279");
        }
        synchronized (c) {
            hashMap = new HashMap(c);
        }
        return hashMap;
    }

    @PackagePreLoadReporter.PackageLoadSourceFrom
    public static String c(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9d915efacbf4f89c67771f66911314e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9d915efacbf4f89c67771f66911314e") : ((com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class)).c() ? PackageLoadReporter.Source.LAUNCH : LaunchMode.LAUNCH_MODE_PRELOAD;
    }

    @NonNull
    public static List<String> a(long j, long j2, h hVar) {
        j jVar;
        Object[] objArr = {new Long(j), new Long(j2), hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef621a2979bdbd0a1baf26e23ddf5458", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef621a2979bdbd0a1baf26e23ddf5458");
        }
        if (j2 <= j) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (c) {
            for (h hVar2 : c.values()) {
                if (hVar2 != hVar && (jVar = hVar2.p) != null && jVar.i > j && jVar.h < j2) {
                    arrayList.add(jVar.j);
                }
            }
        }
        return arrayList;
    }

    public static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66d1a1deb3c639f6456eaa6efef64cdc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66d1a1deb3c639f6456eaa6efef64cdc")).booleanValue();
        }
        synchronized (c) {
            for (h hVar : c.values()) {
                if (((com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class)).d() && TextUtils.equals(hVar.a(), str)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Nullable
    public static h g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c459096b61566e7d66b34634fedd6bca", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c459096b61566e7d66b34634fedd6bca");
        }
        synchronized (c) {
            if (c() == null) {
                return a((String) null, (String) null, false);
            }
            return null;
        }
    }

    public static void a(DDResource dDResource) {
        int i;
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afe14bfe91ffebbeecd2971584f51f0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afe14bfe91ffebbeecd2971584f51f0b");
            return;
        }
        synchronized (c) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "23643f0d1c081aa68fde345dc6438b3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "23643f0d1c081aa68fde345dc6438b3f");
            } else {
                synchronized (c) {
                    for (h hVar : c.values()) {
                        b(hVar);
                    }
                }
            }
            com.meituan.msc.modules.update.pkg.d.a().a(dDResource);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1e85ca0d1d5bd8becfab909f1d81a21b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1e85ca0d1d5bd8becfab909f1d81a21b");
            } else {
                synchronized (c) {
                    i = 0;
                    for (h hVar2 : c.values()) {
                        if (hVar2.g() && ((com.meituan.msc.modules.apploader.a) hVar2.c(com.meituan.msc.modules.apploader.a.class)).c()) {
                            i++;
                        }
                    }
                }
                PackageLoadReporter.a b2 = PackageLoadReporter.a.b();
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = PackageLoadReporter.a.d;
                if (PatchProxy.isSupport(objArr4, b2, changeQuickRedirect4, false, "09d441fb4c65730209c963e6c305855e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, b2, changeQuickRedirect4, false, "09d441fb4c65730209c963e6c305855e");
                } else {
                    b2.b("msc.package.invalid.using.runtime.count").a(0.0d).a("usingRuntimeCount", Integer.valueOf(i)).b();
                }
            }
        }
    }

    public static void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d59d022aa1a0a879ac74ac64b4ce0bca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d59d022aa1a0a879ac74ac64b4ce0bca");
            return;
        }
        h hVar = eVar.c;
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b9377305672729cb65efc18802f50e11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b9377305672729cb65efc18802f50e11");
            return;
        }
        if (!TextUtils.isEmpty(hVar.a())) {
            synchronized (b) {
                b.remove(hVar.a());
            }
        }
        synchronized (c) {
            c.remove(Integer.valueOf(hVar.c));
        }
        GlobalEngineMonitor.a().a(com.meituan.msc.common.process.a.a());
    }
}
