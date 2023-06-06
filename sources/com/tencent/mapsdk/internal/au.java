package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class au implements CustomLayer {
    private final qc a;

    public au(qc qcVar) {
        this.a = qcVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.CustomLayer
    public final void reload() {
        if (this.a == null) {
            return;
        }
        this.a.e();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void remove() {
        if (this.a == null) {
            return;
        }
        this.a.remove();
        kn.d(ki.a);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final boolean isRemoved() {
        if (this.a != null) {
            return this.a.isRemoved();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        if (this.a != null) {
            this.a.releaseData();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.CustomLayer
    public final void clearDiskCache() {
        if (this.a == null) {
            return;
        }
        this.a.f();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final String getId() {
        return this.a == null ? "" : this.a.b_;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof au)) {
            return this.a.equals(((au) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        if (this.a == null) {
            return 0;
        }
        return this.a.hashCode();
    }
}
