package com.tencent.liteav.j;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static long a(int i) {
        switch (i) {
            case 1:
            case 2:
            default:
                return 1000L;
            case 3:
            case 6:
                return 1500L;
            case 4:
            case 5:
                return 100L;
        }
    }

    public static long b(int i) {
        switch (i) {
            case 1:
            case 2:
            default:
                return 500L;
            case 3:
                return 1000L;
            case 4:
            case 5:
                return 2500L;
            case 6:
                return 1500L;
        }
    }

    public static Bitmap a(float f, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap && bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAlpha(i);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRect(rectF, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static float a(int i, long j) {
        long a = a(i);
        long b = b(i);
        long j2 = a + b;
        long j3 = j - ((j / j2) * j2);
        if (j3 >= 0 && j3 <= a) {
            TXCLog.d("BitmapUtil", "setBitmapsAndDisplayRatio, in stay status, cropOffsetRatio = 0, remainTimeMs = " + j3);
            return 0.0f;
        }
        float f = ((float) (j3 - a)) / ((float) b);
        TXCLog.d("BitmapUtil", "setBitmapsAndDisplayRatio, in motion status, cropOffsetRatio = " + f + ", remainTimeMs = " + j3);
        return f;
    }

    public static float b(int i, long j) {
        long a = a(i);
        long b = b(i);
        long j2 = a + b;
        long j3 = j - ((j / j2) * j2);
        switch (i) {
            case 3:
                if ((j3 < 0 || j3 > a) && j3 > a && j3 <= j2) {
                    return 1.0f - (((float) (j3 - a)) / ((float) b));
                }
                break;
            case 4:
                if ((j3 < 0 || j3 > a) && j3 > a && j3 < j2) {
                    return ((((float) (j3 - a)) * 0.1f) / ((float) b)) + 1.0f;
                }
                break;
            case 5:
                if (j3 >= 0 && j3 <= a) {
                    return 1.1f;
                }
                if (j3 > a && j3 <= j2) {
                    return 1.1f - ((((float) (j3 - a)) * 0.1f) / ((float) b));
                }
                break;
        }
        return 1.0f;
    }

    public static float c(int i, long j) {
        long j2;
        long a = a(i);
        long b = b(i);
        long j3 = a + b;
        long j4 = j - ((j / j3) * j3);
        switch (i) {
            case 4:
            case 5:
                if (j4 >= 0) {
                    j2 = j3;
                    if (j4 <= a + (b * 0.8d)) {
                        return 1.0f;
                    }
                } else {
                    j2 = j3;
                }
                if (j4 <= a + (b * 0.8d) || j4 > j2) {
                    return 1.0f;
                }
                float f = (float) b;
                return 1.0f - ((((float) (j4 - a)) - (0.8f * f)) / (f * 0.2f));
            case 6:
                if ((j4 < 0 || j4 > a) && j4 > a && j4 <= j3) {
                    return 1.0f - (((float) (j4 - a)) / ((float) b));
                }
                return 1.0f;
            default:
                return 1.0f;
        }
    }

    public static int d(int i, long j) {
        long a = a(i);
        long b = b(i);
        long j2 = a + b;
        long j3 = j - ((j / j2) * j2);
        if (i != 3) {
            return 0;
        }
        if ((j3 <= 0 || j3 > a) && j3 > a && j3 <= j2) {
            return (int) ((((float) (j3 - a)) / ((float) b)) * 360.0f);
        }
        return 0;
    }
}
