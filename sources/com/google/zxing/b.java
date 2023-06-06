package com.google.zxing;

import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public final int a;
    public final int b;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 32713) + this.b;
    }

    public final String toString() {
        return this.a + Constants.GestureMoveEvent.KEY_X + this.b;
    }
}
