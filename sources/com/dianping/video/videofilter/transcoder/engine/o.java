package com.dianping.video.videofilter.transcoder.engine;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import com.dianping.video.videofilter.transcoder.engine.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
@TargetApi(18)
/* loaded from: classes.dex */
public class o implements n {
    public static ChangeQuickRedirect a;
    private long A;
    private com.dianping.video.model.g B;
    private com.dianping.video.model.e C;
    private ArrayList<com.dianping.video.model.e> D;
    private StringBuilder E;
    private com.dianping.video.videofilter.gpuimage.f F;
    private com.dianping.video.videofilter.gpuimage.f G;
    private com.dianping.video.videofilter.gpuimage.d H;
    private boolean I;
    private int b;
    private int c;
    private final MediaExtractor d;
    private final int e;
    private final MediaFormat f;
    private final l g;
    private final MediaCodec.BufferInfo h;
    private MediaCodec i;
    private MediaCodec j;
    private ByteBuffer[] k;
    private ByteBuffer[] l;
    private MediaFormat m;
    private j n;
    private e o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private long w;
    private long x;
    private long y;
    private long z;

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void f() {
    }

    public o(MediaExtractor mediaExtractor, int i, MediaFormat mediaFormat, l lVar) {
        Object[] objArr = {mediaExtractor, Integer.valueOf(i), mediaFormat, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c52b345d88fc63c1d6f8359674b9e3a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c52b345d88fc63c1d6f8359674b9e3a4");
            return;
        }
        this.c = Build.VERSION.SDK_INT;
        this.h = new MediaCodec.BufferInfo();
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.d = mediaExtractor;
        this.e = i;
        this.f = mediaFormat;
        this.g = lVar;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a() {
        boolean z;
        boolean z2 = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faa52499b65a45f271f9f8a6e8fe8868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faa52499b65a45f271f9f8a6e8fe8868");
            return;
        }
        this.d.selectTrack(this.e);
        try {
            if (!TextUtils.isEmpty(this.B.X)) {
                try {
                    this.j = MediaCodec.createByCodecName(this.B.X);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    com.dianping.video.log.c.a().b(o.class, "VideoTrackTranscoder", com.dianping.util.exception.a.a(e));
                }
            }
            if (this.j == null) {
                this.j = MediaCodec.createEncoderByType(this.f.getString(IMediaFormat.KEY_MIME));
            }
            com.dianping.video.util.d a2 = com.dianping.video.util.d.a();
            a2.a("encoder name = " + this.j.getName());
            String name = this.j.getName();
            try {
                this.j.configure(this.f, (Surface) null, (MediaCrypto) null, 1);
            } catch (Exception e2) {
                List<String> a3 = com.dianping.video.videofilter.transcoder.utils.a.a(this.f.getString(IMediaFormat.KEY_MIME), true);
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = a3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String next = it.next();
                    if (!next.equals(name)) {
                        if (this.j != null) {
                            this.j.release();
                        }
                        try {
                            this.j = MediaCodec.createByCodecName(next);
                            this.j.configure(this.f, (Surface) null, (MediaCrypto) null, 1);
                            z = true;
                            break;
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                if (!z) {
                    com.dianping.video.util.d.a().a("all encoder codecs configure failed ");
                    throw e2;
                }
                for (String str : a3) {
                    sb.append(str);
                    sb.append(StringUtil.CRLF_STRING);
                }
                sb.append("default codec configure failed, but codec = ");
                sb.append(this.j.getName());
                sb.append(" configure successfully");
                com.dianping.video.util.d.a().a("encoderConfigInfo", sb.toString());
                com.dianping.video.util.d.a().a(sb.toString());
            }
            this.o = new e(this.j.createInputSurface());
            this.o.a();
            this.j.start();
            this.t = true;
            this.l = this.j.getOutputBuffers();
            MediaFormat trackFormat = this.d.getTrackFormat(this.e);
            if (trackFormat.containsKey("rotation-degrees")) {
                trackFormat.setInteger("rotation-degrees", 0);
            }
            this.B.g = this.f.getInteger("width");
            this.B.h = this.f.getInteger("height");
            this.n = new j(this.B);
            try {
                if (!TextUtils.isEmpty(this.B.W)) {
                    try {
                        this.i = MediaCodec.createByCodecName(this.B.W);
                    } catch (IllegalArgumentException e4) {
                        e4.printStackTrace();
                        com.dianping.video.log.c.a().b(o.class, "VideoTrackTranscoder", com.dianping.util.exception.a.a(e4));
                    }
                }
                if (this.i == null) {
                    this.i = MediaCodec.createDecoderByType(trackFormat.getString(IMediaFormat.KEY_MIME));
                }
                String name2 = this.i.getName();
                com.dianping.video.util.d a4 = com.dianping.video.util.d.a();
                a4.a("decoder name = " + this.i.getName());
                try {
                    this.i.configure(trackFormat, this.n.f, (MediaCrypto) null, 0);
                } catch (Exception e5) {
                    List<String> a5 = com.dianping.video.videofilter.transcoder.utils.a.a(trackFormat.getString(IMediaFormat.KEY_MIME), false);
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it2 = a5.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String next2 = it2.next();
                        if (!next2.equals(name2)) {
                            if (this.i != null) {
                                this.i.release();
                            }
                            try {
                                this.i = MediaCodec.createByCodecName(next2);
                                this.i.configure(trackFormat, this.n.f, (MediaCrypto) null, 0);
                                z2 = true;
                                break;
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                        }
                    }
                    if (!z2) {
                        com.dianping.video.util.d.a().a("all decoder codecs configure failed ");
                        throw e5;
                    }
                    for (String str2 : a5) {
                        sb2.append(str2);
                        sb2.append(StringUtil.CRLF_STRING);
                    }
                    sb2.append("default codec configure failed, but codec = ");
                    sb2.append(this.i.getName());
                    sb2.append(" configure successfully");
                    com.dianping.video.util.d.a().a("decoderConfigInfo", sb2.toString());
                    com.dianping.video.util.d.a().a(sb2.toString());
                }
                this.i.start();
                this.s = true;
                this.k = this.i.getInputBuffers();
            } catch (IOException e7) {
                throw new IllegalStateException(e7);
            }
        } catch (IOException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a(com.dianping.video.model.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf354710ed9288df0df27b9e0cd1cbc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf354710ed9288df0df27b9e0cd1cbc2");
            return;
        }
        this.B = gVar;
        this.D = gVar.Z;
        if (gVar.E) {
            this.E = new StringBuilder();
        }
        com.dianping.video.log.c a2 = com.dianping.video.log.c.a();
        a2.a("VideoTrackTranscoder", " size=" + this.D.size());
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final MediaFormat b() {
        return this.m;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6568e2f8382225fab37c094a1e077b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6568e2f8382225fab37c094a1e077b");
            return;
        }
        this.d.seekTo(j, 0);
        this.w = j;
        this.A = j;
        this.y = j;
        com.dianping.video.log.c a2 = com.dianping.video.log.c.a();
        a2.b(o.class, "VideoTrackTranscoder", "seek to us = " + j);
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de906efc90954d1b5b95c778850f39f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de906efc90954d1b5b95c778850f39f4");
            return;
        }
        this.z = j;
        com.dianping.video.log.c a2 = com.dianping.video.log.c.a();
        a2.b(o.class, "VideoTrackTranscoder", "transcodeDuration = " + j);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0588 A[LOOP:1: B:11:0x002f->B:201:0x0588, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x048e A[SYNTHETIC] */
    @Override // com.dianping.video.videofilter.transcoder.engine.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.video.videofilter.transcoder.engine.o.c():boolean");
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final long d() {
        return this.w;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final boolean e() {
        return this.r;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6285092efda7f080b8b6c585b530c05e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6285092efda7f080b8b6c585b530c05e");
            return;
        }
        if (this.n != null) {
            j jVar = this.n;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "246a1736fb86b249119b194f16f2f516", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "246a1736fb86b249119b194f16f2f516");
            } else {
                if (jVar.b != EGL14.EGL_NO_DISPLAY) {
                    EGL14.eglDestroySurface(jVar.b, jVar.d);
                    EGL14.eglDestroyContext(jVar.b, jVar.c);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(jVar.b);
                }
                if (jVar.f != null) {
                    jVar.f.release();
                    jVar.f = null;
                }
                jVar.b = EGL14.EGL_NO_DISPLAY;
                jVar.c = EGL14.EGL_NO_CONTEXT;
                jVar.d = EGL14.EGL_NO_SURFACE;
                jVar.g = null;
                jVar.e = null;
            }
            this.n = null;
        }
        if (this.o != null) {
            e eVar = this.o;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "51052d117db21357303d2b756034c89c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "51052d117db21357303d2b756034c89c");
            } else {
                if (eVar.b != EGL14.EGL_NO_DISPLAY) {
                    EGL14.eglDestroySurface(eVar.b, eVar.d);
                    EGL14.eglDestroyContext(eVar.b, eVar.c);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(eVar.b);
                }
                eVar.e.release();
                eVar.b = EGL14.EGL_NO_DISPLAY;
                eVar.c = EGL14.EGL_NO_CONTEXT;
                eVar.d = EGL14.EGL_NO_SURFACE;
                eVar.e = null;
            }
            this.o = null;
        }
        if (this.i != null) {
            if (this.s) {
                this.i.stop();
            }
            this.i.release();
            this.i = null;
        }
        if (this.j != null) {
            if (this.t) {
                this.j.stop();
            }
            this.j.release();
            this.j = null;
        }
    }

    private com.dianping.video.model.e a(long j, ArrayList<com.dianping.video.model.e> arrayList) {
        Object[] objArr = {new Long(j), arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb68a651f413f01f289a50ca37584aea", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.video.model.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb68a651f413f01f289a50ca37584aea");
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).b <= j && j < arrayList.get(i).c) {
                return arrayList.get(i);
            }
        }
        return null;
    }

    private int c(long j) {
        Object[] objArr = {0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a2bec4dcc0a799f4649f05263a7a58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a2bec4dcc0a799f4649f05263a7a58")).intValue();
        }
        if (this.r) {
            return 0;
        }
        int dequeueOutputBuffer = this.j.dequeueOutputBuffer(this.h, 0L);
        switch (dequeueOutputBuffer) {
            case -3:
                this.l = this.j.getOutputBuffers();
                return 1;
            case -2:
                if (this.m != null) {
                    throw new RuntimeException("Video output format changed twice.");
                }
                this.m = this.j.getOutputFormat();
                this.g.a(l.c.VIDEO, this.m);
                return 1;
            case -1:
                return 0;
            default:
                if (this.m == null && this.c >= 21) {
                    try {
                        this.m = this.j.getOutputFormat(dequeueOutputBuffer);
                        this.g.a(l.c.VIDEO, this.m);
                        com.dianping.video.log.c.a().b(o.class, "VideoTrackTranscoder", "determine actual output format using getOutputFormat(int)");
                        com.dianping.video.util.d.a().a("outputFormatConfig", "determine actual output format using getOutputFormat(int)");
                    } catch (Exception e) {
                        e.printStackTrace();
                        com.dianping.video.log.c a2 = com.dianping.video.log.c.a();
                        a2.b(o.class, "VideoTrackTranscoder", "e = " + com.dianping.util.exception.a.a(e));
                    }
                }
                if (this.m == null) {
                    throw new RuntimeException("Could not determine actual output format.");
                }
                if ((this.h.flags & 4) != 0) {
                    this.r = true;
                    this.h.set(0, 0, 0L, this.h.flags);
                    com.dianping.video.log.c.a().a("VideoTrackTranscoder", " video track encode end");
                }
                if ((this.h.flags & 2) != 0) {
                    this.j.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return 1;
                }
                if (this.B.x || this.B.B) {
                    if (this.c >= 19 && this.b != 1 && this.h.presentationTimeUs - this.x > this.B.k * 1000) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("request-sync", 0);
                        this.j.setParameters(bundle);
                        this.b = 1;
                        com.dianping.video.log.c a3 = com.dianping.video.log.c.a();
                        a3.a("VideoTrackTranscoder", "request output I Frame ts = " + this.h.presentationTimeUs);
                    }
                    if ((this.h.flags & 1) != 0) {
                        this.x = this.h.presentationTimeUs;
                        this.b = 2;
                        com.dianping.video.log.c a4 = com.dianping.video.log.c.a();
                        a4.a("VideoTrackTranscoder", "I Frame ts = " + this.x);
                    }
                }
                if (this.B.F && this.c >= 19) {
                    if (this.u) {
                        this.g.a(l.c.VIDEO, this.l[dequeueOutputBuffer], this.h);
                        com.dianping.video.log.c a5 = com.dianping.video.log.c.a();
                        a5.a("VideoTrackTranscoder", "write video frame to mp4, bufferInfo : " + com.dianping.video.recorder.manager.a.a(this.h));
                    } else if (this.h.presentationTimeUs > this.y) {
                        if ((this.h.flags & 1) != 0) {
                            this.g.a(l.c.VIDEO, this.l[dequeueOutputBuffer], this.h);
                            this.u = true;
                            this.b = 2;
                            com.dianping.video.log.c a6 = com.dianping.video.log.c.a();
                            a6.a("VideoTrackTranscoder", "Muxer(clipVideoExactly) start to write video sample data bufferInfo : " + com.dianping.video.recorder.manager.a.a(this.h));
                        } else if (this.b != 1) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("request-sync", 0);
                            this.b = 1;
                            this.j.setParameters(bundle2);
                            com.dianping.video.log.c a7 = com.dianping.video.log.c.a();
                            a7.a("VideoTrackTranscoder", "Muxer(clipVideoExactly) video frame is AsyncFrame bufferInfo : " + com.dianping.video.recorder.manager.a.a(this.h));
                        }
                    } else {
                        com.dianping.video.log.c a8 = com.dianping.video.log.c.a();
                        a8.a("VideoTrackTranscoder", "Skip this frame , bufferInfo : " + com.dianping.video.recorder.manager.a.a(this.h));
                    }
                } else {
                    this.g.a(l.c.VIDEO, this.l[dequeueOutputBuffer], this.h);
                }
                this.w = this.h.presentationTimeUs;
                if (!this.v) {
                    this.A = this.h.presentationTimeUs;
                    this.v = true;
                    com.dianping.video.log.c a9 = com.dianping.video.log.c.a();
                    a9.b(o.class, "VideoTrackTranscoder", "mVideoFirstTimeStamp = " + this.A);
                }
                this.j.releaseOutputBuffer(dequeueOutputBuffer, false);
                return 2;
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9a7caa125598632f484fe9be689a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9a7caa125598632f484fe9be689a41");
        } else {
            this.g.a();
        }
    }
}
