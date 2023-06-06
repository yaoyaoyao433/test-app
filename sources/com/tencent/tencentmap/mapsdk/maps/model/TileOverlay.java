package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface TileOverlay extends IOverlay {
    void clearTileCache();

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    String getId();

    void reload();

    void remove();

    void setDiskCacheDir(String str);

    void setZindex(int i);
}
