package com.meituan.android.common.locate.fusionlocation.matrix;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
/* loaded from: classes2.dex */
public class Matrix implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    private double[][] A;
    private int m;
    private int n;

    public Matrix(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10fcb53150949c95399eb370f03c92da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10fcb53150949c95399eb370f03c92da");
            return;
        }
        this.m = i;
        this.n = i2;
        this.A = (double[][]) Array.newInstance(double.class, i, i2);
    }

    public Matrix(int i, int i2, double d) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95dce3244d9122e7d3d6ebc66ed76d5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95dce3244d9122e7d3d6ebc66ed76d5a");
            return;
        }
        this.m = i;
        this.n = i2;
        this.A = (double[][]) Array.newInstance(double.class, i, i2);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                this.A[i3][i4] = d;
            }
        }
    }

    public Matrix(double[] dArr, int i) {
        Object[] objArr = {dArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95abef46f9126dc0b770ed6adb5ead89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95abef46f9126dc0b770ed6adb5ead89");
            return;
        }
        this.m = i;
        this.n = i != 0 ? dArr.length / i : 0;
        if (this.n * i != dArr.length) {
            throw new IllegalArgumentException("Array length must be a multiple of m.");
        }
        this.A = (double[][]) Array.newInstance(double.class, i, this.n);
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < this.n; i3++) {
                this.A[i2][i3] = dArr[(i3 * i) + i2];
            }
        }
    }

    public Matrix(double[][] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02ae32dcb990d4620e44678511df4072", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02ae32dcb990d4620e44678511df4072");
            return;
        }
        this.m = dArr.length;
        this.n = dArr[0].length;
        for (int i = 0; i < this.m; i++) {
            if (dArr[i].length != this.n) {
                throw new IllegalArgumentException("All rows must have the same length.");
            }
        }
        this.A = dArr;
    }

    public Matrix(double[][] dArr, int i, int i2) {
        Object[] objArr = {dArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aa06b28b5c1d3e7d98a07b9c3258eac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aa06b28b5c1d3e7d98a07b9c3258eac");
            return;
        }
        this.A = dArr;
        this.m = i;
        this.n = i2;
    }

    private void checkMatrixDimensions(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d63fc8407b033ef7cb789461149918ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d63fc8407b033ef7cb789461149918ac");
        } else if (matrix.m != this.m || matrix.n != this.n) {
            throw new IllegalArgumentException("Matrix dimensions must agree.");
        }
    }

    public static Matrix identity(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6631e347a9ca644e100a571fff19b613", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6631e347a9ca644e100a571fff19b613");
        }
        Matrix matrix = new Matrix(i, i2);
        double[][] array = matrix.getArray();
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                array[i3][i4] = i3 == i4 ? 1.0d : 0.0d;
                i4++;
            }
            i3++;
        }
        return matrix;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
        if (r5 < r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
        throw new java.io.IOException("Row " + r12.size() + " is too short.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.android.common.locate.fusionlocation.matrix.Matrix read(java.io.BufferedReader r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.fusionlocation.matrix.Matrix.read(java.io.BufferedReader):com.meituan.android.common.locate.fusionlocation.matrix.Matrix");
    }

    public Matrix copy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f914221c5d9caba9e3e8af5fbc0175f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f914221c5d9caba9e3e8af5fbc0175f");
        }
        Matrix matrix = new Matrix(this.m, this.n);
        double[][] array = matrix.getArray();
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                array[i][i2] = this.A[i][i2];
            }
        }
        return matrix;
    }

    public double get(int i, int i2) {
        return this.A[i][i2];
    }

    public double[][] getArray() {
        return this.A;
    }

    public double[][] getArrayCopy() {
        double[][] dArr = (double[][]) Array.newInstance(double.class, this.m, this.n);
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                dArr[i][i2] = this.A[i][i2];
            }
        }
        return dArr;
    }

    public int getColumnDimension() {
        return this.n;
    }

    public Matrix getMatrix(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a157837d32b6d8d2f11dc32c6b833e7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a157837d32b6d8d2f11dc32c6b833e7f");
        }
        Matrix matrix = new Matrix((i2 - i) + 1, (i4 - i3) + 1);
        double[][] array = matrix.getArray();
        for (int i5 = i; i5 <= i2; i5++) {
            for (int i6 = i3; i6 <= i4; i6++) {
                try {
                    array[i5 - i][i6 - i3] = this.A[i5][i6];
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Submatrix indices");
                }
            }
        }
        return matrix;
    }

    public Matrix getMatrix(int i, int i2, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7588cfb0ccc6d9f17b46e98570bdbb1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7588cfb0ccc6d9f17b46e98570bdbb1a");
        }
        Matrix matrix = new Matrix((i2 - i) + 1, iArr.length);
        double[][] array = matrix.getArray();
        for (int i3 = i; i3 <= i2; i3++) {
            for (int i4 = 0; i4 < iArr.length; i4++) {
                try {
                    array[i3 - i][i4] = this.A[i3][iArr[i4]];
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Submatrix indices");
                }
            }
        }
        return matrix;
    }

    public Matrix getMatrix(int[] iArr, int i, int i2) {
        Object[] objArr = {iArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51f9cb4a19fcef2cf7d6ee4ba67ebcf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51f9cb4a19fcef2cf7d6ee4ba67ebcf3");
        }
        Matrix matrix = new Matrix(iArr.length, (i2 - i) + 1);
        double[][] array = matrix.getArray();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            try {
                for (int i4 = i; i4 <= i2; i4++) {
                    array[i3][i4 - i] = this.A[iArr[i3]][i4];
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Submatrix indices");
            }
        }
        return matrix;
    }

    public Matrix getMatrix(int[] iArr, int[] iArr2) {
        Object[] objArr = {iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84d875f8aac03cd07530a7907d47c2ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84d875f8aac03cd07530a7907d47c2ca");
        }
        Matrix matrix = new Matrix(iArr.length, iArr2.length);
        double[][] array = matrix.getArray();
        for (int i = 0; i < iArr.length; i++) {
            try {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    array[i][i2] = this.A[iArr[i]][iArr2[i2]];
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Submatrix indices");
            }
        }
        return matrix;
    }

    public int getRowDimension() {
        return this.m;
    }

    public Matrix inverse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8551603c8b666602da2b1bdf41cec669", RobustBitConfig.DEFAULT_VALUE) ? (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8551603c8b666602da2b1bdf41cec669") : solve(identity(this.m, this.m));
    }

    public Matrix minus(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f910f654edbb8cb84f9d726dc2896cb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f910f654edbb8cb84f9d726dc2896cb6");
        }
        checkMatrixDimensions(matrix);
        Matrix matrix2 = new Matrix(this.m, this.n);
        double[][] array = matrix2.getArray();
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                array[i][i2] = this.A[i][i2] - matrix.A[i][i2];
            }
        }
        return matrix2;
    }

    public Matrix minusEquals(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "786277296e78bf6c8efd54140f991fce", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "786277296e78bf6c8efd54140f991fce");
        }
        checkMatrixDimensions(matrix);
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                double[] dArr = this.A[i];
                dArr[i2] = dArr[i2] - matrix.A[i][i2];
            }
        }
        return this;
    }

    public Matrix plus(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a95f6d739bf735d8fd4cc7c5fe45be2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a95f6d739bf735d8fd4cc7c5fe45be2");
        }
        checkMatrixDimensions(matrix);
        Matrix matrix2 = new Matrix(this.m, this.n);
        double[][] array = matrix2.getArray();
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                array[i][i2] = this.A[i][i2] + matrix.A[i][i2];
            }
        }
        return matrix2;
    }

    public Matrix plusEquals(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b765b7f1bc674286d831a86d358de0b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b765b7f1bc674286d831a86d358de0b7");
        }
        checkMatrixDimensions(matrix);
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                double[] dArr = this.A[i];
                dArr[i2] = dArr[i2] + matrix.A[i][i2];
            }
        }
        return this;
    }

    public void print(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c88cd9fcda50e1a19089641761acd68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c88cd9fcda50e1a19089641761acd68c");
        } else {
            print(new PrintWriter((OutputStream) System.out, true), i, i2);
        }
    }

    public void print(PrintWriter printWriter, int i, int i2) {
        Object[] objArr = {printWriter, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd24cac795d70eb400bb6e1aecf57362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd24cac795d70eb400bb6e1aecf57362");
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
        decimalFormat.setMinimumIntegerDigits(1);
        decimalFormat.setMaximumFractionDigits(i2);
        decimalFormat.setMinimumFractionDigits(i2);
        decimalFormat.setGroupingUsed(false);
        print(printWriter, decimalFormat, i + 2);
    }

    public void print(PrintWriter printWriter, NumberFormat numberFormat, int i) {
        Object[] objArr = {printWriter, numberFormat, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d972425d4e4687e8f9dd6f1d9e9a191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d972425d4e4687e8f9dd6f1d9e9a191");
            return;
        }
        printWriter.println();
        for (int i2 = 0; i2 < this.m; i2++) {
            for (int i3 = 0; i3 < this.n; i3++) {
                String format = numberFormat.format(this.A[i2][i3]);
                int max = Math.max(1, i - format.length());
                for (int i4 = 0; i4 < max; i4++) {
                    printWriter.print(Constants.SPACE);
                }
                printWriter.print(format);
            }
            printWriter.println();
        }
        printWriter.println();
    }

    public void print(NumberFormat numberFormat, int i) {
        Object[] objArr = {numberFormat, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab5da6b8f550173021190a387a85f43d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab5da6b8f550173021190a387a85f43d");
        } else {
            print(new PrintWriter((OutputStream) System.out, true), numberFormat, i);
        }
    }

    public void set(int i, int i2, double d) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c81358d868d46c4dcc22ece93c633381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c81358d868d46c4dcc22ece93c633381");
        } else {
            this.A[i][i2] = d;
        }
    }

    public void setMatrix(int i, int i2, int i3, int i4, Matrix matrix) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f484b26ec6271209a5301067b6e3ca37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f484b26ec6271209a5301067b6e3ca37");
            return;
        }
        for (int i5 = i; i5 <= i2; i5++) {
            for (int i6 = i3; i6 <= i4; i6++) {
                try {
                    this.A[i5][i6] = matrix.get(i5 - i, i6 - i3);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Submatrix indices");
                }
            }
        }
    }

    public void setMatrix(int i, int i2, int[] iArr, Matrix matrix) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "755327e828b9472adce1f952d8d10c05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "755327e828b9472adce1f952d8d10c05");
            return;
        }
        for (int i3 = i; i3 <= i2; i3++) {
            for (int i4 = 0; i4 < iArr.length; i4++) {
                try {
                    this.A[i3][iArr[i4]] = matrix.get(i3 - i, i4);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Submatrix indices");
                }
            }
        }
    }

    public void setMatrix(int[] iArr, int i, int i2, Matrix matrix) {
        Object[] objArr = {iArr, Integer.valueOf(i), Integer.valueOf(i2), matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45dbec693876bb0e77fdd85db891d50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45dbec693876bb0e77fdd85db891d50a");
            return;
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            try {
                for (int i4 = i; i4 <= i2; i4++) {
                    this.A[iArr[i3]][i4] = matrix.get(i3, i4 - i);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Submatrix indices");
            }
        }
    }

    public void setMatrix(int[] iArr, int[] iArr2, Matrix matrix) {
        Object[] objArr = {iArr, iArr2, matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4f26d40e1f5cd1e43f613cdaf84eb00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4f26d40e1f5cd1e43f613cdaf84eb00");
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            try {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    this.A[iArr[i]][iArr2[i2]] = matrix.get(i, i2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Submatrix indices");
            }
        }
    }

    public Matrix solve(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f03abc5c7378114ebab654d2bb8bdf0", RobustBitConfig.DEFAULT_VALUE) ? (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f03abc5c7378114ebab654d2bb8bdf0") : this.m == this.n ? new LUDecomposition(this).solve(matrix) : new QRDecomposition(this).solve(matrix);
    }

    public Matrix times(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b42862be13b6a15116ecf83829e2fa5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b42862be13b6a15116ecf83829e2fa5");
        }
        Matrix matrix = new Matrix(this.m, this.n);
        double[][] array = matrix.getArray();
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                array[i][i2] = this.A[i][i2] * d;
            }
        }
        return matrix;
    }

    public Matrix times(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b40c31af52e1239e9e36dff3870e738a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b40c31af52e1239e9e36dff3870e738a");
        }
        if (matrix.m == this.n) {
            Matrix matrix2 = new Matrix(this.m, matrix.n);
            double[][] array = matrix2.getArray();
            double[] dArr = new double[this.n];
            for (int i = 0; i < matrix.n; i++) {
                for (int i2 = 0; i2 < this.n; i2++) {
                    dArr[i2] = matrix.A[i2][i];
                }
                for (int i3 = 0; i3 < this.m; i3++) {
                    double[] dArr2 = this.A[i3];
                    double d = 0.0d;
                    for (int i4 = 0; i4 < this.n; i4++) {
                        d += dArr2[i4] * dArr[i4];
                    }
                    array[i3][i] = d;
                }
            }
            return matrix2;
        }
        throw new IllegalArgumentException("Matrix inner dimensions must agree.");
    }

    public Matrix timesEquals(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "577a4811e8a3ae2876dd39fbf0ef454b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "577a4811e8a3ae2876dd39fbf0ef454b");
        }
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                this.A[i][i2] = this.A[i][i2] * d;
            }
        }
        return this;
    }

    public double trace() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e03f896b92bed77b9317b3acc42060b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e03f896b92bed77b9317b3acc42060b")).doubleValue();
        }
        double d = 0.0d;
        for (int i = 0; i < Math.min(this.m, this.n); i++) {
            d += this.A[i][i];
        }
        return d;
    }

    public Matrix transpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f966c7cd988f139f06002a675c02cd27", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f966c7cd988f139f06002a675c02cd27");
        }
        Matrix matrix = new Matrix(this.n, this.m);
        double[][] array = matrix.getArray();
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                array[i2][i] = this.A[i][i2];
            }
        }
        return matrix;
    }

    public Matrix uminus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "548916137b4b8dcf4be491662e67454a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "548916137b4b8dcf4be491662e67454a");
        }
        Matrix matrix = new Matrix(this.m, this.n);
        double[][] array = matrix.getArray();
        for (int i = 0; i < this.m; i++) {
            for (int i2 = 0; i2 < this.n; i2++) {
                array[i][i2] = -this.A[i][i2];
            }
        }
        return matrix;
    }
}
