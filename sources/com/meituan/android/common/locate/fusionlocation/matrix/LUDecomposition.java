package com.meituan.android.common.locate.fusionlocation.matrix;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* loaded from: classes2.dex */
public class LUDecomposition implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    private double[][] LU;
    private int m;
    private int n;
    private int[] piv;
    private int pivsign;

    public LUDecomposition(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1e358776b2cda951e2b265947fa5bfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1e358776b2cda951e2b265947fa5bfc");
            return;
        }
        this.LU = matrix.getArrayCopy();
        this.m = matrix.getRowDimension();
        this.n = matrix.getColumnDimension();
        this.piv = new int[this.m];
        for (int i = 0; i < this.m; i++) {
            this.piv[i] = i;
        }
        this.pivsign = 1;
        double[] dArr = new double[this.m];
        int i2 = 0;
        while (i2 < this.n) {
            for (int i3 = 0; i3 < this.m; i3++) {
                dArr[i3] = this.LU[i3][i2];
            }
            for (int i4 = 0; i4 < this.m; i4++) {
                double[] dArr2 = this.LU[i4];
                int min = Math.min(i4, i2);
                double d = 0.0d;
                for (int i5 = 0; i5 < min; i5++) {
                    d += dArr2[i5] * dArr[i5];
                }
                double d2 = dArr[i4] - d;
                dArr[i4] = d2;
                dArr2[i2] = d2;
            }
            int i6 = i2 + 1;
            int i7 = i2;
            for (int i8 = i6; i8 < this.m; i8++) {
                if (Math.abs(dArr[i8]) > Math.abs(dArr[i7])) {
                    i7 = i8;
                }
            }
            if (i7 != i2) {
                for (int i9 = 0; i9 < this.n; i9++) {
                    double d3 = this.LU[i7][i9];
                    this.LU[i7][i9] = this.LU[i2][i9];
                    this.LU[i2][i9] = d3;
                }
                int i10 = this.piv[i7];
                int[] iArr = this.piv;
                iArr[i7] = iArr[i2];
                this.piv[i2] = i10;
                this.pivsign = -this.pivsign;
            }
            if ((i2 < this.m) & (this.LU[i2][i2] != 0.0d)) {
                for (int i11 = i6; i11 < this.m; i11++) {
                    double[] dArr3 = this.LU[i11];
                    dArr3[i2] = dArr3[i2] / this.LU[i2][i2];
                }
            }
            i2 = i6;
        }
    }

    public double det() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2c77f01b9184c50f137d97cd63ad9f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2c77f01b9184c50f137d97cd63ad9f2")).doubleValue();
        }
        if (this.m == this.n) {
            double d = this.pivsign;
            for (int i = 0; i < this.n; i++) {
                d *= this.LU[i][i];
            }
            return d;
        }
        throw new IllegalArgumentException("Matrix must be square.");
    }

    public double[] getDoublePivot() {
        double[] dArr = new double[this.m];
        for (int i = 0; i < this.m; i++) {
            dArr[i] = this.piv[i];
        }
        return dArr;
    }

    public Matrix getL() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7424eb6ed5ff7a5441d602018d748831", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7424eb6ed5ff7a5441d602018d748831");
        }
        Matrix matrix = new Matrix(this.m, this.n);
        double[][] array = matrix.getArray();
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                if (i > i2) {
                    array[i][i2] = this.LU[i][i2];
                } else if (i == i2) {
                    array[i][i2] = 1.0d;
                } else {
                    array[i][i2] = 0.0d;
                }
            }
        }
        return matrix;
    }

    public int[] getPivot() {
        int[] iArr = new int[this.m];
        for (int i = 0; i < this.m; i++) {
            iArr[i] = this.piv[i];
        }
        return iArr;
    }

    public Matrix getU() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e78c8613adf8d162b965ba71a937d64", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e78c8613adf8d162b965ba71a937d64");
        }
        Matrix matrix = new Matrix(this.n, this.n);
        double[][] array = matrix.getArray();
        for (int i = 0; i < this.n; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                if (i <= i2) {
                    array[i][i2] = this.LU[i][i2];
                } else {
                    array[i][i2] = 0.0d;
                }
            }
        }
        return matrix;
    }

    public boolean isNonsingular() {
        for (int i = 0; i < this.n; i++) {
            if (this.LU[i][i] == 0.0d) {
                return false;
            }
        }
        return true;
    }

    public Matrix solve(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db85a08bddd14235298b587de4e38eab", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db85a08bddd14235298b587de4e38eab");
        }
        if (matrix.getRowDimension() == this.m) {
            if (isNonsingular()) {
                int columnDimension = matrix.getColumnDimension();
                Matrix matrix2 = matrix.getMatrix(this.piv, 0, columnDimension - 1);
                double[][] array = matrix2.getArray();
                int i = 0;
                while (i < this.n) {
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < this.n; i3++) {
                        for (int i4 = 0; i4 < columnDimension; i4++) {
                            double[] dArr = array[i3];
                            dArr[i4] = dArr[i4] - (array[i][i4] * this.LU[i3][i]);
                        }
                    }
                    i = i2;
                }
                for (int i5 = this.n - 1; i5 >= 0; i5--) {
                    for (int i6 = 0; i6 < columnDimension; i6++) {
                        double[] dArr2 = array[i5];
                        dArr2[i6] = dArr2[i6] / this.LU[i5][i5];
                    }
                    for (int i7 = 0; i7 < i5; i7++) {
                        for (int i8 = 0; i8 < columnDimension; i8++) {
                            double[] dArr3 = array[i7];
                            dArr3[i8] = dArr3[i8] - (array[i5][i8] * this.LU[i7][i5]);
                        }
                    }
                }
                return matrix2;
            }
            throw new RuntimeException("Matrix is singular.");
        }
        throw new IllegalArgumentException("Matrix row dimensions must agree.");
    }
}
