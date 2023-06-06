package com.tencent.liteav.basic.util;

import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a<T> {
    private final InterfaceC1447a<T> b;
    private final ThreadLocal<T> a = new ThreadLocal<>();
    private WeakReference<T> c = new WeakReference<>(null);

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.basic.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1447a<T> {
        T a();
    }

    public a(InterfaceC1447a<T> interfaceC1447a) {
        this.b = interfaceC1447a;
    }

    public T a() {
        T t = this.a.get();
        if (t == null) {
            T b = b();
            this.a.set(b);
            return b;
        }
        return t;
    }

    private T b() {
        T t = this.c.get();
        if (t == null) {
            synchronized (this) {
                t = this.c.get();
                if (t == null) {
                    t = this.b.a();
                    this.c = new WeakReference<>(t);
                }
            }
        }
        return t;
    }
}
