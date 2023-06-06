package com.dianping.titans.offline.util;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Reporter {
    private static final String KNB_CHANNEL = "prism-report-knb";
    private static final String[] LOGAN_OFFLINE_TAG = {"offline_update"};
    public static final String OFFLINE_STAGE_CONFIG = "offlineConfig";
    public static final String OFFLINE_STAGE_DOWNLOAD_BUNDLE = "downloadOfflineBundle";
    public static final String OFFLINE_STAGE_DOWNLOAD_INIT = "downloadSDKInit";
    public static final String OFFLINE_STAGE_GFT_BUNDLE_DETAIL = "getBundleMetaInfo";
    public static final String OFFLINE_STAGE_INIT = "offlineInit";
    public static final String OFFLINE_STAGE_INTERCEPTOR = "findURL";
    public static final String OFFLINE_STAGE_UPDATE_MAP = "setOfflineMap";
    private static final int TYPE_KNB = 35;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String sChannel = "fe_knb_report";

    public Reporter() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class Holder {
        private static final Reporter INSTANCE = new Reporter();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static Reporter getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5bc522b12d238fe208fc90ba333fc2fc", RobustBitConfig.DEFAULT_VALUE) ? (Reporter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5bc522b12d238fe208fc90ba333fc2fc") : Holder.INSTANCE;
    }

    public void webLog(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "850facd0a031a3548e3903168c9f9369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "850facd0a031a3548e3903168c9f9369");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        c.a(sb.toString(), 35, LOGAN_OFFLINE_TAG);
    }

    public void webLog(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7bd1ae59d24ae2afe62c182983d1745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7bd1ae59d24ae2afe62c182983d1745");
            return;
        }
        webLog(str, " occur Exception : " + Log.getStackTraceString(th));
    }

    public void webLog(String str, Map map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae3c9d2719c93a68c0e3ab7b3fbcc238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae3c9d2719c93a68c0e3ab7b3fbcc238");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(map);
            webLog(str, " with params" + jSONObject);
        } catch (Exception e) {
            webLog(str, e);
        }
    }

    public void reportRT(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fc69e4da7b0684c301ceac58bf5e737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fc69e4da7b0684c301ceac58bf5e737");
            return;
        }
        try {
            Log.Builder optional = new Log.Builder("").reportChannel(sChannel).ts(System.currentTimeMillis()).tag(str).optional(map);
            if (l != null) {
                optional.value(l.longValue());
            }
            Babel.logRT(optional.build());
        } catch (Throwable unused) {
        }
    }

    public void reportRTKNBChannel(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e54b743b28ddd6909c293e6e33b7d150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e54b743b28ddd6909c293e6e33b7d150");
            return;
        }
        try {
            Log.Builder optional = new Log.Builder("").reportChannel(KNB_CHANNEL).ts(System.currentTimeMillis()).tag(str).optional(map);
            if (l != null) {
                optional.value(l.longValue());
            }
            Babel.logRT(optional.build());
        } catch (Throwable unused) {
        }
    }

    public void reportOfflineError(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2ea3066da1e2937b464ba78dc4e6d27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2ea3066da1e2937b464ba78dc4e6d27");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stage", str);
        hashMap.put("method", str2);
        hashMap.put("errorMsg", str3);
        getInstance().reportRTKNBChannel("titans-offline-error", hashMap, 0L);
    }
}
