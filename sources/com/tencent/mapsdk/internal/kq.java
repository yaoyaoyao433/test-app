package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLU;
import android.opengl.Matrix;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kq {
    private static final String[] a = {"北", "东北", "东", "东南", "南", "西南", "西", "西北"};

    private static double a(double d) {
        return (d / 3.141592653589793d) * 180.0d;
    }

    private static double b(double d) {
        return (d / 180.0d) * 3.141592653589793d;
    }

    private static String a(float f) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        for (int i = 0; i < a.length; i++) {
            float f2 = (i * 45) - 22.0f;
            if (f < 45.0f + f2 && f >= f2) {
                return a[i];
            }
        }
        return a[0];
    }

    private static double c(double d) {
        double abs = Math.abs(d % 360.0d);
        return abs > 270.0d ? 360.0d - abs : abs;
    }

    private static Bitmap a(GL10 gl10, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2 + i4;
        int[] iArr = new int[i3 * i7];
        int[] iArr2 = new int[i5 * i6];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        long currentTimeMillis = System.currentTimeMillis();
        gl10.glReadPixels(i, 0, i3, i7, 6408, 5121, wrap);
        kj.a("readPixels 使用的时间:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        long currentTimeMillis2 = System.currentTimeMillis();
        float f = ((float) i3) / ((float) i5);
        float f2 = ((float) i4) / ((float) i6);
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = iArr[(((int) Math.ceil((i8 * f2) - 0.5d)) * i3) + ((int) Math.ceil((i10 * f) - 0.5d))];
                iArr2[(((i6 - i9) - 1) * i5) + i10] = (i11 & (-16711936)) | ((i11 << 16) & 16711680) | ((i11 >> 16) & 255);
            }
            i8++;
            i9++;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr2, i5, i6, Bitmap.Config.RGB_565);
        kj.a("buffer 转成位图使用的时间:" + (System.currentTimeMillis() - currentTimeMillis2) + "ms");
        return createBitmap;
    }

    private static IntBuffer b(GL10 gl10, int i, int i2, int i3, int i4) {
        IntBuffer wrap = IntBuffer.wrap(new int[i3 * i4]);
        wrap.position(0);
        gl10.glReadPixels(i, i2, i3, i4, 6408, 5121, wrap);
        return wrap;
    }

    private static int b(float f) {
        int i = 1;
        while (true) {
            int i2 = i + 1;
            int i3 = 2 << i;
            if (i3 >= ((int) Math.ceil(f))) {
                return i3;
            }
            i = i2;
        }
    }

    private static ga a(float f, float f2, float f3, float[] fArr, float f4) {
        float[] fArr2 = new float[16];
        Matrix.invertM(fArr2, 0, fArr, 0);
        ga gaVar = new ga(f, f2, f4);
        float[] fArr3 = new float[4];
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, new float[]{gaVar.a, gaVar.b, gaVar.c, gaVar.d}, 0);
        ga gaVar2 = new ga(fArr3[0] / fArr3[3], fArr3[1] / fArr3[3], fArr3[2] / fArr3[3]);
        float f5 = gaVar2.b != 0.0f ? f3 / gaVar2.b : 1.0f;
        return new ga(gaVar2.a * f5, f3, gaVar2.c * f5);
    }

    private static ga a(double d, double d2, double d3, double d4) {
        return new ga((float) (d - d3), 0.0f, -((float) (d2 - d4)));
    }

    private static PointF a(ga gaVar, double d, double d2) {
        return new PointF((float) (gaVar.a + d), (float) ((-gaVar.c) + d2));
    }

    private static double a(ga gaVar, ga gaVar2) {
        return Math.sqrt(Math.pow(gaVar.a - gaVar2.a, 2.0d) + Math.pow(gaVar.c - gaVar2.c, 2.0d));
    }

    private static double b(double d, double d2, double d3, double d4) {
        return Math.sqrt(Math.pow(d - d3, 2.0d) + Math.pow(d2 - d4, 2.0d));
    }

    private static double c(double d, double d2, double d3, double d4) {
        double abs;
        double d5 = d3 - d;
        double d6 = d4 - d2;
        double atan = Math.atan(d6 / d5);
        int i = (d5 > 0.0d ? 1 : (d5 == 0.0d ? 0 : -1));
        if (i > 0 && d6 > 0.0d) {
            abs = 1.5707963267948966d - Math.abs(atan);
        } else if (i >= 0 && d6 <= 0.0d) {
            abs = 1.5707963267948966d + Math.abs(atan);
        } else if (d5 <= 0.0d && d6 <= 0.0d) {
            abs = 4.71238898038469d - Math.abs(atan);
        } else {
            abs = 4.71238898038469d + Math.abs(atan);
        }
        return (abs * 180.0d) / 3.141592653589793d;
    }

    private static fz b(float f, float f2, float[] fArr, float[] fArr2, int[] iArr) {
        float[] a2 = a(f, f2, 0.0f, fArr, fArr2, iArr);
        float[] a3 = a(f, f2, 1.0f, fArr, fArr2, iArr);
        for (int i = 0; i < 3; i++) {
            a2[i] = a2[i] / a2[3];
            a3[i] = a3[i] / a3[3];
        }
        return new fz(a3[0] - a2[0], a3[1] - a2[1], a3[2] - a2[2]);
    }

    private static float[] a(float f, float f2, float f3, float[] fArr, float[] fArr2, int[] iArr) {
        float[] fArr3 = new float[4];
        if (GLU.gluUnProject(f, iArr[3] - f2, f3, fArr, 0, fArr2, 0, iArr, 0, fArr3, 0) == 1) {
            return fArr3;
        }
        throw new RuntimeException("unProject fail");
    }

    private static fz a(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float[] fArr2 = {fArr[3] - f, fArr[4] - f2, fArr[5] - f3};
        float[] fArr3 = {fArr[6] - f, fArr[7] - f2, fArr[8] - f3};
        float[] fArr4 = {(fArr2[1] * fArr3[2]) - (fArr2[2] * fArr3[1]), (fArr2[2] * fArr3[0]) - (fArr2[0] * fArr3[2]), (fArr2[0] * fArr3[1]) - (fArr2[1] * fArr3[0])};
        return new fz(fArr4[0], fArr4[1], fArr4[2]);
    }

    private static boolean a(float[] fArr, float[] fArr2) {
        fy fyVar = new fy(fArr2);
        ga gaVar = new ga(fArr[0], fArr[1], fArr[2]);
        return ((double) Math.abs(fyVar.a() - ((new fy(gaVar, fyVar.a, fyVar.b).a() + new fy(gaVar, fyVar.a, fyVar.c).a()) + new fy(gaVar, fyVar.b, fyVar.c).a()))) < 0.001d;
    }

    private static float[] a(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        float[] fArr5 = new float[3];
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float f6 = fArr2[2];
        float f7 = fArr3[0];
        float f8 = fArr3[1];
        float f9 = fArr3[2];
        float f10 = fArr4[0];
        float f11 = fArr4[1];
        float f12 = fArr4[2];
        float f13 = (f7 * f) + (f8 * f2) + (f9 * f3);
        if (f13 == 0.0f) {
            return null;
        }
        float f14 = ((((f4 - f10) * f) + ((f5 - f11) * f2)) + ((f6 - f12) * f3)) / f13;
        fArr5[0] = f10 + (f7 * f14);
        fArr5[1] = f11 + (f8 * f14);
        fArr5[2] = f12 + (f9 * f14);
        return fArr5;
    }

    private static Bitmap a(GL10 gl10, int i, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int[] iArr = new int[i3 * i5];
        int[] iArr2 = new int[i3 * i4];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        long currentTimeMillis = System.currentTimeMillis();
        gl10.glReadPixels(i, 0, i3, i5, 6408, 5121, wrap);
        kj.a("readPixels 使用的时间:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        long currentTimeMillis2 = System.currentTimeMillis();
        float f = (float) i3;
        float f2 = f / f;
        float f3 = i4;
        float f4 = f3 / f3;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            for (int i8 = 0; i8 < i3; i8++) {
                int i9 = iArr[(((int) Math.ceil((i6 * f4) - 0.5d)) * i3) + ((int) Math.ceil((i8 * f2) - 0.5d))];
                iArr2[(((i4 - i7) - 1) * i3) + i8] = (i9 & (-16711936)) | ((i9 << 16) & 16711680) | ((i9 >> 16) & 255);
            }
            i6++;
            i7++;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr2, i3, i4, Bitmap.Config.RGB_565);
        kj.a("buffer 转成位图使用的时间:" + (System.currentTimeMillis() - currentTimeMillis2) + "ms");
        return createBitmap;
    }

    private static float b(ga gaVar, ga gaVar2) {
        double asin = Math.asin((gaVar2.a - gaVar.a) / Math.sqrt(Math.pow(gaVar.a - gaVar2.a, 2.0d) + Math.pow(gaVar.c - gaVar2.c, 2.0d)));
        if (gaVar2.c - gaVar.c < 0.0f) {
            asin = 3.141592653589793d - asin;
        }
        return (float) ((asin / 3.141592653589793d) * 180.0d);
    }

    private static double d(double d, double d2, double d3, double d4) {
        double asin = Math.asin((d3 - d) / Math.sqrt(Math.pow(d - d3, 2.0d) + Math.pow(d2 - d4, 2.0d)));
        if (d4 - d2 < 0.0d) {
            asin = 3.141592653589793d - asin;
        }
        return (asin / 3.141592653589793d) * 180.0d;
    }

    private static boolean a(float f, float f2, float[] fArr, float[] fArr2, int[] iArr) {
        char c;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float[] fArr3 = {fArr[3] - f3, fArr[4] - f4, fArr[5] - f5};
        float[] fArr4 = {fArr[6] - f3, fArr[7] - f4, fArr[8] - f5};
        float[] fArr5 = {(fArr3[1] * fArr4[2]) - (fArr3[2] * fArr4[1]), (fArr3[2] * fArr4[0]) - (fArr3[0] * fArr4[2]), (fArr3[0] * fArr4[1]) - (fArr3[1] * fArr4[0])};
        fz fzVar = new fz(fArr5[0], fArr5[1], fArr5[2]);
        float[] fArr6 = new float[16];
        Matrix.setIdentityM(fArr6, 0);
        float[] a2 = a(f, f2, 0.0f, fArr6, fArr2, iArr);
        float[] a3 = a(f, f2, 1.0f, fArr6, fArr2, iArr);
        for (int i = 0; i < 3; i++) {
            a2[i] = a2[i] / a2[3];
            a3[i] = a3[i] / a3[3];
        }
        fz fzVar2 = new fz(a3[0] - a2[0], a3[1] - a2[1], a3[2] - a2[2]);
        float[] a4 = fzVar.a();
        float[] fArr7 = {fArr[0], fArr[1], fArr[2]};
        float[] a5 = fzVar2.a();
        float[] fArr8 = {a2[0], a2[1], a2[2]};
        float[] fArr9 = new float[3];
        float f6 = a4[0];
        float f7 = a4[1];
        float f8 = a4[2];
        float f9 = fArr7[0];
        float f10 = fArr7[1];
        float f11 = fArr7[2];
        float f12 = a5[0];
        float f13 = a5[1];
        float f14 = a5[2];
        float f15 = fArr8[0];
        float f16 = fArr8[1];
        float f17 = fArr8[2];
        float f18 = (f12 * f6) + (f13 * f7) + (f14 * f8);
        if (f18 == 0.0f) {
            fArr9 = null;
            c = 2;
        } else {
            float f19 = ((((f9 - f15) * f6) + ((f10 - f16) * f7)) + ((f11 - f17) * f8)) / f18;
            fArr9[0] = f15 + (f12 * f19);
            fArr9[1] = f16 + (f13 * f19);
            c = 2;
            fArr9[2] = f17 + (f14 * f19);
        }
        if (fArr9 == null) {
            return false;
        }
        fy fyVar = new fy(fArr);
        ga gaVar = new ga(fArr9[0], fArr9[1], fArr9[c]);
        return ((double) Math.abs(fyVar.a() - ((new fy(gaVar, fyVar.a, fyVar.b).a() + new fy(gaVar, fyVar.a, fyVar.c).a()) + new fy(gaVar, fyVar.b, fyVar.c).a()))) < 0.001d;
    }
}
