package com.tencent.liteav.c;

import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.mapsdk.internal.jw;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i {
    private static i u;
    public int c;
    public com.tencent.liteav.d.g h;
    public String i;
    public int j;
    public long k;
    public long l;
    public boolean m;
    public String o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    private MediaFormat v;
    private MediaFormat w;
    private MediaFormat y;
    private int x = 0;
    public int f = 5000;
    public int g = 20;
    public int e = 3;
    public int a = 48000;
    public int b = 1;
    public int d = 98304;
    public boolean n = true;
    public AtomicInteger t = new AtomicInteger(1);

    public static i a() {
        if (u == null) {
            u = new i();
        }
        return u;
    }

    public boolean b() {
        return TextUtils.isEmpty(this.i);
    }

    public boolean c() {
        return new File(this.i).exists();
    }

    public boolean d() {
        return TextUtils.isEmpty(this.o);
    }

    public boolean e() {
        return this.r && this.m;
    }

    public void f() {
        if (d()) {
            return;
        }
        File file = new File(this.o);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void g() {
        if (b()) {
            return;
        }
        File file = new File(this.i);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int h() {
        if (this.q == 0) {
            return this.d;
        }
        return this.q;
    }

    public int i() {
        if (this.m) {
            if (this.h.a < 1280 && this.h.b < 1280) {
                this.f = 24000;
            } else {
                this.f = 15000;
            }
        } else if (this.p != 0) {
            this.f = this.p;
        } else {
            switch (this.j) {
                case 0:
                case 1:
                    this.f = 2400;
                    break;
                case 2:
                    this.f = 6500;
                    break;
                case 3:
                    this.f = 9600;
                    break;
            }
        }
        return this.f;
    }

    public int j() {
        try {
            if (this.y != null && Build.VERSION.SDK_INT >= 16) {
                this.g = this.y.getInteger("frame-rate");
            }
        } catch (NullPointerException unused) {
            this.g = 20;
        }
        return this.g;
    }

    public int k() {
        try {
            if (this.y != null && Build.VERSION.SDK_INT >= 16) {
                this.e = this.y.getInteger("i-frame-interval");
            }
        } catch (NullPointerException unused) {
            this.e = 3;
        }
        return this.e;
    }

    public com.tencent.liteav.d.g a(com.tencent.liteav.d.g gVar) {
        if (gVar.a == 0 || gVar.b == 0) {
            return gVar;
        }
        if (k.a().d() == 2) {
            switch (this.j) {
                case 0:
                    gVar = i(gVar);
                    break;
                case 1:
                    gVar = h(gVar);
                    break;
                case 2:
                    gVar = g(gVar);
                    break;
                case 3:
                    gVar = f(gVar);
                    break;
            }
        } else {
            switch (this.j) {
                case 0:
                    gVar = b(gVar);
                    break;
                case 1:
                    gVar = c(gVar);
                    break;
                case 2:
                    gVar = d(gVar);
                    break;
                case 3:
                    gVar = e(gVar);
                    break;
            }
        }
        com.tencent.liteav.d.g gVar2 = new com.tencent.liteav.d.g();
        gVar2.c = gVar.c;
        int e = j.a().e();
        if (e == 90 || e == 270) {
            gVar2.a = ((gVar.b + 15) / 16) * 16;
            gVar2.b = ((gVar.a + 15) / 16) * 16;
        } else {
            gVar2.a = ((gVar.a + 15) / 16) * 16;
            gVar2.b = ((gVar.b + 15) / 16) * 16;
        }
        return gVar2;
    }

    private com.tencent.liteav.d.g f(com.tencent.liteav.d.g gVar) {
        int i;
        int i2;
        com.tencent.liteav.d.g gVar2 = new com.tencent.liteav.d.g();
        if (gVar.a / gVar.b >= 0.5625f) {
            i = 720;
            i2 = (int) ((gVar.b * 720.0f) / gVar.a);
        } else {
            i = (int) ((gVar.a * 1280.0f) / gVar.b);
            i2 = 1280;
        }
        gVar2.a = ((i + 15) / 16) * 16;
        gVar2.b = ((i2 + 15) / 16) * 16;
        return gVar2;
    }

    private com.tencent.liteav.d.g g(com.tencent.liteav.d.g gVar) {
        int i;
        int i2;
        com.tencent.liteav.d.g gVar2 = new com.tencent.liteav.d.g();
        if (gVar.a / gVar.b >= 0.5625f) {
            i = 540;
            i2 = (int) ((gVar.b * 540.0f) / gVar.a);
        } else {
            i = (int) ((gVar.a * 960.0f) / gVar.b);
            i2 = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        }
        gVar2.a = ((i + 15) / 16) * 16;
        gVar2.b = ((i2 + 15) / 16) * 16;
        return gVar2;
    }

    private com.tencent.liteav.d.g h(com.tencent.liteav.d.g gVar) {
        int i;
        int i2;
        com.tencent.liteav.d.g gVar2 = new com.tencent.liteav.d.g();
        if (gVar.a / gVar.b >= 0.5625f) {
            i = 360;
            i2 = (int) ((gVar.b * 360.0f) / gVar.a);
        } else {
            i = (int) ((gVar.a * 640.0f) / gVar.b);
            i2 = jw.h;
        }
        gVar2.a = ((i + 15) / 16) * 16;
        gVar2.b = ((i2 + 15) / 16) * 16;
        return gVar2;
    }

    private com.tencent.liteav.d.g i(com.tencent.liteav.d.g gVar) {
        int i;
        int i2;
        com.tencent.liteav.d.g gVar2 = new com.tencent.liteav.d.g();
        if (gVar.a / gVar.b >= 0.5625f) {
            i = 720;
            i2 = (int) ((gVar.b * 720.0f) / gVar.a);
        } else {
            i = (int) ((gVar.a * 1280.0f) / gVar.b);
            i2 = 1280;
        }
        gVar2.a = ((i + 15) / 16) * 16;
        gVar2.b = ((i2 + 15) / 16) * 16;
        return gVar2;
    }

    protected com.tencent.liteav.d.g b(com.tencent.liteav.d.g gVar) {
        int i;
        int i2;
        com.tencent.liteav.d.g gVar2 = new com.tencent.liteav.d.g();
        if ((gVar.a <= 640 && gVar.b <= 360) || (gVar.a <= 360 && gVar.b <= 640)) {
            return a(gVar.c, gVar);
        }
        float f = (gVar.a * 1.0f) / gVar.b;
        if (gVar.a >= gVar.b) {
            i = (int) (360.0f * f);
            if (i >= 640) {
                i = jw.h;
            }
            i2 = (int) (i / f);
        } else {
            int i3 = (int) (640.0f * f);
            i = i3 < 360 ? i3 : 360;
            i2 = (int) (i / f);
        }
        gVar2.a = ((i + 1) >> 1) << 1;
        gVar2.b = ((i2 + 1) >> 1) << 1;
        return a(gVar.c, gVar2);
    }

    protected com.tencent.liteav.d.g c(com.tencent.liteav.d.g gVar) {
        int i;
        com.tencent.liteav.d.g gVar2 = new com.tencent.liteav.d.g();
        int i2 = gVar.a;
        int i3 = jw.g;
        if ((i2 <= 640 && gVar.b <= 480) || (gVar.a <= 480 && gVar.b <= 640)) {
            return a(gVar.c, gVar);
        }
        float f = (gVar.a * 1.0f) / gVar.b;
        if (gVar.a >= gVar.b) {
            i3 = (int) (480.0f * f);
            if (i3 >= 640) {
                i3 = jw.h;
            }
            i = (int) (i3 / f);
        } else {
            int i4 = (int) (640.0f * f);
            if (i4 < 480) {
                i3 = i4;
            }
            i = (int) (i3 / f);
        }
        gVar2.a = ((i3 + 1) >> 1) << 1;
        gVar2.b = ((i + 1) >> 1) << 1;
        return a(gVar.c, gVar2);
    }

    protected com.tencent.liteav.d.g d(com.tencent.liteav.d.g gVar) {
        int i;
        com.tencent.liteav.d.g gVar2 = new com.tencent.liteav.d.g();
        int i2 = gVar.a;
        int i3 = KNBJsErrorInfo.CODE_DENIED_PERMISSION;
        if ((i2 <= 960 && gVar.b <= 544) || (gVar.a <= 544 && gVar.b <= 960)) {
            return a(gVar.c, gVar);
        }
        float f = (gVar.a * 1.0f) / gVar.b;
        if (gVar.a >= gVar.b) {
            i3 = (int) (544.0f * f);
            if (i3 >= 960) {
                i3 = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            }
            i = (int) (i3 / f);
        } else {
            int i4 = (int) (960.0f * f);
            if (i4 < 544) {
                i3 = i4;
            }
            i = (int) (i3 / f);
        }
        gVar2.a = ((i3 + 1) >> 1) << 1;
        gVar2.b = ((i + 1) >> 1) << 1;
        return a(gVar.c, gVar2);
    }

    protected com.tencent.liteav.d.g e(com.tencent.liteav.d.g gVar) {
        int i;
        int i2;
        com.tencent.liteav.d.g gVar2 = new com.tencent.liteav.d.g();
        if ((gVar.a <= 1280 && gVar.b <= 720) || (gVar.a <= 720 && gVar.b <= 1280)) {
            return a(gVar.c, gVar);
        }
        float f = (gVar.a * 1.0f) / gVar.b;
        if (gVar.a >= gVar.b) {
            i = (int) (720.0f * f);
            if (i >= 1280) {
                i = 1280;
            }
            i2 = (int) (i / f);
        } else {
            int i3 = (int) (1280.0f * f);
            i = i3 < 720 ? i3 : 720;
            i2 = (int) (i / f);
        }
        gVar2.a = ((i + 1) >> 1) << 1;
        gVar2.b = ((i2 + 1) >> 1) << 1;
        return a(gVar.c, gVar2);
    }

    private com.tencent.liteav.d.g a(int i, com.tencent.liteav.d.g gVar) {
        if (i == 90 || i == 270) {
            int i2 = gVar.a;
            gVar.a = gVar.b;
            gVar.b = i2;
        }
        return gVar;
    }

    public void a(MediaFormat mediaFormat) {
        this.v = mediaFormat;
    }

    public void b(MediaFormat mediaFormat) {
        this.y = mediaFormat;
    }

    public void c(MediaFormat mediaFormat) {
        this.w = mediaFormat;
    }

    public boolean l() {
        return (this.v == null && this.w == null) ? false : true;
    }

    public boolean m() {
        return this.v == null && this.w != null;
    }

    public MediaFormat n() {
        com.tencent.liteav.d.b bVar = new com.tencent.liteav.d.b();
        MediaFormat mediaFormat = null;
        if (this.w == null) {
            if (this.v == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                bVar.b = this.v.getInteger("sample-rate");
                bVar.a = this.v.getInteger("channel-count");
                if (this.v.containsKey("bitrate")) {
                    bVar.c = this.v.getInteger("bitrate");
                }
            }
        } else if (Build.VERSION.SDK_INT >= 16) {
            if (this.v == null) {
                int integer = this.w.getInteger("sample-rate");
                int integer2 = this.w.getInteger("channel-count");
                bVar.b = integer;
                bVar.a = integer2;
                if (this.w.containsKey("bitrate")) {
                    bVar.c = this.w.getInteger("bitrate");
                }
            } else {
                this.v.getInteger("sample-rate");
                bVar.b = this.w.getInteger("sample-rate");
                int integer3 = this.v.getInteger("channel-count");
                int integer4 = this.w.getInteger("channel-count");
                if (integer3 < integer4) {
                    integer3 = integer4;
                }
                bVar.a = integer3;
                if (this.v.containsKey("bitrate")) {
                    bVar.c = this.v.getInteger("bitrate");
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            mediaFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", bVar.b, bVar.a);
            if (bVar.c != 0) {
                mediaFormat.setInteger("bitrate", bVar.c);
            }
        }
        if (this.v != null && Build.VERSION.SDK_INT >= 16 && this.v.containsKey("max-input-size")) {
            this.c = this.v.getInteger("max-input-size");
        }
        this.a = bVar.b;
        this.b = bVar.a;
        if (bVar.c != 0) {
            this.d = bVar.c;
        }
        return mediaFormat;
    }

    public void o() {
        if (!TextUtils.isEmpty(this.o)) {
            File file = new File(this.o);
            if (file.exists()) {
                boolean delete = file.delete();
                TXCLog.i("VideoOutputConfig", "clear delete process path:" + delete);
            }
        }
        this.k = 0L;
        this.o = null;
        this.i = null;
        this.w = null;
        this.v = null;
        this.p = 0;
        this.q = 0;
        this.n = true;
    }

    public int p() {
        if (TextUtils.isEmpty(this.i)) {
            return 0;
        }
        return (int) (new File(this.i).length() / 1024);
    }

    public int q() {
        return Math.round((float) ((this.k / 1000) / 1000));
    }
}
