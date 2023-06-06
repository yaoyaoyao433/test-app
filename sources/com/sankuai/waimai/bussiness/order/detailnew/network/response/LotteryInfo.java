package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class LotteryInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("left_icon_url")
    public String left_icon_url;
    @SerializedName(RegionLinkDao.TABLENAME)
    public String link;
    @SerializedName("report")
    public Map<String, Object> report;
    @SerializedName("right_icon_url")
    public String right_icon_url;
}
