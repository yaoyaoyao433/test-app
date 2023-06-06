package com.sankuai.waimai.store.im.group.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGGroupBriefInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("brief_group_info_list")
    public List<GroupBriefInfo> briefGroupInfoList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class GroupBriefInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("group_id")
        public String groupId;
        @SerializedName("group_name")
        public String groupName;
        @SerializedName("labels")
        public List<Label> labels;
        @SerializedName("at_msg_status")
        public boolean noAtMeDisturbingStatus;
        @SerializedName("no_disturbing_status")
        public boolean noDisturbingStatus;
        @SerializedName("wm_poi_id")
        public String poiId;
        @SerializedName("profile_photo")
        public String profilePhoto;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Label implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("label_name")
        public String labelName;
        @SerializedName("label_type")
        public String labelType;
    }
}
