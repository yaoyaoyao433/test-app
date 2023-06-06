package com.dianping.titans.utils;

import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.BuildConfig;
import com.sankuai.titans.protocol.utils.UrlUtils;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansTimingReport {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int isTitansInitialized;
    private long createTime;
    private boolean firstCreateContainer;
    private long globalInitTime;
    private long handleUrlTime;
    private boolean hasReportFullPageTime;
    private boolean hasReportNativeTime;
    private long nativeCreateTime;
    private long nativeCreateTimeStartTime;
    private String originalUrl;
    private long preCreateTime;
    private TimingPageInfo timingPageInfo;
    private long webViewCreateStartTime;
    private long webViewCreateTime;
    private long webViewEnvInitTime;
    private long webViewSettingStartTime;
    private long webViewStartLoadUrlTime;

    public TitansTimingReport() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SingleHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final TitansTimingReport sInstance = new TitansTimingReport();
    }

    public static TitansTimingReport getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d156b741175b760fc259f5bc541ba3bd", RobustBitConfig.DEFAULT_VALUE) ? (TitansTimingReport) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d156b741175b760fc259f5bc541ba3bd") : SingleHolder.sInstance;
    }

    public void onContainerCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff92ca68bee26d2638dcc114cf8861c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff92ca68bee26d2638dcc114cf8861c1");
        } else {
            this.createTime = System.currentTimeMillis();
        }
    }

    public void onContainerDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "485450b916f75f79977fb833a509288f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "485450b916f75f79977fb833a509288f");
            return;
        }
        this.createTime = 0L;
        this.originalUrl = "";
        this.firstCreateContainer = false;
        this.timingPageInfo = null;
        this.preCreateTime = 0L;
        this.webViewSettingStartTime = 0L;
        this.webViewStartLoadUrlTime = 0L;
        this.webViewCreateStartTime = 0L;
        this.nativeCreateTimeStartTime = 0L;
        this.globalInitTime = 0L;
        this.nativeCreateTime = 0L;
        this.webViewCreateTime = 0L;
        this.webViewEnvInitTime = 0L;
        this.handleUrlTime = 0L;
        this.hasReportNativeTime = false;
        this.hasReportFullPageTime = false;
    }

    public void setOriginalUrl(String str) {
        this.originalUrl = str;
    }

    public void setPreCreateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1c2011c6cd4dfbaada42342a1882891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1c2011c6cd4dfbaada42342a1882891");
        } else {
            this.preCreateTime = j;
        }
    }

    public void globalInitCompleted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f1803ed2b3c59d9bae8f38c8635ef93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f1803ed2b3c59d9bae8f38c8635ef93");
            return;
        }
        this.globalInitTime = (System.currentTimeMillis() - this.createTime) + this.preCreateTime;
        this.nativeCreateTimeStartTime = System.currentTimeMillis();
    }

    public void onWebViewCreateStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e49d348fd8f15ea187ca827424555c73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e49d348fd8f15ea187ca827424555c73");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.webViewCreateStartTime = currentTimeMillis;
        this.nativeCreateTime = currentTimeMillis - this.nativeCreateTimeStartTime;
    }

    public void onWebViewCreateEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47adb3cb28f3eeb9b9f13488207d85a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47adb3cb28f3eeb9b9f13488207d85a8");
        } else {
            this.webViewCreateTime = System.currentTimeMillis() - this.webViewCreateStartTime;
        }
    }

    public void onWebOtherViewCreateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6da1877cefbc72c3c29e89d2cdfeaf21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6da1877cefbc72c3c29e89d2cdfeaf21");
        } else {
            this.webViewCreateTime += j;
        }
    }

    public void onWebViewEnvInitStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d18cc6f897a506c1b9e7df44fdf0d38b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d18cc6f897a506c1b9e7df44fdf0d38b");
        } else {
            this.webViewSettingStartTime = System.currentTimeMillis();
        }
    }

    public void onWebViewEnvInitEnd(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d09683b725d4781d2ad59e4ca0823ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d09683b725d4781d2ad59e4ca0823ffb");
        } else {
            this.webViewEnvInitTime = (System.currentTimeMillis() - this.webViewSettingStartTime) - j;
        }
    }

    public void onLoadUrlStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce28d0452cfdc294cbbde414fab67482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce28d0452cfdc294cbbde414fab67482");
        } else {
            this.webViewStartLoadUrlTime = System.currentTimeMillis();
        }
    }

    private void reportNativeLoadTiming(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3db3a075e37e77e2adbde47ad48eeacb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3db3a075e37e77e2adbde47ad48eeacb");
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
            long j2 = j + this.preCreateTime;
            HashMap hashMap = new HashMap();
            hashMap.put("name", "NativeLoadTime");
            hashMap.put("isTitansInited", Integer.valueOf(!this.firstCreateContainer ? 1 : 0));
            hashMap.put("titansVersion", BuildConfig.VERSION_NAME);
            hashMap.put("page", UrlUtils.clearQueryAndFragment(str));
            hashMap.put("GlobalInit", Long.valueOf(this.globalInitTime));
            hashMap.put("NativeCreateTime", Long.valueOf(this.nativeCreateTime));
            hashMap.put("WebViewCreate", Long.valueOf(this.webViewCreateTime));
            hashMap.put("WebViewEnvInit", Long.valueOf(this.webViewEnvInitTime));
            hashMap.put("NativeHandleUrl", Long.valueOf(this.handleUrlTime));
            hashMap.put("typeStartTimestamp", Long.valueOf(System.currentTimeMillis()));
            hashMap.put("isNewFrame", 0);
            Log.Builder optional = new Log.Builder("").reportChannel("prism-report-knb").tag("titans-timing").lv4LocalStatus(true).optional(hashMap);
            optional.value(j2);
            Babel.logRT(optional.build());
            this.hasReportNativeTime = true;
        } catch (Exception unused) {
        }
    }

    public void onPageStart(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33a02117b7b63229d9adb7ba9a1c00aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33a02117b7b63229d9adb7ba9a1c00aa");
        } else if (this.timingPageInfo != null) {
            this.timingPageInfo.pageStart(str);
        }
    }

    public void onPageFinish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92fa8e89d22864d42b14d5540e94c7fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92fa8e89d22864d42b14d5540e94c7fd");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                reportPageTime(str);
                reportFullPageTiming(str);
            } catch (Exception unused) {
            }
        }
    }

    private void reportPageTime(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ec23300573c7a303a5b7f8da052a7ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ec23300573c7a303a5b7f8da052a7ca");
        } else if (TextUtils.isEmpty(str) || this.timingPageInfo == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.timingPageInfo.pageStartLoadTime;
            if (currentTimeMillis <= 0) {
                return;
            }
            reportToBabel("PageLoad", !this.firstCreateContainer ? 1 : 0, UrlUtils.clearQueryAndFragment(str), this.timingPageInfo.getConnectTime(), currentTimeMillis);
        }
    }

    private void reportFullPageTiming(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89db1bdc1398252d32bcd2d42639830a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89db1bdc1398252d32bcd2d42639830a");
        } else if (this.hasReportFullPageTime || TextUtils.isEmpty(str) || TextUtils.isEmpty(this.originalUrl) || !UrlUtils.clearQueryAndFragment(str).equals(UrlUtils.clearQueryAndFragment(this.originalUrl))) {
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.createTime;
            if (currentTimeMillis <= 0) {
                return;
            }
            long j = currentTimeMillis + this.preCreateTime;
            if (this.timingPageInfo == null) {
                return;
            }
            reportToBabel("FullPageLoad", !this.firstCreateContainer ? 1 : 0, UrlUtils.clearQueryAndFragment(str), this.timingPageInfo.getConnectTime(), j);
            this.hasReportFullPageTime = true;
        }
    }

    private void reportToBabel(String str, int i, String str2, long j, long j2) {
        Object[] objArr = {str, Integer.valueOf(i), str2, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44405fdb5f688c81c8e4828843ab7afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44405fdb5f688c81c8e4828843ab7afc");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put("isTitansInited", Integer.valueOf(i));
        hashMap.put("titansVersion", BuildConfig.VERSION_NAME);
        hashMap.put("page", str2);
        hashMap.put("netLoad", Long.valueOf(j));
        hashMap.put("typeStartTimestamp", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("isNewFrame", 0);
        Log.Builder optional = new Log.Builder("").reportChannel("prism-report-knb").tag("titans-timing").lv4LocalStatus(true).optional(hashMap);
        optional.value(j2);
        Babel.logRT(optional.build());
    }

    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69a9edfbbd1f5f2648f18e4449a694bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69a9edfbbd1f5f2648f18e4449a694bb");
            return;
        }
        this.timingPageInfo = new TimingPageInfo(str);
        if (isTitansInitialized == 0) {
            isTitansInitialized = 1;
            this.firstCreateContainer = true;
        }
        reportNativeLoadTiming(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class TimingPageInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String pageLoadUrl;
        private final long pageStartLoadTime;
        private long pageStartTime;
        private String pageStartUrl;

        public TimingPageInfo(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dfb967edb4001af5798ad9ec07210d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dfb967edb4001af5798ad9ec07210d9");
                return;
            }
            this.pageStartLoadTime = System.currentTimeMillis();
            this.pageLoadUrl = str;
        }

        public void pageStart(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9305666bbb887b18c341dcc083f2536", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9305666bbb887b18c341dcc083f2536");
                return;
            }
            this.pageStartTime = System.currentTimeMillis();
            this.pageStartUrl = str;
        }

        public long getConnectTime() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75b6a7d0cff8cb82a75576031407e140", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75b6a7d0cff8cb82a75576031407e140")).longValue();
            }
            if (TextUtils.isEmpty(this.pageLoadUrl) || TextUtils.isEmpty(this.pageStartUrl) || this.pageStartTime - this.pageStartLoadTime <= 0 || !UrlUtils.clearQueryAndFragment(this.pageLoadUrl).equals(UrlUtils.clearQueryAndFragment(this.pageStartUrl))) {
                return -1L;
            }
            return this.pageStartTime - this.pageStartLoadTime;
        }
    }
}
