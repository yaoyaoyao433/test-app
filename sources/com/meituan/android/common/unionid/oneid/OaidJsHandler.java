package com.meituan.android.common.unionid.oneid;

import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OaidJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "pRQqsR0se7tvbspD2/W3wTSAYVhf5IMFxSY43sihEXCTNNn6WB7Oq2fGTnFrTCT8Uy//lyzlEIv3DxH96fR7FQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eaab688e918b761b76a6b582ddad31e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eaab688e918b761b76a6b582ddad31e");
            return;
        }
        final String[] strArr = {""};
        if (jsHost() != null && jsHost().getContext() != null) {
            strArr[0] = OaidManager.getInstance().getLocalOAID(jsHost().getContext());
            if (TextUtils.isEmpty(strArr[0])) {
                OaidManager.getInstance().getOaid(jsHost().getContext(), new OaidCallback() { // from class: com.meituan.android.common.unionid.oneid.OaidJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                    public void onFail(String str) {
                    }

                    @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                    public void onSuccuss(boolean z, String str, boolean z2) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a53392a08a96423ebba83c96a37afe36", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a53392a08a96423ebba83c96a37afe36");
                        } else {
                            strArr[0] = str;
                        }
                    }
                });
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oaid", strArr[0]);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(strArr[0])) {
            jsCallback(jSONObject);
        } else {
            jsCallbackError(404, "Oaid is not supported or has not been obtained yet，you can try to obtain it again");
        }
    }
}
