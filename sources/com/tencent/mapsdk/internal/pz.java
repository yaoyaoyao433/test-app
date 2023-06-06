package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pz {
    public int a;
    public sh b;

    public pz(sh shVar, GeoPoint[] geoPointArr, PolylineOptions.Text text) {
        this.b = shVar;
        if (this.b == null) {
            return;
        }
        sh shVar2 = this.b;
        this.a = ((Integer) shVar2.a((CallbackRunnable<sh.AnonymousClass45>) new sh.AnonymousClass45(geoPointArr, text), (sh.AnonymousClass45) (-1))).intValue();
    }

    private void a(PolylineOptions.Text text) {
        if (this.b == null || this.a <= 0) {
            return;
        }
        sh shVar = this.b;
        shVar.a(new sh.AnonymousClass48(this.a, text));
    }

    public final void a() {
        if (this.b == null || this.a <= 0) {
            return;
        }
        this.b.f(this.a);
    }
}
