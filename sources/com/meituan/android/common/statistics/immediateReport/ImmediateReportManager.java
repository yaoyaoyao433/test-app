package com.meituan.android.common.statistics.immediateReport;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.networklog.c;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.InnerDataBuilder.NetworkReportTimeBuilder;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.network.NetworkController;
import com.meituan.android.common.statistics.utils.ABCHelper;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.DebugUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.common.statistics.utils.NetworkUtils;
import com.meituan.android.common.statistics.utils.SntpUtil;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ImmediateReportManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ImmediateReportManagerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static ImmediateReportManager immediateReportManager = new ImmediateReportManager();
    }

    public ImmediateReportManager() {
    }

    public static ImmediateReportManager getInstance() {
        return ImmediateReportManagerHolder.immediateReportManager;
    }

    public boolean immediateReport(Context context, JSONObject jSONObject, Map<String, String> map, String str) {
        JSONObject mapToJSONObject;
        Object[] objArr = {context, jSONObject, map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db625f930cae5ea8bba640ead2fae000", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db625f930cae5ea8bba640ead2fae000")).booleanValue();
        }
        if (jSONObject == null || jSONObject.length() <= 0 || map == null || map.size() <= 0 || !ConfigManager.getInstance(context).isImmediateReport(jSONObject.optString("nm"), jSONObject.optString("val_cid"), jSONObject.optString("val_bid")) || (mapToJSONObject = JsonUtil.mapToJSONObject(map)) == null || mapToJSONObject.length() <= 0) {
            return false;
        }
        String buildData = buildData(context, jSONObject, mapToJSONObject, str);
        LogUtil.log("ImmediateReport:report str=" + buildData);
        if (TextUtils.isEmpty(buildData) || realReport(context, buildData)) {
            return true;
        }
        LogUtil.log("ImmediateReport:report failed");
        return false;
    }

    private boolean realReport(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca11cf9304b1fb481691a3b55d08d70d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca11cf9304b1fb481691a3b55d08d70d")).booleanValue();
        }
        try {
            return NetworkController.report(AppUtil.getReportUrl(context), str);
        } catch (Exception e) {
            LogUtil.log("ImmediateReport:report throw exception=" + e.getMessage());
            return false;
        }
    }

    private String buildData(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Object[] objArr = {context, jSONObject, jSONObject2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0225bf8641dbeaec84ea477b4216e497", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0225bf8641dbeaec84ea477b4216e497");
        }
        try {
            JSONArray jSONArray = new JSONArray();
            NetworkReportTimeBuilder.getInstance().processData(context, jSONObject, jSONObject2, SntpUtil.currentTimeMillis());
            String optString = jSONObject2.optString("uuid", "");
            String optString2 = jSONObject2.optString("dpid", "");
            DefaultEnvironment defaultEnvironment = Statistics.getDefaultEnvironment();
            if (defaultEnvironment != null) {
                preProcessEnv(context, defaultEnvironment);
                Map<String, String> environment = defaultEnvironment.getEnvironment();
                if (TextUtils.isEmpty(optString)) {
                    if (environment != null) {
                        optString = environment.get("uuid");
                    }
                    if (!TextUtils.isEmpty(optString)) {
                        jSONObject2.put("uuid", optString);
                    }
                }
                if (TextUtils.isEmpty(optString2)) {
                    if (environment != null) {
                        optString2 = environment.get("dpid");
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        optString2 = OneIdHandler.getInstance(context).getLocalDpid(context);
                    }
                    if (!TextUtils.isEmpty(optString2)) {
                        jSONObject2.put("dpid", optString2);
                    }
                }
            }
            jSONObject2.put("category", str);
            String optString3 = jSONObject2.optString(Constants.Environment.KEY_UTM, "");
            if (!TextUtils.isEmpty(optString3)) {
                jSONObject2.put(Constants.Environment.KEY_UTM, new JSONObject(optString3));
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject);
            jSONObject2.put(Constants.Reporter.KEY_PACKAGE_TM, String.valueOf(System.currentTimeMillis()));
            ABCHelper.process(jSONObject2);
            ABCHelper.processLatLng(jSONArray2);
            if (ConfigManager.getInstance(context).isEncReport()) {
                jSONObject2.put(Constants.Environment.KEY_LX_DICT, "true");
                jSONObject2.put("evs", ABCHelper.enc(jSONArray2.toString()));
            } else {
                jSONObject2.put(Constants.Environment.KEY_LX_DICT, "false");
                jSONObject2.put("evs", jSONArray2);
            }
            jSONArray.put(jSONObject2);
            return jSONArray.length() > 0 ? jSONArray.toString() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    private void preProcessEnv(Context context, DefaultEnvironment defaultEnvironment) {
        Object[] objArr = {context, defaultEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48acd78541eec84440b0c28b675328d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48acd78541eec84440b0c28b675328d0");
            return;
        }
        try {
            Map<String, String> environment = defaultEnvironment.getEnvironment();
            if (environment != null) {
                if (TextUtils.isEmpty(environment.get("mac"))) {
                    environment.put("mac", NetworkUtils.mac(context));
                }
                if (TextUtils.isEmpty(environment.get("did"))) {
                    environment.put("did", AppUtil.getDeviceId(context));
                }
                if (TextUtils.isEmpty(environment.get("imei"))) {
                    environment.put("imei", AppUtil.getIMEI(context));
                }
                if (TextUtils.isEmpty(environment.get("imei2"))) {
                    environment.put("imei2", AppUtil.getIMEI2(context));
                }
                if (TextUtils.isEmpty(environment.get(Constants.Environment.KEY_IMSI))) {
                    environment.put(Constants.Environment.KEY_IMSI, AppUtil.getIMSI(context));
                }
                if (TextUtils.isEmpty(environment.get("meid"))) {
                    environment.put("meid", AppUtil.getMEID(context));
                }
                if (TextUtils.isEmpty(environment.get(Constants.Environment.KEY_ICCID))) {
                    environment.put(Constants.Environment.KEY_ICCID, AppUtil.getICCID(context));
                }
                if (TextUtils.isEmpty(environment.get(Constants.Environment.KEY_SERIAL_NUMBER))) {
                    environment.put(Constants.Environment.KEY_SERIAL_NUMBER, com.meituan.android.common.unionid.oneid.util.AppUtil.getSerial(context));
                }
                if (TextUtils.isEmpty(environment.get(Constants.Environment.KEY_MNO))) {
                    environment.put(Constants.Environment.KEY_MNO, com.meituan.android.common.unionid.oneid.util.AppUtil.getMNO(context));
                }
            }
        } catch (Exception unused) {
        }
    }

    private void writeLogan(Context context, String str, JSONObject jSONObject, String str2) {
        Object[] objArr = {context, str, jSONObject, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f95ae9f42e56a6fd93b6b88ccb12f646", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f95ae9f42e56a6fd93b6b88ccb12f646");
        } else if (ConfigManager.getInstance(context).isLoganBlack(jSONObject.optString(Constants.Environment.KEY_APPNM), str2)) {
        } else {
            c.a(str, 8);
        }
    }

    private void debugCheck(Context context, String str, JSONObject jSONObject, String str2) {
        Object[] objArr = {context, str, jSONObject, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07856e2df52dc41916e288428e9aa1ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07856e2df52dc41916e288428e9aa1ac");
        } else if (DebugUtils.isInDebugMode(context)) {
            DebugUtils.doLxReportEventCheck(1, str2, str, jSONObject.toString());
        }
    }
}
