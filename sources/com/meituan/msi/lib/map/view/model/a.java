package com.meituan.msi.lib.map.view.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.Arc;
import com.sankuai.meituan.mapsdk.maps.model.ArcOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    LatLng b;
    LatLng c;
    LatLng d;
    float e;
    int f;
    Arc g;
    private final MTMap h;
    private LatLng i;
    private double j;
    private float k;
    private float l;

    public a(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d586887f56220b1a55a623e3d7499e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d586887f56220b1a55a623e3d7499e5");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 10.0f;
        this.f = -16777216;
        this.i = null;
        this.j = 0.0d;
        this.k = 0.0f;
        this.l = 0.0f;
        this.g = null;
        this.h = mTMap;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24bb7b8d3173b430ed866cbee3d8beac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24bb7b8d3173b430ed866cbee3d8beac");
            return;
        }
        this.g = this.h.addArcEnhance(new ArcOptions(this.b, this.c, this.d).strokeWidth(this.e).strokeColor(this.f));
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b847b05c2de1c0e67dae3756d6fbc58d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b847b05c2de1c0e67dae3756d6fbc58d");
        } else if (this.g != null) {
            this.g.remove();
        }
    }
}
