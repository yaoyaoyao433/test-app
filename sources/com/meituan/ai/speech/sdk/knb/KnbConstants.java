package com.meituan.ai.speech.sdk.knb;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/meituan/ai/speech/sdk/knb/KnbConstants;", "", "()V", "Companion", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class KnbConstants {
    @NotNull
    public static final String API_VERSION_1_3 = "1.3.0";
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String MESSAGE_FAILED = "failed";
    @NotNull
    public static final String MESSAGE_SUCCESS = "success";
    @NotNull
    public static final String METHOD_INIT = "speechAsr.init";
    @NotNull
    public static final String METHOD_SDK_INFO = "speechAsr.getSpeechSDKInfo";
    @NotNull
    public static final String METHOD_START = "speechAsr.startRecognize";
    @NotNull
    public static final String METHOD_STOP = "speechAsr.endRecognize";
    @NotNull
    public static final String PARAMS_API_VERSION = "api_version";
    @NotNull
    public static final String PARAMS_APP_KEY = "app_key";
    @NotNull
    public static final String PARAMS_ASR_MODEL = "asr_model";
    @NotNull
    public static final String PARAMS_ASR_PARAMS = "asr_params";
    @NotNull
    public static final String PARAMS_ASR_SUB_MODEL = "asr_sub_model";
    @NotNull
    public static final String PARAMS_AUDIO_ID = "audio_Id";
    @NotNull
    public static final String PARAMS_BACKGROUND_AUTOSTOP = "background_autostop";
    @NotNull
    public static final String PARAMS_BIZ_DATA = "biz_data";
    @NotNull
    public static final String PARAMS_CAT_ID = "cat_app_id";
    @NotNull
    public static final String PARAMS_INDEX = "res_index";
    @NotNull
    public static final String PARAMS_IS_IGNORE_TMP_RESULT = "is_ignore_tmp_result";
    @NotNull
    public static final String PARAMS_IS_NEED_AUDIO_CACHE = "is_need_audio_cache";
    @NotNull
    public static final String PARAMS_IS_NEED_PUNCTUATION = "is_need_punctuation";
    @NotNull
    public static final String PARAMS_IS_NORMALIZE_TEXT = "is_normalize_text";
    @NotNull
    public static final String PARAMS_LOG_LEVEL = "log_level";
    @NotNull
    public static final String PARAMS_NBEST_COUNT = "nbest_count";
    @NotNull
    public static final String PARAMS_OVERTIME_AUTOSTOP = "overtime_autostop";
    @NotNull
    public static final String PARAMS_PCM_DATA = "audio_pcm_data";
    @NotNull
    public static final String PARAMS_PRIVACY_SCENE_TOKEN = "privacy_scene_token";
    @NotNull
    public static final String PARAMS_RECORD_SOUND_MAX_SIZE = "record_sound_max_size";
    @NotNull
    public static final String PARAMS_SCENE = "scene";
    @NotNull
    public static final String PARAMS_SECRET_KEY = "secret_key";
    @NotNull
    public static final String PARAMS_SESSION_ID = "session_id";
    @NotNull
    public static final String PARAMS_START_DESTROY_STOP = "start_destroy_stop";
    @NotNull
    public static final String PARAMS_SUPPORT_CODEC = "support_codec";
    @NotNull
    public static final String PARAMS_SUPPORT_VAD = "support_vad";
    @NotNull
    public static final String PARAMS_TEXT = "text";
    @NotNull
    public static final String PARAMS_UUID = "uuid";
    @NotNull
    public static final String SIGNATURE_INIT = "Qienx41zKwT8snDxTfqr8Kbi7LRR5Z2bNXXGVg61uSoS7eS6MmYMdBOxgcDjXI30A2sdD0fVx6t0mEtVMb/nFg==";
    @NotNull
    public static final String SIGNATURE_SDK_INFO = "sn8n7ax96NiMn/O8sNQ4wmfF0LQEQOJ0Npow3MFnZ0gjvmrHVP157x8GgdN+eZH7rMw3uvv+StyMG/jNTzd5Sw==";
    @NotNull
    public static final String SIGNATURE_START = "isofPDHFfM+8c06MezK8BcmuxHUFuLoyuZ6bkLGEqmYvG+Q4KkfBM2ipST1EbvAbcapKshDQ07VZAT8G032X3w==";
    @NotNull
    public static final String SIGNATURE_STOP = "p4BbluNC1c2CVL0vVt2X3HkiN2N3nSFquXUer+gqH3aFZcFy00BNx/EW76k62JcUfv9qFbvkQLT391zbZF0+Cw==";
    public static final int SUCCESS_ASR = 1;
    public static final int SUCCESS_BACKGROUND_AUTO_STOP = 6;
    public static final int SUCCESS_DESTROY = 7;
    public static final int SUCCESS_OVER_TIME = 4;
    public static final int SUCCESS_OVER_TIME_AUTO_STOP = 5;
    public static final int SUCCESS_TMP_RESULT = 3;
    public static final int SUCCESS_VOICE_DB = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/meituan/ai/speech/sdk/knb/KnbConstants$Companion;", "", "()V", "API_VERSION_1_3", "", "MESSAGE_FAILED", "MESSAGE_SUCCESS", "METHOD_INIT", "METHOD_SDK_INFO", "METHOD_START", "METHOD_STOP", "PARAMS_API_VERSION", "PARAMS_APP_KEY", "PARAMS_ASR_MODEL", "PARAMS_ASR_PARAMS", "PARAMS_ASR_SUB_MODEL", "PARAMS_AUDIO_ID", "PARAMS_BACKGROUND_AUTOSTOP", "PARAMS_BIZ_DATA", "PARAMS_CAT_ID", "PARAMS_INDEX", "PARAMS_IS_IGNORE_TMP_RESULT", "PARAMS_IS_NEED_AUDIO_CACHE", "PARAMS_IS_NEED_PUNCTUATION", "PARAMS_IS_NORMALIZE_TEXT", "PARAMS_LOG_LEVEL", "PARAMS_NBEST_COUNT", "PARAMS_OVERTIME_AUTOSTOP", "PARAMS_PCM_DATA", "PARAMS_PRIVACY_SCENE_TOKEN", "PARAMS_RECORD_SOUND_MAX_SIZE", "PARAMS_SCENE", "PARAMS_SECRET_KEY", "PARAMS_SESSION_ID", "PARAMS_START_DESTROY_STOP", "PARAMS_SUPPORT_CODEC", "PARAMS_SUPPORT_VAD", "PARAMS_TEXT", "PARAMS_UUID", "SIGNATURE_INIT", "SIGNATURE_SDK_INFO", "SIGNATURE_START", "SIGNATURE_STOP", "SUCCESS_ASR", "", "SUCCESS_BACKGROUND_AUTO_STOP", "SUCCESS_DESTROY", "SUCCESS_OVER_TIME", "SUCCESS_OVER_TIME_AUTO_STOP", "SUCCESS_TMP_RESULT", "SUCCESS_VOICE_DB", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }
}
