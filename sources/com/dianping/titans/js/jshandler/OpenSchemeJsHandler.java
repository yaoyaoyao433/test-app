package com.dianping.titans.js.jshandler;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.dianping.titans.bridge.BridgeConfigManager;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.meituan.arbiter.hook.Utils;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.tencent.mapsdk.internal.y;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OpenSchemeJsHandler extends BaseJsHandler {
    private static final int OPEN_DEFAULT = 0;
    private static final int OPEN_INNER = 1;
    private static final int OPEN_OUTER = 2;
    private static final String TAG = "openPage";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "312189c4d7bfa3e5c33ed9a9e9e722d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "312189c4d7bfa3e5c33ed9a9e9e722d1");
            return;
        }
        String optString = jsBean().argsJson.optString("url");
        String optString2 = jsBean().argsJson.optString("extra");
        if (TextUtils.isEmpty(optString)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", 520);
                jSONObject.put("status", "fail");
                jSONObject.put("errMsg", "Url is empty");
            } catch (JSONException unused) {
            }
            jsCallback(jSONObject);
            return;
        }
        Uri parse = Uri.parse(optString);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            jsCallbackError(521, "scheme is null");
            return;
        }
        int openInAppFlag = getOpenInAppFlag(parse);
        if (!BridgeConfigManager.isSchemeInWhite(scheme) && (!URLUtil.isNetworkUrl(optString) || openInAppFlag != 2)) {
            jsCallbackError(2061, "scheme not in white list");
            return;
        }
        try {
            if (openInAppFlag == 2) {
                openPageImpl(parse, optString2, 2);
            } else if (openInAppFlag == 1) {
                openPageImpl(parse, optString2, 1);
            } else if (openInAppFlag == 0) {
                try {
                    openPageImpl(parse, optString2, 1);
                } catch (Exception unused2) {
                    openPageImpl(parse, optString2, 2);
                }
            }
        } catch (Exception e) {
            callbackError(e);
        }
    }

    private void callbackError(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aa0ed396c3c7468c03a5b0d1d72963b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aa0ed396c3c7468c03a5b0d1d72963b");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errMsg", Log.getStackTraceString(exc));
            jSONObject.put("errorCode", 2060);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }

    private int getOpenInAppFlag(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3fba9224d2ce2ad715ec140b9524bcd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3fba9224d2ce2ad715ec140b9524bcd")).intValue();
        }
        if (uri.isHierarchical()) {
            String queryParameter = uri.getQueryParameter("_knbopeninapp");
            String queryParameter2 = uri.getQueryParameter("openInApp");
            if ("2".equals(queryParameter2)) {
                return 2;
            }
            return ("1".equals(queryParameter2) || "1".equals(queryParameter)) ? 1 : 0;
        }
        return 2;
    }

    private void openPageImpl(Uri uri, String str, int i) throws Exception {
        boolean z = false;
        Object[] objArr = {uri, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "017dd6ad441e0e804308c8d4fa023937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "017dd6ad441e0e804308c8d4fa023937");
        } else if (uri == null) {
            throw new Exception("uri is null");
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("extra", str);
            }
            if (i == 1) {
                String packageName = jsHost().getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    intent.setPackage(packageName);
                    intent.putExtra(Utils.EXTRA_NEED_EXCEPTION, true);
                    intent.putExtra(Constants.TRAFFIC_REFERER, jsHost().getUrl());
                    intent.putExtra(FoodDetailNetWorkPreLoader.INTENT_REFERER_SOURCE, "openSchemeJsHandler");
                    if (z && UriUtil.isUriParamEquals(uri, "_new_task", "1")) {
                        intent.addFlags(y.a);
                    }
                    boolean useStartActivity = UriUtil.useStartActivity(jsHost().getContext(), uri);
                    if (!UriUtil.isUriParamEquals(uri, "noresult", "1") || useStartActivity) {
                        jsHost().startActivity(intent);
                    } else {
                        jsHost().startActivityForResult(intent, 110);
                    }
                    jsCallback();
                }
            }
            z = true;
            intent.putExtra(Utils.EXTRA_NEED_EXCEPTION, true);
            intent.putExtra(Constants.TRAFFIC_REFERER, jsHost().getUrl());
            intent.putExtra(FoodDetailNetWorkPreLoader.INTENT_REFERER_SOURCE, "openSchemeJsHandler");
            if (z) {
                intent.addFlags(y.a);
            }
            boolean useStartActivity2 = UriUtil.useStartActivity(jsHost().getContext(), uri);
            if (!UriUtil.isUriParamEquals(uri, "noresult", "1")) {
            }
            jsHost().startActivity(intent);
            jsCallback();
        }
    }
}
