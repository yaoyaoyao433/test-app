package com.tencent.liteav.k;

import android.util.Log;
import com.tencent.liteav.k.n;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    private static String c = "GhostShadow";
    private com.tencent.liteav.beauty.b.h b = null;
    n.f a = null;
    private com.tencent.liteav.beauty.d d = null;
    private int e = 0;
    private int f = 0;

    public boolean a(int i, int i2) {
        this.e = i;
        this.f = i2;
        return c(i, i2);
    }

    private boolean c(int i, int i2) {
        if (this.b == null) {
            this.b = new com.tencent.liteav.beauty.b.h();
            this.b.a(true);
            if (!this.b.c()) {
                Log.e(c, "mDissolveBlendFilter init Failed!");
                return false;
            }
        }
        if (this.b != null) {
            this.b.a(i, i2);
        }
        if (this.d == null) {
            this.d = new com.tencent.liteav.beauty.d();
            if (!this.d.a(i, i2)) {
                Log.e(c, "mDissolveBlendFilter init Failed!");
                return false;
            }
        }
        if (this.d != null) {
            this.d.b(i, i2);
        }
        return true;
    }

    private void b() {
        if (this.b != null) {
            this.b.e();
            this.b = null;
        }
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
    }

    public void a(n.f fVar) {
        this.a = fVar;
        if (fVar != null || this.d == null) {
            return;
        }
        this.d.a();
    }

    public int a(int i) {
        int i2;
        if (a(this.a, this.e, this.f)) {
            if (this.d == null || (i2 = this.d.a(i)) <= 0) {
                i2 = i;
            }
            return this.b != null ? this.b.c(i, i2) : i;
        }
        return i;
    }

    private boolean a(n.f fVar, int i, int i2) {
        if (fVar == null) {
            return false;
        }
        if (this.d != null) {
            this.d.b(fVar.a);
            return true;
        }
        return true;
    }

    public void b(int i, int i2) {
        c(i, i2);
    }

    public void a() {
        b();
    }
}
