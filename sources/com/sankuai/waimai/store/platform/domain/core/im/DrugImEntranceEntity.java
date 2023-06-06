package com.sankuai.waimai.store.platform.domain.core.im;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugImEntranceEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("show_red_point")
    public boolean showNewUserRedPoint;
    @SerializedName("stid")
    public String stid;
    @SerializedName("subscript")
    public String subscript;
    @SerializedName("subscript_url")
    public String subscriptUrl;
    @SerializedName("title")
    public String text;
    @SerializedName("type")
    public int type;
}
