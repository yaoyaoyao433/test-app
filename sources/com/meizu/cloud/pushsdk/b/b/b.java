package com.meizu.cloud.pushsdk.b.b;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.reflect.Constructor;
/* loaded from: classes3.dex */
public final class b {
    private final a a;
    private final Class<?>[] b;

    public b(a aVar, Class<?>... clsArr) {
        this.a = aVar;
        this.b = clsArr;
    }

    public final <T> d<T> a(Object... objArr) {
        d<T> dVar = new d<>();
        try {
            Constructor<?> declaredConstructor = this.a.a().getDeclaredConstructor(this.b);
            declaredConstructor.setAccessible(true);
            dVar.b = (T) declaredConstructor.newInstance(null);
            dVar.a = true;
        } catch (Exception e) {
            DebugLogger.e("ReflectConstructor", "newInstance", e);
        }
        return dVar;
    }
}
