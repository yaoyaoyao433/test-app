package com.tencent.tencentmap.mapsdk.maps.model;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CustomLayerOptions {
    private String mLayerId;
    private String mLayerVersion;

    public CustomLayerOptions layerId(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mLayerId = str;
        }
        return this;
    }

    public String getLayerId() {
        return this.mLayerId;
    }
}
