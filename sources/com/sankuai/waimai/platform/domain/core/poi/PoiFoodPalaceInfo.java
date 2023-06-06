package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiFoodPalaceInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String content;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("is_show")
    public boolean isShow;
    public String url;
}
