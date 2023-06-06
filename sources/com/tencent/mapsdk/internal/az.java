package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class az implements TileOverlay {
    private final qc a;

    public az(qc qcVar) {
        this.a = qcVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void reload() {
        if (this.a == null) {
            return;
        }
        this.a.e();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void remove() {
        if (this.a == null) {
            return;
        }
        this.a.remove();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void setDiskCacheDir(String str) {
        if (this.a == null) {
            return;
        }
        qc qcVar = this.a;
        if (qcVar.q == null || TextUtils.isEmpty(str)) {
            return;
        }
        qcVar.q.diskCacheDir(str);
        qcVar.r = qcVar.g();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void setZindex(int i) {
        if (this.a == null) {
            return;
        }
        this.a.a(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void clearTileCache() {
        if (this.a == null) {
            return;
        }
        this.a.f();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay, com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final String getId() {
        return this.a == null ? "" : this.a.b_;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof az)) {
            return this.a.equals(((az) obj).a);
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
