package android.support.constraint.solver.widgets;

import android.support.constraint.solver.h;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    final f b;
    final c c;
    public e d;
    public android.support.constraint.solver.h i;
    public m a = new m(this);
    public int e = 0;
    int f = -1;
    int g = b.a;
    private int j = a.a;
    int h = 0;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {a, b};
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {a, b, c};
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public e(f fVar, c cVar) {
        this.b = fVar;
        this.c = cVar;
    }

    public final void a(android.support.constraint.solver.c cVar) {
        if (this.i == null) {
            this.i = new android.support.constraint.solver.h(h.a.a, null);
        } else {
            this.i.b();
        }
    }

    public final int a() {
        if (this.b.ab == 8) {
            return 0;
        }
        if (this.f >= 0 && this.d != null && this.d.b.ab == 8) {
            return this.f;
        }
        return this.e;
    }

    public final void b() {
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = b.b;
        this.h = 0;
        this.j = a.a;
        this.a.b();
    }

    public final boolean a(e eVar, int i, int i2, int i3, int i4, boolean z) {
        if (eVar == null) {
            this.d = null;
            this.e = 0;
            this.f = -1;
            this.g = b.a;
            this.h = 2;
            return true;
        } else if (z || a(eVar)) {
            this.d = eVar;
            if (i > 0) {
                this.e = i;
            } else {
                this.e = 0;
            }
            this.f = i2;
            this.g = i3;
            this.h = i4;
            return true;
        } else {
            return false;
        }
    }

    public final boolean c() {
        return this.d != null;
    }

    public final String toString() {
        return this.b.ac + CommonConstant.Symbol.COLON + this.c.toString();
    }

    private boolean a(e eVar) {
        if (eVar == null) {
            return false;
        }
        c cVar = eVar.c;
        if (cVar == this.c) {
            return this.c != c.BASELINE || (eVar.b.u() && this.b.u());
        }
        switch (this.c) {
            case CENTER:
                return (cVar == c.BASELINE || cVar == c.CENTER_X || cVar == c.CENTER_Y) ? false : true;
            case LEFT:
            case RIGHT:
                boolean z = cVar == c.LEFT || cVar == c.RIGHT;
                return eVar.b instanceof i ? z || cVar == c.CENTER_X : z;
            case TOP:
            case BOTTOM:
                boolean z2 = cVar == c.TOP || cVar == c.BOTTOM;
                return eVar.b instanceof i ? z2 || cVar == c.CENTER_Y : z2;
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return false;
            default:
                throw new AssertionError(this.c.name());
        }
    }
}
