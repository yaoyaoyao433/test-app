package com.meituan.msc.common.process.ipc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements InvocationHandler {
    public static ChangeQuickRedirect a;
    private static final Method b;
    private static final Method c;
    private static final Method d;
    private final Class<?> e;

    static {
        try {
            b = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            c = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
            d = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchMethodException e2) {
            throw new NoSuchMethodError(e2.getMessage());
        }
    }

    public a(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c341ed1a81224733eac0fee6151e52cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c341ed1a81224733eac0fee6151e52cc");
        } else {
            this.e = cls;
        }
    }

    public final boolean a(Method method) {
        Object[] objArr = {method};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc927bef8840d08c317aa471b95477c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc927bef8840d08c317aa471b95477c1")).booleanValue() : method.equals(b) || method.equals(c) || method.equals(d);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object[] objArr2 = {obj, method, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "a8a0d8e7f98dc5169549b9896585d1fe", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "a8a0d8e7f98dc5169549b9896585d1fe");
        }
        if (method.equals(b)) {
            return Boolean.valueOf(obj == objArr[0]);
        } else if (method.equals(c)) {
            return Integer.valueOf(System.identityHashCode(obj));
        } else {
            if (method.equals(d)) {
                Object[] objArr3 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "325f93fc6a084791d7b10cc5da4dde7a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "325f93fc6a084791d7b10cc5da4dde7a");
                }
                return "proxy@" + System.identityHashCode(obj) + " for " + this.e.getName();
            }
            return null;
        }
    }
}
