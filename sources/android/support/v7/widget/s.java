package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class s {
    final b a;
    final a b = new a();
    final List<View> c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        int a();

        int a(View view);

        void a(int i);

        void a(View view, int i);

        void a(View view, int i, ViewGroup.LayoutParams layoutParams);

        RecyclerView.s b(View view);

        View b(int i);

        void b();

        void c(int i);

        void c(View view);

        void d(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(b bVar) {
        this.a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        this.c.add(view);
        this.a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view) {
        if (this.c.remove(view)) {
            this.a.d(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(View view, int i, boolean z) {
        int e;
        if (i < 0) {
            e = this.a.a();
        } else {
            e = e(i);
        }
        this.b.a(e, z);
        if (z) {
            a(view);
        }
        this.a.a(view, e);
    }

    private int e(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = this.a.a();
        int i2 = i;
        while (i2 < a2) {
            int e = i - (i2 - this.b.e(i2));
            if (e == 0) {
                while (this.b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        int e = e(i);
        View b2 = this.a.b(e);
        if (b2 == null) {
            return;
        }
        if (this.b.d(e)) {
            b(b2);
        }
        this.a.a(e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View b(int i) {
        return this.a.b(e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int e;
        if (i < 0) {
            e = this.a.a();
        } else {
            e = e(i);
        }
        this.b.a(e, z);
        if (z) {
            a(view);
        }
        this.a.a(view, e, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a.a() - this.c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View c(int i) {
        return this.a.b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i) {
        int e = e(i);
        this.b.d(e);
        this.a.c(e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(View view) {
        int a2 = this.a.a(view);
        if (a2 == -1 || this.b.c(a2)) {
            return -1;
        }
        return a2 - this.b.e(a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        long a = 0;
        a b;

        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(int i) {
            if (i >= 64) {
                b();
                this.b.a(i - 64);
                return;
            }
            this.a |= 1 << i;
        }

        private void b() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void b(int i) {
            if (i >= 64) {
                if (this.b != null) {
                    this.b.b(i - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean c(int i) {
            a aVar = this;
            while (i >= 64) {
                aVar.b();
                aVar = aVar.b;
                i -= 64;
            }
            return (aVar.a & (1 << i)) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a() {
            a aVar = this;
            while (true) {
                aVar.a = 0L;
                if (aVar.b == null) {
                    return;
                }
                aVar = aVar.b;
            }
        }

        final void a(int i, boolean z) {
            boolean z2 = z;
            a aVar = this;
            while (i < 64) {
                boolean z3 = (aVar.a & Long.MIN_VALUE) != 0;
                long j = (1 << i) - 1;
                aVar.a = (aVar.a & j) | (((~j) & aVar.a) << 1);
                if (z2) {
                    aVar.a(i);
                } else {
                    aVar.b(i);
                }
                if (!z3 && aVar.b == null) {
                    return;
                }
                aVar.b();
                aVar = aVar.b;
                z2 = z3;
                i = 0;
            }
            aVar.b();
            aVar.b.a(i - 64, z2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean d(int i) {
            a aVar = this;
            while (i >= 64) {
                aVar.b();
                aVar = aVar.b;
                i -= 64;
            }
            long j = 1 << i;
            boolean z = (aVar.a & j) != 0;
            aVar.a &= ~j;
            long j2 = j - 1;
            aVar.a = (aVar.a & j2) | Long.rotateRight((~j2) & aVar.a, 1);
            if (aVar.b != null) {
                if (aVar.b.c(0)) {
                    aVar.a(63);
                }
                aVar.b.d(0);
            }
            return z;
        }

        final int e(int i) {
            if (this.b == null) {
                if (i >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else {
                return this.b.e(i - 64) + Long.bitCount(this.a);
            }
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }
}
