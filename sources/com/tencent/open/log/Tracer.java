package com.tencent.open.log;

import com.tencent.open.log.d;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class Tracer {
    private volatile int a;
    private volatile boolean b;
    private g c;

    protected abstract void doTrace(int i, Thread thread, long j, String str, String str2, Throwable th);

    public Tracer() {
        this(c.a, true, g.a);
    }

    public Tracer(int i, boolean z, g gVar) {
        this.a = c.a;
        this.b = true;
        this.c = g.a;
        a(i);
        a(z);
        a(gVar);
    }

    public void a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (d() && d.a.a(this.a, i)) {
            doTrace(i, thread, j, str, str2, th);
        }
    }

    public void a(int i) {
        this.a = i;
    }

    public boolean d() {
        return this.b;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public g e() {
        return this.c;
    }

    public void a(g gVar) {
        this.c = gVar;
    }
}
