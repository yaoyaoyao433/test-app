package com.sankuai.titans.base.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.statisticInfo.AccessTimingInfo;
import com.sankuai.titans.protocol.utils.UrlUtils;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansTimingReport {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static long preCreateTime;
    private final long createTime;
    private boolean firstCreateContainer;
    private long globalInitTime;
    private long handleUrlTime;
    private boolean hasReportNativeTime;
    private long nativeCreateTime;
    private long nativeCreateTimeStartTime;
    private String originalUrl;
    private TimingPageInfo timingPageInfo;
    private long webViewCreateStartTime;
    private long webViewCreateTime;
    private long webViewEnvInitTime;
    private long webViewSettingStartTime;
    private long webViewStartLoadUrlTime;

    public void setOriginalUrl(String str) {
        this.originalUrl = str;
    }

    public void setFirstCreateContainer(boolean z) {
        this.firstCreateContainer = z;
    }

    public TitansTimingReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a790dbe63ac71d5787321c2120efcb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a790dbe63ac71d5787321c2120efcb8");
        } else {
            this.createTime = System.currentTimeMillis();
        }
    }

    public void globalInitCompleted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a847562718c89c448877fa6aa91a0253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a847562718c89c448877fa6aa91a0253");
            return;
        }
        this.globalInitTime = (System.currentTimeMillis() - this.createTime) + preCreateTime;
        this.nativeCreateTimeStartTime = System.currentTimeMillis();
    }

    public void onWebViewCreateStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af6334435026501a6aacd3f3be37d7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af6334435026501a6aacd3f3be37d7da");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.webViewCreateStartTime = currentTimeMillis;
        this.nativeCreateTime = currentTimeMillis - this.nativeCreateTimeStartTime;
    }

    public void onWebViewCreateEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a31efddf7651df78f44e840182c7cba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a31efddf7651df78f44e840182c7cba7");
        } else {
            this.webViewCreateTime = System.currentTimeMillis() - this.webViewCreateStartTime;
        }
    }

    public void onWebViewEnvInitStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27542d4a0ace7c55b5a7a713fad79836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27542d4a0ace7c55b5a7a713fad79836");
        } else {
            this.webViewSettingStartTime = System.currentTimeMillis();
        }
    }

    public void onWebViewEnvInitEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a92a54cd40772c8bb2ef4292b2ac083e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a92a54cd40772c8bb2ef4292b2ac083e");
        } else {
            this.webViewEnvInitTime = System.currentTimeMillis() - this.webViewSettingStartTime;
        }
    }

    public void onLoadUrlStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31214127fa5013382d4d7074c95ebaaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31214127fa5013382d4d7074c95ebaaf");
        } else {
            this.webViewStartLoadUrlTime = System.currentTimeMillis();
        }
    }

    public void loadUrlOnCreate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "896598a2e5129f73eb482f18f7c13b29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "896598a2e5129f73eb482f18f7c13b29");
            return;
        }
        loadUrl(str);
        reportNativeLoadTiming(str);
    }

    private void reportNativeLoadTiming(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fabd7304b09fa1f88dee24c94a72626b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fabd7304b09fa1f88dee24c94a72626b");
            return;
        }
        try {
            if (this.hasReportNativeTime || TextUtils.isEmpty(str) || TextUtils.isEmpty(this.originalUrl) || !UrlUtils.clearQueryAndFragment(str).equals(UrlUtils.clearQueryAndFragment(this.originalUrl))) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.handleUrlTime = currentTimeMillis - this.webViewStartLoadUrlTime;
            long j = currentTimeMillis - this.createTime;
            if (j <= 0) {
                return;
            }
            long j2 = j + preCreateTime;
            IStatisticsService staticsService = getStaticsService();
            if (staticsService != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("GlobalInit", Long.valueOf(this.globalInitTime));
                hashMap.put("NativeCreateTime", Long.valueOf(this.nativeCreateTime));
                hashMap.put("WebViewCreate", Long.valueOf(this.webViewCreateTime));
                hashMap.put("WebViewEnvInit", Long.valueOf(this.webViewEnvInitTime));
                hashMap.put("NativeHandleUrl", Long.valueOf(this.handleUrlTime));
                AccessTimingInfo accessTimingInfo = new AccessTimingInfo("20.14.1");
                accessTimingInfo.setIsTitansInited(!this.firstCreateContainer ? 1 : 0);
                accessTimingInfo.setPageUrl(str);
                accessTimingInfo.endPoint("NativeLoadTime", j2);
                accessTimingInfo.setExtraParams(hashMap);
                staticsService.reportTimingInfo(accessTimingInfo);
            }
            this.hasReportNativeTime = true;
        } catch (Exception unused) {
        }
    }

    public void onPageStart(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec36075c4f4d8e1d26543bc2e881ad47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec36075c4f4d8e1d26543bc2e881ad47");
        } else if (this.timingPageInfo != null) {
            this.timingPageInfo.pageStart(str);
        }
    }

    public void onPageFinish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41082f9c9e0c0b83a1f96ff85fd532f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41082f9c9e0c0b83a1f96ff85fd532f2");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                reportPageTime(str);
                reportFullPageTiming(str);
            } catch (Exception unused) {
            }
        }
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42c5eb78f3bb6ae7d65465dffe447e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42c5eb78f3bb6ae7d65465dffe447e26");
        } else {
            preCreateTime = 0L;
        }
    }

    public static void setPreCreateTime(long j) {
        preCreateTime = j;
    }

    private void reportPageTime(String str) {
        IStatisticsService staticsService;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e48c47336a3c188e8643a33800098c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e48c47336a3c188e8643a33800098c82");
        } else if (TextUtils.isEmpty(str) || this.timingPageInfo == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.timingPageInfo.pageStartLoadTime;
            if (currentTimeMillis > 0 && (staticsService = getStaticsService()) != null) {
                AccessTimingInfo accessTimingInfo = new AccessTimingInfo("20.14.1");
                accessTimingInfo.setIsTitansInited(1 ^ (this.firstCreateContainer ? 1 : 0));
                accessTimingInfo.setPageUrl(str);
                accessTimingInfo.endPoint("PageLoad", currentTimeMillis);
                if (this.timingPageInfo != null) {
                    accessTimingInfo.setNetConnectTime(this.timingPageInfo.getConnectTime());
                }
                staticsService.reportTimingInfo(accessTimingInfo);
            }
        }
    }

    private void reportFullPageTiming(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f794c7d733eaf4209c4d3cb5c9a79ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f794c7d733eaf4209c4d3cb5c9a79ef0");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.originalUrl) || !UrlUtils.clearQueryAndFragment(str).equals(UrlUtils.clearQueryAndFragment(this.originalUrl))) {
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.createTime;
            if (currentTimeMillis <= 0) {
                return;
            }
            long j = currentTimeMillis + preCreateTime;
            IStatisticsService staticsService = getStaticsService();
            if (staticsService != null) {
                AccessTimingInfo accessTimingInfo = new AccessTimingInfo("20.14.1");
                accessTimingInfo.setIsTitansInited(1 ^ (this.firstCreateContainer ? 1 : 0));
                accessTimingInfo.setPageUrl(str);
                accessTimingInfo.endPoint("FullPageLoad", j);
                if (this.timingPageInfo != null) {
                    accessTimingInfo.setNetConnectTime(this.timingPageInfo.getConnectTime());
                }
                staticsService.reportTimingInfo(accessTimingInfo);
            }
        }
    }

    private IStatisticsService getStaticsService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b38d8a278c9a6fc4e98e5d27468aa7bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (IStatisticsService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b38d8a278c9a6fc4e98e5d27468aa7bb");
        }
        if (Titans.getTitansContext() == null || Titans.getTitansContext().getServiceManager() == null) {
            return null;
        }
        return Titans.getTitansContext().getServiceManager().getStatisticsService();
    }

    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce511105658430bc72c26138087e8659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce511105658430bc72c26138087e8659");
        } else {
            this.timingPageInfo = new TimingPageInfo(str);
        }
    }

    public void abortReport() {
        this.timingPageInfo = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class TimingPageInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String pageLoadUrl;
        private final long pageStartLoadTime;
        private long pageStartTime;
        private String pageStartUrl;

        public TimingPageInfo(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7bc39804f4ada31a3e360fdf0931098", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7bc39804f4ada31a3e360fdf0931098");
                return;
            }
            this.pageStartLoadTime = System.currentTimeMillis();
            this.pageLoadUrl = str;
        }

        public void pageStart(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32651419023505edbeb37c21f3a91cfd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32651419023505edbeb37c21f3a91cfd");
                return;
            }
            this.pageStartTime = System.currentTimeMillis();
            this.pageStartUrl = str;
        }

        public long getConnectTime() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f09326c0546e058673137e538ff2bc70", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f09326c0546e058673137e538ff2bc70")).longValue();
            }
            if (TextUtils.isEmpty(this.pageLoadUrl) || TextUtils.isEmpty(this.pageStartUrl) || this.pageStartTime - this.pageStartLoadTime <= 0 || !UrlUtils.clearQueryAndFragment(this.pageLoadUrl).equals(UrlUtils.clearQueryAndFragment(this.pageStartUrl))) {
                return -1L;
            }
            return this.pageStartTime - this.pageStartLoadTime;
        }
    }
}
