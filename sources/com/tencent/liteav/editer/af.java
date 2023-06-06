package com.tencent.liteav.editer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.g.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class af implements com.tencent.liteav.g.b {
    private MediaCodec b;
    private ByteBuffer[] c;
    private ByteBuffer[] d;
    private MediaFormat g;
    private Surface h;
    private long f = 1000;
    private b.a i = com.tencent.liteav.g.b.a;
    private int j = 0;
    private final int k = 40;
    private AtomicBoolean e = new AtomicBoolean(false);

    @Override // com.tencent.liteav.g.b
    public void a(MediaFormat mediaFormat) {
    }

    @Override // com.tencent.liteav.g.b
    public void a(MediaFormat mediaFormat, Surface surface) {
        this.g = mediaFormat;
        this.h = surface;
    }

    @Override // com.tencent.liteav.g.b
    public void a() {
        TXCLog.i("VideoMediaCodecDecoder", "start");
        MediaFormat mediaFormat = this.g;
        if (mediaFormat == null) {
            TXCLog.e("VideoMediaCodecDecoder", "start -> media format is null.");
            return;
        }
        mediaFormat.setInteger("rotation-degrees", 0);
        try {
            this.b = MediaCodec.createDecoderByType(mediaFormat.getString(IMediaFormat.KEY_MIME));
            this.b.configure(mediaFormat, this.h, (MediaCrypto) null, 0);
            this.b.start();
            this.c = this.b.getInputBuffers();
            this.d = this.b.getOutputBuffers();
            this.e.getAndSet(true);
            TXCLog.i("VideoMediaCodecDecoder", "start -> decoder start success.");
        } catch (Exception e) {
            TXCLog.e("VideoMediaCodecDecoder", "start -> decoder start fail.");
            e.printStackTrace();
            this.e.getAndSet(false);
            a("start decoder.");
            b("start decoder error.");
        }
    }

    @Override // com.tencent.liteav.g.b
    public void b() {
        TXCLog.i("VideoMediaCodecDecoder", "stop");
        if (this.b == null || !this.e.get()) {
            TXCLog.e("VideoMediaCodecDecoder", "stop VideoDecoder error");
            return;
        }
        try {
            try {
                this.b.stop();
                this.b.release();
            } catch (Exception e) {
                TXCLog.e("VideoMediaCodecDecoder", "video decoder stop exception: " + e);
            }
        } finally {
            this.e.getAndSet(false);
        }
    }

    @Override // com.tencent.liteav.g.b
    public com.tencent.liteav.d.e c() {
        int i;
        ByteBuffer byteBuffer;
        if (this.e.get()) {
            try {
                try {
                    i = this.b.dequeueInputBuffer(this.f);
                } catch (Exception e) {
                    TXCLog.e("VideoMediaCodecDecoder", "video dequeueInputBuffer exception: " + e);
                    i = -1;
                }
                if (i >= 0) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        byteBuffer = this.b.getInputBuffer(i);
                    } else {
                        byteBuffer = this.c[i];
                    }
                    return new com.tencent.liteav.d.e(byteBuffer, 0, 0L, i, 0, 0);
                }
            } catch (Exception unused) {
                TXCLog.e("VideoMediaCodecDecoder", "findFreeFrame error");
                f();
            }
            return null;
        }
        return null;
    }

    @Override // com.tencent.liteav.g.b
    public void a(com.tencent.liteav.d.e eVar) {
        if (this.e.get()) {
            try {
                this.b.queueInputBuffer(eVar.d(), 0, eVar.g(), eVar.e(), eVar.f());
            } catch (Exception unused) {
                f();
                TXCLog.e("VideoMediaCodecDecoder", "decodeFrame error.");
            }
        }
    }

    @Override // com.tencent.liteav.g.b
    public com.tencent.liteav.d.e d() {
        if (this.e.get()) {
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int dequeueOutputBuffer = this.b.dequeueOutputBuffer(bufferInfo, this.f);
                if (dequeueOutputBuffer != -1 && dequeueOutputBuffer != -3 && dequeueOutputBuffer != -2 && dequeueOutputBuffer >= 0 && dequeueOutputBuffer >= 0) {
                    com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e(null, bufferInfo.size, bufferInfo.presentationTimeUs, dequeueOutputBuffer, bufferInfo.flags, 0);
                    this.b.releaseOutputBuffer(dequeueOutputBuffer, true);
                    return eVar;
                }
            } catch (Exception unused) {
                TXCLog.e("VideoMediaCodecDecoder", "getDecodedFrame");
                f();
            }
            return null;
        }
        return null;
    }

    public void e() {
        if (this.e.get()) {
            this.b.flush();
            this.c = this.b.getInputBuffers();
            this.d = this.b.getOutputBuffers();
        }
    }

    public com.tencent.liteav.d.e a(com.tencent.liteav.d.e eVar, com.tencent.liteav.d.e eVar2) {
        if (this.e.get()) {
            eVar2.k(eVar.n());
            eVar2.j(eVar.m());
            eVar2.e(eVar.h());
            eVar2.f(eVar.i());
            eVar2.i(eVar.l());
            eVar2.h(eVar.k());
            eVar2.g(eVar.j());
            eVar2.b(eVar.e());
            return eVar2;
        }
        return null;
    }

    public com.tencent.liteav.d.e b(com.tencent.liteav.d.e eVar) {
        if (this.e.get()) {
            eVar.d(0);
            eVar.a(0L);
            eVar.c(4);
            TXCLog.i("VideoMediaCodecDecoder", "------appendEndFrame----------");
            return eVar;
        }
        return null;
    }

    public void a(b.a aVar) {
        if (aVar != null) {
            this.i = aVar;
        } else {
            this.i = com.tencent.liteav.g.b.a;
        }
    }

    private void a(String str) {
        TXCLog.i("VideoMediaCodecDecoder", "releaseDecoder -> [ " + str + " ] ");
        this.e.set(false);
        if (this.b != null) {
            try {
                this.b.release();
            } catch (Exception e) {
                e.printStackTrace();
                TXCLog.e("VideoMediaCodecDecoder", "releaseDecoder -> [ " + str + " ]  : release codec error.");
            }
        }
    }

    private void b(String str) {
        b.a aVar = this.i;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    private void f() {
        if (this.j >= 40) {
            this.j = 0;
            b("check decoder error.");
            return;
        }
        this.j++;
    }
}
