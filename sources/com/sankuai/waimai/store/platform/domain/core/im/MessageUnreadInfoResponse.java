package com.sankuai.waimai.store.platform.domain.core.im;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MessageUnreadInfoResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("message_info")
    public MessageUnreadInfo messageUnreadInfo;
}
