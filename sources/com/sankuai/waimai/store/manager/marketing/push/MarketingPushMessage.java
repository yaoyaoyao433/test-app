package com.sankuai.waimai.store.manager.marketing.push;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MarketingPushMessage implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("json_data")
    public MarketingPushModel data;
    @SerializedName("module_id")
    public String moduleID;
    @SerializedName("msg_id")
    public String msgID;
}
