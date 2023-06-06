package com.airbnb.lottie;

import android.support.annotation.Nullable;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j<V> {
    @Nullable
    public final V a;
    @Nullable
    final Throwable b;

    public j(V v) {
        this.a = v;
        this.b = null;
    }

    public j(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.a == null || !this.a.equals(jVar.a)) {
                if (this.b == null || jVar.b == null) {
                    return false;
                }
                return this.b.toString().equals(this.b.toString());
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
