package com.meituan.msc.modules.update.bean;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.mercury.msc.adaptor.bean.MSCAppMetaInfo;
import com.meituan.android.mercury.msc.adaptor.bean.MSCPackageInfo;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.f;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AppMetaInfoWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String TAG;
    public String checkUpdateUrl;
    public boolean isFetchedByMinVersionLimit;
    private final boolean isFromCache;
    private final long lastUpdateTimeInMs;
    public volatile PackageInfoWrapper mainPackageCached;
    @NonNull
    private final MSCAppMetaInfo metaInfo;
    private final Map<String, PrefetchConfig> prefetchConfigs;
    private final List<PackageInfoWrapper> subPackagesCached;

    public AppMetaInfoWrapper(@NonNull MSCAppMetaInfo mSCAppMetaInfo) {
        Object[] objArr = {mSCAppMetaInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b43d32edb1242b41164f7752105316d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b43d32edb1242b41164f7752105316d8");
            return;
        }
        this.TAG = "AppMetaInfoWrapper@" + Integer.toHexString(hashCode());
        this.prefetchConfigs = new ConcurrentHashMap();
        this.subPackagesCached = new CopyOnWriteArrayList();
        this.metaInfo = mSCAppMetaInfo;
        this.isFromCache = mSCAppMetaInfo.getFrom() == 1;
        this.lastUpdateTimeInMs = this.isFromCache ? -1L : System.currentTimeMillis();
    }

    @Nullable
    public PackageInfoWrapper createSubPackageWrapper(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "233b35029ca02acdfedd0f8f79178e4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "233b35029ca02acdfedd0f8f79178e4c");
        }
        if (this.metaInfo.getSubPackages() == null) {
            return null;
        }
        for (MSCPackageInfo mSCPackageInfo : this.metaInfo.getSubPackages()) {
            if (mSCPackageInfo != null && hasPagePathAtMSCPackageInfo(str, mSCPackageInfo)) {
                return new PackageInfoWrapper(this.metaInfo.getAppId(), 3, mSCPackageInfo);
            }
        }
        return null;
    }

    private boolean hasPagePathAtMSCPackageInfo(String str, MSCPackageInfo mSCPackageInfo) {
        Object[] objArr = {str, mSCPackageInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b8ae00af257b807af3ae28b79606324", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b8ae00af257b807af3ae28b79606324")).booleanValue() : am.a(str).startsWith(mSCPackageInfo.getRoot());
    }

    @Nullable
    public PackageInfoWrapper getOrCreateSubPackageWrapperByPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9eb3e30cfbd645121abe822e6a441b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9eb3e30cfbd645121abe822e6a441b4");
        }
        if (TextUtils.isEmpty(str) || f.a((List) this.metaInfo.getSubPackages())) {
            return null;
        }
        for (PackageInfoWrapper packageInfoWrapper : this.subPackagesCached) {
            if (packageInfoWrapper != null && packageInfoWrapper.hasPagePath(str)) {
                return packageInfoWrapper;
            }
        }
        for (MSCPackageInfo mSCPackageInfo : this.metaInfo.getSubPackages()) {
            if (mSCPackageInfo != null && hasPagePathAtMSCPackageInfo(str, mSCPackageInfo)) {
                return new PackageInfoWrapper(this.metaInfo.getAppId(), 3, mSCPackageInfo);
            }
        }
        return null;
    }

    @Nullable
    public PackageInfoWrapper getSubPackageByName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed8c4608870b4abb5e3800959526b63d", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed8c4608870b4abb5e3800959526b63d");
        }
        if (TextUtils.isEmpty(str) || f.a((List) this.metaInfo.getSubPackages())) {
            g.d(this.TAG, "getSubPackageByName subpackages is empty", str);
            return null;
        }
        for (PackageInfoWrapper packageInfoWrapper : this.subPackagesCached) {
            if (packageInfoWrapper != null && TextUtils.equals(packageInfoWrapper.getPackageName(), str)) {
                return packageInfoWrapper;
            }
        }
        for (MSCPackageInfo mSCPackageInfo : this.metaInfo.getSubPackages()) {
            if (mSCPackageInfo != null && TextUtils.equals(mSCPackageInfo.getName(), str)) {
                return new PackageInfoWrapper(this.metaInfo.getAppId(), 3, mSCPackageInfo);
            }
        }
        return null;
    }

    public String getAppName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df3a982a175f306259490ade73b2371d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df3a982a175f306259490ade73b2371d");
        }
        MSCAppMetaInfo.BasicInfo basicInfo = getBasicInfo();
        return basicInfo == null ? "" : basicInfo.getName();
    }

    public String getIconPath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c72645d28a9ac8d40fcffcfcdac6f2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c72645d28a9ac8d40fcffcfcdac6f2d");
        }
        MSCAppMetaInfo.BasicInfo basicInfo = getBasicInfo();
        return basicInfo == null ? "" : basicInfo.getIcon();
    }

    public void cachePackageWrapper(@NonNull PackageInfoWrapper packageInfoWrapper) {
        Object[] objArr = {packageInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feec2ee46d86bc29f81366cfa0f1ab56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feec2ee46d86bc29f81366cfa0f1ab56");
            return;
        }
        g.d(this.TAG, "cachePackageWrapper", packageInfoWrapper);
        if (packageInfoWrapper.packageType == 2) {
            this.mainPackageCached = packageInfoWrapper;
        } else if (packageInfoWrapper.packageType == 1) {
            if (!MSCEnvHelper.getEnvInfo().isProdEnv()) {
                throw new IllegalStateException("base package set error");
            }
            g.e(this.TAG, "illegal setPackageInfo", packageInfoWrapper);
        } else if (packageInfoWrapper.packageType == 3) {
            this.subPackagesCached.add(packageInfoWrapper);
        }
    }

    public String getMainPackagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "684d9576189d5ba99f56b0f6b7315ead", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "684d9576189d5ba99f56b0f6b7315ead") : this.mainPackageCached.getLocalPath();
    }

    public PackageInfoWrapper createMainPackageWrapper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93373c7eb049b8456bd11e950b7a9fee", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93373c7eb049b8456bd11e950b7a9fee");
        }
        if (this.mainPackageCached != null) {
            return this.mainPackageCached;
        }
        return new PackageInfoWrapper(this.metaInfo.getAppId(), 2, getMainPackage());
    }

    public String getPublishId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0a897ea02c2dc7b5891d47215eb758a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0a897ea02c2dc7b5891d47215eb758a") : this.metaInfo.getPublishId();
    }

    public PackageInfoWrapper getLoadedPackageInfoDefaultReturnMain(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9920f39f0a658070ef5fd2b84e59a892", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9920f39f0a658070ef5fd2b84e59a892");
        }
        PackageInfoWrapper loadedSubPackageInfoByPath = getLoadedSubPackageInfoByPath(str);
        return loadedSubPackageInfoByPath != null ? loadedSubPackageInfoByPath : this.mainPackageCached;
    }

    @Nullable
    public PackageInfoWrapper getLoadedPackageInfoWithoutDefault(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3595f253acb46ccc16313e92af4234b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3595f253acb46ccc16313e92af4234b4");
        }
        for (MSCPackageInfo mSCPackageInfo : this.metaInfo.getSubPackages()) {
            if (mSCPackageInfo != null && hasPagePathAtMSCPackageInfo(str, mSCPackageInfo)) {
                return getLoadedSubPackageInfoByPath(str);
            }
        }
        return this.mainPackageCached;
    }

    @Nullable
    public PackageInfoWrapper getLoadedSubPackageInfoByPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c939622e6c898dff65159e4da9afc263", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c939622e6c898dff65159e4da9afc263");
        }
        for (PackageInfoWrapper packageInfoWrapper : this.subPackagesCached) {
            if (packageInfoWrapper != null && packageInfoWrapper.hasPagePath(str)) {
                return packageInfoWrapper;
            }
        }
        return null;
    }

    public boolean isFromCache() {
        return this.isFromCache;
    }

    public String getBuildId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78ff2a5705e70ec39331c596f6c487aa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78ff2a5705e70ec39331c596f6c487aa") : this.metaInfo.getBuildId();
    }

    public boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "901495b2b322e271479fdf1ed6021a5a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "901495b2b322e271479fdf1ed6021a5a")).booleanValue() : !TextUtils.isEmpty(this.checkUpdateUrl);
    }

    public String getVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28080efad5eb8f5d41a842b955640cf5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28080efad5eb8f5d41a842b955640cf5") : this.metaInfo.getVersion();
    }

    private MSCAppMetaInfo.BasicInfo getBasicInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fed2e32de4dd97f205916c745faa3f3e", RobustBitConfig.DEFAULT_VALUE) ? (MSCAppMetaInfo.BasicInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fed2e32de4dd97f205916c745faa3f3e") : this.metaInfo.getBasicInfo();
    }

    public boolean isInner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eab566dc8792db47bfbf19c37533d901", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eab566dc8792db47bfbf19c37533d901")).booleanValue();
        }
        MSCAppMetaInfo.BasicInfo basicInfo = getBasicInfo();
        if (basicInfo == null) {
            return false;
        }
        return basicInfo.getIsInner();
    }

    public boolean shareSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a349ffe1228f314fc94e6c08473b1cb6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a349ffe1228f314fc94e6c08473b1cb6")).booleanValue();
        }
        MSCAppMetaInfo.BasicInfo basicInfo = getBasicInfo();
        return basicInfo != null && basicInfo.getShareSupported() == 1;
    }

    public String getAppId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f34dc43a7ce3300d81fa25396f17e5b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f34dc43a7ce3300d81fa25396f17e5b") : this.metaInfo.getAppId();
    }

    @Nullable
    public Object getExtraConfigValue(String str) {
        Map<String, Object> extraConfig;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeb78d890e9ee5755bed64494f963d9d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeb78d890e9ee5755bed64494f963d9d");
        }
        MSCAppMetaInfo.BasicInfo basicInfo = getBasicInfo();
        if (basicInfo == null || (extraConfig = basicInfo.getExtraConfig()) == null) {
            return null;
        }
        return extraConfig.get(str);
    }

    private MSCPackageInfo getMainPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "811fb2f019d67e6d514bc3e9b8308283", RobustBitConfig.DEFAULT_VALUE) ? (MSCPackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "811fb2f019d67e6d514bc3e9b8308283") : this.metaInfo.getMainPackage();
    }

    public String getMainPkgMd5() {
        BundleData ddd;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a941626a24b24ca89cf518dad99533f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a941626a24b24ca89cf518dad99533f");
        }
        MSCPackageInfo mainPackage = getMainPackage();
        return (mainPackage == null || (ddd = mainPackage.getDdd()) == null) ? "" : ddd.getMd5();
    }

    public List<PackageInfoWrapper> getSubPackagesCached() {
        return this.subPackagesCached;
    }

    public PackageInfoWrapper getMainPackageCached() {
        return this.mainPackageCached;
    }

    public String getMainPath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d219e01ad4804de9dc04754ec5028184", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d219e01ad4804de9dc04754ec5028184") : this.metaInfo.getMainPath();
    }

    public String getMetaInfoToString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf481037f0086dd9bba8ec75a11071d1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf481037f0086dd9bba8ec75a11071d1") : this.metaInfo.toString();
    }

    public String getBasePackageMinVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "746721e8b34b2523086d4bfba651cb37", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "746721e8b34b2523086d4bfba651cb37") : this.metaInfo.getMinSdkVersion();
    }

    public long getLastUpdateTimeInMs() {
        return this.lastUpdateTimeInMs;
    }

    public boolean isPackageLoaded(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14aa5f09f5e13c3d58c0cd9ecb240188", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14aa5f09f5e13c3d58c0cd9ecb240188")).booleanValue();
        }
        if (this.metaInfo.getSubPackages() == null) {
            return this.mainPackageCached != null;
        }
        for (MSCPackageInfo mSCPackageInfo : this.metaInfo.getSubPackages()) {
            if (mSCPackageInfo != null && hasPagePathAtMSCPackageInfo(str, mSCPackageInfo)) {
                return getLoadedSubPackageInfoByPath(str) != null;
            }
        }
        return this.mainPackageCached != null;
    }

    public PrefetchConfig getPrefetchConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a995283311c6a125588e2b5066dabd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrefetchConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a995283311c6a125588e2b5066dabd0");
        }
        PrefetchConfig prefetchConfig = this.prefetchConfigs.get(str);
        if (prefetchConfig != null) {
            return prefetchConfig;
        }
        try {
            PrefetchConfig prefetchConfig2 = getPrefetchConfig(this, str);
            if (prefetchConfig2 != null) {
                try {
                    this.prefetchConfigs.put(str, prefetchConfig2);
                } catch (Exception e) {
                    e = e;
                    prefetchConfig = prefetchConfig2;
                    g.b(e.getMessage());
                    return prefetchConfig;
                }
            }
            return prefetchConfig2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static PrefetchConfig getPrefetchConfig(AppMetaInfoWrapper appMetaInfoWrapper, String str) throws ClassCastException, IllegalArgumentException {
        Object[] objArr = {appMetaInfoWrapper, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5917449f67264383b72d2a888a4eac91", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrefetchConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5917449f67264383b72d2a888a4eac91");
        }
        Map map = (Map) appMetaInfoWrapper.getExtraConfigValue("targetPathPrefetch");
        if (map == null) {
            g.d("RequestPrefetchManager", "targetPathPrefetch is null!");
            return null;
        }
        Object obj = map.get(str);
        if (obj == null) {
            g.d("RequestPrefetchManager", "use targetPath obtain prefetch is null!");
            return null;
        }
        PrefetchConfig parse = PrefetchConfig.parse((Map) obj);
        parse.pagePath = str;
        return parse;
    }
}
