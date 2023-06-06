package com.meituan.android.paycommon.lib.webview.jshandler;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.fingerprint.OnlineVerifyFingerprintActivity;
import com.meituan.android.paybase.password.verifypassword.PasswordVerifyActivity;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.android.paycommon.lib.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StartIdentifyJSHandler extends PayBaseJSHandler {
    private static final String FLAG_VERIFY_NATIVE_FALSE = "false";
    private static final String TYPE_IDENTIFY_PAGE_DIALOG = "2";
    private static final String TYPE_IDENTIFY_PAGE_PAGE = "1";
    private static final String TYPE_VERIFY_NATIVE_TRUE = "true";
    private static final String TYPE_VERIFY_PAGE_FINGERPRINT = "2";
    private static final String TYPE_VERIFY_PAGE_PASSWORD = "1";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String fingerType;
    private String pageType;

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        JSONObject optJSONObject;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2402669feffcf3a789d23929546eefd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2402669feffcf3a789d23929546eefd9");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null && jsBean().argsJson != null) {
            JSONObject optJSONObject2 = jsBean().argsJson.optJSONObject("outer_params");
            com.meituan.android.paybase.password.utils.a.a();
            if (optJSONObject2 != null) {
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    com.meituan.android.paybase.password.utils.a.a(next, optJSONObject2.optString(next));
                }
            }
            String optString = jsBean().argsJson.optString("verify_type");
            String optString2 = jsBean().argsJson.optString("verify_native");
            String optString3 = jsBean().argsJson.optString("merchantNo");
            String optString4 = jsBean().argsJson.optString("verifyNo");
            String optString5 = jsBean().argsJson.optString("risk_partnerid");
            String optString6 = jsBean().argsJson.optString("orderNo");
            String optString7 = jsBean().argsJson.optString(KnbConstants.PARAMS_SCENE);
            if (TextUtils.equals(optString, "1")) {
                optJSONObject = jsBean().argsJson.optJSONObject("paypassword");
            } else if (TextUtils.equals(optString, "2")) {
                optJSONObject = jsBean().argsJson.optJSONObject("fingerprintpay");
            } else {
                o.a("StartIdentifyJSHandler", "b_ivh1h5ku", getReportMap().a("error_message", "verifyType invalid").b);
                jsCallbackErrorAndResetParams(11, "传入参数错误");
                logStartIdentifyPlatformError(1160010);
                return;
            }
            if (optJSONObject == null) {
                o.a("StartIdentifyJSHandler", "b_ivh1h5ku", getReportMap().a("error_message", "pageinfo null").b);
                jsCallbackErrorAndResetParams(11, "传入参数错误");
                logStartIdentifyPlatformError(1160010);
                return;
            }
            this.pageType = optJSONObject.optString("page_type");
            String optString8 = optJSONObject.optString("page_title");
            String optString9 = optJSONObject.optString("page_tip");
            String optString10 = optJSONObject.optString("page_subtip");
            String optString11 = optJSONObject.optString("challenge");
            String optString12 = optJSONObject.optString("read_text");
            String optString13 = optJSONObject.optString("pay_button");
            this.fingerType = optJSONObject.optString("finger_type");
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("paypassword_verify");
            if (optJSONObject3 != null) {
                str = optString13;
                String optString14 = optJSONObject3.optString("page_title");
                String optString15 = optJSONObject3.optString("page_tip");
                String optString16 = optJSONObject3.optString("page_subtip");
                str4 = optJSONObject3.optString("entry_text");
                str2 = optString14;
                str5 = optString15;
                str3 = optString16;
            } else {
                str = optString13;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
            }
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("config");
            if (optJSONObject4 != null) {
                String optString17 = optJSONObject4.optString("verify_min_decibels");
                String optString18 = optJSONObject4.optString("verify_min_time");
                str6 = str2;
                str7 = optJSONObject4.optString("verify_max_time");
                str8 = optString17;
                str9 = optString18;
            } else {
                str6 = str2;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (!isParamValid(optString3, optString4, optString5, optString7)) {
                o.a("StartIdentifyJSHandler", "b_ivh1h5ku", getReportMap().a("error_message", "merchantNo or partnerId or orderNo or scene null").b);
                jsCallbackErrorAndResetParams(11, "传入参数错误");
                logStartIdentifyPlatformError(1160010);
                return;
            }
            String str11 = str7;
            if (TextUtils.equals(optString, "2")) {
                str10 = optString;
                if (TextUtils.equals(this.fingerType, "2") && TextUtils.isEmpty(optString11)) {
                    o.a("StartIdentifyJSHandler", "b_ivh1h5ku", getReportMap().a("error_message", "challenge null").b);
                    jsCallbackErrorAndResetParams(11, "传入参数错误");
                    logStartIdentifyPlatformError(1160010);
                    return;
                }
            } else {
                str10 = optString;
            }
            if (!ag.a(this.pageType, "2", "1")) {
                this.pageType = "1";
            }
            if (!TextUtils.equals("true", optString2)) {
                optString2 = "false";
            }
            Uri build = new Uri.Builder().appendQueryParameter("verify_native", optString2).appendQueryParameter("merchant_no", optString3).appendQueryParameter("verify_no", optString4).appendQueryParameter("partner_id", optString5).appendQueryParameter("order_no", optString6).appendQueryParameter(KnbConstants.PARAMS_SCENE, optString7).appendQueryParameter("pagetype", this.pageType).appendQueryParameter("pagetitle", optString8).appendQueryParameter("pagetip", optString9).appendQueryParameter("pagesubtip", optString10).appendQueryParameter("readtext", optString12).appendQueryParameter("paybutton", str).appendQueryParameter("min_db", str8).appendQueryParameter("min_time", str9).appendQueryParameter("max_time", str11).appendQueryParameter("challenge", optString11).appendQueryParameter("finger_type", this.fingerType).appendQueryParameter("paypassword_verify_page_title", str6).appendQueryParameter("paypassword_verify_page_tip", str5).appendQueryParameter("paypassword_verify_page_subtip", str3).appendQueryParameter("paypassword_verify_entry_text", str4).build();
            Intent intent = new Intent();
            intent.setPackage(activity.getPackageName());
            intent.setData(build);
            String str12 = str10;
            if (TextUtils.equals(str12, "1")) {
                intent.setClass(activity, PasswordVerifyActivity.class);
                activity.startActivityForResult(intent, 404);
                return;
            } else if (TextUtils.equals(str12, "2")) {
                intent.setClass(activity, OnlineVerifyFingerprintActivity.class);
                activity.startActivityForResult(intent, 405);
                return;
            } else {
                return;
            }
        }
        o.a("StartIdentifyJSHandler", "b_ivh1h5ku", getReportMap().a("error_message", "unknown").b);
        jsCallbackErrorAndResetParams(11, "未知错误");
        logStartIdentifyPlatformError(-9753);
    }

    private boolean isParamValid(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c904f232a709f0f338c3b6126193dfc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c904f232a709f0f338c3b6126193dfc7")).booleanValue();
        }
        if (ag.a(str3, str4)) {
            return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) ? false : true;
        }
        return false;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        String a;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f913373b32e94acf740b7c736749231c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f913373b32e94acf740b7c736749231c");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == 404) {
                a = f.a(intent, "password_token");
            } else {
                a = i == 405 ? f.a(intent, "payToken") : null;
            }
            if (!TextUtils.isEmpty(a)) {
                try {
                    o.a("StartIdentifyJSHandler", "b_0y490b9x", getReportMap().b);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pass_verify_platform", 200);
                    jsCallback(new JSONObject().put("payToken", a));
                    com.meituan.android.paybase.password.utils.a.a();
                    return;
                } catch (JSONException e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "StartIdentifyJSHandler_onActivityResult", (Map<String, Object>) null);
                    o.a("StartIdentifyJSHandler", "b_ivh1h5ku", getReportMap().a("error_message", "unknown 2").b);
                    jsCallbackErrorAndResetParams(11, "未知错误");
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pass_verify_platform", -9753);
                    return;
                }
            }
            o.a("StartIdentifyJSHandler", "b_ivh1h5ku", getReportMap().a("error_message", "unknown 3").b);
            jsCallbackErrorAndResetParams(11, "客户端错误");
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pass_verify_platform", -9753);
            return;
        }
        o.a("StartIdentifyJSHandler", "b_p99zz5rs", getReportMap().b);
        jsCallbackErrorAndResetParams(12, "取消验证");
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pass_verify_platform", -9854);
    }

    private a.c getReportMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ee94d3e80c4ca26cdd964d24976bf77", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ee94d3e80c4ca26cdd964d24976bf77");
        }
        a.c cVar = new a.c();
        cVar.a("verify_type", jsBean().argsJson.optString("verify_type")).a("merchant_no", jsBean().argsJson.optString("merchantNo")).a("verify_no", jsBean().argsJson.optString("verifyNo")).a("partner_id", jsBean().argsJson.optString("risk_partnerid")).a("order_no", jsBean().argsJson.optString("orderNo")).a(KnbConstants.PARAMS_SCENE, jsBean().argsJson.optString(KnbConstants.PARAMS_SCENE)).a("page_type", this.pageType).a("finger_type", this.fingerType);
        return cVar;
    }

    private void jsCallbackErrorAndResetParams(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f44e6bf4067c19dd5559cbb7d252911a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f44e6bf4067c19dd5559cbb7d252911a");
            return;
        }
        jsCallbackError(i, str);
        com.meituan.android.paybase.password.utils.a.a();
    }

    private void logStartIdentifyPlatformError(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b15cd3cabcfba204d21fd9b0b04fbba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b15cd3cabcfba204d21fd9b0b04fbba");
            return;
        }
        com.meituan.android.paybase.common.analyse.cat.a.a("startVerifyPlatformError", "验证平台调起异常");
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_verify_platform", i);
    }
}
