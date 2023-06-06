package com.meizu.cloud.pushsdk.b;
/* loaded from: classes3.dex */
public class h<T> {
    private T a;
    private T b;

    /* JADX INFO: Access modifiers changed from: protected */
    public h(T t) {
        if (t == null) {
            throw new RuntimeException("proxy must be has a default implementation");
        }
        this.b = t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T c() {
        return this.a != null ? this.a : this.b;
    }
}
