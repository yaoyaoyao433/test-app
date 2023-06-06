package com.tencent.liteav.basic.util;

import android.os.SystemClock;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    private final String a;
    private final int b;
    private int c;
    private int d;
    private long e;

    public c(String str, int i) {
        this.a = str;
        this.b = (int) Math.max(i, TimeUnit.SECONDS.toMillis(1L));
        b();
    }

    public void a() {
        this.c++;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e == 0) {
            this.e = SystemClock.elapsedRealtime();
        } else if (elapsedRealtime - this.e >= this.b) {
            TXCLog.i("FPSMeter", "meter name: %s fps: %.2f", this.a, Float.valueOf(((this.c - this.d) * 1000.0f) / ((float) (elapsedRealtime - this.e))));
            this.e = elapsedRealtime;
            this.d = this.c;
        }
    }

    public void b() {
        this.c = 0;
        this.d = 0;
        this.e = 0L;
    }
}
