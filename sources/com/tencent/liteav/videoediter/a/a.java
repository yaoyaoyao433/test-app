package com.tencent.liteav.videoediter.a;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
@TargetApi(18)
/* loaded from: classes6.dex */
public class a {
    private MediaMuxer b;
    private final boolean a = false;
    private String c = null;
    private MediaFormat d = null;
    private MediaFormat e = null;
    private int f = 1;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private boolean j = false;
    private boolean k = false;
    private ConcurrentLinkedQueue<C1465a> l = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<C1465a> m = new ConcurrentLinkedQueue<>();
    private long n = -1;
    private long o = -1;
    private long p = -1;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.videoediter.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1465a {
        ByteBuffer a;
        MediaCodec.BufferInfo b;

        public C1465a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.a = byteBuffer;
            this.b = bufferInfo;
        }

        public ByteBuffer a() {
            return this.a;
        }

        public MediaCodec.BufferInfo b() {
            return this.b;
        }
    }

    public synchronized void a(MediaFormat mediaFormat) {
        TXCLog.i("TXCMP4Muxer", "addVideoTrack:" + mediaFormat);
        this.d = mediaFormat;
        this.g = this.g | 1;
        this.l.clear();
    }

    public synchronized void b(MediaFormat mediaFormat) {
        TXCLog.i("TXCMP4Muxer", "addAudioTrack:" + mediaFormat);
        this.e = mediaFormat;
        this.g = this.g | 2;
        this.m.clear();
    }

    public synchronized boolean a() {
        if ((this.f & 1) == 0) {
            return true;
        }
        return (this.g & 1) != 0;
    }

    public synchronized boolean b() {
        if ((this.f & 2) == 0) {
            return true;
        }
        return (this.g & 2) != 0;
    }

    public synchronized int c() {
        if (this.c != null && !this.c.isEmpty()) {
            if (!a()) {
                TXCLog.e("TXCMP4Muxer", "video track not set yet!");
                return -2;
            } else if (!b()) {
                TXCLog.e("TXCMP4Muxer", "audio track not set yet!");
                return -3;
            } else if (this.b != null) {
                TXCLog.e("TXCMP4Muxer", "start has been called. stop must be called before start");
                return 0;
            } else {
                TXCLog.i("TXCMP4Muxer", "start");
                try {
                    this.b = new MediaMuxer(this.c, 0);
                    if (this.d != null) {
                        try {
                            this.i = this.b.addTrack(this.d);
                        } catch (IllegalArgumentException e) {
                            TXCLog.e("TXCMP4Muxer", "addVideoTrack IllegalArgumentException: " + e);
                            return -5;
                        } catch (IllegalStateException e2) {
                            TXCLog.e("TXCMP4Muxer", "addVideoTrack IllegalStateException: " + e2);
                            return -6;
                        }
                    }
                    if (this.e != null) {
                        try {
                            this.h = this.b.addTrack(this.e);
                        } catch (IllegalArgumentException e3) {
                            TXCLog.e("TXCMP4Muxer", "addAudioTrack IllegalArgumentException: " + e3);
                            return -7;
                        } catch (IllegalStateException e4) {
                            TXCLog.e("TXCMP4Muxer", "addAudioTrack IllegalStateException: " + e4);
                            return -8;
                        }
                    }
                    this.b.start();
                    this.n = -1L;
                    this.j = true;
                    this.k = false;
                    this.o = -1L;
                    this.p = -1L;
                    return 0;
                } catch (IOException e5) {
                    e5.printStackTrace();
                    TXCLog.e("TXCMP4Muxer", "create MediaMuxer exception:" + e5);
                    return -4;
                }
            }
        }
        TXCLog.e("TXCMP4Muxer", "target path not set yet!");
        return -1;
    }

    public synchronized int d() {
        if (this.b != null) {
            TXCLog.i("TXCMP4Muxer", "stop. start flag = " + this.j + ", video key frame set = " + this.k);
            try {
                if (this.j && this.k) {
                    this.b.stop();
                }
                this.b.release();
                this.j = false;
                this.b = null;
                this.g = 0;
                this.k = false;
                this.l.clear();
                this.m.clear();
                this.d = null;
                this.e = null;
                this.o = -1L;
                this.p = -1L;
            } catch (Exception e) {
                TXCLog.e("TXCMP4Muxer", "muxer stop/release exception: " + e);
                this.j = false;
                this.b = null;
                this.g = 0;
                this.k = false;
                this.l.clear();
                this.m.clear();
                this.d = null;
                this.e = null;
                this.o = -1L;
                this.p = -1L;
                return -1;
            }
        }
        return 0;
    }

    public synchronized void a(String str) {
        this.c = str;
    }

    public synchronized void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.b == null) {
            a(true, byteBuffer, bufferInfo);
            TXCLog.w("TXCMP4Muxer", "cache frame before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
            return;
        }
        if (this.n < 0) {
            this.n = e();
            f();
        }
        c(byteBuffer, bufferInfo);
    }

    public synchronized void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.b != null && this.n >= 0) {
            d(byteBuffer, bufferInfo);
            return;
        }
        TXCLog.w("TXCMP4Muxer", "cache sample before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
        a(false, byteBuffer, bufferInfo);
    }

    private void c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        long j = bufferInfo.presentationTimeUs - this.n;
        if (j < 0) {
            TXCLog.e("TXCMP4Muxer", "drop frame. first frame offset timeus = " + this.n + ", current timeus = " + bufferInfo.presentationTimeUs);
        } else if (j < this.o) {
            TXCLog.e("TXCMP4Muxer", "drop frame. current frame's pts(" + j + ") must larger than pre frame's pts(" + this.o + CommonConstant.Symbol.BRACKET_RIGHT);
        } else {
            this.o = j;
            bufferInfo.presentationTimeUs = j;
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.b.writeSampleData(this.i, byteBuffer, bufferInfo);
                if ((bufferInfo.flags & 1) != 0) {
                    this.k = true;
                }
            } catch (IllegalStateException e) {
                TXCLog.e("TXCMP4Muxer", "write frame IllegalStateException: " + e);
            }
        }
    }

    private void d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        long j = bufferInfo.presentationTimeUs - this.n;
        if (this.n < 0 || j < 0) {
            TXCLog.w("TXCMP4Muxer", "drop sample. first frame offset timeus = " + this.n + ", current sample timeus = " + bufferInfo.presentationTimeUs);
        } else if (j < this.p) {
            TXCLog.e("TXCMP4Muxer", "drop sample. current sample's pts pts(" + j + ") must larger than pre frame's pts(" + this.p + CommonConstant.Symbol.BRACKET_RIGHT);
        } else {
            this.p = j;
            bufferInfo.presentationTimeUs = j;
            try {
                this.b.writeSampleData(this.h, byteBuffer, bufferInfo);
            } catch (IllegalStateException e) {
                TXCLog.e("TXCMP4Muxer", "write sample IllegalStateException: " + e);
            }
        }
    }

    private void a(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (byteBuffer == null || bufferInfo == null) {
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBuffer.rewind();
        if (bufferInfo.size > 0) {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.size);
        }
        allocateDirect.rewind();
        allocateDirect.put(byteBuffer);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        C1465a c1465a = new C1465a(allocateDirect, bufferInfo2);
        if (z) {
            if (this.l.size() < 200) {
                this.l.add(c1465a);
            } else {
                TXCLog.e("TXCMP4Muxer", "drop video frame. video cache size is larger than 200");
            }
        } else if (this.m.size() < 300) {
            this.m.add(c1465a);
        } else {
            TXCLog.e("TXCMP4Muxer", "drop audio frame. audio cache size is larger than 300");
        }
    }

    private long e() {
        C1465a peek;
        long j = this.l.size() > 0 ? this.l.peek().b().presentationTimeUs : 0L;
        if (this.m.size() <= 0 || (peek = this.m.peek()) == null || peek.b() == null) {
            return j;
        }
        long j2 = this.m.peek().b().presentationTimeUs;
        return j > j2 ? j2 : j;
    }

    private void f() {
        while (this.l.size() > 0) {
            C1465a poll = this.l.poll();
            c(poll.a(), poll.b());
        }
        while (this.m.size() > 0) {
            C1465a poll2 = this.m.poll();
            d(poll2.a(), poll2.b());
        }
    }
}
