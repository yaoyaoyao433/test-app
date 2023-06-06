package com.dianping.video.template.decoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a;
    protected String b;
    protected String c;
    protected boolean d;
    public a e;
    public boolean f;
    private MediaExtractor g;
    private int h;
    private MediaCodec i;
    private boolean j;
    private boolean k;
    private com.dianping.video.videofilter.transcoder.compat.a l;
    private final MediaCodec.BufferInfo m;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);

        void a(String str, com.dianping.video.template.decoder.a aVar);
    }

    public b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc22c647ddf4436ef62a01a90cfc287", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc22c647ddf4436ef62a01a90cfc287");
            return;
        }
        this.k = false;
        this.m = new MediaCodec.BufferInfo();
        this.f = false;
        this.b = str;
        this.c = str2;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b7c89310d7d106573e0ae1d01328ab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b7c89310d7d106573e0ae1d01328ab3");
        } else if (!com.dianping.video.util.c.a(this.b)) {
            throw new com.dianping.video.template.constant.a(XPlayerConstants.UNSUPPORT_MEDIACODEC_ERROR_CODE);
        } else {
            if (this.g == null) {
                this.g = new MediaExtractor();
            }
            try {
                this.g.setDataSource(this.b);
                this.h = com.dianping.video.util.e.a(this.g, "audio/");
                this.g.selectTrack(this.h);
                MediaFormat trackFormat = this.g.getTrackFormat(this.h);
                try {
                    this.i = MediaCodec.createDecoderByType(trackFormat.getString(IMediaFormat.KEY_MIME));
                    this.i.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                    this.i.start();
                    this.l = new com.dianping.video.videofilter.transcoder.compat.a(this.i);
                    this.k = false;
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new com.dianping.video.template.constant.a(-20003, e.getMessage());
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                throw new com.dianping.video.template.constant.a(-20002, e2.getMessage());
            }
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a276999ffa5490214aabbac0d6b52a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a276999ffa5490214aabbac0d6b52a");
            return;
        }
        this.g.seekTo(j, 0);
        this.i.stop();
        this.i.release();
        MediaFormat trackFormat = this.g.getTrackFormat(this.h);
        try {
            this.i = MediaCodec.createDecoderByType(trackFormat.getString(IMediaFormat.KEY_MIME));
            this.i.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
            this.i.start();
            this.l = new com.dianping.video.videofilter.transcoder.compat.a(this.i);
            this.k = false;
            this.j = false;
        } catch (IOException e) {
            e.printStackTrace();
            throw new com.dianping.video.template.constant.a(-20003, e.getMessage());
        }
    }

    public final boolean b() {
        int i;
        int i2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4329b7291b74f91e4e8fe9827cb46d41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4329b7291b74f91e4e8fe9827cb46d41")).booleanValue();
        }
        com.dianping.codelog.b.a(b.class, "stepPipeline start");
        if (this.k) {
            if (this.e != null) {
                this.e.a(this.c);
            }
            return false;
        }
        int i3 = -1;
        while (true) {
            Object[] objArr2 = {0L};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "965c47fc528b77128f42f013cc63e63c", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "965c47fc528b77128f42f013cc63e63c")).intValue();
            } else {
                if (!this.j) {
                    int sampleTrackIndex = this.g.getSampleTrackIndex();
                    if (sampleTrackIndex >= 0 && sampleTrackIndex != this.h) {
                        com.dianping.codelog.b.a(b.class, "drainExtractor", "drainExtractor DRAIN_STATE_ERROR");
                        i = 1;
                    } else {
                        int dequeueInputBuffer = this.i.dequeueInputBuffer(0L);
                        if (dequeueInputBuffer < 0) {
                            com.dianping.codelog.b.a(b.class, "drainExtractor", "drainExtractor DRAIN_STATE_NO_BUFFER");
                            i = 3;
                        } else {
                            this.f = true;
                            if (sampleTrackIndex < 0) {
                                this.j = true;
                                this.i.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                com.dianping.codelog.b.a(b.class, "drainExtractor", "drainExtractor DRAIN_STATE_END");
                            } else {
                                this.i.queueInputBuffer(dequeueInputBuffer, 0, this.g.readSampleData(this.l.a(dequeueInputBuffer), 0), this.g.getSampleTime(), (this.g.getSampleFlags() & 1) != 0 ? 1 : 0);
                                this.g.advance();
                                com.dianping.codelog.b.a(b.class, "drainExtractor", "drainExtractor DRAIN_STATE_SUC");
                                i = 0;
                            }
                        }
                    }
                }
                i = 2;
            }
            if (i == 2 || i == 1 || ((i3 != -1 && i == 3) || this.d)) {
                break;
            }
            i3 = i;
        }
        int i4 = 0;
        while (true) {
            Object[] objArr3 = {0L};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69f78bda32ab3bbe9db54b34f8b52434", RobustBitConfig.DEFAULT_VALUE)) {
                if (this.k) {
                    com.dianping.codelog.b.a(b.class, "drainDecoder", "drainDecoder END");
                    i2 = 2;
                } else {
                    int dequeueOutputBuffer = this.i.dequeueOutputBuffer(this.m, 0L);
                    switch (dequeueOutputBuffer) {
                        case -3:
                            this.l = new com.dianping.video.videofilter.transcoder.compat.a(this.i);
                            com.dianping.codelog.b.a(b.class, "drainDecoder", "drainDecoder CHANGED");
                            i2 = 4;
                            break;
                        case -2:
                            com.dianping.codelog.b.a(b.class, "drainDecoder", "drainDecoder INFO_OUTPUT_FORMAT_CHANGED");
                            i2 = 4;
                            break;
                        case -1:
                            com.dianping.codelog.b.a(b.class, "drainDecoder", "drainDecoder INFO_TRY_AGAIN_LATER");
                            i2 = 4;
                            break;
                        default:
                            if ((this.m.flags & 4) != 0) {
                                this.k = true;
                                if (this.e != null) {
                                    this.e.a(this.c);
                                }
                            } else if (this.m.size > 0) {
                                com.dianping.video.template.decoder.a aVar = new com.dianping.video.template.decoder.a();
                                aVar.a = this.m.presentationTimeUs;
                                new StringBuilder("drainDecoder pts = ").append(this.m.presentationTimeUs);
                                ByteBuffer b = this.l.b(dequeueOutputBuffer);
                                aVar.b = b.asShortBuffer();
                                if (this.e != null) {
                                    this.e.a(this.c, aVar);
                                }
                                b.clear();
                            } else if (this.m.size == 0) {
                                this.i.releaseOutputBuffer(dequeueOutputBuffer, false);
                                com.dianping.codelog.b.a(b.class, "drainDecoder", "drainDecoder DRAIN_STATE_TRY_AGAIN : mBufferInfo.size == 0");
                                i2 = 4;
                                break;
                            }
                            com.dianping.codelog.b.a(b.class, "drainDecoder", "drainDecoder DRAIN_STATE_SUC : result = " + dequeueOutputBuffer + " : pts = " + this.m.presentationTimeUs);
                            this.i.releaseOutputBuffer(dequeueOutputBuffer, false);
                            i2 = 0;
                            break;
                    }
                }
            } else {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69f78bda32ab3bbe9db54b34f8b52434")).intValue();
            }
            i4++;
            if (i2 != 4 || this.d || i4 >= 10) {
            }
        }
        this.f = false;
        return true;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062ccec1538206f06ae979bdff1b699b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062ccec1538206f06ae979bdff1b699b");
            return;
        }
        this.d = true;
        if (this.g != null) {
            this.g.release();
            this.g = null;
        }
        if (this.i != null) {
            try {
                this.i.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                this.i.release();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.i = null;
        }
    }
}
