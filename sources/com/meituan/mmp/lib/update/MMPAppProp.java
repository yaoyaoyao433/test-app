package com.meituan.mmp.lib.update;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.dio.easy.DioFile;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.mmp.lib.utils.ap;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class MMPAppProp implements Parcelable {
    public static final int APP_CACHE_VERSION = 0;
    public static final int APP_CACHE_VERSION_OUTDATED = 4;
    public static final int APP_CHECKED_NEW_VERSION = 2;
    public static final int APP_CHECKED_NO_NEW_VERSION = 1;
    public static final int APP_DOWNGRADE_VERSION = 3;
    private static final String PREFIX_APP = "/__app/";
    public static final String PREFIX_FRAMEWORK = "/__framework/";
    private static final String PREFIX_MAIN_APP = "/__app/main_app/";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("name")
    public String appName;
    @SerializedName("appid")
    public String appid;
    @SerializedName("buildId")
    public String buildId;
    @SerializedName(NetLogConstants.Environment.BUILD_VERSION)
    public String buildVersion;
    public long checkTime;
    @SerializedName("externalConfig")
    public ExternalConfig externalConfig;
    @SerializedName("extraConfig")
    public ExtraConfig extraConfig;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String iconPath;
    @SerializedName("debugPkg")
    private boolean isDebug;
    public boolean isDioPackage;
    @SerializedName("isInner")
    public boolean isInner;
    public transient int loadType;
    @SerializedName(alternate = {"main_package"}, value = "dioMainPackage")
    public MMPPackageInfo mainPackage;
    @SerializedName(alternate = {"mmpsdk"}, value = "dioMmpsdk")
    public MMPPackageInfo mmpSdk;
    @SerializedName("publishId")
    public String publishId;
    @SerializedName("shareSupported")
    public int shareSupported;
    public ArrayList<MMPPackageInfo> subPackages;
    @SerializedName("version")
    public String version;
    public static final Parcelable.Creator<MMPAppProp> CREATOR = new Parcelable.Creator<MMPAppProp>() { // from class: com.meituan.mmp.lib.update.MMPAppProp.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MMPAppProp createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c6e9891548c47f7d52557d869f83c85", RobustBitConfig.DEFAULT_VALUE) ? (MMPAppProp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c6e9891548c47f7d52557d869f83c85") : new MMPAppProp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MMPAppProp[] newArray(int i) {
            return new MMPAppProp[i];
        }
    };
    private static final int PREFIX_APP_LENGTH = 7;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MMPAppProp(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd8e975000f276a66fcfd868dbd4460c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd8e975000f276a66fcfd868dbd4460c");
            return;
        }
        this.checkTime = 0L;
        this.subPackages = new ArrayList<>();
        this.isDioPackage = false;
        this.appid = parcel.readString();
        this.appName = parcel.readString();
        this.iconPath = parcel.readString();
        this.version = parcel.readString();
        this.shareSupported = parcel.readInt();
        this.extraConfig = (ExtraConfig) parcel.readParcelable(ExtraConfig.class.getClassLoader());
        this.checkTime = parcel.readLong();
        this.mmpSdk = (MMPPackageInfo) parcel.readParcelable(MMPPackageInfo.class.getClassLoader());
        this.mainPackage = (MMPPackageInfo) parcel.readParcelable(MMPPackageInfo.class.getClassLoader());
        this.isInner = parcel.readByte() != 0;
        this.subPackages = parcel.createTypedArrayList(MMPPackageInfo.CREATOR);
        this.isDebug = parcel.readByte() != 0;
        this.isDioPackage = parcel.readByte() != 0;
        this.buildVersion = parcel.readString();
        this.externalConfig = (ExternalConfig) parcel.readParcelable(MMPPackageInfo.class.getClassLoader());
        this.loadType = parcel.readInt();
        this.buildId = parcel.readString();
        this.publishId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1d2a76eb3a85828e695d12df8206134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1d2a76eb3a85828e695d12df8206134");
            return;
        }
        parcel.writeString(this.appid);
        parcel.writeString(this.appName);
        parcel.writeString(this.iconPath);
        parcel.writeString(this.version);
        parcel.writeInt(this.shareSupported);
        parcel.writeParcelable(this.extraConfig, i);
        parcel.writeLong(this.checkTime);
        parcel.writeParcelable(this.mmpSdk, i);
        parcel.writeParcelable(this.mainPackage, i);
        parcel.writeByte(this.isInner ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.subPackages);
        parcel.writeByte(this.isDebug ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDioPackage ? (byte) 1 : (byte) 0);
        parcel.writeString(this.buildVersion);
        parcel.writeParcelable(this.externalConfig, i);
        parcel.writeInt(this.loadType);
        parcel.writeString(this.buildId);
        parcel.writeString(this.publishId);
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class ExtraConfig implements Parcelable {
        public static final Parcelable.Creator<ExtraConfig> CREATOR = new Parcelable.Creator<ExtraConfig>() { // from class: com.meituan.mmp.lib.update.MMPAppProp.ExtraConfig.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ExtraConfig createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29e607d223cb36be263a0194045ce141", RobustBitConfig.DEFAULT_VALUE) ? (ExtraConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29e607d223cb36be263a0194045ce141") : (ExtraConfig) com.meituan.mmp.lib.utils.j.b.fromJson(parcel.readString(), (Class<Object>) ExtraConfig.class);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ExtraConfig[] newArray(int i) {
                return new ExtraConfig[i];
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("hotline")
        public String hotline;
        @SerializedName("introduction")
        public String introduction;
        @SerializedName("moreInfoUrl")
        public String moreInfoUrl;
        @SerializedName("shareSummary")
        public String shareSummary;
        @SerializedName("shareUrl")
        public String shareUrl;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ExtraConfig(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f51e75b7e7a24a3f9d70b2e357007288", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f51e75b7e7a24a3f9d70b2e357007288");
                return;
            }
            this.introduction = parcel.readString();
            this.hotline = parcel.readString();
            this.moreInfoUrl = parcel.readString();
            this.shareUrl = parcel.readString();
            this.shareSummary = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf4cca297de551173cdefb1dd735febd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf4cca297de551173cdefb1dd735febd");
            } else {
                parcel.writeString(com.meituan.mmp.lib.utils.j.b.toJson(this));
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class ExternalConfig implements Parcelable {
        public static final Parcelable.Creator<ExternalConfig> CREATOR = new Parcelable.Creator<ExternalConfig>() { // from class: com.meituan.mmp.lib.update.MMPAppProp.ExternalConfig.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ExternalConfig createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0ea8ab2d17d801b685395a8a3e71bac", RobustBitConfig.DEFAULT_VALUE) ? (ExternalConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0ea8ab2d17d801b685395a8a3e71bac") : (ExternalConfig) com.meituan.mmp.lib.utils.j.b.fromJson(parcel.readString(), (Class<Object>) ExternalConfig.class);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ExternalConfig[] newArray(int i) {
                return new ExternalConfig[i];
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("fusion")
        public boolean fusion;
        @SerializedName(PackageLoadReporter.Source.PREFETCH)
        public RequestPrefetchConfig requestPrefetchConfig;
        @SerializedName("shortCutSupported")
        public boolean shortCutSupported;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes3.dex */
        public static class RequestPrefetchConfig {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("enableSecuritySign")
            public boolean enableSecuritySign;
            @SerializedName("enableSecuritySiua")
            public boolean enableSecuritySiua;
            @SerializedName("enableShark")
            public boolean enableShark;
            @SerializedName("keyMap")
            public Map<String, String> keyMap;
            @SerializedName("location")
            public LocationConfig locationConfig;
            @SerializedName("timeout")
            public long timeout;
            @SerializedName("url")
            public String url;

            /* compiled from: ProGuard */
            @Keep
            /* loaded from: classes3.dex */
            public static class LocationConfig {
                public static ChangeQuickRedirect changeQuickRedirect;
                @SerializedName("enable")
                public boolean enable;
                @SerializedName("sceneToken")
                public String sceneToken;
                @SerializedName("type")
                public String type;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e9b07617ec4bb43b9d163e2f438adab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e9b07617ec4bb43b9d163e2f438adab");
            } else {
                parcel.writeString(com.meituan.mmp.lib.utils.j.b.toJson(this));
            }
        }
    }

    public boolean shareSupported() {
        return 1 == this.shareSupported;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcf9ad0fabb51e3624d80447bf36709a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcf9ad0fabb51e3624d80447bf36709a");
        }
        return "[MMPAppProp@" + Integer.toHexString(hashCode()) + " name:" + this.appName + " appid: " + this.appid + " version: " + getPublishId() + " sdk: {" + this.mmpSdk + "} main: {" + this.mainPackage + "}]";
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public MMPAppProp setDebug(boolean z) {
        this.isDebug = z;
        return this;
    }

    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6461bf3f11b9940f19db298d83bd540", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6461bf3f11b9940f19db298d83bd540")).booleanValue() : this.mmpSdk == null || this.mainPackage == null || this.mainPackage.c() || this.mmpSdk.c();
    }

    public boolean isOutdated() {
        return this.loadType == 4;
    }

    public boolean isFusionModeEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14cf999ee32b1e634df288562aa7a38a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14cf999ee32b1e634df288562aa7a38a")).booleanValue();
        }
        if (MMPEnvHelper.isForceFusionMode() != null) {
            return MMPEnvHelper.isForceFusionMode().booleanValue();
        }
        return this.externalConfig != null && this.externalConfig.fusion;
    }

    public ExternalConfig.RequestPrefetchConfig getRequestPrefetchConfig() {
        if (this.externalConfig != null) {
            return this.externalConfig.requestPrefetchConfig;
        }
        return null;
    }

    public boolean isMMPSDKReady(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ec53867c85d64bdd796edc87ade36db", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ec53867c85d64bdd796edc87ade36db")).booleanValue() : this.mmpSdk.u || this.mmpSdk.c(context);
    }

    public boolean isMainPackReady(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d9382c346d7012a60f32f5106e0d7ad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d9382c346d7012a60f32f5106e0d7ad")).booleanValue() : this.mainPackage.u || this.mainPackage.c(context);
    }

    public String getVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8752571c00bb6e307bef1a50d11a8e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8752571c00bb6e307bef1a50d11a8e4");
        }
        if (TextUtils.isEmpty(this.buildId) && TextUtils.isEmpty(this.publishId)) {
            return !TextUtils.isEmpty(this.buildVersion) ? this.buildVersion : "";
        }
        return this.version;
    }

    public String getPublishId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cd55b3c6a25318493bf55473f68c153", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cd55b3c6a25318493bf55473f68c153");
        }
        if (TextUtils.isEmpty(this.buildId) && TextUtils.isEmpty(this.publishId)) {
            return !TextUtils.isEmpty(this.version) ? this.version : "";
        }
        return this.publishId;
    }

    public String getBuildId() {
        return this.buildId;
    }

    public MMPPackageInfo getPackageByName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c05d773d8cd8fd38cb4c7096670d15fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPPackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c05d773d8cd8fd38cb4c7096670d15fd");
        }
        if (TextUtils.equals(str, "main_app")) {
            return this.mainPackage;
        }
        return getSubPackageByName(str);
    }

    public MMPPackageInfo getSubPackageByName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c61f9bacaf0f026f06df8919e6caa0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPPackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c61f9bacaf0f026f06df8919e6caa0b");
        }
        Iterator<MMPPackageInfo> it = this.subPackages.iterator();
        while (it.hasNext()) {
            MMPPackageInfo next = it.next();
            if (next != null && TextUtils.equals(next.g, str)) {
                return next;
            }
        }
        return null;
    }

    public void updatePackage(MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cfd3c8073ad7a797099cb6046e03812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cfd3c8073ad7a797099cb6046e03812");
            return;
        }
        if (Objects.equals(this.mainPackage, mMPPackageInfo)) {
            this.mainPackage = mMPPackageInfo;
        }
        if (Objects.equals(this.mmpSdk, mMPPackageInfo)) {
            this.mmpSdk = mMPPackageInfo;
        }
        for (int i = 0; i < this.subPackages.size(); i++) {
            if (Objects.equals(this.subPackages.get(i), mMPPackageInfo)) {
                this.subPackages.set(i, mMPPackageInfo);
                return;
            }
        }
    }

    public MMPPackageInfo getSubPackageByPath(Context context, String str) {
        String str2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7a8e21656b834c814bfdc09b2af6f1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPPackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7a8e21656b834c814bfdc09b2af6f1b");
        }
        if (TextUtils.isEmpty(str) || com.meituan.mmp.lib.utils.h.a((List) this.subPackages)) {
            return null;
        }
        Iterator<MMPPackageInfo> it = this.subPackages.iterator();
        while (it.hasNext()) {
            MMPPackageInfo next = it.next();
            if (next != null) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = ap.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "d3d1bad0762f6e6de8ff6228bcad99f6", RobustBitConfig.DEFAULT_VALUE)) {
                    str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "d3d1bad0762f6e6de8ff6228bcad99f6");
                } else if (TextUtils.isEmpty(str)) {
                    str2 = "";
                } else {
                    String trim = str.trim();
                    if (!trim.startsWith("/")) {
                        str2 = "/" + trim;
                    } else {
                        int i = 0;
                        while (i < trim.length() && File.separatorChar == trim.charAt(i)) {
                            i++;
                        }
                        str2 = "/" + trim.substring(i);
                    }
                }
                if (str2.startsWith(next.o)) {
                    next.c(context);
                    return next;
                }
            }
        }
        return null;
    }

    @NonNull
    public MMPPackageInfo getPackageByPath(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcef59d41a9b33c31633a6702cda46dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPPackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcef59d41a9b33c31633a6702cda46dd");
        }
        MMPPackageInfo subPackageByPath = getSubPackageByPath(context, str);
        return subPackageByPath != null ? subPackageByPath : this.mainPackage;
    }

    public DioFile getResourcePath(Context context, String str) {
        int indexOf;
        MMPPackageInfo subPackageByName;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4af8907d03751016d46f2628a5d8623b", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4af8907d03751016d46f2628a5d8623b");
        }
        if (str.startsWith("file:///data/")) {
            return new DioFile(str);
        }
        if (str.startsWith(PREFIX_FRAMEWORK)) {
            return new DioFile(this.mmpSdk.b(context), str.replace(PREFIX_FRAMEWORK, ""));
        }
        if (str.startsWith(PREFIX_MAIN_APP)) {
            return new DioFile(this.mainPackage.b(context), str.replace(PREFIX_MAIN_APP, ""));
        }
        if (str.startsWith(PREFIX_APP) && !com.meituan.mmp.lib.utils.h.a((List) this.subPackages) && (indexOf = str.indexOf(File.separatorChar, PREFIX_APP_LENGTH)) > PREFIX_APP_LENGTH && (subPackageByName = getSubPackageByName(str.substring(PREFIX_APP_LENGTH, indexOf))) != null) {
            return new DioFile(subPackageByName.b(context), str.substring(indexOf));
        }
        DioFile dioFile = new DioFile(getPackageByPath(context, str).b(context), str);
        if (!dioFile.c()) {
            com.meituan.mmp.lib.trace.b.d("MMPAppProp", "getResourcePath not exist. url:" + str + " app: " + this.appName + " version: " + getPublishId());
        }
        return dioFile;
    }
}
