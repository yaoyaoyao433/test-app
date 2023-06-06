package com.sankuai.meituan.mapsdk.mapcore.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements InvocationHandler {
    public static ChangeQuickRedirect a;
    private Object b;

    public a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d43724734fc3e6354986e380c6d11c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d43724734fc3e6354986e380c6d11c");
        } else {
            this.b = obj;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object[] objArr2 = {obj, method, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "8637b27707b81ef99a40263544ec58e3", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "8637b27707b81ef99a40263544ec58e3");
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.f("ApiReport\tmethod name:" + method.getName() + " , args:" + Arrays.toString(objArr));
        return method.invoke(this.b, objArr);
    }
}
