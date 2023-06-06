package com.tencent.mapsdk.core;

import android.support.annotation.Keep;
import android.view.ViewGroup;
import com.tencent.mapsdk.internal.bu;
import com.tencent.tencentmap.mapsdk.maps.BaseMapView;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public interface MapDelegate<C extends TencentMapContext, M extends TencentMap, V extends bu> extends BaseMapView.MapViewProxy {
    M createMap(C c);

    V createMapView(C c, ViewGroup viewGroup);

    C getMapContext();

    V getMapRenderView();
}
