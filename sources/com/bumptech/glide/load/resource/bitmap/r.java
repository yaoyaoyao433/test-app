package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.util.Log;
import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r {
    public static Bitmap a(Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.c cVar, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int width = (int) (bitmap.getWidth() * min);
        int height = (int) (bitmap.getHeight() * min);
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap.Config a = a(bitmap);
        Bitmap a2 = cVar.a(width, height, a);
        if (a2 == null) {
            a2 = Bitmap.createBitmap(width, height, a);
        }
        a(bitmap, a2);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder sb = new StringBuilder("request: ");
            sb.append(i);
            sb.append(Constants.GestureMoveEvent.KEY_X);
            sb.append(i2);
            StringBuilder sb2 = new StringBuilder("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append(Constants.GestureMoveEvent.KEY_X);
            sb2.append(bitmap.getHeight());
            StringBuilder sb3 = new StringBuilder("toReuse: ");
            sb3.append(a2.getWidth());
            sb3.append(Constants.GestureMoveEvent.KEY_X);
            sb3.append(a2.getHeight());
            new StringBuilder("minPct:   ").append(min);
        }
        Canvas canvas = new Canvas(a2);
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        canvas.drawBitmap(bitmap, matrix, new Paint(6));
        return a2;
    }

    @TargetApi(12)
    public static void a(Bitmap bitmap, Bitmap bitmap2) {
        if (Build.VERSION.SDK_INT < 12 || bitmap2 == null) {
            return;
        }
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap.Config a(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }
}
