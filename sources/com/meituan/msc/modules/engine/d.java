package com.meituan.msc.modules.engine;

import com.meituan.msc.common.utils.an;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static <T extends JavaScriptModule> T a(final Class<T> cls, final NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        Object[] objArr = {cls, nativeModuleCallExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d72c9e143ff1eed435dce78b90beace", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d72c9e143ff1eed435dce78b90beace") : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.meituan.msc.modules.engine.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr2) throws Throwable {
                Object[] objArr3 = {obj, method, objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "52cfc56d952b866f3236f135fc827abe", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "52cfc56d952b866f3236f135fc827abe");
                }
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr2);
                }
                String str = "can't find module:" + cls.getName() + " for method: " + method.getName();
                if (nativeModuleCallExceptionHandler != null) {
                    nativeModuleCallExceptionHandler.handleException(new com.meituan.msc.modules.manager.p(str));
                } else {
                    com.meituan.msc.modules.reporter.g.e(str, "after destroy runtime");
                }
                return an.a(method);
            }
        });
    }
}
