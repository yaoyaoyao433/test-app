package com.tencent.liteav.beauty.b;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.BV.LinearGradient.LinearGradientManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ac extends com.tencent.liteav.basic.opengl.j {
    private float r;
    private int s;
    private float t;
    private int u;
    private PointF v;
    private int w;

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a = super.a();
        this.s = GLES20.glGetUniformLocation(q(), LinearGradientManager.PROP_ANGLE);
        this.u = GLES20.glGetUniformLocation(q(), "radius");
        this.w = GLES20.glGetUniformLocation(q(), "center");
        return a;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void d() {
        super.d();
        a(this.t);
        b(this.r);
        a(this.v);
    }

    public void a(float f) {
        this.t = f;
        a(this.u, f);
    }

    public void b(float f) {
        this.r = f;
        a(this.s, f);
    }

    public void a(PointF pointF) {
        this.v = pointF;
        a(this.w, pointF);
    }
}
