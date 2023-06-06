package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface AoiLayer extends IOverlay {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnAoiLayerLoadListener {
        void onAoiLayerLoaded(boolean z, AoiLayer aoiLayer);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    String getId();

    LatLng location();

    String name();

    boolean remove();
}
