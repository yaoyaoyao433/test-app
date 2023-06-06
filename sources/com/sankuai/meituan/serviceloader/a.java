package com.sankuai.meituan.serviceloader;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Object a(ClassLoader classLoader, String str, Object... objArr) {
        Object[] objArr2 = {classLoader, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "3e8a88acb67511df2395dd91e4480bea", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "3e8a88acb67511df2395dd91e4480bea");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = b.b.get(str);
        if (obj != null) {
            return obj != Void.class ? obj : b(classLoader, str, objArr);
        }
        return c(classLoader, str, objArr);
    }

    private static synchronized Object b(ClassLoader classLoader, String str, Object... objArr) {
        synchronized (a.class) {
            Object[] objArr2 = {classLoader, str, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "54f3d4b8fa4a522fecfdacc4c71c5081", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "54f3d4b8fa4a522fecfdacc4c71c5081");
            }
            Object obj = b.b.get(str);
            if (obj != Void.class) {
                return obj;
            }
            Object c = c(classLoader, str, objArr);
            b.b.put(str, c);
            return c;
        }
    }

    private static Object c(ClassLoader classLoader, String str, Object... objArr) {
        Throwable th;
        Constructor<?> constructor;
        Constructor<?> constructor2;
        Object[] objArr2 = {classLoader, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "44e7c9d66c16ec8bac6d44abf2465f84", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "44e7c9d66c16ec8bac6d44abf2465f84");
        }
        int length = objArr != null ? objArr.length : 0;
        if (length == 0) {
            try {
                return classLoader.loadClass(str).newInstance();
            } catch (Throwable th2) {
                b.a(new RuntimeException("appContext.getClassLoader().createInstance(" + str + ").createInstance() error", th2));
            }
        } else {
            Class[] clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
            try {
                constructor = a(classLoader, str, (Class<?>[]) clsArr);
                th = null;
            } catch (Throwable th3) {
                th = th3;
                constructor = null;
            }
            try {
                if (constructor == null) {
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            Class cls = (Class) clsArr[i2].getField("TYPE").get(null);
                            if (cls != null && cls.isPrimitive()) {
                                try {
                                    clsArr[i2] = cls;
                                } catch (Throwable unused) {
                                }
                                z = true;
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    if (z) {
                        try {
                            constructor2 = a(classLoader, str, (Class<?>[]) clsArr);
                        } catch (Throwable unused3) {
                        }
                        if (constructor2 == null && th != null) {
                            b.a(new RuntimeException("fail to find constructor for class: " + str + " for the given parameter list", th));
                        }
                        return constructor2.newInstance(objArr);
                    }
                }
                return constructor2.newInstance(objArr);
            } catch (Throwable th4) {
                b.a(new RuntimeException("appContext.getClassLoader().createInstance(" + str + ").createInstance() error", th4));
            }
            constructor2 = constructor;
            if (constructor2 == null) {
                b.a(new RuntimeException("fail to find constructor for class: " + str + " for the given parameter list", th));
            }
        }
        return null;
    }

    private static Constructor<?> a(ClassLoader classLoader, String str, Class<?>[] clsArr) throws Throwable {
        Object[] objArr = {classLoader, str, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a5e073c8020ef8e86213ffa060f402b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Constructor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a5e073c8020ef8e86213ffa060f402b");
        }
        for (Constructor<?> constructor : classLoader.loadClass(str).getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (clsArr.length == parameterTypes.length) {
                for (int i = 0; i < clsArr.length && parameterTypes[i].isAssignableFrom(clsArr[i]); i++) {
                    if (i == clsArr.length - 1) {
                        return classLoader.loadClass(str).getConstructor(parameterTypes);
                    }
                }
            }
        }
        return null;
    }
}
