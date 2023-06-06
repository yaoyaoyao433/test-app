package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGCommonDataInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4493792678794396680L;
    @SerializedName("is_use_dynamic")
    public boolean isUserDynamic;
    public List<IMDynamicCard> mIMDynamicCards;
    @SerializedName("im_dynamic_cards")
    public String mIMDynamicCardsString;
    @SerializedName("phone_list_with_label")
    public List<PoiPhoneInfo> mPoiPhoneInfoList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class IMDynamicCard {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("is_analysis_data")
        public boolean isAnalysisData;
        @SerializedName("is_show_avatar")
        public boolean isShowAvatar = true;
        @SerializedName("module_id")
        public String moduleId;
        @SerializedName("msg_code")
        public String msgCode;
        @SerializedName("native_id")
        public String nativeId;
        @SerializedName("template_id")
        public String templateId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiPhoneInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("phone_number")
        public String mSGPhoneNumber;
        @SerializedName("phone_type")
        public String mSGPhoneType;
    }
}
