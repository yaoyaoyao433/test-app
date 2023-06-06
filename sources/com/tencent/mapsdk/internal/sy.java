package com.tencent.mapsdk.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sy extends View implements bu {
    private Context a;
    private so b;
    private Object c;
    private int d;
    private int e;
    private sn f;
    private boolean g;

    @Override // com.tencent.mapsdk.internal.bu
    public final boolean e() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final View getView() {
        return this;
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setMapOpaque(boolean z) {
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setZOrderMediaOverlay(boolean z) {
    }

    public sy(be beVar) {
        super(beVar.getContext());
        this.g = true;
        Object i = beVar.i();
        if (i == null) {
            return;
        }
        this.a = beVar.getContext();
        this.b = (so) beVar.b();
        this.c = i;
        this.d = beVar.j();
        this.e = beVar.k();
        if (this.e <= 0 || this.d <= 0) {
            this.d = 0;
            this.e = 0;
        }
        this.f = new sn(this.b);
        this.f.a(this.c);
        sn.a(beVar.m());
        this.f.start();
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void d() {
        if (this.f != null) {
            synchronized (this.f) {
                this.f.notify();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a() {
        if (this.f != null) {
            this.f.b();
        }
        if (this.b == null || !this.g) {
            return;
        }
        this.b.a((GL10) null, (EGLConfig) null);
        this.b.a((GL10) null, this.d, this.e);
        this.b.e(this.d, this.e);
        this.g = false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void b() {
        if (this.f != null) {
            this.f.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void c() {
        if (this.f != null) {
            this.f.c();
        }
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.b != null) {
            this.d = i;
            this.e = i2;
            this.b.a((GL10) null, i, i2);
            this.b.e(i, i2);
            this.b.F();
            this.g = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(Object obj, int i, int i2) {
        if (this.b == null || this.f == null || !this.f.isAlive()) {
            return;
        }
        if (this.f != null) {
            this.c = obj;
            this.f.a(obj);
        }
        if (this.b != null) {
            this.b.a((GL10) null, (EGLConfig) null);
            this.b.a((GL10) null, i, i2);
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(float f) {
        if (this.f != null) {
            sn.a(f);
        }
    }

    private void f() {
        if (this.b == null || !this.g) {
            return;
        }
        this.b.a((GL10) null, (EGLConfig) null);
        this.b.a((GL10) null, this.d, this.e);
        this.b.e(this.d, this.e);
        this.g = false;
    }
}
