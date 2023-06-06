package com.dianping.video.videofilter.gpuimage;

import android.annotation.SuppressLint;
import android.opengl.GLES20;
import com.dianping.titans.service.FileUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends f {
    public static ChangeQuickRedirect a;
    protected List<f> b;
    public int[] c;
    private int[] q;
    private int[] r;
    private int[] s;
    private final FloatBuffer t;
    private final FloatBuffer u;
    private final FloatBuffer v;

    public h() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d17c3bb8caac1025dfb35575119008a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d17c3bb8caac1025dfb35575119008a6");
        }
    }

    private h(List<f> list) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b23c627e16e2907ba866611ab3438771", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b23c627e16e2907ba866611ab3438771");
            return;
        }
        this.b = null;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.t = ByteBuffer.allocateDirect(a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.t.put(a.a).position(0);
        this.u = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.u.put(v.b).position(0);
        float[] a2 = v.a(u.NORMAL, false, true);
        this.v = ByteBuffer.allocateDirect(a2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.v.put(a2).position(0);
    }

    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "723661d3783e15157b89a6e90fed89d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "723661d3783e15157b89a6e90fed89d9");
        } else if (fVar != null) {
            this.b.add(fVar);
            if (e) {
                new StringBuilder(" add filter=").append(fVar.getClass().getSimpleName());
                StringBuilder sb = new StringBuilder();
                sb.append("mFilters = ");
                for (f fVar2 : this.b) {
                    sb.append(fVar2.getClass().getSimpleName());
                    sb.append(StringUtil.SPACE);
                }
                new StringBuilder(StringUtil.SPACE).append(sb.toString());
            }
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8181d60929b30c0bc721aee5dc5ba973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8181d60929b30c0bc721aee5dc5ba973");
            return;
        }
        super.a();
        for (f fVar : this.b) {
            fVar.b();
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1499a76437190d8b8f41a8840db74c3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1499a76437190d8b8f41a8840db74c3f");
            return;
        }
        j();
        for (f fVar : this.b) {
            fVar.d();
        }
        super.e();
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d8e3336ad8cc3a72b5df91b0513134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d8e3336ad8cc3a72b5df91b0513134");
            return;
        }
        if (this.r != null) {
            GLES20.glDeleteTextures(this.r.length, this.r, 0);
            this.r = null;
        }
        if (this.q != null) {
            GLES20.glDeleteFramebuffers(this.q.length, this.q, 0);
            this.q = null;
        }
        if (this.c != null) {
            GLES20.glDeleteTextures(this.c.length, this.c, 0);
            this.c = null;
        }
        if (this.s != null) {
            GLES20.glDeleteFramebuffers(this.s.length, this.s, 0);
            this.s = null;
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a(int i, int i2) {
        int i3 = 1;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be55b70b1c3f28468c10235f4d9ba570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be55b70b1c3f28468c10235f4d9ba570");
            return;
        }
        super.a(i, i2);
        if (this.q != null) {
            j();
        }
        int size = this.b.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.b.get(i4).a(i, i2);
        }
        if (this.b == null || this.b.size() <= 0) {
            return;
        }
        int size2 = this.b.size() - 1;
        this.q = new int[size2];
        this.r = new int[size2];
        this.s = new int[1];
        this.c = new int[1];
        int i5 = 0;
        while (i5 < size2) {
            try {
                GLES20.glGenFramebuffers(i3, this.q, i5);
                GLES20.glGenTextures(i3, this.r, i5);
                GLES20.glBindTexture(3553, this.r[i5]);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glBindFramebuffer(36160, this.q[i5]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.r[i5], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                i5++;
                i3 = 1;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        GLES20.glGenFramebuffers(1, this.s, 0);
        GLES20.glGenTextures(1, this.c, 0);
        GLES20.glBindTexture(3553, this.c[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glBindFramebuffer(36160, this.s[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.c[0], 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    @SuppressLint({"WrongCall"})
    public final void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Object[] objArr = {Integer.valueOf(i), floatBuffer, floatBuffer2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db85ab914688c04454c751698715bb8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db85ab914688c04454c751698715bb8e");
            return;
        }
        g();
        if (!this.p || this.q == null || this.r == null) {
            return;
        }
        try {
            if (this.b != null) {
                int size = this.b.size();
                int i2 = i;
                int i3 = 0;
                while (i3 < size) {
                    f fVar = this.b.get(i3);
                    boolean z = i3 < size + (-1);
                    if (z) {
                        GLES20.glBindFramebuffer(36160, this.q[i3]);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        GLES20.glBindFramebuffer(36160, this.s[0]);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i3 == 0) {
                        fVar.a(i2, floatBuffer, floatBuffer2);
                    } else {
                        fVar.a(i2, this.t, this.v);
                    }
                    if (z) {
                        GLES20.glBindFramebuffer(36160, 0);
                        i2 = this.r[i3];
                    } else {
                        GLES20.glBindFramebuffer(36160, 0);
                    }
                    i3++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final List<f> i() {
        return this.b;
    }
}
