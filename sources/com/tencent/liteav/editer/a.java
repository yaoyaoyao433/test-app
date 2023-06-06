package com.tencent.liteav.editer;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private i a;
    private u c;
    private g d;
    private boolean e;
    private int f;
    private int g;
    private TreeSet<Long> i;
    private MediaCodec j;
    private Long k;
    private int m;
    private t n;
    private ArrayList<com.tencent.liteav.d.e> o;
    private MediaFormat q;
    private int r;
    private final Object l = new Object();
    private long p = -1;
    private Runnable s = new Runnable() { // from class: com.tencent.liteav.editer.a.3
        @Override // java.lang.Runnable
        public void run() {
            if (a.this.e) {
                a.this.g();
            }
        }
    };
    private com.tencent.liteav.basic.util.h b = new com.tencent.liteav.basic.util.h("HWAudioEncoder");
    private LinkedBlockingDeque<com.tencent.liteav.d.e> h = new LinkedBlockingDeque<>();

    public void a(u uVar) {
        this.c = uVar;
    }

    public void a(final t tVar) {
        this.n = tVar;
        this.p = -1L;
        if (this.o == null) {
            this.o = new ArrayList<>();
        } else {
            this.o.clear();
        }
        switch (tVar.encoderType) {
            case 1:
                this.q = c(tVar);
                break;
            case 2:
            case 3:
                this.a = new AudioSWEncoder();
                break;
        }
        synchronized (this) {
            this.b.a(new Runnable() { // from class: com.tencent.liteav.editer.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.e) {
                        return;
                    }
                    a.this.b(tVar);
                }
            });
        }
    }

    public void a() {
        synchronized (this) {
            this.b.a(new Runnable() { // from class: com.tencent.liteav.editer.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.e) {
                        a.this.d();
                        a.this.b.a().removeCallbacksAndMessages(null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(t tVar) {
        TXCLog.i("AudioEncoder", "startAudioInner sampleRate:" + tVar.sampleRate + ",channel:" + tVar.channelCount);
        if (Build.VERSION.SDK_INT < 16) {
            return;
        }
        this.h.clear();
        this.e = true;
        this.i = new TreeSet<>();
        this.k = 0L;
        if (this.n.encoderType == 1) {
            MediaCodecInfo a = a("audio/mp4a-latm");
            if (a == null || this.q == null) {
                return;
            }
            try {
                this.j = MediaCodec.createByCodecName(a.getName());
            } catch (IOException e) {
                TXCLog.e("AudioEncoder", "create codec failed.", e);
            }
            this.j.configure(this.q, (Surface) null, (MediaCrypto) null, 1);
            this.j.start();
            this.b.a(this.s, 1L);
            return;
        }
        this.a.a();
        this.a.a(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        TXCLog.i("AudioEncoder", "stopInner");
        if (Build.VERSION.SDK_INT < 16) {
            return;
        }
        if (this.n.encoderType == 1) {
            if (this.j != null) {
                this.j.stop();
                this.j.release();
            }
        } else {
            this.a.b();
        }
        this.e = false;
    }

    public void b() {
        this.b = null;
    }

    public int a(com.tencent.liteav.d.e eVar) {
        if (this.p == -1) {
            this.p = eVar.e();
        }
        if (this.n.encoderType == 1) {
            c(eVar);
            return 1;
        } else if ((eVar.f() & 4) != 0) {
            c(eVar);
            return 1;
        } else {
            return a(eVar, this.n.channelCount * 2048);
        }
    }

    private int a(com.tencent.liteav.d.e eVar, int i) {
        this.r += eVar.g();
        this.o.add(eVar);
        if (this.r >= i) {
            int i2 = this.r / i;
            int i3 = this.r % i;
            byte[] bArr = new byte[this.r];
            int i4 = 0;
            for (int i5 = 0; i5 < this.o.size(); i5++) {
                byte[] b = b(this.o.get(i5));
                if (b.length > 0) {
                    System.arraycopy(b, 0, bArr, i4, b.length);
                    i4 += b.length;
                }
            }
            this.o.clear();
            int i6 = i;
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i6);
                i7 += i;
                i6 += i;
                c(a(copyOfRange));
            }
            if (i3 > 0) {
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i7, bArr.length);
                this.o.add(a(copyOfRange2));
                this.r = copyOfRange2.length;
                return i2;
            }
            this.r = 0;
            return i2;
        }
        return 0;
    }

    private com.tencent.liteav.d.e a(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e();
        eVar.a(wrap);
        eVar.d(bArr.length);
        return eVar;
    }

    public byte[] b(com.tencent.liteav.d.e eVar) {
        ByteBuffer b = eVar.b();
        int g = eVar.g();
        byte[] bArr = new byte[g];
        b.order(ByteOrder.nativeOrder());
        b.position(0);
        b.limit(g);
        b.get(bArr, 0, g);
        return bArr;
    }

    private Long e() {
        long j = this.p;
        if (this.m != 0 && this.n != null && this.n.sampleRate != 0) {
            j = this.p + ((this.m * 1024000000) / this.n.sampleRate);
        }
        this.m++;
        return Long.valueOf(j);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:19|(2:21|(4:72|73|(3:75|76|77)(1:78)|47))(2:79|80)|23|24|25|(1:68)(3:27|28|(3:65|66|67)(3:30|31|(3:33|34|(2:39|(3:44|45|46))(3:50|51|(1:62)(4:53|(1:55)|56|(3:58|59|60)(1:61))))(1:64)))|47|15) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
        com.tencent.liteav.basic.log.TXCLog.e("AudioEncoder", "take from queue failed.", r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(com.tencent.liteav.d.e r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.editer.a.c(com.tencent.liteav.d.e):void");
    }

    private com.tencent.liteav.d.e f() {
        int dequeueInputBuffer;
        ByteBuffer byteBuffer;
        if (Build.VERSION.SDK_INT >= 16 && (dequeueInputBuffer = this.j.dequeueInputBuffer(10000L)) >= 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                byteBuffer = this.j.getInputBuffer(dequeueInputBuffer);
            } else {
                byteBuffer = this.j.getInputBuffers()[dequeueInputBuffer];
            }
            ByteBuffer byteBuffer2 = byteBuffer;
            byteBuffer2.clear();
            return new com.tencent.liteav.d.e(byteBuffer2, 0, 0L, dequeueInputBuffer, 0, 0);
        }
        return null;
    }

    private void a(com.tencent.liteav.d.e eVar, com.tencent.liteav.d.e eVar2) {
        if (Build.VERSION.SDK_INT < 16) {
            return;
        }
        int d = eVar.d();
        ByteBuffer b = eVar.b();
        if (eVar2.p()) {
            this.j.queueInputBuffer(d, 0, 0, eVar2.e(), 4);
            return;
        }
        ByteBuffer duplicate = eVar2.b().duplicate();
        duplicate.rewind();
        duplicate.limit(eVar2.g());
        b.rewind();
        if (eVar2.g() <= b.remaining()) {
            b.put(duplicate);
            this.j.queueInputBuffer(d, 0, eVar2.g(), eVar2.e(), 0);
            return;
        }
        TXCLog.e("AudioEncoder", "input size is larger than buffer capacity. should increate buffer capacity by setting MediaFormat.KEY_MAX_INPUT_SIZE while configure. mime = ");
        throw new IllegalArgumentException("input size is larger than buffer capacity. should increate buffer capacity by setting MediaFormat.KEY_MAX_INPUT_SIZE while configure. mime = ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ByteBuffer byteBuffer;
        if (Build.VERSION.SDK_INT < 16) {
            return;
        }
        if (this.j == null) {
            TXCLog.e("AudioEncoder", "onDecodeOutput, mMediaCodec is null");
            if (this.b != null) {
                this.b.a(this.s, 10L);
                return;
            }
            return;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        ByteBuffer[] outputBuffers = this.j.getOutputBuffers();
        int dequeueOutputBuffer = this.j.dequeueOutputBuffer(bufferInfo, 10000L);
        if (dequeueOutputBuffer == -1) {
            if (this.b != null) {
                this.b.b(this.s);
                return;
            }
            return;
        }
        if (dequeueOutputBuffer == -3) {
            this.j.getOutputBuffers();
        } else if (dequeueOutputBuffer == -2) {
            MediaFormat outputFormat = this.j.getOutputFormat();
            if (this.c != null) {
                this.c.a(outputFormat);
            }
        } else if (dequeueOutputBuffer >= 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                byteBuffer = this.j.getOutputBuffer(dequeueOutputBuffer);
            } else {
                byteBuffer = outputBuffers[dequeueOutputBuffer];
            }
            if (byteBuffer == null) {
                throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null.mime:");
            }
            byte[] bArr = new byte[bufferInfo.size];
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            byteBuffer.get(bArr, 0, bufferInfo.size);
            if ((bufferInfo.flags & 2) == 2) {
                bufferInfo.size = 0;
            }
            if (this.c != null && bufferInfo.size != 0) {
                this.g++;
                bufferInfo.presentationTimeUs = c();
                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                bufferInfo2.set(bufferInfo.offset, bArr.length, bufferInfo.presentationTimeUs, bufferInfo.flags);
                this.c.a(wrap, bufferInfo);
            }
            this.j.releaseOutputBuffer(dequeueOutputBuffer, false);
            if ((bufferInfo.flags & 4) != 0) {
                if (this.c != null) {
                    this.c.a();
                    return;
                }
                return;
            }
        }
        if (this.b != null) {
            this.b.b(this.s);
        }
    }

    protected long c() {
        synchronized (this.l) {
            if (!this.i.isEmpty()) {
                this.k = this.i.pollFirst();
                return this.k.longValue();
            }
            this.k = Long.valueOf(this.k.longValue() + 100);
            return this.k.longValue();
        }
    }

    private MediaFormat c(t tVar) {
        this.n = tVar;
        if (Build.VERSION.SDK_INT >= 16) {
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", tVar.sampleRate, tVar.channelCount);
            createAudioFormat.setInteger("bitrate", tVar.audioBitrate);
            createAudioFormat.setInteger("aac-profile", 2);
            int i = tVar.channelCount * 1024 * 2;
            if (i <= 102400) {
                i = 102400;
            }
            createAudioFormat.setInteger("max-input-size", i);
            return createAudioFormat;
        }
        return null;
    }

    private static MediaCodecInfo a(String str) {
        if (Build.VERSION.SDK_INT >= 16) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
        return null;
    }

    public void a(g gVar) {
        TXCLog.i("AudioEncoder", "setPCMQueueCallback listener:" + gVar);
        this.d = gVar;
    }
}
