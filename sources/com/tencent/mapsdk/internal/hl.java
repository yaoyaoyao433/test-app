package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class hl {
    public boolean b;
    public boolean d;
    private boolean g;
    private boolean h;
    protected long a = 1500;
    protected long c = 0;
    private Interpolator i = new LinearInterpolator();
    protected a e = null;
    protected b f = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class a {
        private static void a() {
        }

        private static void b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void a(float f) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public final void a(a aVar) {
        this.e = aVar;
    }

    private void a(b bVar) {
        this.f = bVar;
    }

    private void a(Interpolator interpolator) {
        this.i = interpolator;
    }

    private Interpolator c() {
        return this.i;
    }

    private static long d() {
        return SystemClock.uptimeMillis();
    }

    public final void a(long j) {
        this.a = j;
    }

    public final boolean a() {
        return a(false);
    }

    public final boolean a(boolean z) {
        if (this.a <= 0 || this.h) {
            return false;
        }
        this.h = true;
        this.g = z;
        return true;
    }

    private void e() {
        this.b = false;
    }

    private boolean f() {
        return this.b;
    }

    private boolean g() {
        return this.g;
    }

    public final void b() {
        if (!this.b && this.h && this.c == 0) {
            this.c = SystemClock.uptimeMillis();
            this.b = true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float f = ((float) (uptimeMillis - this.c)) / ((float) this.a);
        if (f > 1.0f) {
            if (this.g) {
                this.c = uptimeMillis;
            } else {
                this.b = false;
            }
            f = 1.0f;
        }
        if (this.i != null) {
            f = this.i.getInterpolation(f);
        }
        a(f);
        if (this.b) {
            return;
        }
        this.d = true;
    }

    private float b(float f) {
        return this.i != null ? this.i.getInterpolation(f) : f;
    }

    protected void a(float f) {
        if (this.e != null) {
            this.e.a(f);
        }
    }

    private boolean h() {
        return this.h;
    }

    private boolean i() {
        return this.d;
    }
}
