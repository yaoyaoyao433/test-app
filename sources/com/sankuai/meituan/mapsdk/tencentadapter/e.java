package com.sankuai.meituan.mapsdk.tencentadapter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements com.sankuai.meituan.mapsdk.maps.interfaces.d {
    public static ChangeQuickRedirect a;
    private i b;
    private Circle c;
    private LatLng d;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final boolean isMask() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setMask(boolean z) {
    }

    public e(Circle circle, i iVar) {
        Object[] objArr = {circle, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a9f6ec773baf3902c88d8f35d7d1cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a9f6ec773baf3902c88d8f35d7d1cb");
            return;
        }
        this.c = circle;
        this.b = iVar;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d638acfccd3428de20e7ddafc24fa687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d638acfccd3428de20e7ddafc24fa687");
            return;
        }
        if (this.b.getOverlayKeeper() != null) {
            this.b.getOverlayKeeper().b(this);
        }
        this.c.remove();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aadeeb9a6b34e1a169c8eee44e7cd647", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aadeeb9a6b34e1a169c8eee44e7cd647") : this.c.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final LatLng getCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368fcc14f2dcddb975cd4efebed8de41", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368fcc14f2dcddb975cd4efebed8de41");
        }
        try {
            if (this.d == null) {
                this.d = new LatLng(this.c.getCenter().latitude, this.c.getCenter().longitude);
            }
            return this.d;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setCenter(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c64dead2c763485a6272986386196fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c64dead2c763485a6272986386196fc");
        } else if (latLng == null) {
        } else {
            try {
                this.c.setCenter(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude));
                this.d = latLng;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final double getRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "060b1485876918eb9e7f2e908f3fe263", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "060b1485876918eb9e7f2e908f3fe263")).doubleValue() : this.c.getRadius();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setRadius(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ece8022af0c3f37b0182a949b2347e2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ece8022af0c3f37b0182a949b2347e2e");
        } else {
            this.c.setRadius(d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final float getStrokeWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e86a63a4210e759f813b872e3082b107", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e86a63a4210e759f813b872e3082b107")).floatValue() : this.c.getStrokeWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b874205f0789e5e7c7de72dae6a0a7ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b874205f0789e5e7c7de72dae6a0a7ce");
        } else {
            this.c.setStrokeWidth(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final int getStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b5e037b3e0f246de0bdb5de8f69382", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b5e037b3e0f246de0bdb5de8f69382")).intValue() : this.c.getStrokeColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da229590d4a6a7b9d69f4b3fd7308af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da229590d4a6a7b9d69f4b3fd7308af7");
        } else {
            this.c.setStrokeColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final int getFillColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d3af13f8574553cabe88dea167efd8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d3af13f8574553cabe88dea167efd8")).intValue() : this.c.getFillColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e93b85a4f8950feca137b5e4fc93a01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e93b85a4f8950feca137b5e4fc93a01");
        } else {
            this.c.setFillColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "785938cf6e9fe69bf4de13e2b8305ac1", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "785938cf6e9fe69bf4de13e2b8305ac1")).floatValue() : this.c.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2937876193d007b322be85054b2c99b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2937876193d007b322be85054b2c99b2");
        } else {
            this.c.setZIndex((int) f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28296b8e64580d70c5d4d5d57df26dfc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28296b8e64580d70c5d4d5d57df26dfc")).booleanValue() : this.c.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476aa3827940fec2fb5f71d7c718da89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476aa3827940fec2fb5f71d7c718da89");
        } else {
            this.c.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final boolean contains(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e0fee6a0aeb4c4472f72eec7b2143f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e0fee6a0aeb4c4472f72eec7b2143f")).booleanValue();
        }
        if (latLng == null) {
            return false;
        }
        try {
            return this.c.contains(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
