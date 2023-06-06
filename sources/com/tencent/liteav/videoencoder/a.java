package com.tencent.liteav.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.basic.opengl.l;
import com.tencent.liteav.basic.opengl.m;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends c {
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private j X;
    private ArrayList<Long> aa;
    private boolean o;
    private boolean p;
    private h t;
    private Object y;
    private int a = 0;
    private long b = 0;
    private double c = 0.0d;
    private long d = 0;
    private long e = 0;
    private int f = 0;
    private boolean g = false;
    private boolean h = true;
    private long i = 0;
    private long j = 0;
    private long k = 0;
    private long l = 0;
    private long m = 0;
    private long n = 0;
    private long q = 0;
    private long r = 0;
    private MediaCodec s = null;
    private Runnable u = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.10
        @Override // java.lang.Runnable
        public void run() {
            a.this.e();
        }
    };
    private Runnable v = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.11
        @Override // java.lang.Runnable
        public void run() {
            a.this.b(10);
        }
    };
    private Runnable w = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.2
        @Override // java.lang.Runnable
        public void run() {
            a.this.b(1);
        }
    };
    private ArrayDeque<Long> x = new ArrayDeque<>(10);
    private Surface z = null;
    private boolean A = true;
    private boolean B = true;
    private boolean C = false;
    private ByteBuffer[] D = null;
    private byte[] E = null;
    private volatile long F = 0;
    private long G = 0;
    private long H = 0;
    private boolean O = true;
    private boolean P = false;
    private int Q = 0;
    private int R = 0;
    private int S = 0;
    private long T = 0;
    private int U = 0;
    private int V = 0;
    private int W = -1;
    private final Object Y = new Object();
    private boolean Z = false;
    private int ab = 0;
    private boolean ac = true;
    private long ad = 0;
    private int ae = 3;
    private int af = 0;
    private boolean ag = false;
    private boolean ah = true;
    private long ai = 0;
    private Runnable aj = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.3
        @Override // java.lang.Runnable
        public void run() {
            a.this.ai = System.currentTimeMillis();
            a.this.b();
            a.this.d();
            a.this.c();
        }
    };

    @Override // com.tencent.liteav.videoencoder.c
    public void setEncodeIdrFpsFromQos(int i) {
    }

    static /* synthetic */ int d(a aVar) {
        int i = aVar.Q;
        aVar.Q = i + 1;
        return i;
    }

    public a() {
        this.t = null;
        this.t = new h("HWVideoEncoder");
    }

    @Override // com.tencent.liteav.videoencoder.c
    public int start(final TXSVideoEncoderParam tXSVideoEncoderParam) {
        boolean z;
        super.start(tXSVideoEncoderParam);
        if (Build.VERSION.SDK_INT < 18) {
            z = false;
        } else {
            this.t.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.1
                @Override // java.lang.Runnable
                public void run() {
                    String str = "unknown";
                    String str2 = "unknown";
                    switch (tXSVideoEncoderParam.encoderMode) {
                        case 1:
                            str = "CBR";
                            break;
                        case 2:
                            str = "VBR";
                            break;
                        case 3:
                            str = "CQ";
                            break;
                    }
                    switch (tXSVideoEncoderParam.encoderProfile) {
                        case 1:
                            str2 = "Baseline";
                            break;
                        case 2:
                            str2 = "Main";
                            break;
                        case 3:
                            str2 = "High";
                            break;
                    }
                    Object[] objArr = new Object[10];
                    objArr[0] = Integer.valueOf(a.this.hashCode());
                    objArr[1] = Integer.valueOf(tXSVideoEncoderParam.width);
                    objArr[2] = Integer.valueOf(tXSVideoEncoderParam.height);
                    objArr[3] = Integer.valueOf(tXSVideoEncoderParam.fps);
                    objArr[4] = Integer.valueOf(tXSVideoEncoderParam.bitrate);
                    objArr[5] = Integer.valueOf(tXSVideoEncoderParam.gop);
                    objArr[6] = str;
                    objArr[7] = str2;
                    objArr[8] = tXSVideoEncoderParam.bMultiRef ? "true" : "false";
                    objArr[9] = Integer.valueOf(tXSVideoEncoderParam.streamType);
                    String format = String.format("VideoEncoder[%d]: Start [type:hardware][resolution:%d*%d][fps:%d][bitrate:%dkbps][gop:%d][rateControl:%s][profile:%s][rps:%s][streamType:%d]", objArr);
                    Monitor.a(2, format, "", 0);
                    TXCLog.i("TXCHWVideoEncoder", "start:" + format);
                    if (a.this.mInit) {
                        a.this.e();
                    }
                    if (a.this.a(tXSVideoEncoderParam)) {
                        Monitor.a(2, String.format("VideoEncoder[%d]: Start successfully, streamType:%d", Integer.valueOf(a.this.hashCode()), Integer.valueOf(tXSVideoEncoderParam.streamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                    } else {
                        a.this.callDelegate(10000004);
                    }
                }
            });
            z = true;
        }
        return z ? 0 : 10000004;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void stop() {
        this.B = true;
        this.t.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.4
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.mInit) {
                    Monitor.a(2, String.format("VideoEncoder[%d]: Stop, streamType:%d", Integer.valueOf(a.this.hashCode()), Integer.valueOf(a.this.mStreamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                    a.this.e();
                }
            }
        });
        h();
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void setFPS(final int i) {
        this.t.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.5
            @Override // java.lang.Runnable
            public void run() {
                a.this.d(i);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void setBitrate(final int i) {
        this.a = i;
        this.t.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.6
            @Override // java.lang.Runnable
            public void run() {
                a.this.c(i);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void setBitrateFromQos(final int i, int i2) {
        this.a = i;
        this.t.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.7
            @Override // java.lang.Runnable
            public void run() {
                a.this.c(i);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.c
    public double getRealFPS() {
        return this.c;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public long getRealBitrate() {
        return this.b;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public int getEncodeCost() {
        return this.ab;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void setGLFinishedTextureNeed(boolean z) {
        this.ac = z;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public long pushVideoFrame(int i, int i2, int i3, long j) {
        int a;
        if (this.B) {
            return 10000004L;
        }
        synchronized (this.Y) {
            if (this.X == null) {
                a(i2, i3);
            }
            this.X.a(i2, i3);
            GLES20.glViewport(0, 0, i2, i3);
            a = this.X.a(i);
            if (this.ac) {
                GLES20.glFinish();
            } else {
                GLES20.glFlush();
            }
        }
        this.S++;
        this.F = j;
        this.W = a;
        this.mInputWidth = i2;
        this.mInputHeight = i3;
        if (this.N) {
            f();
        }
        if (!this.O || this.Z) {
            this.V++;
            this.t.b(this.v);
            this.Z = false;
        }
        if (this.Q > this.R + 30) {
            TXCLog.e("TXCHWVideoEncoder", String.format("hw encoder error when render[%d] pop[%d]", Integer.valueOf(this.Q), Integer.valueOf(this.R)));
            if (this.mListener != null) {
                this.mListener.onRestartEncoder(this.mStreamType);
            }
        }
        if (this.T + MetricsAnrManager.ANR_THRESHOLD < System.currentTimeMillis()) {
            this.T = System.currentTimeMillis();
            if (this.U != 0 && this.U == this.Q) {
                TXCLog.i("TXCHWVideoEncoder", String.format("hw encoder error when push[%d] render task[%d] render[%d] pop[%d]", Integer.valueOf(this.S), Integer.valueOf(this.V), Integer.valueOf(this.Q), Integer.valueOf(this.R)));
                if (this.mListener != null) {
                    this.mListener.onRestartEncoder(this.mStreamType);
                }
            }
            this.U = this.Q;
            return 0L;
        }
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public long pushVideoFrameAsync(final int i, int i2, int i3, final long j) {
        if (this.B) {
            return 10000004L;
        }
        if (this.ac) {
            GLES20.glFinish();
        } else {
            GLES20.glFlush();
        }
        if (this.N) {
            f();
        }
        this.t.a().post(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.8
            @Override // java.lang.Runnable
            public void run() {
                int a;
                if (a.this.A || a.this.y == null) {
                    return;
                }
                int i4 = i;
                long j2 = j;
                a.this.a(j2);
                int i5 = (720 - a.this.mRotation) % 360;
                a.this.mEncodeFilter.a(a.this.mInputWidth, a.this.mInputHeight, i5, null, ((i5 == 90 || i5 == 270) ? a.this.mOutputHeight : a.this.mOutputWidth) / ((i5 == 90 || i5 == 270) ? a.this.mOutputWidth : a.this.mOutputHeight), a.this.mEnableXMirror, true);
                a.this.mEncodeFilter.b(i4);
                if (a.this.y instanceof com.tencent.liteav.basic.opengl.c) {
                    ((com.tencent.liteav.basic.opengl.c) a.this.y).a(j2 * 1000000);
                    ((com.tencent.liteav.basic.opengl.c) a.this.y).e();
                }
                if (a.this.y instanceof com.tencent.liteav.basic.opengl.b) {
                    ((com.tencent.liteav.basic.opengl.b) a.this.y).a();
                }
                if (a.this.mListener != null) {
                    a.this.mListener.onEncodeDataIn(a.this.mStreamType);
                }
                do {
                    a = a.this.a(1);
                } while (a > 0);
                if (a == -1 || a == -2) {
                    if (a == -1) {
                        a.this.callDelegate(10000005);
                    }
                    a.this.A = true;
                    a.this.e();
                    return;
                }
                a.d(a.this);
            }
        });
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public long pushVideoFrameSync(int i, int i2, int i3, long j) {
        if (this.B) {
            return 10000004L;
        }
        if (this.ac) {
            GLES20.glFinish();
        } else {
            GLES20.glFlush();
        }
        this.F = j;
        this.W = i;
        if (this.N) {
            f();
        }
        this.t.a(this.w);
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void signalEOSAndFlush() {
        if (this.B) {
            return;
        }
        this.t.a(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.9
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.s == null) {
                    return;
                }
                try {
                    a.this.s.signalEndOfInputStream();
                } catch (Exception e) {
                    TXCLog.e("TXCHWVideoEncoder", "signalEndOfInputStream failed.", e);
                }
                do {
                } while (a.this.a(10) >= 0);
                a.this.e();
            }
        });
    }

    @TargetApi(16)
    private MediaFormat a(int i, int i2, int i3, int i4, int i5) {
        if (i == 0 || i2 == 0 || i3 == 0 || i4 == 0) {
            return null;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        createVideoFormat.setInteger("bitrate", i3 * 1024);
        createVideoFormat.setInteger("frame-rate", i4);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("i-frame-interval", i5);
        return createVideoFormat;
    }

    @TargetApi(16)
    private MediaFormat a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        MediaCodecInfo a;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaFormat a2 = a(i, i2, i3, i4, i5);
        if (a2 == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 21 || (a = a("video/avc")) == null) {
            return a2;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = a.getCapabilitiesForType("video/avc");
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        if (z) {
            a2.setInteger("bitrate-mode", i6);
        } else if (encoderCapabilities.isBitrateModeSupported(i6)) {
            a2.setInteger("bitrate-mode", i6);
        } else if (this.N) {
            if (encoderCapabilities.isBitrateModeSupported(1)) {
                a2.setInteger("bitrate-mode", 1);
            } else if (encoderCapabilities.isBitrateModeSupported(2)) {
                a2.setInteger("bitrate-mode", 2);
            }
        } else if (encoderCapabilities.isBitrateModeSupported(2)) {
            a2.setInteger("bitrate-mode", 2);
        }
        a2.setInteger("complexity", encoderCapabilities.getComplexityRange().clamp(5).intValue());
        if (Build.VERSION.SDK_INT >= 23) {
            int i8 = 0;
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                if (codecProfileLevel.profile <= i7 && codecProfileLevel.profile > i8) {
                    i8 = codecProfileLevel.profile;
                    a2.setInteger("profile", codecProfileLevel.profile);
                    a2.setInteger("level", codecProfileLevel.level);
                }
            }
        }
        return a2;
    }

    @TargetApi(16)
    private static MediaCodecInfo a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        this.x.add(Long.valueOf(j));
    }

    private long a() {
        Long poll = this.x.poll();
        if (poll == null) {
            return 0L;
        }
        return poll.longValue();
    }

    private boolean a(Surface surface, int i, int i2) {
        if (surface == null) {
            return false;
        }
        TXCLog.i("TXCHWVideoEncoder", "HWVideoEncode createGL: " + this.mGLContextExternal);
        if (this.mGLContextExternal != null && (this.mGLContextExternal instanceof EGLContext)) {
            this.y = com.tencent.liteav.basic.opengl.c.a(null, (EGLContext) this.mGLContextExternal, surface, i, i2);
        } else {
            this.y = com.tencent.liteav.basic.opengl.b.a(null, (javax.microedition.khronos.egl.EGLContext) this.mGLContextExternal, surface, i, i2);
        }
        if (this.y == null) {
            return false;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        this.mEncodeFilter = new j();
        this.mEncodeFilter.a(m.e, m.a(l.NORMAL, false, false));
        if (!this.mEncodeFilter.c()) {
            this.mEncodeFilter = null;
            return false;
        }
        GLES20.glViewport(0, 0, i, i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        TXCLog.i("TXCHWVideoEncoder", "HWVideoEncode destroyGL");
        if (this.mEncodeFilter != null) {
            this.mEncodeFilter.e();
            this.mEncodeFilter = null;
        }
        if (this.y instanceof com.tencent.liteav.basic.opengl.b) {
            ((com.tencent.liteav.basic.opengl.b) this.y).c();
            this.y = null;
        }
        if (this.y instanceof com.tencent.liteav.basic.opengl.c) {
            ((com.tencent.liteav.basic.opengl.c) this.y).d();
            this.y = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(18)
    public boolean a(TXSVideoEncoderParam tXSVideoEncoderParam) {
        int i;
        int i2;
        this.B = false;
        this.A = false;
        this.b = 0L;
        this.c = 0.0d;
        this.d = 0L;
        this.e = 0L;
        this.f = 0;
        this.i = 0L;
        this.j = tXSVideoEncoderParam.baseGopIndex;
        this.k = 0L;
        this.l = tXSVideoEncoderParam.baseFrameIndex;
        this.m = 0L;
        this.n = 0L;
        this.q = 0L;
        this.r = 0L;
        this.D = null;
        this.E = null;
        this.F = 0L;
        this.I = -1;
        this.mOutputWidth = tXSVideoEncoderParam.width;
        this.mOutputHeight = tXSVideoEncoderParam.height;
        this.J = tXSVideoEncoderParam.gop;
        this.K = tXSVideoEncoderParam.fps;
        TXCLog.i("TXCHWVideoEncoder", "init with fps " + this.K);
        this.N = tXSVideoEncoderParam.fullIFrame;
        this.p = tXSVideoEncoderParam.syncOutput;
        this.C = tXSVideoEncoderParam.enableEGL14;
        this.P = tXSVideoEncoderParam.forceSetBitrateMode;
        this.x.clear();
        this.O = tXSVideoEncoderParam.bLimitFps;
        if (tXSVideoEncoderParam == null || tXSVideoEncoderParam.width == 0 || tXSVideoEncoderParam.height == 0 || tXSVideoEncoderParam.fps == 0 || tXSVideoEncoderParam.gop == 0) {
            this.A = true;
            return false;
        }
        this.g = tXSVideoEncoderParam.annexb;
        this.h = tXSVideoEncoderParam.appendSpsPps;
        if (this.a == 0) {
            this.a = (int) (Math.sqrt((tXSVideoEncoderParam.width * tXSVideoEncoderParam.width * 1.0d) + (tXSVideoEncoderParam.height * tXSVideoEncoderParam.height)) * 1.2d);
        }
        this.i = this.a;
        this.f = tXSVideoEncoderParam.fps;
        switch (tXSVideoEncoderParam.encoderMode) {
            case 1:
            default:
                i = 2;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 0;
                break;
        }
        TXCLog.i("TXCHWVideoEncoder", "[Encoder] HWEncValue: " + com.tencent.liteav.basic.d.c.a().d());
        if (tXSVideoEncoderParam.encoderProfile == 2) {
            TXCLog.w("TXCHWVideoEncoder", "[Encoder] force reset profile to high. android is't support main profile.");
            tXSVideoEncoderParam.encoderProfile = 3;
        }
        if (com.tencent.liteav.basic.d.c.a().d() == 1) {
            TXCLog.e("TXCHWVideoEncoder", "[Encoder] force reset profile to baseline. device:" + TXCCommonUtil.getDeviceInfo());
            tXSVideoEncoderParam.encoderProfile = 1;
        }
        if (!com.tencent.liteav.basic.d.c.a().h()) {
            TXCLog.e("TXCHWVideoEncoder", "[Encoder] force reset profile to baseline. this cmd from config.");
            tXSVideoEncoderParam.encoderProfile = 1;
        }
        if (!com.tencent.liteav.basic.d.c.a().m()) {
            TXCLog.e("TXCHWVideoEncoder", "[Encoder] force set profile to baseline. this cmd from local.");
            tXSVideoEncoderParam.encoderProfile = 1;
        }
        switch (tXSVideoEncoderParam.encoderProfile) {
            case 1:
            default:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 64;
                break;
        }
        this.L = i;
        this.M = i2;
        if (c()) {
            this.mInit = true;
            if (this.O) {
                this.W = -1;
                this.t.b(this.v);
            }
            this.aa = new ArrayList<>();
            this.ab = 0;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:19|(9:30|(2:38|(8:(2:44|(2:46|(1:163)(2:54|55))(2:167|168))|56|57|(2:59|(3:61|(1:63)|64))(2:65|(3:67|(1:69)(1:71)|70)(25:72|(3:74|(1:76)(1:157)|77)(3:158|(1:160)|161)|78|(2:80|(1:82))|83|(4:87|(1:89)|90|(1:92))|93|(1:95)|96|(1:98)|99|(1:101)|102|(1:104)|105|(5:107|(1:109)(1:155)|110|(1:112)|113)(1:156)|114|(4:116|(4:119|(3:121|122|123)(1:125)|124|117)|126|127)|128|(1:130)|131|(1:133)(3:142|(3:144|(1:146)(1:149)|147)(3:150|(1:152)(1:154)|153)|148)|134|(2:136|(1:138)(1:140))(1:141)|139))|22|23|(1:25)|27))|169|57|(0)(0)|22|23|(0)|27)|21|22|23|(0)|27) */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0373, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0374, code lost:
        com.tencent.liteav.basic.log.TXCLog.e("TXCHWVideoEncoder", "releaseOutputBuffer failed." + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x036b A[Catch: IllegalStateException -> 0x0373, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x0373, blocks: (B:155:0x0367, B:157:0x036b), top: B:165:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(int r37) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.a.a(int):int");
    }

    private byte[] a(byte[] bArr) {
        int i;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 20];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 1) {
                i3 = a(i4, i2, bArr2, bArr, i3);
                i4 += 3;
            } else {
                if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 0 && bArr[i4 + 3] == 1) {
                    i3 = a(i4, i2, bArr2, bArr, i3);
                    i4 += 4;
                }
                if (i4 != length - 4 && (bArr[i4 + 1] != 0 || bArr[i4 + 2] != 0 || bArr[i4 + 3] != 1)) {
                    i = length;
                    break;
                }
                i4++;
            }
            i2 = i4;
            if (i4 != length - 4) {
            }
            i4++;
        }
        i = i4;
        int a = a(i, i2, bArr2, bArr, i3);
        byte[] bArr3 = new byte[a];
        System.arraycopy(bArr2, 0, bArr3, 0, a);
        return bArr3;
    }

    private int a(int i, int i2, byte[] bArr, byte[] bArr2, int i3) {
        if (i2 <= 0 || i <= i2) {
            return i3;
        }
        int i4 = i - i2;
        try {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[4]);
            wrap.asIntBuffer().put(i4);
            wrap.order(ByteOrder.BIG_ENDIAN);
            System.arraycopy(wrap.array(), 0, bArr, i3, 4);
            System.arraycopy(bArr2, i2, bArr, i3 + 4, i4);
            return i3 + i4 + 4;
        } catch (Exception unused) {
            TXCLog.e("TXCHWVideoEncoder", "setNalData exception");
            return i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[Catch: all -> 0x00b9, TryCatch #0 {, blocks: (B:9:0x000e, B:11:0x0015, B:13:0x0019, B:14:0x001b, B:16:0x001d, B:18:0x0031, B:20:0x0033, B:24:0x0047, B:29:0x0051, B:31:0x0056, B:33:0x0076, B:34:0x008b, B:36:0x0091, B:37:0x0098, B:30:0x0054, B:25:0x004a), top: B:54:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[Catch: all -> 0x00b9, TryCatch #0 {, blocks: (B:9:0x000e, B:11:0x0015, B:13:0x0019, B:14:0x001b, B:16:0x001d, B:18:0x0031, B:20:0x0033, B:24:0x0047, B:29:0x0051, B:31:0x0056, B:33:0x0076, B:34:0x008b, B:36:0x0091, B:37:0x0098, B:30:0x0054, B:25:0x004a), top: B:54:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    @android.annotation.TargetApi(18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r14) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.a.b(int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178 A[Catch: Exception -> 0x0170, TryCatch #0 {Exception -> 0x0170, blocks: (B:66:0x0166, B:68:0x016a, B:70:0x0172, B:72:0x0178, B:73:0x017d), top: B:88:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.a.c():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.s == null) {
            return;
        }
        try {
            try {
                try {
                    this.s.stop();
                    this.s.release();
                    if (this.z != null) {
                        this.z.release();
                    }
                    this.z = null;
                } catch (Exception e) {
                    TXCLog.e("TXCHWVideoEncoder", "release encoder failed.", e);
                }
            } catch (IllegalStateException e2) {
                TXCLog.e("TXCHWVideoEncoder", "stop encoder failed.", e2);
                this.s.release();
                if (this.z != null) {
                    this.z.release();
                }
                this.z = null;
            }
            this.s = null;
        } catch (Throwable th) {
            try {
                this.s.release();
                if (this.z != null) {
                    this.z.release();
                }
                this.z = null;
            } catch (Exception e3) {
                TXCLog.e("TXCHWVideoEncoder", "release encoder failed.", e3);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.mInit) {
            this.A = true;
            this.B = true;
            b();
            d();
            this.W = -1;
            this.b = 0L;
            this.c = 0.0d;
            this.d = 0L;
            this.e = 0L;
            this.f = 0;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.q = 0L;
            this.r = 0L;
            this.mGLContextExternal = null;
            this.D = null;
            this.E = null;
            this.F = 0L;
            this.mOutputWidth = 0;
            this.mOutputHeight = 0;
            this.mInit = false;
            this.mListener = null;
            this.x.clear();
            this.aa.clear();
            this.ab = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (this.mInit && this.i != this.a) {
            boolean z = false;
            if (this.a < this.i && this.ah) {
                if (this.ag) {
                    String str = "restart video hw encoder when down bps。[module:" + Build.MODEL + "] [Hardware:" + Build.HARDWARE + "] [osVersion:" + Build.VERSION.RELEASE + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                    TXCLog.w("TXCHWVideoEncoder", str);
                    Monitor.a(2, str, "", 0);
                    z = true;
                } else {
                    this.ae = 3;
                    this.ad = System.currentTimeMillis();
                    this.af = this.a;
                }
            }
            this.i = this.a;
            if (Build.VERSION.SDK_INT < 19 || this.s == null) {
                return;
            }
            if (z) {
                this.t.a().removeCallbacks(this.aj);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.ai >= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                    this.aj.run();
                    return;
                } else {
                    this.t.a(this.aj, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE - (currentTimeMillis - this.ai));
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.a * 1024);
            this.s.setParameters(bundle);
        }
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 19 || this.s == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.s.setParameters(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.mInit && i != 0 && this.K != i && Build.VERSION.SDK_INT >= 18) {
            TXCLog.i("TXCHWVideoEncoder", "set fps " + i + ", restart encoder.");
            b();
            d();
            this.K = i;
            c();
        }
    }

    private void g() {
        if (this.ad > 0) {
            int i = this.K - ((int) this.c);
            int i2 = this.K / 2;
            if (i2 < 5) {
                i2 = 5;
            }
            if (i > i2 || System.currentTimeMillis() - this.ad <= ((3 - this.ae) + 1) * 2000) {
                return;
            }
            long j = this.af - this.b;
            long j2 = this.i / 2;
            if (j2 < 100) {
                j2 = 100;
            }
            if (j > j2) {
                this.ag = true;
                String str = "real bitrate is too much lower than target bitrate![current profile:" + this.M + "][targetBr:" + this.af + "] [realBr:" + this.b + "]. restart encoder. [module:" + Build.MODEL + "] [Hardware:" + Build.HARDWARE + "] [osVersion:" + Build.VERSION.RELEASE + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                TXCLog.e("TXCHWVideoEncoder", str);
                Monitor.a(3, str, "", 0);
                if (this.M != 1) {
                    this.M = 1;
                    TXCLog.e("TXCHWVideoEncoder", "[Encoder] force reset profile to baseline when restart encoder. device:" + TXCCommonUtil.getDeviceInfo());
                }
                if (this.t != null) {
                    this.t.b(this.aj);
                }
                this.ad = 0L;
                return;
            }
            this.ae--;
            if (this.ae <= 0) {
                this.ad = 0L;
            }
        }
    }

    private void a(int i, int i2) {
        TXCLog.i("TXCHWVideoEncoder", "createCopyTexture");
        synchronized (this.Y) {
            this.X = new j();
            this.X.a(true);
            this.X.c();
            this.X.a(i, i2);
        }
    }

    private void h() {
        TXCLog.i("TXCHWVideoEncoder", "destroyCopyTexture");
        synchronized (this.Y) {
            if (this.X != null) {
                this.X.e();
                this.X = null;
            }
            this.W = -1;
        }
    }
}
