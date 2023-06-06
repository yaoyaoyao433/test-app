package com.google.zxing.common.reedsolomon;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    final a a;
    final int[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = aVar;
        int length = iArr.length;
        if (length > 1 && iArr[0] == 0) {
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            this.b = new int[length - i];
            System.arraycopy(iArr, i, this.b, 0, this.b.length);
            return;
        }
        this.b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.b[0] == 0;
    }

    private int a(int i) {
        return this.b[(this.b.length - 1) - i];
    }

    private b b(b bVar) {
        if (!this.a.equals(bVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (a()) {
            return bVar;
        }
        if (bVar.a()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = bVar.b;
        if (iArr.length > iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr2.length];
        int length = iArr2.length - iArr.length;
        System.arraycopy(iArr2, 0, iArr3, 0, length);
        for (int i = length; i < iArr2.length; i++) {
            iArr3[i] = a.a(iArr[i - length], iArr2[i]);
        }
        return new b(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final b a(int i, int i2) {
        if (i >= 0) {
            if (i2 != 0) {
                int length = this.b.length;
                int[] iArr = new int[i + length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = this.a.b(this.b[i3], i2);
                }
                return new b(this.a, iArr);
            }
            return this.a.k;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final b[] a(b bVar) {
        b bVar2;
        if (!this.a.equals(bVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.a()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b bVar3 = this.a.k;
        int a = bVar.a(bVar.b.length - 1);
        a aVar = this.a;
        if (a == 0) {
            throw new ArithmeticException();
        }
        int i = aVar.i[(aVar.l - aVar.j[a]) - 1];
        b bVar4 = bVar3;
        b bVar5 = this;
        while (bVar5.b.length - 1 >= bVar.b.length - 1 && !bVar5.a()) {
            int length = (bVar5.b.length - 1) - (bVar.b.length - 1);
            int b = this.a.b(bVar5.a(bVar5.b.length - 1), i);
            b a2 = bVar.a(length, b);
            a aVar2 = this.a;
            if (length >= 0) {
                if (b == 0) {
                    bVar2 = aVar2.k;
                } else {
                    int[] iArr = new int[length + 1];
                    iArr[0] = b;
                    bVar2 = new b(aVar2, iArr);
                }
                bVar4 = bVar4.b(bVar2);
                bVar5 = bVar5.b(a2);
            } else {
                throw new IllegalArgumentException();
            }
        }
        return new b[]{bVar4, bVar5};
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.b.length - 1) * 8);
        for (int length = this.b.length - 1; length >= 0; length--) {
            int a = a(length);
            if (a != 0) {
                if (a < 0) {
                    sb.append(" - ");
                    a = -a;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || a != 1) {
                    a aVar = this.a;
                    if (a == 0) {
                        throw new IllegalArgumentException();
                    }
                    int i = aVar.j[a];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
        return sb.toString();
    }
}
