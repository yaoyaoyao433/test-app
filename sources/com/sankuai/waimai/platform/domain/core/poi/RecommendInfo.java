package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RecommendInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    @Expose
    public String iconUrl;
    @SerializedName("recommend_reason")
    @Expose
    public String reason;
    @SerializedName("type")
    public int type;
}
