package com.dianping.video.videofilter.transcoder.engine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import com.dianping.video.videofilter.transcoder.engine.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes.dex */
public class k implements n {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ boolean b = !k.class.desiredAssertionStatus();
    private final MediaExtractor c;
    private final int d;
    private final l e;
    private final l.c f;
    private final MediaCodec.BufferInfo g;
    private int h;
    private ByteBuffer i;
    private boolean j;
    private MediaFormat k;
    private long l;
    private boolean m;
    private com.dianping.video.model.g n;
    private long o;
    private boolean p;

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a() {
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void b(long j) {
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void g() {
    }

    public k(MediaExtractor mediaExtractor, int i, l lVar, l.c cVar) {
        Object[] objArr = {mediaExtractor, Integer.valueOf(i), lVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7746faa82a49171251ecb78d733490c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7746faa82a49171251ecb78d733490c");
            return;
        }
        this.g = new MediaCodec.BufferInfo();
        this.m = false;
        this.c = mediaExtractor;
        this.d = i;
        this.e = lVar;
        this.f = cVar;
        this.k = this.c.getTrackFormat(this.d);
        this.e.a(this.f, this.k);
        try {
            this.h = this.k.getInteger("max-input-size");
        } catch (Exception unused) {
            this.h = 65536;
        }
        this.i = ByteBuffer.allocateDirect(this.h).order(ByteOrder.nativeOrder());
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final MediaFormat b() {
        return this.k;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e5d7b07421555fb492f0eb6930bcd2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e5d7b07421555fb492f0eb6930bcd2d");
            return;
        }
        this.c.seekTo(j, 0);
        this.l = j;
        this.o = j;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    @SuppressLint({"Assert"})
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "214504eec2b295f325c5e0da585b72a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "214504eec2b295f325c5e0da585b72a4")).booleanValue();
        }
        if (this.j) {
            return false;
        }
        int sampleTrackIndex = this.c.getSampleTrackIndex();
        if (sampleTrackIndex < 0 || this.m) {
            this.i.clear();
            this.g.set(0, 0, 0L, 4);
            this.e.a(this.f, this.i, this.g);
            this.j = true;
            com.dianping.video.log.c.a().a("PassTrough", "audio track end");
            return true;
        } else if (sampleTrackIndex != this.d) {
            return false;
        } else {
            this.i.clear();
            int readSampleData = this.c.readSampleData(this.i, 0);
            if (b || readSampleData <= this.h) {
                this.g.set(0, readSampleData, this.c.getSampleTime(), (this.c.getSampleFlags() & 1) != 0 ? 1 : 0);
                if (this.n.F && Build.VERSION.SDK_INT >= 19) {
                    if (this.p) {
                        this.e.a(this.f, this.i, this.g);
                        com.dianping.video.log.c a2 = com.dianping.video.log.c.a();
                        a2.a("PassThroughTrackTranscoder", "Muxer(clipVideoExactly) start to write audio sample data ts = " + this.g.presentationTimeUs);
                    } else if (this.g.presentationTimeUs > this.o) {
                        this.p = true;
                        com.dianping.video.log.c a3 = com.dianping.video.log.c.a();
                        a3.a("PassThroughTrackTranscoder", "Muxer(clipVideoExactly) audio sample data pts < mStart ; ts= " + this.g.presentationTimeUs);
                    }
                } else {
                    this.e.a(this.f, this.i, this.g);
                }
                this.l = this.g.presentationTimeUs;
                this.c.advance();
                return true;
            }
            throw new AssertionError();
        }
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final long d() {
        return this.l;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final boolean e() {
        return this.j;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void f() {
        this.m = true;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a(com.dianping.video.model.g gVar) {
        this.n = gVar;
    }
}
