package android.support.constraint.solver;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a<T> {
        T a();

        void a(T[] tArr, int i);

        boolean a(T t);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b<T> implements a<T> {
        private final Object[] a = new Object[256];
        private int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(int i) {
        }

        @Override // android.support.constraint.solver.g.a
        public final T a() {
            if (this.b > 0) {
                int i = this.b - 1;
                T t = (T) this.a[i];
                this.a[i] = null;
                this.b--;
                return t;
            }
            return null;
        }

        @Override // android.support.constraint.solver.g.a
        public final boolean a(T t) {
            if (this.b < this.a.length) {
                this.a[this.b] = t;
                this.b++;
                return true;
            }
            return false;
        }

        @Override // android.support.constraint.solver.g.a
        public final void a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.b < this.a.length) {
                    this.a[this.b] = t;
                    this.b++;
                }
            }
        }
    }
}
