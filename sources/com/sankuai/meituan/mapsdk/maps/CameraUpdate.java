package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.c;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CameraUpdate implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private c a;
    private CameraUpdateMessage b;

    public CameraUpdate(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c09bb42a264cd6aafd6f8aa7bff70457", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c09bb42a264cd6aafd6f8aa7bff70457");
        } else {
            this.a = cVar;
        }
    }

    public CameraUpdate(CameraUpdateMessage cameraUpdateMessage) {
        Object[] objArr = {cameraUpdateMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91cb23c61edc434eb686fb22b5c2293e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91cb23c61edc434eb686fb22b5c2293e");
        } else {
            this.b = cameraUpdateMessage;
        }
    }

    public CameraUpdateMessage getCameraUpdateMessage() {
        return this.b;
    }

    public Object getCameraUpdate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebefd1db14f55c1cdf5070689dcad319", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebefd1db14f55c1cdf5070689dcad319");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getEmbedObject();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.c
    public float getZoomToValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fec555d12abf4cd2cd1afe3f10eecd29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fec555d12abf4cd2cd1afe3f10eecd29")).floatValue();
        }
        if (this.a != null) {
            return this.a.getZoomToValue();
        }
        if (this.b != null) {
            return this.b.zoom;
        }
        return 3.0f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.c
    public float getZoomByAmount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7118e85ad20f795f011cff0e890026eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7118e85ad20f795f011cff0e890026eb")).floatValue();
        }
        if (this.a != null) {
            return this.a.getZoomByAmount();
        }
        if (this.b != null) {
            return this.b.zoomAmount;
        }
        return 0.0f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.c
    public LatLngBounds getLatLngBounds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44e846b9b620597e1394632a938764fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44e846b9b620597e1394632a938764fb");
        }
        if (this.a != null) {
            return this.a.getLatLngBounds();
        }
        if (this.b != null) {
            return this.b.latLngBounds;
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.c
    public int getPaddingTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9b962e0377ce12922df54939a0a776b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9b962e0377ce12922df54939a0a776b")).intValue();
        }
        if (this.a != null) {
            return this.a.getPaddingTop();
        }
        if (this.b != null) {
            return this.b.paddingTop;
        }
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.c
    public int getPaddingRight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f21c5e88da91546adb15978ebc81de1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f21c5e88da91546adb15978ebc81de1")).intValue();
        }
        if (this.a != null) {
            return this.a.getPaddingRight();
        }
        if (this.b != null) {
            return this.b.paddingRight;
        }
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.c
    public int getPaddingLeft() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ef8b4d24a309daef3210acbd40728ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ef8b4d24a309daef3210acbd40728ac")).intValue();
        }
        if (this.a != null) {
            return this.a.getPaddingLeft();
        }
        if (this.b != null) {
            return this.b.paddingLeft;
        }
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.c
    public int getPaddingBottom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9df96e6fdb5b5e2a8a3aa8061d7a0bc0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9df96e6fdb5b5e2a8a3aa8061d7a0bc0")).intValue();
        }
        if (this.a != null) {
            return this.a.getPaddingBottom();
        }
        if (this.b != null) {
            return this.b.paddingBottom;
        }
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.c
    public Object getEmbedObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2e86ede821b57ad6a9fcc21f724fc10", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2e86ede821b57ad6a9fcc21f724fc10");
        }
        if (this.a != null) {
            return this.a.getEmbedObject();
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.c
    public CameraPosition getCameraPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a845a06c14cfd336a55aea7412214712", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a845a06c14cfd336a55aea7412214712");
        }
        if (this.a != null) {
            return this.a.getCameraPosition();
        }
        if (this.b != null) {
            return this.b.cameraPosition;
        }
        return null;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e6cfa3a9beeab138d3e75ead168c108", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e6cfa3a9beeab138d3e75ead168c108");
        }
        return getCameraPosition() + ",amount:" + getZoomByAmount() + ",cameraUpdateZoom:" + getZoomToValue() + ",paddingLeft=" + getPaddingLeft() + ",paddingTop=" + getPaddingTop() + ",paddingRight=" + getPaddingRight() + ",paddingBottom=" + getPaddingBottom() + ",LatLngBounds:" + getLatLngBounds();
    }
}
