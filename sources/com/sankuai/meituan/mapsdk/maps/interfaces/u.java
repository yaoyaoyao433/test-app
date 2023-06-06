package com.sankuai.meituan.mapsdk.maps.interfaces;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface u extends l {
    void clearTileCache();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    String getId();

    void reload();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void remove();

    void setDiskCacheDir(String str);

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void setZIndex(float f);
}
