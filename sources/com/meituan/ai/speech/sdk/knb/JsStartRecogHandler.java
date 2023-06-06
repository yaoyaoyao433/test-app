package com.meituan.ai.speech.sdk.knb;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.titans.js.DelegatedJsHandler;
import com.meituan.ai.speech.base.net.base.a;
import com.meituan.ai.speech.base.privacy.PrivacySceneUtils;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.base.utils.AppUtilsKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class JsStartRecogHandler extends DelegatedJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return KnbConstants.SIGNATURE_START;
    }

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd26df8971086b429e126d2224061f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd26df8971086b429e126d2224061f41");
            return;
        }
        String optString = jsBean().argsJson.optString(KnbConstants.PARAMS_APP_KEY);
        String optString2 = jsBean().argsJson.optString(KnbConstants.PARAMS_PRIVACY_SCENE_TOKEN);
        String optString3 = jsBean().argsJson.optString(KnbConstants.PARAMS_AUDIO_ID);
        Context applicationContext = jsHost().getContext().getApplicationContext();
        if (TextUtils.isEmpty(optString3)) {
            optString3 = "android_asr_knb_" + AppUtilsKt.getUuid(applicationContext) + CommonConstant.Symbol.UNDERLINE + System.currentTimeMillis();
        }
        JsAsrSettings.instance.appKey = optString;
        JsAsrSettings.instance.privacySceneToken = optString2;
        JsAsrSettings.instance.audioId = optString3;
        JsAsrSettings.instance.callStartEvent();
        if (!JsAsrSettings.instance.isInit) {
            JsAsrSettings.instance.startFailEvent(this, -101, "Failed!没有初始化直接开始识别");
        } else if (TextUtils.isEmpty(optString)) {
            JsAsrSettings.instance.startParamFailEvent(this, -100, "必须参数缺失: appKey is null");
        } else if (TextUtils.isEmpty(optString2)) {
            JsAsrSettings.instance.startParamFailEvent(this, -100, "必须参数缺失: privacySceneToken is null");
        } else {
            int checkRecordPermission = PrivacySceneUtils.INSTANCE.checkRecordPermission(applicationContext, optString2);
            if (checkRecordPermission <= 0) {
                JsAsrSettings.instance.startFailEvent(this, a.NO_RECORD_PERMISSION.N, "Failed!没有语音权限!code=" + checkRecordPermission);
                return;
            }
            JSONObject optJSONObject = jsBean().argsJson.optJSONObject(KnbConstants.PARAMS_ASR_PARAMS);
            if (optJSONObject == null) {
                JsAsrSettings.instance.startParamFailEvent(this, -100, "必须参数缺失: asr_params is null");
                return;
            }
            int optInt = optJSONObject.optInt(KnbConstants.PARAMS_IS_NEED_AUDIO_CACHE, 0);
            int optInt2 = optJSONObject.optInt(KnbConstants.PARAMS_IS_IGNORE_TMP_RESULT, 0);
            int optInt3 = optJSONObject.optInt(KnbConstants.PARAMS_IS_NEED_PUNCTUATION, 0);
            int optInt4 = optJSONObject.optInt(KnbConstants.PARAMS_IS_NORMALIZE_TEXT, 0);
            int optInt5 = optJSONObject.optInt(KnbConstants.PARAMS_ASR_MODEL, 0);
            int optInt6 = optJSONObject.optInt(KnbConstants.PARAMS_ASR_SUB_MODEL, 0);
            int optInt7 = optJSONObject.optInt(KnbConstants.PARAMS_RECORD_SOUND_MAX_SIZE, AsrConfig.Companion.getDefaultRecordSoundMaxTime());
            int optInt8 = optJSONObject.optInt(KnbConstants.PARAMS_SCENE, 0);
            int optInt9 = optJSONObject.optInt(KnbConstants.PARAMS_NBEST_COUNT, 1);
            if (optInt9 <= 0 || optInt9 > 10) {
                JsAsrSettings.instance.startParamFailEvent(this, -100, "nbest_count设置错误，值域(0,10]");
                return;
            }
            boolean optBoolean = optJSONObject.optBoolean(KnbConstants.PARAMS_SUPPORT_VAD, false);
            boolean optBoolean2 = optJSONObject.optBoolean(KnbConstants.PARAMS_SUPPORT_CODEC, false);
            boolean optBoolean3 = optJSONObject.optBoolean(KnbConstants.PARAMS_OVERTIME_AUTOSTOP, true);
            boolean optBoolean4 = optJSONObject.optBoolean(KnbConstants.PARAMS_BACKGROUND_AUTOSTOP, true);
            String optString4 = optJSONObject.optString(KnbConstants.PARAMS_BIZ_DATA);
            if (!JsAsrSettings.instance.isRecording.get()) {
                JsAsrSettings.instance.isRecording.set(true);
                JsAsrSettings.instance.startSuccessEvent(this, optInt5, optInt6, optInt2, optInt3, optInt4, optBoolean, optInt7, optString4, optInt9, optBoolean4, optBoolean3);
                com.meituan.ai.speech.sdk.knb.a.a aVar = new com.meituan.ai.speech.sdk.knb.a.a(this, applicationContext);
                aVar.b = optInt;
                aVar.c = optBoolean3;
                aVar.d = optBoolean4;
                AsrConfig asrConfig = new AsrConfig();
                asrConfig.setAsrModel(optInt5);
                asrConfig.setAsrSubModelId(optInt6);
                asrConfig.setIgnoreTempResult(optInt2);
                asrConfig.setNeedPunctuation(optInt3);
                asrConfig.setNormalizeText(optInt4);
                asrConfig.setRecordSoundMaxTime(optInt7);
                asrConfig.setBizData(optString4);
                asrConfig.setResultCount(optInt9);
                asrConfig.setSupportVad16(optBoolean);
                asrConfig.setSupportCodec(optBoolean2);
                asrConfig.setScene(optInt8);
                aVar.e = asrConfig;
                c.a("SpeechAsr-knbRecog", aVar).start();
                return;
            }
            JsAsrSettings.instance.startFailEvent(this, -103, "start Failed!");
        }
    }

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e4300fe1add9f407bf6be7baf7c83e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e4300fe1add9f407bf6be7baf7c83e7");
            return;
        }
        JsAsrSettings.instance.startDestroyEvent(this);
        if (jsBean().argsJson.optJSONObject(KnbConstants.PARAMS_ASR_PARAMS).optBoolean(KnbConstants.PARAMS_START_DESTROY_STOP, true)) {
            JsAsrSettings.instance.stopRecordAndAsr(this, true, true);
        }
    }
}
