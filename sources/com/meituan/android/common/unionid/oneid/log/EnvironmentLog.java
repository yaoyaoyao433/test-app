package com.meituan.android.common.unionid.oneid.log;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.monitor.MonitorLog;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.unionid.oneid.session.SessionIdHelper;
import com.meituan.android.common.unionid.oneid.util.AESUtils;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.android.common.unionid.oneid.util.ProcessUtils;
import com.meituan.android.common.unionid.oneid.util.TempIDGenerator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class EnvironmentLog {
    private static volatile EnvironmentLog INSTANCE = null;
    private static final String OAID = "tokeno";
    private static final String SESSION_ID = "session_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final JSONObject environmentJson;

    public EnvironmentLog(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4432566fafa8451bd4777245c00ea5e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4432566fafa8451bd4777245c00ea5e8");
            return;
        }
        this.environmentJson = new JSONObject();
        if (context != null) {
            try {
                MonitorLog.processName = ProcessUtils.getCurrentProcessName(context);
                this.environmentJson.put("category", "data_sdk_uuid_report");
                this.environmentJson.put("app_name", AppUtil.getApp(context));
                this.environmentJson.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, AppUtil.getVersion(context));
                this.environmentJson.put("sdk_version", AppUtil.getSdkVersion(context));
                this.environmentJson.put("app", AppUtil.getPackageName(context));
                this.environmentJson.put("session_id", SessionIdHelper.getSessionId(context));
                LogUtils.i("session_id", "sessionid:" + SessionIdHelper.getSessionId(context));
                this.environmentJson.put("local_id", AppUtil.getLocalId(context));
                this.environmentJson.put("os", "Android");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("client_type", AppUtil.getClientType(context));
                jSONObject.put("os_version", AppUtil.getOSVersion(context));
                jSONObject.put("device_model", AppUtil.getDeviceModel(context));
                jSONObject.put(OAID, AESUtils.encrypt(OaidManager.getInstance().getLocalOAID(context)));
                jSONObject.put("brand", AppUtil.getBrand(context));
                jSONObject.put("tokena", AESUtils.encrypt(AppUtil.getAndroidId(context)));
                JSONObject jSONObject2 = new JSONObject();
                this.environmentJson.put("device_info", jSONObject);
                this.environmentJson.put("ext_info", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("firstInstallTime", AppUtil.getFirstInstallTime(context));
                jSONObject3.put(DeviceInfo.LOCAL_UUID_INSTALL_NSEC_TIME, AppUtil.getLocalUuidInstallNsecTime(context));
                jSONObject3.put("localUnionIdInstallNsecTime", AppUtil.getLocalUnionIdInstallNsecTime(context));
                jSONObject3.put(DeviceInfo.LOCAL_DPID_INSTALL_NSEC_TIME, AppUtil.getLocalDpidInstallNsecTime(context));
                jSONObject3.put(DeviceInfo.NEW_INSTALL_NSEC_TIME, AppUtil.getNewTransferInstallNsecTime(context));
                jSONObject3.put("lastUpdateTime", AppUtil.getLastUpdateTime(context));
                jSONObject3.put("processName", MonitorLog.processName);
                if (OneIdPrivacyHelper.isPrivacyMode(context)) {
                    jSONObject3.put("boot", "");
                } else {
                    jSONObject3.put("boot", AESUtils.encrypt(AppUtil.getBootId1()));
                }
                jSONObject3.put("processSession", TempIDGenerator.generate());
                boolean isFirstRun = OneIdSharePref.getInstance(context).getLastSyncTime() != -1 ? false : OneIdSharePref.getInstance(context).isFirstRun();
                jSONObject3.put("isFirstRun", isFirstRun);
                if (isFirstRun) {
                    OneIdSharePref.getInstance(context).reverseFirstRun();
                }
                jSONObject2.put("environmentInfo", jSONObject3);
            } catch (Exception unused) {
            }
        }
    }

    public static EnvironmentLog getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e56376689140c48abcb9eba572c1a8d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (EnvironmentLog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e56376689140c48abcb9eba572c1a8d7");
        }
        if (INSTANCE == null) {
            synchronized (EnvironmentLog.class) {
                if (INSTANCE == null) {
                    INSTANCE = new EnvironmentLog(context);
                }
            }
        }
        return INSTANCE;
    }

    public final JSONObject getEnvironmentJson(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa47653136e5d6bc05ed4bcf208738e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa47653136e5d6bc05ed4bcf208738e3");
        }
        supplementSessionId(context);
        supplementOaid(context);
        return this.environmentJson;
    }

    private void supplementSessionId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b394574cc27b1617fe89adaf8bc6d0c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b394574cc27b1617fe89adaf8bc6d0c1");
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.environmentJson.getString("session_id")) || context == null) {
                return;
            }
            this.environmentJson.put("session_id", SessionIdHelper.getSessionId(context));
        } catch (Exception unused) {
        }
    }

    private void supplementOaid(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ce3b09866dc0a6d5812440eb859f798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ce3b09866dc0a6d5812440eb859f798");
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.environmentJson.getString(OAID)) || context == null) {
                return;
            }
            this.environmentJson.put(OAID, AESUtils.encrypt(OaidManager.getInstance().getLocalOAID(context)));
        } catch (Exception unused) {
        }
    }
}
