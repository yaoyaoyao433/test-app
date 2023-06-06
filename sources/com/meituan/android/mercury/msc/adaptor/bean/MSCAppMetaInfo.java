package com.meituan.android.mercury.msc.adaptor.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MSCAppMetaInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appId;
    private BasicInfo basicInfo;
    private String buildId;
    private transient int from;
    private MSCPackageInfo mainPackage;
    private String mainPath;
    private String minSdkVersion;
    private MSCPackageInfo mscSdk;
    private String publishId;
    private List<MSCPackageInfo> subPackages;
    private String version;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class QrcodeConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setBuildId(String str) {
        this.buildId = str;
    }

    public void setMainPath(String str) {
        this.mainPath = str;
    }

    public String getMainPath() {
        return this.mainPath;
    }

    public String getBuildId() {
        return this.buildId;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setPublishId(String str) {
        this.publishId = str;
    }

    public String getPublishId() {
        return this.publishId;
    }

    public String getMinSdkVersion() {
        return this.minSdkVersion;
    }

    public void setMinSdkVersion(String str) {
        this.minSdkVersion = str;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public BasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public void setSubPackages(List<MSCPackageInfo> list) {
        this.subPackages = list;
    }

    public List<MSCPackageInfo> getSubPackages() {
        return this.subPackages;
    }

    public void setMscSdk(MSCPackageInfo mSCPackageInfo) {
        this.mscSdk = mSCPackageInfo;
    }

    public MSCPackageInfo getMscSdk() {
        return this.mscSdk;
    }

    public void setMainPackage(MSCPackageInfo mSCPackageInfo) {
        this.mainPackage = mSCPackageInfo;
    }

    public MSCPackageInfo getMainPackage() {
        return this.mainPackage;
    }

    public int getFrom() {
        return this.from;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class BasicInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int cacheInterval;
        private Map<String, Object> extraConfig;
        private String icon;
        private boolean isInner;
        private String name;
        private QrcodeConfig qrcodeConfig;
        private int shareSupported;

        public void setName(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public void setCacheInterval(int i) {
            this.cacheInterval = i;
        }

        public int getCacheInterval() {
            return this.cacheInterval;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public String getIcon() {
            return this.icon;
        }

        public void setShareSupported(int i) {
            this.shareSupported = i;
        }

        public int getShareSupported() {
            return this.shareSupported;
        }

        public void setIsInner(boolean z) {
            this.isInner = z;
        }

        public boolean getIsInner() {
            return this.isInner;
        }

        public void setQrcodeConfig(QrcodeConfig qrcodeConfig) {
            this.qrcodeConfig = qrcodeConfig;
        }

        public QrcodeConfig getQrcodeConfig() {
            return this.qrcodeConfig;
        }

        public void setExtraConfig(Map<String, Object> map) {
            this.extraConfig = map;
        }

        public Map<String, Object> getExtraConfig() {
            return this.extraConfig;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e75a4ba38526107fd0338eb4dcb27a50", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e75a4ba38526107fd0338eb4dcb27a50");
            }
            return "BasicInfo{name='" + this.name + "', cacheInterval=" + this.cacheInterval + ", icon='" + this.icon + "', shareSupported=" + this.shareSupported + ", isInner=" + this.isInner + ", qrcodeConfig=" + this.qrcodeConfig + ", extraConfig=" + this.extraConfig + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Prefetch {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Location location;
        private String url;

        public void setLocation(Location location) {
            this.location = location;
        }

        public Location getLocation() {
            return this.location;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String getUrl() {
            return this.url;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Location {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String sceneToken;

        public void setSceneToken(String str) {
            this.sceneToken = str;
        }

        public String getSceneToken() {
            return this.sceneToken;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82b9ec2f11652d85918924bd98b1aef0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82b9ec2f11652d85918924bd98b1aef0");
        }
        return "MSCAppMetaInfo{appId='" + this.appId + "', buildId='" + this.buildId + "', version='" + this.version + "', publishId='" + this.publishId + "', minSdkVersion='" + this.minSdkVersion + "', basicInfo=" + this.basicInfo + ", subPackages=" + this.subPackages + ", mscSdk=" + this.mscSdk + ", mainPackage=" + this.mainPackage + ", from=" + this.from + ", mainPath='" + this.mainPath + "'}";
    }
}
