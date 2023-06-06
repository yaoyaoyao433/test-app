package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qw {
    public long a = System.currentTimeMillis();
    public LatLngBounds b;
    public List<Detail> c;

    public qw(LatLngBounds latLngBounds, List<Detail> list) {
        this.b = latLngBounds;
        this.c = list;
    }
}
