package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class LiveBaseInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 576011341660080651L;
    @SerializedName("icon_desc")
    public String iconDesc;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("is_live")
    public boolean isLive;
    @SerializedName("live_id")
    public String liveId = "-999";
    @SerializedName("live_simple_desc")
    public String liveSimpleDesc;
    @SerializedName("online_count")
    public int onlineCount;
}
