package com.tencent.open.utils;

import android.support.v4.view.MotionEventCompat;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m implements Cloneable {
    private int a;

    public m(byte[] bArr) {
        this(bArr, 0);
    }

    public m(byte[] bArr, int i) {
        this.a = (bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        this.a += bArr[i] & 255;
    }

    public m(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof m) && this.a == ((m) obj).b();
    }

    public final byte[] a() {
        return new byte[]{(byte) (this.a & 255), (byte) ((this.a & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8)};
    }

    public final int b() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
