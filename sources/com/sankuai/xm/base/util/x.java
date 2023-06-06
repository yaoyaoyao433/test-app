package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class x {
    public static ChangeQuickRedirect a;

    public static Object a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cedb9864030ba950447952d3f003a4aa", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cedb9864030ba950447952d3f003a4aa");
        }
        if (obj == null) {
            return null;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th);
            return null;
        }
    }

    public static <T> void a(Class<T> cls, Object obj, boolean z, b.a<T> aVar) {
        Field[] declaredFields;
        Object[] objArr = {cls, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "150e6d4fcb68d7c2082cc62451f8cc94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "150e6d4fcb68d7c2082cc62451f8cc94");
        } else if (obj != null) {
            try {
                for (Field field : obj.getClass().getDeclaredFields()) {
                    if (field.getType().equals(cls)) {
                        field.setAccessible(true);
                        aVar.a(cls.cast(field.get(obj)));
                        if (z && field.getType() != null) {
                            field.set(obj, null);
                        }
                    }
                }
            } catch (Throwable th) {
                com.sankuai.xm.log.a.a(th);
            }
        }
    }

    private static Object a(Object obj, Class<?> cls, String str, Class[] clsArr, Object[] objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object[] objArr2 = {obj, cls, str, clsArr, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e3053ce3c879062bb6f21c33366e14a4", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e3053ce3c879062bb6f21c33366e14a4") : cls.getMethod(str, clsArr).invoke(obj, objArr);
    }

    public static Object a(Object obj, String str, Class[] clsArr, Object[] objArr) {
        Object[] objArr2 = {obj, str, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "31c6d4d89f5710a094689c6bc1778117", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "31c6d4d89f5710a094689c6bc1778117");
        }
        try {
            return a(obj, obj.getClass(), str, null, null);
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th);
            return null;
        }
    }

    public static Object a(String str, String str2, Class[] clsArr, Object[] objArr) {
        Object[] objArr2 = {str, str2, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "318e02a3ec8c4ce3abfe502aca7e8486", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "318e02a3ec8c4ce3abfe502aca7e8486");
        }
        try {
            return a(null, Class.forName(str), str2, null, null);
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th);
            return null;
        }
    }

    public static Class<?> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0454d000f13512b71a835f3d3e6aed7c", 6917529027641081856L)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0454d000f13512b71a835f3d3e6aed7c");
        }
        try {
            return x.class.getClassLoader().loadClass(str);
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th);
            return null;
        }
    }

    public static <T> T a(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56e35935cf82c1081355f2d7bf018799", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56e35935cf82c1081355f2d7bf018799");
        }
        if (cls != null) {
            try {
                return (T) cls.newInstance();
            } catch (Exception e) {
                com.sankuai.xm.log.a.a(e);
            }
        }
        return null;
    }

    public static Object b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d8251c4e7869bebc25c9616b104eff2", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d8251c4e7869bebc25c9616b104eff2") : a(a(str));
    }

    public static <T> T a(Class<T> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fe605d5d56f56019d7267521e3a33cb", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fe605d5d56f56019d7267521e3a33cb");
        }
        try {
            return cls.cast(b(str));
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th);
            return null;
        }
    }
}
