package com.meituan.msc.modules.service;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.support.annotation.Nullable;
import android.webkit.ValueCallback;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.android.soloader.k;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.t;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.CatalystInstance;
import com.meituan.msc.jse.bridge.CatalystInstanceImpl;
import com.meituan.msc.jse.bridge.IMessageInterface;
import com.meituan.msc.jse.bridge.JSFunctionCaller;
import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.jse.bridge.JavaScriptExecutor;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback;
import com.meituan.msc.jse.bridge.NativeMap;
import com.meituan.msc.jse.bridge.RNArguments;
import com.meituan.msc.jse.bridge.ReactBridge;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfigurationSpec;
import com.meituan.msc.modules.engine.o;
import com.meituan.msc.modules.manager.p;
import com.meituan.msc.modules.service.c;
import com.meituan.msc.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.Thread;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class f implements IServiceEngine, c {
    public static ChangeQuickRedirect b;
    private i a;
    public final CountDownLatch c;
    public long d;
    private volatile boolean e;
    private com.meituan.msc.modules.page.render.webview.g f;
    private com.meituan.msc.modules.engine.h g;
    private volatile a h;

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract ReactQueueConfigurationSpec f();

    public JSFunctionCaller g() {
        return null;
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public void setOnJsUncaughtErrorHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1b7c673d7928da3c4f52fb6a1c4057", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1b7c673d7928da3c4f52fb6a1c4057");
            return;
        }
        this.e = false;
        this.c = new CountDownLatch(1);
        this.h = a.Unknown;
    }

    public static /* synthetic */ com.meituan.msc.modules.page.render.webview.g a(f fVar, com.meituan.msc.modules.page.render.webview.g gVar) {
        fVar.f = null;
        return null;
    }

    public static /* synthetic */ void a(f fVar, String str, String str2, String str3, ValueCallback valueCallback, o oVar, String str4, LoadJSCodeCacheCallback loadJSCodeCacheCallback) {
        String str5 = str3;
        Object[] objArr = {str, str2, str5, valueCallback, oVar, str4, loadJSCodeCacheCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "2e1040cdcbdd9b8ef3dca0b347fbbc5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "2e1040cdcbdd9b8ef3dca0b347fbbc5e");
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if ("unknown".equals(str5)) {
                str5 = null;
            }
            String a = fVar.a.a(str2, str5, str4, loadJSCodeCacheCallback);
            if (str5 != null) {
                fVar.a.a("if (typeof __mmp_file_timing === 'undefined') {var __mmp_file_timing = {};}__mmp_file_timing['" + str5 + "']  = " + currentTimeMillis, null, null, null);
            }
            if (valueCallback != null) {
                valueCallback.onReceiveValue(a);
            }
        } catch (Exception e) {
            fVar.g.q.handleException(e);
            fVar.g.p.a("msc.uncaught.js.error").a(t.a("msg", e.getMessage(), "stack", com.meituan.msc.common.utils.o.b(e))).b();
            if (oVar != null) {
                com.meituan.msc.modules.reporter.g.a("evaluateJsException", e);
                oVar.a(e);
                return;
            }
            throw e;
        } finally {
            Trace.endSection();
        }
    }

    public static /* synthetic */ long f(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "23b04c658b8f09c44275657d1993cc7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "23b04c658b8f09c44275657d1993cc7c")).longValue();
        }
        if (fVar.a == null) {
            return 0L;
        }
        i iVar = fVar.a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "8e36e1a4639d73312f831a0aab056083", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "8e36e1a4639d73312f831a0aab056083")).longValue();
        }
        if (!iVar.d()) {
            throw new RuntimeException("must on js thread");
        }
        return iVar.d.getMemoryUsage();
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public void evaluateJavascript(final String str, final String str2, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {str, str2, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40756425c6ea6e6bafbd20b303d70c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40756425c6ea6e6bafbd20b303d70c10");
        } else if (this.e) {
        } else {
            this.a.a(new Runnable() { // from class: com.meituan.msc.modules.service.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e7008c8920548297e505041350b80e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e7008c8920548297e505041350b80e4");
                    } else {
                        f.a(f.this, str, str2, "unknown", valueCallback, null, null, null);
                    }
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.service.b
    public final void a(final Collection<DioFile> collection, final String str, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {collection, str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab992f411bda7cdda7971e176a48413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab992f411bda7cdda7971e176a48413");
        } else if (this.e || collection == null) {
        } else {
            a(new Runnable() { // from class: com.meituan.msc.modules.service.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9d7283441145f55f8d83c4e145cd84a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9d7283441145f55f8d83c4e145cd84a");
                        return;
                    }
                    final String a2 = g.a(collection, f.this.g, valueCallback);
                    f.this.a.a(new Runnable() { // from class: com.meituan.msc.modules.service.f.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "98cee351f17b07b92fd9e692dffacaae", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "98cee351f17b07b92fd9e692dffacaae");
                            } else if (f.this.e) {
                            } else {
                                com.meituan.msc.modules.engine.h hVar = f.this.g;
                                Collection collection2 = collection;
                                Object[] objArr4 = {hVar, collection2};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.engine.j.d;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "21a7cc7641a3228c7bfaa5ed84cd7027", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "21a7cc7641a3228c7bfaa5ed84cd7027");
                                } else {
                                    com.meituan.msc.modules.engine.j a3 = com.meituan.msc.modules.engine.j.a(hVar);
                                    if (a3 != null) {
                                        Object[] objArr5 = {collection2};
                                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.engine.j.d;
                                        if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "bfde2e34f5182c9c3d7dae37f4a40743", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "bfde2e34f5182c9c3d7dae37f4a40743");
                                        } else if (collection2 != null) {
                                            a3.f += collection2.size();
                                        }
                                    }
                                }
                                f.a(f.this, "loadFile: combo " + collection.size() + ", " + str, a2, str, valueCallback, valueCallback instanceof o ? (o) valueCallback : null, null, null);
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public void evaluateJsFile(final DioFile dioFile, final String str, @Nullable final o oVar, final String str2, final LoadJSCodeCacheCallback loadJSCodeCacheCallback) {
        Object[] objArr = {dioFile, str, oVar, str2, loadJSCodeCacheCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5641fc1372431c417ea3587fac83e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5641fc1372431c417ea3587fac83e7");
        } else if (this.e || dioFile == null) {
        } else {
            a(new Runnable() { // from class: com.meituan.msc.modules.service.f.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ba456f35bbc008557fe8ceafcfe2745", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ba456f35bbc008557fe8ceafcfe2745");
                        return;
                    }
                    final String a2 = g.a("JSCServiceEngine", dioFile, oVar);
                    if (a2 == null) {
                        p pVar = new p("file " + dioFile.e() + " content is null, abort evaluateJsFile");
                        f.this.g.q.handleException(pVar);
                        if (oVar != null) {
                            oVar.a(pVar);
                            return;
                        }
                        return;
                    }
                    f.this.a.a(new Runnable() { // from class: com.meituan.msc.modules.service.f.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b9ae8afc2b158de66d1aea7b3ca2a93c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b9ae8afc2b158de66d1aea7b3ca2a93c");
                            } else if (f.this.e) {
                            } else {
                                com.meituan.msc.modules.engine.h hVar = f.this.g;
                                DioFile dioFile2 = dioFile;
                                Object[] objArr4 = {hVar, dioFile2};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.engine.j.d;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f43be63e8485fc2651d43c24b39ff841", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f43be63e8485fc2651d43c24b39ff841");
                                } else {
                                    com.meituan.msc.modules.engine.j a3 = com.meituan.msc.modules.engine.j.a(hVar);
                                    if (a3 != null) {
                                        Object[] objArr5 = {dioFile2};
                                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.engine.j.d;
                                        if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "e6b6a2eebb09c37a095f1ce6e5b07c8c", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "e6b6a2eebb09c37a095f1ce6e5b07c8c");
                                        } else if (dioFile2 != null) {
                                            a3.f++;
                                        }
                                    }
                                }
                                f.a(f.this, "JSCServiceEngine", a2, str, oVar, oVar instanceof o ? oVar : null, str2, loadJSCodeCacheCallback);
                            }
                        }
                    });
                }
            });
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a78b9ad8b56d2a7b2db243122b2d964e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a78b9ad8b56d2a7b2db243122b2d964e");
        } else if (this.a.d()) {
            runnable.run();
        } else {
            com.meituan.msc.common.executor.a.a(runnable);
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1ee614370ee32b37e183022c2a6aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1ee614370ee32b37e183022c2a6aba");
            return;
        }
        final i iVar = this.a;
        Object[] objArr2 = {"platform", "Android"};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "61a9a1fb4d392aba570873572e7eee0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "61a9a1fb4d392aba570873572e7eee0e");
        } else {
            iVar.a(new Runnable() { // from class: com.meituan.msc.modules.service.i.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c8d3a9e9addcefe645c7d6cb79cc201", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c8d3a9e9addcefe645c7d6cb79cc201");
                    } else {
                        iVar.d.setGlobalVariableString(r2, r3);
                    }
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public void launch(final com.meituan.msc.modules.engine.h hVar, Context context, final d dVar) {
        String str;
        final CatalystInstance build;
        Object[] objArr = {hVar, context, dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3c38056305538200a2b740adf024416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3c38056305538200a2b740adf024416");
            return;
        }
        this.h = a.Launching;
        this.g = hVar;
        com.meituan.msc.common.framework.c.a().e.a(d());
        this.a = new i(hVar, a());
        final i iVar = this.a;
        ReactQueueConfigurationSpec f = f();
        JSFunctionCaller g = g();
        Object[] objArr2 = {hVar, f, g};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "60853bbdb8f928abb3cfce01d4fd0be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "60853bbdb8f928abb3cfce01d4fd0be6");
        } else {
            Context context2 = MSCEnvHelper.getContext();
            try {
                k.a(context2, false);
                ReactBridge.staticInit();
                String packageName = context2.getPackageName();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = i.a;
                if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "00448c2a669ebe3b55cc8401f33ba429", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "00448c2a669ebe3b55cc8401f33ba429");
                } else {
                    str = Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
                }
                JavaScriptExecutor create = iVar.a(packageName, str, context2).create(iVar.e + iVar.a(hVar));
                Object[] objArr4 = {create, f, g};
                ChangeQuickRedirect changeQuickRedirect4 = i.a;
                if (PatchProxy.isSupport(objArr4, iVar, changeQuickRedirect4, false, "11b0365dad79b98f749a4cbfe8e29113", RobustBitConfig.DEFAULT_VALUE)) {
                    build = (CatalystInstance) PatchProxy.accessDispatch(objArr4, iVar, changeQuickRedirect4, false, "11b0365dad79b98f749a4cbfe8e29113");
                } else {
                    i.b();
                    build = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(f).setJSExecutor(create).setJSFunctionCaller(g).setNativeModuleCallExceptionHandler(new com.meituan.msc.modules.exception.c(iVar.c)).build();
                    final com.meituan.msc.modules.manager.a aVar = new com.meituan.msc.modules.manager.a() { // from class: com.meituan.msc.modules.service.i.4
                        public static ChangeQuickRedirect b;

                        @Override // com.meituan.msc.modules.manager.a
                        public final void a(int i, Object obj) {
                            Object[] objArr5 = {Integer.valueOf(i), obj};
                            ChangeQuickRedirect changeQuickRedirect5 = b;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "08e2226c241cab332c54e10ff4ed5009", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "08e2226c241cab332c54e10ff4ed5009");
                            } else if (obj instanceof NativeMap) {
                                build.invokeCallback(i, RNArguments.fromJavaArgs(new Object[]{obj}));
                            } else {
                                build.invokeCallback(i, com.meituan.msc.modules.manager.e.a().a(obj));
                            }
                        }

                        @Override // com.meituan.msc.modules.manager.a
                        public final com.meituan.msc.modules.manager.h a() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = b;
                            return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2a4a4aa718637b4517894c1d0b3954af", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.manager.h) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2a4a4aa718637b4517894c1d0b3954af") : new com.meituan.msc.modules.manager.h() { // from class: com.meituan.msc.modules.service.i.4.1
                                public static ChangeQuickRedirect c;

                                {
                                    AnonymousClass4.this = this;
                                }

                                @Override // com.meituan.msc.modules.manager.h
                                public final void a(Runnable runnable) {
                                    Object[] objArr6 = {runnable};
                                    ChangeQuickRedirect changeQuickRedirect6 = c;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "82453ecd33cd5b70622f14d2dde3080e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "82453ecd33cd5b70622f14d2dde3080e");
                                    } else {
                                        build.getReactQueueConfiguration().getNativeModulesQueueThread().runOnQueue(runnable);
                                    }
                                }
                            };
                        }
                    };
                    ((CatalystInstanceImpl) build).setMessageInterface(new IMessageInterface() { // from class: com.meituan.msc.modules.service.i.5
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.jse.bridge.IMessageInterface
                        public final Object invokeSync(String str2, String str3, JSONArray jSONArray) {
                            Object[] objArr5 = {str2, str3, jSONArray};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "84d323805c1ba94c6589e8220419dc1f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "84d323805c1ba94c6589e8220419dc1f") : iVar.c.a(str2, str3, jSONArray, aVar);
                        }

                        @Override // com.meituan.msc.jse.bridge.IMessageInterface
                        public final void invoke(String str2, String str3, JSONArray jSONArray) {
                            Object[] objArr5 = {str2, str3, jSONArray};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3dccf727ac2319e78a3f7ef43c4af3e0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3dccf727ac2319e78a3f7ef43c4af3e0");
                                return;
                            }
                            if (DeviceEventManagerModule.NAME.equals(str2) && "invokeDefaultBackPressHandler".equals(str3)) {
                                com.meituan.msc.modules.reporter.g.d("[ServiceInstance@invoke]", "clear nativeModules");
                                ((CatalystInstanceImpl) iVar.d).clearNativeModulesQueue();
                            }
                            iVar.c.a(str2, str3, jSONArray, aVar);
                        }

                        @Override // com.meituan.msc.jse.bridge.IMessageInterface
                        public final JSONArray getConfig(String str2) {
                            Object[] objArr5 = {str2};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fb464def0aa9b14b843447b4111a4049", RobustBitConfig.DEFAULT_VALUE)) {
                                return (JSONArray) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fb464def0aa9b14b843447b4111a4049");
                            }
                            com.meituan.msc.modules.engine.h hVar2 = iVar.c;
                            Object[] objArr6 = {str2};
                            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msc.modules.engine.h.a;
                            return PatchProxy.isSupport(objArr6, hVar2, changeQuickRedirect6, false, "92e96ffb5c11de0c35bc4b681204fb55", RobustBitConfig.DEFAULT_VALUE) ? (JSONArray) PatchProxy.accessDispatch(objArr6, hVar2, changeQuickRedirect6, false, "92e96ffb5c11de0c35bc4b681204fb55") : hVar2.e.b(str2);
                        }
                    });
                }
                iVar.d = build;
            } catch (Exception e) {
                com.meituan.msc.modules.reporter.g.b("ServiceInstance", e, "initService");
            }
        }
        this.a.a(new Runnable() { // from class: com.meituan.msc.modules.service.f.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "380982a483c0336dec3ed670c0ca652f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "380982a483c0336dec3ed670c0ca652f");
                    return;
                }
                try {
                    Process.setThreadPriority(0);
                    f.this.h();
                    f.this.h = a.Launched;
                } catch (Exception e2) {
                    if (f.this.f != null) {
                        f.this.f.a(e2);
                    }
                    f.this.release();
                }
                if (f.this.g != null) {
                    f.this.g.a(new com.meituan.msc.modules.manager.f(f.this.b(), f.this.h));
                }
                hVar.o.b(f.this.c());
                com.meituan.msc.common.framework.c.a().e.a(f.this.e());
                if (dVar != null) {
                    dVar.a(f.this);
                }
            }
        });
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = b;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b53337621ae4259e22bbd2ed41635244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b53337621ae4259e22bbd2ed41635244");
            return;
        }
        final c.a aVar2 = new c.a() { // from class: com.meituan.msc.modules.service.f.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.service.c.a
            public final void a(long j) {
                Object[] objArr6 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e56ec68b822235b183b7e2e3e5ed9394", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e56ec68b822235b183b7e2e3e5ed9394");
                } else {
                    f.this.d = j;
                }
            }
        };
        Object[] objArr6 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect6 = b;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5cde76e968b1465a5cba55b394966b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5cde76e968b1465a5cba55b394966b63");
        } else {
            this.a.a(new Runnable() { // from class: com.meituan.msc.modules.service.f.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1d7f99af7b9f3a5b2116ac02f84639da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1d7f99af7b9f3a5b2116ac02f84639da");
                        return;
                    }
                    long f2 = f.f(f.this);
                    com.meituan.msc.modules.reporter.g.e(null, "MMP AppEngine used memory heap size:", Long.valueOf(f2), " bytes");
                    long j = f2 / 1024;
                    if (aVar2 != null) {
                        aVar2.a(j);
                    }
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public void relaunch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c4ee5311ff10e79df22d74fa3704a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c4ee5311ff10e79df22d74fa3704a1");
            return;
        }
        final i iVar = this.a;
        this.a.a(new Runnable() { // from class: com.meituan.msc.modules.service.f.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0b9d4962b0fb0662a7579d697e58a7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0b9d4962b0fb0662a7579d697e58a7d");
                    return;
                }
                f.this.h();
                if (iVar != null) {
                    iVar.c();
                }
            }
        });
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public i getJsExecutor() {
        return this.a;
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319ad0bae099d92aab5ffe2a2b16a6bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319ad0bae099d92aab5ffe2a2b16a6bc");
        } else if (this.e) {
        } else {
            this.e = true;
            if (this.a == null) {
                return;
            }
            i iVar = this.a;
            Runnable runnable = new Runnable() { // from class: com.meituan.msc.modules.service.f.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1375e5ee4d4a99ec6fd89a4f339aa68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1375e5ee4d4a99ec6fd89a4f339aa68");
                        return;
                    }
                    f.this.h = a.Released;
                    f.this.a.c();
                    f.a(f.this, (com.meituan.msc.modules.page.render.webview.g) null);
                    if (f.this.g != null) {
                        f.this.g.a(new com.meituan.msc.modules.manager.f(f.this.b(), f.this.h));
                    }
                    UIManagerModule.d();
                }
            };
            Object[] objArr2 = {runnable, 0L};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "b754fe3d13bed841eef2009804f891bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "b754fe3d13bed841eef2009804f891bc");
            } else if (iVar.d != null) {
                ((CatalystInstanceImpl) iVar.d).runOnJSQueueThreadDelay(runnable, 0L);
            }
        }
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public JSInstance getJSInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "987f0cecfd8ba09373e64150858ca6a7", RobustBitConfig.DEFAULT_VALUE) ? (JSInstance) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "987f0cecfd8ba09373e64150858ca6a7") : this.a.d;
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public void setOnEngineInitFailedListener(com.meituan.msc.modules.page.render.webview.g gVar) {
        this.f = gVar;
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c5dca89461d899eb960caffffacd9c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c5dca89461d899eb960caffffacd9c7");
        }
        if (this.a != null) {
            return (T) this.a.a(cls);
        }
        return null;
    }

    @Override // com.meituan.msc.modules.service.IServiceEngine
    public a getEngineStatus() {
        return this.h;
    }
}
