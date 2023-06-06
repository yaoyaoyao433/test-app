package android.support.v4.util;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f, S s) {
        this.first = f;
        this.second = s;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return objectsEqual(pair.first, this.first) && objectsEqual(pair.second, this.second);
        }
        return false;
    }

    private static boolean objectsEqual(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        return (this.first == null ? 0 : this.first.hashCode()) ^ (this.second != null ? this.second.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.first) + StringUtil.SPACE + String.valueOf(this.second) + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    public static <A, B> Pair<A, B> create(A a, B b) {
        return new Pair<>(a, b);
    }
}
