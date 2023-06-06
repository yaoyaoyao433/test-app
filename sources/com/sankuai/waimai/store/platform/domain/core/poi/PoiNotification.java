package com.sankuai.waimai.store.platform.domain.core.poi;

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
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("link_url")
    public String linkUrl;
    @SerializedName("show_strategy")
    public int strategy;
    @SerializedName("sub_content")
    public String subContent;
    @SerializedName("event_type")
    public int type;

    public static ArrayList<PoiNotification> parseList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "977a710dc9d8282f0e32949cef5acfee", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "977a710dc9d8282f0e32949cef5acfee");
        }
        if (str != null) {
            return (ArrayList) new Gson().fromJson(str, new TypeToken<ArrayList<PoiNotification>>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.PoiNotification.1
            }.getType());
        }
        return null;
    }
}
