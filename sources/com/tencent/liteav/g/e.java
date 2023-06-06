package com.tencent.liteav.g;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class e {
    private static int f;
    private static int g;
    private MediaExtractor a;
    private MediaExtractor b;
    private MediaFormat c;
    private MediaFormat d;
    private long e;
    private int h;
    private long i;
    private String j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;

    public e() {
        this.e = -1L;
        this.k = false;
    }

    public e(boolean z) {
        this.e = -1L;
        this.k = z;
    }

    public synchronized int a(String str) {
        this.j = str;
        TXCLog.i("MediaExtractorWrapper", " setDataSource -> dataSource = " + str + " isOnlyAudio = " + this.k);
        if (this.a != null) {
            this.a.release();
            TXCLog.i("MediaExtractorWrapper", " setDataSource -> VideoExtractor release");
        }
        if (this.b != null) {
            this.b.release();
            TXCLog.i("MediaExtractorWrapper", " setDataSource -> AudioExtractor release");
        }
        if (this.k) {
            this.b = com.tencent.liteav.editer.p.a(str);
            TXCLog.i("MediaExtractorWrapper", " setDataSource -> mAudioExtractor setDataSource success.");
        } else {
            this.b = com.tencent.liteav.editer.p.a(str);
            this.a = com.tencent.liteav.editer.p.a(str);
            TXCLog.i("MediaExtractorWrapper", " setDataSource -> mAudioExtractor & mVideoExtractor setDataSource success.");
        }
        return s();
    }

    private int s() {
        int trackCount = this.b != null ? this.b.getTrackCount() : 0;
        if (trackCount == 0) {
            TXCLog.i("MediaExtractorWrapper", "prepareMediaFileInfo count == 0");
            return -1001;
        }
        TXCLog.i("MediaExtractorWrapper", " trackCount = " + trackCount);
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = this.b.getTrackFormat(i);
            TXCLog.i("MediaExtractorWrapper", "prepareMediaFileInfo :" + trackFormat.toString());
            String string = trackFormat.getString(IMediaFormat.KEY_MIME);
            if (string.startsWith("video")) {
                f = i;
                this.c = trackFormat;
                if (this.a != null) {
                    this.a.selectTrack(i);
                }
            } else if (string.startsWith("audio")) {
                g = i;
                this.d = trackFormat;
                this.b.selectTrack(i);
                int integer = trackFormat.getInteger("channel-count");
                if (integer > 2 || integer <= 0) {
                    return -1004;
                }
                if (trackFormat.containsKey("aac-profile")) {
                    int integer2 = trackFormat.getInteger("aac-profile");
                    TXCLog.i("MediaExtractorWrapper", "prepareMediaFileInfo audio aac profile:" + integer2);
                    if (integer2 == 5 || integer2 == 29) {
                        int integer3 = trackFormat.getInteger("sample-rate") * 2;
                        this.d.setInteger("sample-rate", integer3);
                        TXCLog.i("MediaExtractorWrapper", "prepareMediaFileInfo HE-AAC samplerate special double:" + integer3);
                    }
                }
            } else {
                continue;
            }
        }
        this.h = g();
        if (this.c != null) {
            int b = b();
            int c = c();
            if ((b > c ? c : b) > 1080) {
                TXCLog.i("MediaExtractorWrapper", "prepareMediaFileInfo W:" + b + ",H:" + c);
            }
        }
        return 0;
    }

    public long a() {
        if (this.c == null) {
            return 0L;
        }
        if (this.d == null) {
            try {
                if (this.i == 0) {
                    this.i = this.c.getLong("durationUs");
                    TXCLog.i("MediaExtractorWrapper", "mDuration = " + this.i);
                }
                return this.i;
            } catch (NullPointerException unused) {
                TXCLog.e("MediaExtractorWrapper", "Null pointer exception");
                return 0L;
            }
        }
        try {
            if (this.i == 0) {
                long j = this.c.getLong("durationUs");
                long j2 = this.d.getLong("durationUs");
                if (j <= j2) {
                    j = j2;
                }
                this.i = j;
                TXCLog.i("MediaExtractorWrapper", "mDuration = " + this.i);
            }
            return this.i;
        } catch (NullPointerException unused2) {
            TXCLog.e("MediaExtractorWrapper", "Null pointer exception");
            return 0L;
        }
    }

    public int b() {
        if (this.q != 0) {
            return this.q;
        }
        try {
            if (this.c != null) {
                this.q = this.c.getInteger("width");
                return this.q;
            }
            return 0;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public int c() {
        if (this.p != 0) {
            return this.p;
        }
        try {
            if (this.c != null) {
                this.p = this.c.getInteger("height");
                return this.p;
            }
            return 0;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public int d() {
        if (this.o != 0) {
            return this.o;
        }
        try {
            if (this.c != null) {
                this.o = this.c.getInteger("i-frame-interval");
                return this.o;
            }
            return 0;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public int e() {
        if (this.n != 0) {
            return this.n;
        }
        int i = 0;
        try {
            try {
                if (this.c != null) {
                    i = this.c.getInteger("frame-rate");
                }
            } catch (NullPointerException unused) {
                i = 20;
            }
        } catch (NullPointerException unused2) {
            i = this.c.getInteger("video-framerate");
        }
        this.n = i;
        return this.n;
    }

    public int f() {
        return this.h;
    }

    public int g() {
        int parseInt;
        MediaMetadataRetriever b = com.tencent.liteav.editer.p.b(this.j);
        String extractMetadata = b.extractMetadata(24);
        if (TextUtils.isEmpty(extractMetadata)) {
            TXCLog.e("MediaExtractorWrapper", "getRotation error: rotation is empty,rotation have been reset to zero");
            parseInt = 0;
        } else {
            parseInt = Integer.parseInt(extractMetadata);
        }
        b.release();
        this.h = parseInt;
        TXCLog.i("MediaExtractorWrapper", "mRotation=" + this.h + ",rotation=" + parseInt);
        return parseInt;
    }

    public int h() {
        if (this.m != 0) {
            return this.m;
        }
        try {
            if (this.d != null) {
                this.m = this.d.getInteger("sample-rate");
                return this.m;
            }
            return 0;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public int i() {
        if (this.l != 0) {
            return this.l;
        }
        try {
            if (this.d != null) {
                this.l = this.d.getInteger("channel-count");
                return this.l;
            }
            return 0;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public long j() {
        if (this.c != null) {
            try {
                return this.c.getLong("durationUs");
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public long k() {
        if (this.d != null) {
            try {
                return this.d.getLong("durationUs");
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public com.tencent.liteav.d.e a(com.tencent.liteav.d.e eVar) {
        if (this.a == null) {
            TXCLog.d("MediaExtractorWrapper", "readVideoSampleData mVideoExtractor is null");
            return null;
        }
        long sampleTime = this.a.getSampleTime();
        if (sampleTime == -1) {
            eVar.d(0);
            eVar.a(0L);
            eVar.c(4);
            return eVar;
        }
        eVar.a(sampleTime);
        int sampleTrackIndex = this.a.getSampleTrackIndex();
        eVar.a(sampleTrackIndex);
        eVar.c(this.a.getSampleFlags());
        eVar.d(this.a.readSampleData(eVar.b(), 0));
        eVar.b().position(0);
        eVar.f(e());
        eVar.e(f());
        eVar.g(h());
        eVar.h(i());
        eVar.j(b());
        eVar.k(c());
        eVar.a(false);
        com.tencent.liteav.c.k.a().a(eVar);
        if (this.e == -1 && sampleTrackIndex == n()) {
            this.e = eVar.e();
        }
        if (eVar.g() <= 0) {
            eVar.d(0);
            eVar.a(0L);
            eVar.c(4);
        }
        return eVar;
    }

    public com.tencent.liteav.d.e b(com.tencent.liteav.d.e eVar) {
        if (this.b == null) {
            TXCLog.d("MediaExtractorWrapper", "readAudioSampleData mAudioExtractor is null");
            return null;
        }
        long sampleTime = this.b.getSampleTime();
        if (sampleTime == -1) {
            eVar.d(0);
            eVar.a(0L);
            eVar.c(4);
            return eVar;
        }
        eVar.a(sampleTime);
        int sampleTrackIndex = this.b.getSampleTrackIndex();
        eVar.a(sampleTrackIndex);
        eVar.c(this.b.getSampleFlags());
        eVar.d(this.b.readSampleData(eVar.b(), 0));
        eVar.b().position(0);
        eVar.e(f());
        eVar.g(h());
        eVar.h(i());
        eVar.j(b());
        eVar.k(c());
        eVar.a(false);
        if (this.e == -1 && sampleTrackIndex == n()) {
            this.e = eVar.e();
        }
        if (eVar.g() <= 0) {
            eVar.d(0);
            eVar.a(0L);
            eVar.c(4);
        }
        return eVar;
    }

    public MediaFormat l() {
        return this.c;
    }

    public MediaFormat m() {
        return this.d;
    }

    public int n() {
        return f;
    }

    public boolean c(com.tencent.liteav.d.e eVar) {
        if (eVar.f() == 4) {
            return true;
        }
        if (this.a != null) {
            boolean advance = this.a.advance();
            if (this.a.getSampleTime() == -1 || !advance) {
                TXCLog.i("MediaExtractorWrapper", "advanceVideo reach end of file");
                eVar.c(4);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean d(com.tencent.liteav.d.e eVar) {
        if (eVar.f() == 4) {
            return true;
        }
        if (this.b != null) {
            boolean advance = this.b.advance();
            if (this.b.getSampleTime() == -1 || !advance) {
                TXCLog.i("MediaExtractorWrapper", "advanceAudio reach end of file");
                eVar.c(4);
                return true;
            }
            return false;
        }
        return false;
    }

    public void a(long j) {
        if (this.a != null) {
            this.a.seekTo(j, 0);
        }
    }

    public void b(long j) {
        if (this.a != null) {
            this.a.seekTo(j, 1);
        }
    }

    public void c(long j) {
        if (this.b != null) {
            this.b.seekTo(j, 0);
        }
    }

    public synchronized void o() {
        TXCLog.i("MediaExtractorWrapper", "release start");
        if (this.a != null) {
            this.a.release();
        }
        if (this.b != null) {
            this.b.release();
        }
        TXCLog.i("MediaExtractorWrapper", "release end");
    }

    public long p() {
        if (this.a != null) {
            return this.a.getSampleTime();
        }
        return 0L;
    }

    public long q() {
        if (this.b != null) {
            return this.b.getSampleTime();
        }
        return 0L;
    }

    public long r() {
        if (this.a != null) {
            return this.a.getSampleTime();
        }
        return 0L;
    }
}
