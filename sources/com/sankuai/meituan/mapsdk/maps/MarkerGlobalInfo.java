package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.n;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MarkerGlobalInfo<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<T, n> a;
    private MTMap.InfoWindowAdapter b;

    public MarkerGlobalInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fbcda91feb01d20722d61dbc0dfe342", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fbcda91feb01d20722d61dbc0dfe342");
            return;
        }
        this.a = new ConcurrentHashMap();
        this.b = null;
    }

    public Marker toMTMarker(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43fdc3823fc876f7a98399b112d899d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Marker) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43fdc3823fc876f7a98399b112d899d5");
        }
        n iMarker = toIMarker(t);
        if (iMarker == null) {
            return null;
        }
        return new Marker(iMarker);
    }

    public n toIMarker(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50fb4d97c245d974156590be05a052b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50fb4d97c245d974156590be05a052b1");
        }
        if (t == null) {
            return null;
        }
        return this.a.get(t);
    }

    public n getIMarker(Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc28e20d44c121e6913c8f367d70d097", RobustBitConfig.DEFAULT_VALUE)) {
            return (n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc28e20d44c121e6913c8f367d70d097");
        }
        if (marker == null) {
            return null;
        }
        return this.a.get(marker.getPlatformMarker());
    }

    public void addMarker(T t, n nVar) {
        Object[] objArr = {t, nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c71bb527a7076419b483781e2a82c97f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c71bb527a7076419b483781e2a82c97f");
        } else {
            this.a.put(t, nVar);
        }
    }

    public void removeMarker(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa5b1d03a15d77867405344689153b36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa5b1d03a15d77867405344689153b36");
        } else {
            this.a.remove(t);
        }
    }

    public void clearMarkers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b333916e922521f4ef5f9aa6fd99327f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b333916e922521f4ef5f9aa6fd99327f");
        } else {
            this.a.clear();
        }
    }

    public List<n> getIMarkerList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7235999708d87bf14e33ed2d361d8e33", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7235999708d87bf14e33ed2d361d8e33");
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (Map.Entry<T, n> entry : this.a.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    public void setInfoWindowAdapter(MTMap.InfoWindowAdapter infoWindowAdapter) {
        this.b = infoWindowAdapter;
    }

    public MTMap.InfoWindowAdapter getInfoWindowAdapter() {
        return this.b;
    }
}
