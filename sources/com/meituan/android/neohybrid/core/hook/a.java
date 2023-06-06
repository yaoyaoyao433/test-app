package com.meituan.android.neohybrid.core.hook;

import com.meituan.android.neohybrid.core.hook.WebViewCreateHooker;
import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final WebViewCreateHooker.AnonymousClass1 b;

    private a(WebViewCreateHooker.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static Runnable a(WebViewCreateHooker.AnonymousClass1 anonymousClass1) {
        Object[] objArr = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8dd8cea1c09b070a8aa2971b47c55860", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8dd8cea1c09b070a8aa2971b47c55860") : new a(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "623ebc2361040fd15bd4e6e250ca9254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "623ebc2361040fd15bd4e6e250ca9254");
            return;
        }
        WebViewCreateHooker.AnonymousClass1 anonymousClass1 = this.b;
        Object[] objArr2 = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect2 = WebViewCreateHooker.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5842d25f9ca047ff9342d137eed115c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5842d25f9ca047ff9342d137eed115c6");
            return;
        }
        final WebViewCreateHooker webViewCreateHooker = WebViewCreateHooker.this;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = WebViewCreateHooker.a;
        if (PatchProxy.isSupport(objArr3, webViewCreateHooker, changeQuickRedirect3, false, "50daf5ca32b20b6cf3e92bbe60b3f193", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, webViewCreateHooker, changeQuickRedirect3, false, "50daf5ca32b20b6cf3e92bbe60b3f193");
        } else if (webViewCreateHooker.c) {
        } else {
            b.a("WebViewProcessHooker", "init start");
            long currentTimeMillis = System.currentTimeMillis();
            webViewCreateHooker.c = true;
            webViewCreateHooker.b = 1;
            try {
                Class<?> cls = Class.forName("android.webkit.WebViewFactory");
                Method declaredMethod = cls.getDeclaredMethod("getProvider", new Class[0]);
                declaredMethod.setAccessible(true);
                final Field declaredField = cls.getDeclaredField("sProviderInstance");
                declaredField.setAccessible(true);
                final Object invoke = declaredMethod.invoke(null, new Object[0]);
                declaredField.set(null, Proxy.newProxyInstance(webViewCreateHooker.getClass().getClassLoader(), new Class[]{Class.forName("android.webkit.WebViewFactoryProvider")}, new InvocationHandler() { // from class: com.meituan.android.neohybrid.core.hook.WebViewCreateHooker.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr4) {
                        Object obj2;
                        Object[] objArr5 = {obj, method, objArr4};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "3a4b4143705a3bb24b316e8815a86478", RobustBitConfig.DEFAULT_VALUE)) {
                            return PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "3a4b4143705a3bb24b316e8815a86478");
                        }
                        try {
                            obj2 = method.invoke(invoke, objArr4);
                        } catch (Exception e) {
                            e = e;
                            obj2 = null;
                        }
                        try {
                            if ("createWebView".equals(method.getName())) {
                                b.a("WebViewProcessHooker", "invoke createWebView");
                                webViewCreateHooker.b = 2;
                                declaredField.set(null, invoke);
                                WebViewCreateHooker webViewCreateHooker2 = webViewCreateHooker;
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = WebViewCreateHooker.a;
                                if (PatchProxy.isSupport(objArr6, webViewCreateHooker2, changeQuickRedirect5, false, "4f88fb9f709689d33b3165e2bf79616e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, webViewCreateHooker2, changeQuickRedirect5, false, "4f88fb9f709689d33b3165e2bf79616e");
                                } else if (webViewCreateHooker2.d != null && !webViewCreateHooker2.d.isEmpty()) {
                                    for (Runnable runnable : webViewCreateHooker2.d) {
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                    webViewCreateHooker2.d.clear();
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            b.a(e, "WebViewProcessHooker_invoke");
                            return obj2;
                        }
                        return obj2;
                    }
                }));
                b.c("WebViewProcessHooker", "init end", new com.meituan.android.neohybrid.neo.report.a().a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).b);
            } catch (Exception e) {
                b.a(e, "WebViewProcessHooker_init");
            }
        }
    }
}
