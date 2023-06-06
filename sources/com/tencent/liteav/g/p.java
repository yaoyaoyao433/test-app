package com.tencent.liteav.g;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.editer.u;
import com.tencent.liteav.i.a;
import com.tencent.liteav.i.c;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class p {
    private Context b;
    private boolean c;
    private q f;
    private t g;
    private s h;
    private com.tencent.liteav.f.b i;
    private c.a j;
    private com.tencent.liteav.videoencoder.b k;
    private com.tencent.liteav.editer.a l;
    private com.tencent.liteav.muxer.c m;
    private boolean n;
    private j p;
    private int o = 2;
    private boolean q = true;
    private com.tencent.liteav.editer.r r = new com.tencent.liteav.editer.r() { // from class: com.tencent.liteav.g.p.5
        @Override // com.tencent.liteav.editer.r
        public void b(EGLContext eGLContext) {
        }

        @Override // com.tencent.liteav.editer.r
        public void a(EGLContext eGLContext) {
            TXCLog.i("VideoJoinGenerate", "OnContextListener onContext");
            if (p.this.k != null) {
                TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
                tXSVideoEncoderParam.width = p.this.h.h.a;
                tXSVideoEncoderParam.height = p.this.h.h.b;
                tXSVideoEncoderParam.fps = p.this.h.j();
                tXSVideoEncoderParam.glContext = eGLContext;
                tXSVideoEncoderParam.enableEGL14 = true;
                tXSVideoEncoderParam.enableBlackList = false;
                tXSVideoEncoderParam.appendSpsPps = false;
                tXSVideoEncoderParam.annexb = true;
                tXSVideoEncoderParam.fullIFrame = false;
                tXSVideoEncoderParam.gop = p.this.h.k();
                if (p.this.c) {
                    tXSVideoEncoderParam.encoderMode = 1;
                    tXSVideoEncoderParam.encoderProfile = 3;
                    tXSVideoEncoderParam.record = true;
                } else {
                    tXSVideoEncoderParam.encoderMode = 3;
                    tXSVideoEncoderParam.encoderProfile = 1;
                }
                p.this.k.c(p.this.h.i());
                p.this.k.a(p.this.x);
                p.this.k.a(tXSVideoEncoderParam);
            }
            p.this.l = new com.tencent.liteav.editer.a();
            p.this.l.a(p.this.u);
            p.this.l.a(p.this.w);
            com.tencent.liteav.editer.t tVar = new com.tencent.liteav.editer.t();
            tVar.channelCount = p.this.h.b;
            tVar.sampleRate = p.this.h.a;
            tVar.maxInputSize = p.this.h.c;
            tVar.encoderType = p.this.o;
            tVar.audioBitrate = p.this.h.h();
            p.this.l.a(tVar);
            if (p.this.d != null) {
                p.this.d.a(p.this.p);
                p.this.d.a(p.this.s);
                p.this.d.a(p.this.t);
                p.this.d.a();
            }
        }
    };
    private c s = new c() { // from class: com.tencent.liteav.g.p.6
        @Override // com.tencent.liteav.g.c
        public void a(com.tencent.liteav.d.e eVar, i iVar) {
            try {
                p.this.a.put(eVar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (p.this.e != null) {
                p.this.e.a(eVar, iVar);
            }
        }
    };
    private a t = new a() { // from class: com.tencent.liteav.g.p.7
        @Override // com.tencent.liteav.g.a
        public void a(com.tencent.liteav.d.e eVar, i iVar) {
            if (p.this.i != null) {
                p.this.i.a(eVar);
            }
        }
    };
    private com.tencent.liteav.editer.g u = new com.tencent.liteav.editer.g() { // from class: com.tencent.liteav.g.p.8
        @Override // com.tencent.liteav.editer.g
        public void a(int i) {
            p.this.d.a(i <= 5);
        }
    };
    private com.tencent.liteav.editer.j v = new com.tencent.liteav.editer.j() { // from class: com.tencent.liteav.g.p.9
        @Override // com.tencent.liteav.editer.j
        public void a(com.tencent.liteav.d.e eVar) {
            if (eVar == null) {
                return;
            }
            TXCLog.d("VideoJoinGenerate", "didAudioProcessFrame frame:" + eVar.e());
            if (!eVar.p() || p.this.k == null) {
                if (p.this.l != null) {
                    p.this.l.a(eVar);
                }
                if (p.this.i != null) {
                    p.this.i.i();
                    return;
                }
                return;
            }
            p.this.k.c();
            TXCLog.i("VideoJoinGenerate", "signalEOSAndFlush");
        }
    };
    private u w = new u() { // from class: com.tencent.liteav.g.p.10
        @Override // com.tencent.liteav.editer.u
        public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (p.this.o == 2 && p.this.q) {
                p.this.q = false;
                MediaFormat a = com.tencent.liteav.basic.util.g.a(p.this.h.a, p.this.h.b, 2);
                if (p.this.m != null) {
                    p.this.m.b(a);
                }
            }
            if (p.this.m != null) {
                p.this.m.a(byteBuffer, bufferInfo);
            }
        }

        @Override // com.tencent.liteav.editer.u
        public void a(MediaFormat mediaFormat) {
            TXCLog.i("VideoJoinGenerate", "Audio onEncodeFormat format:" + mediaFormat);
            if (p.this.m != null) {
                p.this.m.b(mediaFormat);
                if (p.this.m.c()) {
                    p.this.m.a();
                    p.this.n = true;
                }
            }
        }

        @Override // com.tencent.liteav.editer.u
        public void a() {
            TXCLog.i("VideoJoinGenerate", "===Audio onEncodeComplete===");
            p.this.b();
            p.this.c();
        }
    };
    private com.tencent.liteav.videoencoder.d x = new com.tencent.liteav.videoencoder.d() { // from class: com.tencent.liteav.g.p.11
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
                TXCLog.e("VideoJoinGenerate", "mVideoEncodeListener, errCode = " + i);
            } else if (tXSNALPacket != null && tXSNALPacket.nalData != null) {
                com.tencent.liteav.d.e eVar = null;
                try {
                    eVar = (com.tencent.liteav.d.e) p.this.a.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (eVar.p()) {
                    TXCLog.i("VideoJoinGenerate", "frame.isEnd===Video onEncodeComplete===:" + eVar.p() + ", nal:" + tXSNALPacket);
                    p.this.b();
                    p.this.c();
                    return;
                }
                synchronized (this) {
                    if (p.this.m != null && tXSNALPacket != null && tXSNALPacket.nalData != null) {
                        if (!p.this.n) {
                            if (tXSNALPacket.nalType == 0) {
                                MediaFormat a = com.tencent.liteav.basic.util.g.a(tXSNALPacket.nalData, p.this.h.h.a, p.this.h.h.b);
                                if (a != null) {
                                    p.this.m.a(a);
                                    p.this.m.a();
                                    p.this.n = true;
                                }
                            }
                        }
                        a(tXSNALPacket, eVar);
                    }
                }
                p.this.a(eVar.e());
            } else {
                TXCLog.i("VideoJoinGenerate", "nal is null ===Video onEncodeComplete===");
                p.this.b();
                p.this.c();
            }
        }

        private void a(TXSNALPacket tXSNALPacket, com.tencent.liteav.d.e eVar) {
            int i;
            if (tXSNALPacket.info == null) {
                i = tXSNALPacket.nalType == 0 ? 1 : 0;
            } else {
                i = tXSNALPacket.info.flags;
            }
            if (p.this.m != null) {
                p.this.m.b(tXSNALPacket.nalData, 0, tXSNALPacket.nalData.length, eVar.e(), i);
            }
        }

        @Override // com.tencent.liteav.videoencoder.d
        public void onEncodeFormat(MediaFormat mediaFormat) {
            TXCLog.i("VideoJoinGenerate", "Video onEncodeFormat format:" + mediaFormat);
            if (p.this.m != null) {
                p.this.m.a(mediaFormat);
                if (p.this.m.d()) {
                    TXCLog.i("VideoJoinGenerate", "Has Audio, Video Muxer start");
                    p.this.m.a();
                    p.this.n = true;
                }
            }
        }
    };
    private d y = new d() { // from class: com.tencent.liteav.g.p.12
        @Override // com.tencent.liteav.g.d
        public void a(List<Surface> list) {
            TXCLog.i("VideoJoinGenerate", "IVideoJoinRenderListener onSurfaceTextureAvailable");
            if (p.this.f != null) {
                p.this.f.a();
                p.this.f.b();
            }
        }

        @Override // com.tencent.liteav.g.d
        public void a(int i, int i2) {
            if (p.this.f != null) {
                com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
                int e = com.tencent.liteav.c.j.a().e();
                if (e == 90 || e == 270) {
                    gVar.a = i2;
                    gVar.b = i;
                } else {
                    gVar.a = i;
                    gVar.b = i2;
                }
                p.this.f.a(gVar);
            }
        }

        @Override // com.tencent.liteav.g.d
        public void b(List<Surface> list) {
            TXCLog.i("VideoJoinGenerate", "IVideoJoinRenderListener onSurfaceTextureDestroy");
            if (p.this.f != null) {
                p.this.f.c();
                p.this.f.d();
            }
        }

        @Override // com.tencent.liteav.g.d
        public int a(int i, float[] fArr, com.tencent.liteav.d.e eVar) {
            if (p.this.f != null) {
                p.this.f.a(fArr);
                p.this.f.a(i, eVar);
                return 0;
            }
            return 0;
        }
    };
    private com.tencent.liteav.editer.n z = new com.tencent.liteav.editer.n() { // from class: com.tencent.liteav.g.p.2
        @Override // com.tencent.liteav.editer.n
        public int b(int i, com.tencent.liteav.d.e eVar) {
            return i;
        }

        @Override // com.tencent.liteav.editer.n
        public void a(int i, com.tencent.liteav.d.e eVar) {
            TXCLog.d("VideoJoinGenerate", "didProcessFrame frame:" + eVar.e());
            if (!eVar.p() || p.this.k == null) {
                if (p.this.k != null) {
                    p.this.k.c(i, eVar.m(), eVar.n(), eVar.e() / 1000);
                }
                p.this.d.c();
                return;
            }
            p.this.k.c();
            TXCLog.i("VideoJoinGenerate", "signalEOSAndFlush");
        }
    };
    private Handler A = new Handler(Looper.getMainLooper());
    private LinkedBlockingQueue<com.tencent.liteav.d.e> a = new LinkedBlockingQueue<>();
    private n e = new n();
    private l d = new l();

    public p(Context context) {
        this.b = context;
        this.f = new q(context);
        this.f.a(this.z);
        this.g = t.a();
        this.h = s.r();
        this.c = com.tencent.liteav.basic.util.g.h();
    }

    public void a(c.a aVar) {
        this.j = aVar;
    }

    public void a() {
        TXCLog.i("VideoJoinGenerate", "start");
        this.q = this.o == 2;
        this.h.g();
        this.a.clear();
        this.h.k = this.g.o();
        this.i = new com.tencent.liteav.f.b("join");
        this.i.a();
        this.i.a(this.v);
        MediaFormat i = this.g.i();
        if (i != null) {
            this.h.d(i);
            this.i.a(i);
        }
        com.tencent.liteav.d.g a = this.h.a(this.g.j());
        this.h.h = a;
        this.f.a(a);
        List<i> d = t.a().d();
        this.p = new j();
        this.p.a(d);
        this.e.a(this.p);
        this.e.a(a);
        this.e.a(this.r);
        this.e.a(this.y);
        this.e.a();
        TXCLog.i("VideoJoinGenerate", "mUseSWEncoder:" + this.c);
        if (this.k == null) {
            this.k = new com.tencent.liteav.videoencoder.b(this.c ? 2 : 1);
        }
        this.m = new com.tencent.liteav.muxer.c(this.b, this.c ? 0 : 2);
        this.m.a(this.h.i);
    }

    public void b() {
        TXCLog.i("VideoJoinGenerate", "stop");
        if (this.d != null) {
            this.d.a((c) null);
            this.d.a((a) null);
            this.d.b();
        }
        if (this.e != null) {
            this.e.a((com.tencent.liteav.editer.r) null);
            this.e.a((d) null);
            this.e.b();
            this.e.a(new Runnable() { // from class: com.tencent.liteav.g.p.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCLog.i("VideoJoinGenerate", "stop: runOnOpenGLThread -> release filter");
                    if (p.this.f != null) {
                        p.this.f.c();
                        p.this.f.d();
                    }
                }
            });
        }
        if (this.i != null) {
            this.i.d();
            this.i.a((com.tencent.liteav.editer.j) null);
            this.i.b();
            this.i = null;
        }
        if (this.k != null) {
            this.k.a((com.tencent.liteav.videoencoder.d) null);
            this.k.a();
        }
        if (this.l != null) {
            this.l.a((u) null);
            this.l.a((com.tencent.liteav.editer.g) null);
            this.l.a();
        }
        TXCLog.i("VideoJoinGenerate", "stop muxer :" + this.n);
        this.n = false;
        if (this.m != null) {
            this.m.b();
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.tencent.liteav.editer.q.a().b();
        this.A.post(new Runnable() { // from class: com.tencent.liteav.g.p.3
            @Override // java.lang.Runnable
            public void run() {
                if (p.this.j != null) {
                    a.d dVar = new a.d();
                    dVar.a = 0;
                    dVar.b = "Join Complete";
                    TXCLog.i("VideoJoinGenerate", "===onJoinComplete===");
                    p.this.j.a(dVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j) {
        this.A.post(new Runnable() { // from class: com.tencent.liteav.g.p.4
            @Override // java.lang.Runnable
            public void run() {
                if (p.this.j != null) {
                    long j2 = p.this.h.k;
                    if (j2 > 0) {
                        float f = (((float) j) * 1.0f) / ((float) j2);
                        TXCLog.d("VideoJoinGenerate", "onJoinProgress timestamp:" + j + ",progress:" + f + ",duration:" + j2);
                        p.this.j.a(f);
                    }
                }
            }
        });
    }
}
