package com.meituan.android.mrn.knb;

import com.facebook.react.bridge.JavaScriptModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final HashMap<Class<? extends JavaScriptModule>, JavaScriptModule> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32cf568d98180159957a41a2f689d3f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32cf568d98180159957a41a2f689d3f0");
        } else {
            this.b = new HashMap<>();
        }
    }

    public final synchronized <T extends JavaScriptModule> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03f3e06dface74d967ebb3d98eabe55", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03f3e06dface74d967ebb3d98eabe55");
        }
        T t = (T) this.b.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        this.b.put(cls, t2);
        return t2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a implements InvocationHandler {
        public static ChangeQuickRedirect a;

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            return null;
        }

        public a(Class<? extends JavaScriptModule> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde4967ee0703b6b7ee11d410c8e1dd2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde4967ee0703b6b7ee11d410c8e1dd2");
            }
        }
    }
}
