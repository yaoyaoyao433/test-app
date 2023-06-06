package com.sankuai.waimai.bussiness.order.list.knb;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.passport.converter.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.utils.d;
import com.sankuai.waimai.foundation.utils.activity.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AccountImageUpload extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "R/Ap3oC8SA8vYrusEEM2D03qQdSFkIpBvo7l/nstHuE+fAZNE/AFwk88Sm0coo7VIZqR9w0IJVJspHV442mq4g==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e31246ee0770a1d7080721ffcb3443a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e31246ee0770a1d7080721ffcb3443a2");
            return;
        }
        Log.e("UploadImage", "into");
        Activity b = a.a().b();
        final Dialog a = d.a(b);
        if (!validateArgs()) {
            Log.e("UploadImage", "argsInvalid");
            d.a(a);
            return;
        }
        String optString = jsBean().argsJson.optString("ImageBase64Data");
        if (optString.isEmpty()) {
            Log.e("UploadImage", "baseEmpty");
            d.a(a);
            return;
        }
        Log.e("UploadImage", optString);
        String[] split = optString.split(CommonConstant.Symbol.COMMA);
        if (split.length > 1) {
            optString = split[1];
        }
        byte[] decode = Base64.decode(optString, 0);
        Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(decode, 0, decode.length);
        if (a2 != null) {
            Log.e("UploadImage", "aaa");
            Toast.makeText(b, "okokok", 1);
        }
        Log.e("UploadImage", "nonono");
        com.meituan.passport.addifun.information.a.a(new m<String>() { // from class: com.sankuai.waimai.bussiness.order.list.knb.AccountImageUpload.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.m
            public final /* synthetic */ void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9c283ca99bdc53fb2bf808dac50cbe99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9c283ca99bdc53fb2bf808dac50cbe99");
                    return;
                }
                Log.e("UploadImage", "success");
                d.a(a);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uploadStatus", 1);
                    AccountImageUpload.this.jsCallback(jSONObject);
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
        }, (FragmentActivity) b, a2);
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66f539de776947f169be3bb0eede325d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66f539de776947f169be3bb0eede325d")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
