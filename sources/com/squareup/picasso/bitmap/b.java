package com.squareup.picasso.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.r;
import com.squareup.picasso.BitmapTransformation;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends BitmapTransformation {
    @Override // com.squareup.picasso.Transformation
    public final String a() {
        return "FitCenter.com.bumptech.glide.load.resource.bitmap";
    }

    public b(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        return r.a(bitmap, Picasso.b(), this.c, this.d);
    }
}
