package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TitleMenuItemEntity {
    public static final int MENU_CODE_DOCTOR_QUERY = 13;
    public static final int MENU_CODE_MEMBER_CARD = 12;
    public static final int MENU_CODE_MESSAGE_CENTER = 4;
    public static final int MENU_CODE_ORDER = 11;
    public static final int MENU_CODE_PLATFORM_QUALITY = 14;
    public static final int MENU_CODE_RED_PACKET = 15;
    public static final int MENU_CODE_SHARE = 18;
    public static final int MENU_CODE_VOUCHER = 16;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("addtional_info")
    public AdditionalInfo additionalInfo;
    @SerializedName("has_red_point")
    public int hasRedPoint;
    @SerializedName("im_center_unread_count")
    public int imCenterUnreadCount;
    public transient int index;
    @SerializedName("is_server_control")
    public int isServerControl;
    @SerializedName("is_mt_scheme")
    public int is_mt_scheme;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String mScheme;
    @SerializedName("menu_code")
    public int menuCode;
    @SerializedName("pic_url")
    public String picUrl;
    public transient String scheme;
    @SerializedName("title")
    public String title;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class AdditionalInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("my_drug_guidance_history_info")
        public DoctorQueryInfo mDoctorQueryInfo;
        @SerializedName("drug_qualification_info")
        public PlatformQualityInfo mPlatformQualityInfo;
        @SerializedName("member_card_info")
        public MemberCardInfo memberCardInfo;
        @SerializedName("my_msg_info")
        public WmMsgInfo myMsgInfo;
        @SerializedName("my_sg_order_info")
        public MySgOrderInfo mySgOrderInfo;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class DoctorQueryInfo {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String url;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class MemberCardInfo {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String url;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class MySgOrderInfo {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String url;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class PlatformQualityInfo {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String url;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class WmMsgInfo {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String url;
        }
    }
}
