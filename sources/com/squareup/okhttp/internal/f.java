package com.squareup.okhttp.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class f implements Runnable {
    protected final String b;

    protected abstract void c();

    public f(String str, Object... objArr) {
        this.b = String.format(str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            c();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
