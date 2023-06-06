package com.sankuai.waimai.business.im.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.aa;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiImInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("b_app_id")
    public short bAppId;
    @SerializedName("biz_org_code")
    public String bizOrgCode;
    @SerializedName("biz_type")
    public int bizType;
    @SerializedName("booking_phone")
    public String bookPhone;
    @SerializedName("button_list")
    public List<a> buttonInfos;
    @SerializedName("custom_msg_list")
    public com.sankuai.waimai.business.im.common.model.f[] customPhrases;
    @SerializedName("add_im_msg_hint")
    public String customReplyHint;
    @SerializedName("default_msg")
    public String[] defaultMsgArray;
    @SerializedName("health_common_data")
    public String drugCommonData;
    @SerializedName("has_order")
    public boolean hasOrder;
    @SerializedName("input_field_msg")
    public String inputFieldMsg;
    @SerializedName("input_field_status")
    public int inputFieldStatus;
    @SerializedName("input_right_field")
    public List<b> inputRightConfigs;
    @SerializedName("is_new_fans")
    public int isNewFans;
    @SerializedName("last_order_view_id")
    public long lastOrderId;
    @SerializedName("max_common_msg_number")
    public int maxCustomMsgNumber;
    @SerializedName("order_card")
    public c orderCard;
    @SerializedName("order_status_content")
    public String orderStatusContent;
    @SerializedName("poi_dx_id")
    public long poiDxId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("poi_im_status")
    public int poiImStatus;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("poi_phone")
    public String poiPhone;
    @SerializedName("poi_picture_url")
    public String poiPicUrl;
    @SerializedName("recipient_phone")
    public String recipientPhone;
    @SerializedName("remind_conf")
    public List<d> remindConf;
    @SerializedName("remind_seconds")
    public int remindSeconds;
    @SerializedName("remind_msg")
    public String remingMsg;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String restaurantScheme;
    @SerializedName("scene_content")
    public HashMap<String, String> sceneContentMap;
    @SerializedName("biz_common_data")
    public String sgCommonData;
    @SerializedName("show_emotion")
    public int showEmotion;
    @SerializedName("spu_info")
    public e spuInfo;
    @SerializedName("poi_im_online_status_info")
    public f statusInfo;
    @SerializedName("tip_msg")
    public String tipMsg;
    @SerializedName("use_privacy")
    public int usePrivacy;
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
        @SerializedName("content")
        public String d;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String e;
        @SerializedName("style")
        public String f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("name")
        public String a;
        @SerializedName("link_url")
        public String b;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String c;
        @SerializedName("type")
        public int d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        @SerializedName("order_card_show")
        public boolean a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d implements Serializable {
        @SerializedName("remind_seconds")
        public int a;
        @SerializedName("remind_msg")
        public String b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("picture_url")
        public String b;
        @SerializedName("name")
        public String c;
        @SerializedName("price")
        public double d;
        @SerializedName("origin_price")
        public double e;
        @SerializedName("i_url")
        public String f;
        @SerializedName("spu_id")
        public long g;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class f implements Serializable {
        @SerializedName("status")
        public int a;
        @SerializedName("status_name")
        public String b;
        @SerializedName("status_tip")
        public String c;
    }

    public String getBizOrgCode() {
        return this.bizOrgCode;
    }

    public String getBizCommonData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99a7b9e933e02ea7366d057c245e2655", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99a7b9e933e02ea7366d057c245e2655") : aa.a(this.sgCommonData) ? "" : this.sgCommonData;
    }

    public String getBookPhone() {
        return this.bookPhone;
    }

    public int getPoiImStatus() {
        return this.poiImStatus;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getPoiPicUrl() {
        return this.poiPicUrl;
    }

    public String getPoiPhone() {
        return this.poiPhone != null ? this.poiPhone : "";
    }

    public int getUsePrivacy() {
        return this.usePrivacy;
    }

    public String getRecipientPhone() {
        return this.recipientPhone;
    }

    public HashMap<String, String> getSceneContentMap() {
        return this.sceneContentMap;
    }
}
