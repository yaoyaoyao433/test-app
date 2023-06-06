package com.meituan.android.mrn.engine;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import com.facebook.react.MRNRootView;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.meituan.android.mrn.container.d;
import com.meituan.android.mrn.container.e;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.event.listeners.a;
import com.meituan.android.mrn.module.MRNExceptionsManagerModule;
import com.meituan.android.mrn.shell.MRNReactPackageInterface;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class w {
    public static ChangeQuickRedirect a;
    private static volatile boolean c;
    private static final Pattern b = Pattern.compile("^rn_+[a-zA-Z0-9]+_");
    private static final LruCache<String, k> d = new LruCache<>(3);
    private static final List<String> e = new ArrayList();
    private static ComponentCallbacks f = new ComponentCallbacks() { // from class: com.meituan.android.mrn.engine.w.4
        public static ChangeQuickRedirect a;

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42caaf99c596ac42fad103c006374877", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42caaf99c596ac42fad103c006374877");
                return;
            }
            synchronized (w.d) {
                if (w.d.size() <= 0) {
                    return;
                }
                for (Map.Entry entry : w.d.snapshot().entrySet()) {
                    w.d.remove(entry.getKey());
                    w.c((k) entry.getValue());
                }
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public static /* synthetic */ void a(final Context context, final k kVar, e eVar, final String str, final Bundle bundle) {
        Object[] objArr = {context, kVar, eVar, str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d33ef6363c70e3605c68be3f56e4ff6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d33ef6363c70e3605c68be3f56e4ff6d");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.engine.w.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e14ee6a6e3a2c1370c2c6f4149af5b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e14ee6a6e3a2c1370c2c6f4149af5b3");
                        return;
                    }
                    try {
                        ReactInstanceManager reactInstanceManager = k.this.b;
                        if (reactInstanceManager == null) {
                            return;
                        }
                        MRNRootView mRNRootView = new MRNRootView(context);
                        Class<?> cls = mRNRootView.getClass();
                        while (cls != null && View.class != cls) {
                            cls = cls.getSuperclass();
                        }
                        if (cls != null) {
                            Method declaredMethod = cls.getDeclaredMethod("setMeasuredDimension", Integer.TYPE, Integer.TYPE);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(mRNRootView, 1024, 1024);
                        }
                        if (bundle != null) {
                            if (!bundle.containsKey("mrn_component")) {
                                bundle.putString("mrn_component", str);
                            }
                            bundle.putBoolean("mrn_deep_preload", true);
                        }
                        mRNRootView.startReactApplication(reactInstanceManager, str, bundle);
                        mRNRootView.unmountReactApplication();
                    } catch (Throwable th) {
                        com.meituan.android.mrn.utils.c.a("[MRNPreRenderUtil@deepPreLoad@run]", th);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(String str, k kVar) {
        Object[] objArr = {str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6a789b725102dbeb366aa19ade41da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6a789b725102dbeb366aa19ade41da7");
        } else if (TextUtils.isEmpty(str) || kVar == null) {
        } else {
            synchronized (d) {
                if (d.size() == 3 && d.snapshot() != null) {
                    LruCache<String, k> lruCache = d;
                    c(lruCache.remove(lruCache.snapshot().entrySet().iterator().next().getKey()));
                }
                d.put(str, kVar);
            }
        }
    }

    public static synchronized void a(final Context context, final String str, final List<com.facebook.react.i> list, final String str2, final Bundle bundle, final a aVar) {
        synchronized (w.class) {
            Object[] objArr = {context, str, list, str2, bundle, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0d11be48803da0eaf602e30b08d8165", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0d11be48803da0eaf602e30b08d8165");
                return;
            }
            com.meituan.android.mrn.utils.p.a("[MRNPreRenderUtil@preLoadJsBundleInner]", str + StringUtil.SPACE + str2);
            if (context != null && c(str)) {
                if (!c) {
                    context.registerComponentCallbacks(f);
                    c = true;
                }
                Object[] objArr2 = {context, str, list, str2, bundle, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d885873b24b6e6f97614364c184ff361", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d885873b24b6e6f97614364c184ff361");
                    return;
                } else {
                    new com.meituan.android.mrn.container.d(str, null, new d.b() { // from class: com.meituan.android.mrn.engine.w.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.mrn.container.d.b
                        public final void a(e eVar, int i) {
                            Object[] objArr3 = {eVar, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "84e56424d99e2a4ea89d6ba5ce0bccac", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "84e56424d99e2a4ea89d6ba5ce0bccac");
                                return;
                            }
                            a.C0286a c0286a = new a.C0286a();
                            c0286a.a(str);
                            c0286a.a(eVar);
                            c0286a.a(i == 1);
                            c0286a.b(true);
                            com.meituan.android.mrn.event.c.b.a(com.meituan.android.mrn.event.listeners.a.a, (a.c<a.C0286a>) c0286a);
                            if (!h.a(eVar)) {
                                w.a((k) null, str, aVar, com.meituan.android.mrn.config.q.BUNDLE_INCOMPLETE);
                                return;
                            }
                            MRNBundleManager.sharedInstance().lockBundle(eVar);
                            w.a(context, eVar, list, str2, bundle, aVar);
                        }

                        @Override // com.meituan.android.mrn.container.d.b
                        public final void a(com.meituan.android.mrn.config.q qVar, Throwable th, String str3) {
                            Object[] objArr3 = {qVar, null, null};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f971182a19a1c327daf822d7f23c06a1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f971182a19a1c327daf822d7f23c06a1");
                            } else {
                                w.a((k) null, str, aVar, qVar);
                            }
                        }
                    }, false).a(false);
                    return;
                }
            }
            a((k) null, str, aVar, com.meituan.android.mrn.config.q.ERROR_DEFAULT_CODE);
        }
    }

    public static void a(Context context, e eVar, List<com.facebook.react.i> list, String str, Bundle bundle, a aVar) {
        boolean z;
        Object[] objArr = {context, eVar, list, str, bundle, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbadcd41b810122f18535b1d87fe27b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbadcd41b810122f18535b1d87fe27b7");
        } else if (!h.a(eVar)) {
            a((k) null, eVar, aVar, com.meituan.android.mrn.config.q.BUNDLE_INCOMPLETE);
        } else {
            com.meituan.android.mrn.config.horn.j jVar = com.meituan.android.mrn.config.horn.j.b;
            String str2 = eVar.c;
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.config.horn.j.a;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "d40166bed571e5d3b09ddaaa1a8525d1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "d40166bed571e5d3b09ddaaa1a8525d1")).booleanValue();
            } else {
                boolean booleanValue = ((Boolean) com.meituan.android.mrn.config.t.b.a("enablePreLoad")).booleanValue();
                List list2 = (List) com.meituan.android.mrn.config.t.b.a("keepAliveWhitelist");
                z = booleanValue && list2 != null && list2.contains(str2);
            }
            new com.meituan.android.mrn.container.e(context, eVar.c, eVar.f, a(eVar.c, list), false, new AnonymousClass2(z, eVar, aVar, str, context, bundle)).a();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.engine.w$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends e.a {
        public static ChangeQuickRedirect a;
        k b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ e d;
        public final /* synthetic */ a e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Context g;
        public final /* synthetic */ Bundle h;

        public AnonymousClass2(boolean z, e eVar, a aVar, String str, Context context, Bundle bundle) {
            this.c = z;
            this.d = eVar;
            this.e = aVar;
            this.f = str;
            this.g = context;
            this.h = bundle;
        }

        @Override // com.meituan.android.mrn.container.e.a
        public final void a(k kVar, com.meituan.android.mrn.config.q qVar) {
            Object[] objArr = {kVar, qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f7cacadb5c5bf5a8ab86f39401a8a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f7cacadb5c5bf5a8ab86f39401a8a2");
                return;
            }
            this.b = kVar;
            if (kVar != null) {
                kVar.c();
                if (this.c) {
                    w.a(this.d.c, kVar);
                    return;
                }
                return;
            }
            w.a((k) null, this.d, this.e, com.meituan.android.mrn.config.q.ERROR_CREATE_MRN_INSTANCE);
        }

        @Override // com.meituan.android.mrn.container.e.a
        public final void a(ReactContext reactContext, com.meituan.android.mrn.config.q qVar) {
            Object[] objArr = {reactContext, qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab6a702fa2ddd51020a19ef5103d2bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab6a702fa2ddd51020a19ef5103d2bd");
            } else if (this.b == null || reactContext == null) {
                w.a(this.b, this.d, this.e, com.meituan.android.mrn.config.q.ERROR_CREATE_MRN_INSTANCE);
            } else {
                try {
                    MRNExceptionsManagerModule mRNExceptionsManagerModule = (MRNExceptionsManagerModule) reactContext.getNativeModule(MRNExceptionsManagerModule.class);
                    if (mRNExceptionsManagerModule != null) {
                        mRNExceptionsManagerModule.addJSCallExceptionHandler(new b() { // from class: com.meituan.android.mrn.engine.w.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.mrn.engine.b
                            public final void a(String str, ReadableArray readableArray) {
                                Object[] objArr2 = {str, readableArray};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db469fd41a024d0dd294d96f8051674b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db469fd41a024d0dd294d96f8051674b");
                                } else {
                                    AnonymousClass2.this.b.f = p.ERROR;
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    com.facebook.common.logging.a.d("MRNPreRenderUtil", e.getMessage(), e);
                }
                try {
                    if (this.b.a(this.d, new Runnable() { // from class: com.meituan.android.mrn.engine.w.2.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18545e8f94cea8314f46c3cd9480b898", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18545e8f94cea8314f46c3cd9480b898");
                                return;
                            }
                            AnonymousClass2.this.b.d = 3;
                            if (!TextUtils.isEmpty(AnonymousClass2.this.f) && !TextUtils.isEmpty(AnonymousClass2.this.d.c) && com.meituan.android.mrn.config.horn.j.b.a(AnonymousClass2.this.d.c)) {
                                w.a(AnonymousClass2.this.g, AnonymousClass2.this.b, AnonymousClass2.this.d, AnonymousClass2.this.f, AnonymousClass2.this.h);
                                AnonymousClass2.this.b.d = 4;
                            }
                            w.a(AnonymousClass2.this.b, AnonymousClass2.this.d, AnonymousClass2.this.e, (com.meituan.android.mrn.config.q) null);
                        }
                    })) {
                        return;
                    }
                    w.a(this.b, this.d, this.e, (com.meituan.android.mrn.config.q) null);
                } catch (Throwable unused) {
                    w.a(this.b, this.d, this.e, com.meituan.android.mrn.config.q.RENDER_ERROR);
                }
            }
        }
    }

    private static void b(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b02d2fa357dfd26200e92fd509478ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b02d2fa357dfd26200e92fd509478ac");
            return;
        }
        int i = 0;
        int i2 = 0;
        for (k kVar2 : o.a().b()) {
            if (kVar2 != null && kVar != kVar2) {
                if (p.USED == kVar2.f) {
                    i++;
                } else if (p.DIRTY == kVar2.f) {
                    i2++;
                }
            }
        }
        String str = kVar.d == 4 ? "deepInit" : "preInit";
        com.meituan.android.mrn.utils.p.a("[MRNPreRenderUtil@reportPreRenderInstanceFetched]", String.format("引擎管理-预渲染获取引擎成功：%s，状态：%s,引擎队列中 used=%d，dirty=%d", kVar.k, str, Integer.valueOf(i), Integer.valueOf(i2)));
        com.meituan.android.mrn.monitor.g.a().c(kVar.k).a("used", String.valueOf(i)).a("dirty", String.valueOf(i2)).a("type", str).b("MRNPreBundleInit", 1.0f);
    }

    public static void a(k kVar, e eVar, a aVar, com.meituan.android.mrn.config.q qVar) {
        Object[] objArr = {kVar, eVar, aVar, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5feb2775673b1f48773c31320359b228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5feb2775673b1f48773c31320359b228");
        } else {
            a(kVar, (String) null, eVar, aVar, qVar);
        }
    }

    public static void a(k kVar, String str, a aVar, com.meituan.android.mrn.config.q qVar) {
        Object[] objArr = {null, str, aVar, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbb743429e60af6584e1d72648e00d7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbb743429e60af6584e1d72648e00d7b");
        } else {
            a((k) null, str, (e) null, aVar, qVar);
        }
    }

    private static void a(k kVar, String str, e eVar, a aVar, com.meituan.android.mrn.config.q qVar) {
        Object[] objArr = {kVar, str, eVar, aVar, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17c3388b7b1b2fbb736d4b2cf10f694d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17c3388b7b1b2fbb736d4b2cf10f694d");
            return;
        }
        if (kVar != null) {
            if (qVar != null) {
                com.facebook.common.logging.a.b("[MRNPreRenderUtil@onPreRunJsBundleFinish] ", "instance not null ,errorType: " + qVar);
            }
            kVar.d();
            b(kVar);
        } else if (qVar != null && qVar != com.meituan.android.mrn.config.q.ERROR_DEFAULT_CODE) {
            com.facebook.common.logging.a.b("[MRNPreRenderUtil@onPreRunJsBundleFinish] ", "instance null , errorType: " + qVar);
        }
        if (eVar != null) {
            MRNBundleManager.sharedInstance().unlockBundle(eVar);
        }
        synchronized (e) {
            if (TextUtils.isEmpty(str) && eVar != null) {
                str = eVar.c;
            }
            e.remove(str);
        }
    }

    private static boolean c(String str) {
        List list;
        boolean z;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f001b43ffd0395da32d6ecc3a22bd85d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f001b43ffd0395da32d6ecc3a22bd85d")).booleanValue();
        }
        com.meituan.android.mrn.config.horn.j jVar = com.meituan.android.mrn.config.horn.j.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.config.horn.j.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "a34061a97b3be9ed3f1dd520cc2f7f24", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "a34061a97b3be9ed3f1dd520cc2f7f24")).booleanValue();
        } else {
            String e2 = com.meituan.android.mrn.config.c.a().e();
            z = !(com.meituan.android.mrn.config.horn.a.a.equals(e2) || com.meituan.android.mrn.config.horn.a.b.equals(e2)) || (((Boolean) com.meituan.android.mrn.config.t.b.a("enablePreLoad")).booleanValue() && (((list = (List) com.meituan.android.mrn.config.t.b.a("preloadWhitelist")) != null && list.contains(str)) || jVar.a(str)));
        }
        if (z && !TextUtils.isEmpty(str) && b.matcher(str).find()) {
            synchronized (e) {
                if (e.contains(str)) {
                    return false;
                }
                e.add(str);
                return true;
            }
        }
        return false;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6503a8090239a52f23b474aefe60d25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6503a8090239a52f23b474aefe60d25");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            synchronized (d) {
                d.remove(str);
            }
        }
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd4967541e3b98405b1c3177a19d853f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd4967541e3b98405b1c3177a19d853f")).booleanValue() : d.snapshot().containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dee5790661fbe61558d73bd9ddb7bd27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dee5790661fbe61558d73bd9ddb7bd27");
        } else if (kVar == null) {
        } else {
            com.meituan.android.mrn.utils.p.a("[MRNPreRenderUtil@destructInstance]", kVar);
            if (kVar.f != p.USED) {
                kVar.e();
            } else {
                kVar.q = new k.a() { // from class: com.meituan.android.mrn.engine.w.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.mrn.engine.k.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c4bb0beebeb00b788a4773bd65b73a3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c4bb0beebeb00b788a4773bd65b73a3");
                        } else {
                            k.this.e();
                        }
                    }
                };
            }
        }
    }

    private static List<com.facebook.react.i> a(String str, List<com.facebook.react.i> list) {
        String str2;
        List a2;
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str3 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a4f1e21714ecf077285f70f85bb7a49", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a4f1e21714ecf077285f70f85bb7a49");
        }
        if (TextUtils.isEmpty(str)) {
            return list;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "de088a57dde2339b15754d9cb8cd4fbf", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "de088a57dde2339b15754d9cb8cd4fbf");
        } else {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(CommonConstant.Symbol.UNDERLINE);
                if (split.length == 3) {
                    str2 = split[1];
                }
            }
            str2 = null;
        }
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "268c2dec4bf1025b2135315d8f073db5", RobustBitConfig.DEFAULT_VALUE)) {
            str3 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "268c2dec4bf1025b2135315d8f073db5");
        } else if (!TextUtils.isEmpty(str)) {
            String[] split2 = str.split(CommonConstant.Symbol.UNDERLINE);
            if (split2.length == 3) {
                str3 = split2[2];
            }
        }
        HashSet hashSet = new HashSet();
        List<com.facebook.react.i> arrayList = list == null ? new ArrayList<>() : list;
        for (com.facebook.react.i iVar : arrayList) {
            hashSet.add(iVar.getClass().getName());
        }
        ArrayList<com.facebook.react.i> arrayList2 = new ArrayList();
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (com.sankuai.meituan.serviceloader.b.a() && (a2 = com.sankuai.meituan.serviceloader.b.a(MRNReactPackageInterface.class, str3)) != null && !a2.isEmpty() && a2.get(0) != null && ((MRNReactPackageInterface) a2.get(0)).a() != null) {
                arrayList2.addAll(((MRNReactPackageInterface) a2.get(0)).a());
            }
            List<com.facebook.react.i> a3 = com.meituan.android.mrn.config.p.a(str2, str3);
            if (a3 != null) {
                arrayList2.addAll(a3);
            }
        }
        for (com.facebook.react.i iVar2 : arrayList2) {
            if (!hashSet.contains(iVar2.getClass().getName())) {
                arrayList.add(iVar2);
            } else {
                hashSet.add(iVar2.getClass().getName());
            }
        }
        return arrayList;
    }
}
