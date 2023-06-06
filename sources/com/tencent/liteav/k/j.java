package com.tencent.liteav.k;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.b.al;
import com.tencent.liteav.beauty.e;
import com.tencent.liteav.k.n;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class j {
    private static String e = "SpiritOut";
    protected al a = null;
    private l d = null;
    protected n.l b = null;
    e.f[] c = null;
    private int f = -1;
    private int g = -1;

    public boolean a(int i, int i2) {
        return c(i, i2);
    }

    private boolean c(int i, int i2) {
        if (i == this.f && i2 == this.g) {
            return true;
        }
        this.f = i;
        this.g = i2;
        if (this.a == null) {
            this.a = new al();
            this.a.a(true);
            if (!this.a.c()) {
                TXCLog.e(e, "mZoomInOutFilter init error!");
                return false;
            }
        }
        this.a.a(i, i2);
        if (this.d == null) {
            this.d = new l();
            this.d.a(true);
            if (!this.d.c()) {
                TXCLog.e(e, "mTextureWaterMarkFilter init error!");
                return false;
            }
        }
        this.d.a(i, i2);
        return true;
    }

    private void b() {
        if (this.a != null) {
            this.a.e();
            this.a = null;
        }
        if (this.d != null) {
            this.d.e();
            this.d = null;
        }
    }

    public void a(n.l lVar) {
        this.b = lVar;
    }

    public int a(int i) {
        if (this.b == null || this.a == null) {
            return i;
        }
        this.a.a(0.96f, this.b.g);
        this.a.a(this.b.h);
        int i2 = i;
        for (int i3 = 0; i3 < this.b.f; i3++) {
            if (i3 > 0) {
                this.a.a(0.9f, this.b.g + i3);
            }
            int a = this.a.a(i);
            e.f[] fVarArr = {new e.f()};
            fVarArr[0].e = a;
            fVarArr[0].f = this.f;
            fVarArr[0].g = this.g;
            fVarArr[0].b = 0.0f;
            fVarArr[0].c = 0.0f;
            fVarArr[0].d = 1.0f;
            if (this.d != null) {
                this.d.a(fVarArr);
                i2 = this.d.a(i2);
            }
        }
        return i2;
    }

    public void b(int i, int i2) {
        c(i, i2);
    }

    public void a() {
        b();
    }
}
