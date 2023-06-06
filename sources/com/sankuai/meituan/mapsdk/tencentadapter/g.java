package com.sankuai.meituan.mapsdk.tencentadapter;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements com.sankuai.meituan.mapsdk.maps.interfaces.h {
    public static ChangeQuickRedirect a;
    public VectorOverlay b;
    private HeatOverlayOptions c;
    private i d;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
    }

    public g(VectorOverlay vectorOverlay, HeatOverlayOptions heatOverlayOptions, i iVar) {
        Object[] objArr = {vectorOverlay, heatOverlayOptions, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7a90a5bd68fe98e83c8cf047ad303d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7a90a5bd68fe98e83c8cf047ad303d");
            return;
        }
        this.b = vectorOverlay;
        this.c = heatOverlayOptions;
        this.d = iVar;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3d1c471bad3205afa7727f5cfd1b81c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3d1c471bad3205afa7727f5cfd1b81c");
            return;
        }
        if (this.d.getOverlayKeeper() != null) {
            this.d.getOverlayKeeper().b(this);
        }
        this.b.remove();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e52c9be6e6641e20c604e455b75c372", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e52c9be6e6641e20c604e455b75c372") : this.b.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04996dad829ef81fb0fc08bd266f1df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04996dad829ef81fb0fc08bd266f1df")).floatValue();
        }
        if (this.c == null) {
            return 0.0f;
        }
        return this.c.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b433ec80c8438f81edf57acfaf1810d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b433ec80c8438f81edf57acfaf1810d9");
        } else if (this.c == null) {
        } else {
            this.c.zIndex(f);
            this.b.setZIndex((int) f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.h
    @Nullable
    public final List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0909df55231e37d15fdb8caddc034d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0909df55231e37d15fdb8caddc034d3");
        }
        if (this.c == null) {
            return null;
        }
        if (this.c.getWeightedData() == null) {
            return new ArrayList(this.c.getData());
        }
        ArrayList arrayList = new ArrayList();
        for (WeightedLatLng weightedLatLng : this.c.getWeightedData()) {
            arrayList.add(weightedLatLng.latLng);
        }
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.h
    public final int getRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65be75d8764f640978aba1f0cb39b945", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65be75d8764f640978aba1f0cb39b945")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.getRadius();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.h
    public final void updateHeatOverlay(HeatOverlayOptions heatOverlayOptions) {
        Object[] objArr = {heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2480b7c4fc089a23258e4c9a2c839fb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2480b7c4fc089a23258e4c9a2c839fb6");
            return;
        }
        i iVar = this.d;
        VectorOverlay vectorOverlay = this.b;
        Object[] objArr2 = {vectorOverlay, heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "e705e03ef1b8791374bc5f81d957c129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "e705e03ef1b8791374bc5f81d957c129");
        } else {
            iVar.b.updateVectorOverlay(vectorOverlay, b.a(heatOverlayOptions));
        }
    }
}
