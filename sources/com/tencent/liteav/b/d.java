package com.tencent.liteav.b;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public com.tencent.liteav.beauty.e a;

    public d(Context context) {
        this.a = new com.tencent.liteav.beauty.e(context, true);
    }

    public void a(float[] fArr) {
        this.a.a(fArr);
    }

    public f a(int i, com.tencent.liteav.d.e eVar) {
        com.tencent.liteav.d.e a = a(eVar);
        int a2 = this.a.a(i, a.m(), a.n(), a.h(), 4, 0);
        f fVar = new f();
        fVar.b = a;
        fVar.a = a2;
        return fVar;
    }

    public void a() {
        this.a.b();
        this.a = null;
    }

    private com.tencent.liteav.d.e a(com.tencent.liteav.d.e eVar) {
        int h = 360 - eVar.h();
        if (h == 90 || h == 270) {
            int n = eVar.n();
            eVar.k(eVar.m());
            eVar.j(n);
        }
        return eVar;
    }
}
