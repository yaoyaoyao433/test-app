package com.meituan.ai.speech.sdk.helper;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.ai.speech.base.environment.IAsrEnvironment;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.base.ICallback;
import com.meituan.ai.speech.base.net.data.RecogFragmentResult;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.base.sdk.ISpeechRecognizer;
import com.meituan.ai.speech.base.sdk.RecogFragmentCallback;
import com.meituan.ai.speech.base.utils.AppUtilsKt;
import com.meituan.ai.speech.base.utils.Base64Kt;
import com.meituan.ai.speech.sdk.record.AudioDataConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0014J0\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/meituan/ai/speech/sdk/helper/FileRecognizerHelper;", "", "()V", "MAX_RECOGNIZE_FILE_LENGTH", "", "speechRecognizer", "Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;", "stopFileRecognize", "", "threadPool", "Ljava/util/concurrent/ExecutorService;", "buildAsrParams", "", "uuid", "sessionId", "audioDataConfig", "Lcom/meituan/ai/speech/sdk/record/AudioDataConfig;", "asrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "destroy", "", "init", "context", "Landroid/content/Context;", "asrEnvironment", "Lcom/meituan/ai/speech/base/environment/IAsrEnvironment;", "interruptFileRecognize", "recognizeFragmentFile", "appKey", "callback", "Lcom/meituan/ai/speech/base/sdk/RecogFragmentCallback;", "NetCallback", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class FileRecognizerHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long MAX_RECOGNIZE_FILE_LENGTH;
    private ISpeechRecognizer speechRecognizer;
    private boolean stopFileRecognize;
    private ExecutorService threadPool;

    public FileRecognizerHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90a47c9fb1925a2e407ca678c4d3be66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90a47c9fb1925a2e407ca678c4d3be66");
        } else {
            this.MAX_RECOGNIZE_FILE_LENGTH = 104857600L;
        }
    }

    public final void init(@NotNull Context context, @NotNull IAsrEnvironment iAsrEnvironment) {
        Object[] objArr = {context, iAsrEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81877c4748d9960229903fb6168a46cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81877c4748d9960229903fb6168a46cb");
            return;
        }
        h.b(context, "context");
        h.b(iAsrEnvironment, "asrEnvironment");
        this.speechRecognizer = new BuildRecognizerHelper().buildSpeechRecognizer(context, iAsrEnvironment);
        this.threadPool = c.a("SpeechAsr-fragmentRecognizer");
    }

    public final void recognizeFragmentFile(@NotNull Context context, @NotNull String str, @NotNull AudioDataConfig audioDataConfig, @NotNull AsrConfig asrConfig, @Nullable RecogFragmentCallback recogFragmentCallback) {
        Object[] objArr = {context, str, audioDataConfig, asrConfig, recogFragmentCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d757cd53cbbc3717c4e192776f4a4606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d757cd53cbbc3717c4e192776f4a4606");
            return;
        }
        h.b(context, "context");
        h.b(str, "appKey");
        h.b(audioDataConfig, "audioDataConfig");
        h.b(asrConfig, "asrConfig");
        if (this.speechRecognizer == null || this.threadPool == null) {
            if (recogFragmentCallback != null) {
                recogFragmentCallback.recogFailed("", com.meituan.ai.speech.base.net.base.a.ERROR_NOT_INIT.N, com.meituan.ai.speech.base.net.base.a.ERROR_NOT_INIT.O);
            }
        } else if (TextUtils.isEmpty(str) || !audioDataConfig.isInit()) {
            if (recogFragmentCallback != null) {
                recogFragmentCallback.recogFailed("", com.meituan.ai.speech.base.net.base.a.PARAMS_ERROR.N, com.meituan.ai.speech.base.net.base.a.PARAMS_ERROR.O);
            }
        } else {
            if (audioDataConfig.getAudioData().length == 0) {
                if (recogFragmentCallback != null) {
                    recogFragmentCallback.recogFailed("", com.meituan.ai.speech.base.net.base.a.PARAMS_ERROR.N, "数据为空");
                }
            } else if (audioDataConfig.getAudioData().length > this.MAX_RECOGNIZE_FILE_LENGTH) {
                if (recogFragmentCallback != null) {
                    recogFragmentCallback.recogFailed("", com.meituan.ai.speech.base.net.base.a.SERVER_ERROR_AUDIO_TIME_TOO_LONG.N, "只支持100MB以内音频");
                }
            } else {
                StringBuilder sb = new StringBuilder("[Recog Fragment]recognizeFragmentFile, audioFormat=");
                sb.append(audioDataConfig.getAudioFormat());
                sb.append(", audioChannel=");
                sb.append(audioDataConfig.getAudioChannel());
                sb.append(", audioSampleRate=");
                sb.append(audioDataConfig.getAudioSampleRate());
                sb.append(", dataSize=");
                sb.append(audioDataConfig.getAudioData().length);
                String simpleName = getClass().getSimpleName();
                h.a((Object) simpleName, "this::class.java.simpleName");
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                    StringBuilder sb2 = new StringBuilder("[");
                    sb2.append(simpleName);
                    sb2.append(']');
                }
                String uuid = AppUtilsKt.getUuid(context);
                String str2 = "android_asr_fragment_" + uuid + '_' + System.currentTimeMillis();
                com.meituan.ai.speech.sdk.a.a.a(str, str2, "fragment");
                if (recogFragmentCallback != null) {
                    recogFragmentCallback.start(str2);
                }
                this.stopFileRecognize = false;
                ExecutorService executorService = this.threadPool;
                if (executorService != null) {
                    executorService.execute(new b(str2, context, uuid, audioDataConfig, asrConfig, str, recogFragmentCallback));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;
        public final /* synthetic */ AudioDataConfig f;
        public final /* synthetic */ AsrConfig g;
        public final /* synthetic */ String h;
        public final /* synthetic */ RecogFragmentCallback i;

        public b(String str, Context context, String str2, AudioDataConfig audioDataConfig, AsrConfig asrConfig, String str3, RecogFragmentCallback recogFragmentCallback) {
            this.c = str;
            this.d = context;
            this.e = str2;
            this.f = audioDataConfig;
            this.g = asrConfig;
            this.h = str3;
            this.i = recogFragmentCallback;
            Object[] objArr = {FileRecognizerHelper.this, str, context, str2, audioDataConfig, asrConfig, str3, recogFragmentCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deedee4a2346a78c3d1baba962396af8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deedee4a2346a78c3d1baba962396af8");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e94ed44f5f1a4f6b778e2b9d0925ca43", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e94ed44f5f1a4f6b778e2b9d0925ca43");
            } else if (FileRecognizerHelper.this.stopFileRecognize) {
            } else {
                FileRecognizerHelper fileRecognizerHelper = FileRecognizerHelper.this;
                new StringBuilder("[Recog Fragment]Process Start!---sessionId=").append(this.c);
                String simpleName = fileRecognizerHelper.getClass().getSimpleName();
                h.a((Object) simpleName, "this::class.java.simpleName");
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(simpleName);
                    sb.append(']');
                }
                com.meituan.ai.speech.sdk.net.a.b bVar = new com.meituan.ai.speech.sdk.net.a.b(this.d);
                String buildAsrParams = FileRecognizerHelper.this.buildAsrParams(this.e, this.c, this.f, this.g);
                FileRecognizerHelper fileRecognizerHelper2 = FileRecognizerHelper.this;
                new StringBuilder("[Recog Fragment]Process ---asrParamsString=").append(buildAsrParams);
                String simpleName2 = fileRecognizerHelper2.getClass().getSimpleName();
                h.a((Object) simpleName2, "this::class.java.simpleName");
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                    StringBuilder sb2 = new StringBuilder("[");
                    sb2.append(simpleName2);
                    sb2.append(']');
                }
                String encodeBase64ToString = Base64Kt.encodeBase64ToString(buildAsrParams);
                String str = this.c;
                byte[] audioData = this.f.getAudioData();
                Object[] objArr2 = {str, encodeBase64ToString, audioData};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.ai.speech.sdk.net.a.b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "92a45012a50b2a654d33b60a1ad9a4ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "92a45012a50b2a654d33b60a1ad9a4ef");
                } else {
                    h.b(str, "sessionId");
                    h.b(encodeBase64ToString, "params");
                    bVar.c = str;
                    bVar.b = encodeBase64ToString;
                    bVar.d = audioData;
                }
                bVar.request(this.h, new a(FileRecognizerHelper.this, this.h, this.c, this.i));
                String simpleName3 = FileRecognizerHelper.this.getClass().getSimpleName();
                h.a((Object) simpleName3, "this::class.java.simpleName");
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                    StringBuilder sb3 = new StringBuilder("[");
                    sb3.append(simpleName3);
                    sb3.append(']');
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildAsrParams(String str, String str2, AudioDataConfig audioDataConfig, AsrConfig asrConfig) {
        Object[] objArr = {str, str2, audioDataConfig, asrConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01b771713285d70ed7b5509fc6f615ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01b771713285d70ed7b5509fc6f615ce");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n            {\n                \"mt_uuid\": \"" + str + "\",\n                \"format\": \"" + audioDataConfig.getAudioFormat() + "\",\n                \"channel\": \"" + audioDataConfig.getAudioChannel() + "\",\n                \"rate\": \"" + audioDataConfig.getAudioSampleRate() + "\",\n                \"session_id\": \"" + str2 + "\",\n                \"data_type\": \"binary\"\n            ");
        stringBuffer.append(CommonConstant.Symbol.COMMA);
        StringBuilder sb = new StringBuilder("\"n\": ");
        sb.append(asrConfig.getResultCount());
        sb.append(',');
        stringBuffer.append(sb.toString());
        StringBuilder sb2 = new StringBuilder("\"asr_model\": ");
        sb2.append(asrConfig.getAsrModel());
        sb2.append(',');
        stringBuffer.append(sb2.toString());
        stringBuffer.append("\"adapt_lm_id\": " + asrConfig.getAsrSubModelId() + ',');
        stringBuffer.append("\"asr_sound_model\": " + asrConfig.getAsrSoundModel() + ',');
        stringBuffer.append("\"is_ignore_tmp_result\": " + asrConfig.isIgnoreTempResult() + ',');
        stringBuffer.append("\"is_need_punctuation\": " + asrConfig.isNeedPunctuation() + ',');
        stringBuffer.append("\"is_normalize_text\": " + asrConfig.isNormalizeText() + ',');
        stringBuffer.append("\"language_type\": " + asrConfig.getLanguageType() + ',');
        stringBuffer.append("\"language\": " + asrConfig.getLanguage() + ',');
        StringBuilder sb3 = new StringBuilder("\"scene\": ");
        sb3.append(asrConfig.getScene());
        stringBuffer.append(sb3.toString());
        String bizData = asrConfig.getBizData();
        if (bizData != null) {
            stringBuffer.append(",\"biz_data\": \"" + bizData + '\"');
        }
        stringBuffer.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        String stringBuffer2 = stringBuffer.toString();
        h.a((Object) stringBuffer2, "asrParamsBuffer.toString()");
        return stringBuffer2;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/meituan/ai/speech/sdk/helper/FileRecognizerHelper$NetCallback;", "Lcom/meituan/ai/speech/base/net/base/ICallback;", "Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult;", "appKey", "", "sessionId", "callback", "Lcom/meituan/ai/speech/base/sdk/RecogFragmentCallback;", "(Lcom/meituan/ai/speech/sdk/helper/FileRecognizerHelper;Ljava/lang/String;Ljava/lang/String;Lcom/meituan/ai/speech/base/sdk/RecogFragmentCallback;)V", "onFailed", "", "code", "", "msg", "onSuccess", "result", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    final class a implements ICallback<RecogFragmentResult> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ FileRecognizerHelper b;
        private String c;
        private String d;
        private RecogFragmentCallback e;

        public a(FileRecognizerHelper fileRecognizerHelper, @NotNull String str, @NotNull String str2, @Nullable RecogFragmentCallback recogFragmentCallback) {
            h.b(str, "appKey");
            h.b(str2, "sessionId");
            this.b = fileRecognizerHelper;
            Object[] objArr = {fileRecognizerHelper, str, str2, recogFragmentCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024185fb35944c5c149c744cdbc0255a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024185fb35944c5c149c744cdbc0255a");
                return;
            }
            this.c = str;
            this.d = str2;
            this.e = recogFragmentCallback;
        }

        @Override // com.meituan.ai.speech.base.net.base.ICallback
        public final /* synthetic */ void onSuccess(String str, RecogFragmentResult recogFragmentResult) {
            RecogFragmentResult recogFragmentResult2 = recogFragmentResult;
            Object[] objArr = {str, recogFragmentResult2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb38faed0305b2c35dde5fc3469302e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb38faed0305b2c35dde5fc3469302e");
                return;
            }
            h.b(str, "appKey");
            h.b(recogFragmentResult2, "result");
            StringBuilder sb = new StringBuilder("[Recog Fragment]onSuccess sessionId=");
            sb.append(this.d);
            sb.append(", speech_time=");
            sb.append(recogFragmentResult2.getSpeech_time());
            String simpleName = getClass().getSimpleName();
            h.a((Object) simpleName, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(simpleName);
                sb2.append(']');
            }
            if (this.b.stopFileRecognize) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            RecogFragmentResult.SentenceInfo[] result = recogFragmentResult2.getResult();
            if (result != null) {
                for (RecogFragmentResult.SentenceInfo sentenceInfo : result) {
                    StringBuilder sb3 = new StringBuilder("[Recog Fragment]onSuccess channel=");
                    sb3.append(sentenceInfo.getChannel());
                    sb3.append(",start_time=");
                    sb3.append(sentenceInfo.getStart_time());
                    sb3.append(",end_time=");
                    sb3.append(sentenceInfo.getEnd_time());
                    String simpleName2 = getClass().getSimpleName();
                    h.a((Object) simpleName2, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb4 = new StringBuilder("[");
                        sb4.append(simpleName2);
                        sb4.append(']');
                    }
                    if (sentenceInfo.getSentences() != null) {
                        RecogFragmentResult.WordInfo[] sentences = sentenceInfo.getSentences();
                        if (sentences == null) {
                            h.a();
                        }
                        if (sentences.length > 0) {
                            RecogFragmentResult.WordInfo wordInfo = sentences[0];
                            StringBuilder sb5 = new StringBuilder("[Recog Fragment]onSuccess content=");
                            sb5.append(wordInfo.getContent());
                            sb5.append(",confidence=");
                            sb5.append(wordInfo.getConfidence());
                            String simpleName3 = getClass().getSimpleName();
                            h.a((Object) simpleName3, "this::class.java.simpleName");
                            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                                StringBuilder sb6 = new StringBuilder("[");
                                sb6.append(simpleName3);
                                sb6.append(']');
                            }
                            stringBuffer.append(wordInfo.getContent());
                        }
                    }
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            h.a((Object) stringBuffer2, "resultTextBuffer.toString()");
            new StringBuilder("[Recog Fragment]onSuccess------resultText=").append(stringBuffer2);
            String simpleName4 = getClass().getSimpleName();
            h.a((Object) simpleName4, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb7 = new StringBuilder("[");
                sb7.append(simpleName4);
                sb7.append(']');
            }
            com.meituan.ai.speech.sdk.a.a.a(str, this.d, -1, 0, 0, recogFragmentResult2.getSpeech_time(), stringBuffer2);
            RecogFragmentCallback recogFragmentCallback = this.e;
            if (recogFragmentCallback != null) {
                recogFragmentCallback.recogSuccess(this.d, stringBuffer2, recogFragmentResult2);
            }
        }

        @Override // com.meituan.ai.speech.base.net.base.ICallback
        public final void onFailed(int i, @Nullable String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c141778c6a1563a235d05a8e138d3a87", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c141778c6a1563a235d05a8e138d3a87");
                return;
            }
            StringBuilder sb = new StringBuilder("[Recog Fragment]onFailed code=");
            sb.append(i);
            sb.append(", msg=");
            sb.append(str);
            String simpleName = getClass().getSimpleName();
            h.a((Object) simpleName, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(simpleName);
                sb2.append(']');
            }
            if (this.b.stopFileRecognize) {
                return;
            }
            com.meituan.ai.speech.sdk.a.a.a(this.c, this.d, i, str == null ? "" : str);
            RecogFragmentCallback recogFragmentCallback = this.e;
            if (recogFragmentCallback != null) {
                String str2 = this.d;
                if (str == null) {
                    str = "";
                }
                recogFragmentCallback.recogFailed(str2, i, str);
            }
        }
    }

    public final void interruptFileRecognize() {
        this.stopFileRecognize = true;
    }

    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "172940ea6c5bb838026b9344b2c3caaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "172940ea6c5bb838026b9344b2c3caaf");
            return;
        }
        ExecutorService executorService = this.threadPool;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.threadPool = null;
        this.speechRecognizer = null;
    }
}
