package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.map.lib.models.GeoPoint;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class hw {
    protected long a = 1500;
    public boolean b = false;
    protected long c = 0;
    public boolean d = false;
    public boolean e = false;
    public Interpolator f = new LinearInterpolator();
    protected a g = null;
    protected b h = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a(float f);

        void a(float f, float f2);

        void a(float f, float f2, float f3, float f4);

        void a(int i, int i2);

        void b(float f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(float f, Interpolator interpolator);

    public final void a(a aVar) {
        this.g = aVar;
    }

    public void a(b bVar) {
        this.h = bVar;
    }

    private void a(Interpolator interpolator) {
        this.f = interpolator;
    }

    private Interpolator c() {
        return this.f;
    }

    private static long d() {
        return SystemClock.uptimeMillis();
    }

    public void a(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (this.a <= 0) {
            return false;
        }
        this.d = true;
        this.c = SystemClock.uptimeMillis();
        this.b = true;
        if (this.g != null) {
            this.g.a();
        }
        return true;
    }

    private void e() {
        this.b = false;
    }

    private boolean f() {
        return this.b;
    }

    public final void b() {
        if (!this.b) {
            if (!this.d || this.e || this.g == null) {
                return;
            }
            this.g.b();
            return;
        }
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.c)) / ((float) this.a);
        if (uptimeMillis > 1.0f) {
            this.b = false;
            a(1.0f, this.f);
            if (this.g != null) {
                this.g.b();
            }
            this.e = true;
            return;
        }
        a(uptimeMillis, this.f);
    }

    private boolean g() {
        return this.d;
    }

    private boolean h() {
        return this.e;
    }
}
