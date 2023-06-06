package com.sankuai.waimai.business.order.api.store.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public final class ActivityEntryInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("id")
    public String id;
    @SerializedName("jump_url")
    public String jumpUrl;
}
