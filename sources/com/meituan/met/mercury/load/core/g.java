package com.meituan.met.mercury.load.core;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.cipstorage.ag;
import com.meituan.met.mercury.load.bean.ResourceIdVersion;
import com.meituan.met.mercury.load.bean.StoreThresholdInfo;
import com.meituan.met.mercury.load.utils.f;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final Object d = new Object();
    private static final HashMap<String, d> e = new HashMap<>();
    private static final CountDownLatch f = new CountDownLatch(1);
    private static final ExecutorService g = com.sankuai.android.jarvis.c.a("DDD-push-dispatch");

    public static /* synthetic */ void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c25ab046cb908aadbafff547d6985f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c25ab046cb908aadbafff547d6985f4");
        } else if (e.g) {
            try {
                File a2 = e.a(1);
                if (a2.exists()) {
                    com.meituan.met.mercury.load.utils.e.b(a2);
                }
                File a3 = e.a(0);
                if (a3.exists()) {
                    com.meituan.met.mercury.load.utils.e.b(a3);
                }
                m.a(false);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(final String str, final String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dae97f16cc8e20a416a289d88e8f45a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dae97f16cc8e20a416a289d88e8f45a");
        } else {
            g.execute(new Runnable() { // from class: com.meituan.met.mercury.load.core.g.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83b53d0c247d462091bc66ce4cf6b403", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83b53d0c247d462091bc66ce4cf6b403");
                        return;
                    }
                    com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("dispatchOfflineInfo");
                    bVar.a(ShieldMonitorKey.TAG_BUSINESS, str);
                    bVar.a("name", str2);
                    bVar.a("version", str3);
                    com.meituan.met.mercury.load.utils.c.a(bVar);
                    if (!TextUtils.equals(ContainerInfo.ENV_MSC, str)) {
                        r.a(str).a(Collections.singletonList(new ResourceIdVersion(str2, str3)), 90);
                    }
                    if (g.a(str).d != null) {
                        g.a(str).d.a(str, str2, str3);
                    }
                    r.a(str, str2, str3, "", 91);
                }
            });
        }
    }

    public static /* synthetic */ void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61267d44a4d7f48243bbfdd51e38167f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61267d44a4d7f48243bbfdd51e38167f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.met.mercury.load.utils.f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "20ad06b00d8aa28d12c8e07c9145eb77", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "20ad06b00d8aa28d12c8e07c9145eb77")).booleanValue();
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.met.mercury.load.utils.f.a;
            if (System.currentTimeMillis() - (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3a8edba889f3d3df6a8de713dc32e6b6", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3a8edba889f3d3df6a8de713dc32e6b6")).longValue() : e.m().b("threshold_refresh_time", 0L)) > 86400000) {
                z = true;
            }
        }
        if (z || e.d) {
            com.sankuai.android.jarvis.c.a("DDD-refresh-threshold", new Runnable() { // from class: com.meituan.met.mercury.load.core.g.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    Call<ap> storeThresholdInfo;
                    StoreThresholdInfo storeThresholdInfo2;
                    Set<String> a2;
                    long j;
                    long j2;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c5c70cca8f4b7699f03021f5402fb26f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c5c70cca8f4b7699f03021f5402fb26f");
                        return;
                    }
                    com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("storeThresholdRecycleTag");
                    try {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.met.mercury.load.utils.f.a;
                        long longValue = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "128d1ea4ec07563d0cb238a4692e895c", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "128d1ea4ec07563d0cb238a4692e895c")).longValue() : e.m().b("threshold_version", 0L);
                        com.meituan.met.mercury.load.retrofit.b a3 = com.meituan.met.mercury.load.retrofit.b.a();
                        Object[] objArr6 = {new Long(longValue)};
                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.met.mercury.load.retrofit.b.a;
                        if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect6, false, "e17bec01fefed06a48b12ddd925731e7", RobustBitConfig.DEFAULT_VALUE)) {
                            storeThresholdInfo = (Call) PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect6, false, "e17bec01fefed06a48b12ddd925731e7");
                        } else {
                            if (!e.l() && !e.f) {
                                str = "https://dd.meituan.com/";
                                storeThresholdInfo = a3.b.getStoreThresholdInfo((str + "config/getStoreThreshold?") + "platform=Android&applicationId=" + e.g() + "&version=" + longValue);
                            }
                            str = "https://ddapi.fe.test.sankuai.com/";
                            storeThresholdInfo = a3.b.getStoreThresholdInfo((str + "config/getStoreThreshold?") + "platform=Android&applicationId=" + e.g() + "&version=" + longValue);
                        }
                        Response<ap> a4 = storeThresholdInfo.a();
                        if (a4.b() == 200) {
                            String string = a4.e().string();
                            bVar.a(APKStructure.Res_Type, string);
                            storeThresholdInfo2 = (StoreThresholdInfo) com.meituan.met.mercury.load.utils.a.a(string, (Class<Object>) StoreThresholdInfo.class);
                            if (storeThresholdInfo2 != null) {
                                long j3 = storeThresholdInfo2.version;
                                Object[] objArr7 = {new Long(j3)};
                                ChangeQuickRedirect changeQuickRedirect7 = com.meituan.met.mercury.load.utils.f.a;
                                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "4a25e783df2d71d63ed98782dca4dc61", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "4a25e783df2d71d63ed98782dca4dc61");
                                } else {
                                    e.m().a("threshold_version", j3);
                                }
                                Object[] objArr8 = {storeThresholdInfo2};
                                ChangeQuickRedirect changeQuickRedirect8 = com.meituan.met.mercury.load.utils.f.a;
                                if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "5bb49b85328cd082c5d12f6fbfd554ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "5bb49b85328cd082c5d12f6fbfd554ca");
                                } else {
                                    e.m().a("threshold_info", (String) storeThresholdInfo2, (ag<String>) new f.a());
                                }
                                g.c();
                            }
                        } else {
                            storeThresholdInfo2 = null;
                        }
                        if (storeThresholdInfo2 == null) {
                            storeThresholdInfo2 = com.meituan.met.mercury.load.utils.f.a();
                            bVar.a("info", storeThresholdInfo2);
                        }
                        if (storeThresholdInfo2 != null && (a2 = r.a()) != null && a2.size() > 0) {
                            for (String str2 : a2) {
                                if (storeThresholdInfo2.content == null || !storeThresholdInfo2.content.containsKey(str2) || storeThresholdInfo2.content.get(str2) == null) {
                                    j = 0;
                                    j2 = 0;
                                } else {
                                    j2 = storeThresholdInfo2.content.get(str2).size;
                                    j = 0;
                                }
                                long j4 = j2 <= j ? storeThresholdInfo2.defaultThreshold : j2;
                                if (j4 > j) {
                                    r.a(str2).a(j4);
                                }
                            }
                        }
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = com.meituan.met.mercury.load.utils.f.a;
                        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "b941000a5d35ffabe821318437385dd5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "b941000a5d35ffabe821318437385dd5");
                        } else {
                            e.m().a("threshold_refresh_time", System.currentTimeMillis());
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        bVar.a(NotificationCompat.CATEGORY_ERROR, e2.toString());
                    } finally {
                        com.meituan.met.mercury.load.utils.c.a(bVar);
                    }
                }
            }).start();
        }
    }

    public static /* synthetic */ void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dac58456e448a2dc0d0b479abf3e437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dac58456e448a2dc0d0b479abf3e437");
        } else if (c.j) {
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("init cache keep");
            try {
                StoreThresholdInfo a2 = com.meituan.met.mercury.load.utils.f.a();
                if (a2 != null && !com.meituan.met.mercury.load.utils.d.a(a2.bundleSetting)) {
                    for (StoreThresholdInfo.BundleSetting bundleSetting : a2.bundleSetting) {
                        if (bundleSetting != null && !TextUtils.isEmpty(bundleSetting.name) && bundleSetting.keepVersionCount > 0) {
                            r.b.put(bundleSetting.name, Integer.valueOf(bundleSetting.keepVersionCount));
                        }
                    }
                    bVar.a("keepInfo", r.b.toString());
                    com.meituan.met.mercury.load.utils.c.a(bVar);
                }
            } catch (Exception e2) {
                bVar.a("excep", e2.toString());
                com.meituan.met.mercury.load.utils.c.a(bVar);
                e2.printStackTrace();
            }
        }
    }

    public static void a(final Context context, final l lVar) {
        Object[] objArr = {context, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c86f83223c2671d877cf1a6f05c9894d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c86f83223c2671d877cf1a6f05c9894d");
            return;
        }
        if (b.compareAndSet(false, true)) {
            com.meituan.met.mercury.load.utils.c.a("DDLoaderManager init");
            e.a(context, lVar);
            com.sankuai.android.jarvis.c.a("DDD-init", new a()).start();
        }
        if (ProcessUtils.isMainProcess(context)) {
            Object[] objArr2 = {context, lVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c53878701ce66a44c025f646df797d7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c53878701ce66a44c025f646df797d7d");
            } else if (lVar == null || lVar.getPushImpl() == null || !c.compareAndSet(false, true)) {
            } else {
                com.sankuai.android.jarvis.c.a("DDD-init-push", new Runnable() { // from class: com.meituan.met.mercury.load.core.g.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f9d870d92af5493339650269bdb67dc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f9d870d92af5493339650269bdb67dc");
                            return;
                        }
                        g.b("DDD-init-push");
                        if (c.q) {
                            j pushImpl = l.this.getPushImpl();
                            if (e.d) {
                                pushImpl.a(e.h);
                            }
                            pushImpl.a(context, new q() { // from class: com.meituan.met.mercury.load.core.g.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.met.mercury.load.core.q
                                public final void a(String str, String str2, String str3) {
                                    Object[] objArr4 = {str, str2, str3};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "46e803d759c8c24ac55221237a0cbdb5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "46e803d759c8c24ac55221237a0cbdb5");
                                    } else {
                                        g.a(str, str2, str3);
                                    }
                                }
                            });
                            com.meituan.met.mercury.load.utils.c.a("DDLoaderManager init push run over!");
                        }
                    }
                }).start();
            }
        }
    }

    public static d a(String str) {
        d dVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba4870f62bf72f0c67b5058037a87839", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba4870f62bf72f0c67b5058037a87839");
        }
        if (!b.get()) {
            String str2 = "getLoader() before init, business is " + str;
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.met.mercury.load.utils.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "25f7110948de630e3d5787760b5f7059", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "25f7110948de630e3d5787760b5f7059");
            } else {
                Object[] objArr3 = {str2, null};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.met.mercury.load.utils.c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "83b9ed8587d4cf2979faecc31a708469", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "83b9ed8587d4cf2979faecc31a708469");
                } else {
                    Object[] objArr4 = {str2, null, null, null};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.met.mercury.load.utils.c.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ad23b9587ebfc51425d89946a5b7ca6f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ad23b9587ebfc51425d89946a5b7ca6f");
                    } else if (!TextUtils.isEmpty(str2)) {
                        com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b(str2);
                        if (!TextUtils.isEmpty(null)) {
                            bVar.b(null);
                        }
                        bVar.a((Throwable) null);
                        com.meituan.met.mercury.load.utils.c.b(bVar);
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            throw new f((short) 1, "business can not be empty!");
        }
        synchronized (d) {
            dVar = e.get(str);
            if (dVar == null) {
                dVar = new d(str);
                e.put(str, dVar);
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9af32be1697ebe73f755cc8a391c39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9af32be1697ebe73f755cc8a391c39");
                return;
            }
            e.a();
            c.a();
            g.a();
            if (ProcessUtils.isMainProcess(e.b())) {
                try {
                    m.b();
                    r.b();
                    g.b();
                    g.c();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            com.meituan.met.mercury.load.utils.c.a("DDLoaderManager InitRunnable run over!");
            g.f.countDown();
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dd6802b69a7f20210620201cae55b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dd6802b69a7f20210620201cae55b90");
            return;
        }
        while (true) {
            try {
                f.await();
                return;
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }
}
