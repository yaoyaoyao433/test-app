package com.tencent.liteav.d;

import android.graphics.Bitmap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {
    private Bitmap a;

    public void a() {
        if (this.a == null || this.a.isRecycled()) {
            return;
        }
        this.a.recycle();
        this.a = null;
    }
}
