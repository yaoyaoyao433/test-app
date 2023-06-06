package com.meituan.ai.speech.sdk.knb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.sdk.SpeechRecognizer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class JsInitSpeechRecognizerHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return KnbConstants.SIGNATURE_INIT;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    @SuppressLint({"MissingPermission"})
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c287591aab942c3f9a3ef2b5303dc27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c287591aab942c3f9a3ef2b5303dc27");
            return;
        }
        String optString = jsBean().argsJson.optString(KnbConstants.PARAMS_APP_KEY);
        String optString2 = jsBean().argsJson.optString(KnbConstants.PARAMS_SECRET_KEY);
        String optString3 = jsBean().argsJson.optString("uuid");
        int optInt = jsBean().argsJson.optInt(KnbConstants.PARAMS_CAT_ID);
        int optInt2 = jsBean().argsJson.optInt(KnbConstants.PARAMS_LOG_LEVEL);
        Context applicationContext = jsHost().getContext().getApplicationContext();
        JsAsrSettings.instance.callInitEvent(optString, optString2);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            JsAsrSettings.instance.initFailEvent(this, optString, -100, "必须参数缺失");
            return;
        }
        SpeechRecognizer build = new SpeechRecognizer.Builder().setUUID(optString3).setCatAppId(optInt).setLog(SPLog.INSTANCE.getLogLevel(optInt2)).build(applicationContext);
        build.appendAuthParams(optString, optString2);
        build.register(applicationContext, optString3, optString);
        JsAsrSettings.instance.isInit = true;
        JsAsrSettings.instance.initSuccessEvent(this, optString);
    }
}
