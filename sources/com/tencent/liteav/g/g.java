package com.tencent.liteav.g;

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
@TargetApi(19)
/* loaded from: classes6.dex */
public class g implements b {
    private MediaCodec b;
    private ByteBuffer[] c;
    private ByteBuffer[] d;
    private long f = 1000;
    private AtomicBoolean e = new AtomicBoolean(false);

    @Override // com.tencent.liteav.g.b
    public void a(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            TXCLog.e("TXHWAudioDecoder", "create AudioDecoder error format:" + mediaFormat);
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
            TXCLog.e("TXHWAudioDecoder", "configure AudioDecoder error");
        } else {
            this.b.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        }
    }

    @Override // com.tencent.liteav.g.b
    public void a() {
        if (this.b == null) {
            TXCLog.e("TXHWAudioDecoder", "start AudioDecoder error");
            return;
        }
        this.b.start();
        this.d = this.b.getInputBuffers();
        this.c = this.b.getOutputBuffers();
        this.e.getAndSet(true);
    }

    @Override // com.tencent.liteav.g.b
    public void b() {
        if (this.b == null) {
            TXCLog.e("TXHWAudioDecoder", "stop AudioDecoder error");
            return;
        }
        try {
            try {
                this.b.stop();
                this.b.release();
            } catch (IllegalStateException e) {
                TXCLog.e("TXHWAudioDecoder", "audio decoder stop exception: " + e);
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
                TXCLog.e("TXHWAudioDecoder", "audio dequeueInputBuffer exception: " + e);
                i = -1;
            }
            if (i >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer = this.b.getInputBuffer(i);
                } else {
                    byteBuffer = this.d[i];
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
        if (this.e.get() && (dequeueOutputBuffer = this.b.dequeueOutputBuffer((bufferInfo = new MediaCodec.BufferInfo()), this.f)) != -1 && dequeueOutputBuffer != -3 && dequeueOutputBuffer != -2 && dequeueOutputBuffer >= 0 && dequeueOutputBuffer >= 0) {
            com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e();
            eVar.a(1);
            eVar.a(bufferInfo.presentationTimeUs);
            eVar.c(bufferInfo.flags);
            eVar.d(bufferInfo.size);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
            if (Build.VERSION.SDK_INT >= 21) {
                allocateDirect.put(this.b.getOutputBuffer(dequeueOutputBuffer));
            } else {
                ByteBuffer byteBuffer = this.b.getOutputBuffers()[dequeueOutputBuffer];
                byteBuffer.rewind();
                byteBuffer.limit(bufferInfo.size);
                allocateDirect.put(byteBuffer);
            }
            allocateDirect.position(0);
            if (eVar.g() >= 0) {
                allocateDirect.limit(eVar.g());
            }
            eVar.a(allocateDirect);
            this.b.releaseOutputBuffer(dequeueOutputBuffer, false);
            return eVar;
        }
        return null;
    }
}
