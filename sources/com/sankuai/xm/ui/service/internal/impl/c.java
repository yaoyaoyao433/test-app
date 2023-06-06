package com.sankuai.xm.ui.service.internal.impl;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        public static final c a = new c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a<T> implements InvocationHandler {
        public static ChangeQuickRedirect a;
        private Class<T> b;
        private T c;
        private T d;
        private Set<Method> e;

        public a(Class<T> cls, T t, @NonNull T t2, Method[] methodArr) {
            Object[] objArr = {cls, t, t2, methodArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bea5933d6586bd7e77e4123fad236af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bea5933d6586bd7e77e4123fad236af");
                return;
            }
            this.e = new HashSet();
            this.b = cls;
            this.c = t;
            this.d = t2;
            if (methodArr == null || methodArr.length <= 0) {
                return;
            }
            this.e.addAll(Arrays.asList(methodArr));
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "2fd194cacda3011d6eef1e067732fad0", 6917529027641081856L)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "2fd194cacda3011d6eef1e067732fad0");
            }
            if (this.e.contains(method)) {
                if (this.c != null) {
                    method.invoke(this.d, objArr);
                    return method.invoke(this.c, objArr);
                }
                return method.invoke(this.d, objArr);
            }
            if (this.c != null && method.getAnnotation(Deprecated.class) == null) {
                try {
                    return method.invoke(this.c, objArr);
                } catch (Throwable th) {
                    d.a(th, "cls: %s, target:%s", this.b, this.c);
                }
            }
            return method.invoke(this.d, objArr);
        }
    }

    public final <T> T a(Class<T> cls, T t, @NonNull T t2, Method... methodArr) {
        Object[] objArr = {cls, t, t2, methodArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75663f484f6210b6ee76afd37a2458e8", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75663f484f6210b6ee76afd37a2458e8");
        }
        try {
            return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls, t, t2, methodArr)));
        } catch (Throwable th) {
            d.a(th);
            return t2;
        }
    }
}
