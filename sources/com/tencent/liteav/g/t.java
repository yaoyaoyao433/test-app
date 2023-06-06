package com.tencent.liteav.g;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class t {
    private static t a;
    private int d = 0;
    private int e = 0;
    private ArrayList<String> c = new ArrayList<>();
    private final ArrayList<i> b = new ArrayList<>();

    public static t a() {
        if (a == null) {
            a = new t();
        }
        return a;
    }

    private t() {
    }

    public void a(List<String> list) {
        this.b.clear();
        this.d = 0;
        this.c.clear();
        this.c.addAll(list);
    }

    public List<String> b() {
        return this.c;
    }

    public int c() {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.c.size()) {
                break;
            }
            String str = this.c.get(i);
            if (TextUtils.isEmpty(str)) {
                return -100001;
            }
            i iVar = new i();
            iVar.a(str);
            int b = iVar.b();
            this.b.add(iVar);
            if (b != 0) {
                TXCLog.e("VideoSourceListConfig", "checkLegality source:" + str + " is illegal");
                i2 = b;
                break;
            }
            i++;
            i2 = b;
        }
        if (i2 != 0) {
            int size = this.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.b.get(i3).a();
            }
        }
        return i2;
    }

    public List<i> d() {
        return this.b;
    }

    public i e() {
        TXCLog.i("VideoSourceListConfig", "getCurrentVideoExtractConfig mCurrentVideoIndex:" + this.d);
        return this.b.get(this.d);
    }

    public i f() {
        TXCLog.i("VideoSourceListConfig", "getCurrentAudioExtractConfig mCurrentAudioIndex:" + this.e);
        return this.b.get(this.e);
    }

    public boolean g() {
        this.d++;
        TXCLog.i("VideoSourceListConfig", "nextVideo mCurrentVideoIndex:" + this.d);
        if (this.d >= this.b.size()) {
            TXCLog.i("VideoSourceListConfig", "nextVideo get fail");
            return false;
        }
        TXCLog.i("VideoSourceListConfig", "nextVideo get succ");
        return true;
    }

    @TargetApi(16)
    public boolean h() {
        if (Build.VERSION.SDK_INT < 16) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (this.b.get(i).f() == null) {
                return false;
            }
        }
        return true;
    }

    public MediaFormat i() {
        int i;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 16) {
            i = 0;
            int i3 = 0;
            while (i2 < this.b.size()) {
                MediaFormat f = this.b.get(i2).f();
                if (f != null) {
                    int integer = f.getInteger("sample-rate");
                    int integer2 = f.getInteger("channel-count");
                    if (integer > i3) {
                        i3 = integer;
                    }
                    if (integer2 > i) {
                        i = integer2;
                    }
                }
                i2++;
            }
            i2 = i3;
        } else {
            i = 0;
        }
        if (i == 0) {
            i = 2;
        }
        if (i2 == 0) {
            i2 = 48000;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return MediaFormat.createAudioFormat("audio/mp4a-latm", i2, i);
        }
        return null;
    }

    public boolean j() {
        int i;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            while (i < this.b.size()) {
                i iVar = this.b.get(i);
                MediaFormat e = iVar.e();
                int integer = e.getInteger("width");
                int integer2 = e.getInteger("height");
                int g = iVar.g();
                if (g == 0 || g == 180) {
                    i = integer2 <= integer ? i + 1 : 0;
                    z = false;
                } else {
                    if (integer <= integer2) {
                    }
                    z = false;
                }
            }
            return z;
        }
        return true;
    }

    public boolean k() {
        this.e++;
        TXCLog.i("VideoSourceListConfig", "nextAudio mCurrentAudioIndex:" + this.e);
        if (this.e >= this.b.size()) {
            TXCLog.i("VideoSourceListConfig", "nextAudio get fail");
            return false;
        }
        TXCLog.i("VideoSourceListConfig", "nextAudio get succ");
        return true;
    }

    public boolean l() {
        return this.d == this.b.size() - 1;
    }

    public boolean m() {
        return this.e == this.b.size() - 1;
    }

    public void n() {
        this.d = 0;
        this.e = 0;
    }

    public long o() {
        long j = 0;
        if (Build.VERSION.SDK_INT >= 16) {
            for (int i = 0; i < this.b.size(); i++) {
                j += this.b.get(i).e().getLong("durationUs");
            }
        }
        return j;
    }

    public long p() {
        if (Build.VERSION.SDK_INT >= 16) {
            long j = 0;
            for (int i = 0; i < this.b.size(); i++) {
                long j2 = this.b.get(i).e().getLong("durationUs");
                if (j == 0) {
                    j = j2;
                }
                if (j > j2) {
                    j = j2;
                }
            }
            return j;
        }
        return 0L;
    }
}
