package com.tencent.liteav.audio.impl.Record;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.audio.g;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Vector;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends Thread {
    private MediaCodec.BufferInfo a;
    private MediaCodecInfo b;
    private MediaFormat c;
    private MediaCodec d;
    private Vector<byte[]> e;
    private WeakReference<g> f;
    private volatile boolean g;
    private volatile boolean h;
    private final Object i;
    private long j;
    private int k;
    private int l;
    private int m;
    private byte[] n;

    static {
        com.tencent.liteav.basic.util.g.f();
    }

    @TargetApi(16)
    public b() {
        super("TXAudioRecordThread");
        this.g = false;
        this.h = false;
        this.i = new Object();
        this.j = 0L;
        this.k = 48000;
        this.l = 1;
        this.m = 16;
    }

    public void a(int i, int i2, int i3, int i4, WeakReference<g> weakReference) {
        this.f = weakReference;
        this.a = new MediaCodec.BufferInfo();
        this.e = new Vector<>();
        this.k = i2;
        this.l = i3;
        this.m = i4;
        b();
    }

    public void a(byte[] bArr, long j) {
        if (this.e != null && bArr != null) {
            synchronized (this.e) {
                if (this.e == null) {
                    return;
                }
                this.e.add(bArr);
            }
        }
        synchronized (this.i) {
            this.i.notify();
        }
    }

    public void a() {
        c();
    }

    private void b() {
        this.b = a("audio/mp4a-latm");
        if (this.b == null) {
            TXCLog.e("AudioCenter:TXCAudioHWEncoder", "Unable to find an appropriate codec for audio/mp4a-latm");
            return;
        }
        TXCLog.i("AudioCenter:TXCAudioHWEncoder", "selected codec: " + this.b.getName());
        int i = this.k >= 32000 ? 64000 : 32000;
        this.c = MediaFormat.createAudioFormat("audio/mp4a-latm", this.k, this.l);
        this.c.setInteger("bitrate", i);
        this.c.setInteger("channel-count", this.l);
        this.c.setInteger("sample-rate", this.k);
        this.c.setInteger("aac-profile", 2);
        TXCLog.i("AudioCenter:TXCAudioHWEncoder", "format: " + this.c);
        try {
            d();
        } catch (Exception e) {
            TXCLog.e("AudioCenter:TXCAudioHWEncoder", "start media codec failed.", e);
        }
        start();
    }

    private void c() {
        this.h = true;
    }

    @TargetApi(16)
    private void d() throws IOException {
        if (this.d != null) {
            return;
        }
        this.d = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.d.configure(this.c, (Surface) null, (MediaCrypto) null, 1);
        this.d.start();
        TXCLog.i("AudioCenter:TXCAudioHWEncoder", "prepare finishing");
        this.g = true;
    }

    private void e() {
        if (this.d != null) {
            this.d.stop();
            this.d.release();
            this.d = null;
        }
        this.g = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean isEmpty;
        byte[] remove;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
        while (!this.h) {
            if (this.g) {
                synchronized (this.e) {
                    isEmpty = this.e.isEmpty();
                }
                if (isEmpty) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    synchronized (this.e) {
                        remove = this.e.remove(0);
                    }
                    if (remove != null) {
                        try {
                            allocateDirect.clear();
                            if (remove.length > allocateDirect.capacity()) {
                                allocateDirect = ByteBuffer.allocateDirect(remove.length);
                            }
                            allocateDirect.clear();
                            allocateDirect.put(remove);
                            allocateDirect.flip();
                            a(allocateDirect, remove.length, f());
                        } catch (Exception e) {
                            TXCLog.e("AudioCenter:TXCAudioHWEncoder", "encode frame failed.", e);
                        }
                    }
                }
            } else {
                synchronized (this.i) {
                    try {
                        this.i.wait();
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }
        e();
    }

    private void a(ByteBuffer byteBuffer, int i, long j) {
        int dequeueOutputBuffer;
        if (this.h) {
            return;
        }
        ByteBuffer[] inputBuffers = this.d.getInputBuffers();
        int dequeueInputBuffer = this.d.dequeueInputBuffer(10000L);
        if (dequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer2 = inputBuffers[dequeueInputBuffer];
            byteBuffer2.clear();
            if (byteBuffer != null) {
                byteBuffer2.put(byteBuffer);
            }
            if (i <= 0) {
                TXCLog.i("AudioCenter:TXCAudioHWEncoder", "send BUFFER_FLAG_END_OF_STREAM");
                this.d.queueInputBuffer(dequeueInputBuffer, 0, 0, j, 4);
            } else {
                this.d.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
            }
        }
        ByteBuffer[] outputBuffers = this.d.getOutputBuffers();
        do {
            dequeueOutputBuffer = this.d.dequeueOutputBuffer(this.a, 10000L);
            if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer == -3) {
                    outputBuffers = this.d.getOutputBuffers();
                    continue;
                } else if (dequeueOutputBuffer == -2) {
                    this.d.getOutputFormat();
                    continue;
                } else if (dequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer3 = outputBuffers[dequeueOutputBuffer];
                    if ((this.a.flags & 2) != 0) {
                        TXCLog.d("AudioCenter:TXCAudioHWEncoder", "drain:BUFFER_FLAG_CODEC_CONFIG");
                        this.a.size = 0;
                    }
                    if (this.a.size != 0) {
                        this.a.presentationTimeUs = f();
                        this.n = new byte[byteBuffer3.limit()];
                        byteBuffer3.get(this.n);
                        b(this.n, this.a.presentationTimeUs);
                        this.j = this.a.presentationTimeUs;
                    }
                    this.d.releaseOutputBuffer(dequeueOutputBuffer, false);
                    continue;
                } else {
                    continue;
                }
            }
        } while (dequeueOutputBuffer >= 0);
    }

    private long f() {
        long timeTick = TXCTimeUtil.getTimeTick();
        return timeTick < this.j ? timeTick + (this.j - timeTick) : timeTick;
    }

    private static final MediaCodecInfo a(String str) {
        TXCLog.v("AudioCenter:TXCAudioHWEncoder", "selectAudioCodec:");
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                    TXCLog.i("AudioCenter:TXCAudioHWEncoder", "supportedType:" + codecInfoAt.getName() + ",MIME=" + supportedTypes[i2]);
                    if (supportedTypes[i2].equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private void b(byte[] bArr, long j) {
        g gVar;
        if (this.f == null || (gVar = this.f.get()) == null) {
            return;
        }
        gVar.onRecordEncData(bArr, j, this.k, this.l, this.m);
    }
}
