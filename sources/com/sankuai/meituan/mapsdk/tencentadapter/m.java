package com.sankuai.meituan.mapsdk.tencentadapter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Polygon;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m implements com.sankuai.meituan.mapsdk.maps.interfaces.q {
    public static ChangeQuickRedirect a;
    private i b;
    private Polygon c;
    private List<LatLng> d;
    private float e;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final BitmapDescriptor getFillTexture() {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final boolean isClickable() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setClickable(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setFillTexture(BitmapDescriptor bitmapDescriptor) {
    }

    public m(Polygon polygon, i iVar) {
        Object[] objArr = {polygon, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503888c109d1f2cf5225c364eb806d77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503888c109d1f2cf5225c364eb806d77");
            return;
        }
        this.c = polygon;
        this.b = iVar;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0d88abb33af0a321ec30cd3a132029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0d88abb33af0a321ec30cd3a132029");
            return;
        }
        if (this.b.getOverlayKeeper() != null) {
            this.b.getOverlayKeeper().b(this);
        }
        this.c.remove();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85d29bd8c6225f4f9a0e6c9f9a7d7a02", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85d29bd8c6225f4f9a0e6c9f9a7d7a02") : this.c.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9503f76a53345836bbd1649edcd429c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9503f76a53345836bbd1649edcd429c0");
        }
        if (this.d == null) {
            List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> points = this.c.getPoints();
            if (points == null) {
                return null;
            }
            this.d = new ArrayList();
            for (com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng : points) {
                this.d.add(new LatLng(latLng.latitude, latLng.longitude));
            }
        }
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setPoints(@NonNull List<LatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b3f13b73a5fe52a8fa1e0fb097af31a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b3f13b73a5fe52a8fa1e0fb097af31a");
        } else if (list != null && list.size() != 0) {
            try {
                ArrayList arrayList = new ArrayList(list.size());
                for (LatLng latLng : list) {
                    arrayList.add(b.a(latLng));
                }
                this.c.setPoints(arrayList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final float getStrokeWidth() {
        return this.e;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd1e5ec517d704c7edbb0a42b657a2c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd1e5ec517d704c7edbb0a42b657a2c4");
            return;
        }
        this.e = f;
        this.c.setStrokeWidth(f);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final int getStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81662a4e2d9f370dbf9609440682a126", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81662a4e2d9f370dbf9609440682a126")).intValue() : this.c.getStrokeColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36af5222788134745f53a83ac3751a46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36af5222788134745f53a83ac3751a46");
        } else {
            this.c.setStrokeColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final int getFillColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "405d1137dadede6d4112506528021f1b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "405d1137dadede6d4112506528021f1b")).intValue() : this.c.getFillColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674a2f9aa48215503900be3297e4a3e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674a2f9aa48215503900be3297e4a3e1");
        } else {
            this.c.setFillColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9efaca6741cd77202331d7cbf68dbc5", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9efaca6741cd77202331d7cbf68dbc5")).floatValue() : this.c.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ee79b9c1c0d3902737c373c951cbea2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ee79b9c1c0d3902737c373c951cbea2");
        } else {
            this.c.setZIndex((int) f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "056ea679fd723e113aaf6f2f50435dad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "056ea679fd723e113aaf6f2f50435dad")).booleanValue() : this.c.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2261f5dae5479bb793c5c254865b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2261f5dae5479bb793c5c254865b6e");
        } else {
            this.c.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final boolean contains(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c348d365662cada02c90fcc12eab9af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c348d365662cada02c90fcc12eab9af")).booleanValue();
        }
        try {
            return this.c.contains(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final Object getTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa8b389901704a321fa30871f37c7002", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa8b389901704a321fa30871f37c7002") : this.c.getTag();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setTag(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6734125e21516a4b54cebe24e0588dee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6734125e21516a4b54cebe24e0588dee");
        } else {
            this.c.setTag(obj);
        }
    }
}
