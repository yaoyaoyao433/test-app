package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
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
    public String iconUrl;
    @SerializedName("recommend_reason")
    public String reason;
    @SerializedName("type")
    public int type;
}
