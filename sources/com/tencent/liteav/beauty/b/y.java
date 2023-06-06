package com.tencent.liteav.beauty.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.util.TypedValue;
import com.dianping.titans.service.FileUtil;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.b.q;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class y implements Camera.PreviewCallback, GLSurfaceView.Renderer {
    static final float[] a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public final Object b;
    private com.tencent.liteav.basic.opengl.j c;
    private SurfaceTexture d;
    private final FloatBuffer e;
    private final FloatBuffer f;
    private IntBuffer g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Queue<Runnable> l;
    private final Queue<Runnable> m;
    private com.tencent.liteav.basic.opengl.l n;
    private boolean o;
    private boolean p;
    private q.a q;
    private float r;
    private float s;
    private float t;
    private Context u;
    private int v;
    private String w;
    private FileOutputStream x;
    private int y;
    private int z;

    private float a(float f, float f2) {
        return f == 0.0f ? f2 : 1.0f - f2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(this.r, this.s, this.t, 1.0f);
        GLES20.glDisable(2929);
        this.c.c();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.h = i;
        this.i = i2;
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glUseProgram(this.c.q());
        this.c.a(i, i2);
        a();
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        File externalFilesDir;
        GLES20.glClear(16640);
        a(this.l);
        if (this.z == -1) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            this.z = iArr[0];
            GLES20.glBindTexture(3553, this.z);
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            TypedValue typedValue = new TypedValue();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inTargetDensity = typedValue.density;
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(this.u.getResources(), this.v, options);
            GLES20.glBindTexture(3553, this.z);
            GLUtils.texImage2D(3553, 0, a2, 0);
        }
        this.c.a(this.z, this.e, this.f);
        IntBuffer allocate = IntBuffer.allocate(250000);
        GLES20.glReadPixels(0, 0, 500, 500, 6408, 5121, allocate);
        int i = this.y;
        this.y = i + 1;
        if (i == 50) {
            try {
                if (this.x == null && this.u != null && (externalFilesDir = this.u.getExternalFilesDir(null)) != null) {
                    this.x = new FileOutputStream(new File(externalFilesDir.getAbsolutePath(), "rgbBuffer"));
                }
                String byteOrder = allocate.order().toString();
                int[] array = allocate.array();
                byte[] bArr = new byte[1000000];
                if (byteOrder.compareTo("LITTLE_ENDIAN") != 0) {
                    for (int i2 = 0; i2 < 250000; i2++) {
                        int i3 = i2 * 4;
                        bArr[i3 + 3] = (byte) ((array[i2] >> 24) & 255);
                        bArr[i3 + 2] = (byte) ((array[i2] >> 16) & 255);
                        bArr[i3 + 1] = (byte) ((array[i2] >> 8) & 255);
                        bArr[i3] = (byte) (array[i2] & 255);
                    }
                } else {
                    for (int i4 = 0; i4 < 250000; i4++) {
                        int i5 = i4 * 4;
                        bArr[i5] = (byte) ((array[i4] >> 24) & 255);
                        bArr[i5 + 1] = (byte) ((array[i4] >> 16) & 255);
                        bArr[i5 + 2] = (byte) ((array[i4] >> 8) & 255);
                        bArr[i5 + 3] = (byte) (array[i4] & 255);
                    }
                }
                if (this.x != null) {
                    this.x.write(bArr, 0, 1000000);
                    this.x.flush();
                }
            } catch (Exception e) {
                TXCLog.e(this.w, "write bitmap failed.", e);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.y);
            TXCLog.e("check1", sb.toString());
        }
        a(this.m);
        if (this.d != null) {
            this.d.updateTexImage();
        }
    }

    private void a(Queue<Runnable> queue) {
        if (queue == null) {
            TXCLog.e(this.w, "runAll queue is null!");
            return;
        }
        synchronized (queue) {
            while (!queue.isEmpty()) {
                queue.poll().run();
            }
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        if (this.g == null && previewSize != null) {
            this.g = IntBuffer.allocate(previewSize.width * previewSize.height);
        }
        if (this.l.isEmpty()) {
            a(new Runnable() { // from class: com.tencent.liteav.beauty.b.y.1
                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }
    }

    private void a() {
        float f = this.h;
        float f2 = this.i;
        if (this.n == com.tencent.liteav.basic.opengl.l.ROTATION_270 || this.n == com.tencent.liteav.basic.opengl.l.ROTATION_90) {
            f = this.i;
            f2 = this.h;
        }
        float max = Math.max(f / this.j, f2 / this.k);
        float round = Math.round(this.j * max) / f;
        float round2 = Math.round(this.k * max) / f2;
        float[] fArr = a;
        float[] a2 = com.tencent.liteav.basic.opengl.m.a(this.n, this.o, this.p);
        if (this.q == q.a.CENTER_CROP) {
            float f3 = (1.0f - (1.0f / round)) / 2.0f;
            float f4 = (1.0f - (1.0f / round2)) / 2.0f;
            a2 = new float[]{a(a2[0], f3), a(a2[1], f4), a(a2[2], f3), a(a2[3], f4), a(a2[4], f3), a(a2[5], f4), a(a2[6], f3), a(a2[7], f4)};
        } else {
            fArr = new float[]{a[0] / round2, a[1] / round, a[2] / round2, a[3] / round, a[4] / round2, a[5] / round, a[6] / round2, a[7] / round};
        }
        a2[0] = 0.0f;
        a2[1] = 1.0f;
        a2[2] = 1.0f;
        a2[3] = 1.0f;
        a2[4] = 0.0f;
        a2[5] = 0.0f;
        a2[6] = 1.0f;
        a2[7] = 0.0f;
        this.e.clear();
        this.e.put(fArr).position(0);
        this.f.clear();
        this.f.put(a2).position(0);
    }

    protected void a(Runnable runnable) {
        synchronized (this.l) {
            this.l.add(runnable);
        }
    }
}
