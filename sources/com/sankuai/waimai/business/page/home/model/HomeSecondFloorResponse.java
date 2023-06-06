package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Size;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class HomeSecondFloorResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Size bgPicSize;
    public Size effectPicSize;
    public Size guidePicSize;
    public HomeSecondFloorData homeSecondFloorData;
    @SerializedName("home_second_floor_data")
    public String originData;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class Frequency {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(PushConstants.INTENT_ACTIVITY_NAME)
        public boolean activity;
        @SerializedName("count")
        public int count;
        @SerializedName("hours")
        public int hours;
        @SerializedName("interval_minute")
        public int intervalMinutes;
        @SerializedName("version")
        public int version;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class HomeSecondFloorData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("frequency")
        public Frequency frequency;
        @SerializedName("guide_second")
        public float guideSecond;
        @SerializedName("resource")
        public Resource resource;
        @SerializedName("trace_info")
        public Map<String, Object> traceInfo;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class Resource {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("module_id")
        public int moduleId;
        @SerializedName("resource_id")
        public int resourceId;
        @SerializedName(Constants.EventType.VIEW)
        public View view;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static final class ViewShowType {
        public static final int BOTTOM = 1;
        public static final int DEFAULT = 0;
        public static final int DEFAULT_CURVE = 3;
        public static final int MIDDLE = 2;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class View {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id")
        public String activityId;
        @SerializedName("bg_pic")
        private String bgPic;
        @SerializedName("effect_pic")
        private String effectPic;
        @SerializedName("guide_pic")
        private String guidePic;
        @SerializedName("guide_text")
        public String guideText;
        @SerializedName("guide_text_color")
        public String guideTextColor;
        @SerializedName("schema")
        public String schema;
        public int screenW;
        @SerializedName("show_type")
        public int showType;

        public View() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3ae4af1848528e72f34255a0569d7c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3ae4af1848528e72f34255a0569d7c4");
            } else {
                this.screenW = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a);
            }
        }

        public String getCdnBgPic() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "507687c80f36e899ac66916bef9f32d7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "507687c80f36e899ac66916bef9f32d7") : com.sankuai.waimai.business.page.home.widget.twolevel.d.a(this.bgPic, this.screenW);
        }

        public String getCdnGuidePic() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4544d888ba09d7556fa78ae4803148e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4544d888ba09d7556fa78ae4803148e") : com.sankuai.waimai.business.page.home.widget.twolevel.d.a(this.guidePic, this.screenW);
        }

        public String getCdnEffectPic() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47b0b8ecb97db5d8532131eb6c9369a3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47b0b8ecb97db5d8532131eb6c9369a3") : com.sankuai.waimai.business.page.home.widget.twolevel.d.a(this.effectPic, this.screenW);
        }

        public boolean isDataValidate() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a231033daeb81512f286340ba1dee87e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a231033daeb81512f286340ba1dee87e")).booleanValue() : (this.showType == 0 || this.showType == 3) ? TextUtils.isEmpty(getCdnBgPic()) || TextUtils.isEmpty(getCdnEffectPic()) || TextUtils.isEmpty(this.schema) : TextUtils.isEmpty(getCdnBgPic()) || TextUtils.isEmpty(this.schema);
        }
    }

    public boolean shouldDisplayEffectPic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5b0dcfbd45e25b3fb855c5d3fb3ab9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5b0dcfbd45e25b3fb855c5d3fb3ab9c")).booleanValue();
        }
        if (this.homeSecondFloorData == null || this.homeSecondFloorData.resource == null || this.homeSecondFloorData.resource.view == null) {
            return false;
        }
        return this.homeSecondFloorData.resource.view.showType == 0 || this.homeSecondFloorData.resource.view.showType == 3;
    }

    public boolean isGuideConfigValidate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bc40f8e1d8a5f16b626a848d55a4444", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bc40f8e1d8a5f16b626a848d55a4444")).booleanValue();
        }
        if (this.homeSecondFloorData == null || this.homeSecondFloorData.resource == null || this.homeSecondFloorData.resource.view == null) {
            return false;
        }
        if (this.homeSecondFloorData.resource.moduleId != 3 || TextUtils.isEmpty(this.homeSecondFloorData.resource.view.guideTextColor)) {
            return ((this.homeSecondFloorData.resource.view.showType != 2 && this.homeSecondFloorData.resource.view.showType != 1) || TextUtils.isEmpty(this.homeSecondFloorData.resource.view.guideText) || TextUtils.isEmpty(this.homeSecondFloorData.resource.view.guideTextColor)) ? false : true;
        }
        return true;
    }

    public boolean isShouldDrawCurve() {
        if (this.homeSecondFloorData == null || this.homeSecondFloorData.resource == null || this.homeSecondFloorData.resource.view == null) {
            return false;
        }
        return this.homeSecondFloorData.resource.view.showType == 2 || this.homeSecondFloorData.resource.view.showType == 1 || this.homeSecondFloorData.resource.view.showType == 3;
    }

    public boolean isMiddleOrBottomShowType() {
        if (this.homeSecondFloorData == null || this.homeSecondFloorData.resource == null || this.homeSecondFloorData.resource.view == null) {
            return false;
        }
        return this.homeSecondFloorData.resource.view.showType == 2 || this.homeSecondFloorData.resource.view.showType == 1;
    }

    public String getConfigGuideText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bf19ca0f0cc0d3d33866e316bfb8b20", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bf19ca0f0cc0d3d33866e316bfb8b20");
        }
        if (isGuideConfigValidate()) {
            return this.homeSecondFloorData.resource.view.guideText;
        }
        return null;
    }

    public String getConfigGuideTextColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1fa30602eb95dd27264b58bce3dde54", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1fa30602eb95dd27264b58bce3dde54");
        }
        if (isGuideConfigValidate()) {
            return this.homeSecondFloorData.resource.view.guideTextColor;
        }
        return null;
    }

    public boolean isResourceReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3bf41451b5175c29875e70a576819ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3bf41451b5175c29875e70a576819ef")).booleanValue();
        }
        StringBuilder sb = new StringBuilder("isResourceReady");
        sb.append((this.bgPicSize == null || this.effectPicSize == null) ? false : true);
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor----", sb.toString(), new Object[0]);
        if (this.homeSecondFloorData == null || this.homeSecondFloorData.resource == null || this.homeSecondFloorData.resource.view == null) {
            return false;
        }
        return (this.homeSecondFloorData.resource.view.showType == 0 || this.homeSecondFloorData.resource.view.showType == 3) ? (this.bgPicSize == null || this.effectPicSize == null) ? false : true : this.bgPicSize != null;
    }

    public boolean isGuideEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb14526a99c2e28fcd8f30adb793b4f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb14526a99c2e28fcd8f30adb793b4f1")).booleanValue();
        }
        if (this.homeSecondFloorData == null || this.homeSecondFloorData.resource == null || this.homeSecondFloorData.resource.view == null) {
            return false;
        }
        return (this.homeSecondFloorData.resource.view.showType == 0 || this.homeSecondFloorData.resource.view.showType == 3) ? (this.bgPicSize == null || this.effectPicSize == null || this.guidePicSize == null || getGuideTime() <= 0) ? false : true : (this.bgPicSize == null || this.guidePicSize == null || getGuideTime() <= 0) ? false : true;
    }

    public long getGuideTime() {
        try {
            long j = this.homeSecondFloorData.guideSecond * 1000.0f;
            if (j < 1500) {
                j = 1500;
            }
            return j > MetricsAnrManager.ANR_THRESHOLD ? MetricsAnrManager.ANR_THRESHOLD : j;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
