package com.dianping.video.videofilter.gpuimage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.dianping.video.videofilter.gpuimage.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
@TargetApi(11)
/* loaded from: classes.dex */
public final class l implements GLSurfaceView.Renderer {
    public static ChangeQuickRedirect a;
    public static final float[] b = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public final Object c;
    public boolean d;
    public boolean e;
    public b.a f;
    private f g;
    private int h;
    private final FloatBuffer i;
    private final FloatBuffer j;
    private int k;
    private int l;
    private int m;
    private int n;
    private final Queue<Runnable> o;
    private final Queue<Runnable> p;
    private u q;
    private float r;
    private float s;
    private float t;

    private float a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb36cf4e33d4608f1d7b863ecd3417ab", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb36cf4e33d4608f1d7b863ecd3417ab")).floatValue() : f == 0.0f ? f2 : 1.0f - f2;
    }

    public l(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d52be991cf05bc08aa2b07998c7ebc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d52be991cf05bc08aa2b07998c7ebc0");
            return;
        }
        this.c = new Object();
        this.h = -1;
        this.f = b.a.CENTER_CROP;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.g = fVar;
        this.o = new LinkedList();
        this.p = new LinkedList();
        this.i = ByteBuffer.allocateDirect(b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.i.put(b).position(0);
        this.j = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        a(u.NORMAL, false, true);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Object[] objArr = {gl10, eGLConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60689ee1665c1616457af95b1ff596f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60689ee1665c1616457af95b1ff596f8");
            return;
        }
        GLES20.glClearColor(this.r, this.s, this.t, 1.0f);
        GLES20.glDisable(2929);
        this.g.b();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Object[] objArr = {gl10, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd7212c16214ae0c1e7707187f329f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd7212c16214ae0c1e7707187f329f5");
            return;
        }
        this.k = i;
        this.l = i2;
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glUseProgram(this.g.h());
        this.g.a(i, i2);
        a();
        synchronized (this.c) {
            this.c.notifyAll();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object[] objArr = {gl10};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dced89c577f0561c87e78305f7c0674a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dced89c577f0561c87e78305f7c0674a");
            return;
        }
        GLES20.glClear(16640);
        a(this.o);
        this.g.a(this.h, this.i, this.j);
        a(this.p);
    }

    private void a(Queue<Runnable> queue) {
        Object[] objArr = {queue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c583f979b4bea326ff565269118b10ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c583f979b4bea326ff565269118b10ba");
            return;
        }
        synchronized (queue) {
            while (!queue.isEmpty()) {
                queue.poll().run();
            }
        }
    }

    public final void a(final f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ca921b6fdf72609f3ecffa2412442d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ca921b6fdf72609f3ecffa2412442d");
        } else {
            a(new Runnable() { // from class: com.dianping.video.videofilter.gpuimage.l.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a204c77e2d6bb7f16e1de8aecde8f76", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a204c77e2d6bb7f16e1de8aecde8f76");
                        return;
                    }
                    f fVar2 = l.this.g;
                    l.this.g = fVar;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                    l.this.g.b();
                    GLES20.glUseProgram(l.this.g.h());
                    l.this.g.a(l.this.k, l.this.l);
                }
            });
        }
    }

    public final void a(final Bitmap bitmap, boolean z) {
        Object[] objArr = {bitmap, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac28066a7bd647f7e6635eef717d3a77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac28066a7bd647f7e6635eef717d3a77");
        } else if (bitmap == null) {
        } else {
            a(new Runnable() { // from class: com.dianping.video.videofilter.gpuimage.l.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmap2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3da8196402f8dbea595f6c8986162512", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3da8196402f8dbea595f6c8986162512");
                        return;
                    }
                    if (bitmap.getWidth() % 2 == 1) {
                        bitmap2 = Bitmap.createBitmap(bitmap.getWidth() + 1, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmap2);
                        canvas.drawARGB(0, 0, 0, 0);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    } else {
                        bitmap2 = null;
                    }
                    l.this.h = s.a(bitmap2 != null ? bitmap2 : bitmap, l.this.h, r3);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    l.this.m = bitmap.getWidth();
                    l.this.n = bitmap.getHeight();
                    l.this.a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        float[] fArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aefc191560c344fae20ddfcac5809ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aefc191560c344fae20ddfcac5809ba");
            return;
        }
        float f = this.k;
        float f2 = this.l;
        if (this.q == u.ROTATION_270 || this.q == u.ROTATION_90) {
            f = this.l;
            f2 = this.k;
        }
        float max = Math.max(f / this.m, f2 / this.n);
        float round = Math.round(this.m * max) / f;
        float round2 = Math.round(this.n * max) / f2;
        float[] fArr2 = b;
        float[] a2 = v.a(this.q, this.d, this.e);
        if (this.f == b.a.CENTER_CROP) {
            float f3 = (1.0f - (1.0f / round)) / 2.0f;
            float f4 = (1.0f - (1.0f / round2)) / 2.0f;
            fArr = new float[]{a(a2[0], f3), a(a2[1], f4), a(a2[2], f3), a(a2[3], f4), a(a2[4], f3), a(a2[5], f4), a(a2[6], f3), a(a2[7], f4)};
        } else {
            fArr2 = new float[]{b[0] / round2, b[1] / round, b[2] / round2, b[3] / round, b[4] / round2, b[5] / round, b[6] / round2, b[7] / round};
            fArr = a2;
        }
        this.i.clear();
        this.i.put(fArr2).position(0);
        this.j.clear();
        this.j.put(fArr).position(0);
    }

    private void a(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b3198cbf69f4285d7061b1a508788a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b3198cbf69f4285d7061b1a508788a3");
            return;
        }
        this.q = uVar;
        a();
    }

    public final void a(u uVar, boolean z, boolean z2) {
        Object[] objArr = {uVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb8144110392bf9b06e84e94535570b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb8144110392bf9b06e84e94535570b");
            return;
        }
        this.d = z;
        this.e = z2;
        a(uVar);
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549ceab259162f3c3b2a6a0d11d64c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549ceab259162f3c3b2a6a0d11d64c41");
            return;
        }
        synchronized (this.o) {
            this.o.add(runnable);
        }
    }
}
