package com.meituan.android.mrn.module.jshandler.pageRouter;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.android.mrn.utils.ai;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.unionpay.tsmservice.data.Constant;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OpenUrlWithResultCustomHandler extends PageRouterBaseJsHandler {
    public static final String KEY = "MRN.openPage";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.mrn.module.jshandler.pageRouter.PageRouterBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "019b5aee15dbaf16af7a46ec6163ffe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "019b5aee15dbaf16af7a46ec6163ffe2");
            return;
        }
        super.exec();
        ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.jshandler.pageRouter.OpenUrlWithResultCustomHandler.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "685a540ce9eebce1ac9e4ec20ad0f82d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "685a540ce9eebce1ac9e4ec20ad0f82d");
                } else {
                    OpenUrlWithResultCustomHandler.this.execOnUiThread();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void execOnUiThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad0380341d4b66944b765cc619849646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad0380341d4b66944b765cc619849646");
            return;
        }
        JSONObject paramJSONObject = getParamJSONObject();
        if (paramJSONObject == null) {
            jsCallbackErrorMsg("OpenUrlWithResultCustomHandler: params should not null");
            return;
        }
        try {
            this.mPageRouter.b(paramJSONObject.optString("url"), g.b(paramJSONObject.optJSONObject("params")), convertOpenPageOption(paramJSONObject.optJSONObject("options")));
        } catch (Throwable th) {
            jsCallbackError(th);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2faf5aa5166426810e4522459981297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2faf5aa5166426810e4522459981297");
        } else if (intent != null) {
            JSONObject jSONObject = new JSONObject();
            if (intent.hasExtra("resultData") && !TextUtils.isEmpty(f.a(intent, "resultData"))) {
                try {
                    jSONObject.put("resultData", f.a(intent, "resultData"));
                    jSONObject.put(Constant.KEY_RESULT_CODE, i2);
                    jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, i);
                } catch (Throwable unused) {
                    jsCallbackError(-1, "internal error.");
                }
            } else if (intent.getExtras() != null) {
                try {
                    jSONObject.put("resultData", g.a(intent.getExtras()));
                } catch (Throwable unused2) {
                    jsCallbackError(-1, "internal error.");
                }
            }
            jsCallback(jSONObject);
        } else {
            jsCallback();
        }
    }
}
