package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.i;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HoneyCombOverlay implements i {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final i a;

    public HoneyCombOverlay(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a5b7e17eb3d47b9d029c007c31d67d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a5b7e17eb3d47b9d029c007c31d67d6");
        } else {
            this.a = iVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e959d7e90f01ccac1789b4ed98fb519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e959d7e90f01ccac1789b4ed98fb519");
        } else {
            this.a.setAlpha(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public void setLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "710d4041afdb79ee1befaba21297e0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "710d4041afdb79ee1befaba21297e0cf");
        } else {
            this.a.setLevel(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ecc8c231a954e18f8157364f35bd630", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ecc8c231a954e18f8157364f35bd630")).booleanValue() : this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afacc7989c36dfa2fbca1a307fa399d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afacc7989c36dfa2fbca1a307fa399d3");
        } else {
            this.a.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81a3c48c3fe4ef88201aefbe43d3e5dc", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81a3c48c3fe4ef88201aefbe43d3e5dc")).floatValue() : this.a.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34ce8957567c97b8510874453c101a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34ce8957567c97b8510874453c101a0c");
        } else {
            this.a.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d2125c6cb4d6ed1634a5a2ced1ed785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d2125c6cb4d6ed1634a5a2ced1ed785");
        } else {
            this.a.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82775a167646e7c6a0ebb2988e871f09", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82775a167646e7c6a0ebb2988e871f09") : this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public HoneyCombUnit getUnit(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4ace618dd059df74df5853ca3292337", RobustBitConfig.DEFAULT_VALUE) ? (HoneyCombUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4ace618dd059df74df5853ca3292337") : this.a.getUnit(latLng);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public void updateHoneyCombOverlay(HoneyCombOverlayOptions honeyCombOverlayOptions) {
        Object[] objArr = {honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b8f8f68f5e85b2fd70fdf9b537b5a28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b8f8f68f5e85b2fd70fdf9b537b5a28");
        } else {
            this.a.updateHoneyCombOverlay(honeyCombOverlayOptions);
        }
    }

    public l getMapElement() {
        return this.a;
    }
}
