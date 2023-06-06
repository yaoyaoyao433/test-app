package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.ed;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class re implements rd {
    @Override // com.tencent.mapsdk.internal.rd
    public final ed a(byte[] bArr) {
        return (ed) JsonUtils.parseToModel(new String(bArr), ee.class, new Object[0]);
    }

    @Override // com.tencent.mapsdk.internal.rd
    public final BaseOverlayProvider a(ed edVar) {
        if ((edVar instanceof ee) && edVar.c()) {
            ee eeVar = (ee) edVar;
            GradientVectorOverlayProvider gradientVectorOverlayProvider = new GradientVectorOverlayProvider();
            ArrayList arrayList = new ArrayList();
            for (ed.a.C1476a.AbstractC1477a abstractC1477a : eeVar.a.c.b) {
                if (abstractC1477a instanceof ed.a.C1476a.d) {
                    arrayList.addAll(((ed.a.C1476a.d) abstractC1477a).b);
                }
            }
            gradientVectorOverlayProvider.weightedData(arrayList);
            int[] iArr = new int[eeVar.a.a.a.a.a.b.b.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = eeVar.a.a.a.a.a.b.b.get(i).intValue();
            }
            float[] fArr = new float[eeVar.a.a.a.a.a.b.a.size()];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                fArr[i2] = eeVar.a.a.a.a.a.b.a.get(i2).floatValue();
            }
            gradientVectorOverlayProvider.gradient(iArr, fArr);
            gradientVectorOverlayProvider.radius(eeVar.a.a.a.a.a.a);
            gradientVectorOverlayProvider.setMaxHeight(eeVar.a.a.b.d.get(1).floatValue());
            gradientVectorOverlayProvider.setIntensityRange((float) eeVar.a.a.b.b, (float) eeVar.a.a.b.a);
            gradientVectorOverlayProvider.zoomRange(eeVar.a.a.b.k, eeVar.a.a.b.j);
            gradientVectorOverlayProvider.zIndex(eeVar.a.a.b.g);
            gradientVectorOverlayProvider.displayLevel(eeVar.a.a.b.f);
            gradientVectorOverlayProvider.enable3D(eeVar.a.a.b.c);
            gradientVectorOverlayProvider.opacity((float) eeVar.a.a.b.i);
            gradientVectorOverlayProvider.visibility(!eeVar.a.a.b.h);
            if (eeVar.a.a.b.e && eeVar.a.a.a.a.a.c != null) {
                gradientVectorOverlayProvider.setAnimateDuration((int) (eeVar.a.a.a.a.a.c.c * 1000.0d));
            } else {
                gradientVectorOverlayProvider.setAnimateDuration(0);
            }
            return gradientVectorOverlayProvider;
        }
        return null;
    }
}
