package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c extends e<Bitmap> {
    public c(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.e
    public void a(Bitmap bitmap) {
        ((ImageView) this.a).setImageBitmap(bitmap);
    }
}
