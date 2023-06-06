package com.meituan.android.mrn.engine;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.android.mrn.IMRNPackageBuilder;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect a;
    private static volatile n d;
    private static volatile boolean e;
    private static volatile long i;
    public k b;
    public int c;
    private Context f;
    private MRNBundleManager g;
    private Handler h;
    private volatile boolean j;

    public static /* synthetic */ void a(n nVar, final k kVar) {
        JSBundleLoader jSBundleLoader;
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "06883c08203c1ab8c34e1c02cce89fb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "06883c08203c1ab8c34e1c02cce89fb6");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@createReactInstanceWithExceptionCatch]", kVar);
        Object[] objArr2 = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "76346acf25ce7cd14ebef11f6ec9ae9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "76346acf25ce7cd14ebef11f6ec9ae9c");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@createReactInstanceManager]", kVar);
        kVar.e = System.currentTimeMillis();
        com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@createReactInstanceManager]", "first");
        final ReactInstanceManager reactInstanceManager = kVar.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        e commonBundle = PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "1de5b62c6628a07840ef0acfaef341a3", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "1de5b62c6628a07840ef0acfaef341a3") : nVar.g.getCommonBundle(MRNBundleManager.BASE_BUNDLE_NAME);
        if (commonBundle == null) {
            kVar.a(com.meituan.android.mrn.config.q.LOCAL_BASE_NOT_FOUND);
            com.meituan.android.mrn.utils.c.a("[MRNInstanceManager@createReactInstanceManager]", "baseBundle 为空");
        }
        kVar.j = commonBundle;
        Object[] objArr4 = {commonBundle};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, nVar, changeQuickRedirect4, false, "76b82b98a95f2e6189bf7e2e5d660126", RobustBitConfig.DEFAULT_VALUE)) {
            jSBundleLoader = (JSBundleLoader) PatchProxy.accessDispatch(objArr4, nVar, changeQuickRedirect4, false, "76b82b98a95f2e6189bf7e2e5d660126");
        } else {
            com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@createBaseJSBundleLoader]", commonBundle);
            if (commonBundle != null && !TextUtils.isEmpty(commonBundle.c)) {
                if (commonBundle.d()) {
                    jSBundleLoader = commonBundle.f();
                } else {
                    com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@createBaseJSBundleLoader]", "bundleFile不存在或非标准文件");
                }
            }
            jSBundleLoader = null;
        }
        if (jSBundleLoader != null) {
            try {
                reactInstanceManager.runCommonJSBundle(jSBundleLoader);
                com.meituan.android.mrn.codecache.c.a().a(commonBundle);
                m.a(kVar, (String) null, 1);
            } catch (Throwable th) {
                e eVar = kVar.j;
                Object[] objArr5 = {eVar};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, nVar, changeQuickRedirect5, false, "f9051103f2664820089fbf5fbbc73004", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, nVar, changeQuickRedirect5, false, "f9051103f2664820089fbf5fbbc73004");
                } else if (eVar != null) {
                    String str = eVar.f;
                    if (!TextUtils.isEmpty(str)) {
                        String format = String.format("%s", str);
                        com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a();
                        Object[] objArr6 = {format, (byte) 0};
                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.mrn.monitor.g.a;
                        if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "a34fd232549fcdfad633bc069aaad199", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "a34fd232549fcdfad633bc069aaad199");
                        } else {
                            Object[] objArr7 = {format};
                            ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.mrn.monitor.g.a;
                            (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "96694d0f5c7783d2f2b7dc076a902bed", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.monitor.g) PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "96694d0f5c7783d2f2b7dc076a902bed") : a2.a("mrn_base_common_version", format)).b("MRNInitSuccess", 0.0f);
                        }
                    }
                    com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@reportCommonBundleLoadError]", String.format("mrn_init_fail&baseversion=%s", str));
                }
                com.meituan.android.mrn.utils.c.a("[MRNInstanceManager@createReactInstanceManager]", th);
                kVar.a(com.meituan.android.mrn.config.q.LOAD_BASE_ERROR);
            }
        }
        Object[] objArr8 = {reactInstanceManager};
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, nVar, changeQuickRedirect8, false, "1d1df72028183472dbb91780fa80ea33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, nVar, changeQuickRedirect8, false, "1d1df72028183472dbb91780fa80ea33");
        } else if (!com.meituan.android.mrn.debug.a.c()) {
            com.meituan.hotel.android.hplus.diagnoseTool.b.b();
            if (!TextUtils.isEmpty(null)) {
                reactInstanceManager.runCommonJSBundle(JSBundleLoader.createFileLoader(null));
            }
        }
        com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@createReactInstanceManager]", "run common bundle finish " + kVar);
        reactInstanceManager.addReactInstanceEventListener(new ReactInstanceManager.b() { // from class: com.meituan.android.mrn.engine.n.5
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.ReactInstanceManager.b
            public final void onReactContextInitialized(ReactContext reactContext) {
                Object[] objArr9 = {reactContext};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "d9945e2649cad2028fca00b3d0460ce7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "d9945e2649cad2028fca00b3d0460ce7");
                    return;
                }
                reactInstanceManager.removeReactInstanceEventListener(this);
                if (kVar.f == p.PENDING || kVar.f == p.UNKNOWN) {
                    kVar.f = p.READY;
                }
                com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@onReactContextInitialized]", "nofakeapp:" + kVar);
                n.b(n.this, kVar);
                kVar.a();
            }
        });
        ai.a(new Runnable() { // from class: com.meituan.android.mrn.engine.n.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "b982603a4673deeb67828cfb00982543", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "b982603a4673deeb67828cfb00982543");
                    return;
                }
                com.facebook.react.modules.core.g.a();
                boolean hasStartedCreatingInitialContext = reactInstanceManager.hasStartedCreatingInitialContext();
                com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@createReactInstanceManager@run]", "hasStartedCreatingInitialContext:" + hasStartedCreatingInitialContext + CommonConstant.Symbol.COMMA + reactInstanceManager + CommonConstant.Symbol.COMMA + kVar);
                if (hasStartedCreatingInitialContext) {
                    return;
                }
                reactInstanceManager.createReactContextInBackground();
            }
        });
    }

    public static /* synthetic */ void b(n nVar, k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "f50319b98c98c49fa7e6217f3c0147f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "f50319b98c98c49fa7e6217f3c0147f3");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - kVar.e;
        com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a().a("isFirst", String.valueOf(nVar.j ? 1 : 0));
        Object[] objArr2 = {new Long(currentTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.monitor.g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "69621bcab3145f7e76963a7d0749a655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "69621bcab3145f7e76963a7d0749a655");
        } else {
            try {
                a2.b("MRNInitAppTime", (float) currentTimeMillis);
            } catch (Exception e2) {
                com.facebook.common.logging.a.d(com.meituan.android.mrn.monitor.g.b, e2.getMessage(), e2);
            }
        }
        nVar.j = false;
    }

    public static synchronized n a(Context context) {
        synchronized (n.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f820a47a3fc584cccd6e2452ce0bb73", RobustBitConfig.DEFAULT_VALUE)) {
                return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f820a47a3fc584cccd6e2452ce0bb73");
            } else if (context == null) {
                throw new IllegalArgumentException("Invalid application argument");
            } else {
                if (d == null) {
                    d = new n(context);
                }
                e = true;
                return d;
            }
        }
    }

    public static synchronized n a() {
        synchronized (n.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17239b2bd55c69e6b96c2b4bfc2a1e4c", RobustBitConfig.DEFAULT_VALUE)) {
                return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17239b2bd55c69e6b96c2b4bfc2a1e4c");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "44bdf1de5f23c2425370916e7e8084d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "44bdf1de5f23c2425370916e7e8084d9");
            } else if (!e) {
                throw new IllegalStateException("MRNInstanceManager::createInstance() needs to be called before MRNInstanceManager::getInstance()");
            }
            return d;
        }
    }

    private n(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bd217966a2db65535484ca3e4b42c91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bd217966a2db65535484ca3e4b42c91");
            return;
        }
        this.j = true;
        this.c = 0;
        this.f = context.getApplicationContext();
        com.meituan.android.mrn.debug.a.a(com.meituan.android.mrn.debug.a.c(context));
        com.meituan.android.mrn.debug.a.b(com.meituan.android.mrn.debug.a.a(context));
        com.meituan.android.mrn.debug.a.c(com.meituan.android.mrn.debug.a.b(context));
        this.g = MRNBundleManager.createInstance(context);
        this.h = new Handler(Looper.getMainLooper());
        this.h.post(new Runnable() { // from class: com.meituan.android.mrn.engine.n.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b0935c93a60b9ba0d128eb780d0ce4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b0935c93a60b9ba0d128eb780d0ce4c");
                    return;
                }
                com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@run]", "ReactChoreographer");
                com.facebook.react.modules.core.g.a();
            }
        });
        com.meituan.android.mrn.monitor.g.a(context);
        new d(context).a();
    }

    @Deprecated
    public final synchronized k a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c6ab73f9d0e3411c9dadf31939afdfd", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c6ab73f9d0e3411c9dadf31939afdfd");
        }
        return a(str, (String) null, false);
    }

    public final Collection<k> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71b5291f49d717a55b68a448064346f", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71b5291f49d717a55b68a448064346f") : o.a().b();
    }

    private synchronized k a(String str, String str2, boolean z) {
        Object[] objArr = {str, null, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "877a6ca185e26c9a660b033224a27c42", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "877a6ca185e26c9a660b033224a27c42");
        }
        return a(str, null, false, false, null);
    }

    public final synchronized k a(String str, String str2, boolean z, boolean z2, String str3) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a4f85f2ba52ef893549c483b2887b34", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a4f85f2ba52ef893549c483b2887b34");
        }
        k b = b(str, str2, z, z2, str3);
        if (b != null && z) {
            b.o = true;
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x016f, code lost:
        if (android.text.TextUtils.equals(r23, r1.f) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.meituan.android.mrn.engine.k b(final java.lang.String r22, java.lang.String r23, boolean r24, boolean r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.engine.n.b(java.lang.String, java.lang.String, boolean, boolean, java.lang.String):com.meituan.android.mrn.engine.k");
    }

    private void a(k kVar, String str, boolean z, double d2) {
        Object[] objArr = {kVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13637eceed7b1424f090694aef11c24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13637eceed7b1424f090694aef11c24");
            return;
        }
        kVar.k = str;
        if (z) {
            this.b = kVar;
        }
        com.meituan.hotel.android.hplus.diagnoseTool.b.b();
    }

    public final synchronized k c() {
        long j;
        List<com.facebook.react.i> a2;
        List arrayList;
        int i2;
        List<com.facebook.react.i> a3;
        ReactInstanceManager a4;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90753ebbc6a96170ba1f09741452c76a", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90753ebbc6a96170ba1f09741452c76a");
        }
        com.facebook.common.logging.a.b("[MRNInstanceManager@createMRNInstance]", "");
        i = System.currentTimeMillis();
        final k h = o.a().h();
        long currentTimeMillis = System.currentTimeMillis() - i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1e27a158be5049fc9abf02ee14a3cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1e27a158be5049fc9abf02ee14a3cb3");
        } else {
            int c = o.a().c();
            if (this.c < c) {
                this.c = c;
            }
            com.meituan.android.mrn.utils.i.a("mrn", "total", String.valueOf(c));
            com.meituan.android.mrn.utils.i.a("mrn", "used", String.valueOf(o.a().g()));
            com.meituan.android.mrn.utils.i.a("mrn", "dirty", String.valueOf(o.a().f()));
            com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@recordMRNInstanceStatus]", String.format("引擎管理-引擎创建后记录到CrashReporter，total=%d,used=%d,dirty=%d", Integer.valueOf(c), Integer.valueOf(o.a().g()), Integer.valueOf(o.a().f())));
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Object[] objArr3 = {h};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f61265e85d4d3bcf07061589ebb2a46c", RobustBitConfig.DEFAULT_VALUE)) {
            a4 = (ReactInstanceManager) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f61265e85d4d3bcf07061589ebb2a46c");
            j = uptimeMillis;
            i2 = 1;
        } else {
            com.facebook.react.f builder = ReactInstanceManager.builder();
            builder.b = (Application) this.f;
            com.facebook.react.f a5 = builder.a(new i().a());
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            j = uptimeMillis;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "be3216dae39350cbcedd7443d1bd68e0", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "be3216dae39350cbcedd7443d1bd68e0");
            } else {
                IMRNPackageBuilder iMRNPackageBuilder = com.meituan.android.mrn.config.y.a().i;
                a2 = iMRNPackageBuilder != null ? iMRNPackageBuilder.a() : null;
            }
            com.facebook.react.f a6 = a5.a(a2);
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "463b6650f9f989ddd4eb1a579b8d69dc", RobustBitConfig.DEFAULT_VALUE)) {
                arrayList = (List) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "463b6650f9f989ddd4eb1a579b8d69dc");
                i2 = 1;
            } else {
                arrayList = new ArrayList();
                if (com.sankuai.meituan.serviceloader.b.a()) {
                    Object[] objArr6 = new Object[2];
                    objArr6[0] = "ServiceLoader初始化成功,bundleName: ";
                    i2 = 1;
                    objArr6[1] = this.b == null ? "" : this.b.k;
                    com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@buildReactPackage]", objArr6);
                    List<IMRNPackageBuilder> a7 = com.sankuai.meituan.serviceloader.b.a(IMRNPackageBuilder.class, (String) null);
                    if (a7 != null && a7.size() > 0) {
                        for (IMRNPackageBuilder iMRNPackageBuilder2 : a7) {
                            if (iMRNPackageBuilder2 != null && (a3 = iMRNPackageBuilder2.a()) != null && !a3.isEmpty()) {
                                arrayList.addAll(a3);
                            }
                        }
                    }
                } else {
                    i2 = 1;
                    StringBuilder sb = new StringBuilder("MRNInstanceManager buildReactPackage:ServiceLoader尚未初始化,bundleName: ");
                    sb.append(this.b == null ? "" : this.b.k);
                    com.facebook.common.logging.a.b("[MRNInstanceManager@buildReactPackage]", sb.toString());
                }
                if (com.meituan.android.mrn.config.p.b() != null) {
                    arrayList.addAll(com.meituan.android.mrn.config.p.b());
                }
            }
            com.facebook.react.f a8 = a6.a(arrayList).a(new com.meituan.android.mrn.shell.a(h));
            a8.a = "index";
            com.facebook.react.f a9 = a8.a(JSBundleLoader.createFileLoader(""));
            a9.d = LifecycleState.BEFORE_CREATE;
            a9.f = new v(h);
            a9.c = com.meituan.android.mrn.debug.a.a();
            a4 = a9.a();
        }
        StringBuffer stringBuffer = new StringBuffer("MRNInstanceManager:buildReactInstanceManager end ");
        stringBuffer.append(h);
        stringBuffer.append("; 耗时统计: createInstance cost=");
        stringBuffer.append(currentTimeMillis);
        stringBuffer.append("buildReactInstanceManager cost=");
        stringBuffer.append(SystemClock.uptimeMillis() - j);
        Object[] objArr7 = new Object[i2];
        objArr7[0] = stringBuffer.toString();
        com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@createMRNInstance]", objArr7);
        h.a(a4);
        MRNBundleManager.sharedInstance().executeWhenBaseInitialized(new Runnable() { // from class: com.meituan.android.mrn.engine.n.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect6, false, "61b2ee44bcf908bf3d4de43ce5e3b770", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect6, false, "61b2ee44bcf908bf3d4de43ce5e3b770");
                    return;
                }
                com.meituan.android.mrn.utils.p.a("[MRNInstanceManager@executeWhenBaseInitialized@run]", h);
                n.a(n.this, h);
            }
        });
        return h;
    }

    public static boolean a(k kVar, String str, WritableMap writableMap) {
        boolean z;
        Object[] objArr = {kVar, str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00f480860e4152219740bdaf513077c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00f480860e4152219740bdaf513077c8")).booleanValue();
        }
        if (kVar != null) {
            Object[] objArr2 = {kVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bea5c31d2f73c18346dc683af3df7850", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bea5c31d2f73c18346dc683af3df7850")).booleanValue();
            } else {
                z = (kVar == null || kVar.b == null || (kVar.f != p.USED && kVar.f != p.DIRTY && kVar.f != p.READY)) ? false : true;
            }
            if (!z || kVar.b == null || kVar.b.getCurrentReactContext() == null) {
                return false;
            }
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) kVar.b.getCurrentReactContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
                return true;
            } catch (Throwable th) {
                com.meituan.android.mrn.utils.c.a("[MRNInstanceManager@emitDeviceEventMessage]", th);
                return false;
            }
        }
        return false;
    }

    public static boolean a(ReactContext reactContext, String str, WritableMap writableMap) {
        Object[] objArr = {reactContext, str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9221ca1029d48fea08844b2fe3bfef2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9221ca1029d48fea08844b2fe3bfef2")).booleanValue();
        }
        if (reactContext != null) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
                return true;
            } catch (Throwable th) {
                com.meituan.android.mrn.utils.c.a("[MRNInstanceManager@emitDeviceEventMessage]", th);
                return false;
            }
        }
        return false;
    }
}
