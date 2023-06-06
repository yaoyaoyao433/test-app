package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.hw;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hx extends hw {
    protected boolean i;
    protected List<hw> j;

    public hx(boolean z) {
        this.i = true;
        this.j = null;
        this.i = z;
        if (this.j == null) {
            this.j = new ArrayList();
        }
    }

    public final void a(hw hwVar) {
        if (hwVar == null) {
            return;
        }
        this.j.add(hwVar);
    }

    public final void c() {
        if (this.j == null) {
            return;
        }
        this.j.clear();
    }

    @Override // com.tencent.mapsdk.internal.hw
    public final void a(long j) {
        int size;
        super.a(j);
        if (this.j == null || (size = this.j.size()) == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            hw hwVar = this.j.get(i);
            if (hwVar != null) {
                hwVar.a(j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.hw
    public final void a(float f, Interpolator interpolator) {
        int size;
        if (this.j == null || (size = this.j.size()) == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            hw hwVar = this.j.get(i);
            if (hwVar != null) {
                if (this.i) {
                    hwVar.a(f, interpolator);
                } else {
                    hwVar.a(f, hwVar.f);
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.hw
    public final boolean a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        int size;
        boolean a = super.a(geoPoint, geoPoint2);
        if (!a || this.j == null || (size = this.j.size()) == 0) {
            return false;
        }
        boolean z = a;
        for (int i = 0; i < size; i++) {
            hw hwVar = this.j.get(i);
            if (hwVar != null) {
                z = z && hwVar.a(geoPoint, geoPoint2);
            }
        }
        return z;
    }

    @Override // com.tencent.mapsdk.internal.hw
    public final void a(hw.b bVar) {
        int size;
        super.a(bVar);
        if (this.j == null || (size = this.j.size()) == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            hw hwVar = this.j.get(i);
            if (hwVar != null) {
                hwVar.a(bVar);
            }
        }
    }
}
