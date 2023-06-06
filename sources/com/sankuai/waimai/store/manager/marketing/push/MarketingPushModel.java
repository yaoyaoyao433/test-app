package com.sankuai.waimai.store.manager.marketing.push;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MarketingPushModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("biz_source")
    public String bizSource;
    @SerializedName("insert_front")
    public boolean insertFront;
    @SerializedName("page_type_list")
    public List<Integer> pageTypeList;
    @SerializedName(PushConstants.TASK_ID)
    public String taskId;
}
