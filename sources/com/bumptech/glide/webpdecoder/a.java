package com.bumptech.glide.webpdecoder;

import android.graphics.Bitmap;
import com.bumptech.glide.k;
import com.bumptech.glide.load.engine.bitmap_recycle.c;
import com.dianping.animated.base.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public com.dianping.animated.webp.a a = new com.dianping.animated.webp.a(new b() { // from class: com.bumptech.glide.webpdecoder.a.1
        @Override // com.dianping.animated.base.b
        public final Bitmap a(int i, int i2, Bitmap.Config config) {
            if (a.this.b == null) {
                a.this.b = k.b();
            }
            return a.this.b.b(i, i2, config);
        }

        @Override // com.dianping.animated.base.b
        public final void a(Bitmap bitmap) {
            if (a.this.b == null) {
                a.this.b = k.b();
            }
            if (a.this.b.a(bitmap)) {
                return;
            }
            bitmap.recycle();
        }
    });
    c b;
    private byte[] c;

    public final void a(byte[] bArr) {
        if (this.c == null) {
            this.c = bArr;
            this.a.a(bArr);
        }
    }

    public final synchronized Bitmap a() {
        return this.a.h();
    }
}
