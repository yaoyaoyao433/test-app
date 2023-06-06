package com.meituan.android.uptodate.model;

import android.support.annotation.Keep;
import com.meituan.android.turbo.annotations.JsonType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
@JsonType
/* loaded from: classes3.dex */
public class VersionInfo implements Serializable {
    @Deprecated
    public static final String P1 = "p1";
    @Deprecated
    public static final String P2 = "p2";
    @Deprecated
    public static final String P3 = "p3";
    @Deprecated
    public static final String P4 = "p4";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appHttpsUrl;
    @Deprecated
    public String appurl;
    public String changeLog;
    public Map<String, String> configJson;
    public int currentVersion;
    public DiffInfo diffInfo;
    public transient Exception exception;
    public int forceupdate;
    @Deprecated
    public int installAlertFrequency;
    public boolean isManual;
    public boolean isUpdated;
    public String marketPackage;
    public String marketUri;
    public String md5;
    public int netLimit;
    public int notifyFree;
    public int notifyInterval;
    public int notifyTimes;
    public List<PeakPeriod> peakPeriodList;
    public long publishId;
    public int publishType;
    public String updateTitle;
    @Deprecated
    public String versionUpgradeControl;
    public String versionname;

    /* compiled from: ProGuard */
    @Keep
    @JsonType
    /* loaded from: classes3.dex */
    public static class DiffInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String channel;
        public String diffHttpsUrl;
        @Deprecated
        public String diffUrl;
        public Map<String, String> extraInfo;
        public String md5Diff;
        public String md5Final;
        public String md5New;
    }

    /* compiled from: ProGuard */
    @Keep
    @JsonType
    /* loaded from: classes3.dex */
    public static class PeakPeriod implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String endTime;
        public String startTime;
    }

    public VersionInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f7da72d8729397b2b3a4b09f90a53fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f7da72d8729397b2b3a4b09f90a53fe");
            return;
        }
        this.changeLog = "";
        this.versionname = "";
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fca232c0c157b54c3e03e212a5181de3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fca232c0c157b54c3e03e212a5181de3");
        }
        return "VersionInfo{isUpdated=" + this.isUpdated + ", currentVersion=" + this.currentVersion + ", changeLog='" + this.changeLog + "', versionname='" + this.versionname + "', appurl='" + this.appurl + "', appHttpsUrl='" + this.appHttpsUrl + "', md5='" + this.md5 + "', forceupdate=" + this.forceupdate + ", diffInfo=" + this.diffInfo + ", exception=" + this.exception + ", versionUpgradeControl='" + this.versionUpgradeControl + "', installAlertFrequency=" + this.installAlertFrequency + ", marketUri='" + this.marketUri + "', marketPackage='" + this.marketPackage + "', publishType=" + this.publishType + ", publishId=" + this.publishId + ", updateTitle='" + this.updateTitle + "', notifyFree=" + this.notifyFree + ", notifyInterval=" + this.notifyInterval + ", notifyTimes=" + this.notifyTimes + ", netLimit=" + this.netLimit + ", isManual=" + this.isManual + ", peakPeriodList=" + this.peakPeriodList + ", configJson=" + this.configJson + '}';
    }
}
