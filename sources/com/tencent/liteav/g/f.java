package com.tencent.liteav.g;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class f implements b {
    private static final String[] d = {"Xiaomi - MI 3"};
    private AtomicBoolean b = new AtomicBoolean(false);
    private b c;
    private boolean e;

    private boolean b(MediaFormat mediaFormat) {
        String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
        TXCLog.i("TXAudioDecoderWrapper", " mime type = " + string);
        if (string != null && com.tencent.liteav.videoediter.ffmpeg.c.a(string)) {
            TXCLog.i("TXAudioDecoderWrapper", "isUseSw: support mime type! use sw decoder!");
            return true;
        }
        TXCLog.i("TXAudioDecoderWrapper", "isUseSw: use hw decoder!");
        return false;
    }

    @Override // com.tencent.liteav.g.b
    public void a(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            this.b.set(false);
            return;
        }
        this.b.set(true);
        TXCLog.i("TXAudioDecoderWrapper", "createDecoderByFormat: " + mediaFormat.toString());
        this.e = b(mediaFormat);
        if (this.e) {
            this.c = new com.tencent.liteav.videoediter.ffmpeg.c();
        } else {
            this.c = new g();
        }
        this.c.a(mediaFormat);
    }

    @Override // com.tencent.liteav.g.b
    public void a(MediaFormat mediaFormat, Surface surface) {
        if (mediaFormat == null) {
            this.b.set(false);
            return;
        }
        this.b.set(true);
        this.c.a(mediaFormat, surface);
    }

    @Override // com.tencent.liteav.g.b
    public void a() {
        if (this.b.get()) {
            this.c.a();
        }
    }

    @Override // com.tencent.liteav.g.b
    public void b() {
        if (this.b.get()) {
            this.c.b();
        }
    }

    @Override // com.tencent.liteav.g.b
    public com.tencent.liteav.d.e c() {
        if (this.b.get()) {
            return this.c.c();
        }
        return null;
    }

    @Override // com.tencent.liteav.g.b
    public void a(com.tencent.liteav.d.e eVar) {
        if (this.b.get()) {
            this.c.a(eVar);
        }
    }

    @Override // com.tencent.liteav.g.b
    public com.tencent.liteav.d.e d() {
        if (this.b.get()) {
            return this.c.d();
        }
        return null;
    }

    public com.tencent.liteav.d.e a(com.tencent.liteav.d.e eVar, com.tencent.liteav.d.e eVar2) {
        if (this.b.get()) {
            eVar2.k(eVar.n());
            eVar2.j(eVar.m());
            eVar2.f(eVar.i());
            eVar2.e(eVar.h());
            eVar2.i(eVar.l());
            eVar2.h(eVar.k());
            eVar2.g(eVar.j());
            return eVar2;
        }
        return null;
    }

    public com.tencent.liteav.d.e b(com.tencent.liteav.d.e eVar) {
        if (this.b.get()) {
            eVar.c(4);
            TXCLog.i("TXAudioDecoderWrapper", "------appendEndFrame----------");
            return eVar;
        }
        return null;
    }
}
