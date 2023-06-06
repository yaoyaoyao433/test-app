package com.tencent.tencentmap.mapsdk.maps.model;

import android.graphics.Bitmap;
import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class OverSeaTileProvider extends UrlTileProvider {
    private String mProviderName;
    private int mProviderVersion;

    public abstract Bitmap getLogo(boolean z);

    public boolean onDayNightChange(boolean z) {
        return false;
    }

    public boolean onLanguageChange(Language language) {
        return false;
    }

    public OverSeaTileProvider(String str, int i) {
        this.mProviderName = str;
        this.mProviderVersion = i;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("图源名不能为空");
        }
    }

    public final String getProviderName() {
        return this.mProviderName;
    }

    public final int getProviderVersion() {
        return this.mProviderVersion;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("OverSeaProvider{");
        stringBuffer.append("mProviderName='");
        stringBuffer.append(this.mProviderName);
        stringBuffer.append('\'');
        stringBuffer.append(", mProviderVersion=");
        stringBuffer.append(this.mProviderVersion);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
