package com.sankuai.waimai.business.im.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMCommonDataInfo {
    @SerializedName("is_use_dynamic")
    public boolean a;
    @SerializedName("im_dynamic_cards")
    public String b;
    public List<IMDynamicCard> c;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
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
        @SerializedName("native_version")
        public NativeVersion nativeVersion;
        @SerializedName("template_id")
        public String templateId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class NativeVersion {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("mt")
        public String mtVersion;
        @SerializedName("wm")
        public String wmVersion;
    }
}
