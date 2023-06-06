package android.support.v7.widget;

import android.support.v4.util.Pools;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ah;
import com.meituan.metrics.traffic.trace.TraceSQLHelper;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements ah.a {
    final ArrayList<b> a;
    final ArrayList<b> b;
    final a c;
    Runnable d;
    final boolean e;
    final ah f;
    int g;
    private Pools.Pool<b> h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        RecyclerView.s a(int i);

        void a(int i, int i2);

        void a(int i, int i2, Object obj);

        void a(b bVar);

        void b(int i, int i2);

        void b(b bVar);

        void c(int i, int i2);

        void d(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar) {
        this(aVar, false);
    }

    private d(a aVar, boolean z) {
        this.h = new Pools.SimplePool(30);
        this.a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.g = 0;
        this.c = aVar;
        this.e = false;
        this.f = new ah(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        a(this.a);
        a(this.b);
        this.g = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0006 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.d.b():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.c.b(this.b.get(i));
        }
        a(this.b);
        this.g = 0;
    }

    private void b(b bVar) {
        int i;
        if (bVar.a == 1 || bVar.a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(bVar.b, bVar.a);
        int i2 = bVar.b;
        int i3 = bVar.a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i = 1;
        }
        int i4 = b2;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.d; i7++) {
            int b3 = b(bVar.b + (i * i7), bVar.a);
            int i8 = bVar.a;
            if (i8 == 2 ? b3 == i4 : i8 == 4 && b3 == i4 + 1) {
                i6++;
            } else {
                b a2 = a(bVar.a, i4, i6, bVar.c);
                a(a2, i5);
                a(a2);
                if (bVar.a == 4) {
                    i5 += i6;
                }
                i4 = b3;
                i6 = 1;
            }
        }
        Object obj = bVar.c;
        a(bVar);
        if (i6 > 0) {
            b a3 = a(bVar.a, i4, i6, obj);
            a(a3, i5);
            a(a3);
        }
    }

    private void a(b bVar, int i) {
        this.c.a(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            this.c.a(i, bVar.d);
        } else if (i2 == 4) {
            this.c.a(i, bVar.d, bVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int b(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            b bVar = this.b.get(size);
            if (bVar.a == 8) {
                if (bVar.b < bVar.d) {
                    i3 = bVar.b;
                    i4 = bVar.d;
                } else {
                    i3 = bVar.d;
                    i4 = bVar.b;
                }
                if (i >= i3 && i <= i4) {
                    if (i3 == bVar.b) {
                        if (i2 == 1) {
                            bVar.d++;
                        } else if (i2 == 2) {
                            bVar.d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.b++;
                        } else if (i2 == 2) {
                            bVar.b--;
                        }
                        i--;
                    }
                } else if (i < bVar.b) {
                    if (i2 == 1) {
                        bVar.b++;
                        bVar.d++;
                    } else if (i2 == 2) {
                        bVar.b--;
                        bVar.d--;
                    }
                }
            } else if (bVar.b <= i) {
                if (bVar.a == 1) {
                    i -= bVar.d;
                } else if (bVar.a == 2) {
                    i += bVar.d;
                }
            } else if (i2 == 1) {
                bVar.b++;
            } else if (i2 == 2) {
                bVar.b--;
            }
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.b.get(size2);
            if (bVar2.a == 8) {
                if (bVar2.d == bVar2.b || bVar2.d < 0) {
                    this.b.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.b.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    private boolean c(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            if (bVar.a == 8) {
                if (a(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.a == 1) {
                int i3 = bVar.b + bVar.d;
                for (int i4 = bVar.b; i4 < i3; i4++) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void c(b bVar) {
        this.b.add(bVar);
        int i = bVar.a;
        if (i == 4) {
            this.c.a(bVar.b, bVar.d, bVar.c);
        } else if (i != 8) {
            switch (i) {
                case 1:
                    this.c.c(bVar.b, bVar.d);
                    return;
                case 2:
                    this.c.b(bVar.b, bVar.d);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
            }
        } else {
            this.c.d(bVar.b, bVar.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.a.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i) {
        return (i & this.g) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        return a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            b bVar = this.b.get(i2);
            if (bVar.a == 8) {
                if (bVar.b == i) {
                    i = bVar.d;
                } else {
                    if (bVar.b < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else if (bVar.b > i) {
                continue;
            } else if (bVar.a == 2) {
                if (i < bVar.b + bVar.d) {
                    return -1;
                }
                i -= bVar.d;
            } else if (bVar.a == 1) {
                i += bVar.d;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.a.get(i);
            int i2 = bVar.a;
            if (i2 == 4) {
                this.c.b(bVar);
                this.c.a(bVar.b, bVar.d, bVar.c);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.c.b(bVar);
                        this.c.c(bVar.b, bVar.d);
                        break;
                    case 2:
                        this.c.b(bVar);
                        this.c.a(bVar.b, bVar.d);
                        break;
                }
            } else {
                this.c.b(bVar);
                this.c.d(bVar.b, bVar.d);
            }
            if (this.d != null) {
                this.d.run();
            }
        }
        a(this.a);
        this.g = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        int a;
        int b;
        Object c;
        int d;

        b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            if (i == 4) {
                str = TraceSQLHelper.KEY_UP;
            } else if (i != 8) {
                switch (i) {
                    case 1:
                        str = "add";
                        break;
                    case 2:
                        str = "rm";
                        break;
                    default:
                        str = "??";
                        break;
                }
            } else {
                str = "mv";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a) {
                return false;
            }
            if (this.a == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d == bVar.d && this.b == bVar.b) {
                if (this.c != null) {
                    if (!this.c.equals(bVar.c)) {
                        return false;
                    }
                } else if (bVar.c != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }
    }

    @Override // android.support.v7.widget.ah.a
    public final b a(int i, int i2, int i3, Object obj) {
        b acquire = this.h.acquire();
        if (acquire == null) {
            return new b(i, i2, i3, obj);
        }
        acquire.a = i;
        acquire.b = i2;
        acquire.d = i3;
        acquire.c = obj;
        return acquire;
    }

    @Override // android.support.v7.widget.ah.a
    public final void a(b bVar) {
        if (this.e) {
            return;
        }
        bVar.c = null;
        this.h.release(bVar);
    }

    private void a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }
}
