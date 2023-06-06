package com.meituan.msi.lib.map.view.model;

import android.support.v4.internal.view.SupportMenu;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlay;
import com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public HeatOverlay b;
    public List<WeightedLatLng> c;
    public int d;
    public float e;
    public int[] f;
    public float[] g;
    public final MTMap h;
    private int i;

    public k(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d47d54d8862a6bc9256bb6ae0b217b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d47d54d8862a6bc9256bb6ae0b217b");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = 30;
        this.e = 0.6f;
        this.f = new int[]{-16776961, -16711936, SupportMenu.CATEGORY_MASK};
        this.g = new float[]{0.3f, 0.5f, 0.8f};
        this.i = -1;
        this.h = mTMap;
    }
}
