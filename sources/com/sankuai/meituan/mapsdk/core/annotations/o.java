package com.sankuai.meituan.mapsdk.core.annotations;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.HoleOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PolygonOptions;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o extends d implements com.sankuai.meituan.mapsdk.maps.interfaces.q {
    public static ChangeQuickRedirect y;

    public o(g gVar, PolygonOptions polygonOptions) {
        super(gVar);
        Object[] objArr = {gVar, polygonOptions};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca338009645e4268ef4e7979ad196afe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca338009645e4268ef4e7979ad196afe");
            return;
        }
        String str = "";
        str = (polygonOptions == null || polygonOptions.getPoints() == null || polygonOptions.getPoints().size() < 3) ? "polygonOptions == null or polygonOptions's points less than 3" : "polygonOptions == null or polygonOptions's points less than 3";
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
            return;
        }
        for (HoleOptions holeOptions : polygonOptions.getHoles()) {
            this.g.add(holeOptions.getPoints());
        }
        setFillColor(polygonOptions.getFillColor());
        setStrokeColor(polygonOptions.getStrokeColor());
        setStrokeWidth(polygonOptions.getStrokeWidth());
        setVisible(polygonOptions.isVisible());
        a(polygonOptions.isDottedLine());
        int[] dashArray = polygonOptions.getDashArray();
        Object[] objArr2 = {dashArray};
        ChangeQuickRedirect changeQuickRedirect2 = y;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a199974afcd0ae411b9cae1b1381272e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a199974afcd0ae411b9cae1b1381272e");
        } else if (!f() && dashArray != null && dashArray.length >= 2) {
            float f = dashArray[0];
            float f2 = dashArray[1];
            if (f >= 0.0f && f2 >= 0.0f) {
                if (f == 0.0f && f2 == 0.0f) {
                    a(this.c);
                } else {
                    this.s.a(3009, new float[]{f, f2});
                }
                this.h = dashArray;
            }
        }
        setPoints(polygonOptions.getPoints());
        setLevel(polygonOptions.getLevel());
        setZIndex(polygonOptions.getZIndex());
        setClickable(polygonOptions.isClickable());
        this.s.a(3001, 0);
        setFillTexture(polygonOptions.getFillTexture());
        a(polygonOptions);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setPoints(List<LatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7dbf0541ced4b504be80dc19e604c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7dbf0541ced4b504be80dc19e604c1");
            return;
        }
        super.setPoints(list);
        if (this.r == null || list == null) {
            return;
        }
        ((PolygonOptions) this.r).getPoints().clear();
        ((PolygonOptions) this.r).addAll(list);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb111b38460a4d58677482f956e1800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb111b38460a4d58677482f956e1800");
            return;
        }
        super.setStrokeWidth(f);
        if (this.r != null) {
            ((PolygonOptions) this.r).strokeWidth(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab589aab3e67744ce8aa3e0c5bcba21c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab589aab3e67744ce8aa3e0c5bcba21c");
            return;
        }
        super.setStrokeColor(i);
        if (this.r != null) {
            ((PolygonOptions) this.r).strokeColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052835259f7894ca6ba967adf0782c12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052835259f7894ca6ba967adf0782c12");
            return;
        }
        super.setFillColor(i);
        if (this.r != null) {
            ((PolygonOptions) this.r).fillColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setFillTexture(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be59084d26fe2a9fea6429376435dc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be59084d26fe2a9fea6429376435dc3");
            return;
        }
        super.setFillTexture(bitmapDescriptor);
        if (this.r != null) {
            ((PolygonOptions) this.r).fillTexture(bitmapDescriptor);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdac56447de18cc17c75755b030e93ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdac56447de18cc17c75755b030e93ea");
            return;
        }
        super.setZIndex(f);
        if (this.r != null) {
            ((PolygonOptions) this.r).zIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.e
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2b986d46b2ab18957fab712cdb7ed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2b986d46b2ab18957fab712cdb7ed2");
        } else if (f()) {
        } else {
            super.setClickable(z);
            if (Float.compare(this.v, 0.0f) == 0 || !this.m) {
                this.s.a(false);
            } else {
                this.s.a(z);
            }
            if (this.r != null) {
                ((PolygonOptions) this.r).clickable(z);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5125b6cc45dde3b7214b96b1743109d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5125b6cc45dde3b7214b96b1743109d");
        } else if (f()) {
        } else {
            super.setVisible(z);
            if (z) {
                this.s.a(this.n);
            } else {
                this.s.a(false);
            }
            if (this.r != null) {
                ((PolygonOptions) this.r).visible(z);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final Object getTag() {
        return this.q;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setTag(Object obj) {
        this.q = obj;
    }
}
