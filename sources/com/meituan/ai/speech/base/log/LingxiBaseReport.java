package com.meituan.ai.speech.base.log;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.ai.speech.base.utils.AppUtilsKt;
import com.meituan.android.common.statistics.Interface.AbsEnvironment;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J*\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/meituan/ai/speech/base/log/LingxiBaseReport;", "", "()V", "ORIGINAL_SESSION_ID", "", "SDK_AUDIO_DURATION", "SDK_AUDIO_SAMPLE_RATE", "SDK_AUDIO_SIZE", "SDK_AUDIO_SOURCE_TYPE", "SDK_CALL_METHOD_MC", "SDK_ERROR_CODE", "SDK_ERROR_MSG", "SDK_EXTRA", "SDK_IS_BACKGROUND", "SDK_NETWORK_MODE", "SDK_PACKET_INDEX", "SDK_PACKET_SIZE", "SDK_VAD_DETECTED_SOUND_END_TIME", "SDK_VAD_DETECTED_SOUND_START_TIME", "SDK_VAD_SPEECH_TIME", "SESSION_ID", "SPEECH_APP_KEY", "SPEECH_SDK_LING_XI_CATEGORY", "SPEECH_SDK_VERSION", "SPEECH_SECRET_KEY", "callMethod", "", "cid", "sdkVersion", "appKey", "segmentId", "extra", "initLingXi", "context", "Landroid/content/Context;", "mcEventReport", "valCid", "valBid", "valLab", "", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class LingxiBaseReport {
    public static final LingxiBaseReport INSTANCE = new LingxiBaseReport();
    @NotNull
    public static final String ORIGINAL_SESSION_ID = "original_session_id";
    @NotNull
    public static final String SDK_AUDIO_DURATION = "sdk_audio_duration";
    @NotNull
    public static final String SDK_AUDIO_SAMPLE_RATE = "sdk_audio_sample_rate";
    @NotNull
    public static final String SDK_AUDIO_SIZE = "sdk_audio_size";
    @NotNull
    public static final String SDK_AUDIO_SOURCE_TYPE = "sdk_audio_source_type";
    @NotNull
    public static final String SDK_CALL_METHOD_MC = "b_smartassistant_ai_speech_sdk_call_method_mc";
    @NotNull
    public static final String SDK_ERROR_CODE = "sdk_error_code";
    @NotNull
    public static final String SDK_ERROR_MSG = "sdk_error_msg";
    @NotNull
    public static final String SDK_EXTRA = "extra";
    @NotNull
    public static final String SDK_IS_BACKGROUND = "sdk_is_background";
    @NotNull
    public static final String SDK_NETWORK_MODE = "sdk_network_mode";
    @NotNull
    public static final String SDK_PACKET_INDEX = "sdk_packet_index";
    @NotNull
    public static final String SDK_PACKET_SIZE = "sdk_packet_size";
    @NotNull
    public static final String SDK_VAD_DETECTED_SOUND_END_TIME = "sdk_vad_detected_sound_end_time";
    @NotNull
    public static final String SDK_VAD_DETECTED_SOUND_START_TIME = "sdk_vad_detected_sound_start_time";
    @NotNull
    public static final String SDK_VAD_SPEECH_TIME = "sdk_vad_speech_time";
    @NotNull
    public static final String SESSION_ID = "session_id";
    @NotNull
    public static final String SPEECH_APP_KEY = "speech_app_key";
    @NotNull
    public static final String SPEECH_SDK_LING_XI_CATEGORY = "smartassistant";
    @NotNull
    public static final String SPEECH_SDK_VERSION = "speech_sdk_version";
    @NotNull
    public static final String SPEECH_SECRET_KEY = "speech_secret_key";
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void mcEventReport(@NotNull String str, @NotNull String str2, @NotNull Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49d6cfe1d06ada0d342d8f96b0e8b8b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49d6cfe1d06ada0d342d8f96b0e8b8b7");
            return;
        }
        h.b(str, "valCid");
        h.b(str2, "valBid");
        h.b(map, "valLab");
        Channel channel = Statistics.getChannel(SPEECH_SDK_LING_XI_CATEGORY);
        if (channel != null) {
            channel.writeModelClick("", str2, map, str);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\b"}, d2 = {"com/meituan/ai/speech/base/log/LingxiBaseReport$initLingXi$1", "Lcom/meituan/android/common/statistics/Interface/AbsEnvironment;", "getCh", "", "getLat", "getLch", "getLng", "getUUID", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class a extends AbsEnvironment {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Context b;

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        @NotNull
        public final String getCh() {
            return AbsApiFactory.PASSPORT_ONLINE_URL;
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        @NotNull
        public final String getLat() {
            return "";
        }

        @Override // com.meituan.android.common.statistics.Interface.IEnvironment
        @NotNull
        public final String getLch() {
            return "";
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        @NotNull
        public final String getLng() {
            return "";
        }

        public a(Context context) {
            this.b = context;
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95f933f05efb1b6e13719df6d21e7b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95f933f05efb1b6e13719df6d21e7b3");
            }
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment
        @Nullable
        public final String getUUID() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a350a69c9f9214540e39eaa3f08704", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a350a69c9f9214540e39eaa3f08704") : AppUtilsKt.getUuid(this.b);
        }
    }

    public final void initLingXi(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "828d1acf7cf0a7050cca06e80b78c155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "828d1acf7cf0a7050cca06e80b78c155");
            return;
        }
        h.b(context, "context");
        Statistics.setDefaultChannelName(SPEECH_SDK_LING_XI_CATEGORY);
        Statistics.initStatistics(context, new a(context));
    }

    public final void callMethod(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe94cc80ffc34094fdb10438e5f12f63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe94cc80ffc34094fdb10438e5f12f63");
            return;
        }
        h.b(str, "cid");
        h.b(str2, "sdkVersion");
        HashMap hashMap = new HashMap();
        hashMap.put(SPEECH_SDK_VERSION, str2);
        hashMap.put(SPEECH_APP_KEY, str3 == null ? "" : str3);
        hashMap.put("session_id", str4 == null ? "" : str4);
        hashMap.put("extra", str5 == null ? "" : str5);
        mcEventReport(str, SDK_CALL_METHOD_MC, hashMap);
    }
}
