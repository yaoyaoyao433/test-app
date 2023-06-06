package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements c {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final g b;
    private final Set<Bitmap.Config> c;
    private final int d;
    private final a e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    interface a {
    }

    private f(int i, g gVar, Set<Bitmap.Config> set) {
        this.d = i;
        this.f = i;
        this.b = gVar;
        this.c = set;
        this.e = new b();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
    public final synchronized boolean a(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (bitmap.isMutable() && this.b.c(bitmap) <= this.f && this.c.contains(bitmap.getConfig())) {
            int c = this.b.c(bitmap);
            this.b.a(bitmap);
            this.j++;
            this.g += c;
            if (Log.isLoggable("LruBitmapPool", 2)) {
                new StringBuilder("Put bitmap in pool=").append(this.b.b(bitmap));
            }
            b();
            b(this.f);
            return true;
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
            sb.append(this.b.b(bitmap));
            sb.append(", is mutable: ");
            sb.append(bitmap.isMutable());
            sb.append(", is allowed config: ");
            sb.append(this.c.contains(bitmap.getConfig()));
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
    public final synchronized Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap b2;
        b2 = b(i, i2, config);
        if (b2 != null) {
            b2.eraseColor(0);
        }
        return b2;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
    @TargetApi(12)
    public final synchronized Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap a2;
        a2 = this.b.a(i, i2, config != null ? config : a);
        if (a2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                new StringBuilder("Missing bitmap=").append(this.b.b(i, i2, config));
            }
            this.i++;
        } else {
            this.h++;
            this.g -= this.b.c(a2);
            if (Build.VERSION.SDK_INT >= 12) {
                a2.setHasAlpha(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            new StringBuilder("Get bitmap=").append(this.b.b(i, i2, config));
        }
        b();
        return a2;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
    public final void a() {
        Log.isLoggable("LruBitmapPool", 3);
        b(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            new StringBuilder("trimMemory, level=").append(i);
        }
        if (i >= 60) {
            a();
        } else if (i >= 40) {
            b(this.f / 2);
        }
    }

    private synchronized void b(int i) {
        while (this.g > i) {
            Bitmap a2 = this.b.a();
            if (a2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    c();
                }
                this.g = 0;
                return;
            }
            this.g -= this.b.c(a2);
            a2.recycle();
            this.k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                new StringBuilder("Evicting bitmap=").append(this.b.b(a2));
            }
            b();
        }
    }

    private void b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            c();
        }
    }

    private void c() {
        StringBuilder sb = new StringBuilder("Hits=");
        sb.append(this.h);
        sb.append(", misses=");
        sb.append(this.i);
        sb.append(", puts=");
        sb.append(this.j);
        sb.append(", evictions=");
        sb.append(this.k);
        sb.append(", currentSize=");
        sb.append(this.g);
        sb.append(", maxSize=");
        sb.append(this.f);
        sb.append("\nStrategy=");
        sb.append(this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b implements a {
        private b() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto Lc
            com.bumptech.glide.load.engine.bitmap_recycle.i r0 = new com.bumptech.glide.load.engine.bitmap_recycle.i
            r0.<init>()
            goto L11
        Lc:
            com.bumptech.glide.load.engine.bitmap_recycle.a r0 = new com.bumptech.glide.load.engine.bitmap_recycle.a
            r0.<init>()
        L11:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            android.graphics.Bitmap$Config[] r3 = android.graphics.Bitmap.Config.values()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.addAll(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L29
            r1 = 0
            r2.add(r1)
        L29:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.f.<init>(int):void");
    }
}
