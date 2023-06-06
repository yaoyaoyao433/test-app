package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.titans.bridge.BridgeConfigManager;
import com.dianping.titans.js.JsHost;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetAppInfoJsHandler extends BaseJsHandler {
    public static final String EXTRA_DOWNLOAD_CHANNEL = "downloadChannel";
    public static final String EXTRA_EXTRAS = "extras";
    public static final String EXTRA_FLAVOR = "flavor";
    public static final String EXTRA_PACKAGE_TYPE = "packageType";
    public static final List<String> PACKAGE_TYPES = new ArrayList<String>() { // from class: com.dianping.titans.js.jshandler.GetAppInfoJsHandler.1
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            add(GetAppInfoJsHandler.PACKAGE_TYPE_DEV);
            add("test");
            add("prod");
        }
    };
    public static final String PACKAGE_TYPE_DEV = "dev";
    public static final String PACKAGE_TYPE_PROD = "prod";
    public static final String PACKAGE_TYPE_TEST = "test";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e13efb5dd07d0730240e924e83ce1349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e13efb5dd07d0730240e924e83ce1349");
            return;
        }
        try {
            JsHost jsHost = jsHost();
            if (jsHost == null) {
                jsCallbackErrorMsg("no host");
                return;
            }
            Context applicationContext = jsHost.getContext().getApplicationContext();
            Object kNBAppId = BridgeConfigManager.getKNBAppId();
            String packageName = applicationContext.getPackageName();
            Object obj = applicationContext.getPackageManager().getPackageInfo(packageName, 0).versionName;
            String scheme = BridgeConfigManager.getScheme();
            String innerUrlKey = BridgeConfigManager.getInnerUrlKey();
            if (!TextUtils.isEmpty(scheme)) {
                scheme = scheme.contains(CommonConstant.Symbol.QUESTION_MARK) ? scheme + "&" + innerUrlKey : scheme + CommonConstant.Symbol.QUESTION_MARK + innerUrlKey;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appid", kNBAppId);
            jSONObject.put("version", obj);
            jSONObject.put("package", packageName);
            jSONObject.put("TitansX", "20.14.1");
            jSONObject.put(NetLogConstants.Details.SCHEME, scheme);
            Map<String, String> appInfoExtra = BridgeConfigManager.getAppInfoExtra();
            if (appInfoExtra != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : appInfoExtra.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put(EXTRA_EXTRAS, jSONObject2);
                Object obj2 = (String) appInfoExtra.get(EXTRA_PACKAGE_TYPE);
                if (PACKAGE_TYPES.contains(obj2)) {
                    jSONObject.put(EXTRA_PACKAGE_TYPE, obj2);
                }
            }
            jsCallback(jSONObject);
        } catch (Throwable th) {
            jsCallbackErrorMsg("inner err: " + th.getMessage());
        }
    }
}
