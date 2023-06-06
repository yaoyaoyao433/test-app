package com.squareup.picasso.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.resource.bitmap.e;
import com.squareup.picasso.BitmapTransformation;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends BitmapTransformation {
    private e a;

    public a(Context context) {
        super(context);
        this.a = new e(context);
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        l<Bitmap> a = this.a.a(bitmap == null ? null : new com.bumptech.glide.load.resource.bitmap.c(bitmap, null, Picasso.b()), this.c, this.d);
        if (a != null) {
            return a.a();
        }
        return null;
    }

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        e eVar = this.a;
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
