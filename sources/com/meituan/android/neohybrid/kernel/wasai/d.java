package com.meituan.android.neohybrid.kernel.wasai;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.protocol.kernel.NeoBridgeInterface;
import com.meituan.android.recce.ReccePackage;
import com.meituan.android.recce.RecceRootView;
import com.meituan.android.recce.bridge.RecceCustomApi;
import com.meituan.android.recce.exception.DefaultExceptionHandler;
import com.meituan.android.recce.exception.RecceExceptionHandler;
import com.meituan.android.recce.f;
import com.meituan.android.recce.g;
import com.meituan.android.recce.views.base.RecceUIManagerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements com.meituan.android.neohybrid.protocol.kernel.c<RecceRootView> {
    public static ChangeQuickRedirect a;
    com.meituan.android.neohybrid.protocol.kernel.d b;
    private final RecceRootView c;
    private g d;
    private com.meituan.android.neohybrid.protocol.kernel.b e;
    private boolean f;

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a() {
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(String str, ValueCallback<String> valueCallback) {
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final String b() {
        return "recce url";
    }

    public d(Context context, Object obj) {
        Object[] objArr = {context, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8ebc9db6726b40f3722e7200829ffc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8ebc9db6726b40f3722e7200829ffc8");
            return;
        }
        this.d = com.meituan.android.recce.c.a();
        this.f = false;
        this.c = new RecceRootView(context, obj);
        this.e = new c();
        g gVar = this.d;
        gVar.b = context;
        gVar.f = obj;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(String str) {
        com.meituan.android.recce.c cVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736b1e26c39414aa1eeb2e532903e6e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736b1e26c39414aa1eeb2e532903e6e6");
        } else if (this.f) {
        } else {
            this.f = true;
            if (str.startsWith(KernelConfig.KERNEL_TYPE_RECCE)) {
                this.d.d = str;
                final String[] strArr = new String[1];
                this.d.e = new RecceExceptionHandler() { // from class: com.meituan.android.neohybrid.kernel.wasai.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.recce.exception.RecceExceptionHandler
                    @RequiresApi(api = 26)
                    public final void handleException(int i, String str2, Throwable th) {
                        Object[] objArr2 = {Integer.valueOf(i), str2, th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fdbc23c324ba26b434c9a84ea77c0f8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fdbc23c324ba26b434c9a84ea77c0f8");
                            return;
                        }
                        Log.e("Recce-Android", "handleException " + str2 + " errormessage " + th.getMessage());
                        com.dianping.networklog.c.a("recce handleException errorName " + str2 + " detailMessage " + th.getMessage(), 3, new String[]{"Recce-Android"});
                        HashMap hashMap = new HashMap();
                        hashMap.put(NeoConfig.NEO_SCENE, strArr[0]);
                        hashMap.put("error_message", th.getMessage());
                        hashMap.put("status", "fail");
                        hashMap.put("error_name", str2);
                        com.meituan.android.recce.reporter.a.a("recce_offline_load", hashMap);
                        if (d.this.b != null) {
                            d.this.b.a(d.this, (RenderProcessGoneDetail) null);
                        }
                    }
                };
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    String queryParameter = parse.getQueryParameter("bundle_name");
                    strArr[0] = queryParameter;
                    String queryParameter2 = parse.getQueryParameter("extra_packages");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        this.d.a(new com.meituan.android.neohybrid.kernel.wasai.a(queryParameter, queryParameter2.split(CommonConstant.Symbol.COMMA)));
                    }
                }
                RecceRootView recceRootView = this.c;
                g gVar = this.d;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "3d237a037e56578b9a2f8f774be21311", RobustBitConfig.DEFAULT_VALUE)) {
                    cVar = (com.meituan.android.recce.c) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "3d237a037e56578b9a2f8f774be21311");
                } else {
                    com.facebook.infer.annotation.a.a(gVar.b, "recceContext property has not been set with this builder");
                    com.facebook.infer.annotation.a.a(gVar.d, "url property has not been set with this builder");
                    if (gVar.e == null) {
                        gVar.e = new DefaultExceptionHandler();
                    }
                    cVar = new com.meituan.android.recce.c(gVar.b, gVar.f, new g.a(), gVar.d, gVar.e);
                }
                Object[] objArr3 = {cVar};
                ChangeQuickRedirect changeQuickRedirect3 = RecceRootView.a;
                if (PatchProxy.isSupport(objArr3, recceRootView, changeQuickRedirect3, false, "a90a51a2118adc6d416dc9b449b74a82", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, recceRootView, changeQuickRedirect3, false, "a90a51a2118adc6d416dc9b449b74a82");
                    return;
                }
                UiThreadUtil.assertOnUiThread();
                recceRootView.b = cVar;
                com.meituan.android.recce.c cVar2 = recceRootView.b;
                Object[] objArr4 = {recceRootView};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.recce.c.a;
                if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "aaf62b7eb689e62f25b3b285e443ea0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "aaf62b7eb689e62f25b3b285e443ea0c");
                    return;
                }
                cVar2.e = recceRootView;
                cVar2.b.addRootView((RecceRootView) cVar2.e);
                if (cVar2.g == null) {
                    cVar2.a(cVar2.h);
                    return;
                }
                Object[] objArr5 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect5 = f.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "3661e958b32f2baa4722d575ed352938", RobustBitConfig.DEFAULT_VALUE)) {
                    com.meituan.android.recce.dev.a aVar = (com.meituan.android.recce.dev.a) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "3661e958b32f2baa4722d575ed352938");
                } else {
                    new f(cVar2);
                }
            }
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(String str, Map map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59f77c207d038347e7e54ec4f9bfb2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59f77c207d038347e7e54ec4f9bfb2e");
        } else {
            a(str);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd02326481c52e81934138ad3df51bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd02326481c52e81934138ad3df51bf");
        } else {
            this.d.a(new a(obj, str));
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(com.meituan.android.neohybrid.protocol.kernel.d dVar, boolean z) {
        this.b = dVar;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final com.meituan.android.neohybrid.protocol.kernel.d c() {
        return this.b;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final com.meituan.android.neohybrid.protocol.kernel.b d() {
        return this.e;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d91a0333110c40a910398d8f933cb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d91a0333110c40a910398d8f933cb9");
            return;
        }
        RecceRootView recceRootView = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = RecceRootView.a;
        if (PatchProxy.isSupport(objArr2, recceRootView, changeQuickRedirect2, false, "b00d8b133903bffce75229d4980be4d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, recceRootView, changeQuickRedirect2, false, "b00d8b133903bffce75229d4980be4d1");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (recceRootView.b != null) {
            recceRootView.b.d();
            recceRootView.b = null;
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d85b4e24919d518c971151f1370cd50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d85b4e24919d518c971151f1370cd50");
            return;
        }
        RecceRootView recceRootView = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = RecceRootView.a;
        if (PatchProxy.isSupport(objArr2, recceRootView, changeQuickRedirect2, false, "3f6e16c89a160e93a54eb55727be7223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, recceRootView, changeQuickRedirect2, false, "3f6e16c89a160e93a54eb55727be7223");
        } else {
            RecceUIManagerUtils.getRecceEventDispatcher(recceRootView).a(com.meituan.android.recce.events.a.a("appear", ""));
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b91b014bb8f2c8348056ce54b1a72296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b91b014bb8f2c8348056ce54b1a72296");
            return;
        }
        RecceRootView recceRootView = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = RecceRootView.a;
        if (PatchProxy.isSupport(objArr2, recceRootView, changeQuickRedirect2, false, "2cb216d9b22765c77917846717a4dd13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, recceRootView, changeQuickRedirect2, false, "2cb216d9b22765c77917846717a4dd13");
        } else {
            RecceUIManagerUtils.getRecceEventDispatcher(recceRootView).a(com.meituan.android.recce.events.a.a("disappear", ""));
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "294cf942c77b8137189c12e2864d17e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "294cf942c77b8137189c12e2864d17e7");
            return;
        }
        RecceRootView recceRootView = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = RecceRootView.a;
        if (PatchProxy.isSupport(objArr2, recceRootView, changeQuickRedirect2, false, "1a575a914943c8abad516c7a1a633a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, recceRootView, changeQuickRedirect2, false, "1a575a914943c8abad516c7a1a633a5c");
        } else {
            RecceUIManagerUtils.getRecceEventDispatcher(recceRootView).a(com.meituan.android.recce.events.a.a("background", ""));
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041dadcb584d8b172d56876c6e3f6f12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041dadcb584d8b172d56876c6e3f6f12");
            return;
        }
        RecceRootView recceRootView = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = RecceRootView.a;
        if (PatchProxy.isSupport(objArr2, recceRootView, changeQuickRedirect2, false, "1c7824aef660d0e41ae6dbaac5c7fbb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, recceRootView, changeQuickRedirect2, false, "1c7824aef660d0e41ae6dbaac5c7fbb8");
        } else {
            RecceUIManagerUtils.getRecceEventDispatcher(recceRootView).a(com.meituan.android.recce.events.a.a("foreground", ""));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements ReccePackage {
        public static ChangeQuickRedirect a;
        public Object b;
        public String c;

        public a(Object obj, String str) {
            Object[] objArr = {obj, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b15f587917e91e7c860748a01d3fe3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b15f587917e91e7c860748a01d3fe3");
                return;
            }
            this.b = obj;
            this.c = str;
        }

        @Override // com.meituan.android.recce.ReccePackage
        public final List<ViewManager> registerViewManagers(com.meituan.android.recce.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb49fc0872102d416985dd624e463d7", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb49fc0872102d416985dd624e463d7") : new ArrayList();
        }

        @Override // com.meituan.android.recce.ReccePackage
        public final Map<String, RecceCustomApi> getCustomApis() {
            Method[] declaredMethods;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e2ab93d7fbfa1f0617d3b7bda80caf", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e2ab93d7fbfa1f0617d3b7bda80caf");
            }
            HashMap hashMap = new HashMap();
            for (Method method : this.b.getClass().getDeclaredMethods()) {
                if (method.getAnnotation(NeoBridgeInterface.class) != null) {
                    String str = this.c + CommonConstant.Symbol.DOT + method.getName();
                    hashMap.put(str, new b(str, this.b, method));
                }
            }
            return hashMap;
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(com.meituan.android.neohybrid.protocol.kernel.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1831ac64b233781fff0dd5692086ccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1831ac64b233781fff0dd5692086ccd");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final /* bridge */ /* synthetic */ RecceRootView j() {
        return this.c;
    }
}
