package com.facebook.react.uimanager;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        double[] perspective = new double[4];
        double[] scale = new double[3];
        double[] skew = new double[3];
        double[] translation = new double[3];
        double[] rotationDegrees = new double[3];

        private static void resetArray(double[] dArr) {
            for (int i = 0; i < dArr.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        public void reset() {
            resetArray(this.perspective);
            resetArray(this.scale);
            resetArray(this.skew);
            resetArray(this.translation);
            resetArray(this.rotationDegrees);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(double d) {
        return !Double.isNaN(d) && Math.abs(d) < 1.0E-5d;
    }

    public static double a(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d4 * d7;
        double d18 = d3 * d8;
        double d19 = d4 * d6;
        double d20 = d2 * d8;
        double d21 = d3 * d6;
        double d22 = d2 * d7;
        double d23 = d4 * d5;
        double d24 = d8 * d;
        double d25 = d3 * d5;
        double d26 = d7 * d;
        double d27 = d2 * d5;
        double d28 = d * d6;
        return ((((((((((((((((((((((((d17 * d10) * d13) - ((d18 * d10) * d13)) - ((d19 * d11) * d13)) + ((d20 * d11) * d13)) + ((d21 * d12) * d13)) - ((d22 * d12) * d13)) - ((d17 * d9) * d14)) + ((d18 * d9) * d14)) + ((d23 * d11) * d14)) - ((d24 * d11) * d14)) - ((d25 * d12) * d14)) + ((d26 * d12) * d14)) + ((d19 * d9) * d15)) - ((d20 * d9) * d15)) - ((d23 * d10) * d15)) + ((d24 * d10) * d15)) + ((d27 * d12) * d15)) - ((d12 * d28) * d15)) - ((d21 * d9) * d16)) + ((d22 * d9) * d16)) + ((d25 * d10) * d16)) - ((d26 * d10) * d16)) - ((d27 * d11) * d16)) + (d28 * d11 * d16);
    }

    public static double[] b(double[] dArr) {
        double a2 = a(dArr);
        if (a(a2)) {
            return dArr;
        }
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d7 * d12;
        double d18 = d8 * d11;
        double d19 = d8 * d10;
        double d20 = d6 * d12;
        double d21 = d7 * d10;
        double d22 = ((((d17 * d14) - (d18 * d14)) + (d19 * d15)) - (d20 * d15)) - (d21 * d16);
        double d23 = d6 * d11;
        double d24 = d4 * d11;
        double d25 = d3 * d12;
        double d26 = d4 * d10;
        double d27 = d2 * d12;
        double d28 = d3 * d10;
        double d29 = (((d24 * d14) - (d25 * d14)) - (d26 * d15)) + (d27 * d15) + (d28 * d16);
        double d30 = d2 * d11;
        double d31 = d3 * d8;
        double d32 = d4 * d7;
        double d33 = d4 * d6;
        double d34 = d2 * d8;
        double d35 = d3 * d6;
        double d36 = d2 * d7;
        double d37 = (d18 * d13) - (d17 * d13);
        double d38 = d8 * d9;
        double d39 = d5 * d12;
        double d40 = d7 * d9;
        double d41 = (d37 - (d38 * d15)) + (d39 * d15) + (d40 * d16);
        double d42 = d5 * d11;
        double d43 = (d25 * d13) - (d24 * d13);
        double d44 = d4 * d9;
        double d45 = d * d12;
        double d46 = d3 * d9;
        double d47 = d * d11;
        double d48 = d4 * d5;
        double d49 = d8 * d;
        double d50 = d3 * d5;
        double d51 = d7 * d;
        double d52 = d6 * d9;
        double d53 = ((((d20 * d13) - (d19 * d13)) + (d38 * d14)) - (d39 * d14)) - (d52 * d16);
        double d54 = d5 * d10;
        double d55 = d2 * d9;
        double d56 = (((d26 * d13) - (d27 * d13)) - (d44 * d14)) + (d45 * d14) + (d55 * d16);
        double d57 = d * d10;
        double d58 = d2 * d5;
        double d59 = d * d6;
        return new double[]{(d22 + (d23 * d16)) / a2, (d29 - (d30 * d16)) / a2, ((((((d31 * d14) - (d32 * d14)) + (d33 * d15)) - (d34 * d15)) - (d35 * d16)) + (d36 * d16)) / a2, ((((((d32 * d10) - (d31 * d10)) - (d33 * d11)) + (d34 * d11)) + (d35 * d12)) - (d36 * d12)) / a2, (d41 - (d42 * d16)) / a2, ((((d43 + (d44 * d15)) - (d45 * d15)) - (d46 * d16)) + (d47 * d16)) / a2, ((((((d32 * d13) - (d31 * d13)) - (d48 * d15)) + (d49 * d15)) + (d50 * d16)) - (d51 * d16)) / a2, ((((((d31 * d9) - (d32 * d9)) + (d48 * d11)) - (d49 * d11)) - (d50 * d12)) + (d51 * d12)) / a2, (d53 + (d54 * d16)) / a2, (d56 - (d57 * d16)) / a2, ((((((d34 * d13) - (d33 * d13)) + (d48 * d14)) - (d49 * d14)) - (d58 * d16)) + (d16 * d59)) / a2, ((((((d33 * d9) - (d34 * d9)) - (d48 * d10)) + (d49 * d10)) + (d58 * d12)) - (d12 * d59)) / a2, ((((((d21 * d13) - (d23 * d13)) - (d40 * d14)) + (d42 * d14)) + (d52 * d15)) - (d54 * d15)) / a2, ((((((d30 * d13) - (d28 * d13)) + (d46 * d14)) - (d47 * d14)) - (d55 * d15)) + (d57 * d15)) / a2, ((((((d35 * d13) - (d13 * d36)) - (d50 * d14)) + (d14 * d51)) + (d58 * d15)) - (d15 * d59)) / a2, ((((((d36 * d9) - (d35 * d9)) + (d50 * d10)) - (d51 * d10)) - (d58 * d11)) + (d59 * d11)) / a2};
    }

    public static double[] c(double[] dArr) {
        return new double[]{dArr[0], dArr[4], dArr[8], dArr[12], dArr[1], dArr[5], dArr[9], dArr[13], dArr[2], dArr[6], dArr[10], dArr[14], dArr[3], dArr[7], dArr[11], dArr[15]};
    }

    public static void a(double[] dArr, double[] dArr2, double[] dArr3) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        dArr3[0] = (dArr2[0] * d) + (dArr2[4] * d2) + (dArr2[8] * d3) + (dArr2[12] * d4);
        dArr3[1] = (dArr2[1] * d) + (dArr2[5] * d2) + (dArr2[9] * d3) + (dArr2[13] * d4);
        dArr3[2] = (dArr2[2] * d) + (dArr2[6] * d2) + (dArr2[10] * d3) + (dArr2[14] * d4);
        dArr3[3] = (d * dArr2[3]) + (d2 * dArr2[7]) + (d3 * dArr2[11]) + (d4 * dArr2[15]);
    }

    public static double d(double[] dArr) {
        return Math.sqrt((dArr[0] * dArr[0]) + (dArr[1] * dArr[1]) + (dArr[2] * dArr[2]));
    }

    public static double[] a(double[] dArr, double d) {
        if (a(d)) {
            d = d(dArr);
        }
        double d2 = 1.0d / d;
        return new double[]{dArr[0] * d2, dArr[1] * d2, dArr[2] * d2};
    }

    public static double a(double[] dArr, double[] dArr2) {
        return (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    public static double[] a(double[] dArr, double[] dArr2, double d, double d2) {
        return new double[]{(dArr[0] * 1.0d) + (dArr2[0] * d2), (dArr[1] * 1.0d) + (dArr2[1] * d2), (dArr[2] * 1.0d) + (d2 * dArr2[2])};
    }

    public static double[] b(double[] dArr, double[] dArr2) {
        return new double[]{(dArr[1] * dArr2[2]) - (dArr[2] * dArr2[1]), (dArr[2] * dArr2[0]) - (dArr[0] * dArr2[2]), (dArr[0] * dArr2[1]) - (dArr[1] * dArr2[0])};
    }

    public static double b(double d) {
        return Math.round(d * 1000.0d) * 0.001d;
    }

    public static void e(double[] dArr) {
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[11] = 0.0d;
        dArr[9] = 0.0d;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[15] = 1.0d;
        dArr[10] = 1.0d;
        dArr[5] = 1.0d;
        dArr[0] = 1.0d;
    }

    public static void a(double[] dArr, double d, double d2) {
        dArr[12] = d;
        dArr[13] = d2;
    }
}
