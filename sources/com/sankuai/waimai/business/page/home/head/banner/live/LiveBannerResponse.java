package com.sankuai.waimai.business.page.home.head.banner.live;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class LiveBannerResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("template_id")
    public String templateId;
    @SerializedName("windows_card_info")
    public Map<String, Object> windowCardInfo;
}
