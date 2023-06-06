package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.content.Context;
import android.support.annotation.NonNull;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface n extends l, p {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        BitmapDescriptor a(float f);
    }

    @Deprecated
    void destroy();

    float getAnchorU();

    float getAnchorV();

    int getInfoWindowLevel();

    int getInfoWindowOffsetX();

    int getInfoWindowOffsetY();

    float getInfoWindowZIndex();

    MarkerOptions.MarkerName getMarkerName();

    Object getObject();

    int getOffsetX();

    int getOffsetY();

    MarkerOptions getOptions(Context context);

    Object getPlatformMarker();

    LatLng getPosition();

    float getRotateAngle();

    float getScale();

    String getSnippet();

    Object getTag();

    String getTitle();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    float getZIndex();

    void hideInfoWindow();

    boolean isDraggable();

    boolean isInfoWindowAllowOverlap();

    boolean isInfoWindowEnable();

    boolean isInfoWindowIgnorePlacement();

    boolean isInfoWindowShown();

    boolean isSelect();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    boolean isVisible();

    void refreshInfoWindow();

    void removeRotateIconInterceptor();

    void setAllowOverlap(boolean z);

    void setAlpha(float f);

    void setAnchor(float f, float f2);

    void setClickable(boolean z);

    void setDraggable(boolean z);

    void setIgnorePlacement(boolean z);

    void setInfoWindowAllowOverlap(boolean z);

    void setInfoWindowEnable(boolean z);

    void setInfoWindowIgnorePlacement(boolean z);

    void setInfoWindowOffset(int i, int i2);

    void setInfoWindowOffset(int i, int i2, boolean z);

    void setInfoWindowZIndex(float f);

    void setMarkerName(MarkerOptions.MarkerName markerName);

    @Deprecated
    void setMarkerName(String str);

    @Deprecated
    void setMarkerNameColor(int i);

    @Deprecated
    void setMarkerNameSize(int i);

    @Deprecated
    void setNameAroundIcon(boolean z);

    void setObject(Object obj);

    void setOffset(int i, int i2);

    void setOptions(MarkerOptions markerOptions);

    void setPosition(@NonNull LatLng latLng);

    void setPositionByPixels(int i, int i2);

    void setRotateAngle(float f);

    void setRotateIconInterceptor(a aVar);

    void setScale(float f);

    void setSelect(boolean z);

    void setSnippet(@NonNull String str);

    void setTag(Object obj);

    void setTitle(@NonNull String str);

    void setToTop();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void setVisible(boolean z);

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void setZIndex(float f);

    void showInfoWindow();

    void startAnimation(Animation animation);
}
