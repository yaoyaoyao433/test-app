package com.tencent.liteav.g;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {
    private MediaMetadataRetriever a;
    private com.tencent.liteav.videoediter.ffmpeg.a b;
    private e c;

    public void a(String str) {
        this.c = new e();
        this.c.a(str);
        this.a = com.tencent.liteav.editer.p.b(str);
        if (com.tencent.liteav.editer.p.c(str)) {
            return;
        }
        this.b = new com.tencent.liteav.videoediter.ffmpeg.a();
        this.b.a(str);
    }

    public long a() {
        String extractMetadata = this.a != null ? this.a.extractMetadata(9) : "";
        if (TextUtils.isEmpty(extractMetadata)) {
            if (this.b != null) {
                TXCLog.e("MediaMetadataRetrieverW", "getDuration -> duration is empty,use ff to get!");
                return k() > j() ? k() : j();
            } else if (this.c != null) {
                TXCLog.e("MediaMetadataRetrieverW", "getDuration -> duration is empty,use wrap to get!");
                return this.c.a();
            }
        }
        try {
            return Long.parseLong(extractMetadata);
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.e("MediaMetadataRetrieverW", "getDuration -> parse fail. sDuration = " + extractMetadata);
            return 0L;
        }
    }

    private long j() {
        if (this.b != null) {
            return this.b.h();
        }
        if (this.c != null) {
            return this.c.k();
        }
        TXCLog.w("MediaMetadataRetrieverW", "getAudioDuration -> mTXFFMediaRetriever is null.");
        return 0L;
    }

    private long k() {
        if (this.b != null) {
            return this.b.f();
        }
        if (this.c != null) {
            return this.c.j();
        }
        TXCLog.w("MediaMetadataRetrieverW", "getAudioDuration -> mTXFFMediaRetriever is null.");
        return 0L;
    }

    public int b() {
        String extractMetadata = (Build.VERSION.SDK_INT < 17 || this.a == null) ? null : this.a.extractMetadata(24);
        if (TextUtils.isEmpty(extractMetadata)) {
            if (this.b != null) {
                TXCLog.e("MediaMetadataRetrieverW", "getRotation -> rotation is empty,use ff to get!");
                return this.b.a();
            } else if (this.c != null) {
                return this.c.f();
            }
        }
        try {
            return Integer.parseInt(extractMetadata);
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.e("MediaMetadataRetrieverW", "getRotation -> parse fail. sRotation = " + extractMetadata);
            return 0;
        }
    }

    public int c() {
        String extractMetadata = this.a != null ? this.a.extractMetadata(19) : "";
        if (TextUtils.isEmpty(extractMetadata)) {
            if (this.b != null) {
                TXCLog.e("MediaMetadataRetrieverW", "getHeight -> height is empty,use ff to get!");
                return this.b.c();
            } else if (this.c != null) {
                TXCLog.e("MediaMetadataRetrieverW", "getHeight -> height is empty,use wrap to get!");
                return this.c.c();
            }
        }
        try {
            return Integer.parseInt(extractMetadata);
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.e("MediaMetadataRetrieverW", "getHeight -> parse fail. sHeight = " + extractMetadata);
            return 0;
        }
    }

    public int d() {
        String extractMetadata = this.a != null ? this.a.extractMetadata(18) : "";
        if (TextUtils.isEmpty(extractMetadata)) {
            if (this.b != null) {
                TXCLog.e("MediaMetadataRetrieverW", "getWidth -> width is empty,use ff to get!");
                return this.b.b();
            } else if (this.c != null) {
                TXCLog.e("MediaMetadataRetrieverW", "getWidth -> width is empty,use warp to get!");
                return this.c.b();
            }
        }
        try {
            return Integer.parseInt(extractMetadata);
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.e("MediaMetadataRetrieverW", "getWidth -> parse fail. sWidth = " + extractMetadata);
            return 0;
        }
    }

    public float e() {
        String extractMetadata = this.a != null ? this.a.extractMetadata(25) : "";
        if (TextUtils.isEmpty(extractMetadata)) {
            if (this.b != null) {
                TXCLog.e("MediaMetadataRetrieverW", "getFPS -> fps is empty,use ff to get!");
                return this.b.d();
            } else if (this.c != null) {
                TXCLog.e("MediaMetadataRetrieverW", "getFPS -> fps is empty,use wrap to get!");
                return this.c.e();
            }
        }
        try {
            return Float.parseFloat(extractMetadata);
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.e("MediaMetadataRetrieverW", "getFPS -> parse fail. sFPS = " + extractMetadata);
            return 0.0f;
        }
    }

    public long f() {
        String extractMetadata = this.a != null ? this.a.extractMetadata(20) : "";
        if (TextUtils.isEmpty(extractMetadata) && this.b != null) {
            TXCLog.e("MediaMetadataRetrieverW", "getVideoBitRate -> bitrate is empty,use ff to get!");
            return this.b.e();
        }
        try {
            return Integer.parseInt(extractMetadata);
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.e("MediaMetadataRetrieverW", "getVideoBitRate -> parse fail. sBitRate = " + extractMetadata);
            return 0L;
        }
    }

    public int g() {
        if (this.b != null) {
            return this.b.g();
        }
        if (this.c != null) {
            return this.c.h();
        }
        return 0;
    }

    public Bitmap a(long j) {
        if (this.a != null) {
            return this.a.getFrameAtTime(j, 3);
        }
        return null;
    }

    public Bitmap h() {
        if (this.a != null) {
            return this.a.getFrameAtTime();
        }
        return null;
    }

    public void i() {
        if (this.a != null) {
            this.a.release();
        }
        if (this.c != null) {
            this.c.o();
        }
    }
}
