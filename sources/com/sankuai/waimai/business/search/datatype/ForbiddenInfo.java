package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ForbiddenInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("forbidden_additional_context")
    public String forbiddenAdditionalContext;
    @SerializedName("forbidden_code")
    public int forbiddenCode;
    @SerializedName("forbidden_icon")
    public String forbiddenIcon;
    @SerializedName("forbidden_msg")
    public String forbiddenMsg;
    @SerializedName("forbidden_remind_context")
    public String forbiddenRemindContext;
}
