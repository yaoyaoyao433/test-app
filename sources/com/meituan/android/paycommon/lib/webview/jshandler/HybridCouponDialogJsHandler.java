package com.meituan.android.paycommon.lib.webview.jshandler;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.android.paycommon.lib.utils.r;
import com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment;
import com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HybridCouponDialogJsHandler extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String ARG_ERROR_PARAMS = "参数错误";
    private static final String ARG_ERROR_UNKNOWN = "未知错误";
    private static final String ARG_JSON_OR_RESULT_NULL = "resultData is not a JSON object or resultData is an empty object";
    private static final String ARG_URL_OR_BUSINESS_NULL = "both url and openBusiness path is null";
    private static final String ARG_WIDTH_OR_ASPECT_INVALIDATE = "either widthRatio or aspectRatio is invalidate";
    private static final String ARG_WIDTH_OR_ASPECT_NULL = "resultData is not a JSON object or resultData is an empty object";
    private static final int CODE_JSON_OR_RESULT_NULL = 20010;
    private static final int CODE_URL_OR_BUSINESS_NULL = 20011;
    private static final int CODE_WIDTH_OR_ASPECT_INVALIDATE = 20001;
    private static final int CODE_WIDTH_OR_ASPECT_NULL = 20000;
    private static final double CRITICALITY_WIDTHRATIO_OR_ASPECTRATIO = 0.1d;
    private static final String KEY_ASPECT_RATIO = "aspectRatio";
    private static final String KEY_OPEN_BUSINESS = "openBusiness";
    private static final String KEY_REQUEST_BODY = "requestBody";
    private static final String KEY_REQUEST_PATH = "requestPath";
    private static final String KEY_URL = "url";
    private static final String KEY_WIDTH_RATIO = "widthRatio";
    private static final int RES_CODE_CLICK_EVENTS = 403;
    private static final int RES_CODE_CLOSE_DIALOG = 101;
    private static final int RES_CODE_REQUEST_DATA = 401;
    private static final int RES_CODE_RETURN_DATA = 402;
    private static final String TAG_RESULT_DATA_INVALIDATE = "resultDataIsInvalid";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.transferPopUpParams";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "VW7xKiIMOorGS1d9A8W4vn1r+7aY8A6UV9aWSmCncNB8NV+9gx5Ds+HhNeI6mES1q4GExSALKZyHD7uAkPgsVA==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa255fbc508ad41e640dc0e07d4a249b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa255fbc508ad41e640dc0e07d4a249b");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            JSONObject jSONObject = jsBean().argsJson;
            if (jSONObject != null) {
                try {
                    int i = jSONObject.getInt(Constant.KEY_RESULT_CODE);
                    if (101 == i) {
                        PaymentDialogFragment.a b = c.a().b(activity);
                        if (b != null) {
                            b.a();
                            resultSuccess();
                            return;
                        }
                        return;
                    } else if (401 == i) {
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_hybrid_popup", 1180002);
                        if (c.a() != null && !TextUtils.isEmpty(c.a().b)) {
                            jsCallback(c.a().b);
                            return;
                        }
                        r.a("b_pay_5082x1jr_mv", "resultData 为空或者不是json数据");
                        com.meituan.android.paybase.common.analyse.cat.a.a(TAG_RESULT_DATA_INVALIDATE, "resultData 为空或者不是json数据");
                        return;
                    } else if (402 == i) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("resultData");
                        if (jSONObject2 != null && jSONObject2.has(KEY_WIDTH_RATIO) && jSONObject2.has("aspectRatio")) {
                            if (jSONObject2.getDouble(KEY_WIDTH_RATIO) >= CRITICALITY_WIDTHRATIO_OR_ASPECTRATIO && jSONObject2.getDouble("aspectRatio") >= CRITICALITY_WIDTHRATIO_OR_ASPECTRATIO) {
                                c a = c.a();
                                double d = jSONObject2.getDouble(KEY_WIDTH_RATIO);
                                Object[] objArr2 = {Double.valueOf(d)};
                                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "65dc85c68d9e27fe162c1b537506e4cb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "65dc85c68d9e27fe162c1b537506e4cb");
                                } else {
                                    a.c = d;
                                }
                                c a2 = c.a();
                                double d2 = jSONObject2.getDouble("aspectRatio");
                                Object[] objArr3 = {Double.valueOf(d2)};
                                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "2ca97b4785bfe72dc6682109751a89ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "2ca97b4785bfe72dc6682109751a89ca");
                                } else {
                                    a2.d = d2;
                                }
                                if (c.a().a(activity) != null) {
                                    c.a().a(activity).a(jSONObject2.getDouble(KEY_WIDTH_RATIO), jSONObject2.getDouble("aspectRatio"));
                                    resultSuccess();
                                    return;
                                }
                                r.a("b_pay_wbimim8j_mv", "dialogDataListener == null");
                                return;
                            }
                            resultError(20001, ARG_WIDTH_OR_ASPECT_INVALIDATE);
                            com.meituan.android.paybase.common.analyse.cat.a.a(TAG_RESULT_DATA_INVALIDATE, "widthRatio or aspectRatio is invalid");
                            r.a("b_pay_wbimim8j_mv", "widthRatio or aspectRatio is invalid");
                            return;
                        }
                        r.a("b_pay_wbimim8j_mv", "数据异常");
                        resultError(20000, "resultData is not a JSON object or resultData is an empty object");
                        com.meituan.android.paybase.common.analyse.cat.a.a(TAG_RESULT_DATA_INVALIDATE, "设置宽高时 resultData 为空或者不是json数据");
                        return;
                    } else if (403 == i) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("resultData");
                        String str = "";
                        String str2 = "";
                        String str3 = "";
                        if (jSONObject3 != null && jSONObject3.has("url")) {
                            str = jSONObject3.getString("url");
                        } else if (jSONObject3 != null && jSONObject3.has(KEY_OPEN_BUSINESS)) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject(KEY_OPEN_BUSINESS);
                            if (jSONObject4 != null && jSONObject4.has(KEY_REQUEST_PATH) && jSONObject4.has(KEY_REQUEST_BODY)) {
                                str2 = jSONObject4.getString(KEY_REQUEST_PATH);
                                str3 = jSONObject4.getString(KEY_REQUEST_BODY);
                            } else {
                                jsCallbackError(20010, "resultData is not a JSON object or resultData is an empty object");
                                com.meituan.android.paybase.common.analyse.cat.a.a(TAG_RESULT_DATA_INVALIDATE, "处理点击事件时 resultData为空或者不是json数据");
                            }
                        } else {
                            jsCallbackError(20010, "resultData is not a JSON object or resultData is an empty object");
                            com.meituan.android.paybase.common.analyse.cat.a.a(TAG_RESULT_DATA_INVALIDATE, "处理点击事件时 resultData为空或者不是json数据");
                        }
                        if (!TextUtils.isEmpty(str)) {
                            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_hybrid_popup_rightbutton", 1180021);
                            PaymentDialogFragment.a b2 = c.a().b(activity);
                            if (b2 != null) {
                                b2.a(str);
                                resultSuccess();
                                return;
                            }
                            return;
                        } else if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_hybrid_popup_rightbutton", 1180022);
                            PaymentDialogFragment.a b3 = c.a().b(activity);
                            if (b3 != null) {
                                b3.a(str2, str3);
                                resultSuccess();
                                return;
                            }
                            return;
                        } else {
                            jsCallbackError(20011, ARG_URL_OR_BUSINESS_NULL);
                            com.meituan.android.paybase.common.analyse.cat.a.a(TAG_RESULT_DATA_INVALIDATE, ARG_URL_OR_BUSINESS_NULL);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "HybridCouponDialogJsHandler_exec", (Map<String, Object>) null);
                }
            }
            resultError(11, ARG_ERROR_UNKNOWN);
            return;
        }
        resultError(11, ARG_ERROR_UNKNOWN);
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd47c7d091598aa95c7dc66edc59d98e", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd47c7d091598aa95c7dc66edc59d98e") : getClass();
    }

    private void resultError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8cf63afa88e26037d21900d35df9270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8cf63afa88e26037d21900d35df9270");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity instanceof com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) {
            ((com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) activity).onClickCouponDialogConfirm();
        } else if (activity != null) {
            try {
                ((com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) activity.getClass().getMethod("getConfirmCallBack", new Class[0]).invoke(activity, new Object[0])).onClickCouponDialogConfirm();
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e);
            }
        }
        jsCallbackError(i, str);
    }

    private void resultSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb4ee2669ebb8cdee3fe9c50bc9414b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb4ee2669ebb8cdee3fe9c50bc9414b2");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", "success");
            jsCallback(jSONObject.toString());
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HybridCouponDialogJsHandler_exec", (Map<String, Object>) null);
            resultError(11, ARG_ERROR_UNKNOWN);
        }
    }
}
