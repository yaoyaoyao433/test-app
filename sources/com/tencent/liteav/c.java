package com.tencent.liteav;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.dianping.shield.entity.ExposeAction;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.capturer.a;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c implements com.tencent.liteav.basic.c.b, com.tencent.liteav.basic.opengl.o, com.tencent.liteav.capturer.b, q {
    WeakReference<com.tencent.liteav.basic.c.b> a;
    private Context b;
    private r d;
    private boolean e;
    private i f;
    private com.tencent.liteav.basic.opengl.n h;
    private long k;
    private int g = 0;
    private boolean i = false;
    private long j = 0;
    private long l = 0;
    private int m = 0;
    private Object n = new Object();
    private HandlerThread o = null;
    private Handler p = null;
    private String q = "";
    private boolean r = true;
    private final com.tencent.liteav.capturer.a c = new com.tencent.liteav.capturer.a();

    public c(Context context, i iVar, com.tencent.liteav.basic.opengl.n nVar, boolean z) {
        this.h = null;
        try {
            this.f = (i) iVar.clone();
        } catch (CloneNotSupportedException e) {
            this.f = new i();
            e.printStackTrace();
        }
        this.b = context;
        this.h = nVar;
        this.h.setSurfaceTextureListener(this);
        this.f.W = z;
        this.c.b(this.f.U);
        TXCLog.i("TXCCameraCaptureSource", "camera capture with nv21: %b", Boolean.valueOf(this.f.W));
    }

    @Override // com.tencent.liteav.q
    public void a() {
        Monitor.a(2, String.format("VideoCapture[%d]: start camera", Integer.valueOf(hashCode())), "", 0);
        TXCLog.i("CameraCapture", "start->enter with getSurfaceTexture:" + this.h.getSurfaceTexture());
        this.h.a(this.f.h, true ^ this.f.W);
        a(this.h.getSurfaceTexture());
    }

    @Override // com.tencent.liteav.q
    public void a(boolean z) {
        Monitor.a(2, String.format("VideoCapture[%d]: stop camera", Integer.valueOf(hashCode())), "", 0);
        c();
        this.h.a();
        synchronized (this.n) {
            if (this.p != null) {
                this.p.removeCallbacksAndMessages(null);
            }
            if (this.o != null) {
                TXCLog.w("CameraCapture", "stop camera monitor ");
                this.o.quit();
                this.o = null;
                this.p = null;
            }
        }
    }

    @Override // com.tencent.liteav.q
    public void a(String str) {
        this.q = str;
    }

    @Override // com.tencent.liteav.q
    public void b() {
        TXCLog.i("CameraCapture", "startCapture->enter with getSurfaceTexture:" + this.h.getSurfaceTexture());
        a(this.h.getSurfaceTexture());
    }

    @Override // com.tencent.liteav.q
    public void c() {
        TXCLog.i("CameraCapture", "stopCapture->enter with null");
        this.c.a((com.tencent.liteav.capturer.b) null);
        this.c.g();
        this.e = false;
    }

    @Override // com.tencent.liteav.q
    public void b(boolean z) {
        if (!this.e || this.c == null) {
            return;
        }
        this.f.m = z ? !this.f.m : this.f.m;
        this.c.g();
        this.h.a(false);
        this.c.a(this.f.h);
        this.c.c(this.f.l);
        this.c.a(n());
        this.c.a(this.f.W, this.f.a, this.f.b);
        this.c.a(this);
        this.c.a(this.h.getSurfaceTexture());
        TXCLog.i("CameraCapture", String.format("vsize refreshCapture w*h:%d*%d orientation:%d", Integer.valueOf(this.f.a), Integer.valueOf(this.f.b), Integer.valueOf(this.f.l)));
        if (this.c.d(this.f.m) == 0) {
            this.e = true;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(hashCode());
            objArr[1] = this.f.m ? "front" : "back";
            Monitor.a(2, String.format("VideoCapture[%d]: start %s camera successfully", objArr), "", 0);
            a(1003, "Enabled camera successfully");
        } else {
            this.e = false;
            a(-1301, "Failed to open the camera, please confirm whether the camera permission is turned on");
        }
        this.i = false;
    }

    @Override // com.tencent.liteav.q
    public boolean d() {
        return this.e;
    }

    @Override // com.tencent.liteav.q
    public int e() {
        return this.c.f();
    }

    @Override // com.tencent.liteav.q
    public boolean a(int i) {
        return this.c.b(i);
    }

    @Override // com.tencent.liteav.q
    public void a(int i, int i2) {
        this.c.a(i, i2);
    }

    @Override // com.tencent.liteav.q
    public void a(float f) {
        this.c.a(f);
    }

    @Override // com.tencent.liteav.q
    public void b(int i) {
        this.g = i;
    }

    @Override // com.tencent.liteav.q
    public void c(int i) {
        if (this.h != null) {
            this.h.setRendMode(i);
        }
    }

    @Override // com.tencent.liteav.q
    public void d(int i) {
        if (this.h != null) {
            this.h.setRendMirror(i);
        }
    }

    @Override // com.tencent.liteav.q
    public void a(r rVar) {
        this.d = rVar;
    }

    @Override // com.tencent.liteav.q
    public void c(final boolean z) {
        a(new Runnable() { // from class: com.tencent.liteav.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.f.S = z;
            }
        });
    }

    @Override // com.tencent.liteav.q
    public boolean d(boolean z) {
        return this.c.a(z);
    }

    @Override // com.tencent.liteav.q
    public void a(com.tencent.liteav.basic.structs.b bVar) {
        if (this.h != null) {
            this.h.a(bVar.a, bVar.i, this.g, bVar.e, bVar.f, this.c.i());
        }
    }

    @Override // com.tencent.liteav.q
    public void a(Runnable runnable) {
        this.h.a(runnable);
    }

    @Override // com.tencent.liteav.q
    public EGLContext f() {
        return this.h.getGLContext();
    }

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(int i, Bundle bundle) {
        com.tencent.liteav.basic.util.g.a(this.a, i, bundle);
    }

    @Override // com.tencent.liteav.q
    public void a(com.tencent.liteav.basic.c.b bVar) {
        this.a = new WeakReference<>(bVar);
    }

    @Override // com.tencent.liteav.q
    public void e(int i) {
        this.f.l = i;
        this.c.c(this.f.l);
        this.r = true;
        TXCLog.i("CameraCapture", String.format("vsize setCaptureOrientation w*h:%d*%d orientation:%d", Integer.valueOf(this.f.a), Integer.valueOf(this.f.b), Integer.valueOf(this.f.l)));
    }

    @Override // com.tencent.liteav.q
    public void a(com.tencent.liteav.basic.b.c cVar) {
        this.f.k = cVar;
        this.r = true;
    }

    @Override // com.tencent.liteav.q
    public void b(int i, int i2) {
        this.f.a = i;
        this.f.b = i2;
        this.r = true;
        TXCLog.i("CameraCapture", String.format("vsize setVideoEncSize w*h:%d*%d orientation:%d", Integer.valueOf(this.f.a), Integer.valueOf(this.f.b), Integer.valueOf(this.f.l)));
    }

    @Override // com.tencent.liteav.q
    public void f(int i) {
        this.f.h = i;
        if (this.c != null) {
            this.c.a(i);
        }
        if (this.h == null || !(this.h instanceof TXCGLSurfaceView)) {
            return;
        }
        ((TXCGLSurfaceView) this.h).setFPS(i);
    }

    @Override // com.tencent.liteav.q
    public void a(float f, float f2) {
        if (this.c == null || !this.f.K) {
            return;
        }
        this.c.a(f, f2);
    }

    @Override // com.tencent.liteav.q
    public int g() {
        return this.f.h;
    }

    @Override // com.tencent.liteav.q
    public boolean h() {
        if (this.c != null) {
            return this.c.b();
        }
        return false;
    }

    @Override // com.tencent.liteav.q
    public boolean i() {
        if (this.c != null) {
            return this.c.c();
        }
        return false;
    }

    @Override // com.tencent.liteav.q
    public boolean j() {
        if (this.c != null) {
            return this.c.d();
        }
        return false;
    }

    @Override // com.tencent.liteav.q
    public boolean k() {
        if (this.c != null) {
            return this.c.e();
        }
        return false;
    }

    @Override // com.tencent.liteav.q
    public boolean l() {
        if (this.c != null) {
            return this.c.i();
        }
        return false;
    }

    private void a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null || this.e || this.c == null) {
            return;
        }
        this.c.a(this);
        this.c.a(surfaceTexture);
        this.c.a(this.f.h);
        this.c.c(this.f.l);
        this.c.c(this.f.K);
        this.c.a(n());
        this.c.a(this.f.W, this.f.a, this.f.b);
        TXCLog.i("CameraCapture", String.format("vsize startCapture w*h:%d*%d orientation:%d", Integer.valueOf(this.f.a), Integer.valueOf(this.f.b), Integer.valueOf(this.f.l)));
        if (this.c.d(this.f.m) == 0) {
            this.e = true;
            this.k = System.currentTimeMillis();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(hashCode());
            objArr[1] = this.f.m ? "front" : "back";
            Monitor.a(2, String.format("VideoCapture[%d]: start %s camera successfully", objArr), "", 0);
            a(1003, "Enabled camera successfully");
            this.i = false;
            return;
        }
        this.e = false;
        a(-1301, "Failed to open camera, please confirm whether the camera permission is turned on");
    }

    private void a(int i, String str) {
        com.tencent.liteav.basic.util.g.a(this.a, i, str);
    }

    @Override // com.tencent.liteav.basic.opengl.o
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        TXCLog.i("CameraCapture", "onSurfaceTextureAvailable->enter with mListener:" + this.d);
        a(surfaceTexture);
        if (this.d != null) {
            this.d.a(surfaceTexture);
        }
    }

    @Override // com.tencent.liteav.basic.opengl.o
    public void onSurfaceTextureDestroy(SurfaceTexture surfaceTexture) {
        c();
        TXCLog.i("CameraCapture", "onSurfaceTextureDestroy->enter with mListener:" + this.d);
        if (this.d != null) {
            this.d.t();
        }
    }

    @Override // com.tencent.liteav.basic.opengl.o
    public int onTextureProcess(int i, float[] fArr) {
        a(i, null, fArr, 4);
        return 0;
    }

    @Override // com.tencent.liteav.basic.opengl.o
    public void onBufferProcess(byte[] bArr, float[] fArr) {
        a(-1, bArr, fArr, 3);
    }

    private void a(int i, byte[] bArr, float[] fArr, int i2) {
        if (this.e) {
            if (!this.i) {
                Monitor.a(2, String.format("VideoCapture[%d]: capture first frame", Integer.valueOf(hashCode())), "", 0);
                com.tencent.liteav.basic.util.g.a(this.a, 1007, "First frame capture completed");
                this.i = true;
                this.r = true;
                TXCLog.i("CameraCapture", "trtc_render: render first frame");
            }
            com.tencent.liteav.basic.structs.b bVar = new com.tencent.liteav.basic.structs.b();
            bVar.e = this.c.j();
            bVar.f = this.c.k();
            bVar.g = this.f.a;
            bVar.h = this.f.b;
            bVar.j = this.c.h();
            bVar.i = this.c.i() ? !this.f.S : this.f.S;
            bVar.a = i;
            bVar.c = fArr;
            bVar.d = this.f.W;
            bVar.m = bArr;
            bVar.b = i2;
            if (bVar.j == 0 || bVar.j == 180) {
                bVar.g = this.f.b;
                bVar.h = this.f.a;
            } else {
                bVar.g = this.f.a;
                bVar.h = this.f.b;
            }
            bVar.l = com.tencent.liteav.basic.util.g.a(bVar.e, bVar.f, this.f.b, this.f.a);
            if (this.d != null) {
                this.d.b(bVar);
            }
            if (this.r) {
                this.r = false;
                TXCLog.i("CameraCapture", String.format("vsize onCaptureFrame w*h:%d*%d angle:%d", Integer.valueOf(bVar.g), Integer.valueOf(bVar.h), Integer.valueOf(bVar.j)));
            }
            this.j++;
            long currentTimeMillis = System.currentTimeMillis() - this.k;
            if (currentTimeMillis >= 1000) {
                TXCStatus.a(this.q, 1001, this.m, Double.valueOf(((this.j - this.l) * 1000.0d) / currentTimeMillis));
                this.l = this.j;
                this.k += currentTimeMillis;
            }
        }
    }

    private a.EnumC1450a n() {
        if (this.f.T) {
            return a.EnumC1450a.RESOLUTION_HIGHEST;
        }
        switch (this.f.k) {
            case RESOLUTION_TYPE_INVALID:
                return a.EnumC1450a.RESOLUTION_INVALID;
            case RESOLUTION_TYPE_360_640:
                return a.EnumC1450a.RESOLUTION_360_640;
            case RESOLUTION_TYPE_540_960:
                return a.EnumC1450a.RESOLUTION_540_960;
            case RESOLUTION_TYPE_1080_1920:
                return a.EnumC1450a.RESOLUTION_1080_1920;
            case RESOLUTION_TYPE_320_480:
                return a.EnumC1450a.RESOLUTION_320_480;
            default:
                return a.EnumC1450a.RESOLUTION_720_1280;
        }
    }

    @Override // com.tencent.liteav.capturer.b
    public void a(byte[] bArr) {
        if (this.h != null) {
            this.h.a(bArr);
        }
    }

    @Override // com.tencent.liteav.capturer.b
    public void m() {
        if (this.c.l() != null) {
            this.c.g();
        }
        synchronized (this.n) {
            if (this.o == null) {
                this.o = new HandlerThread("cameraMonitorThread");
                this.o.start();
                this.p = new Handler(this.o.getLooper());
                TXCLog.w("CameraCapture", "start camera monitor ");
            }
            if (this.p != null) {
                this.p.postDelayed(new Runnable() { // from class: com.tencent.liteav.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!c.this.d() || !c.this.o() || c.this.c.l() != null) {
                                if (c.this.p != null) {
                                    c.this.p.postDelayed(this, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                                    return;
                                }
                                return;
                            }
                            TXCLog.w("CameraCapture", "camera monitor restart capture");
                            c.this.c.g();
                            c.this.h.a(false);
                            c.this.c.a(c.this.f.h);
                            c.this.c.a(c.this.f.W, c.this.f.a, c.this.f.b);
                            c.this.c.a(c.this.h.getSurfaceTexture());
                            c.this.c.d(c.this.f.m);
                        } catch (Exception unused) {
                            TXCLog.w("CameraCapture", "camera monitor exception ");
                        }
                    }
                }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            }
        }
    }

    @Override // com.tencent.liteav.q
    public void g(int i) {
        this.m = i;
    }

    @Override // com.tencent.liteav.q
    public void e(boolean z) {
        this.f.U = z;
        this.c.b(z);
        this.r = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        try {
            if (this.b != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    TXCLog.w("CameraCapture", "List of RunningAppProcessInfo is null");
                    return false;
                }
                for (int i = 0; i < runningAppProcesses.size(); i++) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                    if (runningAppProcessInfo == null) {
                        TXCLog.w("CameraCapture", "ActivityManager.RunningAppProcessInfo is null");
                    } else if (runningAppProcessInfo.processName.equals(this.b.getPackageName()) && runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
