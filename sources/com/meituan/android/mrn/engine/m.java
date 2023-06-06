package com.meituan.android.mrn.engine;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static /* synthetic */ void a(k kVar, long j) {
        int intValue;
        Object[] objArr = {kVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "631cc78f381582f31e219c095ab0b8cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "631cc78f381582f31e219c095ab0b8cd");
            return;
        }
        int i = ((int) j) / 1048576;
        com.meituan.android.mrn.config.horn.f fVar = com.meituan.android.mrn.config.horn.f.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.config.horn.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "93019285e1f30cfb07e28b67e2b78a64", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "93019285e1f30cfb07e28b67e2b78a64")).booleanValue() : ((Boolean) com.meituan.android.mrn.config.t.b.a("enableDestroyInstanceWhenJSEOOM")).booleanValue()) {
            com.meituan.android.mrn.config.horn.f fVar2 = com.meituan.android.mrn.config.horn.f.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.config.horn.f.a;
            if (PatchProxy.isSupport(objArr3, fVar2, changeQuickRedirect3, false, "d36bed74e520011d73c03f75f2371108", RobustBitConfig.DEFAULT_VALUE)) {
                intValue = ((Integer) PatchProxy.accessDispatch(objArr3, fVar2, changeQuickRedirect3, false, "d36bed74e520011d73c03f75f2371108")).intValue();
            } else {
                intValue = ((Integer) com.meituan.android.mrn.config.t.b.a("destroyInstanceJSESize")).intValue();
                if (intValue <= 100) {
                    intValue = 100;
                }
            }
            if (i >= intValue && kVar != null && kVar.i != null && kVar.f == p.DIRTY && kVar.f() == 0) {
                kVar.e();
                com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a().a(kVar.i).a("engine_count", String.valueOf(o.a().c())).a("history_page_count", String.valueOf(kVar.g)).a("phone_memory", String.valueOf(com.meituan.android.mrn.utils.b.a()));
                long j2 = i;
                Object[] objArr4 = {new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.monitor.g.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "36f7eae9254a3307e453b1607de00a99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "36f7eae9254a3307e453b1607de00a99");
                    return;
                }
                float f = (float) j2;
                a2.b("MRNJSEOOM", f);
                a2.c("MRNJSEOOM", f);
            }
        }
    }

    public static void a(ReactContext reactContext, final com.meituan.android.mrn.utils.f<Long> fVar) {
        Object[] objArr = {reactContext, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94a31088dcd5b82b79e2bf2c90868211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94a31088dcd5b82b79e2bf2c90868211");
        } else if (reactContext == null || fVar == null) {
            new NullPointerException("ReactContext is null");
        } else {
            final WeakReference weakReference = new WeakReference(reactContext);
            reactContext.runOnJSQueueThread(new Runnable() { // from class: com.meituan.android.mrn.engine.m.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92c6b9c8c3ae69858d3e1197b40dba35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92c6b9c8c3ae69858d3e1197b40dba35");
                        return;
                    }
                    ReactContext reactContext2 = (ReactContext) weakReference.get();
                    if (reactContext2 == null) {
                        new NullPointerException("ReactContext is null");
                        return;
                    }
                    CatalystInstance catalystInstance = reactContext2.getCatalystInstance();
                    if (catalystInstance == null) {
                        new NullPointerException("CatalystInstance is null");
                    } else {
                        fVar.a(Long.valueOf(catalystInstance.getMemoryUsage()));
                    }
                }
            });
        }
    }

    public static void a(ReactInstanceManager reactInstanceManager, String str, int i) {
        Object[] objArr = {reactInstanceManager, null, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9938916809e6719d2b8bd6215e83c626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9938916809e6719d2b8bd6215e83c626");
        } else {
            a(null, reactInstanceManager, null, 1);
        }
    }

    public static void a(k kVar, String str, int i) {
        Object[] objArr = {kVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55e73a35b760e81bed6c337bca50c2d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55e73a35b760e81bed6c337bca50c2d2");
        } else {
            a(kVar, null, str, i);
        }
    }

    private static void a(k kVar, ReactInstanceManager reactInstanceManager, String str, int i) {
        Object[] objArr = {kVar, reactInstanceManager, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b93c88b5c25cd30573ddde27c513c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b93c88b5c25cd30573ddde27c513c0e");
            return;
        }
        if (i == 1) {
            if (b) {
                return;
            }
            b = true;
        }
        if (kVar == null && reactInstanceManager == null) {
            return;
        }
        if (kVar != null) {
            reactInstanceManager = kVar.b;
        }
        if (reactInstanceManager == null) {
            return;
        }
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        final a aVar = new a(kVar, str, i);
        if (currentReactContext != null && reactInstanceManager.hasInitializeReactContext()) {
            if (currentReactContext.getCatalystInstance() == null) {
                return;
            }
            a(currentReactContext, aVar);
            return;
        }
        reactInstanceManager.addReactInstanceEventListener(new ReactInstanceManager.b() { // from class: com.meituan.android.mrn.engine.m.3
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.ReactInstanceManager.b
            public final void onReactContextInitialized(ReactContext reactContext) {
                Object[] objArr2 = {reactContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d634940c23295efc3e75fcdacc4f654", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d634940c23295efc3e75fcdacc4f654");
                } else if (reactContext == null || reactContext.getCatalystInstance() == null) {
                } else {
                    m.a(reactContext, a.this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements com.meituan.android.mrn.utils.f<Long> {
        public static ChangeQuickRedirect a;
        private k b;
        private e c;
        private String d;
        private int e;
        private int f;
        private int g;
        private int h;

        @Override // com.meituan.android.mrn.utils.f
        public final /* synthetic */ void a(Long l) {
            Long l2 = l;
            Object[] objArr = {l2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab01efe455ccc50c52f5577de5b3e2c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab01efe455ccc50c52f5577de5b3e2c");
                return;
            }
            if (this.h == 3) {
                m.a(this.b, l2.longValue());
            }
            com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a().a(this.c).a("enable_gc", com.meituan.android.mrn.config.horn.f.b.b() ? "1" : "0").a("page_count", String.valueOf(this.f)).a("engine_count", String.valueOf(o.a().c())).a("history_page_count", String.valueOf(this.g)).a(Constants.SPEED_METER_STEP, String.valueOf(this.h)).a("component_name", this.d).a("fetch_bridge_type", String.valueOf(this.e));
            long longValue = l2.longValue() / 1024;
            Object[] objArr2 = {new Long(longValue)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.monitor.g.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a3f04b7cc6056dc26be549344726a57d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a3f04b7cc6056dc26be549344726a57d");
                return;
            }
            float f = (float) longValue;
            a2.b("MRNJSEMemoryUsage", f);
            a2.c("MRNJSEMemoryUsage", f);
        }

        public a(k kVar, String str, int i) {
            Object[] objArr = {kVar, str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eba41cdbdfc5113815412ea76c7f181b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eba41cdbdfc5113815412ea76c7f181b");
                return;
            }
            this.f = 0;
            this.g = 0;
            this.h = -1;
            this.h = i;
            this.d = str;
            if (kVar != null) {
                this.b = kVar;
                this.c = kVar.i;
                this.f = kVar.f();
                this.g = kVar.g;
                this.e = kVar.d;
            }
        }
    }

    public static void a(k kVar) {
        ReactContext currentReactContext;
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a5433d4e04106493b1a1de227d76fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a5433d4e04106493b1a1de227d76fc8");
        } else if (!com.meituan.android.mrn.config.horn.f.b.b() || kVar == null || kVar.b == null || (currentReactContext = kVar.b.getCurrentReactContext()) == null) {
        } else {
            final e eVar = kVar.i;
            final int f = kVar.f();
            final int i = kVar.g;
            final com.meituan.android.mrn.utils.f<Long> fVar = new com.meituan.android.mrn.utils.f<Long>() { // from class: com.meituan.android.mrn.engine.m.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.utils.f
                public final /* synthetic */ void a(Long l) {
                    Long l2 = l;
                    Object[] objArr2 = {l2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8302df2ca22f06c600aeaf19fc7dadd7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8302df2ca22f06c600aeaf19fc7dadd7");
                        return;
                    }
                    com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a().a(e.this).a("engine_count", String.valueOf(o.a().c())).a("history_page_count", String.valueOf(i)).a("phone_memory", String.valueOf(com.meituan.android.mrn.utils.b.a())).a("page_count", String.valueOf(f));
                    long longValue = l2.longValue() / 1024;
                    Object[] objArr3 = {new Long(longValue)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.monitor.g.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "26abfa9519ee2f14afefe2944db782bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "26abfa9519ee2f14afefe2944db782bc");
                        return;
                    }
                    float f2 = (float) longValue;
                    a2.b("MRNJSEMemoryGCSize", f2);
                    a2.c("MRNJSEMemoryGCSize", f2);
                }
            };
            Object[] objArr2 = {currentReactContext, fVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0cc3491bc8d017780a0456295dfa3a90", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0cc3491bc8d017780a0456295dfa3a90");
            } else if (currentReactContext == null) {
                new NullPointerException("ReactContext is null");
            } else {
                final WeakReference weakReference = new WeakReference(currentReactContext);
                currentReactContext.runOnJSQueueThread(new Runnable() { // from class: com.meituan.android.mrn.engine.m.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c7ab4fbc20be02d6382fb932640a178", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c7ab4fbc20be02d6382fb932640a178");
                            return;
                        }
                        ReactContext reactContext = (ReactContext) weakReference.get();
                        if (reactContext == null) {
                            new NullPointerException("ReactContext is null");
                            return;
                        }
                        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
                        if (catalystInstance == null) {
                            new NullPointerException("CatalystInstance is null");
                            return;
                        }
                        long memoryUsage = catalystInstance.getMemoryUsage();
                        catalystInstance.garbageCollect();
                        fVar.a(Long.valueOf(memoryUsage - catalystInstance.getMemoryUsage()));
                    }
                });
            }
        }
    }
}
