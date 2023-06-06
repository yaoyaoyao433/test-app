package com.tencent.liteav.b;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class l implements com.tencent.liteav.g.b {
    private MediaCodec b;
    private ByteBuffer[] c;
    private ByteBuffer[] d;
    private long f = 1000;
    private AtomicBoolean e = new AtomicBoolean(false);

    @Override // com.tencent.liteav.g.b
    public void a(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            TXCLog.e("TXCombineVideoDecoder", "create VideoDecoder error format:" + mediaFormat);
            return;
        }
        try {
            this.b = MediaCodec.createDecoderByType(mediaFormat.getString(IMediaFormat.KEY_MIME));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // com.tencent.liteav.g.b
    public void a(MediaFormat mediaFormat, Surface surface) {
        if (mediaFormat == null) {
            TXCLog.e("TXCombineVideoDecoder", "configure VideoDecoder error");
            return;
        }
        TXCLog.i("TXCombineVideoDecoder", "format: " + mediaFormat + ", surface: " + surface + ", mMediaCodec: " + this.b);
        mediaFormat.setInteger("rotation-degrees", 0);
        this.b.configure(mediaFormat, surface, (MediaCrypto) null, 0);
    }

    @Override // com.tencent.liteav.g.b
    public void a() {
        TXCLog.i("TXCombineVideoDecoder", "start");
        if (this.b == null) {
            TXCLog.e("TXCombineVideoDecoder", "start VideoDecoder error");
            return;
        }
        this.b.start();
        this.c = this.b.getInputBuffers();
        this.d = this.b.getOutputBuffers();
        this.e.getAndSet(true);
    }

    @Override // com.tencent.liteav.g.b
    public void b() {
        TXCLog.i("TXCombineVideoDecoder", "stop");
        if (this.b == null) {
            TXCLog.e("TXCombineVideoDecoder", "stop VideoDecoder error");
            return;
        }
        try {
            try {
                this.b.stop();
                this.b.release();
            } catch (IllegalStateException e) {
                TXCLog.e("TXCombineVideoDecoder", "video decoder stop exception: " + e);
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
                i = this.b.dequeueInputBuffer(this.f);
            } catch (Exception e) {
                TXCLog.e("TXCombineVideoDecoder", "video dequeueInputBuffer exception: " + e);
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
            return null;
        }
        return null;
    }

    @Override // com.tencent.liteav.g.b
    public void a(com.tencent.liteav.d.e eVar) {
        if (this.e.get()) {
            this.b.queueInputBuffer(eVar.d(), 0, eVar.g(), eVar.e(), eVar.f());
        }
    }

    @Override // com.tencent.liteav.g.b
    public com.tencent.liteav.d.e d() {
        MediaCodec.BufferInfo bufferInfo;
        int dequeueOutputBuffer;
        if (this.e.get() && (dequeueOutputBuffer = this.b.dequeueOutputBuffer((bufferInfo = new MediaCodec.BufferInfo()), this.f)) != -1) {
            if (dequeueOutputBuffer == -3) {
                TXCLog.i("TXCombineVideoDecoder", "INFO_OUTPUT_BUFFERS_CHANGED info.size :" + bufferInfo.size);
            } else if (dequeueOutputBuffer == -2) {
                TXCLog.i("TXCombineVideoDecoder", "INFO_OUTPUT_FORMAT_CHANGED info.size :" + bufferInfo.size);
            } else if (dequeueOutputBuffer >= 0 && dequeueOutputBuffer >= 0) {
                this.b.releaseOutputBuffer(dequeueOutputBuffer, true);
                return new com.tencent.liteav.d.e(null, bufferInfo.size, bufferInfo.presentationTimeUs, dequeueOutputBuffer, bufferInfo.flags, 0);
            }
        }
        return null;
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
            return eVar2;
        }
        return null;
    }
}
