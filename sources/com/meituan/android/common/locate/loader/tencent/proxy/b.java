package com.meituan.android.common.locate.loader.tencent.proxy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class b implements InvocationHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a a;

    public void a(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object[] objArr2 = {obj, method, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84289f859a5fa7b949fc01150b575b04", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84289f859a5fa7b949fc01150b575b04");
        }
        if (this.a == null) {
            return null;
        }
        String name = method.getName();
        if (name.contains("onLocationChanged")) {
            if (objArr != null && objArr.length == 3) {
                this.a.a(new com.meituan.android.common.locate.loader.tencent.bean.b(objArr[0]), objArr[1] != null ? ((Integer) objArr[1]).intValue() : 0, objArr[2] == null ? null : String.valueOf(objArr[2]));
            }
        } else if (name.contains("onStatusUpdate") && objArr != null && objArr.length == 3) {
            this.a.a(objArr[0] == null ? null : String.valueOf(objArr[0]), objArr[1] != null ? ((Integer) objArr[1]).intValue() : 0, objArr[2] == null ? null : String.valueOf(objArr[2]));
        }
        return null;
    }
}
