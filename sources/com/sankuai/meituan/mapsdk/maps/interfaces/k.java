package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.content.Context;
import android.view.View;
import com.sankuai.meituan.mapsdk.maps.AbsMTMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface k {
    int getCacheClearState(Context context);

    View getInnerMapView(Context context);

    AbsMTMap getMap();

    int getMapType();

    m getMapView();

    boolean isApiTracking();
}
