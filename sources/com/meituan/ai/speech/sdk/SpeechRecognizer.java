package com.meituan.ai.speech.sdk;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.ai.speech.base.config.HornMonitor;
import com.meituan.ai.speech.base.log.CatMonitor;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.NetCreator;
import com.meituan.ai.speech.base.net.base.BaseWebSocketRequest;
import com.meituan.ai.speech.base.net.base.ICallback;
import com.meituan.ai.speech.base.net.base.IWebSocketCallback;
import com.meituan.ai.speech.base.net.data.AuthParams;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.net.data.RecogResultPart;
import com.meituan.ai.speech.base.net.data.ServerVadInfo;
import com.meituan.ai.speech.base.processor.ICodecProcessor;
import com.meituan.ai.speech.base.processor.IVadProcessor;
import com.meituan.ai.speech.base.processor.config.IVadConfig;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.base.sdk.ISpeechRecognizer;
import com.meituan.ai.speech.base.sdk.RecogCallback;
import com.meituan.ai.speech.base.utils.AppUtilsKt;
import com.meituan.ai.speech.base.utils.Base64Kt;
import com.meituan.ai.speech.base.utils.JavaUtils;
import com.meituan.ai.speech.base.utils.NetworkUtils;
import com.meituan.ai.speech.base.utils.VoiceUtilsKt;
import com.meituan.ai.speech.sdk.model.AudioData;
import com.meituan.ai.speech.sdk.net.a.e;
import com.meituan.ai.speech.sdk.net.data.ConfigResult;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\n\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0004]^_`B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\fJ\u0010\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0010H\u0016J\u0018\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0019H\u0016J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0015H\u0002J(\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020%H\u0002J\b\u00109\u001a\u00020,H\u0016J\u0010\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020<H\u0017J\b\u0010=\u001a\u00020\u001fH\u0016J\n\u0010>\u001a\u0004\u0018\u00010\u0010H\u0016J \u0010?\u001a\u00020,2\u0006\u0010;\u001a\u00020<2\u0006\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u0019H\u0002J\"\u0010B\u001a\u00020,2\u0006\u0010;\u001a\u00020<2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u00103\u001a\u00020\u0015H\u0002J\u001c\u0010E\u001a\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\u0015H\u0002J\u001a\u0010I\u001a\u0004\u0018\u00010G2\u0006\u0010J\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0015H\u0002J\u001b\u0010K\u001a\u00020,2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020M0LH\u0002¢\u0006\u0002\u0010NJ#\u0010O\u001a\u00020,2\u0006\u0010;\u001a\u00020<2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020M0LH\u0017¢\u0006\u0002\u0010PJ \u0010Q\u001a\u00020,2\u0006\u0010;\u001a\u00020<2\u0006\u0010R\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0019H\u0017J\u0006\u0010S\u001a\u00020,J\b\u0010T\u001a\u00020,H\u0002J\u0010\u0010U\u001a\u00020,2\u0006\u0010V\u001a\u00020\u001fH\u0016J\u0018\u0010W\u001a\u00020,2\u0006\u0010;\u001a\u00020<2\u0006\u0010R\u001a\u00020\u0019H\u0002J2\u0010X\u001a\u00020,2\u0006\u0010;\u001a\u00020<2\u0006\u00100\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\t2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0017J\b\u0010\\\u001a\u00020,H\u0002R \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/meituan/ai/speech/sdk/SpeechRecognizer;", "Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;", "()V", "<set-?>", "Lcom/meituan/ai/speech/sdk/model/AudioData;", "audioDatas", "getAudioDatas", "()Lcom/meituan/ai/speech/sdk/model/AudioData;", "currentAsrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "currentTimerExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "Lcom/meituan/ai/speech/base/processor/ICodecProcessor;", "defaultCodec", "getDefaultCodec", "()Lcom/meituan/ai/speech/base/processor/ICodecProcessor;", "Lcom/meituan/ai/speech/base/processor/IVadProcessor;", "defaultVAD", "getDefaultVAD", "()Lcom/meituan/ai/speech/base/processor/IVadProcessor;", "isInit", "", "isUseWebSocket", "lastAudioDataTimeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "getLastAudioDataTimeMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "setLastAudioDataTimeMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "", "lastDataCallbackTime", "getLastDataCallbackTime", "()I", "netType", "preRecogResult", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "preRecogTime", "userInfo", "Lcom/meituan/ai/speech/sdk/model/UserInfo;", "webSocketRequest", "Lcom/meituan/ai/speech/base/net/base/BaseWebSocketRequest;", "addCodecProcessor", "", "processor", "addVADProcessor", "appendAuthParams", "appKey", "secretKey", "buildAsrParams", "isEncoder", "callBackResult", "sessionId", "startVadTime", "endVadTime", "result", "cancelAllRecognize", "end", "context", "Landroid/content/Context;", "getTransferAudioSize", "getVADProcessor", "initNetwork", "appId", "asrBaseUrl", "netProcess", "data", "", "processDataByCodec", "vadAudioData", "", "isLast", "processDataByVad", "audioData", "processVoiceDB", "", "", "([Ljava/lang/Short;)V", "recognize", "(Landroid/content/Context;[Ljava/lang/Short;)V", GetUUID.REGISTER, "uuid", "removeCodecProcessor", "reset", "setTransferAudioSize", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "setUUID", "start", "asrConfig", "callback", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "updateLastDataRequestTime", "Builder", "Companion", "NetCallback", "WebSocketNetCallback", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class SpeechRecognizer implements ISpeechRecognizer {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    @NotNull
    public static SpeechRecognizer instance;
    @Keep
    @NotNull
    private AudioData audioDatas;
    private AsrConfig currentAsrConfig;
    private ScheduledExecutorService currentTimerExecutor;
    @Nullable
    private ICodecProcessor defaultCodec;
    @Nullable
    private IVadProcessor defaultVAD;
    private boolean isInit;
    private boolean isUseWebSocket;
    @NotNull
    private ConcurrentHashMap<String, Long> lastAudioDataTimeMap;
    private int lastDataCallbackTime;
    private String netType;
    private RecogResult preRecogResult;
    private long preRecogTime;
    private com.meituan.ai.speech.sdk.model.a userInfo;
    private BaseWebSocketRequest<RecogResult> webSocketRequest;

    public SpeechRecognizer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85db3eed6b188918a668d51300bbd903", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85db3eed6b188918a668d51300bbd903");
            return;
        }
        this.audioDatas = new AudioData();
        this.lastAudioDataTimeMap = new ConcurrentHashMap<>();
        this.userInfo = new com.meituan.ai.speech.sdk.model.a();
    }

    public /* synthetic */ SpeechRecognizer(f fVar) {
        this();
    }

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meituan/ai/speech/sdk/SpeechRecognizer$Companion;", "", "()V", "instance", "Lcom/meituan/ai/speech/sdk/SpeechRecognizer;", "getInstance", "()Lcom/meituan/ai/speech/sdk/SpeechRecognizer;", "setInstance", "(Lcom/meituan/ai/speech/sdk/SpeechRecognizer;)V", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @NotNull
        public final SpeechRecognizer getInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ecdd1e36f74496d515ffa089c4ce6e6", RobustBitConfig.DEFAULT_VALUE)) {
                return (SpeechRecognizer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ecdd1e36f74496d515ffa089c4ce6e6");
            }
            SpeechRecognizer speechRecognizer = SpeechRecognizer.instance;
            if (speechRecognizer == null) {
                h.a("instance");
            }
            return speechRecognizer;
        }

        public final void setInstance(@NotNull SpeechRecognizer speechRecognizer) {
            Object[] objArr = {speechRecognizer};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7489de723e77e21e2bf1289892a90a69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7489de723e77e21e2bf1289892a90a69");
                return;
            }
            h.b(speechRecognizer, "<set-?>");
            SpeechRecognizer.instance = speechRecognizer;
        }
    }

    @Nullable
    public final IVadProcessor getDefaultVAD() {
        return this.defaultVAD;
    }

    @Nullable
    public final ICodecProcessor getDefaultCodec() {
        return this.defaultCodec;
    }

    @NotNull
    public final AudioData getAudioDatas() {
        return this.audioDatas;
    }

    public final int getLastDataCallbackTime() {
        return this.lastDataCallbackTime;
    }

    @NotNull
    public final ConcurrentHashMap<String, Long> getLastAudioDataTimeMap() {
        return this.lastAudioDataTimeMap;
    }

    public final void setLastAudioDataTimeMap(@NotNull ConcurrentHashMap<String, Long> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d92eda1a0d4ccbca75642c2c3c1ca7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d92eda1a0d4ccbca75642c2c3c1ca7e");
            return;
        }
        h.b(concurrentHashMap, "<set-?>");
        this.lastAudioDataTimeMap = concurrentHashMap;
    }

    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    public final void addVADProcessor(@NotNull IVadProcessor iVadProcessor) {
        Object[] objArr = {iVadProcessor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b4979728b9e2ea14fc4b19be231d093", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b4979728b9e2ea14fc4b19be231d093");
            return;
        }
        h.b(iVadProcessor, "processor");
        this.defaultVAD = iVadProcessor;
    }

    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    public final int getTransferAudioSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f699363d928e2e5b6e79e3adda210d5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f699363d928e2e5b6e79e3adda210d5")).intValue() : this.audioDatas.getRecogDataSize();
    }

    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    public final void setTransferAudioSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84b641da45f7a311c62b4028984fa0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84b641da45f7a311c62b4028984fa0d4");
        } else {
            this.audioDatas.setRecogDataSize(i);
        }
    }

    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    @Nullable
    public final IVadProcessor getVADProcessor() {
        return this.defaultVAD;
    }

    public final void addCodecProcessor(@NotNull ICodecProcessor iCodecProcessor) {
        Object[] objArr = {iCodecProcessor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0708d2296a2d1ee23b7686c70f62dd97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0708d2296a2d1ee23b7686c70f62dd97");
            return;
        }
        h.b(iCodecProcessor, "processor");
        this.defaultCodec = iCodecProcessor;
    }

    public final void removeCodecProcessor() {
        this.defaultCodec = null;
    }

    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    public final void appendAuthParams(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04b6ad40ba87b685f50aad41bfcf6a67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04b6ad40ba87b685f50aad41bfcf6a67");
            return;
        }
        h.b(str, "appKey");
        h.b(str2, "secretKey");
        AuthParams authParams = new AuthParams();
        authParams.setAppKey(str);
        authParams.setSecretKey(str2);
        NetCreator.INSTANCE.getAuthParams().put(str, authParams);
    }

    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    @Keep
    public final void recognize(@NotNull Context context, @NotNull Short[] shArr) {
        StackTraceElement[] stackTrace;
        boolean z = true;
        Object[] objArr = {context, shArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49bfd1f5ee599559101049623de86c79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49bfd1f5ee599559101049623de86c79");
            return;
        }
        h.b(context, "context");
        h.b(shArr, "data");
        StringBuilder sb = new StringBuilder("[Recog Process recognize] \ndata_length=");
        sb.append(shArr.length);
        sb.append('}');
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(simpleName);
            sb2.append(']');
        }
        if (shArr.length > this.audioDatas.getRecogDataSize() * 2) {
            RecogCallback callback = this.audioDatas.getCallback();
            if (callback != null) {
                callback.failed(this.audioDatas.getSessionId(), com.meituan.ai.speech.base.net.base.a.ERROR_RECOG_DATA_TOO_LARGE.N, com.meituan.ai.speech.base.net.base.a.ERROR_RECOG_DATA_TOO_LARGE.O + (this.audioDatas.getRecogDataSize() * 2) + "-传入包大小为" + shArr.length);
                return;
            }
            return;
        }
        try {
            processVoiceDB(shArr);
            short[] recogAudioData = this.audioDatas.getRecogAudioData(shArr);
            if (recogAudioData != null) {
                short[] processDataByVad = processDataByVad(recogAudioData, false);
                byte[] processDataByCodec = processDataByCodec(processDataByVad, false);
                if (processDataByVad != null) {
                    if (this.defaultCodec == null) {
                        z = false;
                    }
                    netProcess(context, processDataByCodec, z);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e.toString() + "\n");
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                sb3.append(stackTraceElement.toString() + "\n");
            }
            String sb4 = sb3.toString();
            h.a((Object) sb4, "sb.toString()");
            String str = "[Recog Process]Exception!! Cause: " + sb4;
            String simpleName2 = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName2 + ']', str);
            }
            RecogCallback callback2 = this.audioDatas.getCallback();
            if (callback2 != null) {
                callback2.failed(this.audioDatas.getSessionId(), com.meituan.ai.speech.base.net.base.a.OTHER_ERROR.N, "识别错误-" + sb4);
            }
        }
        this.preRecogTime = System.currentTimeMillis();
    }

    private final void processVoiceDB(Short[] shArr) {
        Object[] objArr = {shArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99ca247fb29264ddb2b36fbb061badd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99ca247fb29264ddb2b36fbb061badd9");
            return;
        }
        RecogCallback callback = this.audioDatas.getCallback();
        if (callback != null) {
            h.b(shArr, "$this$toShortArray");
            int length = shArr.length;
            short[] sArr = new short[length];
            for (int i = 0; i < length; i++) {
                sArr[i] = shArr[i].shortValue();
            }
            callback.onVoiceDBSize(VoiceUtilsKt.handleVoiceDB(sArr));
        }
    }

    private final byte[] processDataByCodec(short[] sArr, boolean z) {
        Object[] objArr = {sArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d2931dafe66491fac31e43da1b9da38", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d2931dafe66491fac31e43da1b9da38");
        }
        if (sArr != null) {
            if (this.defaultCodec != null && this.currentAsrConfig != null) {
                AsrConfig asrConfig = this.currentAsrConfig;
                if (asrConfig == null) {
                    h.a();
                }
                if (asrConfig.isSupportCodec()) {
                    StringBuilder sb = new StringBuilder("[Process Data By Codec]Start! data_length=");
                    sb.append(sArr.length);
                    sb.append(" is_last=");
                    sb.append(z);
                    String simpleName = getClass().getSimpleName();
                    h.a((Object) simpleName, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb2 = new StringBuilder("[");
                        sb2.append(simpleName);
                        sb2.append(']');
                    }
                    StringBuilder sb3 = new StringBuilder("[Process Data By Codec]Process Finish! Time=");
                    long currentTimeMillis = System.currentTimeMillis();
                    ICodecProcessor iCodecProcessor = this.defaultCodec;
                    if (iCodecProcessor == null) {
                        h.a();
                    }
                    byte[] process = iCodecProcessor.process(sArr, z);
                    sb3.append(System.currentTimeMillis() - currentTimeMillis);
                    String simpleName2 = getClass().getSimpleName();
                    h.a((Object) simpleName2, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb4 = new StringBuilder("[");
                        sb4.append(simpleName2);
                        sb4.append(']');
                    }
                    return process;
                }
            }
            new StringBuilder("[Process Data By Codec]no set codec! is_last=").append(z);
            String simpleName3 = getClass().getSimpleName();
            h.a((Object) simpleName3, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb5 = new StringBuilder("[");
                sb5.append(simpleName3);
                sb5.append(']');
            }
            return JavaUtils.toByteArray(sArr);
        }
        return null;
    }

    private final short[] processDataByVad(short[] sArr, boolean z) {
        String str;
        Object[] objArr = {sArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dae8b1d0647e01c64bc5f29adea48cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (short[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dae8b1d0647e01c64bc5f29adea48cb");
        }
        if (this.defaultVAD != null && this.currentAsrConfig != null) {
            AsrConfig asrConfig = this.currentAsrConfig;
            if (asrConfig == null) {
                h.a();
            }
            if (asrConfig.isSupportVad16()) {
                StringBuilder sb = new StringBuilder("[Process Data By Vad]Start! data_length=");
                sb.append(sArr.length);
                sb.append(" is_last=");
                sb.append(z);
                String simpleName = getClass().getSimpleName();
                h.a((Object) simpleName, "this::class.java.simpleName");
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                    StringBuilder sb2 = new StringBuilder("[");
                    sb2.append(simpleName);
                    sb2.append(']');
                }
                StringBuilder sb3 = new StringBuilder("[Process Data By Vad]Process Finish! Time=");
                long currentTimeMillis = System.currentTimeMillis();
                IVadProcessor iVadProcessor = this.defaultVAD;
                if (iVadProcessor == null) {
                    h.a();
                }
                if (this.userInfo.c == null) {
                    str = "";
                } else {
                    str = this.userInfo.c;
                    if (str == null) {
                        h.a();
                    }
                }
                short[] process = iVadProcessor.process(str, sArr, z);
                sb3.append(System.currentTimeMillis() - currentTimeMillis);
                String simpleName2 = getClass().getSimpleName();
                h.a((Object) simpleName2, "this::class.java.simpleName");
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                    StringBuilder sb4 = new StringBuilder("[");
                    sb4.append(simpleName2);
                    sb4.append(']');
                }
                return process;
            }
        }
        String simpleName3 = getClass().getSimpleName();
        h.a((Object) simpleName3, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb5 = new StringBuilder("[");
            sb5.append(simpleName3);
            sb5.append(']');
        }
        return sArr;
    }

    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    @Keep
    public final void start(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull AsrConfig asrConfig, @Nullable RecogCallback recogCallback) {
        String str3;
        Object[] objArr = {context, str, str2, asrConfig, recogCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86a87f167ddd13f895c34215e55ba3fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86a87f167ddd13f895c34215e55ba3fe");
            return;
        }
        h.b(context, "context");
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(asrConfig, "asrConfig");
        reset();
        AuthParams authParams = NetCreator.INSTANCE.getAuthParams().get(str);
        this.isUseWebSocket = authParams != null && authParams.isNetWebSocket();
        this.audioDatas.setRecogDataSize((int) ((asrConfig.getTransmitAudioLength() / 1000.0f) * asrConfig.getRate()));
        this.audioDatas.setRate(asrConfig.getRate());
        this.userInfo.c = str;
        this.audioDatas.setSessionId(str2);
        this.audioDatas.setCallback(recogCallback);
        this.currentAsrConfig = asrConfig;
        switch (NetworkUtils.getAPNType(context)) {
            case 0:
                str3 = "no";
                break;
            case 1:
                str3 = "WIFI";
                break;
            case 2:
                str3 = "2G";
                break;
            case 3:
                str3 = "3G";
                break;
            case 4:
                str3 = "4G";
                break;
            case 5:
                str3 = "ETHERNET";
                break;
            default:
                str3 = "";
                break;
        }
        this.netType = str3;
        StringBuilder sb = new StringBuilder("[Recog Start Method]\n");
        sb.append("sessionId=");
        sb.append(str2);
        sb.append('\n');
        sb.append("temp_asr_data_size=");
        sb.append(this.audioDatas.getRecogData().size());
        sb.append('\n');
        sb.append("cache_vad_perform_data_size=");
        sb.append(this.audioDatas.getCacheVadPerformDatas().size());
        sb.append('\n');
        sb.append("cache_codec_perform_data_size=");
        sb.append(this.audioDatas.getCacheCodecPerformDatas().size());
        sb.append('\n');
        sb.append("pre_process_result=");
        sb.append(this.preRecogResult);
        sb.append('\n');
        sb.append("last_data_callback_time=");
        sb.append(this.lastDataCallbackTime);
        sb.append('\n');
        sb.append("audio_index=");
        sb.append(this.audioDatas.getPktIndex());
        sb.append('\n');
        sb.append("net_type=");
        String str4 = this.netType;
        if (str4 == null) {
            h.a("netType");
        }
        sb.append(str4);
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(simpleName);
            sb2.append(']');
        }
        if (recogCallback != null) {
            recogCallback.start(str2);
        }
        com.meituan.ai.speech.sdk.a.a.a(str, this.isUseWebSocket, this.audioDatas.getSessionId(), this.currentAsrConfig, !AppUtilsKt.isAppForeground(context));
        netProcess(context, null, this.defaultCodec != null);
        IVadProcessor iVadProcessor = this.defaultVAD;
        if (iVadProcessor != null) {
            iVadProcessor.onStart(str, str2);
        }
        ICodecProcessor iCodecProcessor = this.defaultCodec;
        if (iCodecProcessor != null) {
            iCodecProcessor.onStart();
        }
        if (asrConfig.getRecordSoundMaxTime() > 0) {
            this.currentTimerExecutor = com.sankuai.android.jarvis.c.c("SpeechAsr-overtime");
            ScheduledExecutorService scheduledExecutorService = this.currentTimerExecutor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.schedule(new d(recogCallback, str2), asrConfig.getRecordSoundMaxTime() * 1, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ RecogCallback c;
        public final /* synthetic */ String d;

        public d(RecogCallback recogCallback, String str) {
            this.c = recogCallback;
            this.d = str;
            Object[] objArr = {SpeechRecognizer.this, recogCallback, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad55ef39b9544934b4bacac71350e947", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad55ef39b9544934b4bacac71350e947");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d6d78c5c517d03da998206bce66f8f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d6d78c5c517d03da998206bce66f8f");
                return;
            }
            ScheduledExecutorService scheduledExecutorService = SpeechRecognizer.this.currentTimerExecutor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
            SpeechRecognizer.this.currentTimerExecutor = null;
            RecogCallback recogCallback = this.c;
            if (recogCallback != null) {
                recogCallback.onOvertimeClose(this.d);
            }
        }
    }

    private final String buildAsrParams(boolean z) {
        String bizData;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "521df5f2e235583936488778f8179bb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "521df5f2e235583936488778f8179bb8");
        }
        String str = z ? "spz" : "pcm";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder("\n            {\n                \"mt_uuid\": \"");
        sb.append(this.userInfo.b);
        sb.append("\",\n                \"network_type\": \"");
        String str2 = this.netType;
        if (str2 == null) {
            h.a("netType");
        }
        sb.append(str2);
        sb.append("\",\n                \"format\": \"");
        sb.append(str);
        sb.append("\",\n                \"rate\": ");
        sb.append(this.audioDatas.getRate());
        sb.append(",\n                \"channel\": ");
        sb.append(this.audioDatas.getChannel());
        sb.append(",\n                \"session_id\": \"");
        sb.append(this.audioDatas.getSessionId());
        sb.append("\",\n                \"packet_index\": ");
        sb.append(this.audioDatas.getPktIndex());
        sb.append(",\n                \"data_type\": \"binary\"\n            ");
        stringBuffer.append(sb.toString());
        if (this.currentAsrConfig == null) {
            stringBuffer.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        } else {
            stringBuffer.append(CommonConstant.Symbol.COMMA);
            StringBuilder sb2 = new StringBuilder("\"n\": ");
            AsrConfig asrConfig = this.currentAsrConfig;
            sb2.append(asrConfig != null ? Integer.valueOf(asrConfig.getResultCount()) : null);
            sb2.append(',');
            stringBuffer.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder("\"asr_model\": ");
            AsrConfig asrConfig2 = this.currentAsrConfig;
            sb3.append(asrConfig2 != null ? Integer.valueOf(asrConfig2.getAsrModel()) : null);
            sb3.append(',');
            stringBuffer.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder("\"adapt_lm_id\": ");
            AsrConfig asrConfig3 = this.currentAsrConfig;
            sb4.append(asrConfig3 != null ? Integer.valueOf(asrConfig3.getAsrSubModelId()) : null);
            sb4.append(',');
            stringBuffer.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder("\"asr_sound_model\": ");
            AsrConfig asrConfig4 = this.currentAsrConfig;
            sb5.append(asrConfig4 != null ? Integer.valueOf(asrConfig4.getAsrSoundModel()) : null);
            sb5.append(',');
            stringBuffer.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder("\"is_ignore_tmp_result\": ");
            AsrConfig asrConfig5 = this.currentAsrConfig;
            sb6.append(asrConfig5 != null ? Integer.valueOf(asrConfig5.isIgnoreTempResult()) : null);
            sb6.append(',');
            stringBuffer.append(sb6.toString());
            StringBuilder sb7 = new StringBuilder("\"is_need_punctuation\": ");
            AsrConfig asrConfig6 = this.currentAsrConfig;
            sb7.append(asrConfig6 != null ? Integer.valueOf(asrConfig6.isNeedPunctuation()) : null);
            sb7.append(',');
            stringBuffer.append(sb7.toString());
            StringBuilder sb8 = new StringBuilder("\"is_normalize_text\": ");
            AsrConfig asrConfig7 = this.currentAsrConfig;
            sb8.append(asrConfig7 != null ? Integer.valueOf(asrConfig7.isNormalizeText()) : null);
            sb8.append(',');
            stringBuffer.append(sb8.toString());
            StringBuilder sb9 = new StringBuilder("\"language_type\": ");
            AsrConfig asrConfig8 = this.currentAsrConfig;
            sb9.append(asrConfig8 != null ? Integer.valueOf(asrConfig8.getLanguageType()) : null);
            sb9.append(',');
            stringBuffer.append(sb9.toString());
            StringBuilder sb10 = new StringBuilder("\"language\": ");
            AsrConfig asrConfig9 = this.currentAsrConfig;
            sb10.append(asrConfig9 != null ? Integer.valueOf(asrConfig9.getLanguage()) : null);
            sb10.append(',');
            stringBuffer.append(sb10.toString());
            StringBuilder sb11 = new StringBuilder("\"scene\": ");
            AsrConfig asrConfig10 = this.currentAsrConfig;
            sb11.append(asrConfig10 != null ? Integer.valueOf(asrConfig10.getScene()) : null);
            stringBuffer.append(sb11.toString());
            AsrConfig asrConfig11 = this.currentAsrConfig;
            if (asrConfig11 != null && (bizData = asrConfig11.getBizData()) != null) {
                stringBuffer.append(",\"biz_data\": \"" + bizData + '\"');
            }
            if (this.defaultVAD == null) {
                stringBuffer.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            } else if (this.userInfo.c == null) {
                stringBuffer.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            } else {
                IVadProcessor iVadProcessor = this.defaultVAD;
                if (iVadProcessor == null) {
                    h.a();
                }
                String str3 = this.userInfo.c;
                if (str3 == null) {
                    h.a();
                }
                IVadConfig vadConfig = iVadProcessor.getVadConfig(str3);
                if (vadConfig == null) {
                    stringBuffer.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
                } else {
                    stringBuffer.append(CommonConstant.Symbol.COMMA);
                    stringBuffer.append("\"asr_vad_model\": " + vadConfig.getVadModel() + ',');
                    stringBuffer.append("\"vad_least_sound_size\": " + vadConfig.getLeastSoundSize() + ',');
                    stringBuffer.append("\"vad_least_silence_size\": " + vadConfig.getLeastSilenceSize() + '}');
                }
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        h.a((Object) stringBuffer2, "asrParamsBuffer.toString()");
        return stringBuffer2;
    }

    private final void netProcess(Context context, byte[] bArr, boolean z) {
        com.meituan.ai.speech.sdk.net.a.d dVar;
        boolean z2;
        BaseWebSocketRequest<RecogResult> baseWebSocketRequest;
        Object[] objArr = {context, bArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46ea804f6d157f2c2444160ba3b8e493", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46ea804f6d157f2c2444160ba3b8e493");
            return;
        }
        String buildAsrParams = buildAsrParams(z);
        String encodeBase64ToString = Base64Kt.encodeBase64ToString(buildAsrParams);
        if (this.currentAsrConfig == null) {
            return;
        }
        if (bArr != null && (this.audioDatas.getPktIndex() == 1 || this.audioDatas.getPktIndex() % 50 == 0 || this.audioDatas.getPktIndex() < 0)) {
            String str = this.userInfo.c;
            if (str == null) {
                str = "";
            }
            com.meituan.ai.speech.sdk.a.a.a(str, this.audioDatas.getSessionId(), this.audioDatas.getPktIndex(), bArr.length);
        }
        if (this.isUseWebSocket) {
            if (this.defaultVAD == null) {
                z2 = false;
            } else {
                IVadProcessor iVadProcessor = this.defaultVAD;
                if (iVadProcessor == null) {
                    h.a();
                }
                String str2 = this.userInfo.c;
                if (str2 == null) {
                    str2 = "";
                }
                IVadConfig vadConfig = iVadProcessor.getVadConfig(str2);
                if (vadConfig != null && (baseWebSocketRequest = this.webSocketRequest) != null) {
                    baseWebSocketRequest.setVadParams(vadConfig.getStartTipTime(), vadConfig.getEndTipTime());
                }
                z2 = true;
            }
            BaseWebSocketRequest<RecogResult> baseWebSocketRequest2 = this.webSocketRequest;
            if (baseWebSocketRequest2 != null) {
                baseWebSocketRequest2.setRecogParams(this.audioDatas.getSessionId(), buildAsrParams, z2, bArr, this.audioDatas.getPktIndex());
            }
            BaseWebSocketRequest<RecogResult> baseWebSocketRequest3 = this.webSocketRequest;
            if (baseWebSocketRequest3 != null) {
                String str3 = this.userInfo.c;
                if (str3 == null) {
                    str3 = "";
                }
                baseWebSocketRequest3.request(str3);
            }
        } else {
            if (this.defaultVAD == null) {
                dVar = new com.meituan.ai.speech.sdk.net.a.c(context, this.audioDatas.getPktIndex() < 0);
                com.meituan.ai.speech.sdk.net.a.c cVar = dVar;
                String sessionId = this.audioDatas.getSessionId();
                Object[] objArr2 = {sessionId, encodeBase64ToString, bArr};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.ai.speech.sdk.net.a.c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "bc68e48ebc624ae5feff6f95ffdad00e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "bc68e48ebc624ae5feff6f95ffdad00e");
                } else {
                    h.b(sessionId, "sessionId");
                    h.b(encodeBase64ToString, "params");
                    cVar.b = encodeBase64ToString;
                    cVar.d = bArr;
                    cVar.c = sessionId;
                }
            } else {
                dVar = new com.meituan.ai.speech.sdk.net.a.d(context, this.audioDatas.getPktIndex() < 0);
                com.meituan.ai.speech.sdk.net.a.d dVar2 = dVar;
                String sessionId2 = this.audioDatas.getSessionId();
                Object[] objArr3 = {sessionId2, encodeBase64ToString, bArr};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.ai.speech.sdk.net.a.d.a;
                if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect4, false, "325748b3b7e453e36108a876ba2f18d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect4, false, "325748b3b7e453e36108a876ba2f18d6");
                } else {
                    h.b(sessionId2, "sessionId");
                    h.b(encodeBase64ToString, "params");
                    dVar2.c = sessionId2;
                    dVar2.b = encodeBase64ToString;
                    dVar2.d = bArr;
                }
            }
            String str4 = this.userInfo.c;
            if (str4 == null) {
                str4 = "";
            }
            dVar.request(str4, new a(this, this.audioDatas.getSessionId()));
        }
        if (this.audioDatas.getPktIndex() < 0) {
            this.lastAudioDataTimeMap.put(this.audioDatas.getSessionId(), Long.valueOf(System.currentTimeMillis()));
        }
        AudioData audioData = this.audioDatas;
        audioData.setPktIndex(audioData.getPktIndex() + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b9, code lost:
        if (r13 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0252, code lost:
        if (r13 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0254, code lost:
        r13.onDestroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0257, code lost:
        r13 = getClass().getSimpleName();
        kotlin.jvm.internal.h.a((java.lang.Object) r13, "this::class.java.simpleName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0275, code lost:
        if (com.meituan.ai.speech.base.log.SPLog.INSTANCE.getLogLevel().getValue() <= com.meituan.ai.speech.base.log.SPLogLevel.WARN.getValue()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0277, code lost:
        r0 = new java.lang.StringBuilder("[");
        r0.append(r13);
        r0.append(']');
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0284, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    @android.support.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void end(@org.jetbrains.annotations.NotNull android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.ai.speech.sdk.SpeechRecognizer.end(android.content.Context):void");
    }

    private final void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f431d54beb50a83076b8e69db265ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f431d54beb50a83076b8e69db265ce3");
            return;
        }
        this.audioDatas.setSessionId("");
        this.userInfo.d = null;
        this.userInfo.c = null;
        this.audioDatas.setCallback(null);
        this.audioDatas.clearAudioDatas();
        this.audioDatas.clearCacheData();
        this.preRecogResult = null;
        this.lastDataCallbackTime = 0;
        this.preRecogTime = 0L;
        this.audioDatas.setPktIndex(0);
        this.netType = "";
        StringBuilder sb = new StringBuilder("[Recog Reset Method]\n");
        sb.append("sessionId=");
        sb.append(this.audioDatas.getSessionId());
        sb.append('\n');
        sb.append("is_last=true\ntemp_asr_data_size=");
        sb.append(this.audioDatas.getRecogData().size());
        sb.append('\n');
        sb.append("cache_vad_perform_data_size=");
        sb.append(this.audioDatas.getCacheVadPerformDatas().size());
        sb.append('\n');
        sb.append("cache_codec_perform_data_size=");
        sb.append(this.audioDatas.getCacheCodecPerformDatas().size());
        sb.append('\n');
        sb.append("pre_process_result=");
        sb.append(this.preRecogResult);
        sb.append('\n');
        sb.append("index=");
        sb.append(this.audioDatas.getPktIndex());
        sb.append('\n');
        sb.append("net_type=");
        String str = this.netType;
        if (str == null) {
            h.a("netType");
        }
        sb.append(str);
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(simpleName);
            sb2.append(']');
        }
    }

    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    @Keep
    public final void register(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        String secretKey;
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4cb2d8343251cbb31f7cfd3df86aeaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4cb2d8343251cbb31f7cfd3df86aeaf");
            return;
        }
        h.b(context, "context");
        h.b(str, "uuid");
        h.b(str2, "appKey");
        AuthParams authParams = NetCreator.INSTANCE.getAuthParams().get(str2);
        if (authParams != null && (secretKey = authParams.getSecretKey()) != null) {
            HornMonitor.INSTANCE.init(context, str2, secretKey);
            com.meituan.ai.speech.sdk.a.a.a(str2, secretKey);
        }
        com.meituan.ai.speech.sdk.net.a.a aVar = new com.meituan.ai.speech.sdk.net.a.a(context);
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.ai.speech.sdk.net.a.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "74435e4235a87d0daa67031323f4501f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "74435e4235a87d0daa67031323f4501f");
        } else {
            h.b(str, "uuid");
            aVar.b = str;
        }
        aVar.request(str2, new c());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/meituan/ai/speech/sdk/SpeechRecognizer$register$2", "Lcom/meituan/ai/speech/base/net/base/ICallback;", "Lcom/meituan/ai/speech/sdk/net/data/ConfigResult;", "onFailed", "", "code", "", "msg", "", "onSuccess", "appKey", "result", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class c implements ICallback<ConfigResult> {
        public static ChangeQuickRedirect a;

        public c() {
            Object[] objArr = {SpeechRecognizer.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d62c388bd165ed45ff6897d7b8aaf305", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d62c388bd165ed45ff6897d7b8aaf305");
            }
        }

        @Override // com.meituan.ai.speech.base.net.base.ICallback
        public final /* synthetic */ void onSuccess(String str, ConfigResult configResult) {
            ConfigResult configResult2 = configResult;
            Object[] objArr = {str, configResult2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "134a1cf96eec95db7e675a2b8410696f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "134a1cf96eec95db7e675a2b8410696f");
                return;
            }
            h.b(str, "appKey");
            h.b(configResult2, "result");
            StringBuilder sb = new StringBuilder("[Recog Register]Success! duration=");
            sb.append(configResult2.duration);
            sb.append(Constants.SPACE);
            String simpleName = getClass().getSimpleName();
            h.a((Object) simpleName, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(simpleName);
                sb2.append(']');
            }
            AsrConfig.Companion.setDefaultAsrModel(configResult2.asr_model);
            AsrConfig.Companion.setDefaultAsrSoundModel(configResult2.asr_sound_model);
            AsrConfig.Companion.setDefaultIsIgnoreTempResult(configResult2.ignore_tmp_result);
            AsrConfig.Companion.setDefaultIsNeedPunctuation(configResult2.need_punctuation);
            AsrConfig.Companion.setDefaultIsNormalizeText(configResult2.normalize_text);
            AsrConfig.Companion.setDefaultLanguage(configResult2.language);
            AsrConfig.Companion.setDefaultLanguageType(configResult2.language_type);
            AsrConfig.Companion.setDefaultRecordSoundMaxTime(configResult2.record_sound_max_size);
            AsrConfig.Companion.setDefaultTransmitAudioLength(configResult2.duration > 0 ? (int) configResult2.duration : 200);
            IVadConfig.Companion.setDefaultVadModel(configResult2.asr_vad_model);
            IVadConfig.Companion.setDefaultLeastSoundSize(configResult2.vad_least_sound_size);
            IVadConfig.Companion.setDefaultLeastSilenceSize(configResult2.vad_least_silence_size);
        }

        @Override // com.meituan.ai.speech.base.net.base.ICallback
        public final void onFailed(int i, @Nullable String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebb32e9aca34d83effe43a8d33fb4f4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebb32e9aca34d83effe43a8d33fb4f4c");
                return;
            }
            String str2 = "[Recog Register]Failed! code=" + i + " message=" + str;
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', str2);
            }
            RecogCallback callback = SpeechRecognizer.this.getAudioDatas().getCallback();
            if (callback != null) {
                callback.failed("", i, "[Config Failed]" + str);
            }
        }
    }

    @Override // com.meituan.ai.speech.base.sdk.ISpeechRecognizer
    public final void cancelAllRecognize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a861d5e0525a1e38e9593baed364234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a861d5e0525a1e38e9593baed364234");
        } else {
            NetCreator.INSTANCE.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initNetwork(Context context, int i, String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06cb14715a94400206531da206d95554", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06cb14715a94400206531da206d95554");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            NetCreator.INSTANCE.setAsrBaseUrl(str);
        }
        CatMonitor.INSTANCE.init(context, i, this.userInfo.b);
        this.webSocketRequest = new e(context);
        BaseWebSocketRequest<RecogResult> baseWebSocketRequest = this.webSocketRequest;
        if (baseWebSocketRequest != null) {
            baseWebSocketRequest.setInitParams(i, this.userInfo.b, "1.4.11");
        }
        BaseWebSocketRequest<RecogResult> baseWebSocketRequest2 = this.webSocketRequest;
        if (baseWebSocketRequest2 != null) {
            baseWebSocketRequest2.setWebSocketCallBack(new b());
        }
        BaseWebSocketRequest<RecogResult> baseWebSocketRequest3 = this.webSocketRequest;
        if (baseWebSocketRequest3 != null) {
            baseWebSocketRequest3.initService();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUUID(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c00bdd35a665f539d238cf366d11086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c00bdd35a665f539d238cf366d11086");
        } else if (TextUtils.isEmpty(str)) {
            this.userInfo.a(AppUtilsKt.getUuid(context));
        } else {
            this.userInfo.a(str);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\bH\u0007J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/meituan/ai/speech/sdk/SpeechRecognizer$Builder;", "", "()V", "asrBaseUrl", "", "catAppId", "", "logLevel", "Lcom/meituan/ai/speech/base/log/SPLogLevel;", "manager", "Lcom/meituan/ai/speech/sdk/SpeechRecognizer;", "getManager", "()Lcom/meituan/ai/speech/sdk/SpeechRecognizer;", "manager$delegate", "Lkotlin/Lazy;", "uuid", "build", "context", "Landroid/content/Context;", "setBaseUrl", "setCatAppId", "setLog", "level", "setUUID", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class Builder {
        public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(Builder.class), "manager", "getManager()Lcom/meituan/ai/speech/sdk/SpeechRecognizer;"))};
        public static ChangeQuickRedirect changeQuickRedirect;
        private String asrBaseUrl;
        private int catAppId;
        private SPLogLevel logLevel;
        private final kotlin.d manager$delegate;
        private String uuid;

        private final SpeechRecognizer getManager() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (SpeechRecognizer) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76e949c0d9c9436a00a5bc15b6bbf6e2", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76e949c0d9c9436a00a5bc15b6bbf6e2") : this.manager$delegate.a());
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/meituan/ai/speech/sdk/SpeechRecognizer;", "invoke"}, k = 3, mv = {1, 1, 13})
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<SpeechRecognizer> {
            public static ChangeQuickRedirect a;
            public static final a b = new a();

            public a() {
                super(0);
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f95082a4c1626cac0b3930f5c13fd3f3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f95082a4c1626cac0b3930f5c13fd3f3");
                }
            }

            @Override // kotlin.jvm.functions.a
            public final /* synthetic */ SpeechRecognizer invoke() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ef9aac6bf47ad958abf2740d592492b", RobustBitConfig.DEFAULT_VALUE) ? (SpeechRecognizer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ef9aac6bf47ad958abf2740d592492b") : new SpeechRecognizer(null);
            }
        }

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a226473810ae2d7da6f155f44fe247cd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a226473810ae2d7da6f155f44fe247cd");
                return;
            }
            this.catAppId = TbsListener.ErrorCode.RENAME_SUCCESS;
            this.uuid = "";
            this.logLevel = SPLogLevel.NONE;
            this.asrBaseUrl = "";
            this.manager$delegate = kotlin.e.a(a.b);
        }

        @Keep
        @NotNull
        public final SpeechRecognizer build(@NotNull Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ed6536c685660c9dbfcd0cc0a2c71c1", RobustBitConfig.DEFAULT_VALUE)) {
                return (SpeechRecognizer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ed6536c685660c9dbfcd0cc0a2c71c1");
            }
            h.b(context, "context");
            StringBuilder sb = new StringBuilder("[Builder Params]\n");
            sb.append("context=");
            sb.append(context);
            sb.append('\n');
            sb.append("uuid=");
            sb.append(this.uuid);
            sb.append('\n');
            sb.append("log_level=");
            sb.append(this.logLevel);
            String simpleName = getClass().getSimpleName();
            h.a((Object) simpleName, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(simpleName);
                sb2.append(']');
            }
            SPLog.INSTANCE.logConfig(this.logLevel);
            getManager().isInit = true;
            getManager().setUUID(context, this.uuid);
            getManager().initNetwork(context, this.catAppId, this.asrBaseUrl);
            SpeechRecognizer.Companion.setInstance(getManager());
            return getManager();
        }

        @Keep
        @NotNull
        public final Builder setUUID(@NotNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd8291e212b4bb24e7683291a638ca12", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd8291e212b4bb24e7683291a638ca12");
            }
            h.b(str, "uuid");
            this.uuid = str;
            return this;
        }

        @Keep
        @NotNull
        public final Builder setCatAppId(int i) {
            this.catAppId = i;
            return this;
        }

        @Keep
        @NotNull
        public final Builder setLog(@NotNull SPLogLevel sPLogLevel) {
            Object[] objArr = {sPLogLevel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49ee56c8a88612c869930bb631e9e812", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49ee56c8a88612c869930bb631e9e812");
            }
            h.b(sPLogLevel, "level");
            this.logLevel = sPLogLevel;
            return this;
        }

        @Keep
        @NotNull
        public final Builder setBaseUrl(@NotNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "425813e6c23294ad4211be50741cce05", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "425813e6c23294ad4211be50741cce05");
            }
            h.b(str, "asrBaseUrl");
            this.asrBaseUrl = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/meituan/ai/speech/sdk/SpeechRecognizer$NetCallback;", "Lcom/meituan/ai/speech/base/net/base/ICallback;", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "sessionId", "", "(Lcom/meituan/ai/speech/sdk/SpeechRecognizer;Ljava/lang/String;)V", "onFailed", "", "code", "", "msg", "onSuccess", "appKey", "result", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public final class a implements ICallback<RecogResult> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ SpeechRecognizer b;
        private String c;

        public a(SpeechRecognizer speechRecognizer, @NotNull String str) {
            h.b(str, "sessionId");
            this.b = speechRecognizer;
            Object[] objArr = {speechRecognizer, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363bcca74de56b6eff701b9c55e83836", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363bcca74de56b6eff701b9c55e83836");
            } else {
                this.c = str;
            }
        }

        @Override // com.meituan.ai.speech.base.net.base.ICallback
        public final /* synthetic */ void onSuccess(String str, RecogResult recogResult) {
            Integer valueOf;
            int i;
            RecogResult recogResult2 = recogResult;
            Object[] objArr = {str, recogResult2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27cb813a2a74c3c86f009e991e9e176", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27cb813a2a74c3c86f009e991e9e176");
                return;
            }
            h.b(str, "appKey");
            h.b(recogResult2, "result");
            IVadProcessor defaultVAD = this.b.getDefaultVAD();
            if (defaultVAD != null) {
                defaultVAD.onServerVadResult(str, false, recogResult2.getSpeech_time(), recogResult2.getVad_info());
            }
            if (recogResult2.getRes_index() < 0) {
                this.b.updateLastDataRequestTime();
            }
            StringBuilder sb = new StringBuilder("[Recog Data Request]Success!\n");
            sb.append("index=");
            sb.append(recogResult2.getRes_index());
            sb.append('\n');
            sb.append("text=");
            sb.append(recogResult2.getText());
            sb.append('\n');
            sb.append("costTime=");
            sb.append(this.b.getLastDataCallbackTime());
            sb.append('\n');
            sb.append("last_request_time=");
            sb.append(this.b.getLastDataCallbackTime());
            sb.append('\n');
            sb.append("results_size=");
            if (recogResult2.getSentences() == null) {
                valueOf = null;
            } else {
                List<RecogResultPart> sentences = recogResult2.getSentences();
                if (sentences == null) {
                    h.a();
                }
                valueOf = Integer.valueOf(sentences.size());
            }
            sb.append(valueOf);
            String simpleName = getClass().getSimpleName();
            h.a((Object) simpleName, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.ERROR.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(simpleName);
                sb2.append(']');
            }
            if (this.b.preRecogResult != null) {
                RecogResult recogResult3 = this.b.preRecogResult;
                if (recogResult3 == null) {
                    h.a();
                }
                if (recogResult3.getRes_index() >= Math.abs(recogResult2.getRes_index())) {
                    String simpleName2 = getClass().getSimpleName();
                    h.a((Object) simpleName2, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.ERROR.getValue()) {
                        StringBuilder sb3 = new StringBuilder("[");
                        sb3.append(simpleName2);
                        sb3.append(']');
                        return;
                    }
                    return;
                }
            }
            this.b.preRecogResult = recogResult2;
            if (h.a((Object) this.c, (Object) this.b.getAudioDatas().getSessionId())) {
                int i2 = -1;
                if (recogResult2.getVad_info() != null) {
                    ServerVadInfo[] vad_info = recogResult2.getVad_info();
                    if (vad_info == null) {
                        h.a();
                    }
                    if (!(vad_info.length == 0)) {
                        ServerVadInfo[] vad_info2 = recogResult2.getVad_info();
                        if (vad_info2 == null) {
                            h.a();
                        }
                        i2 = vad_info2[0].getStart();
                        ServerVadInfo[] vad_info3 = recogResult2.getVad_info();
                        if (vad_info3 == null) {
                            h.a();
                        }
                        i = vad_info3[0].getEnd();
                        this.b.callBackResult(this.c, i2, i, recogResult2);
                    }
                }
                i = -1;
                this.b.callBackResult(this.c, i2, i, recogResult2);
            }
        }

        @Override // com.meituan.ai.speech.base.net.base.ICallback
        public final void onFailed(int i, @Nullable String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d119103c813529d242533a5a689ea7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d119103c813529d242533a5a689ea7");
                return;
            }
            this.b.updateLastDataRequestTime();
            String str2 = "[Recog Data Request]Failed!\ncode=" + i + "\nmessage=" + str + "\nlast_request_time=" + this.b.getLastDataCallbackTime();
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', str2);
            }
            RecogCallback callback = this.b.getAudioDatas().getCallback();
            if (callback != null) {
                callback.failed(this.c, i, "[Recog Data Request]" + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J-\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0010J(\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¨\u0006\u0015"}, d2 = {"Lcom/meituan/ai/speech/sdk/SpeechRecognizer$WebSocketNetCallback;", "Lcom/meituan/ai/speech/base/net/base/IWebSocketCallback;", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "(Lcom/meituan/ai/speech/sdk/SpeechRecognizer;)V", "onFailed", "", "code", "", "msg", "", "onSendServerVad", "appKey", "speechTime", "vad_info", "", "Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "(Ljava/lang/String;I[Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;)V", "onSuccess", "startVadTime", "endVadTime", "result", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public final class b implements IWebSocketCallback<RecogResult> {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.meituan.ai.speech.base.net.base.IWebSocketCallback
        public final /* synthetic */ void onSuccess(String str, int i, int i2, RecogResult recogResult) {
            Integer valueOf;
            RecogResult recogResult2 = recogResult;
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), recogResult2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77474c9a98f0a93cfe1084823d7b4a34", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77474c9a98f0a93cfe1084823d7b4a34");
                return;
            }
            h.b(str, "appKey");
            h.b(recogResult2, "result");
            if (recogResult2.getRes_index() < 0) {
                SpeechRecognizer.this.updateLastDataRequestTime();
            }
            StringBuilder sb = new StringBuilder("[WebSocket Data Request]Success!\n");
            sb.append("index=");
            sb.append(recogResult2.getRes_index());
            sb.append('\n');
            sb.append("text=");
            sb.append(recogResult2.getText());
            sb.append('\n');
            sb.append("costTime=");
            sb.append(SpeechRecognizer.this.getLastDataCallbackTime());
            sb.append('\n');
            sb.append("last_request_time=");
            sb.append(SpeechRecognizer.this.getLastDataCallbackTime());
            sb.append('\n');
            sb.append("results_size=");
            if (recogResult2.getSentences() == null) {
                valueOf = null;
            } else {
                List<RecogResultPart> sentences = recogResult2.getSentences();
                if (sentences == null) {
                    h.a();
                }
                valueOf = Integer.valueOf(sentences.size());
            }
            sb.append(valueOf);
            String simpleName = getClass().getSimpleName();
            h.a((Object) simpleName, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.ERROR.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(simpleName);
                sb2.append(']');
            }
            if (SpeechRecognizer.this.preRecogResult != null) {
                RecogResult recogResult3 = SpeechRecognizer.this.preRecogResult;
                if (recogResult3 == null) {
                    h.a();
                }
                if (recogResult3.getRes_index() >= Math.abs(recogResult2.getRes_index())) {
                    String simpleName2 = getClass().getSimpleName();
                    h.a((Object) simpleName2, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.ERROR.getValue()) {
                        StringBuilder sb3 = new StringBuilder("[");
                        sb3.append(simpleName2);
                        sb3.append(']');
                        return;
                    }
                    return;
                }
            }
            SpeechRecognizer.this.preRecogResult = recogResult2;
            if (h.a((Object) recogResult2.getSession_id(), (Object) SpeechRecognizer.this.getAudioDatas().getSessionId())) {
                SpeechRecognizer.this.callBackResult(SpeechRecognizer.this.getAudioDatas().getSessionId(), i, i2, recogResult2);
            }
        }

        @Override // com.meituan.ai.speech.base.net.base.IWebSocketCallback
        public final void onSendServerVad(@NotNull String str, int i, @Nullable ServerVadInfo[] serverVadInfoArr) {
            Object[] objArr = {str, Integer.valueOf(i), serverVadInfoArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5296de8177662c81ea9e27816e34b307", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5296de8177662c81ea9e27816e34b307");
                return;
            }
            h.b(str, "appKey");
            IVadProcessor defaultVAD = SpeechRecognizer.this.getDefaultVAD();
            if (defaultVAD != null) {
                defaultVAD.onServerVadResult(str, true, i, serverVadInfoArr);
            }
        }

        @Override // com.meituan.ai.speech.base.net.base.IWebSocketCallback
        public final void onFailed(int i, @Nullable String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b98091feaecc7b3daba22c82ff5e5826", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b98091feaecc7b3daba22c82ff5e5826");
                return;
            }
            SpeechRecognizer.this.updateLastDataRequestTime();
            String str2 = "[WebSocket Data Request]Failed!\ncode=" + i + "\nmessage=" + str + "\nlast_request_time=" + SpeechRecognizer.this.getLastDataCallbackTime();
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', str2);
            }
            RecogCallback callback = SpeechRecognizer.this.getAudioDatas().getCallback();
            if (callback != null) {
                callback.failed(SpeechRecognizer.this.getAudioDatas().getSessionId(), i, "[WebSocket Data Request]" + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callBackResult(String str, int i, int i2, RecogResult recogResult) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), recogResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dba2901c7ccaa4977a7c144955bde68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dba2901c7ccaa4977a7c144955bde68");
        } else if (recogResult.getRes_index() >= 0) {
            AsrConfig asrConfig = this.currentAsrConfig;
            if (asrConfig == null || asrConfig.isIgnoreTempResult() != 0) {
                return;
            }
            RecogCallback callback = this.audioDatas.getCallback();
            if (callback != null) {
                callback.tempResult(str, recogResult);
            }
            if (recogResult.getRes_index() == 0 || recogResult.getRes_index() % 50 == 0) {
                String str2 = this.userInfo.c;
                if (str2 == null) {
                    str2 = "";
                }
                com.meituan.ai.speech.sdk.a.a.a(str2, str, recogResult.getRes_index(), i, i2, recogResult.getSpeech_time(), String.valueOf(recogResult.getText()));
            }
        } else {
            RecogCallback callback2 = this.audioDatas.getCallback();
            if (callback2 != null) {
                callback2.success(str, recogResult);
            }
            this.audioDatas.setCallback(null);
            String str3 = this.userInfo.c;
            if (str3 == null) {
                str3 = "";
            }
            com.meituan.ai.speech.sdk.a.a.a(str3, str, recogResult.getRes_index(), i, i2, recogResult.getSpeech_time(), String.valueOf(recogResult.getText()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLastDataRequestTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31fdd1aa76593ef2dd8a38cc279fd040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31fdd1aa76593ef2dd8a38cc279fd040");
            return;
        }
        Long l = this.lastAudioDataTimeMap.get(this.audioDatas.getSessionId());
        this.lastDataCallbackTime = l != null ? (int) (System.currentTimeMillis() - l.longValue()) : 0;
        this.lastAudioDataTimeMap.remove(this.audioDatas.getSessionId());
    }
}
