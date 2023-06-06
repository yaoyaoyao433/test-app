package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qj {
    private qh a;

    public qj(qh qhVar) {
        this.a = qhVar;
    }

    public final qc a(TileOverlayOptions tileOverlayOptions) {
        qc qcVar;
        TileProvider tileProvider = tileOverlayOptions.getTileProvider();
        if (tileProvider == null) {
            qcVar = null;
        } else if (tileProvider instanceof qn) {
            qcVar = new qi(this.a, tileOverlayOptions);
        } else if (tileProvider instanceof rn) {
            qcVar = new qk(this.a, tileOverlayOptions);
        } else {
            qcVar = new qc(this.a, tileOverlayOptions);
        }
        this.a.a(qcVar);
        return qcVar;
    }
}
