package com.dianping.titans.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReflectUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnErrorListener {
        void onError(Throwable th);
    }

    public static <T> T getValueFromMap(Map<String, Object> map, String str, Class<T> cls, T t) {
        Object[] objArr = {map, str, cls, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d58cadf17454407b73b668ed1f98870", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d58cadf17454407b73b668ed1f98870");
        }
        if (map == null || !map.containsKey(str)) {
            return t;
        }
        Object obj = map.get(str);
        try {
            if (cls == Integer.TYPE) {
                cls = (Class<T>) Integer.class;
            } else if (cls == Long.TYPE) {
                cls = (Class<T>) Long.class;
            } else if (cls == Float.TYPE) {
                cls = (Class<T>) Float.class;
            } else if (cls == Double.TYPE) {
                cls = (Class<T>) Double.class;
            } else if (cls == Boolean.TYPE) {
                cls = (Class<T>) Boolean.class;
            } else if (cls == Byte.TYPE) {
                cls = (Class<T>) Byte.class;
            }
            return cls.cast(obj);
        } catch (Throwable th) {
            th.printStackTrace();
            return t;
        }
    }

    public static Type getActualTypeArguments(Class<?> cls, int i) {
        Object[] objArr = {cls, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5af9f389e7b8acdf0baeb905e6357a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5af9f389e7b8acdf0baeb905e6357a5");
        }
        try {
            if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                return ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[i];
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T createInstance(ClassLoader classLoader, String str, OnErrorListener onErrorListener, Object... objArr) {
        T t;
        Object[] objArr2 = {classLoader, str, onErrorListener, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "692d7288fa9f4fab5baa35a1092d8990", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "692d7288fa9f4fab5baa35a1092d8990");
        }
        int length = objArr.length;
        if (length == 0) {
            try {
                return (T) classLoader.loadClass(str).newInstance();
            } catch (Throwable th) {
                if (onErrorListener != null) {
                    onErrorListener.onError(new RuntimeException("appContext.getClassLoader().createInstance(" + str + ").createInstance() error", th));
                    return null;
                }
                return null;
            }
        }
        Class<?>[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        try {
            t = null;
            for (Constructor<?> constructor : classLoader.loadClass(str).getConstructors()) {
                try {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    if (length == parameterTypes.length) {
                        T t2 = t;
                        for (int i2 = 0; i2 < length; i2++) {
                            try {
                                if (!parameterTypes[i2].isAssignableFrom(clsArr[i2])) {
                                    break;
                                }
                                if (i2 == length - 1) {
                                    t2 = classLoader.loadClass(str).getConstructor(parameterTypes).newInstance(objArr);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                t = t2;
                            }
                        }
                        t = t2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            th = null;
        } catch (Throwable th4) {
            th = th4;
            t = null;
        }
        if (t == null) {
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Class<?> cls = (Class) clsArr[i3].getField("TYPE").get(null);
                    if (cls != null && cls.isPrimitive()) {
                        try {
                            clsArr[i3] = cls;
                        } catch (Throwable unused) {
                        }
                        z = true;
                    }
                } catch (Throwable unused2) {
                }
            }
            if (z) {
                try {
                    for (Constructor<?> constructor2 : classLoader.loadClass(str).getConstructors()) {
                        Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
                        if (length == parameterTypes2.length) {
                            T t3 = t;
                            for (int i4 = 0; i4 < length; i4++) {
                                try {
                                    if (!parameterTypes2[i4].isAssignableFrom(clsArr[i4])) {
                                        break;
                                    }
                                    if (i4 == length - 1) {
                                        t3 = classLoader.loadClass(str).getConstructor(parameterTypes2).newInstance(objArr);
                                    }
                                } catch (Throwable unused3) {
                                    t = t3;
                                }
                            }
                            t = t3;
                        }
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        T t4 = t;
        if (t4 != null || onErrorListener == null || th == null) {
            return t4;
        }
        onErrorListener.onError(new RuntimeException("appContext.getClassLoader().createInstance(" + str + ").createInstance() error", th));
        return t4;
    }

    public static <T> T createInstance(ClassLoader classLoader, String str, Object... objArr) {
        Object[] objArr2 = {classLoader, str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "64fe4e205a27dd0738a85a6c658aae7e", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "64fe4e205a27dd0738a85a6c658aae7e") : (T) createInstance(classLoader, str, null, objArr);
    }

    public static <T> T createInstance(Class<T> cls, Object... objArr) {
        Object[] objArr2 = {cls, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "917100555abc0fe46dfcc61a105f50f2", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "917100555abc0fe46dfcc61a105f50f2") : (T) createInstance(cls.getClassLoader(), cls.getName(), null, objArr);
    }
}
