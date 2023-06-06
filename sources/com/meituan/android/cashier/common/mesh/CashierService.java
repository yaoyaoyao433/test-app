package com.meituan.android.cashier.common.mesh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.bean.MeshBaseUrl;
import com.sankuai.mesh.core.MeshMethod;
import com.sankuai.mesh.core.c;
import com.sankuai.mesh.core.e;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class CashierService extends c {
    private static final String API_OPEN_URL = "openUrl";
    private static final String API_OPEN_URL_FOR_RESULT = "openUrlForResult";
    private static final String KEY_ERROR_CODE = "errorCode";
    private static final String KEY_ERROR_MSG = "errorMsg";
    private static final String PARAM_REQUEST_CODE = "requestCode";
    private static final String PARAM_URL = "url";
    private static final int REQUEST_FOR_CASHIER = 100;
    private static final String SERVICE_MESH = "mesh";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.mesh.core.c
    public boolean consumeActivityResult() {
        return true;
    }

    @MeshMethod("openCashier")
    public void openCashier() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0ac507892601f446320a7a1679424bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0ac507892601f446320a7a1679424bf");
        } else if (this.mMeshBaseUrl == null) {
            callBackError("meshBaseUrl is null");
        } else {
            JsonObject parameters = this.mMeshBaseUrl.getParameters();
            if (parameters != null) {
                String asString = parameters.get("trade_number") != null ? parameters.get("trade_number").getAsString() : null;
                String asString2 = parameters.get("pay_token") != null ? parameters.get("pay_token").getAsString() : null;
                String asString3 = parameters.get("callback_url") != null ? parameters.get("callback_url").getAsString() : null;
                String asString4 = parameters.get("requestCode") != null ? parameters.get("requestCode").getAsString() : null;
                String asString5 = parameters.get("is_cancel_to_url") != null ? parameters.get("is_cancel_to_url").getAsString() : null;
                String asString6 = parameters.get("merchant_no") != null ? parameters.get("merchant_no").getAsString() : null;
                String asString7 = parameters.get("extra_data") != null ? parameters.get("extra_data").getAsString() : null;
                String asString8 = parameters.get("extra_statics") != null ? parameters.get("extra_statics").getAsString() : null;
                String asString9 = parameters.get("cif") != null ? parameters.get("cif").getAsString() : null;
                if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("msg", "trade number和pay_token不能为空");
                    callBackError(jsonObject);
                    return;
                }
                Uri.Builder buildUpon = Uri.parse("meituanpayment://cashier/launch").buildUpon();
                addParam(buildUpon, "trade_number", asString);
                addParam(buildUpon, "pay_token", asString2);
                addParam(buildUpon, "callback_url", asString3);
                addParam(buildUpon, "is_cancel_to_url", asString5);
                addParam(buildUpon, "merchant_no", asString6);
                addParam(buildUpon, "extra_data", asString7);
                addParam(buildUpon, "extra_statics", asString8);
                addParam(buildUpon, "cif", asString9);
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("url", buildUpon.toString());
                if (!TextUtils.isEmpty(asString4)) {
                    jsonObject2.addProperty("requestCode", asString4);
                }
                Activity activity = (Activity) this.mContext;
                MeshBaseUrl build = new MeshBaseUrl.Builder().businessId(this.mMeshBaseUrl.getBusinessId()).service(SERVICE_MESH).api(API_OPEN_URL).parameters(jsonObject2.toString()).build();
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                e.a(activity, build, PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "066c6f791793f5eac5e360353d619d04", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "066c6f791793f5eac5e360353d619d04") : new a(this));
                return;
            }
            callBackError("");
        }
    }

    public static /* synthetic */ void lambda$openCashier$9(CashierService cashierService, MeshBaseUrl meshBaseUrl) {
        Object[] objArr = {cashierService, meshBaseUrl};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b00719e9f9c129cd764e706b77c2167", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b00719e9f9c129cd764e706b77c2167");
        } else if (meshBaseUrl.isRequestSuccess()) {
            cashierService.callBackOk("");
        } else {
            cashierService.callBackError("");
        }
    }

    private void addParam(Uri.Builder builder, String str, String str2) {
        Object[] objArr = {builder, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "964ca15106bf49140b46eec96a7b3ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "964ca15106bf49140b46eec96a7b3ed8");
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
        } else {
            builder.appendQueryParameter(str, str2);
        }
    }

    @MeshMethod("openCashierForResult")
    public void openCashierForResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bd4f020ffcee979b27f301432acc1fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bd4f020ffcee979b27f301432acc1fd");
        } else if (this.mMeshBaseUrl == null) {
            callBackError("meshBaseUrl is null");
        } else {
            JsonObject parameters = this.mMeshBaseUrl.getParameters();
            if (parameters != null) {
                String asString = parameters.get("trade_number") != null ? parameters.get("trade_number").getAsString() : null;
                String asString2 = parameters.get("pay_token") != null ? parameters.get("pay_token").getAsString() : null;
                String asString3 = parameters.get("callback_url") != null ? parameters.get("callback_url").getAsString() : null;
                String asString4 = parameters.get("merchant_no") != null ? parameters.get("merchant_no").getAsString() : null;
                String asString5 = parameters.get("is_cancel_to_url") != null ? parameters.get("is_cancel_to_url").getAsString() : null;
                String asString6 = parameters.get("extra_data") != null ? parameters.get("extra_data").getAsString() : null;
                String asString7 = parameters.get("extra_statics") != null ? parameters.get("extra_statics").getAsString() : null;
                String asString8 = parameters.get("cif") != null ? parameters.get("cif").getAsString() : null;
                if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("errorMsg", "trade number和pay_token不能为空");
                    jsonObject.addProperty("errorCode", (Number) 11);
                    callBackError(jsonObject);
                    return;
                }
                Uri.Builder buildUpon = Uri.parse("meituanpayment://cashier/launch").buildUpon();
                addParam(buildUpon, "trade_number", asString);
                addParam(buildUpon, "pay_token", asString2);
                addParam(buildUpon, "callback_url", asString3);
                addParam(buildUpon, "merchant_no", asString4);
                addParam(buildUpon, "is_cancel_to_url", asString5);
                addParam(buildUpon, "extra_data", asString6);
                addParam(buildUpon, "extra_statics", asString7);
                addParam(buildUpon, "cif", asString8);
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("url", buildUpon.toString());
                jsonObject2.addProperty("requestCode", (Number) 100);
                e.a((Activity) this.mContext, new MeshBaseUrl.Builder().businessId(this.mMeshBaseUrl.getBusinessId()).service(SERVICE_MESH).api(API_OPEN_URL_FOR_RESULT).parameters(jsonObject2.toString()).build(), this.mIMeshApiCallBack);
                return;
            }
            callBackError("cannot find params");
        }
    }

    @Override // com.sankuai.mesh.core.c
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47d7e6e9409a454a77ec7024e5e311d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47d7e6e9409a454a77ec7024e5e311d8");
        } else if (i == 100) {
            JsonObject jsonObject = new JsonObject();
            if (i2 == 0) {
                jsonObject.addProperty("errorCode", (Number) 12);
                callBackError(jsonObject);
            } else if (i2 == -1) {
                int a = f.a(intent, "result", -1);
                if (a == 1) {
                    callBackOk("");
                } else if (a == 2) {
                    jsonObject.addProperty("errorCode", (Number) 11);
                    callBackError(jsonObject);
                }
            }
        }
    }
}
