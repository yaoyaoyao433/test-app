package com.sankuai.waimai.store.im.group.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class UserGroupImInfo implements Serializable {
    public static final int USER_IN_GROUP = 0;
    public static final int USER_NOT_IN_GROUP = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("administrator_list")
    public List<GroupAdministrator> administrators;
    @SerializedName("group_id")
    public String groupId;
    @SerializedName("group_label")
    public String groupLabel;
    @SerializedName("group_name")
    public String groupName;
    @SerializedName("group_notice")
    public String groupNotice;
    @SerializedName("group_notice_edit_time")
    public String groupNoticeEditTime;
    @SerializedName("group_notice_tip_text")
    public String groupNoticeTipText;
    @SerializedName("group_notice_scheme_url")
    public String groupNoticeUrl;
    @SerializedName("group_report_msg_switch")
    public int groupReportMsgSwitch;
    @SerializedName("group_report_scheme_url")
    public String groupReportSchemeUrl;
    @SerializedName("group_scheme_url")
    public String groupSchemeUrl;
    @SerializedName("user_in_group_status")
    public int groupState;
    @SerializedName("im_group_dynamic_data")
    public String group_dynamic_data;
    public boolean isFirstEnterPage;
    @SerializedName("member_count")
    public int membeCount;
    @SerializedName("module_list")
    public List<BaseModuleDesc> moduleDescList;
    @SerializedName("no_disturbing_status")
    public boolean noDisturbingStatus;
    @SerializedName("poi_buz_type")
    public int poiBuzType;
    @SerializedName("poi_id")
    public String poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("poi_picture_url")
    public String poiPictureUrl;
    @SerializedName("poi_scheme_url")
    public String poiSchemeUrl;
    @SerializedName("profile_photo")
    public String profilePhoto;
    public String showGroupCoupon;
    @SerializedName("single_chat_scheme_url")
    public String singleChatSchemeUrl;
    @SerializedName("warning_text")
    public String warningText;
}
