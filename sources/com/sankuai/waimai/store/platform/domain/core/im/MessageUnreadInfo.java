package com.sankuai.waimai.store.platform.domain.core.im;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MessageUnreadInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("h5_url")
    public String h5Url;
    @SerializedName(RemoteMessageConst.MSGTYPE)
    public int messageType;
    @SerializedName("show_icon")
    public int showIcon;
    @SerializedName("unread_count")
    public int unReadCount;
}
