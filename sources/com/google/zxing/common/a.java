package com.google.zxing.common;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.common.CommonConstant;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements Cloneable {
    public int[] a;
    public int b;

    public a() {
        this.b = 0;
        this.a = new int[1];
    }

    private a(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    public final int a() {
        return (this.b + 7) / 8;
    }

    private void b(int i) {
        if (i > this.a.length * 32) {
            int[] iArr = new int[(i + 31) / 32];
            System.arraycopy(this.a, 0, iArr, 0, this.a.length);
            this.a = iArr;
        }
    }

    public final boolean a(int i) {
        return ((1 << (i & 31)) & this.a[i / 32]) != 0;
    }

    public final void a(boolean z) {
        b(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b / 32;
            iArr[i] = iArr[i] | (1 << (this.b & 31));
        }
        this.b++;
    }

    public final void a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        b(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final void a(a aVar) {
        int i = aVar.b;
        b(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(aVar.a(i2));
        }
    }

    public final void a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < 8; i8++) {
                if (a(i6)) {
                    i7 |= 1 << (7 - i8);
                }
                i6++;
            }
            bArr[i5 + 0] = (byte) i7;
            i5++;
            i4 = i6;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.b == aVar.b && Arrays.equals(this.a, aVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        for (int i = 0; i < this.b; i++) {
            if ((i & 7) == 0) {
                sb.append(Constants.SPACE);
            }
            sb.append(a(i) ? 'X' : CommonConstant.Symbol.DOT_CHAR);
        }
        return sb.toString();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new a((int[]) this.a.clone(), this.b);
    }
}
