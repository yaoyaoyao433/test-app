package com.speech.vadsdk.log;

import com.meituan.ai.speech.base.log.LingxiBaseReport;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.speech.vadsdk.processor.VadConfig;
import com.speech.vadsdk.wakeup.WakeUpConfig;
import com.speech.vadsdk.wakeup.WakeUpResult;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0007J\u0018\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0007J\u0018\u00101\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0007J(\u00102\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0007J$\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\u00042\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010:H\u0002J(\u0010;\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0004H\u0007J(\u0010?\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0004H\u0007J\u0018\u0010@\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u0004H\u0007J(\u0010B\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010C\u001a\u0002042\u0006\u0010D\u001a\u00020EH\u0007J(\u0010F\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010C\u001a\u0002042\u0006\u0010D\u001a\u00020EH\u0007J0\u0010G\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/speech/vadsdk/log/WakeUpLingxiReport;", "", "()V", "SDK_ASR_ASR_MODEL", "", "SDK_ASR_ASR_SOUND_MODEL", "SDK_ASR_ASR_SUB_MODEL", "SDK_ASR_IS_IGNORE_TMP_RESULT", "SDK_ASR_IS_NEED_PUNCTUATION", "SDK_ASR_IS_NORMALIZE_TEXT", "SDK_ASR_IS_SUPPORT_NBEST", "SDK_ASR_LANGUAGE", "SDK_ASR_LANGUAGE_TYPE", "SDK_ASR_NBEST_COUNT", "SDK_ASR_RESULT", "SDK_ASR_SUPPORT_CODEC", "SDK_WAKEUP_ASR_FILTER_KEYWORD", "SDK_WAKEUP_CALL_START_MC", "SDK_WAKEUP_CALL_STOP_MC", "SDK_WAKEUP_CID", "SDK_WAKEUP_COMPLETED_MC", "SDK_WAKEUP_CONFIG_KEYWORD", "SDK_WAKEUP_CONFIG_KEYWORD_TYPE", "SDK_WAKEUP_DETECTED_MC", "SDK_WAKEUP_FAIL_MC", "SDK_WAKEUP_INIT_ENGINE_COMPLETED_MC", "SDK_WAKEUP_INIT_MC", "SDK_WAKEUP_IS_ASR_RECOGNIZING", "SDK_WAKEUP_KEEP_ALIVE", "SDK_WAKEUP_KEYWORD", "SDK_WAKEUP_KEYWORD_ID", "SDK_WAKEUP_KEYWORD_PINYIN", "SDK_WAKEUP_MUTEX_WAKEUP_AND_ASR", "SDK_WAKEUP_RECEIVE_RESULT_MC", "SDK_WAKEUP_RECEIVE_TEMP_RESULT_MC", "SDK_WAKEUP_RESULT_END_OFFSET", "SDK_WAKEUP_RESULT_END_TIME", "SDK_WAKEUP_RESULT_SCORE", "SDK_WAKEUP_RESULT_START_OFFSET", "SDK_WAKEUP_RESULT_START_TIME", "SDK_WAKEUP_START_MC", "SDK_WAKEUP_THRESHOLD", "SDK_WAKEUP_TYPE", "wakeupCallStartEventReport", "", "appKey", "sessionId", "originalSessionId", "wakeupCallStopEventReport", "wakeupCompletedEventReport", "wakeupDetectedEventReport", "result", "Lcom/speech/vadsdk/wakeup/WakeUpResult;", "isRecognizing", "", "wakeupEventReport", "valBid", "valLab", "", "wakeupFailEventReport", "errorCode", "", "errorMessage", "wakeupInitEngineCompletedEventReport", "wakeupInitEventReport", "secretKey", "wakeupReceiveAsrEventReport", "wakeupResult", "recogResult", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "wakeupReceiveTempAsrEventReport", "wakeupStartEventReport", "wakeupConfig", "Lcom/speech/vadsdk/wakeup/WakeUpConfig;", "asrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "vadConfig", "Lcom/speech/vadsdk/processor/VadConfig;", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class b {
    public static final b a = new b();

    private b() {
    }

    private static void a(String str, Map<String, Object> map) {
        map.put(LingxiBaseReport.SPEECH_SDK_VERSION, "1.2.6");
        LingxiBaseReport.INSTANCE.mcEventReport("c_smartassistant_ai_speech_sdk_wakeup", str, map);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2) {
        h.b(str, "appKey");
        h.b(str2, "secretKey");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put(LingxiBaseReport.SPEECH_SECRET_KEY, str2);
        a("b_smartassistant_ai_speech_sdk_wakeup_init_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "errorMessage");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_ERROR_MSG, str3);
        a("b_smartassistant_ai_speech_sdk_wakeup_init_engine_completed_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "originalSessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.ORIGINAL_SESSION_ID, str3);
        a("b_smartassistant_ai_speech_sdk_wakeup_call_start_mc", hashMap);
    }

    @JvmStatic
    public static final void b(@NotNull String str, @NotNull String str2) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        a("b_smartassistant_ai_speech_sdk_wakeup_call_stop_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, @NotNull WakeUpConfig wakeUpConfig, @NotNull AsrConfig asrConfig, @NotNull VadConfig vadConfig) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(wakeUpConfig, "wakeupConfig");
        h.b(asrConfig, "asrConfig");
        h.b(vadConfig, "vadConfig");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_AUDIO_SAMPLE_RATE, Integer.valueOf(wakeUpConfig.getFrequency()));
        hashMap.put(LingxiBaseReport.SDK_AUDIO_SOURCE_TYPE, Integer.valueOf(wakeUpConfig.getAudioSource()));
        hashMap.put("sdk_wakeup_type", Integer.valueOf(wakeUpConfig.getType()));
        hashMap.put("sdk_wakeup_keep_alive", Boolean.valueOf(wakeUpConfig.getKeepAlive()));
        hashMap.put("sdk_wakeup_mutex_wakeup_and_asr", Boolean.valueOf(wakeUpConfig.getShouldInterruptAsrAfterWakeup()));
        hashMap.put("sdk_wakeup_threshold", Float.valueOf(wakeUpConfig.getWakeUpThreshold()));
        hashMap.put("sdk_wakeup_asr_filter_keyword", Boolean.valueOf(wakeUpConfig.isAsrFilterKeyword()));
        String a2 = com.speech.vadsdk.utils.a.a(wakeUpConfig.getConfigWithKeyword$speech_vad_commonRelease());
        h.a((Object) a2, "Common.getStringSplitFro…g.getConfigWithKeyword())");
        hashMap.put("sdk_wakeup_config_keyword", a2);
        String b = com.speech.vadsdk.utils.a.b(wakeUpConfig.getConfigWithKeyword$speech_vad_commonRelease());
        h.a((Object) b, "Common.getIntSplitFromMa…g.getConfigWithKeyword())");
        hashMap.put("sdk_wakeup_config_keyword_type", b);
        hashMap.put("sdk_asr_asr_model", Integer.valueOf(asrConfig.getAsrModel()));
        hashMap.put("sdk_asr_asr_sub_model", Integer.valueOf(asrConfig.getAsrSubModelId()));
        hashMap.put("sdk_asr_asr_sound_model", Integer.valueOf(asrConfig.getAsrSoundModel()));
        hashMap.put("sdk_asr_is_ignore_tmp_result", Integer.valueOf(asrConfig.isIgnoreTempResult()));
        hashMap.put("sdk_asr_is_need_punctuation", Integer.valueOf(asrConfig.isNeedPunctuation()));
        hashMap.put("sdk_asr_is_normalize_text", Integer.valueOf(asrConfig.isNormalizeText()));
        hashMap.put("sdk_asr_language", Integer.valueOf(asrConfig.getLanguage()));
        hashMap.put("sdk_asr_language_type", Integer.valueOf(asrConfig.getLanguageType()));
        hashMap.put("sdk_asr_support_codec", Boolean.valueOf(asrConfig.isSupportCodec()));
        hashMap.put("sdk_asr_is_support_nbest", 1);
        hashMap.put("sdk_asr_nbest_count", Integer.valueOf(asrConfig.getResultCount()));
        hashMap.put("sdk_vad_model_id", Integer.valueOf(vadConfig.getVadModel()));
        hashMap.put("sdk_vad_trigger_type", Integer.valueOf(vadConfig.getStopModel()));
        hashMap.put("sdk_vad_least_sound_size", Integer.valueOf(vadConfig.getLeastSoundSize()));
        hashMap.put("sdk_vad_least_silence_size", Integer.valueOf(vadConfig.getLeastSilenceSize()));
        hashMap.put("sdk_vad_start_threshold_interval", Integer.valueOf(vadConfig.getStartTipTime()));
        hashMap.put("sdk_vad_end_threshold_interval", Integer.valueOf(vadConfig.getEndTipTime()));
        a("b_smartassistant_ai_speech_sdk_wakeup_start_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, @NotNull WakeUpResult wakeUpResult, boolean z) {
        String keyword;
        String keywordPinyin;
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(wakeUpResult, "result");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put("sdk_wakeup_keyword_id", Integer.valueOf(wakeUpResult.getKeywordId()));
        if (wakeUpResult.getKeyword() == null) {
            keyword = "";
        } else {
            keyword = wakeUpResult.getKeyword();
            if (keyword == null) {
                h.a();
            }
        }
        hashMap.put("sdk_wakeup_keyword", keyword);
        if (wakeUpResult.getKeywordPinyin() == null) {
            keywordPinyin = "";
        } else {
            keywordPinyin = wakeUpResult.getKeywordPinyin();
            if (keywordPinyin == null) {
                h.a();
            }
        }
        hashMap.put("sdk_wakeup_keyword_pinyin", keywordPinyin);
        hashMap.put("sdk_wakeup_type", Integer.valueOf(wakeUpResult.getType()));
        hashMap.put("sdk_wakeup_result_score", Float.valueOf(wakeUpResult.getScore()));
        hashMap.put("sdk_wakeup_result_start_time", Integer.valueOf(wakeUpResult.getStartTime()));
        hashMap.put("sdk_wakeup_result_end_time", Integer.valueOf(wakeUpResult.getEndTime()));
        hashMap.put("sdk_wakeup_result_start_offset", Integer.valueOf(wakeUpResult.getStartOffset()));
        hashMap.put("sdk_wakeup_result_end_offset", Integer.valueOf(wakeUpResult.getEndOffset()));
        hashMap.put("sdk_wakeup_is_asr_recognizing", Boolean.valueOf(z));
        a("b_smartassistant_ai_speech_sdk_wakeup_detected_mc", hashMap);
    }

    @JvmStatic
    public static final void c(@NotNull String str, @NotNull String str2) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        a("b_smartassistant_ai_speech_sdk_wakeup_completed_mc", hashMap);
    }

    @JvmStatic
    public static final void b(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "errorMessage");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_ERROR_MSG, str3);
        a("b_smartassistant_ai_speech_sdk_wakeup_fail_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, @NotNull WakeUpResult wakeUpResult, @NotNull RecogResult recogResult) {
        String keyword;
        String text;
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(wakeUpResult, "wakeupResult");
        h.b(recogResult, "recogResult");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        if (wakeUpResult.getKeyword() == null) {
            keyword = "";
        } else {
            keyword = wakeUpResult.getKeyword();
            if (keyword == null) {
                h.a();
            }
        }
        hashMap.put("sdk_wakeup_keyword", keyword);
        if (recogResult.getText() == null) {
            text = "";
        } else {
            text = recogResult.getText();
            if (text == null) {
                h.a();
            }
        }
        hashMap.put("sdk_asr_result", text);
        a("b_smartassistant_ai_speech_sdk_wakeup_receive_temp_result_mc", hashMap);
    }

    @JvmStatic
    public static final void b(@NotNull String str, @NotNull String str2, @NotNull WakeUpResult wakeUpResult, @NotNull RecogResult recogResult) {
        String keyword;
        String text;
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(wakeUpResult, "wakeupResult");
        h.b(recogResult, "recogResult");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        if (wakeUpResult.getKeyword() == null) {
            keyword = "";
        } else {
            keyword = wakeUpResult.getKeyword();
            if (keyword == null) {
                h.a();
            }
        }
        hashMap.put("sdk_wakeup_keyword", keyword);
        if (recogResult.getText() == null) {
            text = "";
        } else {
            text = recogResult.getText();
            if (text == null) {
                h.a();
            }
        }
        hashMap.put("sdk_asr_result", text);
        a("b_smartassistant_ai_speech_sdk_wakeup_receive_result_mc", hashMap);
    }
}
