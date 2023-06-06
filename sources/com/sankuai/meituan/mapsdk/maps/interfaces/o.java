package com.sankuai.meituan.mapsdk.maps.interfaces;

import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface o extends l {
    @Deprecated
    void destroy();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    String getId();

    Object getObject();

    LatLng getPosition();

    float getRotateAngle();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    float getZIndex();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    boolean isVisible();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void remove();

    void setObject(Object obj);

    void setPosition(LatLng latLng);

    void setRotateAngle(float f);

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void setVisible(boolean z);

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void setZIndex(float f);
}
