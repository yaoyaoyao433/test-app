package com.sankuai.meituan.mapsdk.core.annotations;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public static final float[] b = {1.0f, 1.0f};
    public static final float[] c = {1.0f, 0.0f};

    public static List<LatLng> a(LatLng latLng, double d, int i) {
        Object[] objArr = {latLng, Double.valueOf(d), 360};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84a1b09d3a9ac66ab1ca86bff3c483b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84a1b09d3a9ac66ab1ca86bff3c483b8");
        }
        PointD a2 = com.sankuai.meituan.mapsdk.mapcore.utils.e.b.a(latLng);
        ArrayList<PointD> arrayList = new ArrayList();
        for (int i2 = 0; i2 < 360; i2++) {
            double d2 = (i2 * 3.141592653589793d) / 180.0d;
            arrayList.add(new PointD(a2.x + (Math.cos(d2) * d), a2.y + (Math.sin(d2) * d)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (PointD pointD : arrayList) {
            arrayList2.add(com.sankuai.meituan.mapsdk.mapcore.utils.e.b.a(pointD));
        }
        return arrayList2;
    }
}
