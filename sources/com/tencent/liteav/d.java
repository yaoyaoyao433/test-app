package com.tencent.liteav;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.b;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.b.w;
import com.tencent.liteav.beauty.e;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import com.tencent.liteav.screencapture.a;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLog;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends com.tencent.liteav.basic.module.a implements b.InterfaceC1442b, com.tencent.liteav.basic.c.b, com.tencent.liteav.beauty.g, r, com.tencent.liteav.videoencoder.d {
    private com.tencent.liteav.basic.structs.b E;
    private WeakReference<u> L;
    private com.tencent.liteav.basic.opengl.j P;
    private com.tencent.liteav.basic.opengl.j Q;
    private com.tencent.liteav.beauty.b.p R;
    private final com.tencent.liteav.beauty.b W;
    private WeakReference<s> Y;
    b a;
    private WeakReference<com.tencent.liteav.basic.c.b> aa;
    b b;
    private com.tencent.liteav.beauty.e f;
    private TXSVideoEncoderParam i;
    private com.tencent.liteav.videoencoder.b j;
    private TXSVideoEncoderParam m;
    private Context p;
    private i q;
    private final com.tencent.liteav.basic.util.c c = new com.tencent.liteav.basic.util.c("capturer", (int) TimeUnit.SECONDS.toMillis(5));
    private final com.tencent.liteav.basic.util.f d = new com.tencent.liteav.basic.util.f(Looper.getMainLooper());
    private q e = null;
    private boolean g = false;
    private boolean h = false;
    private int k = 15;
    private boolean l = false;
    private com.tencent.liteav.videoencoder.b n = null;
    private final Object o = new Object();
    private int r = 0;
    private int s = 0;
    private int t = 0;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private boolean x = false;
    private TXCloudVideoView y = null;
    private final Object z = new Object();
    private Surface A = null;
    private int B = 0;
    private int C = 0;
    private com.tencent.liteav.basic.opengl.g D = null;
    private int F = 0;
    private boolean G = false;
    private boolean H = false;
    private long I = 0;
    private long J = 0;
    private int K = 2;
    private boolean M = false;
    private WeakReference<a> N = null;
    private com.tencent.liteav.basic.opengl.j O = null;
    private int S = -1;
    private boolean T = false;
    private boolean U = false;
    private boolean V = false;
    private boolean X = true;
    private com.tencent.liteav.basic.opengl.f Z = null;
    private int ab = 0;
    private int ac = 0;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void onBackgroudPushStop();

        void onEncVideo(TXSNALPacket tXSNALPacket);

        void onEncVideoFormat(MediaFormat mediaFormat);
    }

    @Override // com.tencent.liteav.beauty.g
    public void b(byte[] bArr, int i, int i2, int i3, long j) {
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeDataIn(int i) {
    }

    public d(Context context) {
        this.f = null;
        this.i = null;
        this.j = null;
        this.m = null;
        this.p = null;
        this.q = null;
        this.p = context.getApplicationContext();
        this.q = new i();
        this.f = new com.tencent.liteav.beauty.e(this.p, true);
        this.f.a((com.tencent.liteav.beauty.g) this);
        this.f.a((com.tencent.liteav.basic.c.b) this);
        if (this.q.U) {
            this.f.a(e.d.MODE_SAME_AS_OUTPUT);
        } else if (this.q.T) {
            this.f.a(e.d.MODE_SAME_AS_INPUT);
        } else {
            this.f.a(e.d.MODE_THRESHOLD);
        }
        this.i = new TXSVideoEncoderParam();
        this.i.encoderMode = 1;
        this.j = null;
        this.m = new TXSVideoEncoderParam();
        this.m.encoderMode = 1;
        this.a = new b(this);
        this.W = new com.tencent.liteav.beauty.b(new com.tencent.liteav.basic.license.g(this.p));
        this.W.setPreprocessor(this.f);
        com.tencent.liteav.basic.d.c.a().a(this.p);
    }

    public TXBeautyManager b() {
        return this.W;
    }

    public void a(a aVar) {
        this.N = new WeakReference<>(aVar);
    }

    public void a(u uVar, int i) {
        this.K = i;
        if (uVar != null) {
            this.L = new WeakReference<>(uVar);
        } else {
            this.L = null;
        }
    }

    public void a(boolean z) {
        this.M = z;
    }

    public void a(i iVar) {
        boolean z = false;
        boolean z2 = (iVar == null || (this.q.E == iVar.E && this.q.F == iVar.F && this.q.G == iVar.G && this.q.J == iVar.J && this.q.H == iVar.H && this.q.I == iVar.I)) ? false : true;
        boolean z3 = (iVar == null || (this.q.a == iVar.a && this.q.b == iVar.b)) ? false : true;
        boolean z4 = iVar != null && this.q.a > 0 && this.q.b > 0 && iVar.a > 0 && iVar.b > 0 && ((double) Math.abs(((float) (this.q.a / this.q.b)) - ((float) (iVar.a / iVar.b)))) > 0.1d;
        if (iVar != null) {
            try {
                this.q = (i) iVar.clone();
            } catch (CloneNotSupportedException e) {
                this.q = new i();
                e.printStackTrace();
            }
        } else {
            this.q = new i();
        }
        TXCLog.i("TXCCaptureAndEnc", String.format("vsize setConfig w*h:%d*%d orientation:%d", Integer.valueOf(this.q.a), Integer.valueOf(this.q.b), Integer.valueOf(this.q.l)));
        if (this.e != null) {
            this.e.e(this.q.l);
        }
        D();
        if (!this.q.T) {
            z = this.q.U ? z3 : z4;
        }
        l(z);
        if (k() && z2) {
            C();
        }
    }

    public i c() {
        return this.q;
    }

    public void a(com.tencent.liteav.basic.c.b bVar) {
        this.aa = new WeakReference<>(bVar);
    }

    public void b(boolean z) {
        this.X = z;
        TXCLog.i("TXCCaptureAndEnc", "Is encoder need texture after glFinish: %b", Boolean.valueOf(z));
    }

    public void a(s sVar) {
        this.Y = new WeakReference<>(sVar);
    }

    public int d() {
        return this.i.width;
    }

    public int e() {
        return this.i.height;
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        if (this.j != null) {
            this.j.setID(str);
        }
        if (this.n != null) {
            this.n.setID(str);
        }
        if (this.f != null) {
            this.f.setID(str);
        }
        if (this.e != null) {
            this.e.a(getID());
        }
        TXCLog.w("TXCCaptureAndEnc", "setID:" + str);
    }

    public void a(final int i) {
        TXCLog.i("TXCCaptureAndEnc", "vrotation setVideoEncRotation " + i);
        this.ab = i;
        if (this.e != null) {
            this.e.a(new Runnable() { // from class: com.tencent.liteav.d.1
                @Override // java.lang.Runnable
                public void run() {
                    if (d.this.j != null) {
                        d.this.j.a(i);
                    }
                    if (d.this.n != null) {
                        d.this.n.a(i);
                    }
                }
            });
            return;
        }
        com.tencent.liteav.videoencoder.b bVar = this.j;
        if (bVar != null) {
            bVar.a(i);
        }
        com.tencent.liteav.videoencoder.b bVar2 = this.n;
        if (bVar2 != null) {
            bVar2.a(i);
        }
    }

    public void b(int i) {
        TXCLog.i("TXCCaptureAndEnc", "setLocalViewMirror " + i);
        this.ac = i;
        if (this.e != null) {
            this.e.d(this.ac);
        }
        if (this.D != null) {
            this.D.b(this.ac);
        }
    }

    public int f() {
        if (k()) {
            TXCLog.w("TXCCaptureAndEnc", "ignore startPush when pushing, status:" + this.t);
            return -2;
        }
        TXCDRApi.initCrashReport(this.p);
        this.t = 1;
        TXCLog.i("TXCCaptureAndEnc", "startWithoutAudio");
        D();
        TXCDRApi.txReportDAU(this.p, com.tencent.liteav.basic.datareport.a.bv);
        return 0;
    }

    public void g() {
        if (!k()) {
            TXCLog.w("TXCCaptureAndEnc", "ignore stopPush when not pushing, status:" + this.t);
            return;
        }
        TXCLog.i("TXCCaptureAndEnc", "stop");
        this.t = 0;
        u();
        this.q.P = false;
        if (this.a != null) {
            this.a.b();
        }
        c(false);
        this.E = null;
    }

    public void h() {
        if (this.t != 1) {
            TXCLog.w("TXCCaptureAndEnc", "ignore pause push when is not pushing, status:" + this.t);
            return;
        }
        this.t = 2;
        TXCLog.i("TXCCaptureAndEnc", "pausePusher");
        if ((this.q.D & 1) == 1) {
            u();
            if (this.a != null && !this.q.M) {
                this.a.a(this.q.C, this.q.B, this.q.A, this.i.width, this.i.height);
            }
            if (this.e != null) {
                this.e.c();
            }
        }
    }

    public void i() {
        if (this.t != 2) {
            TXCLog.w("TXCCaptureAndEnc", "ignore resume push when is not pause, status:" + this.t);
            return;
        }
        this.t = 1;
        TXCLog.i("TXCCaptureAndEnc", "resumePusher");
        if ((this.q.D & 1) == 1) {
            if (this.a != null && !this.q.M) {
                this.a.b();
            }
            u();
            if (this.e != null) {
                this.e.b();
            }
            C();
        }
    }

    public boolean j() {
        return this.u;
    }

    public void c(boolean z) {
        TXCLog.i("TXCCaptureAndEnc", "enableBlackStream " + z);
        this.u = z;
        if (this.u) {
            if (this.e == null) {
                x();
                return;
            }
            return;
        }
        y();
    }

    private void x() {
        TXCLog.i("TXCCaptureAndEnc", " startBlackStream");
        if (this.b == null) {
            this.b = new b(this);
        }
        this.b.a(10, -1, null, 64, 64);
    }

    private void y() {
        TXCLog.i("TXCCaptureAndEnc", " stopBlackStream when enableBlackStream " + this.u);
        if (this.b != null) {
            this.b.b();
        }
    }

    public void a(int i, final int i2, final int i3, final int i4, final int i5, int i6, int i7) {
        if (i == 2) {
            if (this.i.width != 0 && this.i.height != 0 && (i2 != this.i.width || i3 != this.i.height || i4 > this.i.fps)) {
                if (this.e != null) {
                    this.e.a(new Runnable() { // from class: com.tencent.liteav.d.12
                        @Override // java.lang.Runnable
                        public void run() {
                            if (i2 == d.this.i.width && i3 == d.this.i.height && i4 <= d.this.i.fps) {
                                return;
                            }
                            if (i2 > i3) {
                                d.this.q.l = 0;
                            } else if (i2 < i3) {
                                d.this.q.l = 1;
                            }
                            d.this.q.a = i2 > i3 ? i3 : i2;
                            d.this.q.b = i2 > i3 ? i2 : i3;
                            q qVar = d.this.e;
                            if (qVar != null) {
                                qVar.a(com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_INVALID);
                                qVar.b(d.this.q.a, d.this.q.b);
                                qVar.e(d.this.q.l);
                            }
                            d.this.q.c = i5;
                            d.this.q.h = i4;
                            d.this.B();
                            TXCLog.e("TXCCaptureAndEnc", String.format("QOS restart big encoder old resolution %dx%d fps %d, new resolution %dx%d fps %d", Integer.valueOf(d.this.i.width), Integer.valueOf(d.this.i.height), Integer.valueOf(d.this.i.fps), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                        }
                    });
                }
            } else {
                com.tencent.liteav.videoencoder.b bVar = this.j;
                if (bVar != null) {
                    bVar.b(i5, i6);
                    bVar.b(i4);
                }
            }
            d(i7);
            return;
        }
        if (this.m != null && ((i2 != this.m.width || i3 != this.m.height) && this.e != null)) {
            this.e.a(new Runnable() { // from class: com.tencent.liteav.d.17
                @Override // java.lang.Runnable
                public void run() {
                    TXCLog.w("TXCCaptureAndEnc", String.format("QOS restart big encoder old resolution %dx%d fps %d, new resolution %dx%d fps %d", Integer.valueOf(d.this.m.width), Integer.valueOf(d.this.m.height), Integer.valueOf(d.this.m.fps), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                    d.this.m.width = i2;
                    d.this.m.height = i3;
                    d.this.A();
                }
            });
        }
        com.tencent.liteav.videoencoder.b bVar2 = this.n;
        if (bVar2 != null) {
            bVar2.b(i5, i6);
            bVar2.b(i4);
        }
    }

    public void c(final int i) {
        if (this.e == null) {
            return;
        }
        this.e.a(new Runnable() { // from class: com.tencent.liteav.d.18
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.j != null) {
                    d.this.j.d(i);
                }
                d.this.k = i;
            }
        });
    }

    public void a(final int i, final int i2, final int i3) {
        if (this.e == null) {
            return;
        }
        this.e.a(new Runnable() { // from class: com.tencent.liteav.d.19
            @Override // java.lang.Runnable
            public void run() {
                if (i2 != 0 && i3 != 0) {
                    d.this.q.a = i2;
                    d.this.q.b = i3;
                    if (d.this.e != null) {
                        d.this.e.a(com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_INVALID);
                        d.this.e.b(i2, i3);
                    }
                }
                if (i == 0 || d.this.j == null) {
                    return;
                }
                d.this.q.c = i;
                d.this.j.c(i);
            }
        });
    }

    public void d(final int i) {
        if (this.e == null) {
            return;
        }
        this.e.a(new Runnable() { // from class: com.tencent.liteav.d.20
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.j != null) {
                    d.this.j.e(i);
                }
            }
        });
    }

    public boolean k() {
        return this.t != 0;
    }

    public void l() {
        if (this.e == null) {
            return;
        }
        this.e.a(new Runnable() { // from class: com.tencent.liteav.d.21
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.e != null) {
                    d.this.e.b(true);
                }
                d.this.c(d.this.i.width, d.this.i.height);
                d.this.a(d.this.ab);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.tencent.liteav.renderer.TXCGLSurfaceView[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.tencent.liteav.renderer.TXCGLSurfaceView] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public void a(final TXCloudVideoView tXCloudVideoView) {
        com.tencent.liteav.basic.opengl.h hVar;
        if (this.q.M) {
            TXCLog.e("TXCCaptureAndEnc", "enable pure audio push , so can not start preview!");
            return;
        }
        if (this.a != null) {
            this.a.b();
        }
        this.x = false;
        boolean z = this.q.W;
        if (tXCloudVideoView != null) {
            final ?? r2 = new TXCGLSurfaceView[1];
            a(new Runnable() { // from class: com.tencent.liteav.d.22
                @Override // java.lang.Runnable
                public void run() {
                    r2[0] = new TXCGLSurfaceView(tXCloudVideoView.getContext());
                    tXCloudVideoView.addVideoView(r2[0]);
                }
            });
            ?? r3 = r2[0];
            r2[0].setNotifyListener(this);
            TXCLog.i("TXCCaptureAndEnc", "start camera preview with GLSurfaceView");
            hVar = r3;
        } else {
            com.tencent.liteav.basic.opengl.h hVar2 = new com.tencent.liteav.basic.opengl.h();
            TXCLog.i("TXCCaptureAndEnc", "start camera preview with SurfaceTexture");
            z = false;
            hVar = hVar2;
        }
        this.r = 0;
        this.e = new c(this.p, this.q, hVar, z);
        y();
        j(this.F);
        this.e.a(getID());
        this.e.a((r) this);
        this.e.a((com.tencent.liteav.basic.c.b) this);
        this.e.a();
        this.e.b(this.v);
        this.e.c(this.w);
        this.e.d(this.ac);
        this.y = tXCloudVideoView;
        this.d.post(new Runnable() { // from class: com.tencent.liteav.d.2
            @Override // java.lang.Runnable
            public void run() {
                if (tXCloudVideoView != null) {
                    tXCloudVideoView.start(d.this.q.K, d.this.q.L, d.this.e);
                }
            }
        });
        this.x = false;
        TXCKeyPointReportProxy.a((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME);
    }

    public void d(boolean z) {
        k(z);
    }

    public int a(boolean z, int i, int i2, int i3, int i4, int i5) {
        boolean z2 = (this.m.width == i && this.m.height == i2) ? false : true;
        this.m.width = i;
        this.m.height = i2;
        this.m.fps = i3;
        this.m.gop = i5;
        this.m.encoderProfile = 1;
        this.m.realTime = this.q.P;
        this.m.streamType = 3;
        this.m.bitrate = i4;
        this.m.annexb = true;
        this.m.bMultiRef = false;
        if (this.n != null && (z2 || (this.l && !z))) {
            if (this.e != null) {
                this.e.a(new Runnable() { // from class: com.tencent.liteav.d.3
                    @Override // java.lang.Runnable
                    public void run() {
                        d.this.A();
                    }
                });
            } else {
                A();
            }
        }
        this.l = z;
        return 0;
    }

    public void e(int i) {
        if (this.q.h == i) {
            return;
        }
        this.q.h = i;
        if (this.e == null || this.e.g() >= i) {
            return;
        }
        switch (this.r) {
            case 0:
                l(true);
                u();
                return;
            case 1:
                this.e.f(i);
                return;
            default:
                return;
        }
    }

    public void a(Surface surface) {
        if (this.y != null) {
            TXCLog.w("TXCCaptureAndEnc", "camera preview view is not null, can't set surface");
            return;
        }
        synchronized (this.z) {
            if (this.A != surface) {
                TXCLog.i("TXCCaptureAndEnc", "surface-render: set surface " + surface);
                this.A = surface;
                if (this.D != null) {
                    this.D.a();
                    this.D = null;
                }
            } else {
                TXCLog.i("TXCCaptureAndEnc", "surface-render: set surface the same" + surface);
            }
        }
    }

    public void a(final int i, final int i2) {
        synchronized (this.z) {
            if (this.D != null) {
                this.D.a(new Runnable() { // from class: com.tencent.liteav.d.4
                    @Override // java.lang.Runnable
                    public void run() {
                        d.this.B = i;
                        d.this.C = i2;
                        if (d.this.E == null || d.this.D == null) {
                            return;
                        }
                        d.this.a(d.this.E, true);
                    }
                });
            } else {
                this.B = i;
                this.C = i2;
            }
        }
    }

    public void a(final com.tencent.liteav.basic.opengl.p pVar) {
        if (this.y != null) {
            TXCGLSurfaceView gLSurfaceView = this.y.getGLSurfaceView();
            if (gLSurfaceView != null) {
                gLSurfaceView.a(new com.tencent.liteav.basic.opengl.p() { // from class: com.tencent.liteav.d.5
                    @Override // com.tencent.liteav.basic.opengl.p
                    public void onTakePhotoComplete(Bitmap bitmap) {
                        if (pVar != null) {
                            pVar.onTakePhotoComplete(bitmap);
                        }
                    }
                });
            } else if (pVar != null) {
                pVar.onTakePhotoComplete(null);
            }
        } else if (this.D != null) {
            this.D.a(new com.tencent.liteav.basic.opengl.p() { // from class: com.tencent.liteav.d.6
                @Override // com.tencent.liteav.basic.opengl.p
                public void onTakePhotoComplete(Bitmap bitmap) {
                    if (pVar != null) {
                        pVar.onTakePhotoComplete(bitmap);
                    }
                }
            });
        } else if (pVar != null) {
            pVar.onTakePhotoComplete(null);
        }
    }

    public void a(a.InterfaceC1461a interfaceC1461a) {
        if (Build.VERSION.SDK_INT < 21) {
            Bundle bundle = new Bundle();
            bundle.putString("EVT_MSG", "Screen recording failed, unsupported Android system version. system version should above 5.0");
            onNotifyEvent(-1309, bundle);
            TXLog.e("TXCCaptureAndEnc", "Screen capture need running on Android Lollipop or higher version, current:" + Build.VERSION.SDK_INT);
            return;
        }
        this.r = 1;
        if (this.e == null) {
            this.e = new l(this.p, this.q, interfaceC1461a);
            TXCLog.i("TXCCaptureAndEnc", "create TXCScreenCaptureSource");
        }
        this.W.a(false);
        j(this.F);
        this.e.a((com.tencent.liteav.basic.c.b) this);
        this.e.a((r) this);
        this.e.a();
        this.e.a(getID());
        TXCDRApi.txReportDAU(this.p, com.tencent.liteav.basic.datareport.a.aH);
    }

    public void m() {
        if (this.e == null) {
            return;
        }
        this.W.a(true);
        k(true);
    }

    private void k(final boolean z) {
        if (this.e == null) {
            return;
        }
        this.e.a(new Runnable() { // from class: com.tencent.liteav.d.7
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f != null) {
                    d.this.f.b();
                }
            }
        });
        u();
        this.e.a(z);
        this.e = null;
        TXCLog.i("TXCCaptureAndEnc", "stopped CaptureSource");
        final TXCloudVideoView tXCloudVideoView = this.y;
        this.d.post(new Runnable() { // from class: com.tencent.liteav.d.8
            @Override // java.lang.Runnable
            public void run() {
                if (tXCloudVideoView != null) {
                    tXCloudVideoView.stop(z);
                }
            }
        });
        this.y = null;
        synchronized (this.z) {
            this.A = null;
            if (this.D != null) {
                this.D.a();
                this.D = null;
            }
        }
        if (this.a.a()) {
            this.a.b();
        }
        if (this.u) {
            x();
        }
    }

    public void f(int i) {
        TXCLog.i("TXCCaptureAndEnc", "setRenderMode " + i);
        this.w = i;
        if (this.e != null) {
            this.e.c(i);
        }
        if (this.D != null) {
            this.D.a(this.w);
        }
    }

    public void e(boolean z) {
        this.V = z;
    }

    public void g(int i) {
        if (this.v != i) {
            TXCLog.i("TXCCaptureAndEnc", "vrotation setRenderRotation " + i);
        }
        this.v = i;
        if (this.e == null) {
            return;
        }
        this.e.b(i);
    }

    public boolean f(boolean z) {
        if (this.e == null) {
            return false;
        }
        return this.e.d(z);
    }

    public void b(int i, int i2, int i3) {
        this.W.setBeautyLevel(i);
        this.W.setWhitenessLevel(i2);
        this.W.setRuddyLevel(i3);
    }

    public void h(int i) {
        this.W.setBeautyStyle(i);
    }

    public void a(Bitmap bitmap, float f, float f2, float f3) {
        this.q.E = bitmap;
        this.q.H = f;
        this.q.I = f2;
        this.q.J = f3;
        C();
    }

    public boolean n() {
        if (this.e != null) {
            return this.e.h();
        }
        return false;
    }

    public boolean o() {
        if (this.e != null) {
            return this.e.i();
        }
        return false;
    }

    public boolean p() {
        if (this.e != null) {
            return this.e.j();
        }
        return false;
    }

    public boolean q() {
        if (this.e != null) {
            return this.e.k();
        }
        return false;
    }

    public int r() {
        if (this.e == null) {
            return 0;
        }
        return this.e.e();
    }

    public boolean i(int i) {
        if (this.e == null) {
            return false;
        }
        return this.e.a(i);
    }

    public void b(int i, int i2) {
        if (this.e == null) {
            return;
        }
        this.e.a(i, i2);
    }

    public boolean g(boolean z) {
        this.q.S = z;
        if (this.e == null) {
            return false;
        }
        this.e.c(z);
        return true;
    }

    public void a(float f) {
        if (this.e == null) {
            return;
        }
        this.e.a(f);
    }

    public void j(int i) {
        this.F = i;
        if (this.e != null) {
            this.e.g(this.F);
        }
    }

    public void h(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        TXCLog.i("TXCCaptureAndEnc", "trtc_api onVideoConfigChanged enableRps " + this.G);
        if (this.G) {
            this.q.j = 0;
        }
        u();
    }

    public void i(boolean z) {
        this.h = z;
    }

    public void j(boolean z) {
        this.H = z;
    }

    public void k(int i) {
        com.tencent.liteav.videoencoder.b bVar;
        if (i == 2) {
            bVar = this.j;
        } else {
            bVar = i == 3 ? this.n : null;
        }
        if (bVar != null) {
            bVar.b();
        }
    }

    private void a(int i, String str) {
        long j;
        String str2;
        int i2;
        String id;
        long j2;
        Bundle bundle = new Bundle();
        bundle.putString(TXCAVRoomConstants.EVT_USERID, getID());
        bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        if (str != null) {
            bundle.putCharSequence("EVT_MSG", str);
        }
        com.tencent.liteav.basic.util.g.a(this.aa, i, bundle);
        if (i == -1317) {
            id = getID();
            j2 = 4;
        } else if (i == -1314) {
            id = getID();
            j2 = 5;
        } else {
            if (i == 1003 && this.e != null) {
                String id2 = getID();
                j = this.e.l() ? 0L : 1L;
                str2 = id2;
                i2 = MapConstant.LayerPropertyFlag_MarkerSpacing;
                TXCEventRecorderProxy.a(str2, i2, j, -1L, "", this.F);
            }
            if (i != -1302 || i == -1317 || i == -1318 || i == -1319) {
                TXCKeyPointReportProxy.b((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_CHANNEL_NAME, i);
            } else if (i == -1301 || i == -1314 || i == -1315 || i == -1316) {
                TXCKeyPointReportProxy.b((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME, i);
                if (this.e != null) {
                    TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_MarkerAvoidScreen, this.e.l() ? 0L : 1L, i, "", this.F);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        j = j2;
        i2 = 2002;
        str2 = id;
        TXCEventRecorderProxy.a(str2, i2, j, -1L, "", this.F);
        if (i != -1302) {
        }
        TXCKeyPointReportProxy.b((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_CHANNEL_NAME, i);
    }

    public int a(byte[] bArr, int i, int i2, int i3, long j) {
        synchronized (this.o) {
            if (this.t == 2) {
                return 0;
            }
            int a2 = a(i2, i3, (Object) null);
            if (a2 != 0) {
                return a2;
            }
            com.tencent.liteav.videoencoder.b bVar = this.j;
            if (bVar != null) {
                bVar.a(bArr, i, i2, i3, j == 0 ? TXCTimeUtil.generatePtsMS() : j);
            }
            return 0;
        }
    }

    public int a(byte[] bArr, int i, int i2, int i3, Object obj, long j, int i4) {
        com.tencent.liteav.basic.structs.b bVar = new com.tencent.liteav.basic.structs.b();
        bVar.m = bArr;
        bVar.b = i;
        bVar.d = true;
        a(bVar, i2, i3, obj, j);
        return 0;
    }

    public void s() {
        try {
            if (this.f != null) {
                this.f.b();
            }
            if (this.O != null) {
                this.O.e();
                this.O = null;
            }
            if (this.Q != null) {
                this.Q.e();
                this.Q = null;
            }
            if (this.P != null) {
                this.P.e();
                this.P = null;
            }
            B();
            A();
            z();
        } catch (Exception e) {
            TXCLog.e("TXCCaptureAndEnc", "stop preprocessor and encoder failed.", e);
        }
    }

    public int a(int i, int i2, int i3, Object obj, long j) {
        synchronized (this.o) {
            if (this.t == 2) {
                return 0;
            }
            int a2 = a(i2, i3, obj);
            if (a2 != 0) {
                return a2;
            }
            long generatePtsMS = j == 0 ? TXCTimeUtil.generatePtsMS() : j;
            com.tencent.liteav.videoencoder.b bVar = this.j;
            if (bVar != null) {
                bVar.a(this.q.S);
                bVar.a(i, i2, i3, generatePtsMS);
            }
            com.tencent.liteav.videoencoder.b bVar2 = this.n;
            if (bVar2 != null) {
                bVar2.a(this.q.S);
                bVar2.a(i, i2, i3, generatePtsMS);
            }
            return 0;
        }
    }

    public int a(int i, int i2, int i3, Object obj, long j, int i4) {
        com.tencent.liteav.basic.structs.b bVar = new com.tencent.liteav.basic.structs.b();
        bVar.a = i;
        bVar.b = 0;
        a(bVar, i2, i3, obj, j);
        return 0;
    }

    private void a(com.tencent.liteav.basic.structs.b bVar, int i, int i2, Object obj, long j) {
        synchronized (this.o) {
            if (this.t == 2) {
                return;
            }
            bVar.e = i;
            bVar.f = i2;
            bVar.i = this.q.S;
            if (this.q.l == 0) {
                bVar.g = this.q.b;
                bVar.h = this.q.a;
            } else {
                bVar.g = this.q.a;
                bVar.h = this.q.b;
            }
            bVar.l = com.tencent.liteav.basic.util.g.a(bVar.e, bVar.f, bVar.g, bVar.h);
            try {
                this.f.a(this.q.l);
                this.f.a(obj);
                this.f.a(bVar, bVar.b, 0, j);
            } catch (Exception e) {
                TXCLog.e("TXCCaptureAndEnc", "send custom video frame failed." + e.getMessage());
            }
        }
    }

    @Override // com.tencent.liteav.beauty.g
    public int a(com.tencent.liteav.basic.structs.b bVar) {
        s sVar = this.Y != null ? this.Y.get() : null;
        if (sVar != null) {
            if (this.Z == null || this.Z.c() != bVar.e || this.Z.d() != bVar.f) {
                if (this.Z != null) {
                    this.Z.e();
                }
                this.Z = new com.tencent.liteav.basic.opengl.f(bVar.e, bVar.f);
                this.Z.a();
            }
            bVar.a = sVar.onProcessVideoFrame(bVar.a, bVar.e, bVar.f, this.Z.b());
            GLES20.glDisable(3042);
            GLES20.glDisable(2929);
        }
        d(bVar);
        a(bVar, false);
        return bVar.a;
    }

    @Override // com.tencent.liteav.beauty.g
    public void a(com.tencent.liteav.basic.structs.b bVar, long j) {
        a(bVar.a, bVar.e, bVar.f, j);
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeNAL(TXSNALPacket tXSNALPacket, int i) {
        a aVar;
        if (i == 0) {
            if (tXSNALPacket.streamType == 2) {
                this.J = tXSNALPacket.gopIndex;
                this.I = tXSNALPacket.frameIndex;
            }
            if (this.N == null || (aVar = this.N.get()) == null) {
                return;
            }
            aVar.onEncVideo(tXSNALPacket);
        } else if ((i == 10000004 || i == 10000005) && this.i.encodeType == 1) {
            Monitor.a(2, String.format("VideoEncoder: hardware encoder error %d, switch to software encoder", Integer.valueOf(i)), "", 0);
            u();
            this.s++;
            this.q.j = 0;
            a(1103, "Failed to enable hardware encoder, use software encoder");
        }
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeFormat(MediaFormat mediaFormat) {
        a aVar;
        if (this.N == null || (aVar = this.N.get()) == null) {
            return;
        }
        aVar.onEncVideoFormat(mediaFormat);
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeFinished(int i, long j, long j2) {
        if (i == 2) {
            this.J = j;
            this.I = j2;
        }
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onRestartEncoder(int i) {
        if (this.i.width * this.i.height < 518400) {
            this.q.j = 0;
        } else if (this.i.width * this.i.height < 921600 && this.g) {
            this.q.j = 0;
        }
        if (i == 3) {
            w();
            return;
        }
        this.g = true;
        v();
    }

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.putString(TXCAVRoomConstants.EVT_USERID, getID());
        }
        com.tencent.liteav.basic.util.g.a(this.aa, i, bundle);
        if (i == -1317) {
            TXCEventRecorderProxy.a(getID(), 2002, 4L, -1L, "", this.F);
        } else if (i == -1314) {
            TXCEventRecorderProxy.a(getID(), 2002, 5L, -1L, "", this.F);
        } else if (i == 1003) {
            if (this.e != null) {
                TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_MarkerSpacing, this.e.l() ? 0L : 1L, -1L, "", this.F);
            }
        } else if (i == -1308) {
            m();
        }
        if (i == -1302 || i == -1317 || i == -1318 || i == -1319) {
            TXCKeyPointReportProxy.b((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_CHANNEL_NAME, i);
        } else if (i == -1301 || i == -1314 || i == -1315 || i == -1316) {
            TXCKeyPointReportProxy.b((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME, i);
            if (this.e != null) {
                TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_MarkerAvoidScreen, this.e.l() ? 0L : 1L, i, "", this.F);
            }
        }
    }

    @Override // com.tencent.liteav.b.InterfaceC1442b
    public void a(final Bitmap bitmap, final ByteBuffer byteBuffer, final int i, final int i2) {
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.d.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if ((d.this.t == 2 || d.this.u) && bitmap != null && byteBuffer != null) {
                        if (d.this.j == null || d.this.U || d.this.i.width != i || d.this.i.height != i2 || d.this.i.encodeType != 2 || d.this.i.gop != d.this.q.i) {
                            d.this.a(i, i2, 2, (Object) null, d.this.q.C, true);
                        }
                        if ((d.this.n == null || d.this.m.encodeType != 2) && d.this.l) {
                            d.this.a((Object) null, 2, true);
                        }
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        com.tencent.liteav.videoencoder.b bVar = d.this.j;
                        if (bVar != null) {
                            bVar.a(byteBuffer.array(), 2, width, height, TXCTimeUtil.generatePtsMS());
                        }
                        com.tencent.liteav.videoencoder.b bVar2 = d.this.n;
                        if (bVar2 != null) {
                            bVar2.a(byteBuffer.array(), 2, width, height, TXCTimeUtil.generatePtsMS());
                        }
                    }
                } catch (Exception e) {
                    TXCLog.e("TXCCaptureAndEnc", "onPushBitmap failed." + e.getMessage());
                }
            }
        };
        q qVar = this.e;
        if (qVar != null) {
            qVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.tencent.liteav.b.InterfaceC1442b
    public void a() {
        a aVar;
        TXCLog.i("TXCCaptureAndEnc", "onPushEnd");
        if (this.N == null || (aVar = this.N.get()) == null) {
            return;
        }
        aVar.onBackgroudPushStop();
    }

    @Override // com.tencent.liteav.r
    public void a(SurfaceTexture surfaceTexture) {
        if (this.f != null) {
            this.f.b();
        }
        s sVar = this.Y != null ? this.Y.get() : null;
        if (sVar != null) {
            sVar.onGLContextCreated();
        }
    }

    @Override // com.tencent.liteav.r
    public void b(com.tencent.liteav.basic.structs.b bVar) {
        this.c.a();
        if (!this.T) {
            this.T = true;
            TXCKeyPointReportProxy.b((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME, 0);
        }
        if (this.t == 2) {
            return;
        }
        q qVar = this.e;
        if (this.f == null || this.q.M || qVar == null) {
            return;
        }
        if (this.i.height != bVar.h || this.i.width != bVar.g) {
            d(bVar.g, bVar.h);
        }
        this.f.a(qVar.f());
        this.f.a(this.q.l);
        this.f.a(bVar, bVar.b, 0, 0L);
    }

    @Override // com.tencent.liteav.r
    public void t() {
        TXCLog.i("TXCCaptureAndEnc", "onCaptureDestroy->enter ");
        if (this.f != null) {
            this.f.b();
        }
        if (this.O != null) {
            this.O.e();
            this.O = null;
        }
        if (this.Q != null) {
            this.Q.e();
            this.Q = null;
        }
        if (this.P != null) {
            this.P.e();
            this.P = null;
        }
        if (this.R != null) {
            this.R.e();
            this.R = null;
        }
        B();
        A();
        z();
    }

    private void z() {
        if (this.S != -1) {
            TXCLog.i("TXCCaptureAndEnc", "destroy FrameBuffer: %d", Integer.valueOf(this.S));
            TXCOpenGlUtils.b(this.S);
            this.S = -1;
        }
        if (this.Z != null) {
            this.Z.e();
            this.Z = null;
        }
        s sVar = this.Y != null ? this.Y.get() : null;
        if (sVar != null) {
            sVar.onGLContextReadyToDestory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, int i3, Object obj, int i4, boolean z) {
        TXCLog.i("TXCCaptureAndEnc", "New encode size width = " + i + " height = " + i2 + " encType = " + i3 + " eglContext: " + obj);
        B();
        com.tencent.liteav.videoencoder.b bVar = new com.tencent.liteav.videoencoder.b(i3);
        TXCStatus.a(getID(), MapConstant.LayerPropertyFlag_MarkSortKey, this.F, Integer.valueOf(i3));
        if (i3 == 1) {
            TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_MarkerDisplayPart, 1L, -1L, "", this.F);
        } else {
            TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_MarkerDisplayPart, 0L, -1L, "", this.F);
        }
        this.U = false;
        this.i.encodeType = i3;
        this.i.width = i;
        this.i.height = i2;
        this.i.fps = i4;
        this.i.gop = this.q.i;
        this.i.encoderProfile = this.q.n;
        this.i.glContext = obj != null ? obj : bVar.a(i, i2);
        this.i.realTime = z;
        this.i.streamType = this.F;
        this.i.annexb = this.H;
        this.i.bMultiRef = this.G;
        this.i.baseFrameIndex = this.I + 20;
        this.i.baseGopIndex = ((this.J + 1) % 255) + 1;
        this.i.bLimitFps = this.h;
        this.i.record = this.V;
        this.i.encFmt = this.q.Y;
        bVar.a((com.tencent.liteav.videoencoder.d) this);
        bVar.a((com.tencent.liteav.basic.c.b) this);
        bVar.a(this.i);
        bVar.c(this.q.c);
        bVar.d(this.k);
        bVar.setID(getID());
        bVar.a(this.ab);
        this.j = bVar;
        TXCStatus.a(getID(), MapConstant.LayerPropertyFlag_MarkerCustomCollision, this.F, Integer.valueOf((this.i.width << 16) | this.i.height));
        TXCStatus.a(getID(), 13003, this.F, Integer.valueOf(this.i.gop * 1000));
        TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_MarkerCustomCollision, this.i.width, this.i.height, "", this.F);
        TXCKeyPointReportProxy.a(40036, this.i.encodeType, this.F);
        TXCKeyPointReportProxy.a(40037, (this.i.width << 16) | this.i.height, this.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, int i, boolean z) {
        A();
        com.tencent.liteav.videoencoder.b bVar = new com.tencent.liteav.videoencoder.b(i);
        TXCStatus.a(getID(), MapConstant.LayerPropertyFlag_MarkSortKey, 3, Integer.valueOf(i));
        if (i == 1) {
            TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_MarkerDisplayPart, 1L, -1L, "", 3);
        } else {
            TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_MarkerDisplayPart, 0L, -1L, "", 3);
        }
        this.m.glContext = obj != null ? obj : bVar.a(this.m.width, this.m.height);
        this.m.encodeType = i;
        this.m.realTime = z;
        TXCLog.i("TXCCaptureAndEnc", "start small video encoder");
        bVar.a((com.tencent.liteav.videoencoder.d) this);
        bVar.a((com.tencent.liteav.basic.c.b) this);
        bVar.a(this.m);
        bVar.c(this.m.bitrate);
        bVar.setID(getID());
        bVar.a(this.ab);
        this.n = bVar;
        TXCStatus.a(getID(), MapConstant.LayerPropertyFlag_MarkerCustomCollision, 3, Integer.valueOf((this.m.width << 16) | this.m.height));
        TXCStatus.a(getID(), 13003, 3, Integer.valueOf(this.m.gop * 1000));
    }

    private void a(int i, int i2, int i3, long j) {
        if (j == 0) {
            j = TXCTimeUtil.generatePtsMS();
        }
        b(i2, i3, this.f.a());
        com.tencent.liteav.videoencoder.b bVar = this.j;
        if (bVar != null) {
            bVar.b(this.X);
            bVar.a(i, i2, i3, j);
        }
        com.tencent.liteav.videoencoder.b bVar2 = this.n;
        if (bVar2 != null) {
            bVar2.b(this.X);
            bVar2.a(i, i2, i3, j);
        }
    }

    private int a(int i, int i2, Object obj) {
        int i3 = this.q.a;
        int i4 = this.q.b;
        if (this.q.l == 0 || this.q.l == 2) {
            i3 = this.q.b;
            i4 = this.q.a;
        }
        if (i3 <= 0 || i4 <= 0) {
            TXCLog.e("TXCCaptureAndEnc", "sendCustomYUVData: invalid video encode resolution");
            return -1;
        } else if (this.q.M) {
            B();
            return -1000;
        } else {
            b(i3, i4, obj);
            return 0;
        }
    }

    private void b(int i, int i2, Object obj) {
        int i3 = 2;
        switch (this.q.j) {
            case 1:
                i3 = 1;
                break;
            case 2:
                i3 = 3;
                break;
        }
        if (this.r == 1 && this.s == 0) {
            i3 = 1;
        }
        int i4 = this.q.i;
        if (this.j == null || this.U || this.i.width != i || this.i.height != i2 || this.i.encodeType != i3 || this.i.gop != i4) {
            a(i, i2, i3, obj, this.q.h, this.q.P);
        }
        if ((this.n == null || this.m.encodeType != i3) && this.l) {
            a(obj, i3, this.q.P);
        }
    }

    public void u() {
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.d.10
            @Override // java.lang.Runnable
            public void run() {
                d.this.B();
                d.this.A();
            }
        };
        q qVar = this.e;
        if (qVar != null) {
            qVar.a(runnable);
            return;
        }
        synchronized (this.o) {
            runnable.run();
        }
    }

    public void v() {
        if (this.j == null) {
            return;
        }
        if (this.e != null) {
            this.e.a(new Runnable() { // from class: com.tencent.liteav.d.11
                @Override // java.lang.Runnable
                public void run() {
                    d.this.B();
                }
            });
        } else {
            B();
        }
    }

    public void w() {
        if (this.n == null) {
            return;
        }
        if (this.e != null) {
            this.e.a(new Runnable() { // from class: com.tencent.liteav.d.13
                @Override // java.lang.Runnable
                public void run() {
                    d.this.A();
                }
            });
        } else {
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        try {
            com.tencent.liteav.videoencoder.b bVar = this.n;
            this.n = null;
            if (bVar != null) {
                bVar.a();
                bVar.a((com.tencent.liteav.videoencoder.d) null);
            }
        } catch (Exception e) {
            TXCLog.e("TXCCaptureAndEnc", "stop video encoder failed.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        try {
            TXCLog.i("TXCCaptureAndEnc", "stopBigVideoEncoderInGLThread");
            com.tencent.liteav.videoencoder.b bVar = this.j;
            this.j = null;
            if (bVar != null) {
                bVar.a();
                bVar.a((com.tencent.liteav.videoencoder.d) null);
            }
            this.U = true;
        } catch (Exception e) {
            TXCLog.e("TXCCaptureAndEnc", "stopBigVideoEncoder failed.", e);
        }
    }

    private void l(final boolean z) {
        if (this.e != null) {
            this.e.a(new Runnable() { // from class: com.tencent.liteav.d.14
                @Override // java.lang.Runnable
                public void run() {
                    q qVar = d.this.e;
                    if (qVar == null) {
                        return;
                    }
                    qVar.f(d.this.q.h);
                    qVar.e(d.this.q.l);
                    qVar.a(d.this.q.k);
                    qVar.b(d.this.q.a, d.this.q.b);
                    qVar.e(d.this.q.U);
                    if (z && qVar.d()) {
                        qVar.b(false);
                    }
                }
            });
        }
    }

    private void C() {
        if (this.e != null) {
            this.e.a(new Runnable() { // from class: com.tencent.liteav.d.15
                @Override // java.lang.Runnable
                public void run() {
                    d.this.c(d.this.i.width, d.this.i.height);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        com.tencent.liteav.beauty.e eVar;
        Bitmap bitmap;
        float f;
        float f2;
        float width;
        if (this.q.J != -1.0f) {
            if (this.f == null) {
                return;
            }
            com.tencent.liteav.beauty.e eVar2 = this.f;
            Bitmap bitmap2 = this.q.E;
            float f3 = this.q.H;
            float f4 = this.q.I;
            eVar = eVar2;
            width = this.q.J;
            f = f3;
            bitmap = bitmap2;
            f2 = f4;
        } else if (this.f == null || i == 0 || i2 == 0) {
            return;
        } else {
            eVar = this.f;
            bitmap = this.q.E;
            float f5 = i;
            f = this.q.F / f5;
            f2 = this.q.G / i2;
            width = this.q.E == null ? 0.0f : this.q.E.getWidth() / f5;
        }
        eVar.a(bitmap, f, f2, width);
    }

    private void D() {
        if (this.f != null) {
            if (this.q.U) {
                this.f.a(e.d.MODE_SAME_AS_OUTPUT);
            } else if (this.q.T) {
                this.f.a(e.d.MODE_SAME_AS_INPUT);
            } else {
                this.f.a(e.d.MODE_THRESHOLD);
            }
        }
    }

    private void d(int i, int i2) {
        c(i, i2);
    }

    private void e(int i, int i2) {
        if (this.x) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TXCAVRoomConstants.EVT_USERID, getID());
        bundle.putInt(TXCAVRoomConstants.EVT_ID, 2003);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putCharSequence("EVT_MSG", "Renders the first video frame");
        bundle.putInt("EVT_PARAM1", i);
        bundle.putInt("EVT_PARAM2", i2);
        com.tencent.liteav.basic.util.g.a(this.aa, 2003, bundle);
        TXCLog.i("TXCCaptureAndEnc", "trtc_render render first frame " + getID() + ", " + this.F);
        this.x = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tencent.liteav.basic.structs.b bVar, boolean z) {
        e(bVar.e, bVar.f);
        this.E = bVar;
        if (this.y != null) {
            if (this.e != null) {
                this.e.a(bVar);
                return;
            }
            return;
        }
        synchronized (this.z) {
            if (this.A != null && this.D == null && this.e != null && this.e.f() != null) {
                this.D = new com.tencent.liteav.basic.opengl.g();
                this.D.a(this.e.f(), this.A);
                this.D.a(this.w);
                this.D.b(this.ac);
            }
            if (this.D != null && this.e != null) {
                this.D.a(bVar.a, bVar.i, this.v, this.B, this.C, bVar.e, bVar.f, z, this.e.l());
            }
        }
    }

    private int c(com.tencent.liteav.basic.structs.b bVar) {
        if (this.M) {
            return bVar.a;
        }
        int i = bVar.a;
        if ((this.ac == 1) != bVar.i) {
            if (this.P == null) {
                com.tencent.liteav.basic.opengl.j jVar = new com.tencent.liteav.basic.opengl.j();
                jVar.c();
                jVar.a(true);
                jVar.a(bVar.e, bVar.f);
                if (bVar.e > bVar.f) {
                    jVar.h();
                } else {
                    jVar.g();
                }
                this.P = jVar;
            }
            com.tencent.liteav.basic.opengl.j jVar2 = this.P;
            if (jVar2 != null) {
                jVar2.a(bVar.e, bVar.f);
                i = jVar2.a(bVar.a);
            }
        }
        if (this.v != 0) {
            if (this.Q == null) {
                com.tencent.liteav.basic.opengl.j jVar3 = new com.tencent.liteav.basic.opengl.j();
                jVar3.c();
                jVar3.a(true);
                jVar3.a(bVar.e, bVar.f);
                this.Q = jVar3;
            }
            com.tencent.liteav.basic.opengl.j jVar4 = this.Q;
            if (jVar4 != null) {
                GLES20.glViewport(0, 0, bVar.e, bVar.f);
                int i2 = bVar.e;
                int i3 = bVar.f;
                float[] a2 = jVar4.a(i2, i3, null, com.tencent.liteav.basic.util.g.a(i2, i3, bVar.e, bVar.f), 0);
                int i4 = (720 - this.v) % 360;
                jVar4.a(i2, i3, i4, a2, ((i4 == 90 || i4 == 270) ? bVar.f : bVar.e) / ((i4 == 90 || i4 == 270) ? bVar.e : bVar.f), false, false);
                jVar4.a(i);
                return jVar4.l();
            }
            return i;
        }
        return i;
    }

    private void d(com.tencent.liteav.basic.structs.b bVar) {
        w wVar;
        TXCGLSurfaceView gLSurfaceView;
        WeakReference<u> weakReference = this.L;
        u uVar = weakReference == null ? null : weakReference.get();
        if (uVar == null) {
            return;
        }
        TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
        tXSVideoFrame.width = bVar.e;
        tXSVideoFrame.height = bVar.f;
        tXSVideoFrame.pts = TXCTimeUtil.generatePtsMS();
        int c = c(bVar);
        if (this.K == 5) {
            tXSVideoFrame.textureId = c;
            tXSVideoFrame.eglContext = this.f.a();
            if (this.S == -1) {
                this.S = TXCOpenGlUtils.d();
                TXCLog.i("TXCCaptureAndEnc", "create FrameBuffer: %d", Integer.valueOf(this.S));
            }
            TXCOpenGlUtils.a(tXSVideoFrame.textureId, this.S);
            GLES20.glBindFramebuffer(36160, this.S);
            uVar.onRenderVideoFrame(getID(), this.F, tXSVideoFrame);
            TXCOpenGlUtils.d(this.S);
            if (this.M) {
                ByteBuffer wrap = tXSVideoFrame.data != null ? ByteBuffer.wrap(tXSVideoFrame.data) : tXSVideoFrame.buffer;
                wrap.position(0);
                bVar.a = TXCOpenGlUtils.a(wrap, bVar.e, bVar.f, c);
            }
        } else if (this.K == 2) {
            tXSVideoFrame.textureId = c;
            tXSVideoFrame.eglContext = this.f.a();
            uVar.onRenderVideoFrame(getID(), this.F, tXSVideoFrame);
            if (this.M) {
                bVar.a = tXSVideoFrame.textureId;
            }
        } else if (this.K == 1 || this.K == 4) {
            if (this.O == null) {
                if (this.K == 1) {
                    wVar = new w(1);
                } else {
                    wVar = new w(3);
                }
                wVar.a(true);
                if (wVar.c()) {
                    wVar.a(bVar.e, bVar.f);
                    this.O = wVar;
                } else {
                    TXCLog.i("TXCCaptureAndEnc", "init filter error ");
                    this.O = null;
                }
            }
            com.tencent.liteav.basic.opengl.j jVar = this.O;
            if (jVar != null) {
                GLES20.glViewport(0, 0, bVar.e, bVar.f);
                jVar.a(bVar.e, bVar.f);
                jVar.a(c);
                GLES20.glBindFramebuffer(36160, jVar.m());
                uVar.onRenderVideoFrame(getID(), this.F, tXSVideoFrame);
            }
            if (this.M && (tXSVideoFrame.data != null || tXSVideoFrame.buffer != null)) {
                int i = (this.K == 1 || this.K != 4) ? 1 : 3;
                if (this.R == null) {
                    com.tencent.liteav.beauty.b.p pVar = new com.tencent.liteav.beauty.b.p(i);
                    pVar.a(true);
                    if (!pVar.c()) {
                        TXCLog.w("TXCCaptureAndEnc", " init i420ToRGBA filter failed");
                    }
                    pVar.a(bVar.e, bVar.f);
                    this.R = pVar;
                }
                com.tencent.liteav.beauty.b.p pVar2 = this.R;
                GLES20.glViewport(0, 0, bVar.e, bVar.f);
                pVar2.a(bVar.e, bVar.f);
                if (tXSVideoFrame.data != null) {
                    pVar2.a(tXSVideoFrame.data);
                } else {
                    pVar2.a(tXSVideoFrame.buffer);
                }
                bVar.a = pVar2.r();
            }
        }
        if (!this.M || this.y == null || (gLSurfaceView = this.y.getGLSurfaceView()) == null) {
            return;
        }
        gLSurfaceView.d();
    }

    public void a(float f, float f2) {
        if (this.e == null || !this.q.K) {
            return;
        }
        this.e.a(f, f2);
    }

    public void l(final int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i > 2) {
            i = 2;
        }
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.d.16
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.i.encoderMode == i) {
                    return;
                }
                d.this.i.encoderMode = i;
                d.this.m.encoderMode = i;
                d.this.B();
                d.this.A();
            }
        };
        if (this.e == null) {
            runnable.run();
        } else {
            this.e.a(runnable);
        }
    }

    private void a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.d.a(runnable);
        } else {
            runnable.run();
        }
    }
}
