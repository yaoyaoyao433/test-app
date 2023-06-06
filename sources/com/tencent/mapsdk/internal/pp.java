package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pp implements et {
    private ArrayList<et> a = new ArrayList<>();

    public final synchronized void a(et etVar) {
        if (etVar != null) {
            if (!this.a.contains(etVar)) {
                this.a.add(etVar);
            }
        }
    }

    public final synchronized void b(et etVar) {
        this.a.remove(etVar);
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean a(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).a(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean b(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).b(f, f2)) {
                return true;
            }
        }
        kj.a("notify onSingleTap");
        for (int size2 = this.a.size() - 1; size2 >= 0; size2--) {
            this.a.get(size2).a();
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final void a() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            this.a.get(size).a();
        }
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean c(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).c(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean d(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).d(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean e(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).e(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean f(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).f(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean g(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).g(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean h(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).h(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean b() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean c() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean a(float f) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).a(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean b(float f) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).b(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean d() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean a(PointF pointF, PointF pointF2, float f) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).a(pointF, pointF2, f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean a(PointF pointF, PointF pointF2, double d, double d2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).a(pointF, pointF2, d, d2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean i(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).i(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final synchronized boolean j(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).j(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean k(float f, float f2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (this.a.get(size).k(f, f2)) {
                return true;
            }
        }
        return false;
    }
}
