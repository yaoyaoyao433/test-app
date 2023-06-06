package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.aggregation.HoneyCombVectorOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.aggregation.SquareVectorOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.ed;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ra implements rd {
    @Override // com.tencent.mapsdk.internal.rd
    public final ed a(byte[] bArr) {
        return (ed) JsonUtils.parseToModel(new String(bArr), dy.class, new Object[0]);
    }

    @Override // com.tencent.mapsdk.internal.rd
    public final BaseOverlayProvider a(ed edVar) {
        AggregationOverlayProvider squareVectorOverlayProvider;
        if ((edVar instanceof dy) && edVar.c()) {
            dy dyVar = (dy) edVar;
            if (dyVar.a.a.a.a.a.c.equals("hexagon")) {
                squareVectorOverlayProvider = new HoneyCombVectorOverlayProvider();
            } else {
                squareVectorOverlayProvider = dyVar.a.a.a.a.a.c.equals("grid") ? new SquareVectorOverlayProvider() : null;
            }
            if (squareVectorOverlayProvider == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (ed.a.C1476a.AbstractC1477a abstractC1477a : dyVar.a.c.b) {
                if (abstractC1477a instanceof ed.a.C1476a.d) {
                    arrayList.addAll(((ed.a.C1476a.d) abstractC1477a).b);
                }
            }
            AggregationOverlayProvider nodes = squareVectorOverlayProvider.nodes((WeightedLatLng[]) arrayList.toArray(new WeightedLatLng[0]));
            int[] iArr = new int[dyVar.a.a.a.a.a.d.b.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = dyVar.a.a.a.a.a.d.b.get(i).intValue();
            }
            double[] dArr = new double[dyVar.a.a.a.a.a.d.a.size()];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                dArr[i2] = dyVar.a.a.a.a.a.d.a.get(i2).doubleValue();
            }
            nodes.colors(iArr, dArr);
            nodes.size(dyVar.a.a.a.a.a.b);
            nodes.gap(dyVar.a.a.a.a.a.a);
            nodes.setHeightRange(dyVar.a.a.b.d.get(0).doubleValue(), dyVar.a.a.b.d.get(1).doubleValue());
            nodes.setIntensityRange(dyVar.a.a.b.b, dyVar.a.a.b.a);
            nodes.zoomRange(dyVar.a.a.b.k, dyVar.a.a.b.j);
            nodes.zIndex(dyVar.a.a.b.g);
            nodes.displayLevel(dyVar.a.a.b.f);
            nodes.enable3D(dyVar.a.a.b.c);
            nodes.opacity((float) dyVar.a.a.b.i);
            nodes.visibility(!dyVar.a.a.b.h);
            if (dyVar.a.a.b.e && dyVar.a.a.a.a.a.e != null) {
                nodes.setAnimateDuration((int) (dyVar.a.a.a.a.a.e.c * 1000.0d));
            } else {
                nodes.setAnimateDuration(0);
            }
            return nodes;
        }
        return null;
    }
}
