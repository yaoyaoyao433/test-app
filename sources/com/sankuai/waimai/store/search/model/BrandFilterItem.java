package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BrandFilterItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("index")
    public int index;
    @SerializedName("secondGuidedQuery")
    public String secondGuidedQuery;
    @SerializedName("showText")
    public String showText;
}
