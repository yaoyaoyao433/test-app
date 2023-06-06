package com.sankuai.waimai.guidepop;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GuidePopInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("log_data")
    public Object logData;
    @SerializedName("view_data")
    public GuidePopData viewData;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class DSPStrategy {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("frequency")
        public Frequency frequency;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class Frequency {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("count")
        public int count;
        @SerializedName("frequency_key")
        public String frequencyKey;
        @SerializedName("time")
        public long time;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class GuidePopData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("circle_pic")
        public String circlePic;
        @SerializedName("dsp_strategy")
        public DSPStrategy dspStrategy;
        @SerializedName("link_url")
        public String linkUrl;
        @SerializedName("location_area")
        public String locationArea;
        @SerializedName("location_flag")
        public String locationFlag;
        @SerializedName("main_pic")
        public String mainPic;
        @SerializedName("sequence")
        public int sequence;
        @SerializedName("sub_pic")
        public String subPic;

        @NotNull
        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9530e9b8eaf1492f6724a6d82524149", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9530e9b8eaf1492f6724a6d82524149");
            }
            return "GuidePopData{mainPic='" + this.mainPic + "', subPic='" + this.subPic + "', circlePic='" + this.circlePic + "', locationFlag='" + this.locationFlag + "', locationArea='" + this.locationArea + "', sequence=" + this.sequence + ", linkUrl='" + this.linkUrl + "'}";
        }
    }
}
