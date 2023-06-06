package com.sankuai.meituan.mapsdk.mapcore.outline;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseGeo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<ArrayList<ArrayList<Double>>> rawRings;

    public BaseGeo(ArrayList<ArrayList<ArrayList<Double>>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "416ee7d7329ae6e2d0c2ad57d7fd4ac4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "416ee7d7329ae6e2d0c2ad57d7fd4ac4");
        } else {
            this.rawRings = arrayList;
        }
    }

    public ArrayList<ArrayList<LatLng>> getPoligons() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "350bce819bf8b976628e9554d69d799e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "350bce819bf8b976628e9554d69d799e");
        }
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        if (this.rawRings == null) {
            return arrayList;
        }
        Iterator<ArrayList<ArrayList<Double>>> it = this.rawRings.iterator();
        while (it.hasNext()) {
            ArrayList<LatLng> arrayList2 = new ArrayList<>();
            Iterator<ArrayList<Double>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                ArrayList<Double> next = it2.next();
                if (next == null || next.size() < 2) {
                    c.e("Geometry getPolygons() error: latlng == null || latlng.size() < 2");
                    break;
                }
                arrayList2.add(new LatLng(next.get(1).doubleValue(), next.get(0).doubleValue()));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
