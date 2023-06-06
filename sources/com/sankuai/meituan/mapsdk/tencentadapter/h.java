package com.sankuai.meituan.mapsdk.tencentadapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombUnit;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng;
import com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements com.sankuai.meituan.mapsdk.maps.interfaces.i {
    public static ChangeQuickRedirect a;
    private HoneyCombOverlayOptions b;
    private VectorOverlay c;
    private i d;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        return false;
    }

    public h(VectorOverlay vectorOverlay, HoneyCombOverlayOptions honeyCombOverlayOptions, i iVar) {
        Object[] objArr = {vectorOverlay, honeyCombOverlayOptions, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d85221855ba82947275f292f661c076f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d85221855ba82947275f292f661c076f");
            return;
        }
        this.c = vectorOverlay;
        this.b = honeyCombOverlayOptions;
        this.d = iVar;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401898703a8546814b05d707a476ed92", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401898703a8546814b05d707a476ed92") : this.c.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "273fc818b3ae8bbe57bf4ddc51e39866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "273fc818b3ae8bbe57bf4ddc51e39866");
        } else if (this.b == null) {
        } else {
            this.b.alpha(f);
            this.c.setOpacity(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public final void setLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69d04b63016f1b03144b56fa39981a95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69d04b63016f1b03144b56fa39981a95");
        } else if (this.b == null) {
        } else {
            this.b.displayLevel(i);
            this.c.setLevel(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public final HoneyCombUnit getUnit(LatLng latLng) {
        WeightedLatLng weightedLatLng;
        char c = 0;
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0980e5f19e490541a478156caf8452b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0980e5f19e490541a478156caf8452b3");
        }
        VectorHeatAggregationUnit unit = ((AggregationOverlay) this.c).getUnit(b.a(latLng));
        Object[] objArr2 = {unit};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        WeightedLatLng[] weightedLatLngArr = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e94f2835c54d619a5e16c20e4e0e84a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombUnit) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e94f2835c54d619a5e16c20e4e0e84a0");
        }
        if (unit == null) {
            return null;
        }
        LatLng a2 = b.a(unit.getCenter());
        com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] nodes = unit.getNodes();
        Object[] objArr3 = {nodes};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ef1970fd15ae897fec08182684f10be5", RobustBitConfig.DEFAULT_VALUE)) {
            weightedLatLngArr = (WeightedLatLng[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ef1970fd15ae897fec08182684f10be5");
        } else if (nodes != null) {
            WeightedLatLng[] weightedLatLngArr2 = new WeightedLatLng[nodes.length];
            int i = 0;
            while (i < weightedLatLngArr2.length) {
                com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng weightedLatLng2 = nodes[i];
                Object[] objArr4 = new Object[1];
                objArr4[c] = weightedLatLng2;
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "d5904cf635a2853bec882d1a734ffda3", RobustBitConfig.DEFAULT_VALUE)) {
                    weightedLatLng = (WeightedLatLng) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "d5904cf635a2853bec882d1a734ffda3");
                } else {
                    weightedLatLng = weightedLatLng2 == null ? null : new WeightedLatLng(b.a(weightedLatLng2.getPoint()), weightedLatLng2.getIntensity());
                }
                weightedLatLngArr2[i] = weightedLatLng;
                i++;
                c = 0;
            }
            weightedLatLngArr = weightedLatLngArr2;
        }
        return new HoneyCombUnit(a2, unit.getIntensity(), weightedLatLngArr);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public final void updateHoneyCombOverlay(HoneyCombOverlayOptions honeyCombOverlayOptions) {
        Object[] objArr = {honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7b3b5074aebf319685c157b0283ff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7b3b5074aebf319685c157b0283ff5");
            return;
        }
        i iVar = this.d;
        VectorOverlay vectorOverlay = this.c;
        Object[] objArr2 = {vectorOverlay, honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "b9834b69706970da26c67ac8e50f1f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "b9834b69706970da26c67ac8e50f1f89");
        } else {
            iVar.b.updateVectorOverlay(vectorOverlay, b.a(honeyCombOverlayOptions));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cb53efee47d55e50c2053cc21fe4c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cb53efee47d55e50c2053cc21fe4c1");
        } else if (this.b == null) {
        } else {
            this.b.visibility(z);
            this.c.setVisibility(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8283d7310fb61a8dbf9f88b9fb2f0c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8283d7310fb61a8dbf9f88b9fb2f0c0")).floatValue();
        }
        if (this.b == null) {
            return 0.0f;
        }
        return this.b.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "020bfa8598ff58b7c0fae2991c7d8e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "020bfa8598ff58b7c0fae2991c7d8e09");
        } else if (this.b == null) {
        } else {
            int i = (int) f;
            this.b.zIndex(i);
            this.c.setZIndex(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89ea7cf97e1393de3b2d421aec623ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89ea7cf97e1393de3b2d421aec623ac");
            return;
        }
        if (this.d.getOverlayKeeper() != null) {
            this.d.getOverlayKeeper().b(this);
        }
        this.c.remove();
    }
}
