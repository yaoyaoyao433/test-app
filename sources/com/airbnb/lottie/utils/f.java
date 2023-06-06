package com.airbnb.lottie.utils;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.animation.content.r;
import java.io.Closeable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    private static final PathMeasure a = new PathMeasure();
    private static final Path b = new Path();
    private static final Path c = new Path();
    private static final float[] d = new float[4];
    private static final float e = (float) Math.sqrt(2.0d);
    private static float f = -1.0f;

    public static int a(float f2, float f3, float f4, float f5) {
        int i = f2 != 0.0f ? (int) (f2 * 527.0f) : 17;
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (f4 != 0.0f) {
            i = (int) (i * 31 * f4);
        }
        return f5 != 0.0f ? (int) (i * 31 * f5) : i;
    }

    public static boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    public static Path a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float a(Matrix matrix) {
        d[0] = 0.0f;
        d[1] = 0.0f;
        d[2] = e;
        d[3] = e;
        matrix.mapPoints(d);
        return ((float) Math.hypot(d[2] - d[0], d[3] - d[1])) / 2.0f;
    }

    public static void a(Path path, float f2, float f3, float f4) {
        com.airbnb.lottie.d.c("applyTrimPathIfNeeded");
        a.setPath(path, false);
        float length = a.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            com.airbnb.lottie.d.d("applyTrimPathIfNeeded");
        } else if (length < 1.0f || Math.abs((f3 - f2) - 1.0f) < 0.01d) {
            com.airbnb.lottie.d.d("applyTrimPathIfNeeded");
        } else {
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = e.a(min, length);
                max = e.a(max, length);
            }
            if (min < 0.0f) {
                min = e.a(min, length);
            }
            if (max < 0.0f) {
                max = e.a(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                com.airbnb.lottie.d.d("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            b.reset();
            a.getSegment(min, max, b, true);
            if (max > length) {
                c.reset();
                a.getSegment(0.0f, max % length, c, true);
                b.addPath(c);
            } else if (min < 0.0f) {
                c.reset();
                a.getSegment(min + length, length, c, true);
                b.addPath(c);
            }
            path.set(b);
            com.airbnb.lottie.d.d("applyTrimPathIfNeeded");
        }
    }

    public static float a() {
        if (f == -1.0f) {
            f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f;
    }

    public static void a(Path path, @Nullable r rVar) {
        if (rVar == null) {
            return;
        }
        a(path, rVar.b.d().floatValue() / 100.0f, rVar.c.d().floatValue() / 100.0f, rVar.d.d().floatValue() / 360.0f);
    }
}
