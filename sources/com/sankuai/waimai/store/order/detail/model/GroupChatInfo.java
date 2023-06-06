package com.sankuai.waimai.store.order.detail.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GroupChatInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -895489019152943529L;
    @SerializedName("im_group_chat_entrance_info")
    public String imGroupChatInfo;
}
