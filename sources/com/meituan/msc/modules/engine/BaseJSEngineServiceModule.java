package com.meituan.msc.modules.engine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.ad;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.CatalystInstanceImpl;
import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback;
import com.meituan.msc.modules.service.IServiceEngine;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BaseJSEngineServiceModule<E extends IServiceEngine> extends com.meituan.msc.modules.manager.k implements Thread.UncaughtExceptionHandler {
    public static ChangeQuickRedirect b;
    private final List<String> a;
    protected final Context c;
    protected E d;
    protected g e;
    private volatile boolean f;
    private final com.meituan.msc.modules.page.render.webview.g g;
    private String h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    interface JSAutomator extends JavaScriptModule {
        void onAutoMessage(@NonNull String str);
    }

    public abstract E c();

    public static /* synthetic */ boolean a(BaseJSEngineServiceModule baseJSEngineServiceModule, boolean z) {
        baseJSEngineServiceModule.f = true;
        return true;
    }

    public static /* synthetic */ void b(BaseJSEngineServiceModule baseJSEngineServiceModule) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, baseJSEngineServiceModule, changeQuickRedirect, false, "b07907ec160a7844db59b5956dc82294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, baseJSEngineServiceModule, changeQuickRedirect, false, "b07907ec160a7844db59b5956dc82294");
        } else if (TextUtils.isEmpty(baseJSEngineServiceModule.h)) {
        } else {
            String str = baseJSEngineServiceModule.h;
            baseJSEngineServiceModule.h = null;
            com.meituan.msc.modules.reporter.g.d("BaseJSEngineServiceModule", "replayInjectAutomatorScript");
            ValueCallback<String> valueCallback = new ValueCallback<String>() { // from class: com.meituan.msc.modules.engine.BaseJSEngineServiceModule.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd5052ac56b93ceb48cc14e2a050f183", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd5052ac56b93ceb48cc14e2a050f183");
                    } else {
                        com.meituan.msc.modules.reporter.g.d("BaseJSEngineServiceModule", "evaluateJavascript success, appId:", BaseJSEngineServiceModule.this.U_().a(), ", onReceiveValue:", str3);
                    }
                }
            };
            Object[] objArr2 = {"automatorService", str, valueCallback};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, baseJSEngineServiceModule, changeQuickRedirect2, false, "fda5b08c8b382360399dc9dc8279faeb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, baseJSEngineServiceModule, changeQuickRedirect2, false, "fda5b08c8b382360399dc9dc8279faeb");
                return;
            }
            E e = baseJSEngineServiceModule.d;
            e.evaluateJavascript("eval: automatorService", str, valueCallback);
        }
    }

    public BaseJSEngineServiceModule(com.meituan.msc.modules.page.render.webview.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4589969d19a30387082d02b3caf9bd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4589969d19a30387082d02b3caf9bd8");
            return;
        }
        this.a = new ArrayList();
        this.c = MSCEnvHelper.getContext();
        this.g = gVar;
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da285c7ec7719760bfd26db590f63009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da285c7ec7719760bfd26db590f63009");
            return;
        }
        super.a(hVar);
        try {
            this.d = c();
            com.meituan.msc.modules.reporter.g.c("BaseJSEngineServiceModule", "engine:", this.d);
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.b("BaseJSEngineServiceModule", e, "AppService exception exit");
        }
    }

    public final void a(com.meituan.msc.modules.service.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "589421ae90251549d06f301195f8f9a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "589421ae90251549d06f301195f8f9a9");
            return;
        }
        this.d.setOnJsUncaughtErrorHandler(this);
        this.d.setOnEngineInitFailedListener(this.g);
        this.d.launch(U_(), this.c, dVar);
        com.meituan.msc.modules.reporter.g.c("BaseJSEngineServiceModule", "engine:", this.d);
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e071c555e65121c83549975320f6d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e071c555e65121c83549975320f6d6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "668a9aa73514e5979275e2d2d89cd119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "668a9aa73514e5979275e2d2d89cd119");
        }
    }

    public final JSInstance d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e265a00810809594dab99eb41e8953", RobustBitConfig.DEFAULT_VALUE) ? (JSInstance) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e265a00810809594dab99eb41e8953") : this.d.getJSInstance();
    }

    public final E e() {
        return this.d;
    }

    public final void a(final PackageInfoWrapper packageInfoWrapper, final g gVar) {
        boolean contains;
        Object[] objArr = {packageInfoWrapper, gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff06a7eb1f2b23cdb514ecaedd2679bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff06a7eb1f2b23cdb514ecaedd2679bc");
            return;
        }
        final String str = packageInfoWrapper.isBasePackage() ? "inject_base_js" : "inject_biz_js";
        final ad adVar = new ad();
        adVar.put("md5", packageInfoWrapper.getMd5());
        U_().o.a(str, (ConcurrentHashMap<String, Object>) adVar);
        final g gVar2 = new g() { // from class: com.meituan.msc.modules.engine.BaseJSEngineServiceModule.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.engine.g
            public final void a(@NonNull PackageInfoWrapper packageInfoWrapper2, boolean z) {
                Object[] objArr2 = {packageInfoWrapper2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "467d5ec677da0577479f6c47b3e67565", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "467d5ec677da0577479f6c47b3e67565");
                    return;
                }
                if (gVar != null) {
                    gVar.a(packageInfoWrapper2, z);
                }
                adVar.put("status", "ok");
                BaseJSEngineServiceModule.this.U_().o.b(str, adVar);
            }

            @Override // com.meituan.msc.modules.engine.g
            public final void a(@NonNull PackageInfoWrapper packageInfoWrapper2, Exception exc) {
                Object[] objArr2 = {packageInfoWrapper2, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95dd04d38567c624a4a8c5c498492600", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95dd04d38567c624a4a8c5c498492600");
                    return;
                }
                if (gVar != null) {
                    gVar.a(packageInfoWrapper2, exc);
                }
                adVar.put("status", "fail");
                BaseJSEngineServiceModule.this.U_().o.b(str, adVar);
            }
        };
        synchronized (this.a) {
            contains = this.a.contains(packageInfoWrapper.getMd5());
            this.a.add(packageInfoWrapper.getMd5());
        }
        if (!contains) {
            com.meituan.msc.modules.reporter.g.d("BaseJSEngineServiceModule", "loadPage:", packageInfoWrapper);
            if (packageInfoWrapper.isBasePackage()) {
                com.meituan.msc.common.framework.c.a().e.a("service_runtime_load_begin");
                this.e = gVar2;
            } else if (packageInfoWrapper.isMainPackage()) {
                com.meituan.msc.common.framework.c.a().e.a("service_mainpkg_load_begin");
            }
            DioFile serviceFile = packageInfoWrapper.getServiceFile();
            if (serviceFile.c()) {
                String a = com.meituan.msc.modules.update.d.a(packageInfoWrapper);
                String a2 = com.meituan.msc.modules.service.codecache.c.a().a(U_(), packageInfoWrapper, serviceFile, a, true);
                LoadJSCodeCacheCallback a3 = com.meituan.msc.modules.service.codecache.c.a().a(U_(), serviceFile);
                com.meituan.msc.modules.service.codecache.c.a().a(packageInfoWrapper.appId, packageInfoWrapper.getDDResourceName(), serviceFile.a());
                this.d.evaluateJsFile(serviceFile, a, new o() { // from class: com.meituan.msc.modules.engine.BaseJSEngineServiceModule.3
                    public static ChangeQuickRedirect a;

                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(String str2) {
                        Object[] objArr2 = {str2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3bb5c58ee71a1158446552408cbf30f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3bb5c58ee71a1158446552408cbf30f");
                            return;
                        }
                        com.meituan.msc.modules.reporter.g.d("BaseJSEngineServiceModule", "loadServicePackageSuccess:", packageInfoWrapper.getMd5());
                        if (packageInfoWrapper.isBasePackage()) {
                            BaseJSEngineServiceModule.a(BaseJSEngineServiceModule.this, true);
                            BaseJSEngineServiceModule.this.U_().a(new com.meituan.msc.modules.manager.f("FrameworkPackageLoaded"));
                            BaseJSEngineServiceModule.b(BaseJSEngineServiceModule.this);
                            com.meituan.msc.modules.service.i f = BaseJSEngineServiceModule.this.f();
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.service.i.a;
                            if (PatchProxy.isSupport(objArr3, f, changeQuickRedirect3, false, "8b8eb28b7325a7e3b87a17a253e7903f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, f, changeQuickRedirect3, false, "8b8eb28b7325a7e3b87a17a253e7903f");
                            } else if (f.d != null) {
                                ((CatalystInstanceImpl) f.d).notifyContextReady();
                            }
                        }
                        gVar2.a(packageInfoWrapper, true);
                    }

                    @Override // com.meituan.msc.modules.engine.o
                    public final void a(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d515e2333cc4b8b99cb10ff91b3735e0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d515e2333cc4b8b99cb10ff91b3735e0");
                            return;
                        }
                        synchronized (BaseJSEngineServiceModule.this.a) {
                            BaseJSEngineServiceModule.this.a.remove(packageInfoWrapper.getMd5());
                        }
                        com.meituan.msc.modules.reporter.g.b("BaseJSEngineServiceModule", exc, "loadServicePackageError:", packageInfoWrapper.getMd5());
                        gVar2.a(packageInfoWrapper, exc);
                    }
                }, a2, a3);
                return;
            }
            com.meituan.msc.modules.reporter.g.d("BaseJSEngineServiceModule", "loadServicePackage Error!", "serviceFile not exist!", packageInfoWrapper.getMd5());
            gVar2.a(packageInfoWrapper, new RuntimeException("AppService#loadServicePackage serviceFile not exist" + packageInfoWrapper));
            return;
        }
        com.meituan.msc.modules.reporter.g.d("BaseJSEngineServiceModule", "loadServicePackage already exist:", packageInfoWrapper.getMd5());
        gVar2.a(packageInfoWrapper, false);
    }

    @Override // com.meituan.msc.modules.manager.k
    public void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22fb7b74c365ee1dc2fa3773cc4bc93a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22fb7b74c365ee1dc2fa3773cc4bc93a");
        } else if (this.d == null) {
        } else {
            this.d.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d9, code lost:
        if (r5 != null) goto L44;
     */
    @com.meituan.msc.modules.manager.MSCMethod(isSync = true)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String importScripts(org.json.JSONArray r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.engine.BaseJSEngineServiceModule.importScripts(org.json.JSONArray, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Exception exc) {
        Object[] objArr = {str, exc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9f22ff96653c163937ffe470120ebc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9f22ff96653c163937ffe470120ebc");
            return;
        }
        U_().q.handleException(exc);
        com.meituan.msc.modules.reporter.g.a("BaseJSEngineServiceModuleImportScriptError" + str, exc);
        if (this.f || this.e == null) {
            return;
        }
        this.e.a((PackageInfoWrapper) null, exc);
        this.e = null;
    }

    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277d0ef4a9edb0725322887f08244306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277d0ef4a9edb0725322887f08244306");
            return;
        }
        E e = this.d;
        e.evaluateJavascript("inject: " + str, String.format("%s=%s", str, str2), null);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        Object[] objArr = {thread, th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebb84bb323d5acce356f36981028f46f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebb84bb323d5acce356f36981028f46f");
            return;
        }
        th.printStackTrace();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        com.meituan.msc.modules.reporter.g.a("JSThread error", stringWriter2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", th.getMessage());
            jSONObject.put("nativeStack", stringWriter2);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (this.g != null) {
            com.meituan.msc.modules.page.render.webview.g gVar = this.g;
            if (jSONObject != null) {
                stringWriter2 = jSONObject.toString();
            }
            gVar.a(new com.meituan.msc.modules.apploader.events.a(MapConstant.LayerPropertyFlag_MarkerSpacing, stringWriter2, th));
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final Object a(String str, String str2, JSONArray jSONArray, com.meituan.msc.modules.manager.a aVar) {
        Object[] objArr = {str, str2, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "060980049a485fedea8cd9776657cd5a", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "060980049a485fedea8cd9776657cd5a");
        }
        this.d.getJSInstance().callFunction(str, str2, jSONArray);
        return null;
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0219cbaa6c607fe9bec4d5b37d049932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0219cbaa6c607fe9bec4d5b37d049932");
            return;
        }
        com.meituan.msc.modules.service.i f = f();
        if (f != null) {
            f.b(runnable);
        }
    }

    public final <T extends JavaScriptModule> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40ef6b4686546bb49d0193bce0d0d499", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40ef6b4686546bb49d0193bce0d0d499");
        }
        E e = this.d;
        if (e != null) {
            return (T) e.getJSModule(cls);
        }
        return null;
    }

    public final com.meituan.msc.modules.service.i f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdfc0aebacc999baf4f20f29f270654a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.service.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdfc0aebacc999baf4f20f29f270654a");
        }
        E e = this.d;
        if (e != null) {
            return e.getJsExecutor();
        }
        return null;
    }
}
