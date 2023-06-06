package com.airbnb.lottie.model;

import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.util.Pair;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class h<T> {
    @Nullable
    public T a;
    @Nullable
    public T b;

    public final boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return a(pair.first, this.a) && a(pair.second, this.b);
        }
        return false;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return (this.a == null ? 0 : this.a.hashCode()) ^ (this.b != null ? this.b.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.a) + StringUtil.SPACE + String.valueOf(this.b) + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
