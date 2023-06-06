package com.dianping.video.videofilter.template;

import android.opengl.GLES20;
import com.dianping.titans.service.FileUtil;
import com.dianping.video.videofilter.gpuimage.f;
import com.dianping.video.videofilter.gpuimage.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a extends f {
    public static ChangeQuickRedirect a;
    private Map<String, float[]> A;
    private final float[] B;
    private final float[] C;
    private int[] D;
    private int[] E;
    private boolean F;
    public List<Integer> b;
    protected FloatBuffer c;
    protected FloatBuffer q;
    protected boolean r;
    private Map<String, Integer> s;
    private Map<String, Float> t;
    private Map<String, float[]> u;
    private Map<String, float[]> v;
    private Map<String, float[]> w;
    private Map<String, float[]> x;
    private Map<String, float[]> y;
    private Map<String, float[]> z;

    public a(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0531f4d1c28f37b4cfa575dd1ea83fb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0531f4d1c28f37b4cfa575dd1ea83fb8");
            return;
        }
        this.b = new ArrayList();
        this.B = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.C = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        this.r = false;
    }

    public final void a(boolean z) {
        this.r = true;
    }

    public final void a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b27744a1c602a1288ef1b7a4ccaa65f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b27744a1c602a1288ef1b7a4ccaa65f");
            return;
        }
        if (this.t == null) {
            this.t = new LinkedHashMap();
        }
        this.t.put(str, Float.valueOf(f));
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b5fcc76e7eba02b0fda3b7a8358e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b5fcc76e7eba02b0fda3b7a8358e09");
            return;
        }
        super.e();
        if (this.b != null) {
            this.b.clear();
            this.b = null;
        }
        if (this.t != null) {
            this.t.clear();
            this.t = null;
        }
        if (this.s != null) {
            this.s.clear();
            this.s = null;
        }
        if (this.u != null) {
            this.u.clear();
            this.u = null;
        }
        if (this.v != null) {
            this.v.clear();
            this.v = null;
        }
        if (this.w != null) {
            this.w.clear();
            this.w = null;
        }
        if (this.y != null) {
            this.y.clear();
            this.y = null;
        }
        if (this.z != null) {
            this.z.clear();
            this.z = null;
        }
        if (this.A != null) {
            this.A.clear();
            this.A = null;
        }
        if (this.x != null) {
            this.x.clear();
            this.x = null;
        }
        this.r = false;
        j();
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a87901232b63e16e10c58629f02400cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a87901232b63e16e10c58629f02400cf");
            return;
        }
        this.c = ByteBuffer.allocateDirect(this.B.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.c.put(this.B).position(0);
        this.q = ByteBuffer.allocateDirect(this.C.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.q.put(this.C).position(0);
        if (this.t == null) {
            this.t = new LinkedHashMap();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.j = s.a(this.f, this.g);
        this.k = GLES20.glGetAttribLocation(this.j, "position");
        this.l = GLES20.glGetUniformLocation(this.j, "inputImageTexture");
        this.m = GLES20.glGetAttribLocation(this.j, "texCoord");
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf45acb6a877b21e20bbf48d286daae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf45acb6a877b21e20bbf48d286daae9");
            return;
        }
        super.a(i, i2);
        if (this.D != null) {
            j();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65347213c916786008c96e152359a51c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65347213c916786008c96e152359a51c");
        } else if (this.r) {
            this.D = new int[1];
            this.E = new int[1];
            GLES20.glGenFramebuffers(1, this.D, 0);
            GLES20.glGenTextures(1, this.E, 0);
            GLES20.glBindTexture(3553, this.E[0]);
            GLES20.glTexImage2D(3553, 0, 6408, this.n, this.o, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, this.D[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.E[0], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Object[] objArr = {Integer.valueOf(i), floatBuffer, floatBuffer2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5ca7c05c7378e9f73de6de49f9427ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5ca7c05c7378e9f73de6de49f9427ec");
            return;
        }
        if (this.r) {
            GLES20.glBindFramebuffer(36160, this.D[0]);
        }
        if (this.F) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
        }
        super.a(i, floatBuffer, floatBuffer2);
        if (this.F) {
            GLES20.glDisable(3042);
        }
        if (this.r) {
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void f() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efb9ab1bbfdea1278b6ba6d03710a8ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efb9ab1bbfdea1278b6ba6d03710a8ec");
            return;
        }
        super.f();
        if (this.t != null) {
            for (Map.Entry<String, Float> entry : this.t.entrySet()) {
                GLES20.glUniform1f(GLES20.glGetUniformLocation(this.j, entry.getKey()), entry.getValue().floatValue());
            }
        }
        if (this.u != null) {
            for (Map.Entry<String, float[]> entry2 : this.u.entrySet()) {
                GLES20.glUniform2fv(GLES20.glGetUniformLocation(this.j, entry2.getKey()), 1, FloatBuffer.wrap(entry2.getValue()));
            }
        }
        if (this.v != null) {
            for (Map.Entry<String, float[]> entry3 : this.v.entrySet()) {
                GLES20.glUniform3fv(GLES20.glGetUniformLocation(this.j, entry3.getKey()), 1, FloatBuffer.wrap(entry3.getValue()));
            }
        }
        if (this.w != null) {
            for (Map.Entry<String, float[]> entry4 : this.w.entrySet()) {
                GLES20.glUniform4fv(GLES20.glGetUniformLocation(this.j, entry4.getKey()), 1, FloatBuffer.wrap(entry4.getValue()));
            }
        }
        if (this.y != null) {
            for (Map.Entry<String, float[]> entry5 : this.y.entrySet()) {
                GLES20.glUniformMatrix2fv(GLES20.glGetUniformLocation(this.j, entry5.getKey()), 1, false, entry5.getValue(), 0);
            }
        }
        if (this.z != null) {
            for (Map.Entry<String, float[]> entry6 : this.z.entrySet()) {
                GLES20.glUniformMatrix3fv(GLES20.glGetUniformLocation(this.j, entry6.getKey()), 1, false, entry6.getValue(), 0);
            }
        }
        if (this.A != null) {
            for (Map.Entry<String, float[]> entry7 : this.A.entrySet()) {
                GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(this.j, entry7.getKey()), 1, false, entry7.getValue(), 0);
            }
        }
        if (this.x != null) {
            for (Map.Entry<String, float[]> entry8 : this.x.entrySet()) {
                GLES20.glUniform1fv(GLES20.glGetUniformLocation(this.j, entry8.getKey()), entry8.getValue().length, FloatBuffer.wrap(entry8.getValue()));
            }
        }
        if (this.s != null) {
            for (Map.Entry<String, Integer> entry9 : this.s.entrySet()) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.j, entry9.getKey()), entry9.getValue().intValue());
            }
        }
        float[] fArr = {this.n, this.o};
        Object[] objArr2 = {fArr};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27b1a083dbda1f7f13877e8d7c24f2c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27b1a083dbda1f7f13877e8d7c24f2c2");
        } else {
            GLES20.glUniform2fv(GLES20.glGetUniformLocation(this.j, "fboSize"), 1, fArr, 0);
        }
        if (this.b != null) {
            while (i < this.b.size()) {
                int i2 = i + 1;
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.b.get(i).intValue());
                int i3 = this.j;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(i3, "inputImageTexture" + i2), i2);
                i = i2;
            }
        }
    }

    public final int i() {
        if (this.E == null || this.E[0] == -1) {
            return -1;
        }
        return this.E[0];
    }

    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "989de6ebc9327b79af8984c869724b8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "989de6ebc9327b79af8984c869724b8a");
            return;
        }
        if (this.E != null) {
            GLES20.glDeleteTextures(this.E.length, this.E, 0);
            this.E = null;
        }
        if (this.D != null) {
            GLES20.glDeleteFramebuffers(this.D.length, this.D, 0);
            this.D = null;
        }
    }
}
