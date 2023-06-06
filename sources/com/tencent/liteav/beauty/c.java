package com.tencent.liteav.beauty;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.basic.opengl.k;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.b.aj;
import com.tencent.liteav.beauty.b.l;
import com.tencent.liteav.beauty.b.m;
import com.tencent.liteav.beauty.b.p;
import com.tencent.liteav.beauty.b.r;
import com.tencent.liteav.beauty.b.s;
import com.tencent.liteav.beauty.b.u;
import com.tencent.liteav.beauty.b.w;
import com.tencent.liteav.beauty.e;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends HandlerThread {
    private int A;
    private Context B;
    private boolean C;
    private boolean D;
    private e.C1448e E;
    private e.f F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private float M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private float[] R;
    private boolean S;
    private int T;
    private int U;
    private com.tencent.liteav.basic.opengl.a V;
    private Bitmap W;
    private p X;
    private w Y;
    private com.tencent.liteav.beauty.b.b Z;
    boolean a;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private boolean aE;
    private com.tencent.liteav.beauty.a.a.c aF;
    private com.tencent.liteav.beauty.a.a.a aG;
    private Bitmap aH;
    private List<e.f> aI;
    private long aJ;
    private int aK;
    private final int aL;
    private final float aM;
    private byte[] aN;
    private int[] aO;
    private boolean aP;
    private byte[] aQ;
    private int aR;
    private int aS;
    private int aT;
    private int aU;
    private f aV;
    private WeakReference<com.tencent.liteav.basic.c.b> aW;
    private com.tencent.liteav.beauty.b.a aX;
    private final com.tencent.liteav.basic.util.c aY;
    private TXCOpenGlUtils.b aZ;
    private com.tencent.liteav.beauty.b.a.a aa;
    private com.tencent.liteav.beauty.b.b.a ab;
    private com.tencent.liteav.beauty.b.c ac;
    private com.tencent.liteav.beauty.b.c.a ad;
    private Bitmap ae;
    private Bitmap af;
    private float ag;
    private float ah;
    private float ai;
    private s aj;
    private u ak;
    private aj al;
    private m am;
    private l an;
    private j ao;
    private r ap;
    private k aq;
    private j ar;
    private final Queue<Runnable> as;
    private boolean at;
    private Object au;
    private Object av;
    private Handler aw;
    private a ax;
    private float ay;
    private int az;
    protected int[] b;
    protected int[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public void a(int i) {
    }

    public void a(String str) {
    }

    public void a(String str, boolean z) {
    }

    public void b(boolean z) {
    }

    public void h(int i) {
    }

    public void i(int i) {
    }

    public void j(int i) {
    }

    public void k(int i) {
    }

    public void l(int i) {
    }

    public void m(int i) {
    }

    public void n(int i) {
    }

    public void o(int i) {
    }

    public void p(int i) {
    }

    public void q(int i) {
    }

    public void r(int i) {
    }

    public void s(int i) {
    }

    public void t(int i) {
    }

    public void u(int i) {
    }

    public void v(int i) {
    }

    public void w(int i) {
    }

    public void x(int i) {
    }

    public void y(int i) {
    }

    public void z(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, boolean z) {
        super("TXCFilterDrawer");
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = null;
        this.C = true;
        this.D = false;
        this.E = new e.C1448e();
        this.F = null;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = 1.0f;
        this.N = -1;
        this.O = -1;
        this.P = 1;
        this.Q = false;
        this.R = null;
        this.S = false;
        this.T = 0;
        this.U = 0;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.aa = null;
        this.ab = null;
        this.ac = null;
        this.ad = null;
        this.ak = null;
        this.al = null;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.aq = null;
        this.ar = null;
        this.as = new LinkedList();
        this.a = false;
        this.au = new Object();
        this.av = new Object();
        this.ay = 0.5f;
        this.az = 0;
        this.aA = 0;
        this.aB = 0;
        this.aC = 0;
        this.aD = 0;
        this.aE = false;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = null;
        this.aJ = 0L;
        this.aK = 0;
        this.aL = 100;
        this.aM = 1000.0f;
        this.aN = null;
        this.aO = null;
        this.aP = false;
        this.aQ = null;
        this.b = null;
        this.c = null;
        this.aR = -1;
        this.aS = 0;
        this.aT = 1;
        this.aU = this.aR;
        this.aV = null;
        this.aW = new WeakReference<>(null);
        this.aX = new com.tencent.liteav.beauty.b.a();
        this.aZ = new TXCOpenGlUtils.b() { // from class: com.tencent.liteav.beauty.c.14
        };
        this.B = context;
        this.aw = new Handler(this.B.getMainLooper());
        this.at = z;
        this.aY = new com.tencent.liteav.basic.util.c("filter-drawer", (int) TimeUnit.SECONDS.toMillis(5L));
    }

    public synchronized boolean a(e.b bVar) {
        boolean z;
        z = true;
        if (!bVar.j) {
            if (this.ax == null) {
                start();
                this.ax = new a(getLooper(), this.B);
            }
            this.ax.obtainMessage(0, bVar).sendToTarget();
            this.ax.b();
        } else {
            z = c(bVar);
        }
        return z;
    }

    public int a(int i, int i2, long j) {
        int willAddWatermark;
        this.aY.a();
        a(this.as);
        boolean z = this.M != 1.0f;
        GLES20.glViewport(0, 0, this.K, this.L);
        if (this.ap != null) {
            if (4 == i2 || true == this.S) {
                this.ap.a(this.R);
                this.ap.c(this.S);
            }
            i = this.ap.a(i);
        }
        if (this.Z != null) {
            this.Z.f(Math.min(this.N, this.O) < 540 ? 0 : this.aC);
            if (this.aA > 0 || this.aB > 0 || this.aD > 0) {
                i = this.Z.a(i);
            }
        }
        if (this.aj != null) {
            i = this.aj.a(i);
        }
        GLES20.glViewport(0, 0, this.I, this.J);
        if (this.am != null) {
            i = this.am.a(i);
            z = false;
        }
        if (this.an != null) {
            i = this.an.a(i);
            z = false;
        }
        if (z) {
            b(this.I, this.J);
            if (this.ar != null) {
                GLES20.glViewport(0, 0, this.I, this.J);
                i = this.ar.a(i);
            }
        }
        if (this.aV != null && (willAddWatermark = this.aV.willAddWatermark(i, this.I, this.J)) > 0) {
            i = willAddWatermark;
        }
        GLES20.glViewport(0, 0, this.I, this.J);
        if (this.al != null) {
            i = this.al.a(i);
        }
        if (this.ao != null) {
            GLES20.glViewport(0, 0, this.N, this.O);
            i = this.ao.a(i);
        }
        a(i, j);
        return i;
    }

    public int a(byte[] bArr, int i) {
        a(bArr);
        if (!this.at) {
            byte[] bArr2 = (byte[]) bArr.clone();
            this.ax.obtainMessage(2, bArr2).sendToTarget();
            if (!this.aP) {
                TXCLog.i("TXCFilterDrawer", "First Frame, clear queue");
                NativeLoad.nativeClearQueue();
            }
            this.ax.obtainMessage(3, i, 0).sendToTarget();
            a(bArr2, this.aP);
            this.aP = true;
            return -1;
        }
        b(bArr);
        return A(i);
    }

    public void a(final float f) {
        this.ay = f;
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.aj != null) {
                    c.this.aj.a(f);
                }
            }
        });
    }

    public void a(final float[] fArr) {
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.7
            @Override // java.lang.Runnable
            public void run() {
                c.this.R = fArr;
            }
        });
    }

    public void a(final boolean z) {
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.9
            @Override // java.lang.Runnable
            public void run() {
                c.this.S = z;
            }
        });
    }

    private void a(com.tencent.liteav.basic.opengl.a aVar, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (this.ap == null) {
            TXCLog.i("TXCFilterDrawer", "Create CropFilter");
            if (4 == i6) {
                this.ap = new r("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", true);
            } else {
                this.ap = new r();
            }
            if (true == this.ap.c()) {
                this.ap.a(true);
            } else {
                TXCLog.e("TXCFilterDrawer", "mInputCropFilter init failed!");
            }
        }
        int i7 = i4;
        this.ap.a(i3, i7);
        float[] a2 = this.ap.a(this.G, this.H, null, aVar, i6);
        int i8 = (720 - i5) % 360;
        int i9 = (i8 == 90 || i8 == 270) ? i7 : i3;
        if (i8 == 90 || i8 == 270) {
            i7 = i3;
        }
        this.ap.a(i, i2, i8, a2, i9 / i7, z, false);
    }

    private void a(int i, int i2, int i3, int i4, int i5) {
        synchronized (this.av) {
            int i6 = (i5 + 360) % 360;
            TXCLog.i("TXCFilterDrawer", "real outputAngle " + i6);
            if (this.ao == null) {
                if (i == i3 && i2 == i4 && i6 == 0) {
                    TXCLog.i("TXCFilterDrawer", "Don't need change output Image, don't create out filter!");
                    return;
                }
                this.ao = new j();
                if (true == this.ao.c()) {
                    this.ao.a(true);
                } else {
                    TXCLog.e("TXCFilterDrawer", "mOutputZoomFilter init failed!");
                }
            }
            this.ao.a(i3, i4);
            this.ao.a((720 - i6) % 360, (FloatBuffer) null);
        }
    }

    public void a(final Bitmap bitmap, final float f, final float f2, final float f3) {
        if (this.F == null) {
            this.F = new e.f();
        }
        if (TXCCommonUtil.equals(this.F.a, bitmap) && f == this.F.b && f2 == this.F.c && f3 == this.F.d && this.al != null) {
            return;
        }
        this.F.a = bitmap;
        this.F.b = f;
        this.F.c = f2;
        this.F.d = f3;
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.11
            @Override // java.lang.Runnable
            public void run() {
                if (bitmap != null) {
                    com.tencent.liteav.beauty.a.a().g();
                }
                if (bitmap == null) {
                    if (c.this.al != null) {
                        c.this.al.e();
                        c.this.al = null;
                        return;
                    }
                    return;
                }
                if (c.this.al == null) {
                    if (c.this.I <= 0 || c.this.J <= 0) {
                        TXCLog.e("TXCFilterDrawer", "output Width and Height is error!");
                        return;
                    }
                    c.this.al = new aj();
                    c.this.al.a(true);
                    if (c.this.al.c()) {
                        c.this.al.a(c.this.I, c.this.J);
                    } else {
                        TXCLog.e("TXCFilterDrawer", "mWatermarkFilter.init failed!");
                        c.this.al.e();
                        c.this.al = null;
                        return;
                    }
                }
                c.this.al.d(true);
                c.this.al.a(bitmap, f, f2, f3);
            }
        });
    }

    public void a(final List<e.f> list) {
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.12
            @Override // java.lang.Runnable
            public void run() {
                c.this.aI = list;
                if ((list == null || list.size() == 0) && c.this.aH == null && c.this.al != null) {
                    c.this.al.e();
                    c.this.al = null;
                } else if (list == null || list.size() == 0) {
                } else {
                    if (c.this.al == null) {
                        if (c.this.I <= 0 || c.this.J <= 0) {
                            Log.e("TXCFilterDrawer", "output Width and Height is error!");
                            return;
                        }
                        c.this.al = new aj();
                        c.this.al.a(true);
                        if (c.this.al.c()) {
                            c.this.al.a(c.this.I, c.this.J);
                        } else {
                            Log.e("TXCFilterDrawer", "mWatermarkFilter.init failed!");
                            c.this.al.e();
                            c.this.al = null;
                            return;
                        }
                    }
                    c.this.al.d(true);
                    c.this.al.a(list);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar) {
        TXCLog.i("TXCFilterDrawer", "set listener");
        this.aV = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.tencent.liteav.basic.c.b bVar) {
        TXCLog.i("TXCFilterDrawer", "set notify");
        this.aW = new WeakReference<>(bVar);
        if (this.am != null) {
            this.am.a(this.aW.get());
        }
    }

    private int a(int i, long j) {
        if (this.U == 0) {
            if (this.aV != null) {
                if (j == 0) {
                    j = TXCTimeUtil.generatePtsMS();
                }
                this.aV.didProcessFrame(i, this.N, this.O, j);
            }
            return i;
        } else if (1 == this.U || 3 == this.U || 2 == this.U) {
            GLES20.glViewport(0, 0, this.N, this.O);
            if (this.Y == null) {
                TXCLog.e("TXCFilterDrawer", "mRGBA2I420Filter is null!");
                return i;
            }
            GLES20.glBindFramebuffer(36160, this.b[0]);
            this.Y.b(i);
            if (2 == this.U) {
                a(this.N, this.O);
            } else {
                a(this.N, (this.O * 3) / 8);
            }
            GLES20.glBindFramebuffer(36160, 0);
            return i;
        } else {
            TXCLog.e("TXCFilterDrawer", "Don't support format!");
            return -1;
        }
    }

    private int a(int i, int i2) {
        if (true == this.at) {
            if (this.aV != null) {
                NativeLoad.nativeGlReadPixs(i, i2, this.aN);
                this.aV.didProcessFrame(this.aN, this.N, this.O, this.U, TXCTimeUtil.generatePtsMS());
            } else if (this.aQ != null) {
                NativeLoad.nativeGlReadPixs(i, i2, this.aQ);
            }
        } else if (3 == TXCOpenGlUtils.a()) {
            if (0 == this.aJ) {
                this.aJ = TXCTimeUtil.getTimeTick();
            }
            int i3 = this.aK + 1;
            this.aK = i3;
            if (i3 >= 100) {
                TXCLog.i("TXCFilterDrawer", "Real fps " + (100.0f / (((float) (TXCTimeUtil.getTimeTick() - this.aJ)) / 1000.0f)));
                this.aK = 0;
                this.aJ = TXCTimeUtil.getTimeTick();
            }
            GLES30.glPixelStorei(3333, 1);
            if (Build.VERSION.SDK_INT >= 18) {
                GLES30.glReadBuffer(TXLiteAVCode.EVT_LOCAL_RECORD_RESULT);
            }
            GLES30.glBindBuffer(35051, this.aO[0]);
            ByteBuffer byteBuffer = null;
            NativeLoad.nativeGlReadPixs(i, i2, null);
            if (Build.VERSION.SDK_INT >= 18 && (byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, i * i2 * 4, 1)) == null) {
                TXCLog.e("TXCFilterDrawer", "glMapBufferRange is null");
                return -1;
            }
            NativeLoad.nativeGlMapBufferToQueue(i, i2, byteBuffer);
            if (Build.VERSION.SDK_INT >= 18) {
                GLES30.glUnmapBuffer(35051);
            }
            GLES30.glBindBuffer(35051, 0);
        } else {
            NativeLoad.nativeGlReadPixsToQueue(i, i2);
        }
        return 0;
    }

    public void b(final int i) {
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.13
            @Override // java.lang.Runnable
            public void run() {
                c.this.U = i;
            }
        });
    }

    private void a(byte[] bArr, boolean z) {
        if (!z) {
            if (this.aV != null) {
                this.aV.didProcessFrame(bArr, this.N, this.O, this.U, TXCTimeUtil.generatePtsMS());
                return;
            } else {
                TXCLog.i("TXCFilterDrawer", "First Frame, don't process!");
                return;
            }
        }
        int i = (this.O * 3) / 8;
        if (2 == this.U) {
            i = this.O;
        }
        if (this.aV != null) {
            if (true == NativeLoad.nativeGlReadPixsFromQueue(this.N, i, this.aN)) {
                this.aV.didProcessFrame(this.aN, this.N, this.O, this.U, TXCTimeUtil.generatePtsMS());
                return;
            }
            TXCLog.d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
            this.aV.didProcessFrame(bArr, this.N, this.O, this.U, TXCTimeUtil.generatePtsMS());
        } else if (NativeLoad.nativeGlReadPixsFromQueue(this.N, i, this.aQ)) {
        } else {
            TXCLog.d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A(int i) {
        GLES20.glViewport(0, 0, this.G, this.H);
        return a(this.X.r(), i, 0L);
    }

    public void a(byte[] bArr) {
        this.aQ = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(byte[] bArr) {
        if (this.X == null) {
            TXCLog.e("TXCFilterDrawer", "mI4202RGBAFilter is null!");
        } else {
            this.X.a(bArr);
        }
    }

    public void a() {
        if (!this.at) {
            if (this.ax != null) {
                this.ax.obtainMessage(1).sendToTarget();
                try {
                    this.aX.b();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        TXCLog.i("TXCFilterDrawer", "come into releaseInternal");
        this.aP = false;
        if (this.X != null) {
            this.X.e();
            this.X = null;
        }
        if (this.Y != null) {
            this.Y.e();
            this.Y = null;
        }
        c();
        if (this.aj != null) {
            this.aj.e();
            this.aj = null;
        }
        if (this.ak != null) {
            this.ak.a();
            this.ak = null;
        }
        if (this.aq != null) {
            this.aq.e();
            this.aq = null;
        }
        if (this.ap != null) {
            this.ap.e();
            this.ap = null;
        }
        if (this.ao != null) {
            this.ao.e();
            this.ao = null;
        }
        if (this.al != null) {
            this.al.e();
            this.al = null;
        }
        if (this.am != null) {
            this.am.a();
            this.am = null;
        }
        if (this.an != null) {
            this.an.e();
            this.an = null;
        }
        if (this.ar != null) {
            this.ar.e();
            this.ar = null;
        }
        if (this.b != null) {
            GLES20.glDeleteFramebuffers(1, this.b, 0);
            this.b = null;
        }
        if (this.c != null) {
            GLES20.glDeleteTextures(1, this.c, 0);
            this.c = null;
        }
        if (this.aO != null && this.aO[0] > 0) {
            GLES30.glDeleteBuffers(1, this.aO, 0);
            this.aO = null;
        }
        TXCLog.i("TXCFilterDrawer", "come out releaseInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(e.b bVar) {
        TXCLog.i("TXCFilterDrawer", "come into initInternal");
        b();
        this.at = bVar.j;
        this.G = bVar.d;
        this.H = bVar.e;
        this.V = bVar.m;
        int i = bVar.g;
        int i2 = bVar.f;
        int i3 = bVar.h;
        this.Q = bVar.i;
        this.N = bVar.b;
        this.O = bVar.c;
        int i4 = bVar.a;
        this.I = bVar.g;
        this.J = bVar.f;
        if (i3 == 90 || i3 == 270) {
            this.I = bVar.f;
            this.J = bVar.g;
        }
        this.U = bVar.l;
        this.T = bVar.k;
        this.aN = new byte[this.N * this.O * 4];
        TXCLog.i("TXCFilterDrawer", "processWidth mPituScaleRatio is %f, process size: %d x %d", Float.valueOf(this.M), Integer.valueOf(this.I), Integer.valueOf(this.J));
        if (this.M != 1.0f) {
            int i5 = this.I < this.J ? this.I : this.J;
            if (i5 > 368) {
                this.M = 432.0f / i5;
            }
            if (this.M > 1.0f) {
                this.M = 1.0f;
            }
        }
        this.K = (int) (this.I * this.M);
        this.L = (int) (this.J * this.M);
        a(this.K, this.L, this.az);
        if (this.F != null && this.F.a != null && this.al == null) {
            TXCLog.i("TXCFilterDrawer", "reset water mark!");
            a(this.F.a, this.F.b, this.F.c, this.F.d);
        }
        if ((this.ae != null || this.af != null) && this.aj == null) {
            a(this.K, this.L, this.ag, this.ae, this.ah, this.af, this.ai);
        }
        a(this.V, i, i2, this.K, this.L, this.Q, i3, this.T);
        a(this.I, this.J, this.N, this.O, i4);
        if (this.b == null) {
            this.b = new int[1];
        } else {
            GLES20.glDeleteFramebuffers(1, this.b, 0);
        }
        if (this.c == null) {
            this.c = new int[1];
        } else {
            GLES20.glDeleteTextures(1, this.c, 0);
        }
        a(this.b, this.c, this.N, this.O);
        if (3 == TXCOpenGlUtils.a()) {
            if (this.aO == null) {
                this.aO = new int[1];
            } else {
                TXCLog.i("TXCFilterDrawer", "m_pbo0 is not null, delete Buffers, and recreate");
                GLES30.glDeleteBuffers(1, this.aO, 0);
            }
            TXCLog.i("TXCFilterDrawer", "opengl es 3.0, use PBO");
            TXCOpenGlUtils.a(i, i2, this.aO);
        }
        TXCLog.i("TXCFilterDrawer", "come out initInternal");
        return true;
    }

    public boolean b(e.b bVar) {
        if (!this.at) {
            if (this.ax == null) {
                TXCLog.e("TXCFilterDrawer", "mThreadHandler is null!");
                return false;
            }
            this.ax.obtainMessage(5, 0, 0, bVar).sendToTarget();
            return true;
        }
        d(bVar);
        return true;
    }

    private void a(int[] iArr, int[] iArr2, int i, int i2) {
        GLES20.glGenFramebuffers(1, iArr, 0);
        iArr2[0] = TXCOpenGlUtils.a(i, i2, 6408, 6408, iArr2);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(e.b bVar) {
        if ((1 == bVar.k || 3 == bVar.k || 2 == bVar.k) && this.X == null) {
            this.X = new p(bVar.k);
            this.X.a(true);
            if (!this.X.c()) {
                TXCLog.e("TXCFilterDrawer", "mI4202RGBAFilter init failed!!, break init");
                return false;
            }
            this.X.a(bVar.d, bVar.e);
        }
        if ((1 == bVar.l || 3 == bVar.l || 2 == bVar.l) && this.Y == null) {
            this.Y = new w(bVar.l);
            if (!this.Y.c()) {
                TXCLog.e("TXCFilterDrawer", "mRGBA2I420Filter init failed!!, break init");
                return false;
            }
            this.Y.a(bVar.b, bVar.c);
        }
        return true;
    }

    public void c(final int i) {
        this.aA = i;
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.15
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    com.tencent.liteav.beauty.a.a().b();
                }
                if (c.this.Z == null || i < 0) {
                    return;
                }
                c.this.Z.c(i);
            }
        });
    }

    public void d(final int i) {
        if (this.az == i || i > 3 || i < 0) {
            return;
        }
        this.az = i;
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.2
            @Override // java.lang.Runnable
            public void run() {
                c.this.a(c.this.K, c.this.L, i);
            }
        });
    }

    public void e(final int i) {
        this.aB = i;
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.3
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    com.tencent.liteav.beauty.a.a().c();
                }
                if (c.this.Z == null || i < 0) {
                    return;
                }
                c.this.Z.d(i);
            }
        });
    }

    public void f(final int i) {
        this.aC = i;
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.4
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    com.tencent.liteav.beauty.a.a().f();
                }
                if (c.this.Z == null || i < 0) {
                    return;
                }
                c.this.Z.f(i);
            }
        });
    }

    public void g(final int i) {
        this.aD = i;
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.5
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    com.tencent.liteav.beauty.a.a().d();
                }
                if (c.this.Z == null || i < 0) {
                    return;
                }
                c.this.Z.e(i);
            }
        });
    }

    public void a(Bitmap bitmap) {
        a(1.0f, bitmap, this.ay, (Bitmap) null, 0.0f);
    }

    public void a(final float f, final Bitmap bitmap, final float f2, final Bitmap bitmap2, final float f3) {
        if (this.ae != bitmap || this.af != bitmap2) {
            this.ae = bitmap;
            this.af = bitmap2;
            this.ag = f;
            this.ah = f2;
            this.ai = f3;
            a(new Runnable() { // from class: com.tencent.liteav.beauty.c.6
                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.aj != null) {
                        com.tencent.liteav.beauty.a.a().e();
                    }
                    if (c.this.ae != null || c.this.af != null) {
                        if (c.this.aj == null) {
                            c.this.a(c.this.K, c.this.L, c.this.ag, c.this.ae, c.this.ah, c.this.af, c.this.ai);
                        } else {
                            c.this.aj.a(f, bitmap, f2, bitmap2, f3);
                        }
                    } else if (c.this.aj != null) {
                        c.this.aj.e();
                        c.this.aj = null;
                    }
                }
            });
        } else if (this.aj != null) {
            if (this.ag == f && this.ah == f2 && this.ai == f3) {
                return;
            }
            this.ag = f;
            this.ah = f2;
            this.ai = f3;
            a(new Runnable() { // from class: com.tencent.liteav.beauty.c.8
                @Override // java.lang.Runnable
                public void run() {
                    c.this.aj.a(f, f2, f3);
                }
            });
        }
    }

    public void b(final float f) {
        a(new Runnable() { // from class: com.tencent.liteav.beauty.c.10
            @Override // java.lang.Runnable
            public void run() {
                if (f <= 0.0f) {
                    if (c.this.an != null) {
                        c.this.an.e();
                        c.this.an = null;
                        return;
                    }
                } else if (c.this.an == null) {
                    c.this.an = new l();
                    c.this.an.a(true);
                    if (c.this.an.c()) {
                        c.this.an.a(c.this.I, c.this.J);
                    } else {
                        TXCLog.e("TXCFilterDrawer", "Gaussian Filter init failed!");
                        return;
                    }
                }
                if (c.this.an != null) {
                    c.this.an.a(f / 4.0f);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, int i3) {
        TXCLog.i("TXCFilterDrawer", "create Beauty Filter!");
        if (i3 == 0) {
            if (this.aa == null) {
                this.aa = new com.tencent.liteav.beauty.b.a.a();
            }
            this.Z = this.aa;
        } else if (1 == i3) {
            if (this.ab == null) {
                this.ab = new com.tencent.liteav.beauty.b.b.a();
            }
            this.Z = this.ab;
        } else if (2 == i3) {
            if (this.ad == null) {
                this.ad = new com.tencent.liteav.beauty.b.c.a();
            }
            this.Z = this.ad;
        } else if (3 == i3) {
            if (this.ac == null) {
                this.ac = new com.tencent.liteav.beauty.b.c();
            }
            this.Z = this.ac;
        }
        if (this.Z == null) {
            TXCLog.e("TXCFilterDrawer", "mBeautyFilter set error!");
            return;
        }
        this.Z.a(true);
        if (true == this.Z.c(i, i2)) {
            if (this.aA > 0) {
                this.Z.c(this.aA);
            }
            if (this.aB > 0) {
                this.Z.d(this.aB);
            }
            if (this.aD > 0) {
                this.Z.e(this.aD);
            }
            if (this.aC > 0) {
                this.Z.f(this.aC);
                return;
            }
            return;
        }
        TXCLog.e("TXCFilterDrawer", "mBeautyFilter init failed!");
    }

    private void c() {
        if (this.aa != null) {
            this.aa.e();
            this.aa = null;
        }
        if (this.ab != null) {
            this.ab.e();
            this.ab = null;
        }
        if (this.ac != null) {
            this.ac.e();
            this.ac = null;
        }
        if (this.ad != null) {
            this.ad.e();
            this.ad = null;
        }
        this.Z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        if (this.aj == null) {
            TXCLog.i("TXCFilterDrawer", "createComLooKupFilter");
            this.aj = new s(f, bitmap, f2, bitmap2, f3);
            if (true == this.aj.c()) {
                this.aj.a(true);
                this.aj.a(i, i2);
                return;
            }
            TXCLog.e("TXCFilterDrawer", "mLookupFilterGroup init failed!");
        }
    }

    private void b(int i, int i2) {
        if (this.ar == null) {
            TXCLog.i("TXCFilterDrawer", "createRecoverScaleFilter");
            this.ar = new j();
            if (true == this.ar.c()) {
                this.ar.a(true);
            } else {
                TXCLog.e("TXCFilterDrawer", "mRecoverScaleFilter init failed!");
            }
        }
        if (this.ar != null) {
            this.ar.a(i, i2);
        }
    }

    private void a(Runnable runnable) {
        synchronized (this.as) {
            this.as.add(runnable);
        }
    }

    private void a(Queue<Runnable> queue) {
        Runnable poll;
        while (true) {
            synchronized (queue) {
                poll = queue.isEmpty() ? null : queue.poll();
            }
            if (poll == null) {
                return;
            }
            poll.run();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends Handler {
        private String b;

        a(Looper looper, Context context) {
            super(looper);
            this.b = "EGLDrawThreadHandler";
        }

        private void a(Object obj) {
            TXCLog.i(this.b, "come into InitEGL");
            e.b bVar = (e.b) obj;
            a();
            c.this.aG = new com.tencent.liteav.beauty.a.a.a();
            c.this.aF = new com.tencent.liteav.beauty.a.a.c(c.this.aG, bVar.g, bVar.f, false);
            c.this.aF.b();
            if (!c.this.c(bVar)) {
                TXCLog.e(this.b, "initInternal failed!");
            } else {
                TXCLog.i(this.b, "come out InitEGL");
            }
        }

        public void a() {
            TXCLog.i(this.b, "come into releaseEGL");
            c.this.b();
            if (c.this.aF != null) {
                c.this.aF.c();
                c.this.aF = null;
            }
            if (c.this.aG != null) {
                c.this.aG.a();
                c.this.aG = null;
            }
            c.this.aE = false;
            NativeLoad.nativeDeleteYuv2Yuv();
            TXCLog.i(this.b, "come out releaseEGL");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    a(message.obj);
                    c.this.aE = true;
                    z = true;
                    break;
                case 1:
                    a();
                    c.this.aX.a();
                    z = false;
                    break;
                case 2:
                    c.this.b((byte[]) message.obj);
                    z = false;
                    break;
                case 3:
                    c.this.A(message.arg1);
                    z = true;
                    break;
                case 4:
                    c.this.ay = (float) (message.arg1 / 100.0d);
                    if (c.this.aj != null) {
                        c.this.aj.a(c.this.ay);
                    }
                    z = false;
                    break;
                case 5:
                    c.this.d((e.b) message.obj);
                    z = false;
                    break;
                default:
                    z = false;
                    break;
            }
            synchronized (this) {
                if (true == z) {
                    try {
                        notify();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        void b() {
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
