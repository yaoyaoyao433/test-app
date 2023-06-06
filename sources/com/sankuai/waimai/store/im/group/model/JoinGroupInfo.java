package com.sankuai.waimai.store.im.group.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class JoinGroupInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("group_id")
    public long groupId;
    @SerializedName("new_join")
    public boolean newJoin;
    @SerializedName("scheme_url")
    public String schemeUrL;
}
