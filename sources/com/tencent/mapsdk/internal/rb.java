package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng;
import com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.ed;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rb implements rd {
    @Override // com.tencent.mapsdk.internal.rd
    public final ed a(byte[] bArr) {
        return (ed) JsonUtils.parseToModel(new String(bArr), dz.class, new Object[0]);
    }

    @Override // com.tencent.mapsdk.internal.rd
    public final BaseOverlayProvider a(ed edVar) {
        if ((edVar instanceof dz) && edVar.c()) {
            dz dzVar = (dz) edVar;
            ArcLineOverlayProvider arcLineOverlayProvider = new ArcLineOverlayProvider();
            if (dzVar.a.c.b != null) {
                ArrayList arrayList = new ArrayList();
                for (ed.a.C1476a.AbstractC1477a abstractC1477a : dzVar.a.c.b) {
                    if (abstractC1477a instanceof ed.a.C1476a.b) {
                        ed.a.C1476a.b bVar = (ed.a.C1476a.b) abstractC1477a;
                        arrayList.add(new FromToLatLng(bVar.b.get(0), bVar.b.get(1)));
                    }
                }
                arcLineOverlayProvider.data(arrayList);
            }
            if (dzVar.a.a.a.a.a.c != null) {
                int[] iArr = new int[dzVar.a.a.a.a.a.c.b.size()];
                for (int i = 0; i < iArr.length; i++) {
                    iArr[i] = dzVar.a.a.a.a.a.c.b.get(i).intValue();
                }
                arcLineOverlayProvider.gradient(iArr);
            }
            arcLineOverlayProvider.width(dzVar.a.a.a.a.a.a);
            arcLineOverlayProvider.radian((float) (dzVar.a.a.a.a.a.b * 90.0d));
            arcLineOverlayProvider.zoomRange(dzVar.a.a.b.k, dzVar.a.a.b.j);
            arcLineOverlayProvider.zIndex(dzVar.a.a.b.g);
            arcLineOverlayProvider.displayLevel(dzVar.a.a.b.f);
            arcLineOverlayProvider.enable3D(dzVar.a.a.b.a);
            arcLineOverlayProvider.opacity((float) dzVar.a.a.b.i);
            arcLineOverlayProvider.visibility(!dzVar.a.a.b.h);
            if (dzVar.a.a.b.b) {
                arcLineOverlayProvider.setAnimateDuration((int) (dzVar.a.a.b.c.c * 1000.0d));
                arcLineOverlayProvider.setHighlightDuration((int) (dzVar.a.a.b.c.a * 1000.0d));
                arcLineOverlayProvider.animateColor(dzVar.a.a.b.c.b);
            } else {
                arcLineOverlayProvider.setAnimateDuration(0);
            }
            return arcLineOverlayProvider;
        }
        return null;
    }
}
