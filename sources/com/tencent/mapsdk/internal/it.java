package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class it {
    public static double a(long j, float f) {
        float f2 = ((float) j) / 5000.0f;
        return ((-f) * f2 * (f2 - 2.0f)) + 0.0f;
    }

    public static double a(long j, float f, float f2, long j2) {
        return ((f2 * ((float) j)) / ((float) j2)) + f;
    }

    private static double b(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return (f2 * f3 * f3) + f;
    }

    private static double c(long j, float f, float f2, long j2) {
        long j3 = ((float) j) / (((float) j2) / 2.0f);
        if (j3 < 1) {
            float f3 = (float) j3;
            return ((f2 / 2.0f) * f3 * f3) + f;
        }
        long j4 = j3 - 1;
        return (((-f2) / 2.0f) * ((float) ((j4 * (j4 - 2)) - 1))) + f;
    }

    private static double g(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return (f2 * f3 * f3 * f3 * f3) + f;
    }

    private static double d(long j, float f, float f2, long j2) {
        return (f2 * Math.pow(j / j2, 3.0d)) + f;
    }

    private static double e(long j, float f, float f2, long j2) {
        return (f2 * (Math.pow((((float) j) / ((float) j2)) - 1.0f, 3.0d) + 1.0d)) + f;
    }

    private static double f(long j, float f, float f2, long j2) {
        long j3 = j / (j2 / 2);
        if (j3 < 1) {
            return ((f2 / 2.0f) * Math.pow(j3, 3.0d)) + f;
        }
        return ((f2 / 2.0f) * (Math.pow(j3 - 2, 3.0d) + 2.0d)) + f;
    }

    private static double h(long j, float f, float f2, long j2) {
        float f3 = (float) (j / (j2 - 1));
        return ((-f2) * ((((f3 * f3) * f3) * f3) - 1.0f)) + f;
    }

    private static double i(long j, float f, float f2, long j2) {
        long j3 = j / (j2 / 2);
        if (j3 < 1) {
            float f3 = (float) j3;
            return ((f2 / 2.0f) * f3 * f3 * f3 * f3) + f;
        }
        long j4 = j3 - 2;
        return (((-f2) / 2.0f) * ((float) ((((j4 * j4) * j4) * j4) - 2))) + f;
    }

    private static double j(long j, float f, float f2, long j2) {
        float f3 = (float) (j / j2);
        return (f2 * f3 * f3 * f3 * f3 * f3) + f;
    }

    private static double k(long j, float f, float f2, long j2) {
        long j3 = (j / j2) - 1;
        return (f2 * ((float) ((j3 * j3 * j3 * j3 * j3) + 1))) + f;
    }

    private static double l(long j, float f, float f2, long j2) {
        long j3 = j / (j2 / 2);
        if (j3 < 1) {
            float f3 = (float) j3;
            return ((f2 / 2.0f) * f3 * f3 * f3 * f3 * f3) + f;
        }
        long j4 = j3 - 2;
        return ((f2 / 2.0f) * ((float) ((j4 * j4 * j4 * j4 * j4) + 2))) + f;
    }

    private static double m(long j, float f, float f2, long j2) {
        return (f2 * (1.0d - Math.cos((j / j2) * 1.5707963267948966d))) + f;
    }

    private static double n(long j, float f, float f2, long j2) {
        return (f2 * Math.sin((j / j2) * 1.5707963267948966d)) + f;
    }

    private static double o(long j, float f, float f2, long j2) {
        return ((f2 / 2.0f) * (1.0d - Math.cos((j * 3.141592653589793d) / j2))) + f;
    }

    private static double p(long j, float f, float f2, long j2) {
        return (f2 * Math.pow(2.0d, ((j / j2) - 1) * 10)) + f;
    }

    private static double q(long j, float f, float f2, long j2) {
        return (f2 * ((-Math.pow(2.0d, (j * (-10)) / j2)) + 1.0d)) + f;
    }

    private static double r(long j, float f, float f2, long j2) {
        long j3 = j / j2;
        return (f2 * (1.0d - Math.sqrt(1 - (j3 * j3)))) + f;
    }

    private static double s(long j, float f, float f2, long j2) {
        long j3 = j / (j2 - 1);
        return (f2 * Math.sqrt(1 - (j3 * j3))) + f;
    }

    private static double t(long j, float f, float f2, long j2) {
        long j3 = j / (j2 / 2);
        if (j3 < 1) {
            return ((f2 / 2.0f) * (1.0d - Math.sqrt(1 - (j3 * j3)))) + f;
        }
        long j4 = j3 - 2;
        return ((f2 / 2.0f) * (Math.sqrt(1 - (j4 * j4)) + 1.0d)) + f;
    }

    private static double u(long j, float f, float f2, long j2) {
        long j3 = j / (j2 / 2);
        if (j3 < 1) {
            return ((f2 / 2.0f) * ((float) (j3 * j3 * ((j3 * 4) - 3)))) + f;
        }
        long j4 = j3 - 2;
        return ((f2 / 2.0f) * ((float) ((j4 * j4 * ((j4 * 4) + 3)) + 2))) + f;
    }

    private static double v(long j, float f, float f2, long j2) {
        long j3 = j / j2;
        float f3 = (float) j3;
        return (f2 * f3 * f3 * ((float) ((j3 * 21) - 20))) + f;
    }

    private static double w(long j, float f, float f2, long j2) {
        long j3 = (j / j2) - 1;
        return (f2 * ((float) ((j3 * j3 * ((j3 * 21) + 20)) + 1))) + f;
    }
}
