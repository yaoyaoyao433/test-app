package com.sankuai.titans.protocol.services.statisticInfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LifeCycleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long endTime;
    private final String eventNodeName;
    private final String pluginName;
    private final String pluginVersion;
    private String scheme;
    private String sourceUrl;
    private long startTime;
    private String targetUrl;
    private String titansVersion;
    private final LifeCycleType type;
    private String webviewType;
    private String webviewVersion;

    public LifeCycleInfo(String str, String str2, String str3, LifeCycleType lifeCycleType, String str4) {
        Object[] objArr = {str, str2, str3, lifeCycleType, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89de73fc1b397c221c957e2076c4f32a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89de73fc1b397c221c957e2076c4f32a");
            return;
        }
        this.pluginName = str;
        this.pluginVersion = str2;
        this.titansVersion = str3;
        this.type = lifeCycleType;
        this.eventNodeName = str4;
    }

    public LifeCycleType getType() {
        return this.type;
    }

    public String getPluginName() {
        return this.pluginName;
    }

    public String getPluginVersion() {
        return this.pluginVersion;
    }

    public String getEventNodeName() {
        return this.eventNodeName;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getTitansVersion() {
        return this.titansVersion;
    }

    public String getWebviewType() {
        return this.webviewType;
    }

    public String getWebviewVersion() {
        return this.webviewVersion;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setSourceUrl(String str) {
        this.sourceUrl = str;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }

    public void setStartTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d4c9fa3bac7097a448f732d290dbaa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d4c9fa3bac7097a448f732d290dbaa0");
        } else {
            this.startTime = j;
        }
    }

    public void setEndTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "074c26dd9d0fec0dc629b20b1737e304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "074c26dd9d0fec0dc629b20b1737e304");
        } else {
            this.endTime = j;
        }
    }

    public void setWebviewType(String str) {
        this.webviewType = str;
    }

    public void setWebviewVersion(String str) {
        this.webviewVersion = str;
    }

    public long timeCost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d18e6318697143fe0180d49fde60fedf", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d18e6318697143fe0180d49fde60fedf")).longValue() : this.endTime - this.startTime;
    }
}
