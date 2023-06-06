package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BitmapTransformation implements Transformation {
    protected Context b;
    protected int c;
    protected int d;

    public BitmapTransformation(Context context) {
        this.b = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Bitmap a(int i, int i2, Bitmap.Config config) {
        return Picasso.b().a(i, i2, config);
    }

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
    }
}
