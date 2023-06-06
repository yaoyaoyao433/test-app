package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends d {
    @Override // com.bumptech.glide.load.g
    public final String a() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }

    public e(Context context) {
        super(context);
    }

    public e(com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.d
    protected final Bitmap a(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, Bitmap bitmap, int i, int i2) {
        float width;
        float f;
        Bitmap a = cVar.a(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        if (bitmap == null) {
            bitmap = null;
        } else if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Matrix matrix = new Matrix();
            float f2 = 0.0f;
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                width = i2 / bitmap.getHeight();
                f = (i - (bitmap.getWidth() * width)) * 0.5f;
            } else {
                width = i / bitmap.getWidth();
                f2 = (i2 - (bitmap.getHeight() * width)) * 0.5f;
                f = 0.0f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f + 0.5f), (int) (f2 + 0.5f));
            Bitmap createBitmap = a != null ? a : Bitmap.createBitmap(i, i2, r.a(bitmap));
            r.a(bitmap, createBitmap);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(6));
            bitmap = createBitmap;
        }
        if (a != null && a != bitmap && !cVar.a(a)) {
            a.recycle();
        }
        return bitmap;
    }
}
