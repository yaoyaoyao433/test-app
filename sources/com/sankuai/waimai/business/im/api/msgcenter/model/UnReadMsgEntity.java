package com.sankuai.waimai.business.im.api.msgcenter.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class UnReadMsgEntity implements Serializable {
    public static int MSG_TYPE_COUNT = 1;
    public static int MSG_TYPE_DOT = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("h5_url")
    public String h5Url;
    @SerializedName(RemoteMessageConst.MSGTYPE)
    public int msgType;
    @SerializedName("show_icon")
    public int showIcon;
    @SerializedName("unread_count")
    public int unReadCount;
}
