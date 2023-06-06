package com.meituan.ai.speech.sdk.helper;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.ai.speech.base.environment.IAsrEnvironment;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.privacy.PrivacySceneUtils;
import com.meituan.ai.speech.base.processor.callback.IVadCallback;
import com.meituan.ai.speech.base.processor.config.IVadConfig;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.base.sdk.AudioDataCallback;
import com.meituan.ai.speech.base.sdk.ISpeechRecognizer;
import com.meituan.ai.speech.base.sdk.RecogCallback;
import com.meituan.ai.speech.base.utils.AppUtilsKt;
import com.meituan.ai.speech.sdk.record.RecordConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.i;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0007J0\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020\u0011H\u0007J\b\u0010\"\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/meituan/ai/speech/sdk/helper/AudioRecordHelper;", "", "()V", "isListening", "", "isRecording", "mAudioAppKey", "", "mAudioSessionId", "mReceiveAudioDataCallback", "Lcom/meituan/ai/speech/base/sdk/AudioDataCallback;", "mSpeechRecognizer", "Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;", "mThreadPool", "Ljava/util/concurrent/ExecutorService;", "mUuid", "destroy", "", "init", "context", "Landroid/content/Context;", "asrEnvironment", "Lcom/meituan/ai/speech/base/environment/IAsrEnvironment;", "setReceiveAudioDataCallback", "callback", "startListening", "appKey", "asrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "recordConfig", "Lcom/meituan/ai/speech/sdk/record/RecordConfig;", "recogCallback", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "stopListening", "stopRecord", "Companion", "RecordTask", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class AudioRecordHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isListening;
    private boolean isRecording;
    private String mAudioAppKey;
    private String mAudioSessionId;
    private AudioDataCallback mReceiveAudioDataCallback;
    private ISpeechRecognizer mSpeechRecognizer;
    private ExecutorService mThreadPool;
    private String mUuid;
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final d instance$delegate = e.a(i.SYNCHRONIZED, a.b);

    public AudioRecordHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5aa809bcefd3ec5c0e2a37fac03c5090", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5aa809bcefd3ec5c0e2a37fac03c5090");
            return;
        }
        this.mAudioAppKey = "";
        this.mAudioSessionId = "";
        this.mUuid = "";
    }

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/meituan/ai/speech/sdk/helper/AudioRecordHelper$Companion;", "", "()V", "instance", "Lcom/meituan/ai/speech/sdk/helper/AudioRecordHelper;", "getInstance", "()Lcom/meituan/ai/speech/sdk/helper/AudioRecordHelper;", "instance$delegate", "Lkotlin/Lazy;", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ kotlin.reflect.i[] $$delegatedProperties = {u.a(new s(u.a(Companion.class), "instance", "getInstance()Lcom/meituan/ai/speech/sdk/helper/AudioRecordHelper;"))};
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public final AudioRecordHelper getInstance() {
            Object a;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e91b050a5687372eac066342944aafe", RobustBitConfig.DEFAULT_VALUE)) {
                a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e91b050a5687372eac066342944aafe");
            } else {
                d dVar = AudioRecordHelper.instance$delegate;
                Companion companion = AudioRecordHelper.Companion;
                a = dVar.a();
            }
            return (AudioRecordHelper) a;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/meituan/ai/speech/sdk/helper/AudioRecordHelper;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<AudioRecordHelper> {
        public static ChangeQuickRedirect a;
        public static final a b = new a();

        public a() {
            super(0);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46572211c691315aa133e3533876cf32", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46572211c691315aa133e3533876cf32");
            }
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ AudioRecordHelper invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dec062352b94531142d36e8dff6d2271", RobustBitConfig.DEFAULT_VALUE) ? (AudioRecordHelper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dec062352b94531142d36e8dff6d2271") : new AudioRecordHelper();
        }
    }

    @Keep
    public final void setReceiveAudioDataCallback(@Nullable AudioDataCallback audioDataCallback) {
        this.mReceiveAudioDataCallback = audioDataCallback;
    }

    @Keep
    public final void init(@NotNull Context context, @NotNull IAsrEnvironment iAsrEnvironment) {
        Object[] objArr = {context, iAsrEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fe45fa4564dba450ecfe44325a8244a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fe45fa4564dba450ecfe44325a8244a");
            return;
        }
        h.b(context, "context");
        h.b(iAsrEnvironment, "asrEnvironment");
        this.mUuid = iAsrEnvironment.getUUID();
        this.mSpeechRecognizer = new BuildRecognizerHelper().buildSpeechRecognizer(context, iAsrEnvironment);
        if (iAsrEnvironment.getVadConfig() != null && iAsrEnvironment.getVadCallback() != null) {
            IVadConfig vadConfig = iAsrEnvironment.getVadConfig();
            if (vadConfig == null) {
                h.a();
            }
            IVadCallback vadCallback = iAsrEnvironment.getVadCallback();
            if (vadCallback == null) {
                h.a();
            }
            vadConfig.setCallback(vadCallback);
            IVadConfig vadConfig2 = iAsrEnvironment.getVadConfig();
            if (vadConfig2 == null) {
                h.a();
            }
            vadConfig2.register(context, iAsrEnvironment.getAppKey(), this.mSpeechRecognizer);
        }
        this.mThreadPool = c.a("SpeechAsr-audioRecordHelper");
    }

    @Keep
    @RequiresPermission(allOf = {"android.permission.RECORD_AUDIO"})
    public final synchronized void startListening(@NotNull Context context, @NotNull String str, @NotNull AsrConfig asrConfig, @NotNull RecordConfig recordConfig, @NotNull RecogCallback recogCallback) {
        Object[] objArr = {context, str, asrConfig, recordConfig, recogCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93446d67936379cc65c8467595cc0750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93446d67936379cc65c8467595cc0750");
            return;
        }
        h.b(context, "context");
        h.b(str, "appKey");
        h.b(asrConfig, "asrConfig");
        h.b(recordConfig, "recordConfig");
        h.b(recogCallback, "recogCallback");
        if (this.mThreadPool != null && this.mSpeechRecognizer != null) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(recordConfig.getPrivacySceneToken())) {
                String str2 = "android_asr_session_" + AppUtilsKt.getUuid(context) + CommonConstant.Symbol.UNDERLINE + System.currentTimeMillis();
                com.meituan.ai.speech.sdk.a.a.a(str, str2, "record");
                int checkRecordPermission = PrivacySceneUtils.INSTANCE.checkRecordPermission(context, recordConfig.getPrivacySceneToken());
                if (checkRecordPermission <= 0) {
                    com.meituan.ai.speech.sdk.a.a.c(str, str2);
                    recogCallback.failed(str2, com.meituan.ai.speech.base.net.base.a.NO_RECORD_PERMISSION.N, com.meituan.ai.speech.base.net.base.a.NO_RECORD_PERMISSION.O + "-权限code=" + checkRecordPermission);
                    return;
                } else if (isListening()) {
                    com.meituan.ai.speech.sdk.a.a.a(str, str2, com.meituan.ai.speech.base.net.base.a.ERROR_REOPEN_LISTENING.N, "识别服务当前运行中，重复开启");
                    recogCallback.failed(str2, com.meituan.ai.speech.base.net.base.a.ERROR_REOPEN_LISTENING.N, "识别服务当前运行中，重复开启");
                    return;
                } else {
                    this.isListening = true;
                    this.isRecording = true;
                    this.mAudioAppKey = str;
                    this.mAudioSessionId = str2;
                    asrConfig.setRate(recordConfig.getFrequency());
                    try {
                        ExecutorService executorService = this.mThreadPool;
                        if (executorService == null) {
                            h.a();
                        }
                        ISpeechRecognizer iSpeechRecognizer = this.mSpeechRecognizer;
                        if (iSpeechRecognizer == null) {
                            h.a();
                        }
                        executorService.submit(new b(this, context, iSpeechRecognizer, str, str2, asrConfig, recordConfig, recogCallback));
                        return;
                    } catch (Exception e) {
                        this.isListening = false;
                        this.isRecording = false;
                        com.meituan.ai.speech.sdk.a.a.a(str, str2, com.meituan.ai.speech.base.net.base.a.ERROR_RECORD.N, "执行录音线程error--" + e.getMessage());
                        recogCallback.failed(str2, com.meituan.ai.speech.base.net.base.a.ERROR_RECORD.N, "执行录音线程error--" + e.getMessage());
                        return;
                    }
                }
            }
            recogCallback.failed("", com.meituan.ai.speech.base.net.base.a.PARAMS_ERROR.N, com.meituan.ai.speech.base.net.base.a.PARAMS_ERROR.O);
            return;
        }
        recogCallback.failed("", com.meituan.ai.speech.base.net.base.a.ERROR_NOT_INIT.N, com.meituan.ai.speech.base.net.base.a.ERROR_NOT_INIT.O);
    }

    @Keep
    public final synchronized void stopListening() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c16883d7b836da5347b36bb974a14a35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c16883d7b836da5347b36bb974a14a35");
            return;
        }
        com.meituan.ai.speech.sdk.a.a.b(this.mAudioAppKey, this.mAudioSessionId);
        stopRecord();
    }

    @Keep
    public final synchronized boolean isListening() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84def7a5c1ff99ecd2fb3aa4765884ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84def7a5c1ff99ecd2fb3aa4765884ba")).booleanValue();
        }
        return this.isListening || isRecording();
    }

    @Keep
    public final synchronized void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47aa15093dd919d3d250c57dea9e5e57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47aa15093dd919d3d250c57dea9e5e57");
            return;
        }
        ExecutorService executorService = this.mThreadPool;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.mThreadPool = null;
        this.mSpeechRecognizer = null;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/meituan/ai/speech/sdk/helper/AudioRecordHelper$RecordTask;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "speechRecognizer", "Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;", "appKey", "", "sessionId", "asrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "recordConfig", "Lcom/meituan/ai/speech/sdk/record/RecordConfig;", "recogCallback", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "(Lcom/meituan/ai/speech/sdk/helper/AudioRecordHelper;Landroid/content/Context;Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;Ljava/lang/String;Ljava/lang/String;Lcom/meituan/ai/speech/base/sdk/AsrConfig;Lcom/meituan/ai/speech/sdk/record/RecordConfig;Lcom/meituan/ai/speech/base/sdk/RecogCallback;)V", "run", "", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public final class b implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ AudioRecordHelper b;
        private final Context c;
        private final ISpeechRecognizer d;
        private final String e;
        private final String f;
        private final AsrConfig g;
        private final RecordConfig h;
        private final RecogCallback i;

        public b(AudioRecordHelper audioRecordHelper, @NotNull Context context, @NotNull ISpeechRecognizer iSpeechRecognizer, @NotNull String str, @NotNull String str2, @NotNull AsrConfig asrConfig, @NotNull RecordConfig recordConfig, @NotNull RecogCallback recogCallback) {
            h.b(context, "context");
            h.b(iSpeechRecognizer, "speechRecognizer");
            h.b(str, "appKey");
            h.b(str2, "sessionId");
            h.b(asrConfig, "asrConfig");
            h.b(recordConfig, "recordConfig");
            h.b(recogCallback, "recogCallback");
            this.b = audioRecordHelper;
            Object[] objArr = {audioRecordHelper, context, iSpeechRecognizer, str, str2, asrConfig, recordConfig, recogCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8059139588426387f866e6fb44a7c5a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8059139588426387f866e6fb44a7c5a");
                return;
            }
            this.c = context;
            this.d = iSpeechRecognizer;
            this.e = str;
            this.f = str2;
            this.g = asrConfig;
            this.h = recordConfig;
            this.i = recogCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0180 A[Catch: Exception -> 0x018b, TRY_LEAVE, TryCatch #2 {Exception -> 0x018b, blocks: (B:44:0x0178, B:46:0x0180), top: B:65:0x0178 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 557
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.ai.speech.sdk.helper.AudioRecordHelper.b.run():void");
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"com/meituan/ai/speech/sdk/helper/AudioRecordHelper$RecordTask$run$1", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "failed", "", "audioId", "", "code", "", "message", "onOvertimeClose", "onVoiceDBSize", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "", "start", "success", "result", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "tempResult", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
        /* loaded from: classes2.dex */
        public static final class a implements RecogCallback {
            public static ChangeQuickRedirect a;

            public a() {
                Object[] objArr = {b.this};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745f400e441db2f70f944589c345fbe8", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745f400e441db2f70f944589c345fbe8");
                }
            }

            @Override // com.meituan.ai.speech.base.sdk.RecogCallback
            public final void start(@NotNull String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef701e57a0fb6ac6be2f445d43700ddf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef701e57a0fb6ac6be2f445d43700ddf");
                    return;
                }
                h.b(str, "audioId");
                b.this.i.start(str);
            }

            @Override // com.meituan.ai.speech.base.sdk.RecogCallback
            public final void onOvertimeClose(@NotNull String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0741c21b8b2a4678a311a2d6abe9b1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0741c21b8b2a4678a311a2d6abe9b1");
                    return;
                }
                h.b(str, "audioId");
                if (b.this.g.getShouldAutoStopAfterOvertime()) {
                    com.meituan.ai.speech.sdk.a.a.d(b.this.e, b.this.f);
                    b.this.b.stopRecord();
                }
                b.this.i.onOvertimeClose(str);
            }

            @Override // com.meituan.ai.speech.base.sdk.RecogCallback
            public final void tempResult(@NotNull String str, @NotNull RecogResult recogResult) {
                Object[] objArr = {str, recogResult};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a3c7c9e48d3934a7ac23c0d42cc175", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a3c7c9e48d3934a7ac23c0d42cc175");
                    return;
                }
                h.b(str, "audioId");
                h.b(recogResult, "result");
                b.this.i.tempResult(str, recogResult);
            }

            @Override // com.meituan.ai.speech.base.sdk.RecogCallback
            public final void success(@NotNull String str, @NotNull RecogResult recogResult) {
                Object[] objArr = {str, recogResult};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28af871c25d250aa43a6d3fa22d67399", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28af871c25d250aa43a6d3fa22d67399");
                    return;
                }
                h.b(str, "audioId");
                h.b(recogResult, "result");
                b.this.i.success(str, recogResult);
            }

            @Override // com.meituan.ai.speech.base.sdk.RecogCallback
            public final void failed(@NotNull String str, int i, @NotNull String str2) {
                Object[] objArr = {str, Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ee85ba927fa089cf7e26840dcac550", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ee85ba927fa089cf7e26840dcac550");
                    return;
                }
                h.b(str, "audioId");
                h.b(str2, "message");
                com.meituan.ai.speech.sdk.a.a.a(b.this.e, b.this.f, i, str2);
                b.this.i.failed(str, i, str2);
            }

            @Override // com.meituan.ai.speech.base.sdk.RecogCallback
            public final void onVoiceDBSize(double d) {
                Object[] objArr = {Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a043db4aaf3fa05b894425fb441f05", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a043db4aaf3fa05b894425fb441f05");
                } else {
                    b.this.i.onVoiceDBSize(d);
                }
            }
        }
    }

    private final boolean isRecording() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdaafebafb567cbf61d2dbaedc22e2bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdaafebafb567cbf61d2dbaedc22e2bd")).booleanValue() : this.isRecording && PrivacySceneUtils.INSTANCE.checkIsRecording();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopRecord() {
        this.isRecording = false;
    }
}
