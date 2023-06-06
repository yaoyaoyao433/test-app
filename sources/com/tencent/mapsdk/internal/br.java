package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet;
import com.tencent.tencentmap.mapsdk.maps.model.IEmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IRotateAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IScaleAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.ITranslateAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class br extends bn {
    @Override // com.tencent.mapsdk.internal.bn
    protected final void p() {
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final String x() {
        return "4.5.5.2.6";
    }

    public br(Context context, TencentMapOptions tencentMapOptions, bo boVar) {
        super(context, tencentMapOptions, boVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public IRotateAnimation createRotateAnimation(float f, float f2, float f3, float f4, float f5) {
        return new hi(f, f2, f3, f4, f5);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public IScaleAnimation createScaleAnimation(float f, float f2, float f3, float f4) {
        return new hj(f, f2, f3, f4);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public ITranslateAnimation createTranslateAnimation(LatLng latLng) {
        return new hk(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public IEmergeAnimation createEmergeAnimation(LatLng latLng) {
        return new hh(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public IAnimationSet createAnimationSet(boolean z) {
        return new hg(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public IAlphaAnimation createAlphaAnimation(float f, float f2) {
        return new he(f, f2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public HeatMapTileProvider createHeatMapTileProvider(HeatMapTileProvider.Builder builder) {
        return new bv(builder);
    }
}
