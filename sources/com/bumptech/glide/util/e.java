package com.bumptech.glide.util;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e<T, Y> {
    private final LinkedHashMap<T, Y> a = new LinkedHashMap<>(100, 0.75f, true);
    protected int b = 0;
    private int c;
    private final int d;

    protected int a(Y y) {
        return 1;
    }

    protected void a(T t, Y y) {
    }

    public e(int i) {
        this.d = i;
        this.c = i;
    }

    public final Y b(T t) {
        return this.a.get(t);
    }

    public final Y b(T t, Y y) {
        if (a(y) >= this.c) {
            a(t, y);
            return null;
        }
        Y put = this.a.put(t, y);
        if (y != null) {
            this.b += a(y);
        }
        if (put != null) {
            this.b -= a(put);
        }
        b(this.c);
        return put;
    }

    public final Y c(T t) {
        Y remove = this.a.remove(t);
        if (remove != null) {
            this.b -= a(remove);
        }
        return remove;
    }

    public final void a() {
        b(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(int i) {
        while (this.b > i) {
            Map.Entry<T, Y> next = this.a.entrySet().iterator().next();
            Y value = next.getValue();
            this.b -= a(value);
            T key = next.getKey();
            this.a.remove(key);
            a(key, value);
        }
    }
}
