package com.meituan.msi.lib.map.view.model;

import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.Circle;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public LatLng b;
    public int c;
    public int d;
    public float e;
    public double f;
    public Circle g;
    public int h;
    public int i;
    public final MTMap j;
    public JsonObject k;

    public e(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ffc04783dcbb397dc7f718b36c532de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ffc04783dcbb397dc7f718b36c532de");
            return;
        }
        this.b = null;
        this.c = -7829368;
        this.d = -16711936;
        this.e = com.meituan.msi.util.f.b(10.0f);
        this.f = 0.0d;
        this.g = null;
        this.h = 2;
        this.i = 0;
        this.j = mTMap;
    }
}
