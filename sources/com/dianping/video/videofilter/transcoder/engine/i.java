package com.dianping.video.videofilter.transcoder.engine;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.dianping.video.videofilter.transcoder.engine.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i implements n {
    public static ChangeQuickRedirect a;
    private int b;
    private long c;
    private boolean d;
    private boolean e;
    private final String f;
    private final MediaExtractor g;
    private final l h;
    private final l.c i;
    private final MediaCodec.BufferInfo j;
    private MediaExtractor k;
    private MediaFormat l;
    private ByteBuffer m;

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a() {
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a(long j) {
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void a(com.dianping.video.model.g gVar) {
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final MediaFormat b() {
        return null;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void b(long j) {
    }

    public i(MediaExtractor mediaExtractor, l lVar, String str, l.c cVar) {
        Object[] objArr = {mediaExtractor, lVar, str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5222e724b5170c70f3973ba5c5a6a08e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5222e724b5170c70f3973ba5c5a6a08e");
            return;
        }
        this.b = 65536;
        this.j = new MediaCodec.BufferInfo();
        this.g = mediaExtractor;
        this.h = lVar;
        this.i = cVar;
        this.f = str;
        this.m = ByteBuffer.allocateDirect(this.b).order(ByteOrder.nativeOrder());
        this.k = new MediaExtractor();
        try {
            this.k.setDataSource(this.f);
            int trackCount = this.k.getTrackCount();
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    i = 0;
                    break;
                } else if (this.k.getTrackFormat(i).getString(IMediaFormat.KEY_MIME).startsWith("audio/")) {
                    break;
                } else {
                    i++;
                }
            }
            this.k.selectTrack(i);
            this.l = this.k.getTrackFormat(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.h.a(this.i, this.l);
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d933d3984c7888744da9676d005c15b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d933d3984c7888744da9676d005c15b")).booleanValue();
        }
        if (this.d) {
            return false;
        }
        if (this.e) {
            this.m.clear();
            this.j.set(0, 0, 0L, 4);
            this.h.a(this.i, this.m, this.j);
            this.d = true;
            return true;
        }
        while (this.k.getSampleTime() < this.g.getSampleTime()) {
            this.m.clear();
            int readSampleData = this.k.readSampleData(this.m, 0);
            if (readSampleData < 0) {
                this.m.clear();
                this.j.set(0, 0, 0L, 4);
                this.h.a(this.i, this.m, this.j);
                this.d = true;
                return true;
            }
            this.j.set(0, readSampleData, this.k.getSampleTime(), (this.k.getSampleFlags() & 1) != 0 ? 1 : 0);
            this.h.a(this.i, this.m, this.j);
            this.c = this.j.presentationTimeUs;
            this.k.advance();
        }
        return false;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final long d() {
        return this.c;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final boolean e() {
        return this.d;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void f() {
        this.e = true;
    }

    @Override // com.dianping.video.videofilter.transcoder.engine.n
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee986a2d512c431a06117bab57a5cd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee986a2d512c431a06117bab57a5cd9");
        } else if (this.k != null) {
            this.k.release();
        }
    }
}
