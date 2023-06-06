package com.meituan.msc.modules.engine;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.mrn.module.MRNExceptionsManagerModule;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.config.MSCRenderConfig;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.jse.bridge.JavaCallback;
import com.meituan.msc.jse.bridge.JavaFunctionsInterface;
import com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.mmpviews.perflist.PerfListInfoWrapper;
import com.meituan.msc.modules.api.legacy.timing.c;
import com.meituan.msc.modules.exception.b;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.m;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.service.IServiceEngine;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "MainThreadJSEngineService")
/* loaded from: classes3.dex */
public class k extends BaseJSEngineServiceModule<com.meituan.msc.modules.service.h> {
    public static ChangeQuickRedirect a;
    public boolean f;
    public final PerfListInfoWrapper g;
    public PackageInfoWrapper h;
    public DioFile i;
    public PackageInfoWrapper j;
    public DioFile k;
    public final Set<String> l;
    public final Map<String, com.meituan.msc.views.precreate.c> m;
    private boolean s;
    private boolean t;
    private final List<Runnable> u;

    @Override // com.meituan.msc.modules.engine.BaseJSEngineServiceModule
    public final /* synthetic */ com.meituan.msc.modules.service.h c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3d33eedbcd6b599f4d0c00224c252e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.service.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3d33eedbcd6b599f4d0c00224c252e") : new com.meituan.msc.modules.service.h();
    }

    public static /* synthetic */ void c(k kVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "edc1e1a235ed991c7fe03a61c0166738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "edc1e1a235ed991c7fe03a61c0166738");
            return;
        }
        kVar.t = true;
        kVar.h();
    }

    public static /* synthetic */ void f(k kVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "9192edd1fcc863ab5466c60d35a7dab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "9192edd1fcc863ab5466c60d35a7dab5");
            return;
        }
        kVar.s = true;
        kVar.h();
    }

    public k(com.meituan.msc.modules.page.render.webview.g gVar) {
        super(gVar);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a763d65c87c2266e2969f4b7adb042f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a763d65c87c2266e2969f4b7adb042f");
            return;
        }
        this.s = false;
        this.t = false;
        this.f = false;
        this.g = new PerfListInfoWrapper();
        this.u = new Vector();
        this.l = new HashSet();
        this.m = new ConcurrentHashMap();
    }

    public final boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76cdf512cd7c32d6812cd08cfab5d055", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76cdf512cd7c32d6812cd08cfab5d055")).booleanValue();
        }
        try {
            if (MSCRenderConfig.n()) {
                String queryParameter = uri.getQueryParameter("rlist_replace_store_single_mode");
                if (queryParameter == null || ErrorCode.ERROR_TYPE_B.equals(queryParameter)) {
                    String queryParameter2 = uri.getQueryParameter("rlist_replace_comment_page");
                    if (queryParameter2 != null) {
                        if (!ErrorCode.ERROR_TYPE_B.equals(queryParameter2)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.a(th);
            return false;
        }
    }

    public boolean b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729a7116b25909da6b7defec2435859f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729a7116b25909da6b7defec2435859f")).booleanValue();
        }
        try {
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.a(th);
        }
        if (ErrorCode.ERROR_TYPE_B.equals(uri.getQueryParameter("rlist_replace_store_single_mode"))) {
            return true;
        }
        return ErrorCode.ERROR_TYPE_B.equals(uri.getQueryParameter("rlist_replace_comment_page"));
    }

    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d651c3ae94c848b22693b16c05b5ee5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d651c3ae94c848b22693b16c05b5ee5")).booleanValue() : MSCRenderConfig.p() && b(str);
    }

    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c4dd256837c48e042d5fdb00c4f07a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c4dd256837c48e042d5fdb00c4f07a")).booleanValue() : this.l.contains(str);
    }

    public final void a(String str, ReactContext reactContext) {
        Object[] objArr = {str, reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc1d10ccd2da2aeadcb50215f6703ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc1d10ccd2da2aeadcb50215f6703ab2");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("MainThreadJsEngine", "onFPEnd pagePath:", str);
        if (!a(str)) {
            com.meituan.msc.modules.reporter.g.d("MainThreadJsEngine", "PreCreateView Disabled, ", Boolean.valueOf(MSCRenderConfig.p()), Boolean.valueOf(b(str)));
            return;
        }
        com.meituan.msc.views.precreate.c cVar = this.m.get(str);
        if (cVar == null) {
            com.meituan.msc.modules.reporter.g.d("MainThreadJsEngine", "no preCreateViewHolder in Page:", str);
            return;
        }
        Object[] objArr2 = {reactContext};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.views.precreate.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f665009d3fd7f807197e5fa17e0b89c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f665009d3fd7f807197e5fa17e0b89c8");
        } else {
            cVar.K = new WeakReference<>(reactContext);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.views.precreate.c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "d0da8efe13e70f447127f1b5076646c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "d0da8efe13e70f447127f1b5076646c1");
            return;
        }
        ReactContext b = cVar.b();
        com.meituan.msc.modules.reporter.g.d("PreCreateView", "tryPreCreateViews");
        if (b == null) {
            com.meituan.msc.modules.reporter.g.d("PreCreateView", "tryPreCreateViews cachedContext is null");
        } else if (cVar.Q.getAndSet(true)) {
            com.meituan.msc.modules.reporter.g.d("PreCreateView", "tryPreCreateViews is already TryPreCreateViews");
        } else {
            cVar.a().postDelayed(cVar.R, 100L);
        }
    }

    public final <T> T a(String str, com.meituan.msc.views.precreate.a<T> aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e4d440be2f1d93cd2301fff18cf4781", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e4d440be2f1d93cd2301fff18cf4781");
        }
        if (!a(str)) {
            com.meituan.msc.modules.reporter.g.b("MainThreadJsEngine", "tryGetMPInlineBlockTextView, PreCreateView Disabled");
            return aVar.a();
        }
        com.meituan.msc.views.precreate.c cVar = this.m.get(str);
        if (cVar == null) {
            return aVar.a();
        }
        return aVar.a(cVar);
    }

    public void a(List<PerfListInfoWrapper.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eff6f2a12e57676920c25b476576b20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eff6f2a12e57676920c25b476576b20");
            return;
        }
        for (PerfListInfoWrapper.a aVar : list) {
            PerfListInfoWrapper perfListInfoWrapper = this.g;
            Context context = MSCEnvHelper.getContext();
            Object[] objArr2 = {context, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = PerfListInfoWrapper.a;
            if (PatchProxy.isSupport(objArr2, perfListInfoWrapper, changeQuickRedirect2, false, "19cca00d95b61c47925b4b438029ed78", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, perfListInfoWrapper, changeQuickRedirect2, false, "19cca00d95b61c47925b4b438029ed78");
            } else {
                synchronized (perfListInfoWrapper.d) {
                    if (!perfListInfoWrapper.d.containsKey(aVar)) {
                        perfListInfoWrapper.d.put(aVar, perfListInfoWrapper.a(context, aVar));
                    }
                }
            }
        }
    }

    public final synchronized void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c91b5bf96b78d0ee5b294894937e19f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c91b5bf96b78d0ee5b294894937e19f8");
            return;
        }
        if (this.i != null && this.i.c()) {
            if (this.k != null && this.k.c()) {
                final PerfEventRecorder perfEventRecorder = U_().o;
                perfEventRecorder.a("r_engine_create");
                final long nanoTime = System.nanoTime();
                a(new com.meituan.msc.modules.service.d() { // from class: com.meituan.msc.modules.engine.k.7
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.service.d
                    public final void a(IServiceEngine iServiceEngine) {
                        Object[] objArr2 = {iServiceEngine};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02c1d5358d3d1f0524f658bde669d6e3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02c1d5358d3d1f0524f658bde669d6e3");
                            return;
                        }
                        perfEventRecorder.b("r_engine_create");
                        com.meituan.msc.modules.reporter.g.d("MainThreadJsEngine", "init main thread js engine, time:", Long.valueOf(System.nanoTime() - nanoTime));
                        com.meituan.msc.modules.api.legacy.timing.c cVar = (com.meituan.msc.modules.api.legacy.timing.c) k.this.U_().c(com.meituan.msc.modules.api.legacy.timing.c.class);
                        JSInstance jSInstance = iServiceEngine.getJSInstance();
                        Object[] objArr3 = {jSInstance};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.api.legacy.timing.c.a;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "7c5c22e2b89f7720a8bcee4a4b2b1c9b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "7c5c22e2b89f7720a8bcee4a4b2b1c9b");
                        } else {
                            jSInstance.registerJSObject("NativeTiming", new c.a());
                        }
                        final com.meituan.msc.modules.mainthread.a aVar = (com.meituan.msc.modules.mainthread.a) k.this.U_().c(com.meituan.msc.modules.mainthread.a.class);
                        final k kVar = k.this;
                        Object[] objArr4 = {kVar};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.mainthread.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "e754d1f67bcc08805dff491f83d28a2d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "e754d1f67bcc08805dff491f83d28a2d");
                        } else if (kVar != null && kVar.d() != null) {
                            JSInstance d = kVar.d();
                            d.registerJavaCallback(SnifferDBHelper.COLUMN_LOG, new JavaCallback() { // from class: com.meituan.msc.modules.mainthread.a.1
                                @Override // com.meituan.msc.jse.bridge.JavaCallback
                                public final String invoke(ReadableArray readableArray) {
                                    return null;
                                }
                            });
                            d.registerJSObject("NativeBridge", new JavaFunctionsInterface() { // from class: com.meituan.msc.modules.mainthread.a.2
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.msc.jse.bridge.JavaFunctionsInterface
                                public final String[] getFunctionNames() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e7a94e84ebbed0172954a41712dd41e7", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e7a94e84ebbed0172954a41712dd41e7") : new String[]{"invoke", "importScripts"};
                                }

                                @Override // com.meituan.msc.jse.bridge.JavaFunctionsInterface
                                public final JavaCallback[] getFunctions() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a6dae291c92eae16186e5877bee9df2e", RobustBitConfig.DEFAULT_VALUE) ? (JavaCallback[]) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a6dae291c92eae16186e5877bee9df2e") : new JavaCallback[]{new JavaCallback() { // from class: com.meituan.msc.modules.mainthread.a.2.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.meituan.msc.jse.bridge.JavaCallback
                                        public final String invoke(ReadableArray readableArray) {
                                            Object[] objArr6 = {readableArray};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3df71867a64e7a4562d9f84d7abe53dc", RobustBitConfig.DEFAULT_VALUE)) {
                                                return (String) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3df71867a64e7a4562d9f84d7abe53dc");
                                            }
                                            if (readableArray.size() == 3 && readableArray.getType(0) == ReadableType.String && readableArray.getType(1) == ReadableType.String && readableArray.getType(2) == ReadableType.String) {
                                                String string = readableArray.getString(0);
                                                String string2 = readableArray.getString(1);
                                                String string3 = readableArray.getString(2);
                                                a aVar2 = a.this;
                                                Object[] objArr7 = {string, string2, string3};
                                                ChangeQuickRedirect changeQuickRedirect7 = a.a;
                                                if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "73442bc43ed0da9e3b0fe8696f82c320", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "73442bc43ed0da9e3b0fe8696f82c320");
                                                } else if (string != null && string2 != null) {
                                                    if (MRNExceptionsManagerModule.NAME.equals(string)) {
                                                        if ("reportException".equals(string2)) {
                                                            try {
                                                                ((b) aVar2.U_().c(b.class)).reportException(new JSONObject(string3));
                                                            } catch (JSONException e) {
                                                                e.printStackTrace();
                                                            }
                                                        }
                                                    } else if ("RList".equals(string)) {
                                                        if (NotificationCompat.CATEGORY_TRANSPORT.equals(string2)) {
                                                            Object[] objArr8 = {string3};
                                                            ChangeQuickRedirect changeQuickRedirect8 = a.a;
                                                            if (PatchProxy.isSupport(objArr8, aVar2, changeQuickRedirect8, false, "39caf448cebb17ab1913c2c8f586f568", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr8, aVar2, changeQuickRedirect8, false, "39caf448cebb17ab1913c2c8f586f568");
                                                            } else {
                                                                JSInstance d2 = ((com.meituan.msc.modules.engine.a) aVar2.U_().c(com.meituan.msc.modules.engine.a.class)).d();
                                                                if (d2 != null) {
                                                                    ((JSRList) d2.getJSModule(JSRList.class)).transport(string3);
                                                                }
                                                            }
                                                        } else if ("reloadItem".equals(string2)) {
                                                            aVar2.a(string2, string3, string3);
                                                        } else if (SearchIntents.EXTRA_QUERY.equals(string2)) {
                                                            aVar2.a(string2, string3, string3);
                                                        } else {
                                                            throw new RuntimeException("unknown type!");
                                                        }
                                                    } else if ("AnimationManager".equals(string)) {
                                                        try {
                                                            JSONObject jSONObject = new JSONObject(string3);
                                                            int optInt = jSONObject.optInt("pageId");
                                                            k b = aVar2.U_().b("PageManager");
                                                            if (b == null) {
                                                                g.d("NativeRList", "PageManager is null when animate");
                                                            } else {
                                                                k f = b.f(String.valueOf(optInt)).f("AnimationManager");
                                                                if (f instanceof com.meituan.msc.modules.viewmanager.a) {
                                                                    if ("createListKeyframesAnimation".equals(string2)) {
                                                                        ((com.meituan.msc.modules.viewmanager.a) f).createRListKeyframesAnimation(jSONObject);
                                                                    } else if ("clearListKeyframesAnimation".equals(string2)) {
                                                                        ((com.meituan.msc.modules.viewmanager.a) f).clearRListKeyframesAnimation(jSONObject);
                                                                    }
                                                                }
                                                            }
                                                        } catch (m e2) {
                                                            g.a("NativeRList", e2);
                                                        } catch (JSONException e3) {
                                                            e3.printStackTrace();
                                                        }
                                                    }
                                                }
                                                return null;
                                            }
                                            return null;
                                        }
                                    }, new JavaCallback() { // from class: com.meituan.msc.modules.mainthread.a.2.2
                                        public static ChangeQuickRedirect a;

                                        @Override // com.meituan.msc.jse.bridge.JavaCallback
                                        public final String invoke(ReadableArray readableArray) {
                                            int i = 0;
                                            Object[] objArr6 = {readableArray};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6e2f70a21146231bef40575089199bd6", RobustBitConfig.DEFAULT_VALUE)) {
                                                return (String) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6e2f70a21146231bef40575089199bd6");
                                            }
                                            if (readableArray.size() != 1 || readableArray.getType(0) != ReadableType.Array) {
                                                return null;
                                            }
                                            JSONArray jSONArray = new JSONArray();
                                            ReadableArray array = readableArray.getArray(0);
                                            while (true) {
                                                array.getClass();
                                                if (i < array.size()) {
                                                    jSONArray.put(array.getString(i));
                                                    i++;
                                                } else {
                                                    return kVar.importScripts(jSONArray, null);
                                                }
                                            }
                                        }
                                    }};
                                }
                            });
                        }
                        k.this.a(k.this.j, k.this.k, perfEventRecorder, "r_engine_inject_buz", new Runnable() { // from class: com.meituan.msc.modules.engine.k.7.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "73da49eb2f2bce0b91da2db55207da25", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "73da49eb2f2bce0b91da2db55207da25");
                                } else {
                                    k.c(k.this);
                                }
                            }
                        });
                        k.this.a(k.this.h, k.this.i, perfEventRecorder, "r_engine_inject_base", new Runnable() { // from class: com.meituan.msc.modules.engine.k.7.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "484cf1f7281a8a03a0e02de1c2e922ea", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "484cf1f7281a8a03a0e02de1c2e922ea");
                                } else {
                                    k.f(k.this);
                                }
                            }
                        });
                    }
                });
                return;
            }
            com.meituan.msc.modules.reporter.g.d("MainThreadJsEngine", "list js file(app-service.list.js)  is not exists");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("MainThreadJsEngine", "runtime js file(rlist-runtime.js) is not exists");
    }

    public final void a(PackageInfoWrapper packageInfoWrapper, DioFile dioFile, final PerfEventRecorder perfEventRecorder, final String str, final Runnable runnable) {
        Object[] objArr = {packageInfoWrapper, dioFile, perfEventRecorder, str, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8440736b6920559bae23f95a8a4d5d40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8440736b6920559bae23f95a8a4d5d40");
            return;
        }
        perfEventRecorder.a(str);
        final long nanoTime = System.nanoTime();
        String a2 = com.meituan.msc.modules.update.d.a(packageInfoWrapper);
        String a3 = com.meituan.msc.modules.service.codecache.c.a().a(U_(), packageInfoWrapper, dioFile, a2, true);
        LoadJSCodeCacheCallback a4 = com.meituan.msc.modules.service.codecache.c.a().a(U_(), dioFile);
        com.meituan.msc.modules.service.codecache.c.a().a(packageInfoWrapper.appId, packageInfoWrapper.getDDResourceName(), dioFile.a());
        ((com.meituan.msc.modules.service.h) this.d).evaluateJsFile(dioFile, a2, new o() { // from class: com.meituan.msc.modules.engine.k.8
            public static ChangeQuickRedirect a;

            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17d0313395a12d9e2a516b4bce0aee1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17d0313395a12d9e2a516b4bce0aee1e");
                    return;
                }
                com.meituan.msc.modules.reporter.g.d("MainThreadJsEngine", str + " success, time:", Long.valueOf(System.nanoTime() - nanoTime));
                perfEventRecorder.b(str);
                runnable.run();
            }

            @Override // com.meituan.msc.modules.engine.o
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "891d1d71e8df70b79dad8ece9b1f9048", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "891d1d71e8df70b79dad8ece9b1f9048");
                    return;
                }
                com.meituan.msc.modules.reporter.g.d("MainThreadJsEngine", str + " failed, time:", Long.valueOf(System.nanoTime() - nanoTime));
            }
        }, a3, a4);
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72701271da8d9edc104a6c30244d1e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72701271da8d9edc104a6c30244d1e6");
        } else if (!this.f && this.s && this.t) {
            this.f = true;
            synchronized (this.u) {
                for (Runnable runnable : this.u) {
                    runnable.run();
                }
            }
        }
    }

    public final void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9233449d0b2fd9d83686cdd225214eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9233449d0b2fd9d83686cdd225214eef");
            return;
        }
        synchronized (this.u) {
            if (this.u.contains(runnable)) {
                return;
            }
            this.u.add(runnable);
        }
    }

    public final void c(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36536fbc08aa0b760bd6acbde47cce4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36536fbc08aa0b760bd6acbde47cce4");
            return;
        }
        synchronized (this.u) {
            if (this.u.contains(runnable)) {
                this.u.remove(runnable);
            }
        }
    }

    @Override // com.meituan.msc.modules.manager.k, com.meituan.msc.modules.manager.c
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e76adcb10d6375860e22155594a2563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e76adcb10d6375860e22155594a2563");
            return;
        }
        this.u.clear();
        super.o();
    }

    public final void c(String str) {
        com.meituan.msc.views.precreate.c remove;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc1c66971f202e2bc7f5e61d514b93f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc1c66971f202e2bc7f5e61d514b93f");
        } else if (a(str) && (remove = this.m.remove(str)) != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.views.precreate.c.a;
            if (PatchProxy.isSupport(objArr2, remove, changeQuickRedirect2, false, "aed22ab4afaa2d1198a2284cf435996d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, remove, changeQuickRedirect2, false, "aed22ab4afaa2d1198a2284cf435996d");
            } else {
                remove.a().removeCallbacks(remove.R);
            }
        }
    }
}
