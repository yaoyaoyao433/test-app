package com.sankuai.meituan.mapsdk.core.interfaces;

import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OnMapChangedListener {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MapChange {
    }

    void a(int i, CameraPosition cameraPosition);
}
