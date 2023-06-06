package com.meituan.mmp.lib.engine;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.mmp.lib.engine.f;
import com.meituan.mmp.lib.engine.p;
import com.meituan.mmp.lib.mp.GlobalEngineMonitor;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.mmp.lib.router.AppBrandRouterCenter;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a = null;
    public static String b = "";
    private static volatile boolean c = false;
    private static volatile boolean d = false;
    private static final ConcurrentHashMap<String, f> e = new ConcurrentHashMap<>();
    @Nullable
    private static List<String> f = null;
    @Nullable
    private static Map<String, q> g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(String str, Map<String, Object> map, Integer num, long j, c cVar);
    }

    public static boolean a() {
        return c;
    }

    public static boolean a(String str, f fVar, boolean z) {
        Object[] objArr = {str, fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f0ff563d26ddbf428f642eb074497d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f0ff563d26ddbf428f642eb074497d5")).booleanValue();
        }
        p.a a2 = p.a(fVar);
        if (a2 != null && z) {
            fVar.l.a("preload_loadStatus", (Object) a2.c.toString());
            if (fVar instanceof com.meituan.mmp.lib.engine.b) {
                fVar.l.a("preload_isServiceReady", Boolean.valueOf(a2.d));
            }
            a2.f = true;
        }
        return e.remove(str, fVar);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b7890a318f490f6026df9d0f9e89a76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b7890a318f490f6026df9d0f9e89a76");
            return;
        }
        b.a.a("PreloadManager", "clearEngine: " + str);
        f remove = e.remove(str);
        if (remove != null) {
            remove.b();
            p.a a2 = p.a(remove);
            if (a2 != null) {
                a2.e = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b() {
        /*
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mmp.lib.engine.o.a
            java.lang.String r10 = "19123fe83d3ff8791d2a58a7711aa952"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            com.meituan.robust.PatchProxy.accessDispatch(r8, r3, r9, r2, r10)
            return
        L1a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.meituan.mmp.lib.engine.f> r1 = com.meituan.mmp.lib.engine.o.e
            int r1 = r1.size()
            if (r1 != 0) goto L23
            return
        L23:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.meituan.mmp.lib.engine.f> r1 = com.meituan.mmp.lib.engine.o.e
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            com.meituan.mmp.lib.engine.f r4 = (com.meituan.mmp.lib.engine.f) r4
            if (r4 == 0) goto L2d
            com.meituan.mmp.lib.engine.p$a r5 = com.meituan.mmp.lib.engine.p.a(r4)
            if (r5 == 0) goto L7a
            com.meituan.mmp.lib.engine.MMPHornPreloadConfig r6 = com.meituan.mmp.lib.engine.MMPHornPreloadConfig.a()
            com.meituan.mmp.lib.engine.MMPHornPreloadConfig$Data r6 = r6.d
            long r6 = r6.preloadForceKeepTime
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L7a
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r10 = r5.b
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L7a
            java.lang.String r5 = "PreloadManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "keep preloaded engine from clean by force keep time "
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.meituan.mmp.lib.trace.b.a.a(r5, r6)
            r5 = 1
            goto L7b
        L7a:
            r5 = 0
        L7b:
            if (r5 != 0) goto L2d
            java.lang.String r5 = r4.f()
            a(r5)
            com.meituan.mmp.lib.trace.h r4 = r4.i()
            if (r4 == 0) goto L2d
            java.lang.String r5 = "mmp.preload.point.trim.memory.destroy"
            r4.b(r5, r3)
            goto L2d
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.engine.o.b():void");
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca1f9d12e4a4cacda2d036409f47aae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca1f9d12e4a4cacda2d036409f47aae3");
        } else {
            a(false);
        }
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e396fc7986f438db3f47e3d386e6412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e396fc7986f438db3f47e3d386e6412");
        } else if (MMPHornPreloadConfig.a().c()) {
            r.a();
            if (!d || z) {
                d = true;
                e();
            }
        } else {
            b.a.a("PreloadManager skip for switch off");
        }
    }

    private static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a78639434df88a09f6256348f0aab446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a78639434df88a09f6256348f0aab446");
        } else {
            f("appLaunch");
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99c0c9f9c3d60ac5d2f2c5d05ae866d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99c0c9f9c3d60ac5d2f2c5d05ae866d4");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            ((a) IPCInvoke.a(b.class, com.meituan.mmp.lib.mp.a.MAIN)).a();
        } else if (MMPHornPreloadConfig.i() != null) {
            com.meituan.mmp.lib.trace.b.b("PreloadManager", "Try preload Next App after Service Ready");
            for (Map.Entry<Integer, f> entry : j.d().entrySet()) {
                if (entry.getValue() != null && entry.getValue().j().a(f.b.PRELOAD_FOR_LAUNCH)) {
                    com.meituan.mmp.lib.trace.b.b("PreloadManager", "a mini app is already launched, stop all the subsequential preloading processes");
                    return;
                }
            }
            f("appLaunch");
        }
    }

    private static void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "716cac39f4002d15004c3c9ba7ef2e71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "716cac39f4002d15004c3c9ba7ef2e71");
        } else {
            a(str, (String) null);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0ad075b9d98dc190c603272a069be0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0ad075b9d98dc190c603272a069be0e");
            return;
        }
        if (str2 == null) {
            str2 = a(true, true);
        } else {
            String[] i = MMPHornPreloadConfig.i();
            if (i != null && !Arrays.asList(i).contains(str2)) {
                b.a.a("preload is skipped as the appId is not congifured to support preloading");
                return;
            }
        }
        if (!TextUtils.isEmpty(str2) && !MMPHornPreloadConfig.a().a(str2)) {
            b(str2, com.meituan.mmp.lib.utils.v.a("preload_type", 1, "preload_source", str), null, null);
        } else {
            b.a.a("PreloadManager skip for appId empty or hornConfig");
        }
    }

    private static String a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e333d15ec972353d892f14c35bcb5eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e333d15ec972353d892f14c35bcb5eb");
        }
        String[] i = MMPHornPreloadConfig.i();
        if (i != null) {
            for (int i2 = 0; i2 < i.length; i2++) {
                if (e.get(i[i2]) == null && j.a(i[i2]) == null) {
                    String str2 = i[i2];
                    com.meituan.mmp.lib.trace.b.b("PreloadManager", "preloading multiple mini app in sequence, next app to load: " + str2);
                    return str2;
                }
            }
            return null;
        }
        String str3 = MMPHornPreloadConfig.a().d.overridePreloadApp;
        if (TextUtils.isEmpty(str3) && z2) {
            str3 = s.a();
        }
        if (MMPHornPreloadConfig.a().a(str3)) {
            b.a.a("PreloadManager skip preload for app " + str3 + " by config");
        } else {
            str = str3;
        }
        return (TextUtils.isEmpty(str) && z) ? MMPHornPreloadConfig.a().b() : str;
    }

    public static void a(String str, int i, String str2, boolean z, final com.meituan.mmp.main.a<Void> aVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, (byte) 0, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3e3861e368b673b2dde8686ed1c03b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3e3861e368b673b2dde8686ed1c03b9");
        } else if (!MMPHornPreloadConfig.a().c()) {
            b.a.a("PreloadManager", "skip preload for switch off");
            if (aVar != null) {
                aVar.a("skip preload for switch off", null);
            }
        } else if (com.meituan.mmp.lib.t.c(str) && !e.containsKey(str)) {
            b.a.a("PreloadManager", "skip preload for app already running, appId:" + str);
            if (aVar != null) {
                aVar.a(null);
            }
        } else {
            if (i == 1) {
                String a2 = a(false, false);
                if (!TextUtils.isEmpty(a2) && !TextUtils.equals(a2, str)) {
                    b.a.a("PreloadManager", "skip preload for waiting recent app preload, " + str + " -> " + a2);
                    if (aVar != null) {
                        aVar.a("skip preload for waiting recent app preload, " + str + " -> " + a2, null);
                        return;
                    }
                    return;
                } else if (d) {
                    b.a.a("PreloadManager", "skip preload for other preload already started: " + str);
                    if (aVar != null) {
                        aVar.a("skip preload for other preload already started: " + str, null);
                        return;
                    }
                    return;
                } else {
                    d = true;
                }
            }
            int i2 = MMPHornPreloadConfig.a().d.appInstanceLimitWhenPreload;
            List<GlobalEngineMonitor.AppEngineRecord> a3 = GlobalEngineMonitor.a().a((String) null);
            if (i2 > 0 && a3.size() >= i2) {
                String str3 = "skip preload " + str + " because existing engine count " + a3.size() + " is not less than limit " + i2;
                b.a.a("PreloadManager", str3);
                if (aVar != null) {
                    aVar.a(str3, null);
                    return;
                }
                return;
            }
            b(str, com.meituan.mmp.lib.utils.v.a("preload_type", Integer.valueOf(i), "preload_source", str2), null, new g() { // from class: com.meituan.mmp.lib.engine.o.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
                public final void a(List<MMPPackageInfo> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57a4144996cbfbe1d261ca2bdc1b5b09", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57a4144996cbfbe1d261ca2bdc1b5b09");
                    } else if (com.meituan.mmp.main.a.this != null) {
                        com.meituan.mmp.main.a.this.a(null);
                    }
                }

                @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
                public final void a(String str4, Exception exc) {
                    Object[] objArr2 = {str4, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20a015d5238d5b552c3ace8c0a6d4f7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20a015d5238d5b552c3ace8c0a6d4f7e");
                    } else if (com.meituan.mmp.main.a.this != null) {
                        com.meituan.mmp.main.a.this.a(str4, exc);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final String str, @Nullable final Map<String, Object> map, @Nullable Integer num, @Nullable final c cVar) {
        Object[] objArr = {str, map, num, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "459c74b37ac8ce10aadf896a1bc05923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "459c74b37ac8ce10aadf896a1bc05923");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MMPEnvHelper.ensureFullInited();
            c = true;
            f fVar = e.get(str);
            if (fVar == null) {
                fVar = j.a(str);
            }
            final p.a aVar = new p.a();
            aVar.a = str;
            p.b.add(aVar);
            if (fVar == null) {
                b.a.a("PreloadManager", "preload for appId:" + str);
                bb.b("Preload Engine for appId:" + str, new Object[0]);
                ab.c("preload " + str);
                Trace.beginSection("startPreloadMiniApp: " + str);
                final f a2 = j.a(str, false, false);
                boolean z = a2 instanceof com.meituan.mmp.lib.engine.b;
                if (z) {
                    com.meituan.mmp.lib.trace.a.a(str, "preloadJSC");
                }
                a2.i().b.c("service.load");
                a2.i().b.b(LaunchMode.LAUNCH_MODE_PRELOAD);
                a2.i().b(map);
                e.put(str, a2);
                p.c.put(a2, aVar);
                a2.l.b("mmp.preload.point.start", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("sinceApplicationStart", Long.valueOf(com.meituan.mmp.lib.preformance.a.b())));
                a2.b(new g() { // from class: com.meituan.mmp.lib.engine.o.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
                    public final void a(String str2, Exception exc) {
                        Object[] objArr2 = {str2, exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6fc8dec895a90a08ddf110764b39a05", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6fc8dec895a90a08ddf110764b39a05");
                            return;
                        }
                        b.a.c("PreloadManager", "preload failed, appId:" + str + StringUtil.SPACE + str2);
                        o.e.remove(str, a2);
                        aVar.c = f.c.FAILED;
                        a2.l.b("mmp.preload.point.fail", com.meituan.mmp.lib.utils.v.a("reason", str2));
                    }

                    @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
                    public final void a(MMPAppProp mMPAppProp) {
                        Object[] objArr2 = {mMPAppProp};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd875a45df9ab0e6e3b4b14324d2c556", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd875a45df9ab0e6e3b4b14324d2c556");
                            return;
                        }
                        aVar.c = f.c.APP_PROP_UPDATED;
                        com.meituan.mmp.lib.mp.a a3 = com.meituan.mmp.lib.router.a.a(AppBrandRouterCenter.a(str, mMPAppProp.isFusionModeEnabled(), com.meituan.mmp.lib.router.c.b(str).booleanValue(), true));
                        if (a3 == null) {
                            com.meituan.mmp.lib.trace.b.d("PreloadManager", "find process to start preload: process not found");
                        } else if (a2 instanceof com.meituan.mmp.lib.engine.b) {
                        } else {
                            if (mMPAppProp.isOutdated()) {
                                com.meituan.mmp.lib.trace.b.b("PreloadManager", "will start process when checking update: " + a3.a());
                                com.meituan.mmp.lib.mp.a.a(a3);
                                return;
                            }
                            com.meituan.mmp.lib.trace.b.b("PreloadManager", "will preload in process: " + a3.a());
                            ((a) IPCInvoke.a(b.class, a3)).a(str, map, Integer.valueOf(a2.g()), com.meituan.mmp.lib.preformance.a.a(), cVar);
                        }
                    }

                    @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
                    public final void a(List<MMPPackageInfo> list) {
                        Object[] objArr2 = {list};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87cfbf87b0a5bceb5f0c5eefe57500f8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87cfbf87b0a5bceb5f0c5eefe57500f8");
                            return;
                        }
                        aVar.c = f.c.ALL_PACKAGE_PREPARED;
                        b.a.a("PreloadManager", "preload success, appId:" + str);
                        ab.d("preload " + str);
                        com.meituan.mmp.lib.trace.h i = a2.i();
                        if (i != null) {
                            i.b("mmp.preload.point.all.package.prepared", (HashMap<String, Object>) null);
                        }
                    }

                    @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f05d89ae29a2728bba76b4f65b8f446a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f05d89ae29a2728bba76b4f65b8f446a");
                            return;
                        }
                        aVar.d = true;
                        com.meituan.mmp.lib.trace.h i = a2.i();
                        if (i != null) {
                            i.b("mmp.preload.point.service.ready", (HashMap<String, Object>) null);
                        }
                    }
                });
                if (z && num != null) {
                    ((com.meituan.mmp.lib.engine.b) a2).b(num.intValue());
                }
                a2.b((String) null);
                Trace.endSection();
                fVar = a2;
            } else {
                b.a.a("PreloadManager", "already preloaded or running, appId:" + str);
            }
            if (cVar != null) {
                fVar.d(cVar);
            }
        }
    }

    private static SharedPreferences b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2127516bb7b2871e7bc7834ccb6b2c5", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2127516bb7b2871e7bc7834ccb6b2c5") : MMPEnvHelper.getSharedPreferences(context, "sp_msc_preload_strategy_config");
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21a9a86fd2eb97ffe1a17734c06176eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21a9a86fd2eb97ffe1a17734c06176eb")).booleanValue();
        }
        if (f == null) {
            return false;
        }
        if (MMPHornPreloadConfig.c(str)) {
            com.meituan.mmp.lib.trace.b.a("PreloadManager", "setPreferMainProcess disablePreloadWithStrategy", str);
            f.remove(str);
            return false;
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            com.meituan.mmp.lib.trace.b.b("PreloadManager", "call getPreferMainProcessAppId at sub process");
            return false;
        } else {
            return f.contains(str);
        }
    }

    @Nullable
    public static q c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9519d4ec861246085bf4509c4655d23", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9519d4ec861246085bf4509c4655d23");
        }
        if (g == null) {
            return null;
        }
        if (MMPHornPreloadConfig.c(str)) {
            com.meituan.mmp.lib.trace.b.a("PreloadManager", "preloadMiniAppWithStrategy disablePreloadWithStrategy", str);
            g.remove(str);
            return null;
        }
        f();
        if (g.containsKey(str)) {
            return g.get(str);
        }
        return null;
    }

    public static String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d9775850ea2a9753fd6409dd7ddbbc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d9775850ea2a9753fd6409dd7ddbbc4");
        }
        f();
        return (g == null || !g.containsKey(str)) ? "" : g.get(str).c;
    }

    private static void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e660ae9f9277767a576a1cbe33e5b1a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e660ae9f9277767a576a1cbe33e5b1a4");
        } else if (com.meituan.mmp.lib.mp.a.f() || g != null) {
        } else {
            String string = b(MMPEnvHelper.getContext()).getString("key_preload_strategy_config", "");
            Type type = new TypeToken<Map<String, q>>() { // from class: com.meituan.mmp.lib.engine.o.3
            }.getType();
            if (string != null) {
                try {
                    g = (Map) com.meituan.mmp.lib.utils.j.a(string, type);
                } catch (Exception e2) {
                    com.meituan.mmp.lib.trace.b.a("PreloadManager", "initPreloadStrategyMap", e2);
                }
            }
        }
    }

    public static boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6eda92d089be0edfa547e243a40ef73", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6eda92d089be0edfa547e243a40ef73")).booleanValue();
        }
        f();
        return g != null && g.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.lib.engine.o.a
        public final void a(String str, Map<String, Object> map, Integer num, long j, c cVar) {
            Object[] objArr = {str, map, num, new Long(j), cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e5592dac665430bdea2d5d600b39015", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e5592dac665430bdea2d5d600b39015");
                return;
            }
            com.meituan.mmp.lib.preformance.a.a(j);
            o.b(str, map, num, cVar);
        }

        @Override // com.meituan.mmp.lib.engine.o.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cbf881a80db37892c6152098dc78d1d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cbf881a80db37892c6152098dc78d1d");
            } else {
                o.c();
            }
        }
    }
}
