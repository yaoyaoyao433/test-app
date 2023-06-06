package dianping.com.nvlinker.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ReflectionHelper {
    public static final int INVALID_VALUE = -1;

    public static Object getObj(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void modifyFileValue(Object obj, String str, String str2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, str2);
        } catch (Throwable unused) {
        }
    }

    public static Object getFieldValue(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getStaticFieldValue(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getIntFileValue(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int getIntFileValueFromClass(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(cls);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void setReflectField(Object obj, String str, Object obj2) {
        Field field;
        try {
            try {
                field = obj.getClass().getDeclaredField(str);
            } catch (Exception unused) {
                field = obj.getClass().getField(str);
            }
            field.setAccessible(true);
            field.set(obj, obj2);
        } catch (Throwable unused2) {
        }
    }

    public static void setSuperClassReflectFieldValue(Object obj, String str, Object obj2) {
        Field declaredField;
        Field field = null;
        try {
            Class<? super Object> superclass = obj.getClass().getSuperclass();
            while (true) {
                if (superclass == null) {
                    break;
                }
                try {
                    declaredField = superclass.getDeclaredField(str);
                } catch (Exception unused) {
                    superclass = superclass.getSuperclass();
                }
                if (declaredField != null) {
                    field = declaredField;
                    break;
                }
                field = declaredField;
            }
            if (field != null) {
                field.setAccessible(true);
                field.set(obj, obj2);
            }
        } catch (Throwable unused2) {
        }
    }

    public static Object getSuperClassReflectFieldValue(Object obj, String str) {
        Field declaredField;
        try {
            Class<? super Object> superclass = obj.getClass().getSuperclass();
            Field field = null;
            while (true) {
                if (superclass == null) {
                    break;
                }
                try {
                    declaredField = superclass.getDeclaredField(str);
                } catch (Exception unused) {
                    superclass = superclass.getSuperclass();
                }
                if (declaredField != null) {
                    field = declaredField;
                    break;
                }
                field = declaredField;
            }
            if (field != null) {
                field.setAccessible(true);
                return field.get(obj);
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    public static Object getReflectFieldValue(Object obj, String str) {
        Field field;
        try {
            try {
                field = obj.getClass().getDeclaredField(str);
            } catch (Exception unused) {
                field = obj.getClass().getField(str);
            }
            field.setAccessible(true);
            return field.get(obj);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object Method(Object obj, String str) {
        Method method;
        try {
            try {
                method = obj.getClass().getDeclaredMethod(str, new Class[0]);
            } catch (Exception unused) {
                method = obj.getClass().getMethod(str, new Class[0]);
            }
            method.setAccessible(true);
            return method.invoke(obj, new Object[0]);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object instance(String str, String str2) {
        Method method;
        try {
            Class<?> cls = Class.forName(str);
            try {
                method = cls.getDeclaredMethod(str2, new Class[0]);
            } catch (Exception unused) {
                method = cls.getMethod(str2, new Class[0]);
            }
            method.setAccessible(true);
            return method.invoke(null, new Object[0]);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object invokeStatic(String str, String str2, Class[] clsArr, Object[] objArr) {
        Method method;
        try {
            Class<?> cls = Class.forName(str);
            try {
                method = cls.getDeclaredMethod(str2, clsArr);
            } catch (Exception unused) {
                method = cls.getMethod(str2, clsArr);
            }
            method.setAccessible(true);
            return method.invoke(null, objArr);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object Method(Object obj, String str, Class[] clsArr, Object[] objArr) {
        Method method;
        try {
            Class<?> cls = obj.getClass();
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
                method = cls.getMethod(str, clsArr);
            }
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Method getMethod(Object obj, String str, Class[] clsArr) {
        Method method;
        try {
            Class<?> cls = obj.getClass();
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
                method = cls.getMethod(str, clsArr);
            }
            method.setAccessible(true);
            return method;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
