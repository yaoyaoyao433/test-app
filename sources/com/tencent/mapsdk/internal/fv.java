package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.fv.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fv<T extends a> {
    private static final int c = 50;
    private static final int e = 40;
    private final fl a;
    private final int b;
    private Set<T> d;
    private List<fv<T>> f;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        fm a();
    }

    private fv(double d, double d2, double d3, double d4) {
        this(new fl(d, d2, d3, d4));
    }

    public fv(fl flVar) {
        this(flVar, 0);
    }

    private fv(double d, double d2, double d3, double d4, int i) {
        this(new fl(d, d2, d3, d4), i);
    }

    private fv(fl flVar, int i) {
        this.f = null;
        this.a = flVar;
        this.b = i;
    }

    public final void a(T t) {
        fm a2 = t.a();
        if (this.a.a(a2.a, a2.b)) {
            a(a2.a, a2.b, t);
        }
    }

    private void a(double d, double d2, T t) {
        fv<T> fvVar = this;
        while (fvVar.f != null) {
            if (d2 < fvVar.a.f) {
                if (d < fvVar.a.e) {
                    fvVar = fvVar.f.get(0);
                } else {
                    fvVar = fvVar.f.get(1);
                }
            } else if (d < fvVar.a.e) {
                fvVar = fvVar.f.get(2);
            } else {
                fvVar = fvVar.f.get(3);
            }
        }
        if (fvVar.d == null) {
            fvVar.d = new HashSet();
        }
        fvVar.d.add(t);
        if (fvVar.d.size() <= 50 || fvVar.b >= 40) {
            return;
        }
        fvVar.a();
    }

    private void a() {
        this.f = new ArrayList(4);
        this.f.add(new fv<>(this.a.a, this.a.e, this.a.b, this.a.f, this.b + 1));
        this.f.add(new fv<>(this.a.e, this.a.c, this.a.b, this.a.f, this.b + 1));
        this.f.add(new fv<>(this.a.a, this.a.e, this.a.f, this.a.d, this.b + 1));
        this.f.add(new fv<>(this.a.e, this.a.c, this.a.f, this.a.d, this.b + 1));
        Set<T> set = this.d;
        this.d = null;
        for (T t : set) {
            a(t.a().a, t.a().b, t);
        }
    }

    private boolean b(T t) {
        fm a2 = t.a();
        if (this.a.a(a2.a, a2.b)) {
            double d = a2.a;
            double d2 = a2.b;
            fv<T> fvVar = this;
            while (fvVar.f != null) {
                if (d2 < fvVar.a.f) {
                    if (d < fvVar.a.e) {
                        fvVar = fvVar.f.get(0);
                    } else {
                        fvVar = fvVar.f.get(1);
                    }
                } else if (d < fvVar.a.e) {
                    fvVar = fvVar.f.get(2);
                } else {
                    fvVar = fvVar.f.get(3);
                }
            }
            if (fvVar.d == null) {
                return false;
            }
            return fvVar.d.remove(t);
        }
        return false;
    }

    private boolean b(double d, double d2, T t) {
        fv<T> fvVar = this;
        while (fvVar.f != null) {
            if (d2 < fvVar.a.f) {
                if (d < fvVar.a.e) {
                    fvVar = fvVar.f.get(0);
                } else {
                    fvVar = fvVar.f.get(1);
                }
            } else if (d < fvVar.a.e) {
                fvVar = fvVar.f.get(2);
            } else {
                fvVar = fvVar.f.get(3);
            }
        }
        if (fvVar.d == null) {
            return false;
        }
        return fvVar.d.remove(t);
    }

    private void b() {
        this.f = null;
        if (this.d != null) {
            this.d.clear();
        }
    }

    public final Collection<T> a(fl flVar) {
        ArrayList arrayList = new ArrayList();
        a(flVar, arrayList);
        return arrayList;
    }

    private void a(fl flVar, Collection<T> collection) {
        if (this.a.a(flVar)) {
            if (this.f != null) {
                for (fv<T> fvVar : this.f) {
                    fvVar.a(flVar, collection);
                }
            } else if (this.d != null) {
                fl flVar2 = this.a;
                if (flVar2.a >= flVar.a && flVar2.c <= flVar.c && flVar2.b >= flVar.b && flVar2.d <= flVar.d) {
                    collection.addAll(this.d);
                    return;
                }
                for (T t : this.d) {
                    fm a2 = t.a();
                    if (flVar.a(a2.a, a2.b)) {
                        collection.add(t);
                    }
                }
            }
        }
    }
}
