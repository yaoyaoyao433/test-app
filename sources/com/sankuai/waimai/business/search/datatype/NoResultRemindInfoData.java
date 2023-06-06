package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class NoResultRemindInfoData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("no_result_remind_additional_context")
    public String noResultRemindAdditionalContext;
    @SerializedName("no_result_remind_context")
    public String noResultRemindContext;
    @SerializedName("no_result_remind_icon")
    public String noResultRemindIcon;
}
