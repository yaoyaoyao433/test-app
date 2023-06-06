package com.sankuai.waimai.business.page.common.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ChannelSubCategory implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long code;
    @SerializedName("icon_url")
    public String iconUrl;
    public String name;
    public int quantity;
    @SerializedName("resource_id")
    public int resourceId;
}
