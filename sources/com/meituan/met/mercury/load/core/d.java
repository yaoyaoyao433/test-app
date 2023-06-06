package com.meituan.met.mercury.load.core;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.met.mercury.load.bean.ResourceNameVersion;
import com.meituan.met.mercury.load.repository.CheckResourceRequest;
import com.meituan.met.mercury.load.repository.FetchResourceRequest;
import com.meituan.met.mercury.load.repository.PresetResourceRequest;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a = null;
    private static final String g = "com.meituan.met.mercury.load.core.d";
    public String b;
    public boolean c;
    public q d;
    public boolean e;
    public String f;
    private ThreadPoolExecutor h;

    public static /* synthetic */ void a(DDResource dDResource, DDLoadStrategy dDLoadStrategy, long j) {
        Object[] objArr = {dDResource, dDLoadStrategy, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93b0624ecacd55a3552691d4555b7445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93b0624ecacd55a3552691d4555b7445");
        } else if (dDResource != null) {
            dDResource.markVisited();
            HashMap hashMap = new HashMap();
            hashMap.put("source", dDResource.isFromNet() ? "net" : dDResource.isPreset() ? "preset" : NetLogConstants.Details.CACHED);
            hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, a(dDLoadStrategy));
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, "0");
            com.meituan.met.mercury.load.report.e a2 = com.meituan.met.mercury.load.report.e.a();
            Float valueOf = Float.valueOf((float) j);
            Object[] objArr2 = {dDResource, "DDDBundleVisit", valueOf, hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.met.mercury.load.report.e.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "3bf2ad2402169bbdfab614e8dffd4ce7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "3bf2ad2402169bbdfab614e8dffd4ce7");
            } else if (dDResource == null || !c.f) {
            } else {
                a2.a(dDResource.getBusiness(), dDResource.getName(), dDResource.getVersion(), "DDDBundleVisit", valueOf, hashMap);
            }
        }
    }

    public static /* synthetic */ void a(String str, long j, DDLoadStrategy dDLoadStrategy, Exception exc) {
        String str2;
        String str3;
        Object[] objArr = {str, new Long(j), dDLoadStrategy, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str4 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "549f514fc5ca8d3257e8488b75127f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "549f514fc5ca8d3257e8488b75127f54");
            return;
        }
        int i = 100;
        String str5 = "fail";
        str2 = "empty";
        str3 = "empty";
        if (exc == null) {
            str5 = "nothing";
            str2 = "All";
            str3 = "All";
            i = 0;
        } else {
            try {
                str4 = exc.toString();
                if (exc instanceof f) {
                    f fVar = (f) exc;
                    str4 = fVar.getMessage();
                    i = fVar.c;
                    str2 = TextUtils.isEmpty(fVar.d) ? "empty" : fVar.d;
                    str3 = TextUtils.isEmpty(fVar.e) ? "empty" : fVar.e;
                    if (i == 10 || i == 9) {
                        str5 = "nothing";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                com.meituan.met.mercury.load.report.d.a("DDLoader", "reportBundleVisitException-" + str, e);
                return;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", str5);
        hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, a(dDLoadStrategy));
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, sb.toString());
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("errStr", str4);
        }
        com.meituan.met.mercury.load.report.e.a().a(str, str2, str3, "DDDBundleVisit", Float.valueOf((float) j), hashMap);
    }

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd528561b98d59efc6c0ca0c649a0c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd528561b98d59efc6c0ca0c649a0c8");
            return;
        }
        this.c = false;
        this.e = false;
        this.f = "";
        this.b = str;
        this.h = com.meituan.met.mercury.load.utils.g.a("CB-" + str);
    }

    public final void a(@NonNull String str, @NonNull DDLoadStrategy dDLoadStrategy, k kVar) {
        Object[] objArr = {str, dDLoadStrategy, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab39076b3aa304e38b57852509ef13d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab39076b3aa304e38b57852509ef13d");
        } else {
            a(str, dDLoadStrategy, (DDLoadParams) null, kVar);
        }
    }

    public final void a(@NonNull String str, @NonNull DDLoadStrategy dDLoadStrategy, DDLoadParams dDLoadParams, k kVar) {
        Object[] objArr = {str, dDLoadStrategy, dDLoadParams, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efb7c1454cedf8c26c1b538fa7c2b934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efb7c1454cedf8c26c1b538fa7c2b934");
        } else if (TextUtils.isEmpty(str)) {
            if (kVar != null) {
                kVar.onFail(new f((short) 1, "resourceName should not be empty"));
            }
        } else {
            HashSet hashSet = new HashSet();
            hashSet.add(str);
            a(dDLoadStrategy, dDLoadParams, hashSet, new a(this, dDLoadStrategy, hashSet, kVar));
        }
    }

    public final void a(@NonNull Set<String> set, @NonNull DDLoadStrategy dDLoadStrategy, k kVar) {
        Object[] objArr = {set, dDLoadStrategy, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225a413facb25930bc6cc3090bf11c1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225a413facb25930bc6cc3090bf11c1b");
        } else {
            a(set, dDLoadStrategy, (DDLoadParams) null, kVar);
        }
    }

    public final void a(@NonNull Set<String> set, @NonNull DDLoadStrategy dDLoadStrategy, DDLoadParams dDLoadParams, k kVar) {
        Object[] objArr = {set, dDLoadStrategy, dDLoadParams, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f8a47ebd541f7d70f46c88ff5002d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f8a47ebd541f7d70f46c88ff5002d1");
        } else if (set != null && !set.isEmpty()) {
            a(dDLoadStrategy, dDLoadParams, set, new a(this, dDLoadStrategy, set, kVar));
        } else if (kVar != null) {
            kVar.onFail(new f((short) 1, "resourceNames should not be null or empty!"));
        }
    }

    public final void a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079160d0312a81af2cc0b2eaf1c8c44a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079160d0312a81af2cc0b2eaf1c8c44a");
        } else {
            m.a().a(new PresetResourceRequest(this.b, new a(DDLoadStrategy.LOCAL_ONLY, (Set<String>) null, nVar)));
        }
    }

    public final void a(@NonNull String str, @NonNull String str2, k kVar) {
        Object[] objArr = {str, str2, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23fbb3daaa8508e700287fcb670de0c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23fbb3daaa8508e700287fcb670de0c9");
        } else {
            a(str, str2, (DDLoadParams) null, kVar);
        }
    }

    public final void a(@NonNull String str, @NonNull String str2, DDLoadParams dDLoadParams, k kVar) {
        Object[] objArr = {str, str2, dDLoadParams, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046b4ff05065f242837296b5409b01c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046b4ff05065f242837296b5409b01c8");
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            m.a().a(new FetchResourceRequest(this.b, dDLoadParams, new a(this, DDLoadStrategy.SPECIFIED, str, str2, kVar), str, str2));
        } else if (kVar != null) {
            kVar.onFail(new f((short) 1, "resourceName and resourceVersion should not be empty"));
        }
    }

    public final void b(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b749e51657cea35168bf3ebcf0864dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b749e51657cea35168bf3ebcf0864dd");
        } else {
            a((Set<String>) null, (DDLoadParams) null, nVar);
        }
    }

    private void a(Set<String> set, DDLoadParams dDLoadParams, n nVar) {
        Object[] objArr = {null, null, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b55e7a024543fbaa636f80cdf500aecd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b55e7a024543fbaa636f80cdf500aecd");
        } else {
            a((Set<String>) null, DDLoadStrategy.REMOTE_BUNDLES, (DDLoadParams) null, nVar);
        }
    }

    private void a(Set<String> set, @NonNull DDLoadStrategy dDLoadStrategy, DDLoadParams dDLoadParams, n nVar) {
        Object[] objArr = {set, dDLoadStrategy, dDLoadParams, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b89d64ff9b834e329ffd34c044f7cbf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b89d64ff9b834e329ffd34c044f7cbf5");
        } else {
            a(dDLoadStrategy, dDLoadParams, set, new a(dDLoadStrategy, set, nVar));
        }
    }

    public final void a(boolean z) {
        this.c = z;
    }

    @WorkerThread
    public final void a(@NonNull List<ResourceNameVersion> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d73aaa8a34053f28d7efd75143fbb056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d73aaa8a34053f28d7efd75143fbb056");
        } else {
            r.a(this.b).b(list);
        }
    }

    private void a(DDLoadStrategy dDLoadStrategy, DDLoadParams dDLoadParams, Set<String> set, a aVar) {
        DDLoadParams dDLoadParams2;
        Object[] objArr = {dDLoadStrategy, dDLoadParams, set, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5928faa0c85b5db0cc5a0d6b107333a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5928faa0c85b5db0cc5a0d6b107333a5");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ShieldMonitorKey.TAG_BUSINESS, this.b);
        hashMap.put("strategy", dDLoadStrategy);
        hashMap.put("params", dDLoadParams);
        hashMap.put("resourceNames", set);
        com.meituan.met.mercury.load.utils.c.a("DDLoader.loadResourcesInternal", hashMap);
        if (dDLoadStrategy == DDLoadStrategy.PRELOAD_META) {
            DDLoadParams dDLoadParams3 = dDLoadParams == null ? new DDLoadParams(0) : dDLoadParams;
            dDLoadParams3.tag = "prefetchMeta";
            dDLoadParams2 = dDLoadParams3;
        } else {
            dDLoadParams2 = dDLoadParams;
        }
        if (dDLoadParams2 != null && dDLoadParams2.extraParams != null && dDLoadParams2.extraParams.size() > 100) {
            aVar.onFail(new f((short) 1, "DDLoadParams extraParams size limit 100"));
            return;
        }
        CheckResourceRequest checkResourceRequest = new CheckResourceRequest(this.b, dDLoadStrategy, dDLoadParams2, aVar, set);
        switch (dDLoadStrategy) {
            case LOCAL_FIRST:
            case LOCAL_ONLY:
            case LOCAL_OR_NET:
                m.a().a(checkResourceRequest);
                return;
            case NET_FIRST:
            case NET_ONLY:
            case REMOTE_BUNDLES:
                o.a().a(checkResourceRequest);
                return;
            case PRELOAD_META:
            case CACHEMETA_OR_NET:
                p.a().a(checkResourceRequest);
                return;
            default:
                return;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements n {
        public static ChangeQuickRedirect a;
        long b;
        private DDLoadStrategy d;
        private Set<String> e;
        private List<ResourceNameVersion> f;
        private String g;
        private String h;
        private n i;

        public a(final DDLoadStrategy dDLoadStrategy, Set<String> set, final n nVar) {
            Object[] objArr = {d.this, dDLoadStrategy, set, nVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0701c3c315fd845ceb0216b09b7111b1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0701c3c315fd845ceb0216b09b7111b1");
                return;
            }
            this.b = System.currentTimeMillis();
            this.d = dDLoadStrategy;
            this.e = set;
            this.i = new n() { // from class: com.meituan.met.mercury.load.core.d.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.n
                public final void onSuccess(final List<DDResource> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0f962ff336926075290240aaffa5a90", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0f962ff336926075290240aaffa5a90");
                    } else if (dDLoadStrategy == DDLoadStrategy.REMOTE_BUNDLES || dDLoadStrategy == DDLoadStrategy.PRELOAD_META) {
                        if (nVar != null) {
                            d.this.h.execute(new Runnable() { // from class: com.meituan.met.mercury.load.core.d.a.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97b3bbaacb9db7db546a6f401d065ac8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97b3bbaacb9db7db546a6f401d065ac8");
                                    } else {
                                        nVar.onSuccess(list);
                                    }
                                }
                            });
                        }
                    } else {
                        if (!com.meituan.met.mercury.load.utils.d.a(list)) {
                            for (DDResource dDResource : list) {
                                d.a(dDResource, dDLoadStrategy, System.currentTimeMillis() - a.this.b);
                            }
                        } else {
                            d.a(d.this.b, System.currentTimeMillis() - a.this.b, dDLoadStrategy, (Exception) null);
                        }
                        if (nVar != null) {
                            d.this.h.execute(new Runnable() { // from class: com.meituan.met.mercury.load.core.d.a.1.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66b9eba81e03302e56b3fb6bf6592e90", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66b9eba81e03302e56b3fb6bf6592e90");
                                        return;
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put(ShieldMonitorKey.TAG_BUSINESS, d.this.b);
                                    hashMap.put("strategy", dDLoadStrategy);
                                    hashMap.put("ddResources", list);
                                    com.meituan.met.mercury.load.utils.c.a("MultiLoadCallback.onSuccess批量成功回调业务:", hashMap);
                                    nVar.onSuccess(list);
                                }
                            });
                        }
                    }
                }

                @Override // com.meituan.met.mercury.load.core.n
                public final void onFail(final Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38cbdf0bada82128950d39774c6432c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38cbdf0bada82128950d39774c6432c5");
                    } else if (dDLoadStrategy == DDLoadStrategy.REMOTE_BUNDLES || dDLoadStrategy == DDLoadStrategy.PRELOAD_META) {
                        if (nVar != null) {
                            d.this.h.execute(new Runnable() { // from class: com.meituan.met.mercury.load.core.d.a.1.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31b2f808d384d3ae8bd07c48cdc6618b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31b2f808d384d3ae8bd07c48cdc6618b");
                                    } else {
                                        nVar.onFail(exc);
                                    }
                                }
                            });
                        }
                    } else {
                        d.a(d.this.b, System.currentTimeMillis() - a.this.b, dDLoadStrategy, exc);
                        if (nVar != null) {
                            d.this.h.execute(new Runnable() { // from class: com.meituan.met.mercury.load.core.d.a.1.4
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "36156c5e62d7d2c65d36fbbc47f81e88", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "36156c5e62d7d2c65d36fbbc47f81e88");
                                        return;
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put(ShieldMonitorKey.TAG_BUSINESS, d.this.b);
                                    hashMap.put("strategy", dDLoadStrategy);
                                    hashMap.put("failMsg", exc == null ? "e is null" : exc.toString());
                                    com.meituan.met.mercury.load.utils.c.a("MultiLoadCallback.onFail批量失败回调业务:", hashMap);
                                    nVar.onFail(exc);
                                }
                            });
                        }
                    }
                }
            };
        }

        public a(final DDLoadStrategy dDLoadStrategy, final k kVar) {
            Object[] objArr = {d.this, dDLoadStrategy, kVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6126f1214b2b815a68028975f16cb033", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6126f1214b2b815a68028975f16cb033");
                return;
            }
            this.b = System.currentTimeMillis();
            this.d = dDLoadStrategy;
            this.i = new n() { // from class: com.meituan.met.mercury.load.core.d.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.n
                public final void onSuccess(List<DDResource> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62485c25e480ecd9274c77ea3b9b2518", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62485c25e480ecd9274c77ea3b9b2518");
                    } else if (!com.meituan.met.mercury.load.utils.d.a(list)) {
                        for (final DDResource dDResource : list) {
                            d.a(dDResource, dDLoadStrategy, System.currentTimeMillis() - a.this.b);
                            if (kVar != null) {
                                d.this.h.execute(new Runnable() { // from class: com.meituan.met.mercury.load.core.d.a.2.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b847489845fda63be8af2b1138b10986", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b847489845fda63be8af2b1138b10986");
                                            return;
                                        }
                                        HashMap hashMap = new HashMap();
                                        hashMap.put(ShieldMonitorKey.TAG_BUSINESS, d.this.b);
                                        hashMap.put("strategy", dDLoadStrategy);
                                        hashMap.put("ddResource", dDResource);
                                        com.meituan.met.mercury.load.utils.c.a("LoadCallback.onSuccess单个回调业务:", hashMap);
                                        kVar.onSuccess(dDResource);
                                    }
                                });
                            }
                        }
                    } else {
                        d.a(d.this.b, System.currentTimeMillis() - a.this.b, dDLoadStrategy, (Exception) null);
                        if (kVar != null) {
                            d.this.h.execute(new Runnable() { // from class: com.meituan.met.mercury.load.core.d.a.2.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cc92ad83029bd61b0f2d4d4c4d887ac3", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cc92ad83029bd61b0f2d4d4c4d887ac3");
                                        return;
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put(ShieldMonitorKey.TAG_BUSINESS, d.this.b);
                                    hashMap.put("strategy", dDLoadStrategy);
                                    com.meituan.met.mercury.load.utils.c.a("LoadCallback.onSuccess单个回调业务无资源:", hashMap);
                                    kVar.onSuccess(null);
                                }
                            });
                        }
                    }
                }

                @Override // com.meituan.met.mercury.load.core.n
                public final void onFail(final Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3a881e0e007d184c6e2cb2ee724057e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3a881e0e007d184c6e2cb2ee724057e");
                        return;
                    }
                    d.a(d.this.b, System.currentTimeMillis() - a.this.b, dDLoadStrategy, exc);
                    if (kVar != null) {
                        d.this.h.execute(new Runnable() { // from class: com.meituan.met.mercury.load.core.d.a.2.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "50ef194c449def51cdcd0499ca9ecca1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "50ef194c449def51cdcd0499ca9ecca1");
                                    return;
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put(ShieldMonitorKey.TAG_BUSINESS, d.this.b);
                                hashMap.put("strategy", dDLoadStrategy);
                                hashMap.put("failMsg", exc == null ? "e is null" : exc.toString());
                                com.meituan.met.mercury.load.utils.c.a("LoadCallback.onFail单个回调业务:", hashMap);
                                kVar.onFail(exc);
                            }
                        });
                    }
                }
            };
        }

        public a(d dVar, DDLoadStrategy dDLoadStrategy, Set<String> set, k kVar) {
            this(dDLoadStrategy, kVar);
            Object[] objArr = {dVar, dDLoadStrategy, set, kVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13ef6ac2bd6836bb7a1a14ade5adf1e1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13ef6ac2bd6836bb7a1a14ade5adf1e1");
            } else {
                this.e = set;
            }
        }

        public a(d dVar, DDLoadStrategy dDLoadStrategy, String str, String str2, k kVar) {
            this(dDLoadStrategy, kVar);
            Object[] objArr = {dVar, dDLoadStrategy, str, str2, kVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f695aedf03b78c2e87468dbcd0c262a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f695aedf03b78c2e87468dbcd0c262a8");
                return;
            }
            this.g = str;
            this.h = str2;
            this.e = new HashSet();
            this.e.add(str);
        }

        public a(d dVar, DDLoadStrategy dDLoadStrategy, List<ResourceNameVersion> list, k kVar) {
            this(dDLoadStrategy, kVar);
            Object[] objArr = {dVar, dDLoadStrategy, list, kVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7119e9fe682fd06e47bd36179caebf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7119e9fe682fd06e47bd36179caebf");
            } else {
                this.f = list;
            }
        }

        @Override // com.meituan.met.mercury.load.core.n
        public final void onSuccess(List<DDResource> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada8ed93d2ef0f5633e784ed4bd7454b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada8ed93d2ef0f5633e784ed4bd7454b");
            } else {
                this.i.onSuccess(list);
            }
        }

        @Override // com.meituan.met.mercury.load.core.n
        public final void onFail(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec052207e54b8df96d0f78cb20c357ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec052207e54b8df96d0f78cb20c357ab");
            } else {
                this.i.onFail(exc);
            }
        }
    }

    private static String a(DDLoadStrategy dDLoadStrategy) {
        Object[] objArr = {dDLoadStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b9b04109323dc9c7ba9bf5be81c9bc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b9b04109323dc9c7ba9bf5be81c9bc5");
        }
        switch (dDLoadStrategy) {
            case LOCAL_FIRST:
                return "cacheFirst";
            case LOCAL_ONLY:
                return "cacheOnly";
            case LOCAL_OR_NET:
                return "localOrNet";
            case NET_FIRST:
                return "netFirst";
            case NET_ONLY:
                return "netOnly";
            case REMOTE_BUNDLES:
                return "remoteBundles";
            case PRELOAD_META:
                return "preloadMeta";
            case CACHEMETA_OR_NET:
                return "cacheMetaOrNet";
            case SPECIFIED:
                return SocialConstants.PARAM_SPECIFIED;
            case LOCAL_DOWNLOAD:
                return "localDownload";
            default:
                return "";
        }
    }
}
