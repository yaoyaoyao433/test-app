package com.meituan.msi.lib.map.view.model;

import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Polyline;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q {
    public static ChangeQuickRedirect a;
    public List<LatLng> b;
    int c;
    public int d;
    public Polyline e;
    PolylineOptions.Text f;
    boolean g;
    public JsonObject h;
    boolean i;
    private float j;
    private float k;
    private PolylineOptions.PatternItem l;
    private final MTMap m;
    private boolean n;
    private boolean o;

    public q(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60ac7494920291140fccde797c537e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60ac7494920291140fccde797c537e9");
            return;
        }
        this.b = new ArrayList();
        this.j = com.meituan.msi.util.f.b(32.0f);
        this.c = 2;
        this.k = 0.0f;
        this.l = null;
        this.d = -1;
        this.n = false;
        this.o = false;
        this.m = mTMap;
    }

    public final void a(List<LatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7275f752f468c04daeb38b01c90a7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7275f752f468c04daeb38b01c90a7e");
            return;
        }
        this.b = list;
        if (this.e != null) {
            this.e.setPoints(list);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afc6a395918c5728ede50ada1ebd42d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afc6a395918c5728ede50ada1ebd42d3");
            return;
        }
        float f = i;
        this.j = f;
        if (this.e != null) {
            this.e.setWidth(f);
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d6b1f3f77b8926a3b63d7a48c1e2f36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d6b1f3f77b8926a3b63d7a48c1e2f36");
            return;
        }
        this.k = f;
        if (this.e != null) {
            this.e.setZIndex(f);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8194ee15ba9646c7248f1bb37365bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8194ee15ba9646c7248f1bb37365bea");
            return;
        }
        this.n = z;
        if (this.e != null) {
            this.e.setAvoidable(z);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0ddc8bc4d9539071485486427f10c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0ddc8bc4d9539071485486427f10c4");
            return;
        }
        this.o = z;
        if (this.e != null) {
            this.e.setClickable(z);
        }
    }

    public final void a(PolylineOptions.PatternItem patternItem) {
        Object[] objArr = {patternItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b676180f28ad8d79d5a09a4ca7d7651", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b676180f28ad8d79d5a09a4ca7d7651");
            return;
        }
        this.l = patternItem;
        if (this.e != null) {
            this.e.setPattern(patternItem);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93af9b7acab9d5cf0f6a60d7cfecf2ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93af9b7acab9d5cf0f6a60d7cfecf2ff");
            return;
        }
        this.e = this.m.addPolyline(new PolylineOptions().addAll(this.b).width(this.j).pattern(this.l).level(this.c).zIndex(this.k).text(this.f).lineCap(this.g).clickable(this.o).avoidable(this.n));
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b1b55156164d33d1163c11cfa33dc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b1b55156164d33d1163c11cfa33dc7");
        } else if (this.e != null) {
            this.e.remove();
        }
    }
}
