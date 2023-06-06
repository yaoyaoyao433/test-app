package com.sankuai.waimai.router.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.components.h;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final Map<Class, Object> b = new HashMap();

    public static <I, T extends I> T a(Class<I> cls, com.sankuai.waimai.router.service.c cVar) throws Exception {
        Object[] objArr = {cls, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0f77dbc0e1256bdb03dd3b4f5f7d5bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0f77dbc0e1256bdb03dd3b4f5f7d5bc");
        }
        if (cls == null) {
            return null;
        }
        if (cVar == null) {
            cVar = h.a();
        }
        T t = (T) b(cls, cVar);
        com.sankuai.waimai.router.core.d.a("[SingletonPool]   get instance of class = %s, result = %s", cls, t);
        return t;
    }

    @NonNull
    private static Object b(@NonNull Class cls, @NonNull com.sankuai.waimai.router.service.c cVar) throws Exception {
        Object obj;
        Object[] objArr = {cls, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f374665ee64d5b1ed8b22deffb55fc0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f374665ee64d5b1ed8b22deffb55fc0");
        }
        Object obj2 = b.get(cls);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (b) {
            obj = b.get(cls);
            if (obj == null) {
                com.sankuai.waimai.router.core.d.a("[SingletonPool] >>> create instance: %s", cls);
                obj = cVar.a(cls);
                if (obj != null) {
                    b.put(cls, obj);
                }
            }
        }
        return obj;
    }
}
