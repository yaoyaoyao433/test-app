package com.meituan.ai.speech.sdk;

import android.content.Context;
import android.content.Intent;
import android.media.AudioRecord;
import android.support.annotation.Keep;
import android.support.annotation.RequiresPermission;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.js.JsBridgeResult;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.privacy.PrivacySceneUtils;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.base.sdk.RecogCallback;
import com.meituan.ai.speech.base.utils.Base64Kt;
import com.meituan.ai.speech.sdk.record.RecordConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Deprecated(message = "this class is deprecated!", replaceWith = @ReplaceWith(expression = "com.meituan.ai.speech.sdk.helper.AudioRecordHelper", imports = {}))
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\n\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\rH\u0007J8\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020\u0018H\u0007J\b\u0010&\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/meituan/ai/speech/sdk/AudioRecordHelper;", "", "()V", "appKey", "", "audioSessionId", "isHasAudioPermission", "", "isRecording", "mAudioRecogCallback", "com/meituan/ai/speech/sdk/AudioRecordHelper$mAudioRecogCallback$1", "Lcom/meituan/ai/speech/sdk/AudioRecordHelper$mAudioRecogCallback$1;", "readSize", "", "recBufSize", "receiveAudioData", "getReceiveAudioData", "()Z", "setReceiveAudioData", "(Z)V", "threadPool", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "destroy", "", "setAudioSource", "audioSource", "start", "context", "Landroid/content/Context;", "audioName", "asrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "recordConfig", "Lcom/meituan/ai/speech/sdk/record/RecordConfig;", "recogCallback", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "stop", "stopRecord", "RecordTask", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class AudioRecordHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appKey;
    private String audioSessionId;
    private boolean isHasAudioPermission;
    private boolean isRecording;
    private final b mAudioRecogCallback;
    private int readSize;
    private int recBufSize;
    private boolean receiveAudioData;
    private final ExecutorService threadPool;

    @Deprecated(message = "this function is deprecated!", replaceWith = @ReplaceWith(expression = "com.meituan.ai.speech.sdk.record.RecordConfig", imports = {}))
    @Keep
    public final void setAudioSource(int i) {
    }

    public AudioRecordHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "326458351c7766ebcfd6912099f1708b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "326458351c7766ebcfd6912099f1708b");
            return;
        }
        this.appKey = "";
        this.audioSessionId = "";
        this.threadPool = c.a("SpeechAsr-audioRecordHelper");
        this.mAudioRecogCallback = new b();
    }

    public final boolean getReceiveAudioData() {
        return this.receiveAudioData;
    }

    public final void setReceiveAudioData(boolean z) {
        this.receiveAudioData = z;
    }

    @Deprecated(message = "this function is deprecated!", replaceWith = @ReplaceWith(expression = "com.meituan.ai.speech.sdk.helper.AudioRecordHelper.startListening", imports = {}))
    @Keep
    @RequiresPermission(allOf = {"android.permission.RECORD_AUDIO"})
    public final void start(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull AsrConfig asrConfig, @NotNull RecordConfig recordConfig, @NotNull RecogCallback recogCallback) {
        Object[] objArr = {context, str, str2, asrConfig, recordConfig, recogCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "901003106d3d0168b8e2468d3b8cf4fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "901003106d3d0168b8e2468d3b8cf4fe");
            return;
        }
        h.b(context, "context");
        h.b(str, "appKey");
        h.b(str2, "audioName");
        h.b(asrConfig, "asrConfig");
        h.b(recordConfig, "recordConfig");
        h.b(recogCallback, "recogCallback");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(recordConfig.getPrivacySceneToken())) {
            recogCallback.failed("", com.meituan.ai.speech.base.net.base.a.PARAMS_ERROR.N, com.meituan.ai.speech.base.net.base.a.PARAMS_ERROR.O);
            return;
        }
        String encodeUrlHeader = Base64Kt.encodeUrlHeader(str2 + "__" + System.currentTimeMillis());
        com.meituan.ai.speech.sdk.a.a.a(str, encodeUrlHeader, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME);
        try {
            int checkRecordPermission = PrivacySceneUtils.INSTANCE.checkRecordPermission(context, recordConfig.getPrivacySceneToken());
            if (checkRecordPermission <= 0) {
                this.isHasAudioPermission = false;
                int i = com.meituan.ai.speech.base.net.base.a.NO_RECORD_PERMISSION.N;
                recogCallback.failed(encodeUrlHeader, i, com.meituan.ai.speech.base.net.base.a.NO_RECORD_PERMISSION.O + "-权限code=" + checkRecordPermission);
                com.meituan.ai.speech.sdk.a.a.c(str, encodeUrlHeader);
                return;
            }
            this.isHasAudioPermission = true;
            this.isRecording = true;
            this.appKey = str;
            this.audioSessionId = encodeUrlHeader;
            b bVar = this.mAudioRecogCallback;
            Object[] objArr2 = {recogCallback};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "2de9d4d37099480f9069a772631f205b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "2de9d4d37099480f9069a772631f205b");
            } else {
                h.b(recogCallback, "callback");
                bVar.b = recogCallback;
            }
            this.mAudioRecogCallback.c = asrConfig.getShouldAutoStopAfterOvertime();
            this.recBufSize = AudioRecord.getMinBufferSize(recordConfig.getFrequency(), recordConfig.getAudioChannel(), recordConfig.getAudioEncode());
            PrivacySceneUtils.INSTANCE.createMtAudioRecord(recordConfig.getPrivacySceneToken(), recordConfig.getAudioSource(), recordConfig.getFrequency(), recordConfig.getAudioChannel(), recordConfig.getAudioEncode(), this.recBufSize);
            if (!PrivacySceneUtils.INSTANCE.checkInitMtAudioRecord()) {
                this.mAudioRecogCallback.failed(this.audioSessionId, ConnectionResult.NETWORK_ERROR, "AudioRecord初始化失败");
                return;
            }
            ExecutorService executorService = this.threadPool;
            h.a((Object) executorService, "threadPool");
            if (executorService.isShutdown()) {
                return;
            }
            ExecutorService executorService2 = this.threadPool;
            Context applicationContext = context.getApplicationContext();
            h.a((Object) applicationContext, "context.applicationContext");
            executorService2.submit(new a(this, applicationContext, str, asrConfig, this.recBufSize));
        } catch (Exception e) {
            b bVar2 = this.mAudioRecogCallback;
            bVar2.failed(encodeUrlHeader, ConnectionResult.NETWORK_ERROR, "开启录音--" + e.getMessage());
        }
    }

    @Deprecated(message = "this function is deprecated!", replaceWith = @ReplaceWith(expression = "com.meituan.ai.speech.sdk.helper.AudioRecordHelper.stopListening", imports = {}))
    @Keep
    public final void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3122d99a903e9bbcb9e1cd28d162b323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3122d99a903e9bbcb9e1cd28d162b323");
            return;
        }
        com.meituan.ai.speech.sdk.a.a.b(this.appKey, this.audioSessionId);
        stopRecord();
    }

    @Keep
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "427aefc16a885b1398dcccd89596786e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "427aefc16a885b1398dcccd89596786e");
        } else {
            this.threadPool.shutdown();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/meituan/ai/speech/sdk/AudioRecordHelper$RecordTask;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "appKey", "", "asrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "recBufSize", "", "(Lcom/meituan/ai/speech/sdk/AudioRecordHelper;Landroid/content/Context;Ljava/lang/String;Lcom/meituan/ai/speech/base/sdk/AsrConfig;I)V", "run", "", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public final class a implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ AudioRecordHelper b;
        private final Context c;
        private final String d;
        private final AsrConfig e;
        private final int f;

        public a(AudioRecordHelper audioRecordHelper, @NotNull Context context, @NotNull String str, @NotNull AsrConfig asrConfig, int i) {
            h.b(context, "context");
            h.b(str, "appKey");
            h.b(asrConfig, "asrConfig");
            this.b = audioRecordHelper;
            Object[] objArr = {audioRecordHelper, context, str, asrConfig, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352557f6aafe72cc01f53b2ac483ea9e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352557f6aafe72cc01f53b2ac483ea9e");
                return;
            }
            this.c = context;
            this.d = str;
            this.e = asrConfig;
            this.f = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c59e49bb6c6daa05fb5413464d644e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c59e49bb6c6daa05fb5413464d644e8");
            } else if (!PrivacySceneUtils.INSTANCE.checkInitMtAudioRecord()) {
                this.b.mAudioRecogCallback.failed(this.b.audioSessionId, ConnectionResult.NETWORK_ERROR, "AudioRecord没有初始化");
            } else {
                try {
                    short[] sArr = new short[this.f];
                    PrivacySceneUtils.INSTANCE.startMtAudioRecord();
                    this.e.setRate(16000.0f);
                    SpeechRecognizer.Companion.getInstance().start(this.c, this.d, this.b.audioSessionId, this.e, this.b.mAudioRecogCallback);
                    while (this.b.isRecording) {
                        this.b.readSize = PrivacySceneUtils.INSTANCE.readMtAudioRecord(sArr, 0, this.f);
                        if (-3 != this.b.readSize) {
                            short[] sArr2 = new short[this.b.readSize];
                            int i = this.b.readSize;
                            for (int i2 = 0; i2 < i; i2++) {
                                sArr2[i2] = sArr[i2];
                            }
                            SpeechRecognizer.Companion.getInstance().recognize(this.c, kotlin.collections.b.a(sArr2));
                            if (this.b.getReceiveAudioData()) {
                                Intent intent = new Intent();
                                intent.setAction("action.receive.audio.data");
                                intent.putExtra("audio_data", sArr);
                                intent.putExtra("read_size", this.b.readSize);
                                LocalBroadcastManager.getInstance(this.c).sendBroadcast(intent);
                            }
                        }
                    }
                    SpeechRecognizer.Companion.getInstance().end(this.c);
                    Intent intent2 = new Intent();
                    if (this.b.getReceiveAudioData()) {
                        intent2.setAction("action.receive.audio.data");
                        intent2.putExtra("is_last", true);
                        LocalBroadcastManager.getInstance(this.c).sendBroadcast(intent2);
                    }
                } catch (Throwable th) {
                    b bVar = this.b.mAudioRecogCallback;
                    String str = this.b.audioSessionId;
                    bVar.failed(str, ConnectionResult.NETWORK_ERROR, "录音失败--" + th.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopRecord() {
        StackTraceElement[] stackTrace;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5481b099c8b245d8c619e9ef4b417cfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5481b099c8b245d8c619e9ef4b417cfa");
            return;
        }
        try {
            if (this.isHasAudioPermission) {
                this.isRecording = false;
                if (PrivacySceneUtils.INSTANCE.checkInitMtAudioRecord()) {
                    PrivacySceneUtils.INSTANCE.stopMtAudioRecord();
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("[AudioRecordHelper]Stop Exception:\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e.toString() + "\n");
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                sb2.append(stackTraceElement.toString() + "\n");
            }
            String sb3 = sb2.toString();
            h.a((Object) sb3, "sb.toString()");
            sb.append(sb3);
            String sb4 = sb.toString();
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', sb4);
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0001J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"com/meituan/ai/speech/sdk/AudioRecordHelper$mAudioRecogCallback$1", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "recogCallback", "shouldAutoStopAfterOvertime", "", "failed", "", "audioId", "", "code", "", "message", "onOvertimeClose", "onVoiceDBSize", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "", "setRecogCallback", "callback", "setShouldAutoStopAfterOvertime", "should", "start", "success", "result", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "tempResult", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class b implements RecogCallback {
        public static ChangeQuickRedirect a;
        RecogCallback b;
        boolean c;

        public b() {
            Object[] objArr = {AudioRecordHelper.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ae7236feb4c9f52f0a2a7b1f50a660", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ae7236feb4c9f52f0a2a7b1f50a660");
            } else {
                this.c = true;
            }
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void start(@NotNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "275c878b7d8d7169803548e2b5bc9b95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "275c878b7d8d7169803548e2b5bc9b95");
                return;
            }
            h.b(str, "audioId");
            RecogCallback recogCallback = this.b;
            if (recogCallback != null) {
                recogCallback.start(str);
            }
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void onOvertimeClose(@NotNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c763f15d30cdfd64c61fde2dbf8d865", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c763f15d30cdfd64c61fde2dbf8d865");
                return;
            }
            h.b(str, "audioId");
            RecogCallback recogCallback = this.b;
            if (recogCallback != null) {
                recogCallback.onOvertimeClose(str);
            }
            if (this.c) {
                com.meituan.ai.speech.sdk.a.a.d(AudioRecordHelper.this.appKey, AudioRecordHelper.this.audioSessionId);
                AudioRecordHelper.this.stopRecord();
            }
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void tempResult(@NotNull String str, @NotNull RecogResult recogResult) {
            Object[] objArr = {str, recogResult};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6176459d6dde49aa001c85159567a46a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6176459d6dde49aa001c85159567a46a");
                return;
            }
            h.b(str, "audioId");
            h.b(recogResult, "result");
            RecogCallback recogCallback = this.b;
            if (recogCallback != null) {
                recogCallback.tempResult(str, recogResult);
            }
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void success(@NotNull String str, @NotNull RecogResult recogResult) {
            Object[] objArr = {str, recogResult};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d04143721b6ed45b585600dfde93ee9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d04143721b6ed45b585600dfde93ee9d");
                return;
            }
            h.b(str, "audioId");
            h.b(recogResult, "result");
            RecogCallback recogCallback = this.b;
            if (recogCallback != null) {
                recogCallback.success(str, recogResult);
            }
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void failed(@NotNull String str, int i, @NotNull String str2) {
            Object[] objArr = {str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b039e36056fb65ad90cede6ee1a430", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b039e36056fb65ad90cede6ee1a430");
                return;
            }
            h.b(str, "audioId");
            h.b(str2, "message");
            com.meituan.ai.speech.sdk.a.a.a(AudioRecordHelper.this.appKey, str, i, str2);
            RecogCallback recogCallback = this.b;
            if (recogCallback != null) {
                recogCallback.failed(str, i, str2);
            }
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void onVoiceDBSize(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0df095d8ecdb6ac305babc0709c91b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0df095d8ecdb6ac305babc0709c91b");
                return;
            }
            RecogCallback recogCallback = this.b;
            if (recogCallback != null) {
                recogCallback.onVoiceDBSize(d);
            }
        }
    }
}
