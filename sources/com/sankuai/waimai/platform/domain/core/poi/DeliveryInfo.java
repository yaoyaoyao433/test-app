package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DeliveryInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String mIcon;
    @SerializedName("text")
    public String mText;
    @SerializedName("type")
    public int mType;
}
