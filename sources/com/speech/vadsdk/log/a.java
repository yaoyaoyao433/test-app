package com.speech.vadsdk.log;

import com.meituan.ai.speech.base.log.LingxiBaseReport;
import com.speech.vadsdk.processor.VadConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0007JH\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0007J$\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010'H\u0002J(\u0010(\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0004H\u0007J(\u0010+\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/speech/vadsdk/log/VadModelLingxiReport;", "", "()V", "SDK_VAD_DETECTED_POSITION", "", "SDK_VAD_DETECTED_TYPE", "SDK_VAD_END_THRESHOLD_DYNAMIC_INTERVALS", "SDK_VAD_END_THRESHOLD_INTERVAL", "SDK_VAD_LEAST_SILENCE_SIZE", "SDK_VAD_LEAST_SOUND_SIZE", "SDK_VAD_MODEL_CALL_START_MC", "SDK_VAD_MODEL_CALL_STOP_MC", "SDK_VAD_MODEL_CID", "SDK_VAD_MODEL_CONFIG_MC", "SDK_VAD_MODEL_DETECTED_MC", "SDK_VAD_MODEL_FAIL_MC", "SDK_VAD_MODEL_ID", "SDK_VAD_MODEL_INIT_ENGINE_COMPLETED_MC", "SDK_VAD_START_THRESHOLD_INTERVAL", "SDK_VAD_TRIGGER_TYPE", "vadCallStartEventReport", "", "appKey", "sessionId", "vadCallStopEventReport", "vadConfigEventReport", "vadConfig", "Lcom/speech/vadsdk/processor/VadConfig;", "vadDetectedEventReport", "startTime", "", "endTime", "speechTime", "endTipTime", "detectedPosition", "detectedType", "vadEventReport", "valBid", "valLab", "", "vadFailEventReport", "errorCode", "errorMessage", "vadInitEngineCompletedEventReport", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class a {
    public static final a a = new a();

    private a() {
    }

    private static void a(String str, Map<String, Object> map) {
        map.put(LingxiBaseReport.SPEECH_SDK_VERSION, "1.2.6");
        LingxiBaseReport.INSTANCE.mcEventReport("c_smartassistant_ai_speech_sdk_vad_model", str, map);
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
        a("b_smartassistant_ai_speech_sdk_vad_model_init_engine_completed_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull VadConfig vadConfig) {
        h.b(str, "appKey");
        h.b(vadConfig, "vadConfig");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("sdk_vad_model_id", Integer.valueOf(vadConfig.getVadModel()));
        hashMap.put("sdk_vad_trigger_type", Integer.valueOf(vadConfig.getStopModel()));
        hashMap.put("sdk_vad_least_sound_size", Integer.valueOf(vadConfig.getLeastSoundSize()));
        hashMap.put("sdk_vad_least_silence_size", Integer.valueOf(vadConfig.getLeastSilenceSize()));
        hashMap.put("sdk_vad_start_threshold_interval", Integer.valueOf(vadConfig.getStartTipTime()));
        hashMap.put("sdk_vad_end_threshold_interval", Integer.valueOf(vadConfig.getEndTipTime()));
        String endThresholdDynamicListStr$speech_vad_commonRelease = vadConfig.getEndThresholdDynamicListStr$speech_vad_commonRelease();
        if (endThresholdDynamicListStr$speech_vad_commonRelease != null) {
            hashMap.put("sdk_vad_end_threshold_dynamic_intervals", endThresholdDynamicListStr$speech_vad_commonRelease);
        }
        a("b_smartassistant_ai_speech_sdk_vad_model_config_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        a("b_smartassistant_ai_speech_sdk_vad_model_call_start_mc", hashMap);
    }

    @JvmStatic
    public static final void b(@NotNull String str, @NotNull String str2) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        a("b_smartassistant_ai_speech_sdk_vad_model_call_stop_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_VAD_DETECTED_SOUND_START_TIME, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_VAD_DETECTED_SOUND_END_TIME, Integer.valueOf(i2));
        hashMap.put(LingxiBaseReport.SDK_VAD_SPEECH_TIME, Integer.valueOf(i3));
        hashMap.put("sdk_vad_detected_position", Integer.valueOf(i5));
        hashMap.put("sdk_vad_detected_type", Integer.valueOf(i6));
        hashMap.put("sdk_vad_end_threshold_interval", Integer.valueOf(i4));
        a("b_smartassistant_ai_speech_sdk_vad_model_detected_mc", hashMap);
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
        a("b_smartassistant_ai_speech_sdk_vad_model_fail_mc", hashMap);
    }
}
