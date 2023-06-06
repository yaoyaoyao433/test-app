package com.sankuai.waimai.store.mrn.dialog.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MRNMessageResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("message_data")
    public Object messageData;
    @SerializedName(RemoteMessageConst.MSGTYPE)
    public String messageType;
}
