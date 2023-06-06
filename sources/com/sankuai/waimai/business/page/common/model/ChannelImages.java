package com.sankuai.waimai.business.page.common.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ChannelImages {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("channel_info")
    public ChannelInfo channelInfo;
    @SerializedName("channel_service_list")
    public ArrayList<ChannelService> channelServiceList;
    @SerializedName("channel_service")
    public ArrayList<ChannelService> channelServices;
}
