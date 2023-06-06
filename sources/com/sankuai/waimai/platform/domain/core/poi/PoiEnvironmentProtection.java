package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiEnvironmentProtection implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("display")
    public boolean display;
    @SerializedName("displayName")
    public String displayName;
    @SerializedName("url")
    public String url;
}
