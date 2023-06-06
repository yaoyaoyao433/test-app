package com.sankuai.meituan.mapsdk.core.annotations;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.CircleHoleOptions;
import com.sankuai.meituan.mapsdk.maps.model.CircleOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m extends d implements com.sankuai.meituan.mapsdk.maps.interfaces.d {
    public static ChangeQuickRedirect y;
    private LatLng A;
    private float B;
    private float C;
    private boolean D;
    private double z;

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final boolean contains(@NonNull LatLng latLng) {
        return false;
    }

    public m(g gVar, CircleOptions circleOptions) {
        super(gVar);
        Object[] objArr = {gVar, circleOptions};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "774d3dd89a5d4c8a66660133d0366f53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "774d3dd89a5d4c8a66660133d0366f53");
            return;
        }
        String str = "";
        if (circleOptions == null) {
            str = "circleOptions == null";
        } else if (circleOptions.getCenter() == null) {
            str = "unavailable center";
        }
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
            return;
        }
        for (CircleHoleOptions circleHoleOptions : circleOptions.getHoles()) {
            this.g.add(h.a(circleHoleOptions.getCenter(), circleHoleOptions.getRadius(), 360));
        }
        this.s.a(false);
        setCenter(circleOptions.getCenter());
        setStrokeColor(circleOptions.getStrokeColor());
        setStrokeWidth(circleOptions.getStrokeWidth());
        a(circleOptions.isDottedLine());
        setFillColor(circleOptions.getFillColor());
        setVisible(circleOptions.isVisible());
        setRadius(circleOptions.getRadius());
        float circleAlpha = circleOptions.getCircleAlpha();
        Object[] objArr2 = {Float.valueOf(circleAlpha)};
        ChangeQuickRedirect changeQuickRedirect2 = y;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc394e1b0d2355109da0184fce9820fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc394e1b0d2355109da0184fce9820fa");
        } else if (!f()) {
            this.B = com.sankuai.meituan.mapsdk.core.utils.a.a(circleAlpha);
            this.s.a(5004, this.B);
        }
        float circleStrokeAlpha = circleOptions.getCircleStrokeAlpha();
        Object[] objArr3 = {Float.valueOf(circleStrokeAlpha)};
        ChangeQuickRedirect changeQuickRedirect3 = y;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf1f54c710d9fb5db90ccc61810684f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf1f54c710d9fb5db90ccc61810684f7");
        } else if (!f()) {
            this.C = com.sankuai.meituan.mapsdk.core.utils.a.a(circleStrokeAlpha);
            this.s.a(5011, this.C);
        }
        setLevel(circleOptions.getLevel());
        setZIndex(circleOptions.getZIndex());
        setMask(circleOptions.isMask());
        this.s.a(5001, 0);
        this.s.a(5008, 0);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final LatLng getCenter() {
        return this.A;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setCenter(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379e1fc42fbdb4f061d1e8bf959b4126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379e1fc42fbdb4f061d1e8bf959b4126");
        } else if (f() || latLng == null || latLng.equals(this.A)) {
        } else {
            this.A = latLng;
            this.u.a(com.sankuai.meituan.mapsdk.core.render.model.c.Point, latLng);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final double getRadius() {
        return this.z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setRadius(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598b09eb6dee472f9e489248aa3ac5a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598b09eb6dee472f9e489248aa3ac5a0");
        } else if (f()) {
        } else {
            this.z = Math.abs(d);
            this.s.a(5000, (float) (d / this.j.c.b(this.A.latitude)));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setMask(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9a11961925a2b789c3383ac1d15deb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9a11961925a2b789c3383ac1d15deb5");
        } else if (f()) {
        } else {
            this.D = z;
            this.s.a(5015, this.D);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final boolean isMask() {
        return this.D;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8af266e23848d80bfcaa635c25bd20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8af266e23848d80bfcaa635c25bd20");
        } else if (f()) {
        } else {
            this.s.a(5009, com.sankuai.meituan.mapsdk.core.utils.d.a(f));
            this.d = f;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a76d0ebaca80661525acd1f5e1ecf894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a76d0ebaca80661525acd1f5e1ecf894");
        } else if (f()) {
        } else {
            this.s.a(5010, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            this.e = i;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "345c8b85c1e7fdd53517842c7bc7ab38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "345c8b85c1e7fdd53517842c7bc7ab38");
        } else if (f()) {
        } else {
            this.s.a(5002, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            this.f = i;
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

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "883675170f66dc35dd2a8cfdc9880801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "883675170f66dc35dd2a8cfdc9880801");
        } else if (f()) {
        } else {
            if (z) {
                this.s.a(5012, h.b);
            } else {
                this.s.a(5012, h.c);
            }
            this.c = z;
        }
    }
}
