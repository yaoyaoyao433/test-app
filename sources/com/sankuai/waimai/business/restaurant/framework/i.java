package com.sankuai.waimai.business.restaurant.framework;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    final Context b;
    final Set<f> c;
    Bundle d;
    String e;

    public i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85bf82f9f59dd54c5b7c77ac6cba1062", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85bf82f9f59dd54c5b7c77ac6cba1062");
            return;
        }
        this.c = new HashSet();
        this.b = context;
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f4a2950b9bda91adb49376937bb7deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f4a2950b9bda91adb49376937bb7deb");
        } else if (obj instanceof f) {
            this.c.add((f) obj);
        }
    }

    public final void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a415b33f3fb93bf22a4cf8c6fc02ed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a415b33f3fb93bf22a4cf8c6fc02ed6");
        } else if (obj instanceof f) {
            this.c.remove(obj);
        }
    }

    @NonNull
    public final <T extends f> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b03ab9968ed69e08b97544abb93ad46f", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b03ab9968ed69e08b97544abb93ad46f") : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a<T> implements InvocationHandler {
        public static ChangeQuickRedirect a;
        private final Class<T> c;

        public a(Class<T> cls) {
            Object[] objArr = {i.this, cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f7c84ff4d72d5b868072131a187cdc7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f7c84ff4d72d5b868072131a187cdc7");
            } else {
                this.c = cls;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            boolean z = true;
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "9146c0b5a136bafcd150551dc5db2692", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "9146c0b5a136bafcd150551dc5db2692");
            }
            Object obj2 = null;
            for (f fVar : i.this.c) {
                if (this.c.isInstance(fVar)) {
                    if (z) {
                        obj2 = method.invoke(fVar, objArr);
                        z = false;
                    } else {
                        method.invoke(fVar, objArr);
                    }
                }
            }
            return obj2;
        }
    }
}
