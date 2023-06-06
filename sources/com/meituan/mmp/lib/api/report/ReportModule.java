package com.meituan.mmp.lib.api.report;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.Required;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ReportModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ReportAnalyticsParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Required
        public String data;
        @Required
        public String eventName;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ReportAnalytics extends ApiFunction<ReportAnalyticsParams, Empty> {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public boolean isActivityApi() {
            return false;
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, ReportAnalyticsParams reportAnalyticsParams, IApiCallback iApiCallback) {
            JSONObject jSONObject;
            HashMap hashMap;
            ReportAnalyticsParams reportAnalyticsParams2 = reportAnalyticsParams;
            Object[] objArr = {str, reportAnalyticsParams2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f2104f046e8740f1db5d7922e17b0d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f2104f046e8740f1db5d7922e17b0d");
            } else if (!"lingxi".contentEquals(reportAnalyticsParams2.eventName)) {
                iApiCallback.onFail(null);
            } else {
                try {
                    jSONObject = new JSONObject(reportAnalyticsParams2.data);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    iApiCallback.onFail(null);
                    return;
                }
                String optString = jSONObject.optString("channel");
                String optString2 = jSONObject.optString("nm");
                String optString3 = jSONObject.optString("val_cid");
                String optString4 = jSONObject.optString("val_bid");
                JSONObject optJSONObject = jSONObject.optJSONObject("val_lab");
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                    iApiCallback.onFail(null);
                    return;
                }
                if (optJSONObject != null) {
                    hashMap = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, optJSONObject.optString(next));
                    }
                } else {
                    hashMap = null;
                }
                String format = String.format("%s_%s", "com.weidian.lib.hera.main.HeraActivity", getAppId());
                Channel channel = Statistics.getChannel(optString);
                if ("MV".contentEquals(optString2)) {
                    channel.writeModelView(format, optString4, hashMap, optString3);
                } else if ("MC".contentEquals(optString2)) {
                    channel.writeModelClick(format, optString4, hashMap, optString3);
                } else if (QuickReportConstants.ME_CONFIG.contentEquals(optString2)) {
                    channel.writeModelEdit(format, optString4, hashMap, optString3);
                } else if (QuickReportConstants.BO_CONFIG.contentEquals(optString2)) {
                    channel.writeBizOrder(format, optString4, hashMap, optString3);
                } else if (QuickReportConstants.BP_CONFIG.contentEquals(optString2)) {
                    channel.writeBizPay(format, optString4, hashMap, optString3);
                } else if ("SC".contentEquals(optString2)) {
                    channel.writeSystemCheck(format, optString4, hashMap, optString3);
                } else if (QuickReportConstants.PV_CONFIG.contentEquals(optString2)) {
                    channel.writePageView(format, optString3, hashMap);
                } else if ("PD".contentEquals(optString2)) {
                    channel.writePageDisappear(format, optString3, hashMap);
                } else {
                    iApiCallback.onFail(null);
                    return;
                }
                iApiCallback.onSuccess(null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SetLxTag extends ApiFunction<JSONObject, Empty> {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public boolean isActivityApi() {
            return false;
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
            Map<String, Object> map;
            JSONObject jSONObject2 = jSONObject;
            Object[] objArr = {str, jSONObject2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64008f00bf405f72348f2fa6456f80a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64008f00bf405f72348f2fa6456f80a7");
                return;
            }
            JSONObject optJSONObject = jSONObject2.optJSONObject("data");
            if (optJSONObject == null || optJSONObject.length() == 0) {
                iApiCallback.onFail(null);
                return;
            }
            String optString = optJSONObject.optString("key");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("value");
            if (optJSONObject2 == null) {
                iApiCallback.onFail(null);
                return;
            }
            try {
                map = ac.a(optJSONObject2);
            } catch (JSONException unused) {
                map = null;
            }
            if (map == null) {
                iApiCallback.onFail(null);
                return;
            }
            Statistics.getChannel().updateTag(optString, map);
            iApiCallback.onSuccess(null);
        }
    }
}
