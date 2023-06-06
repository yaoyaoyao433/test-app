package com.tencent.mapsdk.internal;

import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class hn {
    public static final long a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    protected long e;
    private boolean h;
    private long i;
    private long g = -1;
    protected int f = 0;

    protected abstract void a(GL10 gl10, long j);

    public hn(long j) {
        this.e = j;
    }

    private void a(long j) {
        this.i = j;
    }

    private void a(boolean z) {
        this.h = z;
    }

    public final long a() {
        return this.e;
    }

    public void b() {
        this.f = 1;
        this.g = -1L;
    }

    private void e() {
        this.f = 2;
    }

    public boolean c() {
        return this.f == 2;
    }

    private boolean f() {
        return this.f == 1;
    }

    public void a(GL10 gl10) {
        if (this.f != 1) {
            return;
        }
        if (this.g == -1) {
            this.g = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.g;
        if (this.i - currentTimeMillis > 0) {
            return;
        }
        long j = currentTimeMillis - this.i;
        if (j >= this.e) {
            if (this.h) {
                d();
            }
            this.f = 2;
        }
        a(gl10, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        this.f = 1;
        this.g = -1L;
    }
}
