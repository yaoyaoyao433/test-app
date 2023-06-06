package android.support.v7.util;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements c {
    final c a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public a(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        if (this.b == 0) {
            return;
        }
        switch (this.b) {
            case 1:
                this.a.onInserted(this.c, this.d);
                break;
            case 2:
                this.a.onRemoved(this.c, this.d);
                break;
            case 3:
                this.a.onChanged(this.c, this.d, this.e);
                break;
        }
        this.e = null;
        this.b = 0;
    }

    @Override // android.support.v7.util.c
    public final void onInserted(int i, int i2) {
        if (this.b == 1 && i >= this.c && i <= this.c + this.d) {
            this.d += i2;
            this.c = Math.min(i, this.c);
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // android.support.v7.util.c
    public final void onRemoved(int i, int i2) {
        if (this.b == 2 && this.c >= i && this.c <= i + i2) {
            this.d += i2;
            this.c = i;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 2;
    }

    @Override // android.support.v7.util.c
    public final void onMoved(int i, int i2) {
        a();
        this.a.onMoved(i, i2);
    }

    @Override // android.support.v7.util.c
    public final void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.b == 3 && i <= this.c + this.d && (i3 = i + i2) >= this.c && this.e == obj) {
            int i4 = this.c + this.d;
            this.c = Math.min(i, this.c);
            this.d = Math.max(i4, i3) - this.c;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }
}
