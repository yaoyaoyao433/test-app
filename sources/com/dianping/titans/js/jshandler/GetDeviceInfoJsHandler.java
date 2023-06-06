package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.dianping.titans.bridge.BridgeConfigManager;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.android.knb.util.DeviceInfo;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetDeviceInfoJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2047449dab9c3765eb9b4468568f2245", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2047449dab9c3765eb9b4468568f2245");
        } else {
            KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.js.jshandler.GetDeviceInfoJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "52b124c76ee6b48d4d7da408baf7810f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "52b124c76ee6b48d4d7da408baf7810f");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        Context context = GetDeviceInfoJsHandler.this.jsHost().getContext();
                        jSONObject.put("os", "Android");
                        jSONObject.put("osVersion", Build.VERSION.RELEASE);
                        jSONObject.put("manufacturer", Build.MANUFACTURER);
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put(Constants.Environment.KEY_IDFA, "");
                        jSONObject.put(Constants.Environment.KEY_IDFV, "");
                        jSONObject.put("battery", DeviceInfo.getRemainingBattery(context));
                        jSONObject.put("mac", GetDeviceInfoJsHandler.this.mac());
                        jSONObject.put("imei", GetDeviceInfoJsHandler.this.imei());
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        jSONObject.put("displayWidth", displayMetrics.widthPixels);
                        jSONObject.put("displayHeight", displayMetrics.heightPixels);
                        Locale locale = context.getResources().getConfiguration().locale;
                        if (locale != null) {
                            jSONObject.put("language", locale.getLanguage());
                        } else {
                            jSONObject.put("language", "unknown");
                        }
                        jSONObject.put("timeZone", TimeZone.getDefault().getID());
                        jSONObject.put("deviceLevel", BridgeConfigManager.getDeviceLevel(context));
                        GetDeviceInfoJsHandler.this.jsCallback(jSONObject);
                    } catch (Throwable th) {
                        GetDeviceInfoJsHandler.this.jsCallbackError(8, Log.getStackTraceString(th));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String imei() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0df014dfbc7248104bed1accd11a0022", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0df014dfbc7248104bed1accd11a0022") : BridgeConfigManager.getIMEI(jsHost().getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String mac() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "357047da1d1167315de0dfb208cde705", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "357047da1d1167315de0dfb208cde705") : BridgeConfigManager.getMac(jsHost().getActivity());
    }
}
