package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGActivityFilterEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public String code;
    public boolean hasExposed;
    public boolean hasSelected;
    @SerializedName(DMKeys.KEY_SELECTED)
    public ButtonInfo selectedInfo;
    @SerializedName("un_selected")
    public ButtonInfo unselectedInfo;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ButtonInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_name")
        public String activityText;
        @SerializedName("activity_text_color")
        public String activityTextColor;
        @SerializedName("bg_color")
        public String bgColor;
        @SerializedName("border_color")
        public String borderColor;
        @SerializedName("text_suffix")
        public String cancelText;
        @SerializedName("text")
        public String text;
        @SerializedName("text_color")
        public String textColor;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String textIcon;
    }
}
