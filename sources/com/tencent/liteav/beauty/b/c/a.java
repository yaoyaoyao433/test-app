package com.tencent.liteav.beauty.b.c;

import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends com.tencent.liteav.beauty.b.b {
    private d r = null;
    private d s = null;
    private b t = null;
    private c u = null;
    private d v = null;
    private d w = null;
    private float x = 0.2f;
    private float y = 0.2f;
    private float z = 0.2f;

    @Override // com.tencent.liteav.beauty.b.b
    public boolean c(int i, int i2) {
        this.e = i;
        this.f = i2;
        return d(i, i2);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        super.a(i, i2);
        this.e = i;
        this.f = i2;
        this.r.a(i, i2);
        this.s.a(i, i2);
        this.t.a(i, i2);
        this.v.a(i, i2);
        this.w.a(i, i2);
        this.u.a(i, i2);
    }

    private boolean d(int i, int i2) {
        if (this.r == null) {
            this.r = new d(true);
            this.r.a(true);
            if (!this.r.c()) {
                TXCLog.e("TXCBeauty4Filter", "mSkinBlurFilterVertical init failed!!, break init");
                return false;
            }
        }
        if (this.s == null) {
            this.s = new d(false);
            this.s.a(true);
            if (!this.s.c()) {
                TXCLog.e("TXCBeauty4Filter", "mSkinBlurFilterHorizontal init failed!!, break init");
                return false;
            }
        }
        if (this.t == null) {
            this.t = new b();
            this.t.a(true);
            if (!this.t.c()) {
                TXCLog.e("TXCBeauty4Filter", "mBorderFilter init failed!!, break init");
                return false;
            }
        }
        if (this.v == null) {
            this.v = new d(true);
            this.v.a(true);
            if (!this.v.c()) {
                TXCLog.e("TXCBeauty4Filter", "mBorderBlurFilterVertical init failed!!, break init");
                return false;
            }
        }
        if (this.w == null) {
            this.w = new d(false);
            this.w.a(true);
            if (!this.w.c()) {
                TXCLog.e("TXCBeauty4Filter", "mBorderBlurFilterHorizontal init failed!!, break init");
                return false;
            }
        }
        if (this.u == null) {
            this.u = new c();
            this.u.a(true);
            if (!this.u.c()) {
                TXCLog.e("TXCBeauty4Filter", "mSmoothFilter init failed!!, break init");
                return false;
            }
        }
        this.u.a(360.0f, 640.0f);
        this.u.a(this.x);
        this.u.b(this.y);
        this.u.c(this.z);
        a(i, i2);
        return true;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i) {
        if (this.x > 0.0f || this.y > 0.0f || this.z > 0.0f) {
            int a = this.s.a(this.r.a(i));
            return this.u.a(i, a, this.w.a(this.v.a(this.t.c(i, a))));
        }
        return i;
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void c(int i) {
        this.x = i / 10.0f;
        if (this.u != null) {
            this.u.a(this.x);
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void d(int i) {
        this.y = i / 10.0f;
        if (this.u != null) {
            this.u.b(this.y);
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void e(int i) {
        this.z = i / 10.0f;
        if (this.u != null) {
            this.u.c(this.z);
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void f(int i) {
        this.u.d(i / 10.0f);
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
        if (this.t != null) {
            this.t.b();
            this.t = null;
        }
        if (this.u != null) {
            this.u.b();
            this.u = null;
        }
        if (this.v != null) {
            this.v.b();
            this.v = null;
        }
        if (this.w != null) {
            this.w.b();
            this.w = null;
        }
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void b() {
        super.b();
        r();
    }
}
