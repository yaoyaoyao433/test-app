package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.content.Context;
import android.support.annotation.NonNull;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface r extends l {
    void eraseTo(int i, LatLng latLng);

    void eraseTo(int i, LatLng latLng, boolean z);

    float getAlpha();

    @Deprecated
    int getColor();

    @Deprecated
    PolylineOptions getOptions();

    @Deprecated
    PolylineOptions getOptions(Context context);

    PolylineOptions.PatternItem getPattern();

    List<LatLng> getPoints();

    Object getTag();

    PolylineOptions.Text getText();

    float getWidth();

    @Deprecated
    void insertPoint(int i, LatLng latLng);

    boolean isAvoidable();

    boolean isClickable();

    boolean isDottedLine();

    void setAlpha(float f);

    void setAvoidable(boolean z);

    void setClickable(boolean z);

    @Deprecated
    void setColor(int i);

    @Deprecated
    void setColorTexture(String str);

    @Deprecated
    void setColors(int[] iArr, int[] iArr2);

    @Deprecated
    void setCustomTextureIndex(List<Integer> list);

    @Deprecated
    void setCustomTextureList(List<BitmapDescriptor> list);

    void setDashPattern(int[] iArr);

    @Deprecated
    void setEraseable(boolean z);

    void setOptions(PolylineOptions polylineOptions);

    void setPattern(PolylineOptions.PatternItem patternItem);

    void setPoints(@NonNull List<LatLng> list);

    void setTag(Object obj);

    void setText(PolylineOptions.Text text);

    void setWidth(float f);

    void startAnimation(Animation animation, LatLng latLng);
}
