package com.dianping.video.videofilter.transcoder.engine;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.dianping.video.videofilter.transcoder.engine.b;
import com.dianping.video.videofilter.transcoder.engine.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes.dex */
public final class d implements n {
    public static ChangeQuickRedirect a;
    private static final l.c d = l.c.AUDIO;
    String b;
    b.a c;
    private final MediaExtractor e;
    private final l f;
    private long g;
    private final int h;
    private final MediaFormat i;
    private final MediaFormat j;
    private final MediaCodec.BufferInfo k;
    private MediaCodec l;
    private MediaCodec m;
    private MediaFormat n;
    private com.dianping.video.videofilter.transcoder.compat.a o;
    private com.dianping.video.videofilter.transcoder.compat.a p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private a w;
    private long x;
    private boolean y;
    private com.dianping.video.model.g z;

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void b(long j) {
    }

    public d(MediaExtractor mediaExtractor, int i, MediaFormat mediaFormat, l lVar) {
        Object[] objArr = {mediaExtractor, Integer.valueOf(i), mediaFormat, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f2bf83f83ae32b9a35892fc8f67bf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f2bf83f83ae32b9a35892fc8f67bf6");
            return;
        }
        this.k = new MediaCodec.BufferInfo();
        this.e = mediaExtractor;
        this.h = i;
        this.j = mediaFormat;
        this.f = lVar;
        this.i = this.e.getTrackFormat(this.h);
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f407f8718e82d7b57ca278fed4a6c6ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f407f8718e82d7b57ca278fed4a6c6ca");
            return;
        }
        this.e.selectTrack(this.h);
        try {
            this.m = MediaCodec.createEncoderByType(this.j.getString(IMediaFormat.KEY_MIME));
            this.m.configure(this.j, (Surface) null, (MediaCrypto) null, 1);
            this.m.start();
            this.u = true;
            this.p = new com.dianping.video.videofilter.transcoder.compat.a(this.m);
            MediaFormat trackFormat = this.e.getTrackFormat(this.h);
            try {
                this.l = MediaCodec.createDecoderByType(trackFormat.getString(IMediaFormat.KEY_MIME));
                this.l.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                this.l.start();
                this.t = true;
                this.o = new com.dianping.video.videofilter.transcoder.compat.a(this.l);
                this.w = new a(this.l, this.m, this.j, this.z);
                b bVar = new b(this.b, this.c);
                float f = this.z.p;
                float f2 = this.z.q;
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f33b3a4984192287c71d1123ac2c645a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f33b3a4984192287c71d1123ac2c645a");
                } else if (f > 0.0f || f2 > 0.0f) {
                    bVar.c = f;
                    bVar.b = f2;
                }
                this.w.j = bVar;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final MediaFormat b() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03cf A[LOOP:1: B:44:0x0138->B:136:0x03cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f0 A[SYNTHETIC] */
    @Override // com.dianping.video.videofilter.transcoder.engine.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.video.videofilter.transcoder.engine.d.c():boolean");
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final long d() {
        return this.g;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final boolean e() {
        return this.s;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void f() {
        this.v = true;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76a21a1cc96cb226601a9c8f6d0d5f44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76a21a1cc96cb226601a9c8f6d0d5f44");
            return;
        }
        this.e.seekTo(j, 0);
        this.g = j;
        this.x = j;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e0bbc9d1a5e1d599d2920c8dc33916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e0bbc9d1a5e1d599d2920c8dc33916");
            return;
        }
        if (this.l != null) {
            if (this.t) {
                this.l.stop();
            }
            this.l.release();
            this.l = null;
        }
        if (this.m != null) {
            if (this.u) {
                this.m.stop();
            }
            this.m.release();
            this.m = null;
        }
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a(com.dianping.video.model.g gVar) {
        this.z = gVar;
    }
}
