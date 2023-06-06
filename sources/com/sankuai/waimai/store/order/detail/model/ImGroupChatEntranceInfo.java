package com.sankuai.waimai.store.order.detail.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ImGroupChatEntranceInfo {
    public static final int SG_GROUP_TYPE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("button_text")
    public String buttonText;
    @SerializedName("group_name")
    public String groupName;
    @SerializedName("group_profile_photo")
    public String groupProfilePhoto;
    @SerializedName("group_type")
    public int groupType;
    @SerializedName("guide_image")
    public String guideImage;
    @SerializedName("guide_language")
    public String guideLanguage;
}
