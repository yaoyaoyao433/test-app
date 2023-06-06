package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiNotification implements Serializable {
    public static final int POI_NOTIFICATION_TYPE_BUSY = 7;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("click_action")
    public int clickAction;
    @SerializedName("content")
    public String content;
    @SerializedName("disappear_strategy")
    public int disappearStrategy;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("link_url")
    public String linkUrl;
    @SerializedName("remain_time")
    public int remainTime;
    @SerializedName("show_strategy")
    public int strategy;
    @SerializedName("sub_content")
    public String subContent;
    @SerializedName("event_type")
    public int type;

    public static ArrayList<PoiNotification> parseList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3720e726fd28714afa354eed06e0fc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3720e726fd28714afa354eed06e0fc6");
        }
        if (str != null) {
            return (ArrayList) new Gson().fromJson(str, new TypeToken<ArrayList<PoiNotification>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.PoiNotification.1
            }.getType());
        }
        return null;
    }
}
