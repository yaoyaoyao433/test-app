package rx;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c<T> {
    private static final c<Void> d = new c<>(a.OnCompleted, null, null);
    public final a a;
    public final Throwable b;
    private final T c;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum a {
        OnNext,
        OnError,
        OnCompleted
    }

    public static <T> c<T> a(T t) {
        return new c<>(a.OnNext, null, null);
    }

    public static <T> c<T> a(Throwable th) {
        return new c<>(a.OnError, null, th);
    }

    public static <T> c<T> a() {
        return (c<T>) d;
    }

    private c(a aVar, T t, Throwable th) {
        this.c = t;
        this.b = th;
        this.a = aVar;
    }

    private boolean d() {
        return b() && this.b != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(super.toString());
        sb.append(StringUtil.SPACE);
        sb.append(this.a);
        if (c()) {
            sb.append(StringUtil.SPACE);
            sb.append(this.c);
        }
        if (d()) {
            sb.append(StringUtil.SPACE);
            sb.append(this.b.getMessage());
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.a != this.a) {
            return false;
        }
        if (!c() || this.c.equals(cVar.c)) {
            if (!d() || this.b.equals(cVar.b)) {
                if (c() || d() || !cVar.c()) {
                    return c() || d() || !cVar.d();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private boolean c() {
        return (this.a == a.OnNext) && this.c != null;
    }

    public final boolean b() {
        return this.a == a.OnError;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        if (c()) {
            hashCode = (hashCode * 31) + this.c.hashCode();
        }
        return d() ? (hashCode * 31) + this.b.hashCode() : hashCode;
    }
}
