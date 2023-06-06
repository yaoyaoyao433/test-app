package com.tencent.liteav.c;

import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.p;
import com.tencent.open.apireq.BaseResp;
import java.io.IOException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class k {
    private static k b;
    public String a;
    private int c = 1;
    private List<Bitmap> d;
    private int e;
    private com.tencent.liteav.d.e f;

    public static k a() {
        if (b == null) {
            b = new k();
        }
        return b;
    }

    private k() {
    }

    public void a(List<Bitmap> list, int i) {
        this.d = list;
        this.e = i;
        this.c = 2;
    }

    public List<Bitmap> b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        if (TextUtils.isEmpty(this.a)) {
            TXCLog.e("VideoSourceConfig", "checkLegality -> path is null.");
            return -100001;
        } else if (Build.VERSION.SDK_INT >= 16) {
            try {
                MediaExtractor a = p.a(this.a);
                if (a == null) {
                    TXCLog.e("VideoSourceConfig", "checkLegality-> source no found!");
                    return -100001;
                }
                int a2 = a(a);
                a.release();
                TXCLog.e("VideoSourceConfig", "checkLegality-> ret = " + a2);
                return a2;
            } catch (Exception e) {
                e.printStackTrace();
                TXCLog.e("VideoSourceConfig", "checkLegality-> some error happen.");
                return -100002;
            }
        } else {
            return 0;
        }
    }

    public int a(MediaExtractor mediaExtractor) {
        int integer;
        int trackCount = mediaExtractor.getTrackCount();
        TXCLog.i("VideoSourceConfig", "checkLegality -> trackCount = " + trackCount);
        if (trackCount <= 0) {
            TXCLog.e("VideoSourceConfig", "checkLegality -> trackCount < 1, error!");
            return -100003;
        }
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            TXCLog.i("VideoSourceConfig", "checkLegality :" + trackFormat.toString());
            if (trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio") && trackFormat.containsKey("channel-count") && (integer = trackFormat.getInteger("channel-count")) > 2) {
                mediaExtractor.release();
                TXCLog.e("VideoSourceConfig", "checkLegality -> un support audio format. channel = " + integer);
                return -1004;
            }
        }
        return 0;
    }

    public int a(String str) {
        if (Build.VERSION.SDK_INT >= 16) {
            MediaExtractor a = p.a(str);
            if (a == null) {
                TXCLog.e("VideoSourceConfig", " checkBGMLegality -> setDataSource error. path =  " + str);
                return -100002;
            }
            int trackCount = a.getTrackCount();
            TXCLog.i("VideoSourceConfig", " checkBGMLegality -> trackCount = " + trackCount);
            boolean z = false;
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = a.getTrackFormat(i);
                TXCLog.i("VideoSourceConfig", "BGM checkLegality :" + trackFormat.toString());
                if (trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                    if (trackFormat.containsKey("channel-count") && trackFormat.getInteger("channel-count") > 2) {
                        TXCLog.i("VideoSourceConfig", " checkBGMLegality -> trackCount > 2 , un support audio format.");
                        a.release();
                        return -2003;
                    }
                    z = true;
                }
            }
            a.release();
            if (z) {
                return 0;
            }
            TXCLog.i("VideoSourceConfig", " checkBGMLegality -> no audio track.");
            return -2002;
        }
        TXCLog.e("VideoSourceConfig", "checkBGMLegality -> un support android version = " + Build.VERSION.SDK_INT);
        return BaseResp.CODE_NOT_LOGIN;
    }

    public boolean f() {
        if (Build.VERSION.SDK_INT < 16) {
            TXCLog.e("VideoSourceConfig", "judgeFullIFrame SDK version is less:16");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(this.a);
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                if (mediaExtractor.getTrackFormat(i).getString(IMediaFormat.KEY_MIME).startsWith("video/")) {
                    mediaExtractor.selectTrack(i);
                }
            }
            mediaExtractor.seekTo(0L, 0);
            int sampleFlags = mediaExtractor.getSampleFlags();
            mediaExtractor.advance();
            mediaExtractor.advance();
            mediaExtractor.advance();
            int sampleFlags2 = mediaExtractor.getSampleFlags();
            mediaExtractor.advance();
            mediaExtractor.advance();
            int sampleFlags3 = mediaExtractor.getSampleFlags();
            mediaExtractor.release();
            if (sampleFlags == sampleFlags2 && sampleFlags == sampleFlags3 && sampleFlags == 1) {
                return true;
            }
        }
        return false;
    }

    public void g() {
        this.c = 1;
        this.a = null;
        this.f = null;
        this.e = 0;
        if (this.d != null) {
            this.d.clear();
        }
    }

    public void a(com.tencent.liteav.d.e eVar) {
        this.f = eVar;
    }

    public com.tencent.liteav.d.e h() {
        return this.f;
    }
}
