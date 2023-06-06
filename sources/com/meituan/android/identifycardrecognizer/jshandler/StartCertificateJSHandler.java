package com.meituan.android.identifycardrecognizer.jshandler;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.identifycardrecognizer.utils.d;
import com.meituan.android.paybase.common.analyse.cat.a;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StartCertificateJSHandler extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String BIZID = "bizId";
    private static final String CALLBACKURL = "callbackUrl";
    private static final String CAT_ACTION_START_CERTIFICATE = "pay_biz_start_certificate";
    private static final String CERTIFICATE_TYPE = "certificateType";
    private static final String CUSTOMID = "customId";
    private static final String EXTRADATA = "extraData";
    private static final String KEY_IDENTIFY_INFO = "identifyInfo";
    private static final String KEY_INFO = "info";
    private static final String KEY_PASSPORT_INFO = "passportInfo";
    private static final String KEY_RESPONSE = "response";
    private static final String KEY_URL = "imageURLs";
    private static final String MERCHANTNO = "merchantNo";
    private static final String PATH = "path";
    private static final String PATH_RECOGNIZE = "recognize";
    private static final String PATH_TAKE_PHOTO = "takePhoto";
    private static final String PATH_VERIFY = "verify";
    private static final String SCHEME = "meituanpayment://financeCertificate/";
    private static final int START_ACTIVITY_TO_CERTIFICATE = 493;
    private static final String TYPE_ID_CARD = "1";
    private static final String TYPE_PASSPORT = "2";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String certificateType;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.startCertificate";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Wp0w9pCLFLUt7R08A3WAlTsAydfS+G2narXa2+1HSUwDb9Eavk97lO9JOFsKrUHmlqSgGGmhOPUxTJjkvee/iQ==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69745061163cd36dff8fc4c16e4a59d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69745061163cd36dff8fc4c16e4a59d6");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity == null) {
            resultError();
            a.a(CAT_ACTION_START_CERTIFICATE, -9753);
            a.a("startCertificate", "调起异常");
            return;
        }
        String optString = jsBean().argsJson.optString("path");
        String optString2 = jsBean().argsJson.optString(MERCHANTNO);
        String optString3 = jsBean().argsJson.optString(BIZID);
        String optString4 = jsBean().argsJson.optString(CALLBACKURL);
        String optString5 = jsBean().argsJson.optString(CUSTOMID);
        String optString6 = jsBean().argsJson.optString(EXTRADATA);
        this.certificateType = jsBean().argsJson.optString(CERTIFICATE_TYPE);
        if (TextUtils.equals(optString, PATH_TAKE_PHOTO) || TextUtils.equals(optString, PATH_RECOGNIZE) || TextUtils.equals(optString, PATH_VERIFY)) {
            Uri.Builder buildUpon = Uri.parse(SCHEME + optString).buildUpon();
            buildUpon.appendQueryParameter(MERCHANTNO, optString2);
            buildUpon.appendQueryParameter(CERTIFICATE_TYPE, this.certificateType);
            buildUpon.appendQueryParameter(BIZID, optString3);
            buildUpon.appendQueryParameter(CALLBACKURL, optString4);
            buildUpon.appendQueryParameter(CUSTOMID, optString5);
            buildUpon.appendQueryParameter(EXTRADATA, optString6);
            Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
            intent.setPackage(activity.getPackageName());
            activity.startActivityForResult(intent, START_ACTIVITY_TO_CERTIFICATE);
            a.a(CAT_ACTION_START_CERTIFICATE, 200);
            return;
        }
        a.a(CAT_ACTION_START_CERTIFICATE, -9753);
        a.a("startCertificate", "调起异常");
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b50d4e2f0d55d863bebd6482881826bc", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b50d4e2f0d55d863bebd6482881826bc") : getClass();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d2befb89936a398cd3367e955ad6fe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d2befb89936a398cd3367e955ad6fe1");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == START_ACTIVITY_TO_CERTIFICATE) {
            if (i2 != -1) {
                if (i2 == 0) {
                    resultCancel();
                }
            } else if (intent != null) {
                if (TextUtils.equals("success", f.a(intent, "status"))) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        Serializable c = f.c(intent, "data");
                        String a = f.a(intent, "url");
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(a)) {
                            arrayList.add(a);
                            jSONObject2.put(KEY_URL, arrayList);
                        }
                        if (c != null) {
                            String json = new Gson().toJson(c);
                            JSONObject jSONObject3 = new JSONObject();
                            if (TextUtils.equals(this.certificateType, "1")) {
                                jSONObject3.put(KEY_IDENTIFY_INFO, new JSONObject(json));
                            } else if (TextUtils.equals(this.certificateType, "2")) {
                                jSONObject3.put(KEY_PASSPORT_INFO, new JSONObject(json));
                            }
                            jSONObject2.put("info", jSONObject3);
                        }
                        jSONObject.put(KEY_RESPONSE, jSONObject2);
                    } catch (Exception e) {
                        com.meituan.android.paybase.common.analyse.a.a(e, "StartCertificateJSHandler.onActivityResult", (Map<String, Object>) null);
                    }
                    jsCallback(jSONObject);
                    return;
                }
                resultError();
            } else {
                resultError();
            }
        }
    }

    private void resultError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5646f4de1b3c9205d856c1077c874b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5646f4de1b3c9205d856c1077c874b02");
        } else {
            jsCallbackPayError(11);
        }
    }

    private void resultCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1931b9ae7b78a7086376f768a5b95441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1931b9ae7b78a7086376f768a5b95441");
            return;
        }
        d.a("b_pay_certificate_cancel_sc", null);
        jsCallbackPayError(12);
    }
}
