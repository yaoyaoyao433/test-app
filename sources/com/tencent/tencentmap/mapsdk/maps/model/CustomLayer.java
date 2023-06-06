package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Removable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface CustomLayer extends Removable, IOverlay {
    void clearDiskCache();

    void reload();
}
