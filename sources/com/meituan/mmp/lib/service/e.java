package com.meituan.mmp.lib.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.webkit.ValueCallback;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.trace.h;
import com.meituan.mmp.lib.web.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.Thread;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e implements IServiceEngine {
    public static ChangeQuickRedirect a;
    private com.meituan.mmp.lib.web.b b;
    private m c;
    private Handler d;
    private com.meituan.mmp.lib.interfaces.b e;
    private f f;
    private Map<String, List<String>> g;
    private Map<String, List<String>> h;
    private h i;

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setOnJsUncaughtErrorHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3551839859334caae6b23caffc9125cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3551839859334caae6b23caffc9125cf");
        } else {
            this.d = new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void launch(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a4e1616c486bafda78a17645d37d05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a4e1616c486bafda78a17645d37d05");
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(applicationContext);
        } else {
            this.d.post(new Runnable() { // from class: com.meituan.mmp.lib.service.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16435dc50b3e10cff6dbbb85a78ca8c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16435dc50b3e10cff6dbbb85a78ca8c5");
                    } else {
                        e.this.a(applicationContext);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86810bb428b36eb131b64dae749bc18b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86810bb428b36eb131b64dae749bc18b");
            return;
        }
        this.b = new com.meituan.mmp.lib.web.b(context, this.c, 2);
        this.b.c = this.f;
        this.b.b = this.e;
        this.b.a("about:blank");
        this.b.a("platform='Android'", (ValueCallback<String>) null);
        if (this.g != null) {
            jSONObject = new JSONObject(this.g);
        } else {
            jSONObject = new JSONObject();
        }
        if (this.h != null) {
            jSONObject2 = new JSONObject(this.h);
        } else {
            jSONObject2 = new JSONObject();
        }
        com.meituan.mmp.lib.web.b bVar = this.b;
        bVar.a("MMPBridge.allowList=" + jSONObject.toString(), (ValueCallback<String>) null);
        com.meituan.mmp.lib.web.b bVar2 = this.b;
        bVar2.a("MMPBridge.forbidList=" + jSONObject2.toString(), (ValueCallback<String>) null);
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setMiniApp(m mVar) {
        this.c = mVar;
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setReporter(h hVar) {
        this.i = hVar;
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void relaunch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8f4f0ed9c2219628e4977888734ae49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8f4f0ed9c2219628e4977888734ae49");
        } else {
            this.d.post(new Runnable() { // from class: com.meituan.mmp.lib.service.e.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1eb23b3f56336f51b21a06a8a7a1031", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1eb23b3f56336f51b21a06a8a7a1031");
                        return;
                    }
                    e.this.b.b();
                    e.this.b.a("about:blank");
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setJsHandler(com.meituan.mmp.lib.interfaces.b bVar) {
        this.e = bVar;
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setSupportMsiApis(Map<String, List<String>> map, Map<String, List<String>> map2) {
        this.g = map;
        this.h = map2;
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec637a4e8665b56588542c16076c34b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec637a4e8665b56588542c16076c34b7");
        } else {
            this.d.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.service.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8275c55c92b9814275e3695e6757183", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8275c55c92b9814275e3695e6757183");
                    } else {
                        e.this.b.a();
                    }
                }
            }, 0L);
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void evaluateJavascript(String str, final String str2, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {str, str2, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ac8dd188d8cc05740b39c009c2b29a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ac8dd188d8cc05740b39c009c2b29a");
        } else {
            this.d.post(new Runnable() { // from class: com.meituan.mmp.lib.service.e.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "318f7b438589d62546fa7a17a21859d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "318f7b438589d62546fa7a17a21859d2");
                        return;
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    e.this.b.a(str2, new ValueCallback<String>() { // from class: com.meituan.mmp.lib.service.e.4.1
                        public static ChangeQuickRedirect a;

                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str3) {
                            String str4 = str3;
                            Object[] objArr3 = {str4};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b46fe3b9b2dd49bfb5d5be636f848fc6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b46fe3b9b2dd49bfb5d5be636f848fc6");
                                return;
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            if (str2.length() > 1000) {
                                com.meituan.mmp.lib.trace.b.b("evaluateJavascript", currentTimeMillis2 + StringUtil.SPACE + str2.length() + StringUtil.SPACE);
                            }
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(str4);
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.service.a
    public final void a(final Collection<DioFile> collection, String str, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {collection, str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d90a7ba08541d9b1c0a126d407a91d45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d90a7ba08541d9b1c0a126d407a91d45");
        } else if (collection == null) {
        } else {
            if (DebugHelper.d) {
                this.d.post(new Runnable() { // from class: com.meituan.mmp.lib.service.e.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5e6a9e29893451e805170b0ca89e2f7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5e6a9e29893451e805170b0ca89e2f7");
                            return;
                        }
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            com.meituan.mmp.lib.web.b bVar = e.this.b;
                            bVar.a(String.format("var a = document.createElement('script');\na.src = '%s'; a.async = %s;document.body.appendChild(a);", "mtlocalfile://" + ((DioFile) it.next()).h(), Boolean.FALSE), valueCallback);
                        }
                    }
                });
                return;
            }
            final String a2 = d.a(collection, valueCallback);
            this.d.post(new Runnable() { // from class: com.meituan.mmp.lib.service.e.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf3e48b33c3f505b887c8826b6600d67", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf3e48b33c3f505b887c8826b6600d67");
                    } else {
                        e.this.b.a(a2, valueCallback);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void evaluateJsFile(DioFile dioFile, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {dioFile, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a882c45df25fb940c7b865ff9c5e0fde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a882c45df25fb940c7b865ff9c5e0fde");
        } else {
            a(com.meituan.mmp.lib.utils.h.a(dioFile), dioFile.h(), valueCallback);
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setOnEngineInitFailedListener(f fVar) {
        this.f = fVar;
    }
}
