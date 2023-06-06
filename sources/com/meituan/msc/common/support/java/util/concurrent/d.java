package com.meituan.msc.common.support.java.util.concurrent;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static final Unsafe a;

    static {
        Field declaredField;
        try {
            try {
                declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            } catch (NoSuchFieldException unused) {
                declaredField = Unsafe.class.getDeclaredField("THE_ONE");
            }
            declaredField.setAccessible(true);
            a = (Unsafe) declaredField.get(null);
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
