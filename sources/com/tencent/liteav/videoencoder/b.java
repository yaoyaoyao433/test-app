package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import android.os.Bundle;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.common.CommonConstant;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.g;
import com.tencent.liteav.basic.util.h;
import com.tencent.liteav.beauty.b.p;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends com.tencent.liteav.basic.module.a {
    private static Integer s = 1;
    private static final String v = b.class.getSimpleName();
    private static int w = 0;
    private int f;
    private TXSVideoEncoderParam k;
    private com.tencent.liteav.basic.opengl.b q;
    private h r;
    private boolean t;
    private p u;
    private final com.tencent.liteav.basic.util.c a = new com.tencent.liteav.basic.util.c("video-encoder", (int) TimeUnit.SECONDS.toMillis(5));
    private c b = null;
    private d c = null;
    private WeakReference<com.tencent.liteav.basic.c.b> d = null;
    private int e = 0;
    private int g = 1;
    private Timer h = null;
    private TimerTask i = null;
    private LinkedList<Runnable> j = new LinkedList<>();
    private float l = 0.0f;
    private float m = 0.0f;
    private float n = 0.0f;
    private int o = 0;
    private int p = 0;

    static /* synthetic */ int k(b bVar) {
        int i = bVar.o + 1;
        bVar.o = i;
        return i;
    }

    public b(int i) {
        this.f = 2;
        this.f = i;
    }

    public int a(TXSVideoEncoderParam tXSVideoEncoderParam) {
        int i;
        this.k = tXSVideoEncoderParam;
        int d = tXSVideoEncoderParam.enableBlackList ? com.tencent.liteav.basic.d.c.a().d() : 2;
        if (this.f == 1 && d != 0) {
            this.b = new com.tencent.liteav.videoencoder.a();
            this.g = 1;
            a(1008, "Enables hardware encoding", 1);
        } else if (this.f == 3 && tXSVideoEncoderParam.width == 720 && tXSVideoEncoderParam.height == 1280 && d != 0) {
            this.b = new com.tencent.liteav.videoencoder.a();
            this.g = 1;
            a(1008, "Enables hardware encoding", 1);
        } else {
            this.b = new TXCSWVideoEncoder();
            this.g = 2;
            a(1008, "Enables software encoding", 2);
        }
        setStatusValue(MapConstant.LayerPropertyFlag_TextPitchAlignment, Long.valueOf(this.g));
        if (this.b != null) {
            if (this.c != null) {
                this.b.setListener(this.c);
            }
            if (this.e != 0) {
                this.b.setBitrate(this.e);
            }
            this.b.setID(getID());
            i = this.b.start(tXSVideoEncoderParam);
            if (i != 0) {
                String str = this.g == 1 ? "hw" : "sw";
                String str2 = v;
                TXCLog.i(str2, "start video encode " + str);
                return i;
            }
        } else {
            i = 10000002;
        }
        if (this.f == 3) {
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            this.o = 0;
            this.p = com.tencent.liteav.basic.d.c.a().i();
            g();
        }
        return i;
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        if (this.b != null) {
            this.b.setID(str);
        }
        setStatusValue(MapConstant.LayerPropertyFlag_TextPitchAlignment, Long.valueOf(this.g));
    }

    public EGLContext a(final int i, final int i2) {
        if (!this.t) {
            this.t = true;
            synchronized (s) {
                StringBuilder sb = new StringBuilder("CVGLThread");
                Integer num = s;
                s = Integer.valueOf(s.intValue() + 1);
                sb.append(num);
                this.r = new h(sb.toString());
            }
            final boolean[] zArr = new boolean[1];
            this.r.a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.q = com.tencent.liteav.basic.opengl.b.a(null, null, null, i, i2);
                    zArr[0] = b.this.q != null;
                }
            });
            if (zArr[0]) {
                return this.q.d();
            }
            return null;
        } else if (this.q != null) {
            return this.q.d();
        } else {
            return null;
        }
    }

    protected void a(Runnable runnable) {
        synchronized (this.j) {
            this.j.add(runnable);
        }
    }

    private boolean a(Queue<Runnable> queue) {
        synchronized (queue) {
            if (queue.isEmpty()) {
                return false;
            }
            Runnable poll = queue.poll();
            if (poll == null) {
                return false;
            }
            poll.run();
            return true;
        }
    }

    public long a(final byte[] bArr, final int i, final int i2, final int i3, final long j) {
        if (this.q == null) {
            return -1L;
        }
        this.r.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.u == null || b.this.u.o() != i2 || b.this.u.p() != i3) {
                    if (b.this.u != null) {
                        b.this.u.e();
                        b.this.u = null;
                    }
                    b.this.u = new p(i);
                    if (!b.this.u.c()) {
                        if (b.this.q != null) {
                            b.this.q.c();
                            b.this.q = null;
                        }
                        b.this.u = null;
                        return;
                    }
                    b.this.u.a(true);
                    b.this.u.a(i2, i3);
                }
                b.this.u.a(bArr);
                GLES20.glViewport(0, 0, i2, i3);
                int r = b.this.u.r();
                GLES20.glFlush();
                b.this.a(r, i2, i3, j);
            }
        });
        return 0L;
    }

    public void a() {
        if (this.r != null) {
            final com.tencent.liteav.basic.opengl.b bVar = this.q;
            this.r.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.3
                @Override // java.lang.Runnable
                public void run() {
                    b.this.j.clear();
                    if (b.this.b != null) {
                        b.this.b.stop();
                    }
                    if (b.this.u != null) {
                        b.this.u.e();
                        b.this.u = null;
                    }
                    if (bVar != null) {
                        bVar.c();
                    }
                }
            });
            this.r = null;
            this.q = null;
        } else {
            this.j.clear();
            if (this.b != null) {
                this.b.stop();
            }
        }
        if (this.f == 3) {
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            this.o = 0;
            h();
        }
        this.c = null;
        this.e = 0;
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.setRotation(i);
        }
    }

    public void a(boolean z) {
        if (this.b != null) {
            this.b.setXMirror(z);
        }
    }

    public void b(boolean z) {
        if (this.b != null) {
            this.b.setGLFinishedTextureNeed(z);
        }
    }

    public long a(int i, int i2, int i3, long j) {
        this.a.a();
        do {
        } while (a(this.j));
        if (this.b != null) {
            setStatusValue(MapConstant.LayerPropertyFlag_MarkerAvoidScreen, Long.valueOf(e()));
            setStatusValue(MapConstant.LayerPropertyFlag_MarkerSpacing, this.k.streamType, Double.valueOf(d()));
            if (this.g == 1) {
                setStatusValue(8002, this.k.streamType, Integer.valueOf(f()));
            }
            return this.b.pushVideoFrame(i, i2, i3, j);
        }
        return 10000002L;
    }

    public long b(int i, int i2, int i3, long j) {
        this.a.a();
        do {
        } while (a(this.j));
        if (this.b != null) {
            setStatusValue(MapConstant.LayerPropertyFlag_MarkerAvoidScreen, Long.valueOf(e()));
            setStatusValue(MapConstant.LayerPropertyFlag_MarkerSpacing, this.k.streamType, Double.valueOf(d()));
            if (this.g == 1) {
                setStatusValue(8002, this.k.streamType, Integer.valueOf(f()));
            }
            return this.b.pushVideoFrameAsync(i, i2, i3, j);
        }
        return 10000002L;
    }

    public long c(int i, int i2, int i3, long j) {
        this.a.a();
        do {
        } while (a(this.j));
        if (this.b != null) {
            setStatusValue(MapConstant.LayerPropertyFlag_MarkerAvoidScreen, Long.valueOf(e()));
            setStatusValue(MapConstant.LayerPropertyFlag_MarkerSpacing, this.k.streamType, Double.valueOf(d()));
            return this.b.pushVideoFrameSync(i, i2, i3, j);
        }
        return 10000002L;
    }

    public boolean b(int i) {
        if (this.b != null) {
            this.b.setFPS(i);
            return true;
        }
        return false;
    }

    public void b() {
        if (this.b != null) {
            this.b.restartIDR();
        }
    }

    public void c() {
        if (this.b != null) {
            this.b.signalEOSAndFlush();
        }
    }

    public void a(com.tencent.liteav.basic.c.b bVar) {
        this.d = new WeakReference<>(bVar);
    }

    public void a(d dVar) {
        this.c = dVar;
        a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.4
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b != null) {
                    b.this.b.setListener(b.this.c);
                }
            }
        });
    }

    public void c(int i) {
        this.e = i;
        a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.5
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b != null) {
                    b.this.b.setBitrate(b.this.e);
                }
            }
        });
    }

    public boolean b(int i, int i2) {
        if (this.b != null) {
            this.e = i;
            this.b.setBitrateFromQos(i, i2);
            return true;
        }
        return false;
    }

    public boolean d(int i) {
        if (this.b != null) {
            this.b.setEncodeIdrFpsFromQos(i);
            return true;
        }
        return false;
    }

    public void e(final int i) {
        a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b != null) {
                    b.this.b.enableNearestRPS(i);
                }
            }
        });
    }

    public double d() {
        if (this.b != null) {
            return this.b.getRealFPS();
        }
        return 0.0d;
    }

    public long e() {
        if (this.b != null) {
            return this.b.getRealBitrate();
        }
        return 0L;
    }

    public int f() {
        if (this.b != null) {
            return this.b.getEncodeCost();
        }
        return 0;
    }

    private void g() {
        if (this.i == null) {
            this.i = new a(this);
        }
        this.h = new Timer();
        this.h.schedule(this.i, 1000L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.h != null) {
            this.h.cancel();
            this.h = null;
        }
        if (this.i != null) {
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        com.tencent.liteav.basic.c.b bVar;
        if (this.d == null || (bVar = this.d.get()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putCharSequence("EVT_MSG", str);
        bVar.onNotifyEvent(i, bundle);
    }

    private void a(int i, String str, int i2) {
        com.tencent.liteav.basic.c.b bVar;
        if (this.d == null || (bVar = this.d.get()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putCharSequence("EVT_MSG", str);
        bundle.putInt("EVT_PARAM1", i2);
        bVar.onNotifyEvent(i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.7
            @Override // java.lang.Runnable
            public void run() {
                b.this.a(1107, "Switches from software encoding to hardware encoding");
                if (b.this.b != null) {
                    b.this.b.setListener(null);
                    b.this.b.stop();
                }
                b.this.b = new com.tencent.liteav.videoencoder.a();
                b.this.g = 1;
                b.this.setStatusValue(MapConstant.LayerPropertyFlag_TextPitchAlignment, Long.valueOf(b.this.g));
                b.this.b.start(b.this.k);
                if (b.this.c != null) {
                    b.this.b.setListener(b.this.c);
                }
                if (b.this.e != 0) {
                    b.this.b.setBitrate(b.this.e);
                }
                b.this.b.setID(b.this.getID());
            }
        });
        TXCLog.w("TXCVideoEncoder", "switchSWToHW");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends TimerTask {
        private WeakReference<b> a;

        public a(b bVar) {
            this.a = new WeakReference<>(bVar);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b bVar;
            if (this.a == null || (bVar = this.a.get()) == null) {
                return;
            }
            if (bVar.o >= bVar.p) {
                if (com.tencent.liteav.basic.d.c.a().a(bVar.l / bVar.p, bVar.m / bVar.p, bVar.n / bVar.p) && com.tencent.liteav.basic.d.c.a().d() != 0) {
                    Monitor.a(2, "VideoEncoder: Insufficient performance, switching software encoding to hardware encoding [appCPU:" + bVar.l + "][sysCPU:" + bVar.m + "][fps:" + bVar.n + "][checkCount:" + bVar.p + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, "", 0);
                    bVar.i();
                }
                bVar.h();
                return;
            }
            int[] a = g.a();
            b.k(bVar);
            bVar.l += a[0] / 10;
            bVar.m += a[1] / 10;
            bVar.n = (float) (bVar.n + ((bVar.d() * 100.0d) / bVar.k.fps));
        }
    }
}
