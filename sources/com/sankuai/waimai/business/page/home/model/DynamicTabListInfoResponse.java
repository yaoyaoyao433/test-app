package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.lottie.LottieResItem;
import com.sankuai.waimai.platform.domain.core.response.ServerExpResponse;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DynamicTabListInfoResponse extends ServerExpResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bubble_list")
    public List<TabBubbleInfo> bubbles;
    @SerializedName("dynamic_tab_list")
    public List<DynamicTabInfo> dynamicTabList;
    @SerializedName("lottie_res")
    public List<LottieResItem> mLottieResItemList;
    @SerializedName(AlitaMonitorCenter.AlitaMonitorConst.BundleLoad.TAG_KEY_RESOURCE_TYPE)
    public int resourceType;
}
