package com.squareup.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g<T> {
    private final Class<?> a;
    private final String b;
    private final Class[] c;

    public g(Class<?> cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    public final boolean a(T t) {
        return a(t.getClass()) != null;
    }

    private Object c(T t, Object... objArr) throws InvocationTargetException {
        Method a = a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public final Object a(T t, Object... objArr) {
        try {
            return c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Object d(T t, Object... objArr) throws InvocationTargetException {
        Method a = a(t.getClass());
        if (a == null) {
            throw new AssertionError("Method " + this.b + " not supported for object " + t);
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final Object b(T t, Object... objArr) {
        try {
            return d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Method a(Class<?> cls) {
        if (this.b != null) {
            Method a = a(cls, this.b, this.c);
            if (a == null || this.a == null || this.a.isAssignableFrom(a.getReturnType())) {
                return a;
            }
            return null;
        }
        return null;
    }

    private static Method a(Class<?> cls, String str, Class[] clsArr) {
        Method method;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
        }
        try {
            if ((method.getModifiers() & 1) != 0) {
                return method;
            }
            return null;
        } catch (NoSuchMethodException unused2) {
            return method;
        }
    }
}
