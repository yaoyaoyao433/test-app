package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.squareup.picasso.InputStreamWrapper;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class k {
    public static i a;
    public static InputStreamWrapper c;
    protected final Context b;

    /* JADX INFO: Access modifiers changed from: protected */
    public k(Context context) {
        this.b = context;
    }

    public final Context a() {
        return this.b;
    }

    public static void a(ImageView imageView) {
        i.a(imageView);
    }

    public static void a(com.bumptech.glide.request.target.l lVar) {
        if (lVar == null) {
            return;
        }
        i.a(lVar);
    }

    public static void b(ImageView imageView) {
        i.a(imageView);
    }

    public static com.bumptech.glide.load.engine.bitmap_recycle.c b() {
        return a.b;
    }

    public static void b(Context context) {
        a = i.a(context);
    }

    public void c() {
        a.b();
    }

    public void a(Context context, int i) {
        i.b(context).a(i);
    }

    public static com.bumptech.glide.load.engine.bitmap_recycle.c a(Context context) {
        i a2 = i.a(context);
        a = a2;
        return a2.b;
    }
}
