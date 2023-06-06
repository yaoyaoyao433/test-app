package com.meituan.android.common.locate.fusionlocation.matrix;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* loaded from: classes2.dex */
public class QRDecomposition implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    private double[][] QR;
    private double[] Rdiag;
    private int m;
    private int n;

    public QRDecomposition(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b1eb53e37ede66b64600d24332182c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b1eb53e37ede66b64600d24332182c6");
            return;
        }
        this.QR = matrix.getArrayCopy();
        this.m = matrix.getRowDimension();
        this.n = matrix.getColumnDimension();
        this.Rdiag = new double[this.n];
        for (int i = 0; i < this.n; i++) {
            double d = 0.0d;
            for (int i2 = i; i2 < this.m; i2++) {
                d = a.a(d, this.QR[i2][i]);
            }
            if (d != 0.0d) {
                d = this.QR[i][i] < 0.0d ? -d : d;
                for (int i3 = i; i3 < this.m; i3++) {
                    double[] dArr = this.QR[i3];
                    dArr[i] = dArr[i] / d;
                }
                double[] dArr2 = this.QR[i];
                dArr2[i] = dArr2[i] + 1.0d;
                for (int i4 = i + 1; i4 < this.n; i4++) {
                    double d2 = 0.0d;
                    for (int i5 = i; i5 < this.m; i5++) {
                        d2 += this.QR[i5][i] * this.QR[i5][i4];
                    }
                    double d3 = (-d2) / this.QR[i][i];
                    for (int i6 = i; i6 < this.m; i6++) {
                        double[] dArr3 = this.QR[i6];
                        dArr3[i4] = dArr3[i4] + (this.QR[i6][i] * d3);
                    }
                }
            }
            this.Rdiag[i] = -d;
        }
    }

    public Matrix getH() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df4ffb32448f7ae54adcaea7038a2ab9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df4ffb32448f7ae54adcaea7038a2ab9");
        }
        Matrix matrix = new Matrix(this.m, this.n);
        double[][] array = matrix.getArray();
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                if (i >= i2) {
                    array[i][i2] = this.QR[i][i2];
                } else {
                    array[i][i2] = 0.0d;
                }
            }
        }
        return matrix;
    }

    public Matrix getQ() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa53298b71f3d460fa4a672eb2fb6d2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa53298b71f3d460fa4a672eb2fb6d2f");
        }
        Matrix matrix = new Matrix(this.m, this.n);
        double[][] array = matrix.getArray();
        for (int i = this.n - 1; i >= 0; i--) {
            for (int i2 = 0; i2 < this.m; i2++) {
                array[i2][i] = 0.0d;
            }
            array[i][i] = 1.0d;
            for (int i3 = i; i3 < this.n; i3++) {
                if (this.QR[i][i] != 0.0d) {
                    double d = 0.0d;
                    for (int i4 = i; i4 < this.m; i4++) {
                        d += this.QR[i4][i] * array[i4][i3];
                    }
                    double d2 = (-d) / this.QR[i][i];
                    for (int i5 = i; i5 < this.m; i5++) {
                        double[] dArr = array[i5];
                        dArr[i3] = dArr[i3] + (this.QR[i5][i] * d2);
                    }
                }
            }
        }
        return matrix;
    }

    public Matrix getR() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca04e3de6fc5e1c2a13b530b962f7b51", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca04e3de6fc5e1c2a13b530b962f7b51");
        }
        Matrix matrix = new Matrix(this.n, this.n);
        double[][] array = matrix.getArray();
        for (int i = 0; i < this.n; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                if (i < i2) {
                    array[i][i2] = this.QR[i][i2];
                } else if (i == i2) {
                    array[i][i2] = this.Rdiag[i];
                } else {
                    array[i][i2] = 0.0d;
                }
            }
        }
        return matrix;
    }

    public boolean isFullRank() {
        for (int i = 0; i < this.n; i++) {
            if (this.Rdiag[i] == 0.0d) {
                return false;
            }
        }
        return true;
    }

    public Matrix solve(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "528e9a942a58c74de1fe2538bc392965", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "528e9a942a58c74de1fe2538bc392965");
        }
        if (matrix.getRowDimension() == this.m) {
            if (isFullRank()) {
                int columnDimension = matrix.getColumnDimension();
                double[][] arrayCopy = matrix.getArrayCopy();
                for (int i = 0; i < this.n; i++) {
                    for (int i2 = 0; i2 < columnDimension; i2++) {
                        double d = 0.0d;
                        for (int i3 = i; i3 < this.m; i3++) {
                            d += this.QR[i3][i] * arrayCopy[i3][i2];
                        }
                        double d2 = (-d) / this.QR[i][i];
                        for (int i4 = i; i4 < this.m; i4++) {
                            double[] dArr = arrayCopy[i4];
                            dArr[i2] = dArr[i2] + (this.QR[i4][i] * d2);
                        }
                    }
                }
                for (int i5 = this.n - 1; i5 >= 0; i5--) {
                    for (int i6 = 0; i6 < columnDimension; i6++) {
                        double[] dArr2 = arrayCopy[i5];
                        dArr2[i6] = dArr2[i6] / this.Rdiag[i5];
                    }
                    for (int i7 = 0; i7 < i5; i7++) {
                        for (int i8 = 0; i8 < columnDimension; i8++) {
                            double[] dArr3 = arrayCopy[i7];
                            dArr3[i8] = dArr3[i8] - (arrayCopy[i5][i8] * this.QR[i7][i5]);
                        }
                    }
                }
                return new Matrix(arrayCopy, this.n, columnDimension).getMatrix(0, this.n - 1, 0, columnDimension - 1);
            }
            throw new RuntimeException("Matrix is rank deficient.");
        }
        throw new IllegalArgumentException("Matrix row dimensions must agree.");
    }
}
