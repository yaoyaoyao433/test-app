package com.tencent.liteav.d;

import android.graphics.Bitmap;
import com.tencent.liteav.i.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class j {
    private Bitmap a;
    private a.h b;

    public j(Bitmap bitmap, a.h hVar) {
        this.a = bitmap;
        this.b = hVar;
    }

    public Bitmap c() {
        return this.a;
    }

    public a.h d() {
        return this.b;
    }

    public void b() {
        if (this.a != null && !this.a.isRecycled()) {
            this.a.recycle();
            this.a = null;
        }
        this.b = null;
    }
}
