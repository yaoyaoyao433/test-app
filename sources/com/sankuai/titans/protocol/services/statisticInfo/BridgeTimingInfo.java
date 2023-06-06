package com.sankuai.titans.protocol.services.statisticInfo;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.JsonUtils;
import com.sankuai.titans.protocol.utils.UrlUtils;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BridgeTimingInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long frontReceivedTimestamp;
    private String method;
    private long nativeFinishedTimestamp;
    private long nativeReceivedTimestamp;
    private long nativeStartedTimestamp;
    private String pageOriginalUrl;
    private String pageUrl;
    private String source;

    public BridgeTimingInfo(String str, String str2, String str3, String str4, long j, long j2, long j3, long j4) {
        Object[] objArr = {str, str2, str3, str4, new Long(j), new Long(j2), new Long(j3), new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9d255614d3286f666bfd50bf491a56d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9d255614d3286f666bfd50bf491a56d");
            return;
        }
        this.method = str;
        this.source = str2;
        this.pageOriginalUrl = str3;
        this.pageUrl = str4;
        this.nativeReceivedTimestamp = j;
        this.nativeStartedTimestamp = j2;
        this.nativeFinishedTimestamp = j3;
        this.frontReceivedTimestamp = j4;
    }

    public String getPageOriginalUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a57181053f7b8a8aeda43ecde60d800", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a57181053f7b8a8aeda43ecde60d800") : UrlUtils.clearQueryAndFragment(this.pageOriginalUrl);
    }

    public String getPageUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "def9f5409b2cddd084d1df5b08841b27", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "def9f5409b2cddd084d1df5b08841b27") : UrlUtils.clearQueryAndFragment(this.pageUrl);
    }

    public String getSource() {
        return this.source;
    }

    public String getMethod() {
        return this.method;
    }

    public long getNativeReceivedTimestamp() {
        return this.nativeReceivedTimestamp;
    }

    public long getNativeStartTimestamp() {
        return this.nativeStartedTimestamp;
    }

    public long getNativeFinishedTimestamp() {
        return this.nativeFinishedTimestamp;
    }

    public long getFrontReceivedTimestamp() {
        return this.frontReceivedTimestamp;
    }

    public long beforeExecTimeCost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f459e5e658fa07eae353640038a4c484", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f459e5e658fa07eae353640038a4c484")).longValue() : this.nativeStartedTimestamp - this.nativeReceivedTimestamp;
    }

    public long duringExecTimeCost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b700a52113d9c4a04476d57f1b9d97d", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b700a52113d9c4a04476d57f1b9d97d")).longValue() : this.nativeFinishedTimestamp - this.nativeStartedTimestamp;
    }

    public long afterExecTimeCost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c60d7b8b23d90d1aea065dfd78475e1e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c60d7b8b23d90d1aea065dfd78475e1e")).longValue() : this.frontReceivedTimestamp - this.nativeFinishedTimestamp;
    }

    public long totalTimeCost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2cb258b44c7c3f56cab95fa304d7df3", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2cb258b44c7c3f56cab95fa304d7df3")).longValue() : this.frontReceivedTimestamp - this.nativeReceivedTimestamp;
    }

    public String getBridgeTimingDetailsJsonStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88feb69665347e5da0be79823bd852d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88feb69665347e5da0be79823bd852d1");
        }
        String json = JsonUtils.getExcludeGson().toJson(new BridgeTimingDetails(Long.valueOf(beforeExecTimeCost()), Long.valueOf(duringExecTimeCost()), Long.valueOf(afterExecTimeCost())));
        return TextUtils.equals(json, "{}") ? "" : json;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class BridgeTimingDetails {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("afterExecTime")
        @Expose
        private Long afterExecTimeCost;
        @SerializedName("beforeExecTime")
        @Expose
        private Long beforeExecTimeCost;
        @SerializedName("duringExecTime")
        @Expose
        private Long duringExecTimeCost;

        public BridgeTimingDetails(Long l, Long l2, Long l3) {
            this.beforeExecTimeCost = l;
            this.duringExecTimeCost = l2;
            this.afterExecTimeCost = l3;
        }
    }
}
