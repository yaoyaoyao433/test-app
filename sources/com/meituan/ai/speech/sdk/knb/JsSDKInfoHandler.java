package com.meituan.ai.speech.sdk.knb;

import android.support.annotation.Keep;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.ai.speech.sdk.SpeechRecognizer;
import com.meituan.ai.speech.sdk.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class JsSDKInfoHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return KnbConstants.SIGNATURE_SDK_INFO;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3698db1736116d0498577b99c5b88073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3698db1736116d0498577b99c5b88073");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class_speech_recognizer", SpeechRecognizer.Companion.getClass().getName());
            jSONObject2.put("method_instance", "getInstance");
            jSONObject.put("vadInfo", jSONObject2);
            a.a();
        } catch (JSONException e) {
            e.printStackTrace();
            a.b(e.getMessage());
        }
        JsResult jsResult = new JsResult();
        jsResult.errorCode = 1;
        jsResult.errorMsg = "success";
        jsResult.setData(jSONObject);
        jsCallback(jsResult.writeToJSON());
    }
}
