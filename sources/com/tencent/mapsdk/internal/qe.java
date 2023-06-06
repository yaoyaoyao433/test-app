package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import com.tencent.mapsdk.internal.kv;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class qe extends jr {
    private static kv.a g = new kv.a(Bitmap.Config.ARGB_8888);

    public qe() {
        a(g);
    }

    public qe(byte[] bArr) {
        super(bArr);
        a(g);
    }

    @Override // com.tencent.mapsdk.internal.jr
    public final boolean f() {
        if (this.c != null && !this.c.isRecycled() && this.b.get() <= 0) {
            this.c.recycle();
            kn.f(ki.r).a("tileBitmap recycle out");
        }
        this.d = null;
        return this.c == null || this.c.isRecycled();
    }
}
