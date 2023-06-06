package com.meituan.msc.modules.update.bean;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.mercury.msc.adaptor.bean.MSCPackageInfo;
import com.meituan.dio.easy.DioFile;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PackageInfoWrapper {
    public static final String PACKAGE_FRAMEWORK_SERVICE_FILE = "service.js";
    public static final String PACKAGE_PAGE_BOOTSTRAP = "page-bootstrap.js";
    public static final String PACKAGE_SERVICE_FILE = "app-service.js";
    public static final int PACKAGE_TYPE_BASE = 1;
    public static final int PACKAGE_TYPE_INDEPENDENT_SUB = 4;
    public static final int PACKAGE_TYPE_MAIN = 2;
    public static final String PACKAGE_TYPE_STR_BASE = "base";
    public static final int PACKAGE_TYPE_SUB = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appId;
    private DDResource ddResource;
    private long downloadEndTimeInMs;
    private long downloadStartTimeInMs;
    private String fetchStrategy;
    public volatile boolean isPackageInjected;
    public volatile boolean isSourceReady;
    @Nullable
    private MSCPackageInfo packageInfo;
    public final int packageType;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PackageType {
    }

    public PackageInfoWrapper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59e5fede3025f6b6c87eedba7bf37430", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59e5fede3025f6b6c87eedba7bf37430");
            return;
        }
        this.downloadStartTimeInMs = -1L;
        this.downloadEndTimeInMs = -1L;
        this.packageType = 1;
    }

    public PackageInfoWrapper(String str, int i, @NonNull MSCPackageInfo mSCPackageInfo) {
        Object[] objArr = {str, Integer.valueOf(i), mSCPackageInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d948cbf2846905d9d0c9add3ca5aa69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d948cbf2846905d9d0c9add3ca5aa69");
            return;
        }
        this.downloadStartTimeInMs = -1L;
        this.downloadEndTimeInMs = -1L;
        this.appId = str;
        this.packageType = i;
        this.packageInfo = mSCPackageInfo;
    }

    public boolean isBasePackage() {
        return this.packageType == 1;
    }

    public boolean isMainPackage() {
        return this.packageType == 2;
    }

    public DioFile getServiceFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "278cf1489b9d757c7c8c456c3392b9aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "278cf1489b9d757c7c8c456c3392b9aa");
        }
        return new DioFile(this.ddResource.getLocalPath(), isBasePackage() ? PACKAGE_FRAMEWORK_SERVICE_FILE : PACKAGE_SERVICE_FILE);
    }

    public String getPkgTypeString() {
        switch (this.packageType) {
            case 1:
                return PACKAGE_TYPE_STR_BASE;
            case 2:
                return "main";
            case 3:
                return "sub";
            case 4:
                return "indepsub";
            default:
                return null;
        }
    }

    public String getMd5() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad616a6f4ad7c46ab284835826a9962f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad616a6f4ad7c46ab284835826a9962f");
        }
        if (this.ddResource != null) {
            return this.ddResource.getMd5();
        }
        return this.packageInfo == null ? "" : this.packageInfo.getDdd().getMd5();
    }

    public String getVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62d376c95457fe9bdea20d4fdd97172e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62d376c95457fe9bdea20d4fdd97172e");
        }
        if (this.ddResource != null) {
            return this.ddResource.getVersion();
        }
        return this.packageInfo == null ? "" : this.packageInfo.getDdd().getBundleVersion();
    }

    public boolean isFromNet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b32fb2f7110b7217ba9735da635508ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b32fb2f7110b7217ba9735da635508ac")).booleanValue() : this.ddResource != null && this.ddResource.isFromNet();
    }

    public boolean isFromCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dad87f124d82c5580f9f35f0b74f9436", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dad87f124d82c5580f9f35f0b74f9436")).booleanValue() : (this.ddResource == null || this.ddResource.isFromNet()) ? false : true;
    }

    public boolean isDownloadedBefore(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3258568a050ada07a83f55bcbea68701", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3258568a050ada07a83f55bcbea68701")).booleanValue() : isFromCache() || (this.downloadEndTimeInMs > 0 && this.downloadEndTimeInMs < j);
    }

    @PackageLoadReporter.LoadType
    public String getLoadType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3869d559ccabccdbca4e83efedad3e4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3869d559ccabccdbca4e83efedad3e4") : isFromNet() ? "network" : PackageLoadReporter.LoadType.LOCAL;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb76b79947bbfb73c6b517e3bcae791c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb76b79947bbfb73c6b517e3bcae791c");
        }
        return "PackageInfoWrapper{packageType=" + this.packageType + ", packageInfo=" + this.packageInfo + ", ddResource=" + this.ddResource + ", isSourceReady=" + this.isSourceReady + ", isPackageInjected=" + this.isPackageInjected + ", appId='" + this.appId + "', fetchStrategy='" + this.fetchStrategy + "'}";
    }

    public String getSourcePackageDir() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "976afa33cbed985e4ef95e4323ef1d9a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "976afa33cbed985e4ef95e4323ef1d9a") : this.ddResource.getLocalPath();
    }

    public String getRoot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1b0d64c2392f2cf9a8c0feaad03307e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1b0d64c2392f2cf9a8c0feaad03307e") : (this.packageInfo == null || this.packageType == 2 || this.packageType == 1) ? "" : this.packageInfo.getRoot();
    }

    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4879d6173037995a5c5c1871b6de8e59", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4879d6173037995a5c5c1871b6de8e59")).booleanValue() : TextUtils.isEmpty(getMd5()) || this.ddResource == null || TextUtils.isEmpty(this.ddResource.getUrl());
    }

    @Nullable
    public MSCPackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    public void setDDResource(@NonNull DDResource dDResource) {
        this.ddResource = dDResource;
    }

    public String getLocalPath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "993882a589fd6b5837fdf1fc320aa237", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "993882a589fd6b5837fdf1fc320aa237") : this.ddResource == null ? "" : this.ddResource.getLocalPath();
    }

    public String getPackageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ade3ba7b3fb4e12453ab06f116d6be5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ade3ba7b3fb4e12453ab06f116d6be5") : isMainPackage() ? "main_app" : this.packageInfo == null ? "" : this.packageInfo.getName();
    }

    public DioFile getPageBootStrapFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab1b13f18246de83cc1f7f8e5eac3632", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab1b13f18246de83cc1f7f8e5eac3632");
        }
        String sourcePackageDir = getSourcePackageDir();
        if (sourcePackageDir != null) {
            return new DioFile(sourcePackageDir, PACKAGE_PAGE_BOOTSTRAP);
        }
        return null;
    }

    public String getDDResourceName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e664623091ec5cd1f46bd075048c195b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e664623091ec5cd1f46bd075048c195b") : this.ddResource == null ? "" : this.ddResource.getName();
    }

    public boolean isLocalCacheValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0eaf05f868ee09a2150e08ada62c772f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0eaf05f868ee09a2150e08ada62c772f")).booleanValue();
        }
        if (this.ddResource == null) {
            return false;
        }
        return this.ddResource.isLocalCacheValid();
    }

    public void setFetchStrategy(String str) {
        this.fetchStrategy = str;
    }

    public String getFetchStrategy() {
        return this.fetchStrategy;
    }

    public void setDownloadTimeInMs(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d134b41fb681294d4623de4d399f958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d134b41fb681294d4623de4d399f958");
        } else if (this.ddResource != null && this.ddResource.isFromNet()) {
            this.downloadEndTimeInMs = j2;
            this.downloadStartTimeInMs = j;
        } else {
            this.downloadEndTimeInMs = -1L;
            this.downloadStartTimeInMs = -1L;
        }
    }

    public long getPackageSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f8f2a50fb3311ba197a74bb56b2c3e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f8f2a50fb3311ba197a74bb56b2c3e0")).longValue();
        }
        if (this.ddResource != null) {
            return new File(this.ddResource.getLocalPath()).length();
        }
        return -1L;
    }

    public long getDownloadEndTimeInMs() {
        return this.downloadEndTimeInMs;
    }

    public long getDownloadStartTimeInMs() {
        return this.downloadStartTimeInMs;
    }

    public boolean hasPagePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8fe9064644720c9ce2d25bc3850138d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8fe9064644720c9ce2d25bc3850138d")).booleanValue() : am.a(str).startsWith(getRoot());
    }
}
