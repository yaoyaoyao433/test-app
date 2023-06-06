package com.sankuai.meituan.mapsdk.core.annotations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.ArrowOptions;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k extends d implements com.sankuai.meituan.mapsdk.maps.interfaces.b {
    public static ChangeQuickRedirect y;
    private long A;
    private List<LatLng> B;
    private int C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private ArrowOptions.HeightUnit I;
    private float J;
    private boolean K;
    private BitmapDescriptor L;
    float z;

    public k(g gVar, ArrowOptions arrowOptions) {
        super(gVar);
        Object[] objArr = {gVar, arrowOptions};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6302058b850951867cd6a868fe0bfbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6302058b850951867cd6a868fe0bfbb");
            return;
        }
        this.A = -1L;
        String str = "";
        if (arrowOptions == null) {
            str = "arrowOptions == null";
        } else if (arrowOptions.getPoints() == null || arrowOptions.getPoints().size() < 2) {
            str = "unavailable points";
        }
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
            return;
        }
        this.A = gVar.c.createAndAddArrow(arrowOptions.getWidth());
        gVar.c.setArrowFeatureNum(this.A, 1);
        this.s.a(false);
        this.K = !arrowOptions.is3DModel();
        setPoints(arrowOptions.getPoints(), arrowOptions.getWidth());
        setVisible(arrowOptions.isVisible());
        setMinPitch(arrowOptions.getMinPitch());
        setColor(arrowOptions.getColor());
        setHeight(arrowOptions.getHeight(), arrowOptions.getUnit());
        setOutlineColor(arrowOptions.getOutlineColor());
        setOutlineWidth(arrowOptions.getOutlineWidth());
        setTopSurfaceColor(arrowOptions.getTopSurfaceColor());
        setLevel(arrowOptions.getLevel());
        setZIndex(arrowOptions.getZIndex());
        boolean isAvoidable = arrowOptions.isAvoidable();
        Object[] objArr2 = {Byte.valueOf(isAvoidable ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = y;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd671054367fd54357272cb65b542f36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd671054367fd54357272cb65b542f36");
        } else if (f() || !isAvoidable || this.z <= 0.0f) {
        } else {
            this.s.a(3003, com.sankuai.meituan.mapsdk.core.render.b.f(0));
            this.s.a(MapConstant.LayerPropertyFlag_TextUnique, false, "collision");
            this.s.a(MapConstant.LayerPropertyFlag_IconAllowOverlap, true, "collision");
            this.s.a(MapConstant.LayerPropertyFlag_IconSize, 1.0f, "collision");
            this.s.a(4000, 1, "collision");
            this.s.a(MapConstant.LayerPropertyFlag_IconPitchAlignment, 0, "collision");
            this.s.a(MapConstant.LayerPropertyFlag_IconRotationAlignment, 0, "collision");
            this.s.a(MapConstant.LayerPropertyFlag_IconAnchor, 1, "collision");
            this.s.a(MapConstant.LayerPropertyFlag_MarkerSpacing, 10.0f, "collision");
            this.s.a(MapConstant.LayerPropertyFlag_MarkerAvoidScreen, false, "collision");
            this.s.a(MapConstant.LayerPropertyFlag_MarkerCustomCollision, true, "collision");
            int max = Math.max((int) this.z, 1);
            Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(0);
            canvas.drawRect(new Rect(0, 0, max, max), paint);
            this.L = BitmapDescriptorFactory.fromBitmap(createBitmap);
            this.j.e.a(this.t, this.L);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.L.getId());
            this.s.a(MapConstant.LayerPropertyFlag_IconImage, this.L.getId(), "collision");
            com.sankuai.meituan.mapsdk.core.render.model.h hVar = this.t;
            Object[] objArr3 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.core.render.model.h.c;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "d3dbcc9e362933bd73c4c98e19362d45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "d3dbcc9e362933bd73c4c98e19362d45");
            } else if (hVar.d != null) {
                hVar.d.refImages(hVar.e, arrayList);
            }
            a(this.t, this.B);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final void setPoints(List<LatLng> list, float f) {
        Object[] objArr = {list, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdb8a174f92b5b554ee8944b2c051b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdb8a174f92b5b554ee8944b2c051b96");
        } else if (f() || list == null || list.size() == 0) {
        } else {
            if (list != this.B) {
                a(this.t, list);
            }
            this.z = Math.abs(f);
            this.B = list;
            this.j.c.setArrowFeature(this.A, 0, this.B);
            this.j.c.setArrowWidth(this.A, f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final List<LatLng> getPoints() {
        return this.B;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final Object getTag() {
        return this.q;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setTag(Object obj) {
        this.q = obj;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void setLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e91d7e756bad5dcca4627ae60d54d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e91d7e756bad5dcca4627ae60d54d7");
            return;
        }
        super.setLevel(i);
        this.C = i;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final int getTopSurfaceColor() {
        return this.D;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final void setTopSurfaceColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24933898a7eeb5dbd2e9b5e6341ff802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24933898a7eeb5dbd2e9b5e6341ff802");
        } else if (f()) {
        } else {
            this.D = i;
            if (this.K) {
                this.j.c.setArrowLayerProperty(this.A, 1001, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            } else {
                this.j.c.setArrowLayerProperty(this.A, 2010, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final int getOutlineColor() {
        return this.F;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final void setOutlineColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c198b7e81793df1f4572f9e3e093375d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c198b7e81793df1f4572f9e3e093375d");
        } else if (f()) {
        } else {
            this.F = i;
            if (this.K) {
                this.j.c.setArrowLayerProperty(this.A, 3003, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            } else {
                this.j.c.setArrowLayerProperty(this.A, 2009, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final float getOutlineWidth() {
        return this.G;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final void setOutlineWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "346329dee7169ea92c72b9445fb1c4c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "346329dee7169ea92c72b9445fb1c4c4");
        } else if (f()) {
        } else {
            this.G = f;
            if (this.K) {
                this.j.c.setArrowLayerProperty(this.A, 3006, com.sankuai.meituan.mapsdk.core.utils.d.a(f));
            } else {
                this.j.c.setArrowLayerProperty(this.A, 2013, com.sankuai.meituan.mapsdk.core.utils.d.a(f));
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final void setHeight(float f, ArrowOptions.HeightUnit heightUnit) {
        Object[] objArr = {Float.valueOf(f), heightUnit};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a0b45b4a1e5db9321ac9098b96b3b3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a0b45b4a1e5db9321ac9098b96b3b3b");
        } else if (f() || this.K) {
        } else {
            this.H = Math.abs(f);
            this.I = heightUnit;
            this.j.c.setArrowLayerProperty(this.A, 2006, com.sankuai.meituan.mapsdk.core.utils.d.a(this.H));
            switch (this.I) {
                case Meter:
                    this.j.c.setArrowLayerProperty(this.A, 2007, 0);
                    return;
                case Pixel:
                    this.j.c.setArrowLayerProperty(this.A, 2007, 1);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final float getHeight() {
        return this.H;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final ArrowOptions.HeightUnit getHeightUnit() {
        return this.I;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final float getMinPitch() {
        return this.J;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final void setMinPitch(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400bac0de19406410286a652178c01fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400bac0de19406410286a652178c01fb");
        } else if (f() || this.K) {
        } else {
            this.J = f;
            this.j.c.setArrowLayerProperty(this.A, 2005, this.J);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final boolean is3DModel() {
        return this.K;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final void set3DModel(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d816f861a466e7e307df25d1b2c29b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d816f861a466e7e307df25d1b2c29b");
            return;
        }
        this.K = !z ? 1 : 0;
        setPoints(this.B, this.z);
        setVisible(this.m);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716b21184746678a197043dc73a06df1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716b21184746678a197043dc73a06df1");
        } else if (f()) {
        } else {
            super.setVisible(z);
            this.j.c.setArrowLayerVisibility(this.A, z);
            this.s.b(z);
            this.m = z;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final int getColor() {
        return this.E;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public final void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100c688300918383b6633b46ab3eba77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100c688300918383b6633b46ab3eba77");
        } else if (f() || this.K) {
        } else {
            this.E = i;
            this.j.c.setArrowLayerProperty(this.A, 2001, com.sankuai.meituan.mapsdk.core.render.b.f(i));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e0f4d409df88d8a3ba167df0508e44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e0f4d409df88d8a3ba167df0508e44");
            return;
        }
        super.setZIndex(f);
        this.j.c.setArrowLayerOrder(this.A, com.sankuai.meituan.mapsdk.core.utils.a.d(this.p), this.o.f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.core.interfaces.a
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e8af10085b22a15b6d75fcb205b9f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e8af10085b22a15b6d75fcb205b9f3");
        } else if (f()) {
        } else {
            super.setAlpha(f);
            this.j.c.setArrowLayerProperty(this.A, 2000, f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void setMaxZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10c2b46052f5c6b053489f7711a619f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10c2b46052f5c6b053489f7711a619f");
        } else if (f()) {
        } else {
            super.setMaxZoomLevel(f);
            this.j.c.setArrowLayerMaxZoom(this.A, f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void setMinZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2170e60438fb3bd5ab216e588f99559f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2170e60438fb3bd5ab216e588f99559f");
        } else if (f()) {
        } else {
            super.setMinZoomLevel(f);
            this.j.c.setArrowLayerMinZoom(this.A, f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b346b9a11f638c0d385d2d93029afecc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b346b9a11f638c0d385d2d93029afecc");
            return;
        }
        if (this.t != null && this.L != null) {
            this.j.e.b(this.t, this.L);
            this.L = null;
        }
        super.remove();
        this.j.c.removeAndDestroyArrow(this.A);
    }

    private void a(com.sankuai.meituan.mapsdk.core.render.model.h hVar, List<LatLng> list) {
        Object[] objArr = {hVar, list};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d1961fba10fddf0084efa5524e6b452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d1961fba10fddf0084efa5524e6b452");
            return;
        }
        hVar.d();
        hVar.c().a(com.sankuai.meituan.mapsdk.core.render.model.c.Line, list);
    }
}
