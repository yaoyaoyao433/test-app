package com.meituan.android.mrn.component.map.view.childview;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlay;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class k extends com.facebook.react.views.view.f implements d {
    public static ChangeQuickRedirect a;
    public List<WeightedLatLng> b;
    public int c;
    public float d;
    public int[] e;
    public float[] f;
    public MTMap g;
    public HeatOverlay h;

    public k(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5beb5cf5fd57586f6ac331527c5e0f83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5beb5cf5fd57586f6ac331527c5e0f83");
            return;
        }
        this.b = null;
        this.c = 30;
        this.d = 0.6f;
        this.e = new int[]{-16776961, -16711936, SupportMenu.CATEGORY_MASK};
        this.f = new float[]{0.3f, 0.5f, 0.8f};
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final void a(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4f1d750b1222c3545a5a161fd313ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4f1d750b1222c3545a5a161fd313ce");
        } else if (this.h != null) {
            this.h.remove();
            this.h = null;
            this.g = null;
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final com.sankuai.meituan.mapsdk.maps.interfaces.l getFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcdc4f5f50ff75d518391cb075fe2bc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.interfaces.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcdc4f5f50ff75d518391cb075fe2bc6");
        }
        if (this.h == null) {
            return null;
        }
        return this.h.getMapElement();
    }

    public final void setConfig(ReadableMap readableMap) {
        ReadableArray array;
        ReadableArray array2;
        WeightedLatLng weightedLatLng;
        ReadableMap map;
        LatLng b;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d9e623ae3568749a74d1908d49fcda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d9e623ae3568749a74d1908d49fcda");
        } else if (readableMap != null) {
            List<WeightedLatLng> list = null;
            this.b = null;
            this.c = 30;
            this.d = 0.6f;
            this.e = new int[]{-16776961, -16711936, SupportMenu.CATEGORY_MASK};
            this.f = new float[]{0.3f, 0.5f, 0.8f};
            if (readableMap.hasKey("weightedData")) {
                ReadableArray array3 = readableMap.getArray("weightedData");
                Object[] objArr2 = {array3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "894f3b4e3867dd305c83b77be36401c0", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "894f3b4e3867dd305c83b77be36401c0");
                } else if (array3 != null && array3.size() > 0) {
                    int size = array3.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        ReadableMap map2 = array3.getMap(i);
                        Object[] objArr3 = {map2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.component.map.utils.a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b9732f37eb4d4d301be8ccfc4845aa1d", RobustBitConfig.DEFAULT_VALUE)) {
                            weightedLatLng = (WeightedLatLng) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b9732f37eb4d4d301be8ccfc4845aa1d");
                        } else if (map2 == null || !com.meituan.android.mrn.component.map.utils.a.a(map2, "latLng") || (map = map2.getMap("latLng")) == null || (b = com.meituan.android.mrn.component.map.utils.a.b(map)) == null) {
                            weightedLatLng = null;
                        } else {
                            weightedLatLng = new WeightedLatLng(b, com.meituan.android.mrn.component.map.utils.a.a(map2, "intensity") ? map2.getDouble("intensity") : 1.0d);
                        }
                        if (weightedLatLng != null) {
                            arrayList.add(weightedLatLng);
                        }
                    }
                    list = arrayList;
                }
                this.b = list;
            }
            if (readableMap.hasKey("radius")) {
                this.c = readableMap.getInt("radius");
            }
            if (readableMap.hasKey("alpha")) {
                this.d = (float) readableMap.getDouble("alpha");
            }
            if (readableMap.hasKey("gradientStartPoints") && (array2 = readableMap.getArray("gradientStartPoints")) != null && array2.size() > 0) {
                int size2 = array2.size();
                this.f = new float[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    this.f[i2] = (float) array2.getDouble(i2);
                }
            }
            if (readableMap.hasKey("gradientColors") && (array = readableMap.getArray("gradientColors")) != null && array.size() > 0) {
                int size3 = array.size();
                this.e = new int[size3];
                for (int i3 = 0; i3 < size3; i3++) {
                    this.e[i3] = array.getInt(i3);
                }
            }
            if (this.h != null) {
                this.h.updateHeatOverlay(new HeatOverlayOptions().setWeightedData(this.b).setRadius(this.c).setAlpha(this.d).setColors(this.e).setStartPoints(this.f));
            }
        }
    }
}
