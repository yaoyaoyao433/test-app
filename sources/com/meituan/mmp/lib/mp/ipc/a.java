package com.meituan.mmp.lib.mp.ipc;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f928d8434519971d943bac33a6926645", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f928d8434519971d943bac33a6926645");
        } else {
            this.e = cls;
        }
    }

    public final boolean a(Method method) {
        Object[] objArr = {method};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dedb556f51fcfcfb37d53e1015de6338", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dedb556f51fcfcfb37d53e1015de6338")).booleanValue() : method.equals(b) || method.equals(c) || method.equals(d);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object[] objArr2 = {obj, method, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "f9c1730500434b617ef4d94b2138039d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "f9c1730500434b617ef4d94b2138039d");
        }
        if (method.equals(b)) {
            return Boolean.valueOf(obj == objArr[0]);
        } else if (method.equals(c)) {
            return Integer.valueOf(System.identityHashCode(obj));
        } else {
            if (method.equals(d)) {
                Object[] objArr3 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "e6c3066fdc082ce39f684c3302ee7699", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "e6c3066fdc082ce39f684c3302ee7699");
                }
                return "proxy@" + System.identityHashCode(obj) + " for " + this.e.getName();
            }
            return null;
        }
    }
}
