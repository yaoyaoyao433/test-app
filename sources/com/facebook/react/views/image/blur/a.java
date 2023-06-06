package com.facebook.react.views.image.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import com.squareup.picasso.Transformation;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements Transformation {
    private Context a;
    private int b;
    private int c = 1;

    public a(Context context, int i, int i2) {
        this.a = context.getApplicationContext();
        this.b = i;
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        Bitmap bitmap2;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / this.c, bitmap.getHeight() / this.c, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(1.0f / this.c, 1.0f / this.c);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    bitmap2 = c.a(this.a, createBitmap, this.b);
                } catch (RSRuntimeException unused) {
                    bitmap2 = b.a(createBitmap, this.b, true);
                }
            } else {
                bitmap2 = b.a(createBitmap, this.b, true);
            }
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("[BlurTransformation@transform]", null, th);
            bitmap2 = createBitmap;
        }
        bitmap.recycle();
        return bitmap2;
    }

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        return "BlurTransformation{mRadius=" + this.b + ", mSampling=" + this.c + '}';
    }
}
