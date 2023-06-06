package com.tencent.liteav.c;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.i.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {
    private static h a;
    private ArrayList<Long> b;
    private int c;
    private a.l d;
    private int e;
    private int f;
    private boolean g;

    public static h a() {
        if (a == null) {
            a = new h();
        }
        return a;
    }

    public void a(a.l lVar) {
        this.d = lVar;
    }

    public void a(ArrayList<Long> arrayList) {
        this.b = arrayList;
    }

    public void a(long j) {
        long j2 = 0;
        if (j < 0) {
            return;
        }
        this.b = new ArrayList<>();
        if (this.d == null || this.d.a <= 0) {
            return;
        }
        c a2 = c.a();
        long f = a2.f();
        long g = a2.g();
        TXCLog.i("ThumbnailConfig", "calculateThumbnailList startTimeUs : " + f + ", endTimeUs : " + g);
        long j3 = g - f;
        if (j3 <= 0) {
            j3 = j;
        }
        long j4 = j3 / this.d.a;
        int i = 0;
        while (i < this.d.a) {
            long j5 = (i * j4) + f;
            if (g <= j2 || g >= j) {
                if (j5 > j) {
                    j5 = j;
                }
            } else if (j5 > g) {
                j5 = g;
            }
            TXCLog.i("ThumbnailConfig", "calculateThumbnailList frameTime : " + j5);
            this.b.add(Long.valueOf(j5));
            i++;
            j2 = 0;
        }
    }

    public List<Long> b() {
        return this.b;
    }

    public int c() {
        if (this.d == null) {
            return 0;
        }
        return this.d.a;
    }

    public com.tencent.liteav.d.g d() {
        com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
        if (this.d != null) {
            gVar.a = this.d.b;
            gVar.b = this.d.c;
        } else if (this.f != 0 && this.e != 0) {
            gVar.b = this.f;
            gVar.a = this.e;
        }
        return gVar;
    }

    public boolean e() {
        return this.b == null || this.b.size() <= 0;
    }

    public long f() {
        return this.b.get(0).longValue();
    }

    public long g() {
        this.c++;
        return this.b.remove(0).longValue();
    }

    public int h() {
        return this.c;
    }

    public void i() {
        this.c = 0;
        this.b = null;
        this.g = false;
    }

    public void j() {
        i();
        this.d = null;
    }

    public void a(int i) {
        this.e = i;
        if (this.d != null) {
            this.d.b = i;
        }
    }

    public void b(int i) {
        this.f = i;
        if (this.d != null) {
            this.d.c = i;
        }
    }

    public boolean k() {
        return this.g;
    }

    public void a(boolean z) {
        this.g = z;
    }
}
