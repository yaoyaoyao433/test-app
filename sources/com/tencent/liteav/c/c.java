package com.tencent.liteav.c;

import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    private static c b;
    private final String a = "CutTimeConfig";
    private long c = -1;
    private long d = -1;
    private long e = -1;
    private long f = -1;

    public static c a() {
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    public void a(long j, long j2) {
        if (j < 0 || j2 < 0) {
            TXCLog.e("CutTimeConfig", "setCutTimeUs, startTimeUs or endTimeUs < 0");
        } else if (j >= j2) {
            TXCLog.e("CutTimeConfig", "setCutTimeUs, start time >= end time, ignore");
        } else {
            this.c = j;
            this.d = j2;
        }
    }

    public void b(long j, long j2) {
        if (j < 0 || j2 < 0) {
            TXCLog.e("CutTimeConfig", "setPlayTimeUs, startTimeUs or endTimeUs < 0");
        } else if (j >= j2) {
            TXCLog.e("CutTimeConfig", "setPlayTimeUs, start time >= end time, ignore");
        } else {
            this.e = j;
            this.f = j2;
        }
    }

    public long b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return this.e;
    }

    public long e() {
        return this.f;
    }

    public long f() {
        if (this.c < 0) {
            this.c = 0L;
        }
        return this.c;
    }

    public long g() {
        if (this.d < 0) {
            this.d = 0L;
        }
        return this.d;
    }

    public void h() {
        this.c = -1L;
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
    }
}
