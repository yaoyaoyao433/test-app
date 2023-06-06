package com.tencent.mapsdk.core;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.tencent.mapsdk.internal.ha;
import com.tencent.mapsdk.internal.s;
import com.tencent.mapsdk.internal.u;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class MapDelegateFactoryImpl implements s {
    @Override // com.tencent.mapsdk.internal.s
    @Keep
    public MapDelegate createDelegate(@NonNull Context context, @NonNull TencentMapOptions tencentMapOptions, @NonNull ViewGroup viewGroup) {
        MapDelegate mapDelegate;
        TencentMapOptions.IMapKernel mapKernel = tencentMapOptions.getMapKernel();
        Class<?> a = ha.a("com.tencent.mapsdk.navi.MapKernelNavi", mapKernel.getClass().getClassLoader());
        Class<?> a2 = ha.a("com.tencent.mapsdk.compat.MapKernelCompat", mapKernel.getClass().getClassLoader());
        if (a2 == null || a2 != mapKernel.getClass()) {
            mapDelegate = (a == null || a != mapKernel.getClass()) ? (MapDelegate) ha.a(ha.a("com.tencent.mapsdk.vector.VectorMapDelegateProxy", MapDelegate.class, u.a().b()), context, tencentMapOptions, viewGroup) : (MapDelegate) ha.a(ha.a("com.tencent.mapsdk.navi.VectorMapNaviDelegateProxy", MapDelegate.class, u.a().b()), context, tencentMapOptions, viewGroup);
        } else {
            mapDelegate = (MapDelegate) ha.a(ha.a("com.tencent.mapsdk.compat.VectorMapCompatDelegateProxy", MapDelegate.class, u.a().b()), context, tencentMapOptions, viewGroup);
        }
        if (mapDelegate != null) {
            mapDelegate.onCreated();
        }
        return mapDelegate;
    }
}
