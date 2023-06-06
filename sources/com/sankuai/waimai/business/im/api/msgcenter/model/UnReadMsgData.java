package com.sankuai.waimai.business.im.api.msgcenter.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class UnReadMsgData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("message_info")
    public UnReadMsgEntity unReadMsgEntity;
}
