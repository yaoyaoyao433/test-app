package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class FeedbackInfo implements Serializable {
    public static final int DYNAMIC_TYPE = 2;
    public static final int PERMANENT_TYPE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("style_config")
    public FeedbackStyle styleConfig;
    @SerializedName("survey_id")
    public long surveyId;
    @SerializedName("type")
    public int type;
    @SerializedName("url")
    public String url;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FeedbackStyle implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bg_color")
        public String bgColor;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("sub_title")
        public String subTitle;
        @SerializedName("title")
        public String title;
    }
}
