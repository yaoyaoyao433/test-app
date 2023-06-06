package com.sankuai.meituan.mapsdk.tencentadapter;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class q implements com.sankuai.meituan.mapsdk.maps.interfaces.h {
    public static ChangeQuickRedirect a;
    public TileOverlay b;
    private HeatOverlayOptions c;
    private i d;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.h
    public final void updateHeatOverlay(HeatOverlayOptions heatOverlayOptions) {
    }

    public q(TileOverlay tileOverlay, HeatOverlayOptions heatOverlayOptions, i iVar) {
        Object[] objArr = {tileOverlay, heatOverlayOptions, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa59167a7e7b151a0f01529e2f83e3ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa59167a7e7b151a0f01529e2f83e3ec");
            return;
        }
        this.b = tileOverlay;
        this.c = heatOverlayOptions;
        this.d = iVar;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94026b9abb8faa46285c69c0211ec75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94026b9abb8faa46285c69c0211ec75");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82a7a0565ebdbc190aa1170a15c03cf7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82a7a0565ebdbc190aa1170a15c03cf7") : this.b.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960f8a3b19ff320fda7f484c715e5b88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960f8a3b19ff320fda7f484c715e5b88")).floatValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4207e172145708b60021de979b5e294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4207e172145708b60021de979b5e294");
        } else if (this.c == null) {
        } else {
            this.c.zIndex(f);
            this.b.setZindex((int) f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.h
    @Nullable
    public final List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c9aaa74b9838acbe3d7358fceba361b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c9aaa74b9838acbe3d7358fceba361b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5553537e81e8d42b0f94b44ced4c5fcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5553537e81e8d42b0f94b44ced4c5fcf")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.getRadius();
    }
}
