package com.sankuai.meituan.mapsdk.maps.interfaces;

import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface f {
    void addDynamicMapGeoJSON(String str, String str2);

    void addDynamicMapGeoJSONWithSize(String str, String str2, int i);

    void addDynamicMapImage(BitmapDescriptor bitmapDescriptor);

    void initDynamicMap();

    void initDynamicMap(String str);

    void removeDynamicMap();

    void removeDynamicMapFeature(String str, String str2);

    void removeDynamicMapGeoJSON(String str);

    void removeDynamicMapImage(BitmapDescriptor bitmapDescriptor);

    void removeDynamicMapImage(String str);

    void resetDynamicMapFeature(String str, String str2);

    void resetDynamicMapFeatures();

    void setDynamicMapFeature(String str, String str2, String str3, String str4);
}
