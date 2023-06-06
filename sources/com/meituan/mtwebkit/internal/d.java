package com.meituan.mtwebkit.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;
    public Object b;
    private Class<?> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    public static d a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e2cb25af5047fde1ab032acef9214d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e2cb25af5047fde1ab032acef9214d6");
        }
        d dVar = new d();
        dVar.b = obj;
        dVar.c = obj.getClass();
        return dVar;
    }

    public static d a(Object obj, Class<?> cls) {
        Object[] objArr = {obj, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "204b37f9607cf0fd6f57cdf73ade7f42", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "204b37f9607cf0fd6f57cdf73ade7f42");
        }
        d dVar = new d();
        dVar.b = obj;
        dVar.c = cls;
        return dVar;
    }

    public static d a(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52b9367e059dc8d454f7683733388259", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52b9367e059dc8d454f7683733388259");
        }
        d dVar = new d();
        dVar.c = cls;
        return dVar;
    }

    public static d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca83d2b5fdec98530ad783fb360f2fe0", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca83d2b5fdec98530ad783fb360f2fe0") : a(str, d.class.getClassLoader());
    }

    public static d a(String str, ClassLoader classLoader) {
        Object[] objArr = {str, classLoader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f05a260f8652631866aaccb095ce8fde", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f05a260f8652631866aaccb095ce8fde");
        }
        d dVar = new d();
        try {
            dVar.c = Class.forName(str, true, classLoader);
            return dVar;
        } catch (ClassNotFoundException e) {
            throw new a(e);
        }
    }

    public final boolean a() {
        return this.b != null;
    }

    public final d b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f96c6ee5d1026e87412a0054b2656eb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f96c6ee5d1026e87412a0054b2656eb2");
        }
        Field b = b(this.c, str);
        try {
            Object obj = b.get(this.b);
            Class<?> type = b.getType();
            if (obj != null && !type.isPrimitive()) {
                return a(obj);
            }
            return a(obj, type);
        } catch (IllegalAccessException e) {
            throw new a(e);
        }
    }

    public final d a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e22ba0803e59c13076f46b6e1843f6d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e22ba0803e59c13076f46b6e1843f6d3");
        }
        Field b = b(this.c, str);
        try {
            if (obj instanceof d) {
                obj = ((d) obj).b;
            }
            b.set(this.b, obj);
            return this;
        } catch (IllegalAccessException e) {
            throw new a(e);
        }
    }

    public final d a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "9443bd299fe8b2e220c420924266efe3", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "9443bd299fe8b2e220c420924266efe3");
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof d) {
                d dVar = (d) objArr[i];
                objArr[i] = dVar.b;
                clsArr[i] = dVar.c;
            } else {
                clsArr[i] = objArr[i].getClass();
            }
        }
        Method a2 = a(this.c, str, clsArr);
        try {
            Object invoke = a2.invoke(this.b, objArr);
            Class<?> returnType = a2.getReturnType();
            if (invoke != null && !returnType.isPrimitive()) {
                return a(invoke);
            }
            return a(invoke, returnType);
        } catch (Exception e) {
            throw new a(e);
        }
    }

    public final d a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "b2a95a5868a1369e51670e5fa2f07c4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "b2a95a5868a1369e51670e5fa2f07c4c");
        }
        if (this.b != null) {
            throw new a("this Hack has value, you really want to newInstance?");
        }
        if (this.c == null) {
            throw new a("this Hack has no clazz");
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof d) {
                d dVar = (d) objArr[i];
                objArr[i] = dVar.b;
                clsArr[i] = dVar.c;
            } else {
                clsArr[i] = objArr[i].getClass();
            }
        }
        try {
            this.b = b(this.c, clsArr).newInstance(objArr);
            return this;
        } catch (Exception e) {
            throw new a(e);
        }
    }

    private static Field a(Class<?> cls, String str) throws NoSuchFieldException {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b283be78ed61f90a60c50dd675193dc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b283be78ed61f90a60c50dd675193dc2");
        }
        try {
            return (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
        } catch (Exception e) {
            throw new NoSuchFieldException(e.toString());
        }
    }

    private static Method b(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Object[] objArr = {cls, str, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df29149095de81bb3b6f1cdab8ad77df", RobustBitConfig.DEFAULT_VALUE)) {
            return (Method) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df29149095de81bb3b6f1cdab8ad77df");
        }
        try {
            return (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
        } catch (Exception e) {
            throw new NoSuchMethodException(e.toString());
        }
    }

    private static Constructor<?> a(Class<?> cls, Class<?>... clsArr) throws NoSuchMethodException {
        Object[] objArr = {cls, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0273f06fa79ae735b9ebdb0545f5fbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Constructor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0273f06fa79ae735b9ebdb0545f5fbc");
        }
        try {
            return (Constructor) Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class).invoke(cls, clsArr);
        } catch (Exception e) {
            throw new NoSuchMethodException(e.toString());
        }
    }

    private static Field b(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8398f65d5ab227efb8d42eaf9f7c8f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8398f65d5ab227efb8d42eaf9f7c8f0");
        }
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Field a2 = a(cls2, str);
                if (!a2.isAccessible()) {
                    a2.setAccessible(true);
                }
                return a2;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new a("Field " + str + " not found in " + cls);
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Object[] objArr = {cls, str, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e595756f8e107be69bea29ee30b565c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Method) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e595756f8e107be69bea29ee30b565c");
        }
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method b = b(cls2, str, clsArr);
                if (!b.isAccessible()) {
                    b.setAccessible(true);
                }
                return b;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new a("Method " + str + " with parameters " + Arrays.asList(clsArr).toString() + " not found in " + cls);
    }

    private static Constructor<?> b(Class<?> cls, Class<?>... clsArr) {
        Object[] objArr = {cls, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b190b29765388eb20393cb67806a3f7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Constructor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b190b29765388eb20393cb67806a3f7e");
        }
        try {
            Constructor<?> a2 = a(cls, clsArr);
            if (!a2.isAccessible()) {
                a2.setAccessible(true);
            }
            return a2;
        } catch (NoSuchMethodException e) {
            throw new a(e);
        }
    }
}
