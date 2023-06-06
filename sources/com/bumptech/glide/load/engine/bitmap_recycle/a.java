package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements g {
    private final b a = new b();
    private final e<C0038a, Bitmap> b = new e<>();

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final void a(Bitmap bitmap) {
        this.b.a(this.a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.b.a((e<C0038a, Bitmap>) this.a.a(i, i2, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final Bitmap a() {
        return this.b.a();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final String b(int i, int i2, Bitmap.Config config) {
        return c(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final int c(Bitmap bitmap) {
        return com.bumptech.glide.util.h.a(bitmap);
    }

    public final String toString() {
        return "AttributeStrategy:\n  " + this.b;
    }

    static String c(int i, int i2, Bitmap.Config config) {
        return "[" + i + Constants.GestureMoveEvent.KEY_X + i2 + "], " + config;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class b extends com.bumptech.glide.load.engine.bitmap_recycle.b<C0038a> {
        b() {
        }

        public final C0038a a(int i, int i2, Bitmap.Config config) {
            C0038a b = b();
            b.a = i;
            b.b = i2;
            b.c = config;
            return b;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
        protected final /* synthetic */ C0038a a() {
            return new C0038a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0038a implements h {
        int a;
        int b;
        Bitmap.Config c;
        private final b d;

        public C0038a(b bVar) {
            this.d = bVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0038a) {
                C0038a c0038a = (C0038a) obj;
                return this.a == c0038a.a && this.b == c0038a.b && this.c == c0038a.c;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + (this.c != null ? this.c.hashCode() : 0);
        }

        public final String toString() {
            return a.c(this.a, this.b, this.c);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.h
        public final void a() {
            this.d.a(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final String b(Bitmap bitmap) {
        return c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }
}
