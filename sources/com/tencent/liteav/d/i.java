package com.tencent.liteav.d;

import android.graphics.Bitmap;
import com.tencent.liteav.i.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i extends j {
    private final int a;
    private int b;

    public i(Bitmap bitmap, a.h hVar, int i) {
        super(bitmap, hVar);
        this.a = 3000;
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    @Override // com.tencent.liteav.d.j
    public void b() {
        super.b();
        this.b = 0;
    }
}
