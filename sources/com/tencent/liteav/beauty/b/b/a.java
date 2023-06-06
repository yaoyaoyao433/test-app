package com.tencent.liteav.beauty.b.b;

import android.util.Log;
import com.tencent.liteav.beauty.b.ab;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends com.tencent.liteav.beauty.b.b {
    private b r = null;
    private ab s = null;
    private String t = "TXCBeauty3Filter";
    private float u = 0.0f;
    private float v = 0.0f;
    private float w = 0.0f;
    private float x = 0.0f;

    @Override // com.tencent.liteav.beauty.b.b
    public boolean c(int i, int i2) {
        return d(i, i2);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        if (this.e == i && this.f == i2) {
            return;
        }
        this.e = i;
        this.f = i2;
        d(i, i2);
    }

    private boolean d(int i, int i2) {
        if (this.r == null) {
            this.r = new b();
            this.r.a(true);
            if (!this.r.c()) {
                Log.e(this.t, "m_verticalFilter init failed!!, break init");
                return false;
            }
        }
        this.r.a(i, i2);
        if (this.s == null) {
            this.s = new ab();
            this.s.a(true);
            if (!this.s.c()) {
                Log.e(this.t, "mSharpnessFilter init failed!!, break init");
                return false;
            }
        }
        this.s.a(i, i2);
        return true;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i) {
        if (this.u > 0.0f || this.v > 0.0f || this.w > 0.0f) {
            i = this.r.a(i);
        }
        return this.x > 0.0f ? this.s.a(i) : i;
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void c(int i) {
        this.u = i / 10.0f;
        if (this.r != null) {
            this.r.a(this.u);
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void d(int i) {
        this.v = i / 10.0f;
        if (this.r != null) {
            this.r.b(this.v);
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void e(int i) {
        this.w = i / 10.0f;
        if (this.r != null) {
            this.r.c(this.w);
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void f(int i) {
        float f = i / 20.0f;
        if (Math.abs(this.x - f) < 0.001d) {
            return;
        }
        this.x = f;
        if (this.s != null) {
            this.s.a(this.x);
        }
    }

    void r() {
        if (this.r != null) {
            this.r.b();
            this.r = null;
        }
        if (this.s != null) {
            this.s.b();
            this.s = null;
        }
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void b() {
        super.b();
        r();
    }
}
