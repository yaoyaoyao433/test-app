package com.tencent.liteav.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.common.CommonConstant;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.opengl.p;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f extends com.tencent.liteav.basic.module.a implements TextureView.SurfaceTextureListener {
    private static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    private SurfaceTexture b;
    protected TextureView d;
    protected e e;
    protected g o;
    WeakReference<com.tencent.liteav.basic.c.b> p;
    private com.tencent.liteav.basic.opengl.g q;
    private i r;
    private Surface s;
    private int u;
    protected int f = 0;
    protected int g = 0;
    protected int h = 0;
    protected int i = 0;
    protected int j = 0;
    private int c = 800;
    private int t = 0;
    protected int k = 0;
    protected volatile int l = -1;
    protected int m = 0;
    protected int n = 0;
    private int[] v = new int[5];
    private int w = 500;
    private long x = 0;
    private long y = 0;
    private long z = 0;
    private long A = 0;
    private boolean B = false;
    private boolean C = false;
    private boolean E = false;
    private a F = new a();
    private boolean D = false;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public long a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;
        public int m;
        public int n;
    }

    public SurfaceTexture a() {
        return null;
    }

    public void c(Object obj) {
    }

    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void a(int i) {
        this.j = i;
    }

    private Bitmap a(Bitmap bitmap, int i, int i2) {
        float height;
        float f = i2;
        float f2 = i;
        if (f / f2 > bitmap.getHeight() / bitmap.getWidth()) {
            height = f2 / bitmap.getWidth();
        } else {
            height = f / bitmap.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.preScale(height, height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmap.recycle();
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(Matrix matrix, Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2;
        Bitmap a2;
        int i3 = 360 - ((this.t + this.k) % 360);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        if (i3 != 0) {
            Matrix matrix2 = new Matrix();
            matrix2.setRotate(i3);
            bitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix2, false);
            createBitmap.recycle();
        } else {
            bitmap2 = createBitmap;
        }
        if (this.u != 0) {
            return (i == bitmap2.getWidth() || i2 == bitmap2.getHeight()) ? bitmap2 : a(bitmap2, i, i2);
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        boolean z = i < i2;
        if (z != (width < height)) {
            if (z) {
                float f = i;
                float f2 = (height * f) / i2;
                Matrix matrix3 = new Matrix();
                float f3 = f / f2;
                matrix3.preScale(f3, f3);
                a2 = Bitmap.createBitmap(bitmap2, (int) ((width - f2) * 0.5f), 0, (int) f2, height, matrix3, false);
                bitmap2.recycle();
            } else {
                float f4 = i2;
                float f5 = (width / i) * f4;
                Matrix matrix4 = new Matrix();
                float f6 = f4 / f5;
                matrix4.preScale(f6, f6);
                Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2, 0, (int) ((height - f5) * 0.5f), width, (int) f5, (Matrix) null, false);
                Bitmap createBitmap3 = Bitmap.createBitmap(createBitmap2, 0, 0, createBitmap2.getWidth(), createBitmap2.getHeight(), matrix4, false);
                createBitmap2.recycle();
                return createBitmap3;
            }
        } else if (i == bitmap2.getWidth() || i2 == bitmap2.getHeight()) {
            return bitmap2;
        } else {
            a2 = a(bitmap2, i, i2);
        }
        return a2;
    }

    public void a(final p pVar) {
        final Bitmap bitmap;
        final TextureView textureView = this.d;
        if (textureView != null) {
            try {
                bitmap = textureView.getBitmap();
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                final Matrix transform = textureView.getTransform(null);
                AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.renderer.f.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Bitmap bitmap2 = null;
                        try {
                            bitmap2 = f.this.a(transform, bitmap, textureView.getWidth(), textureView.getHeight());
                        } catch (Error e) {
                            TXCLog.w("TXCVideoRender", "takePhoto error " + e);
                        } catch (Exception e2) {
                            TXCLog.w("TXCVideoRender", "takePhoto error " + e2);
                        }
                        if (pVar != null) {
                            pVar.onTakePhotoComplete(bitmap2);
                        }
                    }
                });
            }
        } else if (this.q != null) {
            this.q.a(new Runnable() { // from class: com.tencent.liteav.renderer.f.2
                @Override // java.lang.Runnable
                public void run() {
                    if (f.this.q != null) {
                        f.this.q.a(pVar);
                    }
                }
            });
        } else if (pVar != null) {
            pVar.onTakePhotoComplete(null);
        }
    }

    public void b(int i) {
        if (i > 0) {
            this.c = i;
        }
    }

    public void a(g gVar) {
        this.o = gVar;
    }

    public void a(com.tencent.liteav.basic.c.b bVar) {
        this.p = new WeakReference<>(bVar);
    }

    public void a(TextureView textureView) {
        b(textureView);
    }

    public void a(Surface surface) {
        b(surface);
    }

    public void a(TXSVideoFrame tXSVideoFrame, int i, int i2, int i3) {
        if (i3 != this.k) {
            this.k = i3;
            e(this.t);
        }
        a(i, i2);
        b();
    }

    public void a(int i, int i2, int i3, boolean z, int i4) {
        a(i2, i3);
    }

    public void e() {
        Monitor.a(2, String.format("Remote-VideoRender[%d]: Start [tinyID:%s] [streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.j)), "streamType: 2-big, 3-small, 7-sub", 0);
        this.C = true;
        if (Build.VERSION.SDK_INT >= 21) {
            this.E = true;
        } else {
            this.E = false;
        }
        this.D = false;
        m();
    }

    public void a(boolean z) {
        if (this.C) {
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(hashCode());
            objArr[1] = getID();
            objArr[2] = Integer.valueOf(this.j);
            objArr[3] = z ? "true" : "false";
            Monitor.a(2, String.format("Remote-VideoRender[%d]: Stop [tinyID:%s][streamType:%d][stopRendThread:%s]", objArr), "streamType: 2-big, 3-small, 7-sub", 0);
        }
        this.C = false;
        this.D = false;
        this.E = false;
        if (z && this.l == 1) {
            this.l = -1;
            TXCLog.w("TXCVideoRender", "play:vrender: quit render thread when stop");
            d();
            synchronized (this) {
                if (this.q != null) {
                    TXCLog.i("TXCVideoRender", "surface-render:stop render thread " + this.q);
                    this.q.a();
                    this.q = null;
                }
            }
        }
    }

    public void c(int i, int i2) {
        a(i, i2);
    }

    public void c(int i) {
        this.u = i;
        if (this.e != null) {
            this.e.a(i);
        }
    }

    public void d(int i) {
        if (this.e != null) {
            if (i == 2) {
                this.e.a(false);
            } else {
                this.e.a(true);
            }
        }
    }

    public void e(int i) {
        this.t = i;
        if (this.e != null) {
            this.e.c((i + this.k) % 360);
        }
    }

    public int f() {
        if (this.d != null) {
            return this.d.getWidth();
        }
        if (this.s != null) {
            return this.m;
        }
        return 0;
    }

    public int g() {
        if (this.d != null) {
            return this.d.getHeight();
        }
        if (this.s != null) {
            return this.n;
        }
        return 0;
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(SurfaceTexture surfaceTexture) {
        this.B = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(SurfaceTexture surfaceTexture) {
        this.B = false;
    }

    public void f(int i) {
        this.w = i;
    }

    private void b(TextureView textureView) {
        boolean z = false;
        if (textureView != null) {
            this.l = 0;
        }
        if ((this.d == null && textureView != null) || (this.d != null && !this.d.equals(textureView))) {
            z = true;
        }
        TXCLog.w("TXCVideoRender", "play:vrender: set video view @old=" + this.d + ",new=" + textureView + "id " + getID() + CommonConstant.Symbol.UNDERLINE + this.j);
        if (z) {
            if (this.d != null && this.b == null) {
                b(this.d.getSurfaceTexture());
                this.d.setSurfaceTextureListener(null);
            }
            this.d = textureView;
            if (this.d != null) {
                if (this.d.getWidth() != 0) {
                    this.f = this.d.getWidth();
                }
                if (this.d.getHeight() != 0) {
                    this.g = this.d.getHeight();
                }
                this.e = new e(this.d);
                this.e.b(this.h, this.i);
                this.e.a(this.f, this.g);
                this.e.a(this.u);
                this.e.c((this.t + this.k) % 360);
                this.d.setSurfaceTextureListener(this);
                if (this.b != null) {
                    if (Build.VERSION.SDK_INT >= 16 && this.d.getSurfaceTexture() != this.b) {
                        TXCLog.w("TXCVideoRender", "play:vrender: setSurfaceTexture " + this.d + ", surfaceTexture " + this.b);
                        try {
                            this.d.setSurfaceTexture(this.b);
                            return;
                        } catch (Exception e) {
                            TXCLog.e("TXCVideoRender", "setSurfaceTexture error " + e);
                            return;
                        }
                    }
                    TXCLog.w("TXCVideoRender", "play:vrender: not setSurfaceTexture old surfaceTexture " + this.d.getSurfaceTexture() + ", new surfaceTexture " + this.b);
                } else if (this.d.isAvailable()) {
                    a(this.d.getSurfaceTexture());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i, int i2) {
        if (this.h == i && this.i == i2) {
            return;
        }
        if (this.h == i && this.i == i2) {
            return;
        }
        this.h = i;
        this.i = i2;
        if (this.e != null) {
            this.e.b(this.h, this.i);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TXCLog.w("TXCVideoRender", "play:vrender: texture available @" + surfaceTexture + "id " + getID() + CommonConstant.Symbol.UNDERLINE + this.j);
        this.f = i;
        this.g = i2;
        if (this.e != null) {
            this.e.a(this.f, this.g);
        }
        if (this.b != null) {
            if (Build.VERSION.SDK_INT >= 16 && this.d.getSurfaceTexture() != this.b) {
                this.d.setSurfaceTexture(this.b);
            }
            this.b = null;
        } else {
            a(surfaceTexture);
        }
        this.B = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TXCLog.w("TXCVideoRender", "play:vrender: texture size change new:" + i + CommonConstant.Symbol.COMMA + i2 + " old:" + this.f + CommonConstant.Symbol.COMMA + this.g);
        if (!this.B) {
            TXCLog.w("TXCVideoRender", "play:vrender: onSurfaceCreate on onSurfaceTextureSizeChanged when onSurfaceTextureAvailable is not trigger");
            this.B = true;
            a(surfaceTexture);
        }
        this.f = i;
        this.g = i2;
        if (this.e != null) {
            this.e.a(this.f, this.g);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        try {
            this.B = false;
            TXCLog.w("TXCVideoRender", "play:vrender:  onSurfaceTextureDestroyed when need save texture : " + this.E + "id " + getID() + CommonConstant.Symbol.UNDERLINE + this.j);
            if (this.E) {
                this.b = surfaceTexture;
            } else {
                this.F.a = 0L;
                b(surfaceTexture);
                if (surfaceTexture == this.b) {
                    this.b = null;
                }
            }
        } catch (Exception e) {
            TXCLog.e("TXCVideoRender", "onSurfaceTextureDestroyed failed.", e);
        }
        return this.b == null;
    }

    private void b(Surface surface) {
        TXCLog.i("TXCVideoRender", "surface-render: set surface " + surface);
        if (this.s == surface) {
            TXCLog.i("TXCVideoRender", "surface-render: set the same surface, ignore ");
            return;
        }
        this.s = surface;
        this.l = 1;
        if (surface != null) {
            TXCLog.i("TXCVideoRender", "surface-render: set surface start render thread " + surface);
            c((Object) null);
            return;
        }
        synchronized (this) {
            if (this.q != null) {
                TXCLog.i("TXCVideoRender", "surface-render: set surface stop render thread " + this.q);
                this.q.a();
                this.q = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        synchronized (this) {
            if (this.q != null) {
                TXCLog.i("TXCVideoRender", "surface-render: onRenderThreadEGLDestroy stop render thread " + this.q);
                this.q.a();
                this.q = null;
            }
        }
        if (this.r != null) {
            this.r.c();
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Object obj, int i, float[] fArr, boolean z) {
        Surface b;
        if (this.l == 1) {
            int[] a2 = a(i, this.h, this.i, fArr, z);
            int i2 = a2[0];
            int i3 = a2[1];
            int i4 = a2[2];
            System.arraycopy(a2, 0, this.v, 0, 3);
            if (z) {
                this.v[3] = 1;
                this.v[4] = 180;
            } else {
                this.v[3] = 0;
                this.v[4] = 0;
            }
            synchronized (this) {
                Surface surface = this.s;
                if (surface != null) {
                    if (this.q != null && ((b = this.q.b()) != surface || (b != null && !b.isValid()))) {
                        TXCLog.i("TXCVideoRender", "surface-render: onDrawTextureToSurface surface change stop render thread " + this.q + ", " + b + ", " + surface);
                        this.q.a();
                        this.q = null;
                    }
                    if (this.q == null && this.l == 1 && surface.isValid()) {
                        this.q = new com.tencent.liteav.basic.opengl.g();
                        TXCLog.i("TXCVideoRender", "surface-render: onDrawTextureToSurface start render thread " + this.q + CommonConstant.Symbol.COMMA + surface);
                        this.q.a(obj, surface);
                    }
                    if (this.q != null && this.l == 1) {
                        if (z) {
                            this.q.a(i2, true, TXLiveConstants.RENDER_ROTATION_180, this.m, this.n, i3, i4, false, false);
                        } else {
                            this.q.a(i2, false, 0, this.m, this.n, i3, i4, false, false);
                        }
                    }
                } else if (this.q != null) {
                    TXCLog.i("TXCVideoRender", "surface-render: onDrawTextureToSurface stop render thread " + this.q);
                    this.q.a();
                    this.q = null;
                }
            }
        }
    }

    private int[] a(int i, int i2, int i3, float[] fArr, boolean z) {
        if (this.r != null && this.r.a() != z) {
            this.r.c();
            this.r = null;
        }
        if (this.r == null) {
            this.r = new i(Boolean.valueOf(z));
            this.r.b();
        }
        if (fArr != null) {
            this.r.a(fArr);
        } else {
            this.r.a(a);
        }
        int i4 = this.m;
        int i5 = this.n;
        if (this.u == 0) {
            this.r.a(i.a);
        } else {
            this.r.a(i.b);
        }
        int i6 = (this.t + this.k) % 360;
        if (z && (this.t == 90 || this.t == 270)) {
            i6 = ((this.t + this.k) + TXLiveConstants.RENDER_ROTATION_180) % 360;
        }
        this.r.b(i6);
        this.r.b(i2, i3);
        this.r.a(i4, i5);
        return new int[]{this.r.d(i), i4, i5};
    }

    public void d(final int i, final int i2) {
        TXCLog.i("TXCVideoRender", "surface-render: set setSurfaceSize " + i + "*" + i2);
        if (i == this.m && i2 == this.n) {
            return;
        }
        if (this.q != null && this.l == 1 && this.v != null) {
            this.q.a(new Runnable() { // from class: com.tencent.liteav.renderer.f.3
                @Override // java.lang.Runnable
                public void run() {
                    f.this.m = i;
                    f.this.n = i2;
                    if (f.this.q != null) {
                        f.this.q.a(f.this.v[0], f.this.v[3] == 1, f.this.v[4], f.this.m, f.this.n, f.this.v[1], f.this.v[2], true, false);
                    }
                }
            });
            return;
        }
        this.m = i;
        this.n = i2;
    }

    public a l() {
        return this.F;
    }

    public void m() {
        n();
        this.F.b = 0L;
        this.F.c = 0L;
        this.F.e = 0L;
        this.F.f = 0L;
        this.F.g = 0L;
        this.F.h = 0L;
        this.F.i = 0L;
        this.F.l = 0L;
        this.A = 0L;
        setStatusValue(6001, this.j, 0L);
        setStatusValue(6003, this.j, 0L);
        setStatusValue(6005, this.j, 0L);
        setStatusValue(6006, this.j, 0L);
        setStatusValue(6004, this.j, 0L);
        setStatusValue(6020, this.j, 0L);
    }

    public void n() {
        this.F.a = 0L;
        this.F.d = 0L;
        this.F.j = 0L;
        this.F.m = 0;
        this.F.n = 0;
        setStatusValue(6002, this.j, Double.valueOf(0.0d));
        setStatusValue(17021, this.j, 0);
        setStatusValue(17022, this.j, 0);
    }

    private long a(long j) {
        long timeTick = TXCTimeUtil.getTimeTick();
        if (j > timeTick) {
            return 0L;
        }
        return timeTick - j;
    }

    public void o() {
        double d;
        if (this.F.a == 0) {
            this.F.a = TXCTimeUtil.getTimeTick();
            return;
        }
        long timeTick = TXCTimeUtil.getTimeTick() - this.F.a;
        if (timeTick >= 950) {
            setStatusValue(6002, this.j, Double.valueOf(((this.F.c - this.F.b) * 1000.0d) / timeTick));
            TXCKeyPointReportProxy.a(getID(), RequestIDMap.OP_TYPE_TAG.OP_TYPE_UPDATE_PAGE_NAME, (int) d, this.j);
            this.F.b = this.F.c;
            this.F.a += timeTick;
        }
    }

    private void b() {
        if (!this.D) {
            Bundle bundle = new Bundle();
            bundle.putString(TXCAVRoomConstants.EVT_USERID, getID());
            bundle.putInt(TXCAVRoomConstants.EVT_ID, 2003);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            bundle.putCharSequence("EVT_MSG", "Render the first video frame(IDR)");
            bundle.putInt("EVT_PARAM1", this.h);
            bundle.putInt("EVT_PARAM2", this.i);
            com.tencent.liteav.basic.util.g.a(this.p, 2003, bundle);
            setStatusValue(6001, this.j, Long.valueOf(TXCTimeUtil.getTimeTick()));
            setStatusValue(17021, this.j, Integer.valueOf(this.h));
            setStatusValue(17022, this.j, Integer.valueOf(this.i));
            TXCLog.i("TXCVideoRender", "trtc_render render first frame " + getID() + ", " + this.j);
            this.D = true;
            Monitor.a(2, String.format("Remote-VideoRender[%d]: Render first frame [tinyID:%s][streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.j)), "streamType: 2-big, 3-small, 7-sub", 0);
            TXCKeyPointReportProxy.a(getID(), 40022, 0L, this.j);
        }
        this.F.c++;
        o();
        if (this.F.d != 0) {
            this.F.j = a(this.F.d);
            this.F.l += this.F.j;
            if (this.F.j > 200) {
                this.F.e++;
                setStatusValue(6021, this.j, Long.valueOf(this.F.e));
            }
            if (this.F.j > this.w) {
                this.F.f++;
                setStatusValue(6003, this.j, Long.valueOf(this.F.f));
                if (this.F.j > this.F.i) {
                    this.F.i = this.F.j;
                    setStatusValue(6005, this.j, Long.valueOf(this.F.i));
                }
                TXCLog.w("TXCVideoRender", "render frame count:" + this.F.c + " block time:" + this.F.j + "> 500");
            }
            if (this.F.j > this.c) {
                this.x++;
                this.z += this.F.j;
                TXCLog.w("TXCVideoRender", "render frame count:" + this.F.c + " block time:" + this.F.j + "> " + this.c);
                WeakReference<com.tencent.liteav.basic.c.b> weakReference = this.p;
                String id = getID();
                StringBuilder sb = new StringBuilder("Current video playback stuck for ");
                sb.append(this.F.j);
                sb.append("ms");
                com.tencent.liteav.basic.util.g.a(weakReference, id, 2105, sb.toString(), this.F.j);
                this.F.h += this.F.j;
                setStatusValue(6006, this.j, Long.valueOf(this.F.h));
            }
            if (this.F.j > 1000) {
                this.F.g++;
                setStatusValue(6004, this.j, Long.valueOf(this.F.g));
                TXCLog.w("TXCVideoRender", "render frame count:" + this.F.c + " block time:" + this.F.j + "> 1000");
            }
        }
        long timeTick = TXCTimeUtil.getTimeTick();
        if (this.y == 0) {
            this.y = timeTick;
        } else if (timeTick - this.y >= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
            setStatusValue(17015, this.j, Long.valueOf(this.x));
            setStatusValue(17016, this.j, Long.valueOf(this.z));
            if (this.A != 0) {
                TXCKeyPointReportProxy.a(getID(), RequestIDMap.OP_TYPE_TAG.OP_TYPE_CLEAR_TAG, (int) this.z, this.j);
                TXCKeyPointReportProxy.a(getID(), RequestIDMap.OP_TYPE_TAG.OP_TYPE_CLEAR_CONTAINER_TAG, (int) (timeTick - this.y), this.j);
                setStatusValue(6020, this.j, Long.valueOf(this.F.l));
            }
            this.x = 0L;
            this.y = timeTick;
            this.z = 0L;
        }
        this.F.d = TXCTimeUtil.getTimeTick();
        if (this.A == 0) {
            this.A = this.F.d;
        }
        this.F.n = this.i;
        this.F.m = this.h;
    }
}
