package com.meituan.msi.api.report;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReportMSIMetricsApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "reportMSIMetrics", request = ReportMSIMetricsParam.class, scope = PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE)
    public void reportMSIMetrics(ReportMSIMetricsParam reportMSIMetricsParam, MsiContext msiContext) {
        String str;
        Object[] objArr = {reportMSIMetricsParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b64b5df8bb32c223cd0b48345803221c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b64b5df8bb32c223cd0b48345803221c");
            return;
        }
        Object[] objArr2 = {reportMSIMetricsParam};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ecf1cd151757bb971ba88ebdb936e3f", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ecf1cd151757bb971ba88ebdb936e3f");
        } else {
            JsonElement jsonElement = reportMSIMetricsParam.metrics;
            if (jsonElement == null || jsonElement.isJsonNull()) {
                str = "";
            } else if (jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                str = asJsonObject == null ? "" : asJsonObject.toString();
            } else if (jsonElement.isJsonArray()) {
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                str = asJsonArray == null ? "" : asJsonArray.toString();
            } else {
                str = jsonElement.isJsonPrimitive() ? jsonElement.getAsString() : "";
            }
        }
        try {
            aa.a(!TextUtils.isEmpty(str) ? new JSONArray(str) : null, msiContext);
        } catch (JSONException unused) {
        }
        msiContext.onSuccess(null);
    }
}
