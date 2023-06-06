package com.meituan.msi.lib.map.view.model;

import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Polygon;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a;
    public final MTMap b;
    public ArrayList<LatLng> c;
    public int d;
    public int e;
    public float f;
    public int g;
    public int h;
    public Polygon i;
    public int j;
    public boolean k;
    public JsonObject l;
    public int[] m;

    public o(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e2546ff48c4537b73b39bc65c11434", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e2546ff48c4537b73b39bc65c11434");
            return;
        }
        this.c = null;
        this.d = -16711936;
        this.e = -16711936;
        this.f = com.meituan.msi.util.f.b(10.0f);
        this.g = 2;
        this.h = 0;
        this.i = null;
        this.k = false;
        this.m = new int[]{0, 0};
        this.b = mTMap;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bc71376dd1ffe41ee5ccc9e3edb98e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bc71376dd1ffe41ee5ccc9e3edb98e8");
        } else if (this.i != null) {
            this.i.remove();
        }
    }
}
