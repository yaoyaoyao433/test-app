package com.sankuai.waimai.store.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    Set<d> b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fccbc029d9aeb536b910bb0d815a287", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fccbc029d9aeb536b910bb0d815a287");
        } else {
            this.b = new HashSet();
        }
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f3ba6403bdb27d3afd5398f9c76484b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f3ba6403bdb27d3afd5398f9c76484b");
        } else if (obj instanceof d) {
            this.b.add((d) obj);
        }
    }

    public final void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49ee1e3bf112f0bab8a662584bc8f4ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49ee1e3bf112f0bab8a662584bc8f4ac");
        } else if (obj instanceof d) {
            this.b.remove(obj);
        }
    }

    public final <T extends d> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2404e263ed48dc19c4bec505b633017", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2404e263ed48dc19c4bec505b633017") : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a<T> implements InvocationHandler {
        public static ChangeQuickRedirect a;
        private final Class<T> c;

        public a(Class<T> cls) {
            Object[] objArr = {g.this, cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed2cbef062a4852be4cbd7b5245efe7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed2cbef062a4852be4cbd7b5245efe7");
            } else {
                this.c = cls;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "61d73928d7d5d1fdd9fd66610fe7a9ab", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "61d73928d7d5d1fdd9fd66610fe7a9ab");
            }
            try {
                Object obj2 = null;
                boolean z = true;
                for (d dVar : g.this.b) {
                    if (this.c.isInstance(dVar)) {
                        if (z) {
                            obj2 = method.invoke(dVar, objArr);
                            z = false;
                        } else {
                            method.invoke(dVar, objArr);
                        }
                    }
                }
                return obj2;
            } catch (IllegalAccessException e) {
                com.sankuai.shangou.stone.util.log.a.d("SGContactList", "Exception::" + e, new Object[0]);
                return null;
            } catch (IllegalArgumentException e2) {
                com.sankuai.shangou.stone.util.log.a.d("SGContactList", "Exception::" + e2, new Object[0]);
                return null;
            } catch (InvocationTargetException e3) {
                com.sankuai.shangou.stone.util.log.a.d("SGContactList", "Exception::" + e3, new Object[0]);
                return null;
            }
        }
    }
}
