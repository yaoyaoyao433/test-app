package com.sankuai.waimai.business.im.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RiderImInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_latitude")
    public long address_latitude;
    @SerializedName("address_longitude")
    public long address_longitude;
    @SerializedName("app_id")
    public short appId;
    @SerializedName("booking_phone")
    public String bookPhone;
    @SerializedName("button_list")
    public List<a> buttonInfos;
    @SerializedName("panel_button_list")
    public List<i> buttonList;
    @SerializedName("toast")
    public b commonDialogData;
    @SerializedName("custom_msg_list")
    public com.sankuai.waimai.business.im.common.model.f[] customPhrases;
    @SerializedName("add_im_msg_hint")
    public String customReplyHint;
    @SerializedName("default_msg")
    public String[] defaultMessages;
    @SerializedName("delivery_type")
    public short deliveryType;
    @SerializedName("intro_content")
    public String guideContent;
    @SerializedName("intro_title")
    public String guideTitle;
    @SerializedName("input_field_msg")
    public String inputFieldMessage;
    @SerializedName("input_field_status")
    public int inputFieldStatus;
    @SerializedName("send_location_toast")
    public String locationToast;
    @SerializedName("send_location_url")
    public String locationUrl;
    @SerializedName("lockdown_aoi")
    public int lockdownAoi;
    @SerializedName("max_common_msg_number")
    public int maxCustomMsgNumber;
    @SerializedName("modify_address")
    public int modifyAddress;
    @SerializedName("orient")
    public i orient;
    @SerializedName("poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("recipient_phone")
    public String recipientPhone;
    @SerializedName("recipient_address")
    public String recipient_address;
    @SerializedName("recipient_name")
    public String recipient_name;
    @SerializedName("remind_seconds")
    public int remindSeconds;
    @SerializedName("remind_msg")
    public String remingMsg;
    @SerializedName("rider_dx_id")
    public long riderDxId;
    @SerializedName("rider_name")
    public String riderName;
    @SerializedName("rider_phone")
    public String riderPhoneNum;
    @SerializedName("rider_reassign_msg")
    public String riderReassignMsg;
    @SerializedName("session_status")
    public int sessionStatus;
    @SerializedName("show_emotion")
    public int showEmotion;
    @SerializedName("tip_msg")
    public String tipMessage;
    @SerializedName("use_privacy")
    public int usePrivacy;
    @SerializedName("user_dx_id")
    public long userDxId;
    @SerializedName("wm_common_data")
    public String wmCommonData;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("code")
        public int a;
        @SerializedName("title")
        public String b;
        @SerializedName("url")
        public String c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("title")
        public String a;
        @SerializedName("desc")
        public String b;
        @SerializedName("buttons")
        public List<a> c;
    }

    public RiderImInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "500e9d2e7e2524a1845e56c0e56282ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "500e9d2e7e2524a1845e56c0e56282ac");
        } else {
            this.appId = Short.MIN_VALUE;
        }
    }

    public i getButtons(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "650407dc25ac07df3f0e2f4455e7979c", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "650407dc25ac07df3f0e2f4455e7979c");
        }
        if (this.buttonList == null) {
            return null;
        }
        for (i iVar : this.buttonList) {
            if (i == iVar.a) {
                return iVar;
            }
        }
        return null;
    }
}
