package com.meituan.android.common.dfingerprint;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTGlibInterface {
    public static final String API_KEY_addSigProcessor = "v5_addSigProcessor";
    public static final String API_KEY_dfpData = "v5_dfpData";
    public static final String API_KEY_init = "v5_init";
    public static final String API_dfpid_duration = "v5_dfpid_duration";
    public static final String API_mtgsig_duration = "v5_mtgsig_duration";
    public static final String API_report_deviceinfo = "v5_/v5/device-info";
    public static final String API_report_dfpidsync = "v5_/v5/sign";
    public static final String API_report_localxid = "v5_localxid_reason";
    public static final String API_report_xid_fail3 = "v5_xid_fail3";
    public static final String API_report_xidsync = "v5_/info/report";
    public static final String API_xid_duration = "v5_xid_duration";
    private static final int MAX_CACHE_SIZE = 128;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final List<ReportModel> raptorCache = new ArrayList();
    private static volatile RaptorInterface sRaptorImpl;

    public static void initRaptor(RaptorInterface raptorInterface) {
        Object[] objArr = {raptorInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e116fa4ce92cef513fbd9e1400e13f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e116fa4ce92cef513fbd9e1400e13f0");
        } else if (raptorInterface == null) {
        } else {
            try {
                sRaptorImpl = raptorInterface;
                reportCache();
            } catch (Throwable unused) {
            }
        }
    }

    public static void raptorFakeAPI(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d17ef9cc063ed1d562bc57a7ea93efc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d17ef9cc063ed1d562bc57a7ea93efc5");
            return;
        }
        try {
            if (sRaptorImpl == null) {
                addToCache(str, i, 0, 0, j);
            } else {
                sRaptorImpl.raptorFakeAPI(str, i, (int) j);
            }
        } catch (Throwable unused) {
        }
    }

    public static void raptorAPI(String str, int i, int i2, int i3, long j) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4bb2c07476769fb7d490eb92b72e17d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4bb2c07476769fb7d490eb92b72e17d3");
            return;
        }
        try {
            if (sRaptorImpl == null) {
                addToCache(str, i, i2, i3, j);
            } else {
                sRaptorImpl.raptorAPI(str, i, i2, i3, (int) j);
            }
        } catch (Throwable unused) {
        }
    }

    private static void addToCache(String str, int i, int i2, int i3, long j) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3923079cf170a8204c3a6679b239c6d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3923079cf170a8204c3a6679b239c6d1");
            return;
        }
        synchronized (raptorCache) {
            if (raptorCache.size() > 128) {
                return;
            }
            raptorCache.add(new ReportModel(str, i, i2, i3, j));
        }
    }

    private static void reportCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00402b391f57d2424c20830e74fbe65d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00402b391f57d2424c20830e74fbe65d");
            return;
        }
        synchronized (raptorCache) {
            if (raptorCache.isEmpty()) {
                return;
            }
            for (int i = 0; i < raptorCache.size(); i++) {
                ReportModel reportModel = raptorCache.get(i);
                raptorAPI(reportModel.key, reportModel.responseCode, reportModel.requestLen, reportModel.responseLen, reportModel.timeDiff);
            }
            raptorCache.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ReportModel {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String key;
        public int requestLen;
        public int responseCode;
        public int responseLen;
        public long timeDiff;

        public ReportModel(String str, int i, int i2, int i3, long j) {
            this.key = str;
            this.responseCode = i;
            this.requestLen = i2;
            this.responseLen = i3;
            this.timeDiff = j;
        }
    }
}
