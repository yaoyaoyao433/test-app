package com.sankuai.waimai.pouch.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PouchDynamicAd implements Serializable {
    public static final int AD_TYPE_CPC = 2;
    public static final int AD_TYPE_CPM = 7;
    public static final int AD_TYPE_CPT = 1;
    public static final int AD_TYPE_NEW_CPT = 4;
    public static final String CONTAINER_ID_POUCH_COMMON = "pouch_common_container";
    public static final String CONTAINER_ID_POUCH_MACH_POPUP = "pouch_mach_popup";
    public static final String CONTAINER_ID_WM_COMMON = "wm_common_pouch_container";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_container_id")
    public String adContainerId;
    @SerializedName("template_id")
    public String adTemplateId;
    @SerializedName("ad_type")
    public int adType;
    @SerializedName("business_name")
    public String businessName;
    public String defaultAdContainerId;
    @SerializedName("default_id")
    public String defaultID;
    @SerializedName("index")
    public int index;
    @SerializedName("layout_info")
    public String layoutInfo;
    @Nullable
    private transient com.sankuai.waimai.pouch.a mPouchAds;
    @SerializedName("string_data")
    public String stringData;
    @SerializedName("view_type")
    public int view_type;

    public PouchDynamicAd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a33e464097cee06e5c8a686b3755a3f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a33e464097cee06e5c8a686b3755a3f3");
        } else {
            this.index = -1;
        }
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ede73cf13e547e635d5f8f4b1b4d14c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ede73cf13e547e635d5f8f4b1b4d14c")).booleanValue();
        }
        if (obj != null && (obj instanceof PouchDynamicAd)) {
            return TextUtils.equals(((PouchDynamicAd) obj).stringData, this.stringData);
        }
        return false;
    }

    @Nullable
    public com.sankuai.waimai.pouch.a getPouchAds() {
        return this.mPouchAds;
    }

    public void setPouchAds(@Nullable com.sankuai.waimai.pouch.a aVar) {
        this.mPouchAds = aVar;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48bdc27cf61d8d4a6bc6643330318bb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48bdc27cf61d8d4a6bc6643330318bb8");
        }
        return "PouchDynamicAd{adType=" + this.adType + ", stringData='" + this.stringData + "', adTemplateId='" + this.adTemplateId + "', defaultID='" + this.defaultID + "', view_type=" + this.view_type + '}';
    }
}
