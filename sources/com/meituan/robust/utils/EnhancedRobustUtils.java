package com.meituan.robust.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EnhancedRobustUtils {
    public static boolean isThrowable = true;

    public static Object invokeReflectConstruct(String str, Object[] objArr, Class[] clsArr) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("invokeReflectConstruct error " + str + "   parameter   " + objArr);
            }
            return null;
        }
    }

    public static Object invokeReflectMethod(String str, Object obj, Object[] objArr, Class[] clsArr, Class cls) {
        try {
            return getDeclaredMethod(obj, str, clsArr, cls).invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("invokeReflectMethod error " + str + "   parameter   " + objArr + " targetObject " + obj.toString() + "  args  " + clsArr);
            }
            return null;
        }
    }

    public static Method getDeclaredMethod(Object obj, String str, Class[] clsArr, Class cls) {
        Method declaredMethod;
        if (cls == null || !cls.isInterface()) {
            for (Class<?> cls2 = obj.getClass(); cls2 != null; cls2 = cls2.getSuperclass()) {
                try {
                    declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                } catch (Exception unused) {
                }
                if (declaredMethod == null) {
                    continue;
                } else {
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    return declaredMethod;
                }
            }
        } else {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused2) {
            }
        }
        if (isThrowable) {
            throw new RuntimeException("getDeclaredMethod error " + str + "   parameterTypes   " + clsArr + " targetObject " + obj.toString());
        }
        return null;
    }

    public static Object invokeReflectStaticMethod(String str, Class cls, Object[] objArr, Class[] clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("invokeReflectStaticMethod error " + str + "   class   " + cls + "  args  " + clsArr);
            }
            return null;
        }
    }

    public static void setFieldValue(String str, Object obj, int i, Class cls) {
        try {
            getReflectField(str, obj, cls).setInt(obj, i);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue int error " + str + "   target   " + obj + "  value  " + i);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, boolean z, Class cls) {
        try {
            getReflectField(str, obj, cls).setBoolean(obj, z);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue boolean error " + str + "   target   " + obj + "  value  " + z);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, byte b, Class cls) {
        try {
            getReflectField(str, obj, cls).setByte(obj, b);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue byte error " + str + "   target   " + obj + "  value  " + ((int) b));
            }
        }
    }

    public static void setFieldValue(String str, Object obj, char c, Class cls) {
        try {
            getReflectField(str, obj, cls).setChar(obj, c);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue char error " + str + "   target   " + obj + "  value  " + c);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, double d, Class cls) {
        try {
            getReflectField(str, obj, cls).setDouble(obj, d);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue double error " + str + "   target   " + obj + "  value  " + d);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, float f, Class cls) {
        try {
            getReflectField(str, obj, cls).setFloat(obj, f);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue float error " + str + "   target   " + obj + "  value  " + f);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, long j, Class cls) {
        try {
            getReflectField(str, obj, cls).setLong(obj, j);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue long error " + str + "   target   " + obj + "  value  " + j);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, Object obj2, Class cls) {
        try {
            getReflectField(str, obj, cls).set(obj, obj2);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue Object error " + str + "   target   " + obj + "  value  " + obj2);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, short s, Class cls) {
        try {
            getReflectField(str, obj, cls).setShort(obj, s);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue short error " + str + "   target   " + obj + "  value  " + ((int) s));
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, Object obj) {
        try {
            getReflectStaticField(str, cls).set(null, obj);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue Object error " + str + "   Class   " + cls + "  value  " + obj);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, int i) {
        try {
            getReflectStaticField(str, cls).setInt(null, i);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue int error " + str + "   Class   " + cls + "  value  " + i);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, boolean z) {
        try {
            getReflectStaticField(str, cls).setBoolean(null, z);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue boolean error " + str + "   Class   " + cls + "  value  " + z);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, double d) {
        try {
            getReflectStaticField(str, cls).setDouble(null, d);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue Object error " + str + "   Class   " + cls + "  value  " + d);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, float f) {
        try {
            getReflectStaticField(str, cls).setFloat(null, f);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue float error " + str + "   Class   " + cls + "  value  " + f);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, long j) {
        try {
            getReflectStaticField(str, cls).setLong(null, j);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue long error " + str + "   Class   " + cls + "  value  " + j);
            }
        }
    }

    public static Object getFieldValue(String str, Object obj, Class cls) {
        try {
            return getReflectField(str, obj, cls).get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("getFieldValue  error " + str + "   instance   " + obj);
            }
            return null;
        }
    }

    private static Field getReflectField(String str, Object obj, Class cls) throws NoSuchFieldException {
        if (cls == null) {
            if (isThrowable) {
                throw new RuntimeException("Field " + str + " declaring class is null ");
            }
            return null;
        } else if (!cls.isInterface()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
            }
        } else {
            return cls.getDeclaredField(str);
        }
    }

    public static Object getStaticFieldValue(String str, Class cls) {
        try {
            return getReflectStaticField(str, cls).get(null);
        } catch (Exception e) {
            e.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("getStaticFieldValue  error " + str + "   clazz   " + cls);
            }
            return null;
        }
    }

    private static Field getReflectStaticField(String str, Class cls) throws NoSuchFieldException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            clearFinalModifiers(declaredField);
            return declaredField;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            throw new NoSuchFieldException("Field " + str + " not found in " + cls);
        }
    }

    public static Field getReflectStaticFieldRecursive(String str, Class cls) throws NoSuchFieldException {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                return getReflectStaticField(str, cls2);
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + cls + " recursive");
    }

    private static void clearFinalModifiers(Field field) {
        if (field != null && Modifier.isFinal(field.getModifiers())) {
            field.setAccessible(true);
            try {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(field, field.getModifiers() & (-17));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }
        }
    }
}
