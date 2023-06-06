package com.meituan.android.cube.core;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    Set<com.meituan.android.cube.core.eventhandler.event.a> b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6bd6b73bb42d1bb1a9c93af142fe126", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6bd6b73bb42d1bb1a9c93af142fe126");
        } else {
            this.b = new HashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a<T> implements InvocationHandler {
        public static ChangeQuickRedirect a;
        private final Class<T> c;

        public a(Class<T> cls) {
            Object[] objArr = {e.this, cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9391e4949de8c9dedc4a4e06827bfe6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9391e4949de8c9dedc4a4e06827bfe6");
            } else {
                this.c = cls;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "cefb94a8dd69a001575e87916fcb9fc2", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "cefb94a8dd69a001575e87916fcb9fc2");
            }
            try {
                Object obj2 = null;
                boolean z = true;
                for (com.meituan.android.cube.core.eventhandler.event.a aVar : e.this.b) {
                    if (this.c.isInstance(aVar)) {
                        if (z) {
                            obj2 = method.invoke(aVar, objArr);
                            z = false;
                        } else {
                            method.invoke(aVar, objArr);
                        }
                    }
                }
                return obj2;
            } catch (IllegalAccessException e) {
                Log.e("ContactList", "Exception::" + e);
                return null;
            } catch (IllegalArgumentException e2) {
                Log.e("ContactList", "Exception::" + e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("ContactList", "Exception::" + e3);
                return null;
            }
        }
    }
}
