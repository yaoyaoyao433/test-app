package com.sankuai.titans.protocol.services.statisticInfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.UrlUtils;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AccessTimingInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String durationStart;
    private long durationStartTime;
    private Map<String, Object> extraParams;
    private int isTitansInited;
    private boolean needReportConnectTime;
    private long netConnectTime;
    private String pageUrl;
    private String referer;
    private String refererSource;
    private String scheme;
    private long timeCost;
    private String titansVersion;
    private String type;

    public AccessTimingInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "037cd4ab5c6827dfac7eb9bbe169d10b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "037cd4ab5c6827dfac7eb9bbe169d10b");
        } else {
            this.titansVersion = str;
        }
    }

    public void setIsTitansInited(int i) {
        this.isTitansInited = i;
    }

    public String getType() {
        return this.type;
    }

    public void startPoint(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22c82d0dccf806c5f0f699f1858d42dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22c82d0dccf806c5f0f699f1858d42dc");
            return;
        }
        this.durationStart = str;
        this.durationStartTime = j;
    }

    public void endPoint(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af122a1f2a7f3b631c0213ff3e96f25d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af122a1f2a7f3b631c0213ff3e96f25d");
            return;
        }
        this.type = str;
        this.timeCost = j;
    }

    public void setPageUrl(String str) {
        this.pageUrl = str;
    }

    public void setPageReferer(String str) {
        this.referer = str;
    }

    public String getPageReferer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7207fbf4144fa575f33cf79a3891b3d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7207fbf4144fa575f33cf79a3891b3d") : UrlUtils.clearQueryAndFragment(this.referer);
    }

    public void setPageRefererSource(String str) {
        this.refererSource = str;
    }

    public String getPageRefererSource() {
        return this.refererSource;
    }

    public int getIsTitansInited() {
        return this.isTitansInited;
    }

    public String getPageUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ca1906d1992711b7d70da11d19938ca", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ca1906d1992711b7d70da11d19938ca") : UrlUtils.clearQueryAndFragment(this.pageUrl);
    }

    public long getDurationStartTime() {
        return this.durationStartTime;
    }

    public String getDurationStart() {
        return this.durationStart;
    }

    public String getTitansVersion() {
        return this.titansVersion;
    }

    public long getTimeCost() {
        return this.timeCost;
    }

    public void setTimeCost(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b32d19d7f2b829fae95216b843496f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b32d19d7f2b829fae95216b843496f97");
        } else {
            this.timeCost = j;
        }
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public String getScheme() {
        return this.scheme;
    }

    public long getNetConnectTime() {
        return this.netConnectTime;
    }

    public void setNetConnectTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b361a926b85e79269fdcbb34ea1854f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b361a926b85e79269fdcbb34ea1854f");
            return;
        }
        this.needReportConnectTime = true;
        this.netConnectTime = j;
    }

    public boolean isNeedReportConnectTime() {
        return this.needReportConnectTime;
    }

    public Map<String, Object> getExtraParams() {
        return this.extraParams;
    }

    public AccessTimingInfo setExtraParams(Map<String, Object> map) {
        this.extraParams = map;
        return this;
    }
}
