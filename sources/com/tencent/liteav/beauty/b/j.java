package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.dianping.titans.service.FileUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class j extends com.tencent.liteav.basic.opengl.j {
    protected List<com.tencent.liteav.basic.opengl.j> r;
    protected List<com.tencent.liteav.basic.opengl.j> s;
    private int[] t;
    private int[] u;
    private com.tencent.liteav.basic.opengl.j v;
    private final FloatBuffer w;
    private final FloatBuffer x;
    private final FloatBuffer y;

    public j() {
        this(null);
        this.o = true;
    }

    public j(List<com.tencent.liteav.basic.opengl.j> list) {
        this.s = new ArrayList();
        this.v = new com.tencent.liteav.basic.opengl.j();
        this.o = true;
        this.r = list;
        if (this.r == null) {
            this.r = new ArrayList();
        } else {
            s();
        }
        this.w = ByteBuffer.allocateDirect(y.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.w.put(y.a).position(0);
        this.x = ByteBuffer.allocateDirect(com.tencent.liteav.basic.opengl.m.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.x.put(com.tencent.liteav.basic.opengl.m.a).position(0);
        float[] a = com.tencent.liteav.basic.opengl.m.a(com.tencent.liteav.basic.opengl.l.NORMAL, false, true);
        this.y = ByteBuffer.allocateDirect(a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.y.put(a).position(0);
    }

    public void a(com.tencent.liteav.basic.opengl.j jVar) {
        if (jVar == null) {
            return;
        }
        this.r.add(jVar);
        s();
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a = super.a();
        if (a) {
            for (com.tencent.liteav.basic.opengl.j jVar : this.r) {
                jVar.c();
                if (!jVar.n()) {
                    break;
                }
            }
            a = this.v.c();
        }
        return a && GLES20.glGetError() == 0;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void b() {
        super.b();
        for (com.tencent.liteav.basic.opengl.j jVar : this.r) {
            jVar.e();
        }
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void f() {
        super.f();
        if (this.u != null) {
            GLES20.glDeleteTextures(2, this.u, 0);
            this.u = null;
        }
        if (this.t != null) {
            GLES20.glDeleteFramebuffers(2, this.t, 0);
            this.t = null;
        }
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        if (this.e == i && this.f == i2) {
            return;
        }
        if (this.t != null) {
            f();
        }
        super.a(i, i2);
        int size = this.s.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.s.get(i3).a(i, i2);
        }
        this.v.a(i, i2);
        if (this.s == null || this.s.size() <= 0) {
            return;
        }
        this.s.size();
        this.t = new int[2];
        this.u = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            GLES20.glGenFramebuffers(1, this.t, i4);
            GLES20.glGenTextures(1, this.u, i4);
            GLES20.glBindTexture(3553, this.u[i4]);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, this.t[i4]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.u[i4], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i, int i2, int i3) {
        int size = this.s.size();
        k();
        int i4 = i;
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            com.tencent.liteav.basic.opengl.j jVar = this.s.get(i5);
            if (z) {
                i4 = jVar.a(i4, i2, i3);
            } else {
                i4 = jVar.a(i4, this.t[0], this.u[0]);
            }
            z = !z;
        }
        if (z) {
            this.v.a(i4, i2, i3);
        }
        return i3;
    }

    public List<com.tencent.liteav.basic.opengl.j> r() {
        return this.s;
    }

    public void s() {
        if (this.r == null) {
            return;
        }
        this.s.clear();
        for (com.tencent.liteav.basic.opengl.j jVar : this.r) {
            if (jVar instanceof j) {
                j jVar2 = (j) jVar;
                jVar2.s();
                List<com.tencent.liteav.basic.opengl.j> r = jVar2.r();
                if (r != null && !r.isEmpty()) {
                    this.s.addAll(r);
                }
            } else {
                this.s.add(jVar);
            }
        }
    }
}
