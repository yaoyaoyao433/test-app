package com.tencent.liteav.videodecoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.dianping.shield.entity.ExposeAction;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.g;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e implements b {
    private f r;
    private WeakReference<com.tencent.liteav.basic.c.b> u;
    private MediaCodec.BufferInfo a = new MediaCodec.BufferInfo();
    private MediaCodec b = null;
    private String c = "video/avc";
    private int d = 540;
    private int e = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
    private long f = 0;
    private long g = 0;
    private boolean h = true;
    private boolean i = false;
    private boolean j = false;
    private Surface k = null;
    private int l = 0;
    private ArrayList<TXSNALPacket> m = new ArrayList<>();
    private ArrayList<Long> n = new ArrayList<>();
    private long o = 0;
    private int p = 0;
    private JSONArray q = null;
    private d s = new d();
    private boolean t = false;

    @Override // com.tencent.liteav.videodecoder.b
    public void setListener(f fVar) {
        this.r = fVar;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void setNotifyListener(WeakReference<com.tencent.liteav.basic.c.b> weakReference) {
        this.u = weakReference;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int config(Surface surface) {
        if (surface == null) {
            return -1;
        }
        this.k = surface;
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void decode(TXSNALPacket tXSNALPacket) {
        a(tXSNALPacket.codecId == 1);
        a(tXSNALPacket);
        this.m.add(tXSNALPacket);
        while (!this.m.isEmpty()) {
            int size = this.m.size();
            try {
                b();
            } catch (Exception e) {
                TXCLog.e("MediaCodecDecoder", "decode: doDecode Exception!! " + e.toString());
            }
            if (size == this.m.size()) {
                return;
            }
        }
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, boolean z2) {
        return a(byteBuffer, byteBuffer2, z2);
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void stop() {
        a();
    }

    @Override // com.tencent.liteav.videodecoder.b
    public boolean isHevc() {
        return this.j;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int GetDecodeCost() {
        return this.p;
    }

    public void a(JSONArray jSONArray) {
        this.q = jSONArray;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void enableLimitDecCache(boolean z) {
        this.t = z;
        TXCLog.i("MediaCodecDecoder", "decode: enable limit dec cache: " + z);
    }

    public void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.d = i;
        this.e = i2;
        TXCLog.w("MediaCodecDecoder", "decode: init with video size: " + this.d + ", " + this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(java.nio.ByteBuffer r8, java.nio.ByteBuffer r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videodecoder.e.a(java.nio.ByteBuffer, java.nio.ByteBuffer, boolean):int");
    }

    private void a() {
        if (this.b != null) {
            try {
                try {
                    this.b.stop();
                    TXCLog.w("MediaCodecDecoder", "decode: stop decoder sucess");
                    try {
                        try {
                            this.b.release();
                            TXCLog.w("MediaCodecDecoder", "decode: release decoder sucess");
                        } finally {
                        }
                    } catch (Exception e) {
                        TXCLog.e("MediaCodecDecoder", "decode: release decoder exception: " + e.toString());
                    }
                } catch (Exception e2) {
                    TXCLog.e("MediaCodecDecoder", "decode: stop decoder Exception: " + e2.toString());
                    try {
                        try {
                            this.b.release();
                            TXCLog.w("MediaCodecDecoder", "decode: release decoder sucess");
                        } catch (Exception e3) {
                            TXCLog.e("MediaCodecDecoder", "decode: release decoder exception: " + e3.toString());
                        }
                    } finally {
                    }
                }
                this.m.clear();
                this.f = 0L;
                this.h = true;
                this.i = false;
            } catch (Throwable th) {
                try {
                    try {
                        this.b.release();
                        TXCLog.w("MediaCodecDecoder", "decode: release decoder sucess");
                    } catch (Exception e4) {
                        TXCLog.e("MediaCodecDecoder", "decode: release decoder exception: " + e4.toString());
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    @TargetApi(16)
    private void b() {
        int i;
        int i2;
        if (this.b == null) {
            TXCLog.e("MediaCodecDecoder", "null decoder");
            return;
        }
        TXSNALPacket tXSNALPacket = this.m.get(0);
        if (tXSNALPacket == null || tXSNALPacket.nalData.length == 0) {
            TXCLog.e("MediaCodecDecoder", "decode: empty buffer");
            this.m.remove(0);
            return;
        }
        long timeTick = TXCTimeUtil.getTimeTick();
        long j = 0;
        if (this.o == 0) {
            this.o = timeTick;
        }
        ByteBuffer[] byteBufferArr = null;
        try {
            byteBufferArr = this.b.getInputBuffers();
        } catch (Exception e) {
            TXCLog.e("MediaCodecDecoder", "decode: getInputBuffers Exception!! " + e.toString());
        }
        if (byteBufferArr == null || byteBufferArr.length == 0) {
            TXCLog.e("MediaCodecDecoder", "decode: getInputBuffers failed");
            return;
        }
        try {
            i = this.b.dequeueInputBuffer(10000L);
        } catch (Exception e2) {
            TXCLog.e("MediaCodecDecoder", "decode: dequeueInputBuffer Exception!! " + e2.toString());
            i = XPlayerConstants.MEDIA_ERROR_IJK_PLAYER;
        }
        if (i >= 0) {
            byteBufferArr[i].put(tXSNALPacket.nalData);
            try {
                this.b.queueInputBuffer(i, 0, tXSNALPacket.nalData.length, tXSNALPacket.pts, 0);
                this.m.remove(0);
            } catch (Exception unused) {
                g();
            }
            if (this.f == 0) {
                TXCLog.w("MediaCodecDecoder", "decode: input buffer available, dequeueInputBuffer index: " + i);
            }
        } else {
            TXCLog.w("MediaCodecDecoder", "decode: input buffer not available, dequeueInputBuffer failed");
        }
        try {
            i2 = this.b.dequeueOutputBuffer(this.a, 10000L);
        } catch (Exception e3) {
            g();
            TXCLog.e("MediaCodecDecoder", "decode: dequeueOutputBuffer exception!!" + e3);
            i2 = XPlayerConstants.MEDIA_ERROR_IJK_PLAYER;
        }
        if (i2 >= 0) {
            a(i2, this.a.presentationTimeUs, this.a.presentationTimeUs, tXSNALPacket.rotation);
            this.l = 0;
        } else if (i2 == -1) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            TXCLog.i("MediaCodecDecoder", "decode: no output from decoder available when timeout fail count " + this.l);
            g();
        } else if (i2 == -3) {
            TXCLog.i("MediaCodecDecoder", "decode: output buffers changed");
        } else if (i2 == -2) {
            c();
        } else {
            TXCLog.e("MediaCodecDecoder", "decode: unexpected result from decoder.dequeueOutputBuffer: " + i2);
        }
        long timeTick2 = TXCTimeUtil.getTimeTick();
        this.n.add(Long.valueOf(timeTick2 - timeTick));
        if (timeTick2 > this.o + 1000) {
            Iterator<Long> it = this.n.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                if (next.longValue() > j) {
                    j = next.longValue();
                }
            }
            this.n.clear();
            this.o = timeTick2;
            this.p = (int) (j * 3);
        }
    }

    private void a(int i, long j, long j2, int i2) {
        this.b.releaseOutputBuffer(i, true);
        if ((this.a.flags & 4) != 0) {
            TXCLog.i("MediaCodecDecoder", "output EOS");
        }
        try {
            if (this.r != null) {
                this.r.onDecodeFrame(null, this.d, this.e, j, j2, i2);
            }
        } catch (Exception e) {
            TXCLog.e("MediaCodecDecoder", "onDecodeFrame failed.", e);
        }
        d();
    }

    private void c() {
        MediaFormat outputFormat = this.b.getOutputFormat();
        TXCLog.i("MediaCodecDecoder", "decode output format changed: " + outputFormat);
        int integer = outputFormat.getInteger("width");
        int integer2 = outputFormat.getInteger("height");
        int min = Math.min(Math.abs(outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1, integer);
        int min2 = Math.min(Math.abs(outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1, integer2);
        if (min != this.d || min2 != this.e) {
            this.d = min;
            this.e = min2;
            try {
                if (this.r != null) {
                    this.r.onVideoSizeChange(this.d, this.e);
                }
            } catch (Exception e) {
                TXCLog.e("MediaCodecDecoder", "onVideoSizeChange failed.", e);
            }
            TXCLog.i("MediaCodecDecoder", "decode: video size change to w:" + min + ",h:" + min2);
        } else if (this.h) {
            this.h = false;
            if (this.r != null) {
                this.r.onVideoSizeChange(this.d, this.e);
            }
        }
    }

    private void d() {
        if (this.f == 0) {
            TXCLog.w("MediaCodecDecoder", "decode first frame sucess");
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f > 0 && currentTimeMillis > this.f + 1000 && currentTimeMillis > this.g + ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE && this.g != 0) {
            TXCLog.e("MediaCodecDecoder", "frame interval[" + (currentTimeMillis - this.f) + "] > 1000");
            this.g = currentTimeMillis;
        }
        if (this.g == 0) {
            this.g = currentTimeMillis;
        }
        this.f = currentTimeMillis;
    }

    private boolean e() {
        MediaCodecInfo codecInfoAt;
        MediaCodecInfo[] codecInfos;
        if (Build.VERSION.SDK_INT >= 21) {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.contains("video/hevc")) {
                        TXCLog.e("MediaCodecDecoder", "decode: video/hevc MediaCodecInfo: " + mediaCodecInfo.getName() + ",encoder:" + mediaCodecInfo.isEncoder());
                        return true;
                    }
                }
            }
            return false;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                for (String str2 : MediaCodecList.getCodecInfoAt(i).getSupportedTypes()) {
                    if (str2.contains("video/hevc")) {
                        TXCLog.e("MediaCodecDecoder", "video/hevc MediaCodecInfo: " + codecInfoAt.getName() + ",encoder:" + codecInfoAt.isEncoder());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void f() {
        if (this.i) {
            return;
        }
        this.i = true;
        TXCLog.w("MediaCodecDecoder", "decode: hw decode error, hevc: " + this.j);
        if (this.j) {
            g.a(this.u, -2304, "h265 Decoding failed");
        } else {
            g.a(this.u, 2106, "Failed to enable hardware decoding，use software decoding.");
        }
        if (this.r != null) {
            this.r.onDecodeFailed(-1);
        }
    }

    private void g() {
        if (this.l >= 40) {
            f();
            this.l = 0;
            return;
        }
        this.l++;
    }

    private void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (this.j && !e()) {
                a();
                f();
                return;
            }
            a();
            a(null, null, this.j);
        }
    }

    private void a(TXSNALPacket tXSNALPacket) {
        int i;
        if (this.t && tXSNALPacket.nalType == 0) {
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= tXSNALPacket.nalData.length) {
                        i = -1;
                        break;
                    }
                    if (tXSNALPacket.nalData[i2] == 0 && tXSNALPacket.nalData[i2 + 1] == 0 && tXSNALPacket.nalData[i2 + 2] == 0 && tXSNALPacket.nalData[i2 + 3] == 1) {
                        i = i2 + 4;
                        if ((tXSNALPacket.nalData[i] & 31) == 7) {
                            break;
                        }
                    }
                    if (tXSNALPacket.nalData[i2] == 0 && tXSNALPacket.nalData[i2 + 1] == 0 && tXSNALPacket.nalData[i2 + 2] == 0) {
                        i = i2 + 3;
                        if ((tXSNALPacket.nalData[i] & 31) == 7) {
                            break;
                        }
                    }
                    i2 = i2 + 1 + 1;
                } catch (Exception e) {
                    TXCLog.e("MediaCodecDecoder", "modify dec buffer error ", e);
                    return;
                }
            }
            if (i >= 0) {
                int length = tXSNALPacket.nalData.length - i;
                for (int i3 = i; i3 < tXSNALPacket.nalData.length; i3++) {
                    if ((tXSNALPacket.nalData[i3] == 0 && tXSNALPacket.nalData[i3 + 1] == 0 && tXSNALPacket.nalData[i3 + 2] == 1) || (tXSNALPacket.nalData[i3] == 0 && tXSNALPacket.nalData[i3 + 1] == 0 && tXSNALPacket.nalData[i3 + 2] == 0 && tXSNALPacket.nalData[i3 + 3] == 1)) {
                        length = i3 - i;
                        break;
                    }
                }
                byte[] bArr = new byte[length];
                System.arraycopy(tXSNALPacket.nalData, i, bArr, 0, length);
                byte[] a = this.s.a(bArr);
                if (a != null) {
                    byte[] bArr2 = new byte[(tXSNALPacket.nalData.length + a.length) - length];
                    if (i > 0) {
                        System.arraycopy(tXSNALPacket.nalData, 0, bArr2, 0, i);
                    }
                    System.arraycopy(a, 0, bArr2, i, a.length);
                    System.arraycopy(tXSNALPacket.nalData, i + length, bArr2, a.length + i, (tXSNALPacket.nalData.length - length) - i);
                    tXSNALPacket.nalData = bArr2;
                }
            }
        }
    }
}
