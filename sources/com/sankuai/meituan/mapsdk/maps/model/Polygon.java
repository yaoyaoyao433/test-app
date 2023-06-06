package com.sankuai.meituan.mapsdk.maps.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
import com.sankuai.meituan.mapsdk.maps.interfaces.q;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Polygon implements q {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final q a;

    public Polygon(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4e3862a3140c1dcd417a6fb2df2f7a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4e3862a3140c1dcd417a6fb2df2f7a8");
        } else {
            this.a = qVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80b307698215508ba921cca2b6a17a7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80b307698215508ba921cca2b6a17a7f");
        } else {
            this.a.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1a2ad72b771c9b44d58bd331fefc12e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1a2ad72b771c9b44d58bd331fefc12e") : this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77da17bd3ee5ac7205eeaff922d64a15", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77da17bd3ee5ac7205eeaff922d64a15") : this.a.getPoints();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setPoints(@NonNull List<LatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95ebc2767a8589449967316fb271b19e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95ebc2767a8589449967316fb271b19e");
        } else {
            this.a.setPoints(list);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final float getStrokeWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c471fc5164dc8eb61ba79b5c8f4c83a2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c471fc5164dc8eb61ba79b5c8f4c83a2")).floatValue() : this.a.getStrokeWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f252c2fcfffd0313b6971c57b3e7630", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f252c2fcfffd0313b6971c57b3e7630");
        } else {
            this.a.setStrokeWidth(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final int getStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4a8b3b1c78ddf10abfbbaf5576c5282", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4a8b3b1c78ddf10abfbbaf5576c5282")).intValue() : this.a.getStrokeColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28cd032599c9eadeb40026612e74d66c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28cd032599c9eadeb40026612e74d66c");
        } else {
            this.a.setStrokeColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final int getFillColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee8e293a1c3bbf2f0ae7f6bc2e5de596", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee8e293a1c3bbf2f0ae7f6bc2e5de596")).intValue() : this.a.getFillColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "206789d96d9b93a40640384c26c7f48e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "206789d96d9b93a40640384c26c7f48e");
        } else {
            this.a.setFillColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1afc934f408c7b11c9eb62d0d59fc401", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1afc934f408c7b11c9eb62d0d59fc401")).floatValue() : this.a.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d3d765a49e3e12723cb8c25869bcf38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d3d765a49e3e12723cb8c25869bcf38");
        } else {
            this.a.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0caee7545948ed1c0aa7cc48c6d30b52", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0caee7545948ed1c0aa7cc48c6d30b52")).booleanValue() : this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef4bd3c429c9fa3a08ad1232764451d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef4bd3c429c9fa3a08ad1232764451d7");
        } else {
            this.a.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4de5ea3bff2d21dbb890d7dfc3a35a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4de5ea3bff2d21dbb890d7dfc3a35a6");
        } else {
            this.a.setClickable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final boolean isClickable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99827e5fbaf7daaf5b32b33fa2cf97ba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99827e5fbaf7daaf5b32b33fa2cf97ba")).booleanValue() : this.a.isClickable();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final boolean contains(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6158417ff83b9e2b17091a20ed23c6bf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6158417ff83b9e2b17091a20ed23c6bf")).booleanValue() : this.a.contains(latLng);
    }

    public final l getMapElement() {
        return this.a;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setFillTexture(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "364bef7808833f99d3b8d020238fba56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "364bef7808833f99d3b8d020238fba56");
        } else {
            this.a.setFillTexture(bitmapDescriptor);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final BitmapDescriptor getFillTexture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8c3e79645d62837c0d02a0e18869a9e", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8c3e79645d62837c0d02a0e18869a9e") : this.a.getFillTexture();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final Object getTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cadac240ef398005696d3403f7c0d68a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cadac240ef398005696d3403f7c0d68a") : this.a.getTag();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setTag(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd91d30b5b1618f42f2e24d57995d96d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd91d30b5b1618f42f2e24d57995d96d");
        } else {
            this.a.setTag(obj);
        }
    }
}
