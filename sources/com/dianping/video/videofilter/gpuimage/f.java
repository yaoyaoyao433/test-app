package com.dianping.video.videofilter.gpuimage;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f {
    public static ChangeQuickRedirect d = null;
    public static boolean e = false;
    private final LinkedList<Runnable> a;
    protected String f;
    protected String g;
    protected float[] h;
    protected float[] i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    boolean p;

    public void c() {
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae875d3b8c5449ffd1cc9ba9eb3260bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae875d3b8c5449ffd1cc9ba9eb3260bf");
        }
    }

    public void f() {
    }

    public f() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aae0f78bd7a76c285578d7af2534059", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aae0f78bd7a76c285578d7af2534059");
        }
    }

    public f(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a76c462fb3e63989bf1dfc1bccbefa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a76c462fb3e63989bf1dfc1bccbefa");
            return;
        }
        this.h = new float[16];
        this.i = new float[16];
        this.a = new LinkedList<>();
        this.f = str;
        this.g = str2;
    }

    public final void a(String str, String str2) {
        this.f = str;
        this.g = str2;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe29caf5cbfe97322619ed9b6dd2605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe29caf5cbfe97322619ed9b6dd2605");
            return;
        }
        a();
        this.p = true;
        c();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e22f30aa1e56efb4514c3c3b176d2f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e22f30aa1e56efb4514c3c3b176d2f22");
            return;
        }
        this.j = s.a(this.f, this.g);
        this.k = GLES20.glGetAttribLocation(this.j, "position");
        this.l = GLES20.glGetUniformLocation(this.j, "inputImageTexture");
        this.m = GLES20.glGetAttribLocation(this.j, "inputTextureCoordinate");
        this.p = true;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9223cad680b11049843da6fc72c6a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9223cad680b11049843da6fc72c6a0e");
            return;
        }
        this.p = false;
        GLES20.glDeleteProgram(this.j);
        e();
    }

    public void a(int i, int i2) {
        this.n = i;
        this.o = i2;
    }

    public void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Object[] objArr = {Integer.valueOf(i), floatBuffer, floatBuffer2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf90da2df9cc549d5bf4d6d7f9e0d58a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf90da2df9cc549d5bf4d6d7f9e0d58a");
            return;
        }
        GLES20.glUseProgram(this.j);
        g();
        if (this.p) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.k, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.k);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.m, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.m);
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i);
                GLES20.glUniform1i(this.l, 0);
            }
            f();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.k);
            GLES20.glDisableVertexAttribArray(this.m);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9ac6fed0375938fab8698acc79d7d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9ac6fed0375938fab8698acc79d7d8");
            return;
        }
        while (!this.a.isEmpty()) {
            this.a.removeFirst().run();
        }
    }

    public final int h() {
        return this.j;
    }

    public final void a(final int i, final float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "358935528952c986a48e332436ea1a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "358935528952c986a48e332436ea1a16");
        } else {
            a(new Runnable() { // from class: com.dianping.video.videofilter.gpuimage.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f7d7f553ec68f2656e60d90f782abad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f7d7f553ec68f2656e60d90f782abad");
                    } else {
                        GLES20.glUniform1f(i, f);
                    }
                }
            });
        }
    }

    public final void a(final int i, final float[] fArr) {
        Object[] objArr = {Integer.valueOf(i), fArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbd0c94b53857ec10929e5a261d872cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbd0c94b53857ec10929e5a261d872cd");
        } else {
            a(new Runnable() { // from class: com.dianping.video.videofilter.gpuimage.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fbab360b8bdd32bf53682b1adc0bd3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fbab360b8bdd32bf53682b1adc0bd3d");
                    } else {
                        GLES20.glUniform2fv(i, 1, FloatBuffer.wrap(fArr));
                    }
                }
            });
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8688af9782d2bb3ccbbb80ae7733dc18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8688af9782d2bb3ccbbb80ae7733dc18");
            return;
        }
        synchronized (this.a) {
            this.a.addLast(runnable);
        }
    }

    public final void a(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8db00b793d4533faa63018296dc94e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8db00b793d4533faa63018296dc94e");
            return;
        }
        this.i = fArr;
        com.dianping.video.log.c.a().a("GPUImageFilter", "set STMatrix");
    }
}
