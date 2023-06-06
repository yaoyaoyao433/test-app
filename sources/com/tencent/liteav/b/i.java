package com.tencent.liteav.b;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.editer.t;
import com.tencent.liteav.editer.u;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i {
    protected com.tencent.liteav.videoencoder.b b;
    protected com.tencent.liteav.muxer.c c;
    private Context e;
    private com.tencent.liteav.editer.a f;
    private String k;
    private long m;
    private int o;
    private int p;
    private boolean r;
    private boolean s;
    private g v;
    private com.tencent.liteav.d.e w;
    private TXSVideoEncoderParam z;
    private final String d = "TXCombineEncAndMuxer";
    protected boolean a = false;
    private int g = 1;
    private int h = 98304;
    private int i = 10000;
    private int j = 48000;
    private boolean l = false;
    private int n = 13000;
    private int t = 2;
    private boolean u = true;
    private int x = 0;
    private int y = 0;
    private com.tencent.liteav.editer.g A = new com.tencent.liteav.editer.g() { // from class: com.tencent.liteav.b.i.1
        @Override // com.tencent.liteav.editer.g
        public void a(int i) {
        }
    };
    private com.tencent.liteav.videoencoder.d B = new com.tencent.liteav.videoencoder.d() { // from class: com.tencent.liteav.b.i.2
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
            if (10000004 == i || 10000005 == i) {
                if (!i.this.a) {
                    i.this.c();
                } else {
                    i.this.c(i);
                }
            } else if (i != 0) {
                TXCLog.e("TXCombineEncAndMuxer", "mVideoEncodeListener, errCode = " + i);
                i.this.c(i);
            } else if (tXSNALPacket == null || tXSNALPacket.nalData == null) {
                TXCLog.i("TXCombineEncAndMuxer", "===Video onEncodeComplete=== mAudioEncEnd " + i.this.s);
                i.this.r = true;
                if (i.this.s) {
                    TXCLog.i("TXCombineEncAndMuxer", "===Video onEncodeComplete=== mAudioEncEnd is true");
                    i.this.a();
                    i.this.d();
                }
            } else {
                com.tencent.liteav.d.e eVar = null;
                try {
                    TXCLog.d("TXCombineEncAndMuxer", "onEncodeNAL, before take mVideoQueue size = " + i.this.q.size());
                    eVar = (com.tencent.liteav.d.e) i.this.q.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this) {
                    if (i.this.c != null && tXSNALPacket != null && tXSNALPacket.nalData != null) {
                        if (!i.this.l) {
                            if (tXSNALPacket.nalType == 0) {
                                MediaFormat a = com.tencent.liteav.basic.util.g.a(tXSNALPacket.nalData, i.this.o, i.this.p);
                                if (a != null) {
                                    i.this.c.a(a);
                                    i.this.c.a();
                                    i.this.l = true;
                                }
                            }
                        }
                        a(tXSNALPacket, eVar);
                    }
                }
                i.this.d(eVar);
            }
        }

        private void a(TXSNALPacket tXSNALPacket, com.tencent.liteav.d.e eVar) {
            int i;
            long e = eVar.e();
            TXCLog.d("TXCombineEncAndMuxer", "Muxer writeVideoData :" + e);
            if (tXSNALPacket.info == null) {
                i = tXSNALPacket.nalType == 0 ? 1 : 0;
            } else {
                i = tXSNALPacket.info.flags;
            }
            if (i.this.c != null) {
                i.this.c.b(tXSNALPacket.nalData, 0, tXSNALPacket.nalData.length, e, i);
            }
        }

        @Override // com.tencent.liteav.videoencoder.d
        public void onEncodeFormat(MediaFormat mediaFormat) {
            TXCLog.i("TXCombineEncAndMuxer", "Video onEncodeFormat format:" + mediaFormat);
            if (i.this.c != null) {
                i.this.c.a(mediaFormat);
                if (i.this.c.d()) {
                    TXCLog.i("TXCombineEncAndMuxer", "Has Audio, Video Muxer start");
                    i.this.c.a();
                    i.this.l = true;
                }
            }
        }
    };
    private u C = new u() { // from class: com.tencent.liteav.b.i.3
        @Override // com.tencent.liteav.editer.u
        public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (i.this.t == 2 && i.this.u) {
                i.this.u = false;
                MediaFormat a = com.tencent.liteav.basic.util.g.a(i.this.j, i.this.g, 2);
                if (i.this.c != null) {
                    i.this.c.b(a);
                }
            }
            i.l(i.this);
            if (i.this.c != null) {
                TXCLog.d("TXCombineEncAndMuxer", "Muxer writeAudioData :" + bufferInfo.presentationTimeUs);
                i.this.c.a(byteBuffer, bufferInfo);
            }
        }

        @Override // com.tencent.liteav.editer.u
        public void a(MediaFormat mediaFormat) {
            TXCLog.i("TXCombineEncAndMuxer", "Audio onEncodeFormat format:" + mediaFormat);
            if (i.this.c != null) {
                i.this.c.b(mediaFormat);
                if (i.this.c.c()) {
                    i.this.c.a();
                    i.this.l = true;
                }
            }
        }

        @Override // com.tencent.liteav.editer.u
        public void a() {
            TXCLog.i("TXCombineEncAndMuxer", "===Audio onEncodeComplete===");
            i.this.s = true;
            if (i.this.r) {
                TXCLog.i("TXCombineEncAndMuxer", "===Audio onEncodeComplete=== mVideoEncEnd is true");
                i.this.a();
                i.this.d();
            }
        }
    };
    private LinkedBlockingQueue<com.tencent.liteav.d.e> q = new LinkedBlockingQueue<>();

    static /* synthetic */ int l(i iVar) {
        int i = iVar.y;
        iVar.y = i + 1;
        return i;
    }

    public i(Context context) {
        this.e = context;
    }

    public void a(g gVar) {
        this.v = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        TXCLog.i("TXCombineEncAndMuxer", "retryWithSWEncoder");
        if (this.b != null) {
            this.b.a((com.tencent.liteav.videoencoder.d) null);
            this.b.a();
            this.b = null;
        }
        this.a = true;
        this.b = new com.tencent.liteav.videoencoder.b(2);
        if (this.z != null) {
            this.z.encoderMode = 1;
            this.z.encoderProfile = 3;
            this.z.record = true;
            this.b.c(this.n);
            this.b.a(this.B);
            this.b.a(this.z);
            return;
        }
        TXCLog.e("TXCombineEncAndMuxer", "mVideoEncoderParam is null!!");
    }

    public void a(int i, int i2) {
        this.o = i;
        this.p = i2;
        this.r = false;
        this.s = false;
        this.a = this.o < 1280 && this.p < 1280;
        this.b = new com.tencent.liteav.videoencoder.b(this.a ? 2 : 1);
        this.c = new com.tencent.liteav.muxer.c(this.e, this.a ? 0 : 2);
        if (TextUtils.isEmpty(this.k)) {
            return;
        }
        this.c.a(this.k);
    }

    public void a(String str) {
        this.k = str;
        if (this.c != null) {
            this.c.a(this.k);
        }
    }

    public void a(long j) {
        this.m = j;
    }

    public void a(int i) {
        this.i = i;
    }

    public void b(int i) {
        this.j = i;
    }

    public void a(EGLContext eGLContext) {
        TXCLog.i("TXCombineEncAndMuxer", "OnContextListener onContext");
        TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
        tXSVideoEncoderParam.width = this.o;
        tXSVideoEncoderParam.height = this.p;
        tXSVideoEncoderParam.fps = 20;
        tXSVideoEncoderParam.glContext = eGLContext;
        tXSVideoEncoderParam.enableEGL14 = true;
        tXSVideoEncoderParam.enableBlackList = false;
        tXSVideoEncoderParam.appendSpsPps = false;
        tXSVideoEncoderParam.annexb = true;
        tXSVideoEncoderParam.fullIFrame = false;
        tXSVideoEncoderParam.gop = 3;
        if (this.a) {
            tXSVideoEncoderParam.encoderMode = 1;
            tXSVideoEncoderParam.encoderProfile = 3;
            tXSVideoEncoderParam.record = true;
        } else {
            tXSVideoEncoderParam.encoderMode = 3;
            tXSVideoEncoderParam.encoderProfile = 1;
        }
        this.z = tXSVideoEncoderParam;
        this.b.c(this.n);
        this.b.a(this.B);
        this.b.a(tXSVideoEncoderParam);
        this.f = new com.tencent.liteav.editer.a();
        this.f.a(this.A);
        this.f.a(this.C);
        t tVar = new t();
        tVar.channelCount = this.g;
        tVar.sampleRate = this.j;
        tVar.maxInputSize = this.i;
        tVar.audioBitrate = this.h;
        tVar.encoderType = this.t;
        TXCLog.i("TXCombineEncAndMuxer", "AudioEncoder.start");
        this.f.a(tVar);
    }

    public void a(int i, int i2, int i3, com.tencent.liteav.d.e eVar) {
        if (this.b != null) {
            this.q.add(eVar);
            this.b.c(i, i2, i3, eVar.e() / 1000);
        }
    }

    public void a(com.tencent.liteav.d.e eVar) {
        this.x++;
        if (this.f != null) {
            this.f.a(eVar);
        }
    }

    public void b(com.tencent.liteav.d.e eVar) {
        this.w = eVar;
        if (this.f != null) {
            this.f.a(eVar);
        }
    }

    public void c(com.tencent.liteav.d.e eVar) {
        this.q.add(eVar);
        this.b.c();
    }

    public void a() {
        TXCLog.i("TXCombineEncAndMuxer", "stopEncAndMuxer()");
        if (this.b != null) {
            this.b.a((com.tencent.liteav.videoencoder.d) null);
            this.b.a();
            this.b = null;
        }
        if (this.f != null) {
            this.f.a((u) null);
            this.f.a((com.tencent.liteav.editer.g) null);
            this.f.a();
            this.f = null;
        }
        if (this.c != null) {
            this.c.b();
            this.c = null;
            this.l = false;
        }
        this.k = null;
        this.w = null;
        this.q.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.tencent.liteav.d.e eVar) {
        if (this.v != null) {
            this.v.a((((float) eVar.e()) * 1.0f) / ((float) this.m));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        TXCLog.i("TXCombineEncAndMuxer", "onGenerateComplete()");
        if (this.v != null) {
            this.v.a(0, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        TXCLog.i("TXCombineEncAndMuxer", "onGenerateError()");
        if (this.v != null) {
            this.v.a(i, "Encoder Error");
        }
    }

    public void b() {
        this.u = this.t == 2;
        this.w = null;
        this.x = 0;
        this.y = 0;
    }
}
