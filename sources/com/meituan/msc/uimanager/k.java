package com.meituan.msc.uimanager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public double[] b;
        public double[] c;
        public double[] d;
        public double[] e;
        public double[] f;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a70dd94c9df522c4dfddbfed519f74", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a70dd94c9df522c4dfddbfed519f74");
                return;
            }
            this.b = new double[4];
            this.c = new double[3];
            this.d = new double[3];
            this.e = new double[3];
            this.f = new double[3];
        }
    }

    private static boolean a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db1b99267c3f2c34faaf464c7c423917", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db1b99267c3f2c34faaf464c7c423917")).booleanValue() : !Double.isNaN(d) && Math.abs(d) < 1.0E-5d;
    }

    public static void a(double[] dArr, a aVar) {
        Object[] objArr = {dArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdd9cb8c2d183cfc77a33cd22d47dbca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdd9cb8c2d183cfc77a33cd22d47dbca");
            return;
        }
        com.facebook.infer.annotation.a.a(true);
        double[] dArr2 = aVar.b;
        double[] dArr3 = aVar.c;
        double[] dArr4 = aVar.d;
        double[] dArr5 = aVar.e;
        double[] dArr6 = aVar.f;
        if (a(dArr[15])) {
            return;
        }
        double[][] dArr7 = (double[][]) Array.newInstance(double.class, 4, 4);
        double[] dArr8 = new double[16];
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = (i * 4) + i2;
                double d = dArr[i3] / dArr[15];
                dArr7[i][i2] = d;
                if (i2 == 3) {
                    d = 0.0d;
                }
                dArr8[i3] = d;
            }
        }
        dArr8[15] = 1.0d;
        if (a(b(dArr8))) {
            return;
        }
        if (!a(dArr7[0][3]) || !a(dArr7[1][3]) || !a(dArr7[2][3])) {
            a(new double[]{dArr7[0][3], dArr7[1][3], dArr7[2][3], dArr7[3][3]}, d(c(dArr8)), dArr2);
        } else {
            dArr2[2] = 0.0d;
            dArr2[1] = 0.0d;
            dArr2[0] = 0.0d;
            dArr2[3] = 1.0d;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            dArr5[i4] = dArr7[3][i4];
        }
        double[][] dArr9 = (double[][]) Array.newInstance(double.class, 3, 3);
        for (int i5 = 0; i5 < 3; i5++) {
            dArr9[i5][0] = dArr7[i5][0];
            dArr9[i5][1] = dArr7[i5][1];
            dArr9[i5][2] = dArr7[i5][2];
        }
        dArr3[0] = e(dArr9[0]);
        dArr9[0] = c(dArr9[0], dArr3[0]);
        dArr4[0] = a(dArr9[0], dArr9[1]);
        dArr9[1] = a(dArr9[1], dArr9[0], 1.0d, -dArr4[0]);
        dArr4[0] = a(dArr9[0], dArr9[1]);
        dArr9[1] = a(dArr9[1], dArr9[0], 1.0d, -dArr4[0]);
        dArr3[1] = e(dArr9[1]);
        dArr9[1] = c(dArr9[1], dArr3[1]);
        dArr4[0] = dArr4[0] / dArr3[1];
        dArr4[1] = a(dArr9[0], dArr9[2]);
        dArr9[2] = a(dArr9[2], dArr9[0], 1.0d, -dArr4[1]);
        dArr4[2] = a(dArr9[1], dArr9[2]);
        dArr9[2] = a(dArr9[2], dArr9[1], 1.0d, -dArr4[2]);
        dArr3[2] = e(dArr9[2]);
        dArr9[2] = c(dArr9[2], dArr3[2]);
        dArr4[1] = dArr4[1] / dArr3[2];
        dArr4[2] = dArr4[2] / dArr3[2];
        if (a(dArr9[0], b(dArr9[1], dArr9[2])) < 0.0d) {
            for (int i6 = 0; i6 < 3; i6++) {
                dArr3[i6] = dArr3[i6] * (-1.0d);
                double[] dArr10 = dArr9[i6];
                dArr10[0] = dArr10[0] * (-1.0d);
                double[] dArr11 = dArr9[i6];
                dArr11[1] = dArr11[1] * (-1.0d);
                double[] dArr12 = dArr9[i6];
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        dArr6[0] = b((-Math.atan2(dArr9[2][1], dArr9[2][2])) * 57.29577951308232d);
        dArr6[1] = b((-Math.atan2(-dArr9[2][0], Math.sqrt((dArr9[2][1] * dArr9[2][1]) + (dArr9[2][2] * dArr9[2][2])))) * 57.29577951308232d);
        dArr6[2] = b((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    private static double b(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d317f9203bc3e3d399eea6dc1cc7327", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d317f9203bc3e3d399eea6dc1cc7327")).doubleValue();
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

    private static double[] c(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2c288408566e29d20b4d8a3fcd6dce6", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2c288408566e29d20b4d8a3fcd6dce6");
        }
        double b = b(dArr);
        if (a(b)) {
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
        double d37 = d8 * d9;
        double d38 = ((d18 * d13) - (d17 * d13)) - (d37 * d15);
        double d39 = d5 * d12;
        double d40 = d7 * d9;
        double d41 = d38 + (d39 * d15) + (d40 * d16);
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
        double d53 = ((((d20 * d13) - (d19 * d13)) + (d37 * d14)) - (d39 * d14)) - (d52 * d16);
        double d54 = d5 * d10;
        double d55 = d2 * d9;
        double d56 = (((d26 * d13) - (d27 * d13)) - (d44 * d14)) + (d45 * d14) + (d55 * d16);
        double d57 = d * d10;
        double d58 = d2 * d5;
        double d59 = d * d6;
        return new double[]{(d22 + (d23 * d16)) / b, (d29 - (d30 * d16)) / b, ((((((d31 * d14) - (d32 * d14)) + (d33 * d15)) - (d34 * d15)) - (d35 * d16)) + (d36 * d16)) / b, ((((((d32 * d10) - (d31 * d10)) - (d33 * d11)) + (d34 * d11)) + (d35 * d12)) - (d36 * d12)) / b, (d41 - (d42 * d16)) / b, ((((d43 + (d44 * d15)) - (d45 * d15)) - (d46 * d16)) + (d47 * d16)) / b, ((((((d32 * d13) - (d31 * d13)) - (d48 * d15)) + (d49 * d15)) + (d50 * d16)) - (d51 * d16)) / b, ((((((d31 * d9) - (d32 * d9)) + (d48 * d11)) - (d49 * d11)) - (d50 * d12)) + (d51 * d12)) / b, (d53 + (d54 * d16)) / b, (d56 - (d57 * d16)) / b, ((((((d34 * d13) - (d33 * d13)) + (d48 * d14)) - (d49 * d14)) - (d58 * d16)) + (d16 * d59)) / b, ((((((d33 * d9) - (d34 * d9)) - (d48 * d10)) + (d49 * d10)) + (d58 * d12)) - (d12 * d59)) / b, ((((((d21 * d13) - (d23 * d13)) - (d40 * d14)) + (d42 * d14)) + (d52 * d15)) - (d54 * d15)) / b, ((((((d30 * d13) - (d28 * d13)) + (d46 * d14)) - (d47 * d14)) - (d55 * d15)) + (d57 * d15)) / b, ((((((d35 * d13) - (d13 * d36)) - (d50 * d14)) + (d14 * d51)) + (d58 * d15)) - (d15 * d59)) / b, ((((((d36 * d9) - (d35 * d9)) + (d50 * d10)) - (d51 * d10)) - (d58 * d11)) + (d59 * d11)) / b};
    }

    private static double[] d(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f88ced42f8c1df946076795fcf4f92a", RobustBitConfig.DEFAULT_VALUE) ? (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f88ced42f8c1df946076795fcf4f92a") : new double[]{dArr[0], dArr[4], dArr[8], dArr[12], dArr[1], dArr[5], dArr[9], dArr[13], dArr[2], dArr[6], dArr[10], dArr[14], dArr[3], dArr[7], dArr[11], dArr[15]};
    }

    private static void a(double[] dArr, double[] dArr2, double[] dArr3) {
        Object[] objArr = {dArr, dArr2, dArr3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff7785dcb6edf5b50169147b1b4fbbc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff7785dcb6edf5b50169147b1b4fbbc4");
            return;
        }
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        dArr3[0] = (dArr2[0] * d) + (dArr2[4] * d2) + (dArr2[8] * d3) + (dArr2[12] * d4);
        dArr3[1] = (dArr2[1] * d) + (dArr2[5] * d2) + (dArr2[9] * d3) + (dArr2[13] * d4);
        dArr3[2] = (dArr2[2] * d) + (dArr2[6] * d2) + (dArr2[10] * d3) + (dArr2[14] * d4);
        dArr3[3] = (d * dArr2[3]) + (d2 * dArr2[7]) + (d3 * dArr2[11]) + (d4 * dArr2[15]);
    }

    private static double e(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddc5f1e759af4c31dde0b7bf946a5b83", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddc5f1e759af4c31dde0b7bf946a5b83")).doubleValue() : Math.sqrt((dArr[0] * dArr[0]) + (dArr[1] * dArr[1]) + (dArr[2] * dArr[2]));
    }

    private static double[] c(double[] dArr, double d) {
        Object[] objArr = {dArr, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19331bce24808757b7d3c7af5ceac991", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19331bce24808757b7d3c7af5ceac991");
        }
        if (a(d)) {
            d = e(dArr);
        }
        double d2 = 1.0d / d;
        return new double[]{dArr[0] * d2, dArr[1] * d2, dArr[2] * d2};
    }

    private static double a(double[] dArr, double[] dArr2) {
        Object[] objArr = {dArr, dArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b3091952ec325cf6d3251b0b44aec1f", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b3091952ec325cf6d3251b0b44aec1f")).doubleValue() : (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    private static double[] a(double[] dArr, double[] dArr2, double d, double d2) {
        Object[] objArr = {dArr, dArr2, Double.valueOf(1.0d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62e0b46d954436ba9786c38da392030f", RobustBitConfig.DEFAULT_VALUE) ? (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62e0b46d954436ba9786c38da392030f") : new double[]{(dArr[0] * 1.0d) + (dArr2[0] * d2), (dArr[1] * 1.0d) + (dArr2[1] * d2), (dArr[2] * 1.0d) + (dArr2[2] * d2)};
    }

    private static double[] b(double[] dArr, double[] dArr2) {
        Object[] objArr = {dArr, dArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53dc2c9cde038d03e9c2b7109a9263f2", RobustBitConfig.DEFAULT_VALUE) ? (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53dc2c9cde038d03e9c2b7109a9263f2") : new double[]{(dArr[1] * dArr2[2]) - (dArr[2] * dArr2[1]), (dArr[2] * dArr2[0]) - (dArr[0] * dArr2[2]), (dArr[0] * dArr2[1]) - (dArr[1] * dArr2[0])};
    }

    private static double b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb0ea59c6e4d18acacc15c552d2165a3", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb0ea59c6e4d18acacc15c552d2165a3")).doubleValue() : Math.round(d * 1000.0d) * 0.001d;
    }

    public static void a(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f7489e62c4c65e0c0b99c868eaffe8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f7489e62c4c65e0c0b99c868eaffe8d");
            return;
        }
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

    public static void a(double[] dArr, double d) {
        Object[] objArr = {dArr, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3b4a7c15035cb1191c3f432b771b717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3b4a7c15035cb1191c3f432b771b717");
        } else {
            dArr[0] = d;
        }
    }

    public static void b(double[] dArr, double d) {
        Object[] objArr = {dArr, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d86029f5e3b5f1222ef8b641125c0013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d86029f5e3b5f1222ef8b641125c0013");
        } else {
            dArr[5] = d;
        }
    }

    public static void a(double[] dArr, double d, double d2) {
        Object[] objArr = {dArr, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0dfa8454d3228f070a31b269e5d5df9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0dfa8454d3228f070a31b269e5d5df9");
            return;
        }
        dArr[12] = d;
        dArr[13] = d2;
    }
}
