package com.meituan.ai.speech.sdk.a;

import com.meituan.ai.speech.base.log.LingxiBaseReport;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000108H\u0002J\u0018\u00109\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J \u0010<\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0007J\u0018\u0010>\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J(\u0010?\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0004H\u0007J\u0018\u0010C\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004H\u0007J\u0010\u0010E\u001a\u0002052\u0006\u0010B\u001a\u00020\u0004H\u0007J\b\u0010F\u001a\u000205H\u0007J\u0018\u0010G\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J\u0018\u0010H\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J(\u0010I\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0004H\u0007J \u0010J\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0004H\u0007J\u0010\u0010K\u001a\u0002052\u0006\u0010:\u001a\u00020\u0004H\u0007J@\u0010L\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010M\u001a\u00020A2\u0006\u0010N\u001a\u00020A2\u0006\u0010O\u001a\u00020A2\u0006\u0010P\u001a\u00020A2\u0006\u0010Q\u001a\u00020\u0004H\u0007J\u0018\u0010R\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J\u0018\u0010S\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J\u0018\u0010T\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J\u0018\u0010U\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J(\u0010V\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0004H\u0007Jp\u0010W\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010X\u001a\u00020A2\u0006\u0010Y\u001a\u00020A2\u0006\u0010Z\u001a\u00020A2\u0006\u0010[\u001a\u00020A2\u0006\u0010\\\u001a\u00020A2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020A2\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020A2\u0006\u0010b\u001a\u00020^2\u0006\u0010c\u001a\u00020^H\u0007J(\u0010d\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0004H\u0007J\u0018\u0010e\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J@\u0010f\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010M\u001a\u00020A2\u0006\u0010N\u001a\u00020A2\u0006\u0010O\u001a\u00020A2\u0006\u0010P\u001a\u00020A2\u0006\u0010Q\u001a\u00020\u0004H\u0007J\u0018\u0010g\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0007J\u0018\u0010h\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004H\u0007J(\u0010i\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010M\u001a\u00020A2\u0006\u0010j\u001a\u00020AH\u0007J2\u0010k\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010l\u001a\u00020^2\u0006\u0010;\u001a\u00020\u00042\b\u0010m\u001a\u0004\u0018\u00010n2\u0006\u0010o\u001a\u00020^H\u0007J \u0010p\u001a\u0002052\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010o\u001a\u00020^H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/meituan/ai/speech/sdk/utils/AsrLingxiReport;", "", "()V", "BASE_ASR_BID", "", "SDK_ASR_ASR_MODEL", "SDK_ASR_ASR_SOUND_MODEL", "SDK_ASR_ASR_SUB_MODEL", "SDK_ASR_AUTO_STOP_AFTER_OVERTIME_MC", "SDK_ASR_BIZ_DATA", "SDK_ASR_CALL_START_MC", "SDK_ASR_CALL_STOP_MC", "SDK_ASR_CID", "SDK_ASR_FAIL_MC", "SDK_ASR_IS_IGNORE_TMP_RESULT", "SDK_ASR_IS_NEED_PUNCTUATION", "SDK_ASR_IS_NORMALIZE_TEXT", "SDK_ASR_IS_SUPPORT_NBEST", "SDK_ASR_KNB_API_VERSION", "SDK_ASR_KNB_CALL_INIT_MC", "SDK_ASR_KNB_CALL_SDK_INFO_FAIL_MC", "SDK_ASR_KNB_CALL_SDK_INFO_SUCCESS_MC", "SDK_ASR_KNB_CALL_START_MC", "SDK_ASR_KNB_CALL_STOP_MC", "SDK_ASR_KNB_FAIL_MC", "SDK_ASR_KNB_INIT_FAIL_MC", "SDK_ASR_KNB_INIT_SUCCESS_MC", "SDK_ASR_KNB_RECEIVE_RESULT_MC", "SDK_ASR_KNB_RECORD_BACKGROUND_AUTOSTOP_MC", "SDK_ASR_KNB_RECORD_OVERTIME_AUTOSTOP_MC", "SDK_ASR_KNB_RECORD_OVERTIME_MC", "SDK_ASR_KNB_START_DESTROY_MC", "SDK_ASR_KNB_START_FAIL_MC", "SDK_ASR_KNB_START_SUCCESS_MC", "SDK_ASR_KNB_STOP_FAIL_MC", "SDK_ASR_KNB_STOP_SUCCESS_MC", "SDK_ASR_LANGUAGE", "SDK_ASR_LANGUAGE_TYPE", "SDK_ASR_NBEST_COUNT", "SDK_ASR_RECEIVE_RESULT_MC", "SDK_ASR_RECORD_NO_PERMISSION_CHECK_MC", "SDK_ASR_RECORD_SOUND_MAX_SIZE", "SDK_ASR_REGISTER_AUTH_MC", "SDK_ASR_RESULT", "SDK_ASR_SCENE", "SDK_ASR_SEND_AUDIO_PACKET_MC", "SDK_ASR_SHOULD_AUTO_STOP_AFTER_OVERTIME", "SDK_ASR_SHOULD_BACKGROUND_AUTOSTOP", "SDK_ASR_SHOULD_OVERTIME_AUTOSTOP", "SDK_ASR_START_MC", "SDK_ASR_STOP_MC", "SDK_ASR_VAD_SUPPORTTED", "asrEventReport", "", "valBid", "valLab", "", "autoStopAfterOvertimeEventReport", "appKey", "sessionId", "callStartEventReport", "originalSessionId", "callStopEventReport", "failEventReport", "errorCode", "", "errorMessage", "knbCallInitEventReport", "secretKey", "knbCallSdkInfoFailEventReport", "knbCallSdkInfoSuccessEventReport", "knbCallStartEventReport", "knbCallStopEventReport", "knbFailEventReport", "knbInitFailEventReport", "knbInitSuccessEventReport", "knbReceiveResultEventReport", "pktIndex", "startTime", "endTime", "speechTime", "result", "knbRecordBackgroundAutoStopEventReport", "knbRecordOvertimeAutoStopEventReport", "knbRecordOvertimeEventReport", "knbStartDestroyEventReport", "knbStartFailEventReport", "knbStartSuccessEventReport", "asrModel", "asrSubModelId", "isIgnoreTmpResult", "isNeedPunctuation", "isNormalizeText", "isSupportVad", "", "recordSoundMaxSize", "bizData", "nbestCount", "isBackgroundAutoStop", "isOvertimeAutoStop", "knbStopFailEventReport", "knbStopSuccessEventReport", "receiveResultEventReport", "recordNoPermissionEventReport", "registerAuthEventReport", "sendAudioPacketEventReport", "pktSize", "startEventReport", "isUseWebSocket", "asrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "isAppBackground", "stopEventReport", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final a b = new a();

    private final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc898cb792b2a41746b44c7bcadc12f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc898cb792b2a41746b44c7bcadc12f0");
            return;
        }
        map.put(LingxiBaseReport.SPEECH_SDK_VERSION, "1.4.11");
        LingxiBaseReport.INSTANCE.mcEventReport("c_smartassistant_ai_speech_sdk_asr", str, map);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a59edbe5adcd192ba760e7d15eb44e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a59edbe5adcd192ba760e7d15eb44e79");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "secretKey");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put(LingxiBaseReport.SPEECH_SECRET_KEY, str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_register_auth_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39f14df5d7f52143b4bafdb2db13a167", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39f14df5d7f52143b4bafdb2db13a167");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "originalSessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.ORIGINAL_SESSION_ID, str3);
        b.a("b_smartassistant_ai_speech_sdk_asr_call_start_mc", hashMap);
    }

    @JvmStatic
    public static final void b(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3631b27ae56f77773c4f067f910d731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3631b27ae56f77773c4f067f910d731");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_call_stop_mc", hashMap);
    }

    @JvmStatic
    public static final void c(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "219f6301090a818d1d3a60dfad4e5514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "219f6301090a818d1d3a60dfad4e5514");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_record_no_permission_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, boolean z, @NotNull String str2, @Nullable AsrConfig asrConfig, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, asrConfig, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ece780082264816f2b774993a19ba28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ece780082264816f2b774993a19ba28");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_NETWORK_MODE, Integer.valueOf(z ? 1 : 0));
        if (asrConfig != null) {
            hashMap.put("sdk_asr_asr_model", Integer.valueOf(asrConfig.getAsrModel()));
            hashMap.put("sdk_asr_asr_sub_model", Integer.valueOf(asrConfig.getAsrSubModelId()));
            hashMap.put("sdk_asr_asr_sound_model", Integer.valueOf(asrConfig.getAsrSoundModel()));
            hashMap.put("sdk_asr_is_ignore_tmp_result", Integer.valueOf(asrConfig.isIgnoreTempResult()));
            hashMap.put("sdk_asr_is_need_punctuation", Integer.valueOf(asrConfig.isNeedPunctuation()));
            hashMap.put("sdk_asr_is_normalize_text", Integer.valueOf(asrConfig.isNormalizeText()));
            hashMap.put("sdk_asr_language", Integer.valueOf(asrConfig.getLanguage()));
            hashMap.put("sdk_asr_language_type", Integer.valueOf(asrConfig.getLanguageType()));
            hashMap.put("sdk_asr_scene", Integer.valueOf(asrConfig.getScene()));
            hashMap.put("sdk_asr_record_sound_max_size", Integer.valueOf(asrConfig.getRecordSoundMaxTime()));
            String str3 = "";
            if (asrConfig.getBizData() != null && (str3 = asrConfig.getBizData()) == null) {
                h.a();
            }
            hashMap.put("sdk_asr_biz_data", str3);
            hashMap.put(LingxiBaseReport.SDK_AUDIO_SAMPLE_RATE, Float.valueOf(asrConfig.getRate()));
            hashMap.put("sdk_asr_is_support_nbest", 1);
            hashMap.put("sdk_asr_nbest_count", Integer.valueOf(asrConfig.getResultCount()));
            hashMap.put("sdk_asr_should_auto_stop_after_overtime", Integer.valueOf(asrConfig.getShouldAutoStopAfterOvertime() ? 1 : 0));
            hashMap.put(LingxiBaseReport.SDK_IS_BACKGROUND, Integer.valueOf(z2 ? 1 : 0));
        }
        b.a("b_smartassistant_ai_speech_sdk_asr_start_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "daf2e015739f9525f49e5dc79566f8c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "daf2e015739f9525f49e5dc79566f8c8");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_IS_BACKGROUND, Boolean.valueOf(z));
        b.a("b_smartassistant_ai_speech_sdk_asr_stop_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, int i, int i2) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d06601c6bcdfa1b0ddd1d98af6eabb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d06601c6bcdfa1b0ddd1d98af6eabb8");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_PACKET_INDEX, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_PACKET_SIZE, Integer.valueOf(i2));
        b.a("b_smartassistant_ai_speech_sdk_asr_send_audio_packet_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, int i, int i2, int i3, int i4, @NotNull String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fa2a332a4fad5dc94f7c75a11ef429b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fa2a332a4fad5dc94f7c75a11ef429b");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "result");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_PACKET_INDEX, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_VAD_DETECTED_SOUND_START_TIME, Integer.valueOf(i2));
        hashMap.put(LingxiBaseReport.SDK_VAD_DETECTED_SOUND_END_TIME, Integer.valueOf(i3));
        hashMap.put(LingxiBaseReport.SDK_VAD_SPEECH_TIME, Integer.valueOf(i4));
        hashMap.put("sdk_asr_result", str3);
        b.a("b_smartassistant_ai_speech_sdk_asr_receive_result_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3ad38d27de3925de7fe3f79e4c274da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3ad38d27de3925de7fe3f79e4c274da");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "errorMessage");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_ERROR_MSG, str3);
        b.a("b_smartassistant_ai_speech_sdk_asr_fail_mc", hashMap);
    }

    @JvmStatic
    public static final void d(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "089ea78e1a85f4f1cc179c980c3659be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "089ea78e1a85f4f1cc179c980c3659be");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_auto_stop_after_overtime_mc", hashMap);
    }

    @JvmStatic
    public static final void e(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce23d1fce8d7457ff0de4dc08077f5b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce23d1fce8d7457ff0de4dc08077f5b0");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "secretKey");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put(LingxiBaseReport.SPEECH_SECRET_KEY, str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_call_init_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f4ab6ee1725be83fb9040ec21f525e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f4ab6ee1725be83fb9040ec21f525e4");
            return;
        }
        h.b(str, "appKey");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_init_success_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, int i, @NotNull String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc5decf2b13c943321d3c099440f5219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc5decf2b13c943321d3c099440f5219");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "errorMessage");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put(LingxiBaseReport.SDK_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_ERROR_MSG, str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_init_fail_mc", hashMap);
    }

    @JvmStatic
    public static final void f(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9e64d7b77db2a835485ce1128e5523a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9e64d7b77db2a835485ce1128e5523a");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_call_start_mc", hashMap);
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, int i, int i2, int i3, int i4, int i5, boolean z, int i6, @NotNull String str3, int i7, boolean z2, boolean z3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i6), str3, Integer.valueOf(i7), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0896f8c126f404e760983fe76725801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0896f8c126f404e760983fe76725801");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "bizData");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put("sdk_asr_asr_model", Integer.valueOf(i));
        hashMap.put("sdk_asr_asr_sub_model", Integer.valueOf(i2));
        hashMap.put("sdk_asr_is_ignore_tmp_result", Integer.valueOf(i3));
        hashMap.put("sdk_asr_is_need_punctuation", Integer.valueOf(i4));
        hashMap.put("sdk_asr_is_normalize_text", Integer.valueOf(i5));
        hashMap.put("sdk_asr_vad_supportted", Boolean.valueOf(z));
        hashMap.put("sdk_asr_record_sound_max_size", Integer.valueOf(i6));
        hashMap.put("sdk_asr_biz_data", str3);
        hashMap.put("sdk_asr_nbest_count", Integer.valueOf(i7));
        hashMap.put("sdk_asr_knb_api_version", KnbConstants.API_VERSION_1_3);
        hashMap.put("sdk_asr_should_background_autostop", Boolean.valueOf(z2));
        hashMap.put("sdk_asr_should_overtime_autostop", Boolean.valueOf(z3));
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_start_success_mc", hashMap);
    }

    @JvmStatic
    public static final void b(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b119dd11b7369d80bd024d5b2b1dc2ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b119dd11b7369d80bd024d5b2b1dc2ce");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "errorMessage");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_ERROR_MSG, str3);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_start_fail_mc", hashMap);
    }

    @JvmStatic
    public static final void g(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c5a9b5c864be13f64799c2574899c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c5a9b5c864be13f64799c2574899c1d");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_call_stop_mc", hashMap);
    }

    @JvmStatic
    public static final void h(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da821db89386093b66fc302ab6dceb79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da821db89386093b66fc302ab6dceb79");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_stop_success_mc", hashMap);
    }

    @JvmStatic
    public static final void c(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c26afbb082b1f380f3c359cf35f0447a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c26afbb082b1f380f3c359cf35f0447a");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "errorMessage");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_ERROR_MSG, str3);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_stop_fail_mc", hashMap);
    }

    @JvmStatic
    public static final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73880e9e5efbe8a4d756d5737e0e28b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73880e9e5efbe8a4d756d5737e0e28b3");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_SDK_VERSION, "1.4.11");
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_call_sdk_info_success_mc", hashMap);
    }

    @JvmStatic
    public static final void b(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2859734b72935d76da636cddffc1ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2859734b72935d76da636cddffc1ec5");
            return;
        }
        h.b(str, "errorMessage");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SDK_ERROR_MSG, str);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_call_sdk_info_fail_mc", hashMap);
    }

    @JvmStatic
    public static final void b(@NotNull String str, @NotNull String str2, int i, int i2, int i3, int i4, @NotNull String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "627262eebbe75dbb6ab7255d374d1599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "627262eebbe75dbb6ab7255d374d1599");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "result");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_PACKET_INDEX, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_VAD_DETECTED_SOUND_START_TIME, Integer.valueOf(i2));
        hashMap.put(LingxiBaseReport.SDK_VAD_DETECTED_SOUND_END_TIME, Integer.valueOf(i3));
        hashMap.put(LingxiBaseReport.SDK_VAD_SPEECH_TIME, Integer.valueOf(i4));
        hashMap.put("sdk_asr_result", str3);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_receive_result_mc", hashMap);
    }

    @JvmStatic
    public static final void i(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "222eb91b779ad0b50744ab60196b02ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "222eb91b779ad0b50744ab60196b02ff");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_record_overtime_mc", hashMap);
    }

    @JvmStatic
    public static final void j(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ca6ce1586ea8236c8ae57a006943e6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ca6ce1586ea8236c8ae57a006943e6f");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_record_overtime_autostop_mc", hashMap);
    }

    @JvmStatic
    public static final void k(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1e77031b9ea3411b816130569e749ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1e77031b9ea3411b816130569e749ec");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_record_background_autostop_mc", hashMap);
    }

    @JvmStatic
    public static final void d(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be7d743f15385b69f24e863d8017ad43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be7d743f15385b69f24e863d8017ad43");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(str3, "errorMessage");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        hashMap.put(LingxiBaseReport.SDK_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(LingxiBaseReport.SDK_ERROR_MSG, str3);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_fail_mc", hashMap);
    }

    @JvmStatic
    public static final void l(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b097fbd32163da1fd3d9b54b72f0aacb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b097fbd32163da1fd3d9b54b72f0aacb");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        HashMap hashMap = new HashMap();
        hashMap.put(LingxiBaseReport.SPEECH_APP_KEY, str);
        hashMap.put("session_id", str2);
        b.a("b_smartassistant_ai_speech_sdk_asr_knb_start_destroy_mc", hashMap);
    }
}
