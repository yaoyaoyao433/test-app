package com.squareup.picasso.progressive;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.progressive.d$d  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1429d {
        com.bumptech.glide.load.c a(String str);

        void a(String str, Bitmap bitmap, int i, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        private static a a = new a();
    }

    public static void a(String str, com.bumptech.glide.load.c cVar, ImageView imageView) {
        b.a.a(str, cVar, imageView);
    }

    public static com.bumptech.glide.load.c a(String str, int i, int i2, long j, int i3, int i4, boolean z, boolean z2, int i5, boolean z3) {
        return new i(str, i, i2, j, i3, i4, z, false, 0, false);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c {
        com.bumptech.glide.load.c a;
        WeakReference<ImageView> b;

        c(com.bumptech.glide.load.c cVar, ImageView imageView) {
            this.a = cVar;
            this.b = new WeakReference<>(imageView);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements InterfaceC1429d {
        private WeakHashMap<String, c> a;

        private a() {
            this.a = new WeakHashMap<>();
        }

        @Override // com.squareup.picasso.progressive.d.InterfaceC1429d
        public final void a(String str, final Bitmap bitmap, int i, boolean z) {
            synchronized (this) {
                c cVar = this.a.get(str);
                if (cVar == null) {
                    return;
                }
                final ImageView imageView = cVar.b.get();
                if (imageView == null) {
                    this.a.remove(str);
                    return;
                }
                if (imageView != null) {
                    imageView.post(new Runnable() { // from class: com.squareup.picasso.progressive.d.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                }
                if (z) {
                    b(str);
                }
            }
        }

        @Override // com.squareup.picasso.progressive.d.InterfaceC1429d
        public final com.bumptech.glide.load.c a(String str) {
            c cVar;
            synchronized (this) {
                cVar = this.a.get(str);
            }
            if (cVar == null) {
                return null;
            }
            return cVar.a;
        }

        synchronized void a(String str, com.bumptech.glide.load.c cVar, ImageView imageView) {
            this.a.put(str, new c(cVar, imageView));
        }

        public synchronized void b(String str) {
            this.a.remove(str);
        }
    }
}
