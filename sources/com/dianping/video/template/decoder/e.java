package com.dianping.video.template.decoder;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.opengl.GLES20;
import android.view.Surface;
import com.dianping.titans.service.FileUtil;
import com.dianping.video.template.decoder.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e extends d implements SurfaceTexture.OnFrameAvailableListener {
    public static ChangeQuickRedirect a;
    public MediaCodec j;
    public final MediaCodec.BufferInfo k;
    private final String l;
    private MediaExtractor m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private ByteBuffer[] r;
    private volatile boolean s;
    private final Object t;

    public e(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fba032898635afc2cb6dfe55a87e442", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fba032898635afc2cb6dfe55a87e442");
            return;
        }
        this.l = e.class.getSimpleName();
        this.q = false;
        this.t = new Object();
        this.k = new MediaCodec.BufferInfo();
    }

    public final void a() {
        MediaFormat mediaFormat;
        MediaFormat mediaFormat2;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i;
        int integer;
        int integer2;
        int i2;
        d.a aVar;
        String str;
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        long j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d20b1ffd1afd94e79ffe8fdf7981405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d20b1ffd1afd94e79ffe8fdf7981405");
            return;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        for (int i3 = 0; i3 <= 0; i3++) {
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameterf(36197, 10241, 9728.0f);
            GLES20.glTexParameterf(36197, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
        }
        this.d = iArr[0];
        this.e = new SurfaceTexture(this.d);
        this.e.setOnFrameAvailableListener(this);
        this.f = new Surface(this.e);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7b7e76df900e167d77c331c471e0bb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7b7e76df900e167d77c331c471e0bb8");
        } else if (!com.dianping.video.util.c.a(this.c)) {
            throw new com.dianping.video.template.constant.a(-10001);
        } else {
            if (this.m == null) {
                this.m = new MediaExtractor();
            }
            try {
                this.m.setDataSource(this.c);
                this.n = com.dianping.video.util.e.a(this.m, "video/");
                this.m.selectTrack(this.n);
                MediaFormat trackFormat = this.m.getTrackFormat(this.n);
                if (this.i != null) {
                    MediaMetadataRetriever mediaMetadataRetriever2 = null;
                    try {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                        } catch (Throwable th) {
                            th = th;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                        }
                    } catch (Exception e) {
                        e = e;
                        mediaFormat2 = trackFormat;
                    }
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(this.c);
                            try {
                                i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                i = 0;
                            }
                            integer = trackFormat.getInteger("width");
                            integer2 = trackFormat.getInteger("height");
                            try {
                                i2 = trackFormat.getInteger("frame-rate");
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                i2 = 30;
                            }
                            aVar = this.i;
                            str = this.h;
                            objArr = new Object[0];
                            changeQuickRedirect = a;
                            mediaFormat2 = trackFormat;
                        } catch (Exception e4) {
                            e = e4;
                            mediaFormat2 = trackFormat;
                        }
                        try {
                            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d71439e39b866743e7f2c6c9df2f0d9", RobustBitConfig.DEFAULT_VALUE)) {
                                j = ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d71439e39b866743e7f2c6c9df2f0d9")).longValue();
                            } else {
                                long j2 = 0;
                                if (this.m != null) {
                                    this.m.seekTo(0L, 0);
                                    j2 = this.m.getSampleTime() - 0;
                                }
                                j = j2;
                            }
                            aVar.a(str, integer, integer2, i, i2, j);
                            mediaMetadataRetriever.release();
                        } catch (Exception e5) {
                            e = e5;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            e.printStackTrace();
                            if (mediaMetadataRetriever2 != null) {
                                mediaMetadataRetriever2.release();
                            }
                            mediaFormat = mediaFormat2;
                            a(mediaFormat);
                        }
                        mediaFormat = mediaFormat2;
                    } catch (Throwable th2) {
                        th = th2;
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        throw th;
                    }
                } else {
                    mediaFormat = trackFormat;
                }
                a(mediaFormat);
            } catch (IOException e6) {
                e6.printStackTrace();
                throw new com.dianping.video.template.constant.a(-10003, e6.getMessage());
            }
        }
    }

    private void a(MediaFormat mediaFormat) {
        boolean z;
        Object[] objArr = {mediaFormat};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5372954b6d68dc6cd5b7beffb2a41700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5372954b6d68dc6cd5b7beffb2a41700");
            return;
        }
        if (this.j != null) {
            if (this.o) {
                this.j.stop();
            }
            this.j.release();
            this.j = null;
        }
        try {
            this.j = MediaCodec.createDecoderByType(mediaFormat.getString(IMediaFormat.KEY_MIME));
            String name = this.j.getName();
            com.dianping.codelog.b.a(e.class, "createDecoder", "decoder name = " + this.j.getName());
            try {
                this.j.configure(mediaFormat, this.f, (MediaCrypto) null, 0);
            } catch (Exception unused) {
                List<String> a2 = com.dianping.video.videofilter.transcoder.utils.a.a(mediaFormat.getString(IMediaFormat.KEY_MIME), false);
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = a2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String next = it.next();
                    if (!next.equals(name)) {
                        if (this.j != null) {
                            this.j.release();
                        }
                        try {
                            this.j = MediaCodec.createByCodecName(next);
                            this.j.configure(mediaFormat, this.f, (MediaCrypto) null, 0);
                            z = true;
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (!z) {
                    com.dianping.codelog.b.a(e.class, "all decoder codecs configure failed");
                    throw new com.dianping.video.template.constant.a(-10005, "all decoder codecs configure failed ");
                }
                for (String str : a2) {
                    sb.append(str);
                    sb.append(StringUtil.CRLF_STRING);
                }
                sb.append("default codec configure failed, but codec = ");
                sb.append(this.j.getName());
                sb.append(" configure successfully");
                com.dianping.codelog.b.a(e.class, "createDecoder", sb.toString());
            }
            this.j.start();
            this.o = true;
            this.r = this.j.getInputBuffers();
            this.q = false;
        } catch (IOException e2) {
            e2.printStackTrace();
            throw new com.dianping.video.template.constant.a(-10005, e2.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // com.dianping.video.template.decoder.d
    public final boolean b() {
        int i;
        int i2;
        ?? r0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "015de4591b706eeae15a765aa12cc3ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "015de4591b706eeae15a765aa12cc3ce")).booleanValue();
        }
        int i3 = -1;
        while (true) {
            i = 1;
            Object[] objArr2 = {0L};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d27485a4bab4085dd73e5b67d9cf63dc", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d27485a4bab4085dd73e5b67d9cf63dc")).intValue();
            } else {
                if (!this.p) {
                    int sampleTrackIndex = this.m.getSampleTrackIndex();
                    if (sampleTrackIndex < 0 || sampleTrackIndex == this.n) {
                        int dequeueInputBuffer = this.j.dequeueInputBuffer(0L);
                        if (dequeueInputBuffer < 0) {
                            i2 = 3;
                        } else if (sampleTrackIndex < 0) {
                            this.p = true;
                            this.j.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        } else {
                            this.j.queueInputBuffer(dequeueInputBuffer, 0, this.m.readSampleData(this.r[dequeueInputBuffer], 0), this.m.getSampleTime(), (this.m.getSampleFlags() & 1) != 0 ? 1 : 0);
                            new StringBuilder("drainExtractor suc : pts = ").append(this.m.getSampleTime());
                            this.m.advance();
                            i2 = 0;
                        }
                    } else {
                        i2 = 1;
                    }
                }
                i2 = 2;
            }
            if (i2 == 2 || i2 == 1 || ((i3 != -1 && i2 == 3) || this.g)) {
                break;
            }
            i3 = i2;
        }
        int i4 = 0;
        while (true) {
            Object[] objArr3 = new Object[i];
            objArr3[0] = 10000L;
            ChangeQuickRedirect changeQuickRedirect3 = a;
            int i5 = 4;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f6d2869599ae7f13e4109c1cc4075466", RobustBitConfig.DEFAULT_VALUE)) {
                i5 = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f6d2869599ae7f13e4109c1cc4075466")).intValue();
            } else {
                if (!this.q) {
                    int dequeueOutputBuffer = this.j.dequeueOutputBuffer(this.k, 10000L);
                    switch (dequeueOutputBuffer) {
                        case -3:
                        case -2:
                        case -1:
                            break;
                        default:
                            if ((this.k.flags & 4) != 0) {
                                this.q = i;
                                this.k.size = 0;
                                if (this.i != null) {
                                    this.i.a(this.h);
                                }
                            }
                            boolean z = this.k.size > 0;
                            this.j.releaseOutputBuffer(dequeueOutputBuffer, z);
                            new StringBuilder("drainDecoder suc : pts = ").append(this.k.presentationTimeUs);
                            if (z) {
                                d();
                                if (!this.g) {
                                    int i6 = this.d;
                                    long j = this.k.presentationTimeUs;
                                    Object[] objArr4 = new Object[2];
                                    objArr4[0] = Integer.valueOf(i6);
                                    objArr4[i] = new Long(j);
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cab1a84e2f565b42cf7a79f0b2686e56", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cab1a84e2f565b42cf7a79f0b2686e56");
                                    } else {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b60d3d4b718c5ff6bfc73d4591092ce6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b60d3d4b718c5ff6bfc73d4591092ce6");
                                        } else {
                                            this.e.updateTexImage();
                                        }
                                        if (this.i != null) {
                                            this.i.a(this.h, i6, j);
                                        }
                                    }
                                }
                            }
                            r0 = 1;
                            i5 = 0;
                            break;
                    }
                } else {
                    r0 = 1;
                    i5 = 2;
                }
                i4 += r0;
                if (i5 != 4 && !this.g && i4 < 10) {
                    i = 1;
                }
            }
            r0 = 1;
            i4 += r0;
            if (i5 != 4) {
            }
        }
        return r0;
    }

    @Override // com.dianping.video.template.decoder.d
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "003334900c7499b05b1d625168478716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "003334900c7499b05b1d625168478716");
        } else {
            a(j, true);
        }
    }

    public final void a(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3111db7ff2574a9de49cdfe20732d08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3111db7ff2574a9de49cdfe20732d08");
            return;
        }
        this.m.seekTo(j, 0);
        if (z) {
            a(this.m.getTrackFormat(this.n));
        }
        this.q = false;
        this.p = false;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c450fca0c935cf55214f88bd87957b0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c450fca0c935cf55214f88bd87957b0d");
            return;
        }
        synchronized (this.t) {
            while (!this.s) {
                try {
                    this.t.wait(10000L);
                    if (this.g) {
                        return;
                    }
                    if (!this.s) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.s = false;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4027c7e9ef6f822d8635fdcc41fe5e89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4027c7e9ef6f822d8635fdcc41fe5e89");
            return;
        }
        synchronized (this.t) {
            if (this.s) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.s = true;
            this.t.notifyAll();
        }
    }

    @Override // com.dianping.video.template.decoder.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605f0ab30cf0ab80f6815f65987124bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605f0ab30cf0ab80f6815f65987124bc");
            return;
        }
        super.c();
        if (this.e != null) {
            this.e.release();
            this.e = null;
        }
        if (this.f != null) {
            this.f.release();
            this.f = null;
        }
        if (this.m != null) {
            this.m.release();
            this.m = null;
        }
        if (this.j != null) {
            try {
                if (this.o) {
                    this.j.stop();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                this.j.release();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.j = null;
        }
    }
}
