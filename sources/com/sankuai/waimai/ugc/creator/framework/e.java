package com.sankuai.waimai.ugc.creator.framework;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;
    final Context b;
    final Set<com.sankuai.waimai.ugc.creator.framework.event.e> c;
    Bundle d;
    private HashMap<String, Object> e;

    public e(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a4e0d9b89a76c2108d9d86a6d806af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a4e0d9b89a76c2108d9d86a6d806af");
            return;
        }
        this.c = new HashSet();
        this.b = activity;
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f6eaf5bb834c794901466f4496de1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f6eaf5bb834c794901466f4496de1e");
        } else {
            a().put(str, obj);
        }
    }

    public final <T> T b(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd469efc0bf44b2bbf53fd1fbe2a93f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd469efc0bf44b2bbf53fd1fbe2a93f");
        }
        T t2 = (T) a().get(str);
        return t2 == null ? t : t2;
    }

    public HashMap<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf31067295f4e623272bb55e3dc1e973", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf31067295f4e623272bb55e3dc1e973");
        }
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new HashMap<>();
                }
            }
        }
        return this.e;
    }

    public final <T extends com.sankuai.waimai.ugc.creator.framework.event.e> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d42e1e33256142b46bdc57a9a928cdb", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d42e1e33256142b46bdc57a9a928cdb") : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends com.sankuai.waimai.ugc.creator.framework.event.e> com.sankuai.waimai.ugc.creator.framework.event.d<T> b(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1814879a83a8e73e6acacba62ddb3c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.ugc.creator.framework.event.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1814879a83a8e73e6acacba62ddb3c0");
        }
        com.sankuai.waimai.ugc.creator.framework.event.d<T> dVar = (com.sankuai.waimai.ugc.creator.framework.event.d<T>) new com.sankuai.waimai.ugc.creator.framework.event.d();
        for (com.sankuai.waimai.ugc.creator.framework.event.e eVar : this.c) {
            if (cls.isInstance(eVar)) {
                dVar.add(eVar);
            }
        }
        return dVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a<T> implements InvocationHandler {
        public static ChangeQuickRedirect a;
        private final Class<T> c;

        public a(Class<T> cls) {
            Object[] objArr = {e.this, cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b33fbd45be76b252261a82d2e1e7663", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b33fbd45be76b252261a82d2e1e7663");
            } else {
                this.c = cls;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "d90671a777121482e6e0c79e732867e2", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "d90671a777121482e6e0c79e732867e2");
            }
            for (com.sankuai.waimai.ugc.creator.framework.event.e eVar : e.this.c) {
                if (this.c.isInstance(eVar)) {
                    return method.invoke(eVar, objArr);
                }
            }
            return null;
        }
    }
}
