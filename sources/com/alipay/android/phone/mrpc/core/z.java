package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class z {
    public static final ThreadLocal<Object> a = new ThreadLocal<>();
    public static final ThreadLocal<Map<String, Object>> b = new ThreadLocal<>();
    public byte c = 0;
    public AtomicInteger d = new AtomicInteger();
    public x e;

    public z(x xVar) {
        this.e = xVar;
    }

    public final Object a(Method method, Object[] objArr) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        a.set(null);
        b.set(null);
        if (operationType != null) {
            String value = operationType.value();
            int incrementAndGet = this.d.incrementAndGet();
            try {
                if (this.c == 0) {
                    com.alipay.android.phone.mrpc.core.a.e eVar = new com.alipay.android.phone.mrpc.core.a.e(incrementAndGet, value, objArr);
                    if (b.get() != null) {
                        eVar.a(b.get());
                    }
                    byte[] a2 = eVar.a();
                    b.set(null);
                    Object a3 = new com.alipay.android.phone.mrpc.core.a.d(genericReturnType, (byte[]) new j(this.e.a(), method, incrementAndGet, value, a2, z).a()).a();
                    if (genericReturnType != Void.TYPE) {
                        a.set(a3);
                    }
                }
                return a.get();
            } catch (RpcException e) {
                e.setOperationType(value);
                throw e;
            }
        }
        throw new IllegalStateException("OperationType must be set.");
    }
}
