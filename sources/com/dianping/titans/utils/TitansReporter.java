package com.dianping.titans.utils;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.networklog.c;
import com.dianping.titans.js.JsHost;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.TitansReport;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansReporter {
    private static final String DOWNLOAD_TAG = "titans-info";
    private static final String EXCEPTION_TAG = "titans-exception";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final String[] LOGAN_WEBVIEW_TAG = {"webview"};
    private static final String[] LOGAN_COOKIE_TAG = {"Titans_Cookie"};
    private static final Map<JsHost, TitansReport.Builder> titansReportBuilders = new HashMap();

    public static void putTitansReportBuilder(JsHost jsHost, TitansReport.Builder builder) {
        Object[] objArr = {jsHost, builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a30db58a1dfed9729f1ae3281ca2cf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a30db58a1dfed9729f1ae3281ca2cf9");
            return;
        }
        synchronized (titansReportBuilders) {
            titansReportBuilders.put(jsHost, builder);
        }
    }

    public static void removeTitansReportBuilder(JsHost jsHost) {
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8833e3f1f90875e1c71b343b1d7a2846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8833e3f1f90875e1c71b343b1d7a2846");
            return;
        }
        synchronized (titansReportBuilders) {
            titansReportBuilders.remove(jsHost);
        }
    }

    public static TitansReport.Builder getReportBuilder(JsHost jsHost) {
        TitansReport.Builder builder;
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ff855989b48eac3b96f292f56414b72", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansReport.Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ff855989b48eac3b96f292f56414b72");
        }
        synchronized (titansReportBuilders) {
            builder = titansReportBuilders.get(jsHost);
        }
        return builder;
    }

    public static void titansCookieActionLog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87526d2514917e08d1dd4ac96799f05b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87526d2514917e08d1dd4ac96799f05b");
        } else {
            c.a(str, 3, LOGAN_COOKIE_TAG);
        }
    }

    public static void webviewLog(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf8fc509979d7952bbc54d9505e41a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf8fc509979d7952bbc54d9505e41a68");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        c.a(sb.toString(), 3, LOGAN_WEBVIEW_TAG);
    }

    public static void reportException(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c3d40729c69b6b43c4ce31f20a8a749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c3d40729c69b6b43c4ce31f20a8a749");
            return;
        }
        try {
            c.a(str + " occur Exception : " + th.getMessage(), 3, LOGAN_WEBVIEW_TAG);
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str2)) {
                str2 = "页面未知";
            }
            hashMap.put("page", str2);
            hashMap.put("type", str);
            hashMap.put(LogMonitor.EXCEPTION_TAG, Log.getStackTraceString(th));
            reportBabel(hashMap, EXCEPTION_TAG);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void reportDownloadInfo(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa51dd9f69e5340e45addd965e94375b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa51dd9f69e5340e45addd965e94375b");
        } else {
            reportBabel(map, DOWNLOAD_TAG);
        }
    }

    public static void reportBabel(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87aba331597b5984c48e9c79ff235119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87aba331597b5984c48e9c79ff235119");
            return;
        }
        Log.Builder optional = new Log.Builder("").reportChannel("prism-report-knb").tag(str).optional(map);
        optional.value(1L);
        Babel.logRT(optional.build());
    }
}
