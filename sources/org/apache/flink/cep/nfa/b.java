package org.apache.flink.cep.nfa;

import com.meituan.robust.common.CommonConstant;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 6170434818252267825L;
    private final int[] a;

    public b(int i) {
        this.a = new int[]{1};
    }

    public b(b bVar) {
        this.a = Arrays.copyOf(bVar.a, bVar.a.length);
    }

    private b(int[] iArr) {
        this.a = iArr;
    }

    public final b a(int i) {
        int[] copyOf = Arrays.copyOf(this.a, this.a.length);
        int length = this.a.length - 1;
        copyOf[length] = copyOf[length] + i;
        return new b(copyOf);
    }

    public final b a() {
        return new b(Arrays.copyOf(this.a, this.a.length + 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Arrays.equals(this.a, ((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.length - 1; i++) {
            sb.append(this.a[i]);
            sb.append(CommonConstant.Symbol.DOT);
        }
        if (this.a.length > 0) {
            sb.append(this.a[this.a.length - 1]);
        }
        return sb.toString();
    }

    public final boolean a(b bVar) {
        if (this.a.length > bVar.a.length) {
            for (int i = 0; i < bVar.a.length; i++) {
                if (bVar.a[i] != this.a[i]) {
                    return false;
                }
            }
            return true;
        } else if (this.a.length == bVar.a.length) {
            int length = this.a.length - 1;
            for (int i2 = 0; i2 < length; i2++) {
                if (bVar.a[i2] != this.a[i2]) {
                    return false;
                }
            }
            return this.a[length] >= bVar.a[length];
        } else {
            return false;
        }
    }
}
