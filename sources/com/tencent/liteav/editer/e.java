package com.tencent.liteav.editer;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class e {
    protected Context a;
    protected boolean b;
    protected d c;
    protected s d;
    protected ad e;
    protected com.tencent.liteav.f.k f;
    protected com.tencent.liteav.f.b g;
    protected com.tencent.liteav.e.a h;
    protected com.tencent.liteav.muxer.c i;
    protected com.tencent.liteav.c.c j;
    protected com.tencent.liteav.f.j k;
    protected com.tencent.liteav.c.i l;
    private f o;
    private Surface p;
    private a q;
    private LinkedBlockingQueue<com.tencent.liteav.d.e> s;
    private com.tencent.liteav.d.e t;
    private com.tencent.liteav.d.e u;
    private boolean w;
    private final String n = "BasicVideoGenerate";
    private boolean r = false;
    private Object v = new Object();
    private int x = 2;
    private boolean y = true;
    private r z = new r() { // from class: com.tencent.liteav.editer.e.1
        @Override // com.tencent.liteav.editer.r
        public void a(EGLContext eGLContext) {
            TXCLog.i("BasicVideoGenerate", "OnContextListener onContext");
            if (e.this.p == null) {
                return;
            }
            synchronized (e.this.v) {
                if (e.this.h != null) {
                    TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
                    tXSVideoEncoderParam.width = e.this.l.h.a;
                    tXSVideoEncoderParam.height = e.this.l.h.b;
                    tXSVideoEncoderParam.fps = e.this.l.j();
                    tXSVideoEncoderParam.glContext = eGLContext;
                    tXSVideoEncoderParam.enableEGL14 = true;
                    tXSVideoEncoderParam.enableBlackList = false;
                    tXSVideoEncoderParam.appendSpsPps = false;
                    tXSVideoEncoderParam.annexb = true;
                    tXSVideoEncoderParam.fullIFrame = e.this.l.m;
                    tXSVideoEncoderParam.gop = e.this.l.k();
                    if (e.this.b) {
                        tXSVideoEncoderParam.encoderMode = 1;
                        tXSVideoEncoderParam.encoderProfile = 3;
                        tXSVideoEncoderParam.record = true;
                    } else {
                        tXSVideoEncoderParam.encoderMode = 3;
                        tXSVideoEncoderParam.encoderProfile = 1;
                    }
                    tXSVideoEncoderParam.forceSetBitrateMode = true;
                    e.this.h.a(e.this.l.i());
                    e.this.h.a(e.this.G);
                    e.this.h.a(tXSVideoEncoderParam);
                }
            }
            if (e.this.l.l()) {
                e.this.q = new a();
                e.this.q.a(e.this.I);
                e.this.q.a(e.this.H);
                t tVar = new t();
                tVar.channelCount = e.this.l.b;
                tVar.sampleRate = e.this.l.a;
                tVar.maxInputSize = e.this.l.c;
                tVar.encoderType = e.this.x;
                tVar.audioBitrate = e.this.l.h();
                TXCLog.i("BasicVideoGenerate", "AudioEncoder.start");
                e.this.q.a(tVar);
                if (e.this.g != null) {
                    e.this.g.e();
                }
            }
            if (com.tencent.liteav.c.k.a().d() == 1 && e.this.c != null) {
                e.this.c.a(e.this.p);
                e.this.c.a(e.this.A);
                e.this.c.a(e.this.B);
                e.this.c.l();
            } else if (com.tencent.liteav.c.k.a().d() == 2 && e.this.d != null) {
                e.this.d.a(e.this.C);
                e.this.d.d();
            }
            com.tencent.liteav.j.b.h();
            com.tencent.liteav.j.e.a().b();
        }

        @Override // com.tencent.liteav.editer.r
        public void b(EGLContext eGLContext) {
            TXCLog.i("BasicVideoGenerate", "OnContextListener onContextDestroy");
            if (e.this.h != null) {
                e.this.h.b();
            }
        }
    };
    private m A = new m() { // from class: com.tencent.liteav.editer.e.4
        @Override // com.tencent.liteav.editer.m
        public void a(com.tencent.liteav.d.e eVar) {
            com.tencent.liteav.j.b.a();
            com.tencent.liteav.j.e.a().b(eVar.e());
            try {
                e.this.s.put(eVar);
            } catch (InterruptedException unused) {
            }
            if (e.this.e != null) {
                e.this.e.a(eVar);
            }
        }

        @Override // com.tencent.liteav.editer.m
        public void a(String str) {
            TXCLog.e("BasicVideoGenerate", "onDecoderError -> msg = " + str);
            e.this.g();
        }
    };
    private h B = new h() { // from class: com.tencent.liteav.editer.e.5
        @Override // com.tencent.liteav.editer.h
        public void a(com.tencent.liteav.d.e eVar) {
            com.tencent.liteav.j.b.b();
            com.tencent.liteav.j.e.a().a(eVar.e());
            if (e.this.g != null) {
                e.this.g.a(eVar);
            }
        }
    };
    private l C = new l() { // from class: com.tencent.liteav.editer.e.6
        @Override // com.tencent.liteav.editer.l
        public void a(com.tencent.liteav.d.e eVar) {
            TXCLog.d("BasicVideoGenerate", "mPicDecListener, onDecodeBitmapFrame  frame:" + eVar.e() + ", flag : " + eVar.f());
            try {
                e.this.s.put(eVar);
            } catch (InterruptedException unused) {
            }
            if (e.this.e != null) {
                e.this.e.b(eVar);
            }
        }
    };
    protected w m = new w() { // from class: com.tencent.liteav.editer.e.7
        @Override // com.tencent.liteav.editer.w
        public void a(com.tencent.liteav.d.e eVar) {
            if (e.this.g != null) {
                e.this.g.a(eVar);
            }
        }

        @Override // com.tencent.liteav.editer.w
        public void b(com.tencent.liteav.d.e eVar) {
            TXCLog.d("BasicVideoGenerate", "TailWaterMarkListener onDecodeVideoFrame  frame:" + eVar.e() + ", flag : " + eVar.f() + ", reverse time = " + eVar.u());
            try {
                e.this.s.put(eVar);
            } catch (InterruptedException unused) {
            }
            if (e.this.e != null) {
                e.this.e.a(eVar);
            }
        }
    };
    private o D = new o() { // from class: com.tencent.liteav.editer.e.8
        @Override // com.tencent.liteav.editer.o
        public void a(int i) {
        }

        @Override // com.tencent.liteav.editer.o
        public void a(Surface surface) {
            TXCLog.i("BasicVideoGenerate", "IVideoRenderListener onSurfaceTextureAvailable");
            e.this.p = surface;
            if (e.this.f != null) {
                e.this.f.a();
                e.this.f.b();
            }
        }

        @Override // com.tencent.liteav.editer.o
        public void a(int i, int i2) {
            if (e.this.f != null) {
                com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
                int e = com.tencent.liteav.c.j.a().e();
                if (e == 90 || e == 270) {
                    gVar.a = i2;
                    gVar.b = i;
                } else {
                    gVar.a = i;
                    gVar.b = i2;
                }
                e.this.f.a(gVar);
            }
        }

        @Override // com.tencent.liteav.editer.o
        public void b(Surface surface) {
            TXCLog.i("BasicVideoGenerate", "IVideoRenderListener onSurfaceTextureDestroy");
            e.this.f();
            e.this.p = null;
            if (e.this.f != null) {
                e.this.f.c();
                e.this.f.d();
            }
            if (e.this.o != null) {
                e.this.o.a();
            }
        }

        @Override // com.tencent.liteav.editer.o
        public int a(int i, float[] fArr, com.tencent.liteav.d.e eVar) {
            com.tencent.liteav.j.b.e();
            if (e.this.o != null) {
                i = e.this.o.a(eVar, com.tencent.liteav.c.e.a().b(), eVar.r());
                eVar.l(i);
                eVar.m(0);
            }
            if (e.this.f != null) {
                e.this.f.a(fArr);
                e.this.f.a(i, eVar);
            }
            return 0;
        }
    };
    private n E = new n() { // from class: com.tencent.liteav.editer.e.9
        @Override // com.tencent.liteav.editer.n
        public void a(int i, com.tencent.liteav.d.e eVar) {
            com.tencent.liteav.j.b.c();
            long a = com.tencent.liteav.j.e.a(eVar);
            com.tencent.liteav.j.e.a().d(a);
            if (eVar.p()) {
                if (!e.this.k.b()) {
                    if (e.this.l.l()) {
                        boolean z = com.tencent.liteav.c.k.a().d() == 2;
                        boolean z2 = com.tencent.liteav.c.k.a().d() == 1;
                        if ((z || (z2 && !e.this.c.h())) && (e.this.g == null || !e.this.g.j())) {
                            TXCLog.w("BasicVideoGenerate", "Encount EOF Video Has No Audio Append BGM,BGM is not end");
                            return;
                        }
                    }
                    synchronized (e.this.v) {
                        if (e.this.h != null) {
                            e.this.h.a();
                            TXCLog.i("BasicVideoGenerate", "signalEOSAndFlush");
                            return;
                        }
                    }
                } else if (e.this.k.j()) {
                    synchronized (e.this.v) {
                        if (e.this.h != null) {
                            e.this.h.a();
                            TXCLog.i("BasicVideoGenerate", "TailWaterMarkListener signalEOSAndFlush");
                            return;
                        }
                    }
                } else {
                    if (e.this.s != null) {
                        e.this.s.remove(eVar);
                    }
                    if (e.this.l.l() && ((com.tencent.liteav.c.k.a().d() == 2 || (com.tencent.liteav.c.k.a().d() == 1 && !e.this.c.h())) && (e.this.g == null || !e.this.g.j()))) {
                        TXCLog.w("BasicVideoGenerate", "Encount EOF Video Has No Audio Append BGM,BGM is not end");
                        return;
                    }
                    TXCLog.i("BasicVideoGenerate", "Encount EOF Video didProcessFrame appendTailWaterMark, mLastVideoFrame = " + e.this.u);
                    e.this.k.a = e.this.u;
                    e.this.k.b = e.this.t;
                    e.this.k.d();
                    TXCLog.i("BasicVideoGenerate", "mLastVideoFrame width, height = " + e.this.u.m() + ", " + e.this.u.n());
                    return;
                }
            }
            synchronized (e.this.v) {
                if (e.this.h != null) {
                    try {
                        e.this.h.a(i, eVar.m(), eVar.n(), a / 1000);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (e.this.l.e()) {
                try {
                    e.this.s.take();
                } catch (InterruptedException unused2) {
                }
                if (com.tencent.liteav.c.k.a().d() == 1) {
                    e.this.c.p();
                }
            } else if (com.tencent.liteav.c.k.a().d() == 1) {
                if (e.this.c != null) {
                    if (e.this.c.o()) {
                        if (e.this.k.b()) {
                            e.this.k.f();
                        }
                    } else {
                        e.this.c.p();
                    }
                }
            } else if (com.tencent.liteav.c.k.a().d() == 2) {
                if (e.this.d.c()) {
                    if (e.this.k.b()) {
                        e.this.k.f();
                    }
                } else {
                    e.this.d.h();
                }
            }
            e.this.u = eVar;
        }

        @Override // com.tencent.liteav.editer.n
        public int b(int i, com.tencent.liteav.d.e eVar) {
            return e.this.a(i, eVar.m(), eVar.n(), eVar.e());
        }
    };
    private j F = new j() { // from class: com.tencent.liteav.editer.e.10
        @Override // com.tencent.liteav.editer.j
        public void a(com.tencent.liteav.d.e eVar) {
            if (eVar == null) {
                return;
            }
            com.tencent.liteav.j.b.d();
            com.tencent.liteav.j.e.a().c(eVar.e());
            if (eVar.p()) {
                boolean z = true;
                if (!e.this.k.b()) {
                    boolean z2 = com.tencent.liteav.c.k.a().d() == 2;
                    boolean z3 = com.tencent.liteav.c.k.a().d() == 1;
                    if (z2 || (z3 && !e.this.c.h())) {
                        boolean z4 = e.this.d != null && e.this.d.c();
                        z = (e.this.c == null || !e.this.c.o()) ? false : false;
                        if (z2) {
                            TXCLog.i("BasicVideoGenerate", "IAudioPreprocessListener sourcePic：" + z2 + ",picEnd:" + z4);
                        }
                        if (z3) {
                            TXCLog.i("BasicVideoGenerate", "IAudioPreprocessListener sourceVideo：" + z3 + ",videoEnd:" + z);
                        }
                        if (z4 || z) {
                            synchronized (e.this.v) {
                                if (e.this.h != null) {
                                    e.this.h.a();
                                    TXCLog.i("BasicVideoGenerate", "signalEOSAndFlush");
                                    return;
                                }
                            }
                        }
                        if (!z4) {
                            TXCLog.i("BasicVideoGenerate", "picEnd is false");
                            return;
                        }
                    }
                } else if (e.this.k.j()) {
                    synchronized (e.this.v) {
                        if (e.this.h != null) {
                            e.this.h.a();
                            TXCLog.i("BasicVideoGenerate", "Encount EOF TailWaterMarkListener signalEOSAndFlush");
                            return;
                        }
                    }
                } else if (e.this.l.l() && ((com.tencent.liteav.c.k.a().d() == 2 && !e.this.d.c()) || (com.tencent.liteav.c.k.a().d() == 1 && !e.this.c.h() && !e.this.c.o()))) {
                    TXCLog.w("BasicVideoGenerate", "Encount EOF Video Has No Audio Append BGM,Video is not end");
                    return;
                } else {
                    TXCLog.i("BasicVideoGenerate", "Encount EOF Audio didProcessFrame appendTailWaterMark");
                    e.this.k.a = e.this.u;
                    e.this.k.b = e.this.t;
                    e.this.k.d();
                    return;
                }
            }
            if (e.this.q != null && eVar != null) {
                e.this.q.a(eVar);
            }
            if (e.this.g != null) {
                e.this.g.i();
            }
            e.this.t = eVar;
        }
    };
    private com.tencent.liteav.videoencoder.d G = new com.tencent.liteav.videoencoder.d() { // from class: com.tencent.liteav.editer.e.11
        @Override // com.tencent.liteav.videoencoder.d
        public void onEncodeDataIn(int i) {
        }

        @Override // com.tencent.liteav.videoencoder.d
        public void onEncodeFinished(int i, long j, long j2) {
        }

        @Override // com.tencent.liteav.videoencoder.d
        public void onRestartEncoder(int i) {
        }

        @Override // com.tencent.liteav.videoencoder.d
        public void onEncodeNAL(TXSNALPacket tXSNALPacket, int i) {
            if (i != 0) {
                TXCLog.e("BasicVideoGenerate", "mVideoEncodeListener, errCode = " + i);
                return;
            }
            com.tencent.liteav.j.b.f();
            if (e.this.l.e()) {
                TXCLog.i("BasicVideoGenerate", "mVideoEncodeListener, input is full, output is full");
            } else if (tXSNALPacket != null && tXSNALPacket.nalData != null) {
                com.tencent.liteav.d.e eVar = null;
                try {
                    eVar = (com.tencent.liteav.d.e) e.this.s.take();
                } catch (InterruptedException unused) {
                }
                if (eVar.p()) {
                    TXCLog.i("BasicVideoGenerate", "===Video onEncodeComplete===:" + eVar.p() + ", nal:" + tXSNALPacket);
                    e.this.c();
                    e.this.e();
                    return;
                }
                synchronized (this) {
                    if (e.this.i != null && tXSNALPacket != null && tXSNALPacket.nalData != null) {
                        if (!e.this.r) {
                            if (tXSNALPacket.nalType == 0) {
                                MediaFormat a = com.tencent.liteav.basic.util.g.a(tXSNALPacket.nalData, e.this.l.h.a, e.this.l.h.b);
                                if (a != null) {
                                    e.this.i.a(a);
                                    e.this.i.a();
                                    e.this.r = true;
                                }
                            }
                        }
                        a(tXSNALPacket, eVar);
                    }
                }
                e.this.a(com.tencent.liteav.j.e.a(eVar));
            } else {
                TXCLog.i("BasicVideoGenerate", "===Video onEncodeComplete===");
                e.this.c();
                e.this.e();
            }
        }

        private void a(TXSNALPacket tXSNALPacket, com.tencent.liteav.d.e eVar) {
            int i;
            long a = com.tencent.liteav.j.e.a(eVar);
            com.tencent.liteav.j.e.a().f(a);
            if (tXSNALPacket.info == null) {
                i = tXSNALPacket.nalType == 0 ? 1 : 0;
            } else {
                i = tXSNALPacket.info.flags;
            }
            if (e.this.i != null) {
                e.this.i.b(tXSNALPacket.nalData, 0, tXSNALPacket.nalData.length, a, i);
            }
        }

        @Override // com.tencent.liteav.videoencoder.d
        public void onEncodeFormat(MediaFormat mediaFormat) {
            TXCLog.i("BasicVideoGenerate", "Video onEncodeFormat format:" + mediaFormat);
            if (e.this.l.e() || e.this.i == null) {
                return;
            }
            e.this.i.a(mediaFormat);
            if (e.this.l.l()) {
                if (e.this.i.d()) {
                    TXCLog.i("BasicVideoGenerate", "Has Audio, Video Muxer start");
                    e.this.i.a();
                    e.this.r = true;
                    return;
                }
                return;
            }
            TXCLog.i("BasicVideoGenerate", "No Audio, Video Muxer start");
            e.this.i.a();
            e.this.r = true;
        }
    };
    private u H = new u() { // from class: com.tencent.liteav.editer.e.2
        @Override // com.tencent.liteav.editer.u
        public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            com.tencent.liteav.j.b.g();
            com.tencent.liteav.j.e.a().e(bufferInfo.presentationTimeUs);
            if (e.this.x == 2 && e.this.y) {
                e.this.y = false;
                MediaFormat a = com.tencent.liteav.basic.util.g.a(e.this.l.a, e.this.l.b, 2);
                if (e.this.i != null) {
                    e.this.i.b(a);
                }
            }
            if (e.this.i != null) {
                e.this.i.a(byteBuffer, bufferInfo);
            }
        }

        @Override // com.tencent.liteav.editer.u
        public void a(MediaFormat mediaFormat) {
            TXCLog.i("BasicVideoGenerate", "Audio onEncodeFormat format:" + mediaFormat);
            if (e.this.l.e() || e.this.i == null) {
                return;
            }
            e.this.i.b(mediaFormat);
            if ((com.tencent.liteav.c.k.a().d() == 2 || e.this.c.i()) && e.this.i.c()) {
                e.this.i.a();
                e.this.r = true;
            }
        }

        @Override // com.tencent.liteav.editer.u
        public void a() {
            TXCLog.i("BasicVideoGenerate", "===Audio onEncodeComplete===");
            e.this.c();
            e.this.e();
        }
    };
    private g I = new g() { // from class: com.tencent.liteav.editer.e.3
        @Override // com.tencent.liteav.editer.g
        public void a(int i) {
            if (com.tencent.liteav.c.k.a().d() == 1 && e.this.c.h()) {
                e.this.c.b(i <= 5);
            } else if (e.this.g != null) {
                e.this.g.c(i <= 5);
            }
        }
    };

    protected abstract int a(int i, int i2, int i3, long j);

    protected abstract void a(long j);

    protected abstract void e();

    protected abstract void f();

    protected abstract void g();

    public e(Context context, String str) {
        this.b = false;
        this.a = context;
        this.e = new ad(str);
        this.f = new com.tencent.liteav.f.k(context);
        this.f.a(this.E);
        this.s = new LinkedBlockingQueue<>();
        this.l = com.tencent.liteav.c.i.a();
        this.j = com.tencent.liteav.c.c.a();
        this.k = com.tencent.liteav.f.j.a();
        this.b = com.tencent.liteav.basic.util.g.h();
    }

    public void a(String str) {
        TXCLog.i("BasicVideoGenerate", "setVideoPath videoPath:" + str);
        try {
            if (this.c == null) {
                this.c = new y("basic");
            }
            this.c.a(str);
            if (this.c.h()) {
                this.l.a(this.c.f());
            }
            this.l.b(this.c.g());
        } catch (IOException e) {
            TXCLog.e("BasicVideoGenerate", "set source failed.", e);
        }
    }

    public void a(List<Bitmap> list, int i) {
        this.d = new s("gene");
        this.d.a(false);
        this.d.a(list, i);
        this.o = new f(this.a, this.d.a(), this.d.b());
    }

    public void a() {
        TXCLog.i("BasicVideoGenerate", "start");
        this.s.clear();
        this.y = this.x == 2;
        h();
        if (this.l.l()) {
            this.g = new com.tencent.liteav.f.b("basicGene");
            this.g.a();
            this.g.a(this.F);
            this.g.b(this.l.l);
            if (com.tencent.liteav.c.k.a().d() == 1) {
                this.g.b(this.c.h());
            } else {
                this.g.b(false);
            }
            this.g.c();
            MediaFormat n = this.l.n();
            if (n != null) {
                this.g.a(n);
            }
            if ((com.tencent.liteav.c.k.a().d() == 2 || !this.c.h()) && this.i != null) {
                this.i.b(n);
            }
        }
        if (this.f != null) {
            this.f.a(this.l.h);
        }
        if (this.e != null) {
            this.e.a(this.l.h);
            this.e.a(this.z);
            this.e.a(this.D);
            this.e.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
        if (com.tencent.liteav.c.k.a().d() == 1) {
            gVar.a = this.c.d();
            gVar.b = this.c.e();
            gVar.c = this.c.n();
        } else if (com.tencent.liteav.c.k.a().d() == 2) {
            gVar.a = this.d.a();
            gVar.b = this.d.b();
        }
        if (this.w) {
            this.l.h = gVar;
        } else {
            this.l.h = this.l.a(gVar);
        }
    }

    public void c() {
        TXCLog.i("BasicVideoGenerate", "stop");
        if (this.c != null) {
            this.c.a((m) null);
            this.c.a((h) null);
            this.c.m();
        }
        if (this.d != null) {
            this.d.a((l) null);
            this.d.e();
        }
        if (this.e != null) {
            this.e.b();
        }
        if (this.l.l() && this.g != null) {
            this.g.d();
            this.g.a((j) null);
            this.g.b();
            this.g = null;
        }
        if (this.h != null) {
            this.h.a((com.tencent.liteav.videoencoder.d) null);
            this.h.c();
        }
        if (this.q != null) {
            this.q.a((u) null);
            this.q.a((g) null);
            this.q.a();
        }
        TXCLog.i("BasicVideoGenerate", "stop muxer :" + this.r);
        this.r = false;
        if (this.i != null) {
            this.i.b();
            this.i = null;
        }
    }

    public void d() {
        TXCLog.i("BasicVideoGenerate", "release");
        if (this.c != null) {
            this.c.k();
        }
        this.c = null;
        if (this.d != null) {
            this.d.i();
        }
        this.d = null;
        if (this.e != null) {
            this.e.c();
        }
        this.e = null;
        if (this.f != null) {
            this.f.a((n) null);
        }
        this.f = null;
        synchronized (this.v) {
            this.h = null;
        }
        if (this.q != null) {
            this.q.b();
        }
        this.q = null;
        this.H = null;
        this.F = null;
        this.H = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.I = null;
        this.C = null;
        this.m = null;
        this.E = null;
        this.G = null;
        this.D = null;
    }

    private void h() {
        long a;
        if (com.tencent.liteav.c.k.a().d() == 1) {
            a = this.c.c();
        } else {
            a = com.tencent.liteav.c.k.a().d() == 2 ? this.d.a(com.tencent.liteav.c.e.a().b()) * 1000 : 0L;
        }
        TXCLog.i("BasicVideoGenerate", "calculateDuration durationUs:" + a);
        long b = this.j.b();
        long c = this.j.c();
        long j = c - b;
        if (j > 0) {
            TXCLog.i("BasicVideoGenerate", "calculateDuration Cut durationUs:" + j);
            if (com.tencent.liteav.c.k.a().d() == 1) {
                this.c.a(b, c);
            } else if (com.tencent.liteav.c.k.a().d() == 2) {
                this.d.a(b / 1000, c / 1000);
            }
            a = j;
        } else if (com.tencent.liteav.c.k.a().d() == 1) {
            this.c.a(0L, a);
        } else if (com.tencent.liteav.c.k.a().d() == 2) {
            this.d.a(0L, a / 1000);
        }
        this.l.k = a;
        this.l.l = a;
        if (com.tencent.liteav.f.g.a().c()) {
            this.l.k = com.tencent.liteav.f.g.a().b(this.l.k);
            this.l.l = this.l.k;
            TXCLog.i("BasicVideoGenerate", "calculateDuration Speed durationUs:" + this.l.k);
        }
        if (this.k.b()) {
            this.l.k += this.k.c();
            TXCLog.i("BasicVideoGenerate", "calculateDuration AddTailWaterMark durationUs:" + this.l.k);
        }
    }

    public void a(boolean z) {
        if (this.f != null) {
            this.f.a(z);
        }
    }

    public void b(boolean z) {
        this.w = z;
    }
}
