package com.android.meituan.multiprocess;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return (T) declaredConstructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
